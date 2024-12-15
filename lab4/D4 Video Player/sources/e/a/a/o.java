package e.a.a;

import android.graphics.Bitmap;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;
import pl.droidsonroids.gif.GifInfoHandle;

/* loaded from: classes.dex */
public class o extends p {
    public o(d dVar) {
        super(dVar);
    }

    @Override // e.a.a.p
    public void a() {
        long renderFrame;
        int currentFrameIndex;
        int currentLoop;
        int loopCount;
        d dVar = this.f4318b;
        GifInfoHandle gifInfoHandle = dVar.h;
        Bitmap bitmap = dVar.g;
        synchronized (gifInfoHandle) {
            renderFrame = GifInfoHandle.renderFrame(gifInfoHandle.f4370a, bitmap);
        }
        if (renderFrame >= 0) {
            this.f4318b.f4300d = SystemClock.uptimeMillis() + renderFrame;
            if (this.f4318b.isVisible() && this.f4318b.f4299c) {
                d dVar2 = this.f4318b;
                if (!dVar2.m) {
                    dVar2.f4298b.remove(this);
                    d dVar3 = this.f4318b;
                    dVar3.q = dVar3.f4298b.schedule(this, renderFrame, TimeUnit.MILLISECONDS);
                }
            }
            if (!this.f4318b.i.isEmpty()) {
                GifInfoHandle gifInfoHandle2 = this.f4318b.h;
                synchronized (gifInfoHandle2) {
                    currentFrameIndex = GifInfoHandle.getCurrentFrameIndex(gifInfoHandle2.f4370a);
                }
                if (currentFrameIndex == this.f4318b.h.b() - 1) {
                    d dVar4 = this.f4318b;
                    m mVar = dVar4.n;
                    GifInfoHandle gifInfoHandle3 = dVar4.h;
                    synchronized (gifInfoHandle3) {
                        currentLoop = GifInfoHandle.getCurrentLoop(gifInfoHandle3.f4370a);
                    }
                    if (currentLoop != 0) {
                        GifInfoHandle gifInfoHandle4 = dVar4.h;
                        synchronized (gifInfoHandle4) {
                            loopCount = GifInfoHandle.getLoopCount(gifInfoHandle4.f4370a);
                        }
                        if (currentLoop >= loopCount) {
                            currentLoop--;
                        }
                    }
                    mVar.sendEmptyMessageAtTime(currentLoop, this.f4318b.f4300d);
                }
            }
        } else {
            d dVar5 = this.f4318b;
            dVar5.f4300d = Long.MIN_VALUE;
            dVar5.f4299c = false;
        }
        if (!this.f4318b.isVisible() || this.f4318b.n.hasMessages(-1)) {
            return;
        }
        this.f4318b.n.sendEmptyMessageAtTime(-1, 0L);
    }
}
