package c.c.a.a.u1.x0;

import c.c.a.a.l0;
import c.c.a.a.y1.v0;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class g extends c.c.a.a.u1.v0.d {
    public byte[] i;
    public volatile boolean j;
    public byte[] k;

    public g(c.c.a.a.y1.n nVar, c.c.a.a.y1.q qVar, l0 l0Var, int i, Object obj, byte[] bArr) {
        super(nVar, qVar, 3, l0Var, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.i = bArr;
    }

    @Override // c.c.a.a.y1.l0
    public final void a() {
        try {
            this.h.a(this.f2942a);
            int i = 0;
            int i2 = 0;
            while (i != -1 && !this.j) {
                c(i2);
                i = this.h.e(this.i, i2, 16384);
                if (i != -1) {
                    i2 += i;
                }
            }
            if (!this.j) {
                this.k = Arrays.copyOf(this.i, i2);
            }
            if (r0 != null) {
                try {
                    this.h.close();
                } catch (IOException unused) {
                }
            }
        } finally {
            v0 v0Var = this.h;
            int i3 = c.c.a.a.z1.l0.f3761a;
            if (v0Var != null) {
                try {
                    v0Var.close();
                } catch (IOException unused2) {
                }
            }
        }
    }

    @Override // c.c.a.a.y1.l0
    public final void b() {
        this.j = true;
    }

    public final void c(int i) {
        byte[] bArr = this.i;
        if (bArr == null) {
            this.i = new byte[16384];
        } else if (bArr.length < i + 16384) {
            this.i = Arrays.copyOf(bArr, bArr.length + 16384);
        }
    }
}
