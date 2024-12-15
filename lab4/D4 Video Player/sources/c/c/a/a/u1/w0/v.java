package c.c.a.a.u1.w0;

import android.os.Handler;
import c.c.a.a.l0;
import c.c.a.a.m0;
import c.c.a.a.q1.x;
import c.c.a.a.q1.y;
import c.c.a.a.s0;
import c.c.a.a.u1.h0;
import c.c.a.a.u1.k0;
import c.c.a.a.z1.z;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class v implements y {

    /* renamed from: a, reason: collision with root package name */
    public final k0 f3024a;

    /* renamed from: b, reason: collision with root package name */
    public final m0 f3025b = new m0();

    /* renamed from: c, reason: collision with root package name */
    public final c.c.a.a.s1.g f3026c = new c.c.a.a.s1.g();

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w f3027d;

    public v(w wVar, k0 k0Var) {
        this.f3027d = wVar;
        this.f3024a = k0Var;
    }

    @Override // c.c.a.a.q1.y
    public void a(z zVar, int i) {
        this.f3024a.a(zVar, i);
    }

    @Override // c.c.a.a.q1.y
    public void b(l0 l0Var) {
        this.f3024a.b(l0Var);
    }

    @Override // c.c.a.a.q1.y
    public int c(c.c.a.a.q1.j jVar, int i, boolean z) {
        return this.f3024a.c(jVar, i, z);
    }

    @Override // c.c.a.a.q1.y
    public void d(long j, int i, int i2, int i3, x xVar) {
        long a2;
        c.c.a.a.s1.g gVar;
        long j2;
        this.f3024a.d(j, i, i2, i3, xVar);
        while (this.f3024a.o()) {
            this.f3026c.i();
            if (this.f3024a.s(this.f3025b, this.f3026c, false, false, 0L) == -4) {
                this.f3026c.f2180d.flip();
                gVar = this.f3026c;
            } else {
                gVar = null;
            }
            if (gVar != null) {
                long j3 = gVar.f2181e;
                boolean z = false;
                c.c.a.a.s1.j.b bVar = (c.c.a.a.s1.j.b) this.f3027d.f3030d.a(gVar).f2719b[0];
                String str = bVar.f2721b;
                String str2 = bVar.f2722c;
                if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                    z = true;
                }
                if (z) {
                    try {
                        byte[] bArr = bVar.f2725f;
                        int i4 = c.c.a.a.z1.l0.f3761a;
                        j2 = c.c.a.a.z1.l0.z(new String(bArr, Charset.forName("UTF-8")));
                    } catch (s0 unused) {
                        j2 = -9223372036854775807L;
                    }
                    if (j2 != -9223372036854775807L) {
                        u uVar = new u(j3, j2);
                        Handler handler = this.f3027d.f3031e;
                        handler.sendMessage(handler.obtainMessage(1, uVar));
                    }
                }
            }
        }
        k0 k0Var = this.f3024a;
        h0 h0Var = k0Var.f2895c;
        synchronized (h0Var) {
            int i5 = h0Var.l;
            a2 = i5 == 0 ? -1L : h0Var.a(i5);
        }
        k0Var.h(a2);
    }
}
