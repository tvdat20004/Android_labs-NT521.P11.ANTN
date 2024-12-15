package c.c.a.a.v1;

import c.c.a.a.x1.p;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class c extends c.c.a.a.o1.j<j, k, g> implements f {
    public c(String str) {
        super(new j[2], new k[2]);
        p.g(this.g == this.f2189e.length);
        for (c.c.a.a.o1.g gVar : this.f2189e) {
            gVar.k(1024);
        }
    }

    @Override // c.c.a.a.v1.f
    public void b(long j) {
    }

    @Override // c.c.a.a.o1.j
    public g f(j jVar, k kVar, boolean z) {
        j jVar2 = jVar;
        k kVar2 = kVar;
        try {
            ByteBuffer byteBuffer = jVar2.f2180d;
            e k = k(byteBuffer.array(), byteBuffer.limit(), z);
            long j = jVar2.f2181e;
            long j2 = jVar2.g;
            kVar2.f2183c = j;
            kVar2.f3257d = k;
            if (j2 != Long.MAX_VALUE) {
                j = j2;
            }
            kVar2.f3258e = j;
            kVar2.f2165b &= Integer.MAX_VALUE;
            return null;
        } catch (g e2) {
            return e2;
        }
    }

    public abstract e k(byte[] bArr, int i, boolean z);
}
