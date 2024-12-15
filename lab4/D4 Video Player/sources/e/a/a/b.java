package e.a.a;

import pl.droidsonroids.gif.GifInfoHandle;

/* loaded from: classes.dex */
public class b extends p {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f4295c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(d dVar, d dVar2) {
        super(dVar2);
        this.f4295c = dVar;
    }

    @Override // e.a.a.p
    public void a() {
        boolean reset;
        GifInfoHandle gifInfoHandle = this.f4295c.h;
        synchronized (gifInfoHandle) {
            reset = GifInfoHandle.reset(gifInfoHandle.f4370a);
        }
        if (reset) {
            this.f4295c.start();
        }
    }
}
