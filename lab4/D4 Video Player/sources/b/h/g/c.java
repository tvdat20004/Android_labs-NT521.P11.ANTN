package b.h.g;

import android.os.Handler;

/* loaded from: classes.dex */
public class c implements n<h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b.h.c.a.i f1191a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Handler f1192b;

    public c(b.h.c.a.i iVar, Handler handler) {
        this.f1191a = iVar;
        this.f1192b = handler;
    }

    @Override // b.h.g.n
    public void a(h hVar) {
        int i;
        b.h.c.a.i iVar;
        h hVar2 = hVar;
        if (hVar2 == null) {
            iVar = this.f1191a;
            i = 1;
        } else {
            i = hVar2.f1202b;
            if (i == 0) {
                this.f1191a.b(hVar2.f1201a, this.f1192b);
                return;
            }
            iVar = this.f1191a;
        }
        iVar.a(i, this.f1192b);
    }
}
