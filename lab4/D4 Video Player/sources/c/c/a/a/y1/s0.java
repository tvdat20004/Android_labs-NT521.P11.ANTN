package c.c.a.a.y1;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class s0<T> implements l0 {

    /* renamed from: a, reason: collision with root package name */
    public final q f3663a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3664b;

    /* renamed from: c, reason: collision with root package name */
    public final v0 f3665c;

    /* renamed from: d, reason: collision with root package name */
    public final a<? extends T> f3666d;

    /* renamed from: e, reason: collision with root package name */
    public volatile T f3667e;

    public interface a<T> {
        T a(Uri uri, InputStream inputStream);
    }

    public s0(n nVar, Uri uri, int i, a<? extends T> aVar) {
        q qVar = new q(uri, 0L, -1L, null, 1);
        this.f3665c = new v0(nVar);
        this.f3663a = qVar;
        this.f3664b = i;
        this.f3666d = aVar;
    }

    @Override // c.c.a.a.y1.l0
    public final void a() {
        this.f3665c.f3690b = 0L;
        p pVar = new p(this.f3665c, this.f3663a);
        try {
            if (!pVar.f3644e) {
                pVar.f3641b.a(pVar.f3642c);
                pVar.f3644e = true;
            }
            Uri c2 = this.f3665c.c();
            Objects.requireNonNull(c2);
            this.f3667e = this.f3666d.a(c2, pVar);
            try {
                pVar.close();
            } catch (IOException unused) {
            }
        } finally {
            int i = c.c.a.a.z1.l0.f3761a;
            try {
                pVar.close();
            } catch (IOException unused2) {
            }
        }
    }

    @Override // c.c.a.a.y1.l0
    public final void b() {
    }
}
