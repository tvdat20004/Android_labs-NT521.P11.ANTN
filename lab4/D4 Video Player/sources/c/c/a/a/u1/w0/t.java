package c.c.a.a.u1.w0;

import c.c.a.a.m0;
import c.c.a.a.u1.l0;
import java.io.DataOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public final class t implements l0 {

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.l0 f3017b;

    /* renamed from: d, reason: collision with root package name */
    public long[] f3019d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3020e;

    /* renamed from: f, reason: collision with root package name */
    public c.c.a.a.u1.w0.x.f f3021f;
    public boolean g;
    public int h;

    /* renamed from: c, reason: collision with root package name */
    public final c.c.a.a.s1.j.d f3018c = new c.c.a.a.s1.j.d();
    public long i = -9223372036854775807L;

    public t(c.c.a.a.u1.w0.x.f fVar, c.c.a.a.l0 l0Var, boolean z) {
        this.f3017b = l0Var;
        this.f3021f = fVar;
        this.f3019d = fVar.f3058b;
        d(fVar, z);
    }

    @Override // c.c.a.a.u1.l0
    public void a() {
    }

    public void b(long j) {
        int b2 = c.c.a.a.z1.l0.b(this.f3019d, j, true, false);
        this.h = b2;
        if (!(this.f3020e && b2 == this.f3019d.length)) {
            j = -9223372036854775807L;
        }
        this.i = j;
    }

    @Override // c.c.a.a.u1.l0
    public boolean c() {
        return true;
    }

    public void d(c.c.a.a.u1.w0.x.f fVar, boolean z) {
        int i = this.h;
        long j = i == 0 ? -9223372036854775807L : this.f3019d[i - 1];
        this.f3020e = z;
        this.f3021f = fVar;
        long[] jArr = fVar.f3058b;
        this.f3019d = jArr;
        long j2 = this.i;
        if (j2 != -9223372036854775807L) {
            b(j2);
        } else if (j != -9223372036854775807L) {
            this.h = c.c.a.a.z1.l0.b(jArr, j, false, false);
        }
    }

    @Override // c.c.a.a.u1.l0
    public int j(m0 m0Var, c.c.a.a.o1.g gVar, boolean z) {
        if (z || !this.g) {
            m0Var.f2058a = this.f3017b;
            this.g = true;
            return -5;
        }
        int i = this.h;
        if (i == this.f3019d.length) {
            if (this.f3020e) {
                return -3;
            }
            gVar.f2165b = 4;
            return -4;
        }
        this.h = i + 1;
        c.c.a.a.s1.j.d dVar = this.f3018c;
        c.c.a.a.s1.j.b bVar = this.f3021f.f3057a[i];
        dVar.f2726a.reset();
        try {
            DataOutputStream dataOutputStream = dVar.f2727b;
            dataOutputStream.writeBytes(bVar.f2721b);
            dataOutputStream.writeByte(0);
            String str = bVar.f2722c;
            if (str == null) {
                str = "";
            }
            DataOutputStream dataOutputStream2 = dVar.f2727b;
            dataOutputStream2.writeBytes(str);
            dataOutputStream2.writeByte(0);
            c.c.a.a.s1.j.d.a(dVar.f2727b, 1000L);
            c.c.a.a.s1.j.d.a(dVar.f2727b, 0L);
            c.c.a.a.s1.j.d.a(dVar.f2727b, bVar.f2723d);
            c.c.a.a.s1.j.d.a(dVar.f2727b, bVar.f2724e);
            dVar.f2727b.write(bVar.f2725f);
            dVar.f2727b.flush();
            byte[] byteArray = dVar.f2726a.toByteArray();
            if (byteArray == null) {
                return -3;
            }
            gVar.k(byteArray.length);
            gVar.f2165b = 1;
            gVar.f2180d.put(byteArray);
            gVar.f2181e = this.f3019d[i];
            return -4;
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // c.c.a.a.u1.l0
    public int r(long j) {
        int max = Math.max(this.h, c.c.a.a.z1.l0.b(this.f3019d, j, true, false));
        int i = max - this.h;
        this.h = max;
        return i;
    }
}
