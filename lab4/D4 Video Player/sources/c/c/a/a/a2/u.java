package c.c.a.a.a2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public final class u implements Choreographer.FrameCallback, Handler.Callback {
    public static final u g = new u();

    /* renamed from: b, reason: collision with root package name */
    public volatile long f1961b = -9223372036854775807L;

    /* renamed from: c, reason: collision with root package name */
    public final Handler f1962c;

    /* renamed from: d, reason: collision with root package name */
    public final HandlerThread f1963d;

    /* renamed from: e, reason: collision with root package name */
    public Choreographer f1964e;

    /* renamed from: f, reason: collision with root package name */
    public int f1965f;

    public u() {
        HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
        this.f1963d = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        int i = l0.f3761a;
        Handler handler = new Handler(looper, this);
        this.f1962c = handler;
        handler.sendEmptyMessage(0);
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        this.f1961b = j;
        this.f1964e.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            this.f1964e = Choreographer.getInstance();
            return true;
        }
        if (i == 1) {
            int i2 = this.f1965f + 1;
            this.f1965f = i2;
            if (i2 == 1) {
                this.f1964e.postFrameCallback(this);
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        int i3 = this.f1965f - 1;
        this.f1965f = i3;
        if (i3 == 0) {
            this.f1964e.removeFrameCallback(this);
            this.f1961b = -9223372036854775807L;
        }
        return true;
    }
}
