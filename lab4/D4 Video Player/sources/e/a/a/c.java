package e.a.a;

import android.graphics.Bitmap;
import pl.droidsonroids.gif.GifInfoHandle;

/* loaded from: classes.dex */
public class c extends p {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4296c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d f4297d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, d dVar2, int i) {
        super(dVar2);
        this.f4297d = dVar;
        this.f4296c = i;
    }

    @Override // e.a.a.p
    public void a() {
        d dVar = this.f4297d;
        GifInfoHandle gifInfoHandle = dVar.h;
        int i = this.f4296c;
        Bitmap bitmap = dVar.g;
        synchronized (gifInfoHandle) {
            GifInfoHandle.seekToTime(gifInfoHandle.f4370a, i, bitmap);
        }
        this.f4318b.n.sendEmptyMessageAtTime(-1, 0L);
    }
}
