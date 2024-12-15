package c.c.a.a.a2.a0;

import c.c.a.a.m0;
import c.c.a.a.o1.g;
import c.c.a.a.r;
import c.c.a.a.x1.v.h;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.z;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class a extends r {
    public final m0 k;
    public final g l;
    public final z m;
    public long n;
    public h o;
    public long p;

    public a() {
        super(5);
        this.k = new m0();
        this.l = new g(1);
        this.m = new z();
    }

    @Override // c.c.a.a.b1
    public boolean c() {
        return true;
    }

    @Override // c.c.a.a.b1
    public boolean d() {
        return j();
    }

    @Override // c.c.a.a.b1
    public void f(long j, long j2) {
        float[] fArr;
        while (!j() && this.p < 100000 + j) {
            this.l.i();
            if (r(this.k, this.l, false) != -4 || this.l.h()) {
                return;
            }
            this.l.f2180d.flip();
            g gVar = this.l;
            this.p = gVar.f2181e;
            if (this.o != null) {
                ByteBuffer byteBuffer = gVar.f2180d;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    this.m.y(byteBuffer.array(), byteBuffer.limit());
                    this.m.A(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i = 0; i < 3; i++) {
                        fArr2[i] = Float.intBitsToFloat(this.m.f());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    h hVar = this.o;
                    int i2 = l0.f3761a;
                    hVar.f3524d.f1897c.a(this.p - this.n, fArr);
                }
            }
        }
    }

    @Override // c.c.a.a.r, c.c.a.a.b1
    public void g(int i, Object obj) {
        if (i == 7) {
            this.o = (h) obj;
        }
    }

    @Override // c.c.a.a.r
    public void k() {
        w();
    }

    @Override // c.c.a.a.r
    public void m(long j, boolean z) {
        w();
    }

    @Override // c.c.a.a.r
    public void q(c.c.a.a.l0[] l0VarArr, long j) {
        this.n = j;
    }

    @Override // c.c.a.a.r
    public int t(c.c.a.a.l0 l0Var) {
        return "application/x-camera-motion".equals(l0Var.j) ? 4 : 0;
    }

    public final void w() {
        this.p = 0L;
        h hVar = this.o;
        if (hVar != null) {
            hVar.f3525e.b();
            b bVar = hVar.f3524d;
            bVar.f1897c.b();
            bVar.f1898d = false;
            hVar.f3522b.set(true);
        }
    }
}
