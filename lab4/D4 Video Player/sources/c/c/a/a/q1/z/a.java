package c.c.a.a.q1.z;

import c.c.a.a.q1.i;
import c.c.a.a.q1.j;
import c.c.a.a.q1.m;
import c.c.a.a.q1.n;
import c.c.a.a.q1.s;
import c.c.a.a.q1.u;
import c.c.a.a.q1.v;
import c.c.a.a.q1.y;
import c.c.a.a.s0;
import c.c.a.a.z1.l0;
import java.io.EOFException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements m {
    public static final int[] p;
    public static final int s;

    /* renamed from: b, reason: collision with root package name */
    public boolean f2677b;

    /* renamed from: c, reason: collision with root package name */
    public long f2678c;

    /* renamed from: d, reason: collision with root package name */
    public int f2679d;

    /* renamed from: e, reason: collision with root package name */
    public int f2680e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2681f;
    public long g;
    public int i;
    public long j;
    public n k;
    public y l;
    public v m;
    public boolean n;
    public static final int[] o = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};
    public static final byte[] q = l0.s("#!AMR\n");
    public static final byte[] r = l0.s("#!AMR-WB\n");

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2676a = new byte[1];
    public int h = -1;

    static {
        int[] iArr = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};
        p = iArr;
        s = iArr[8];
    }

    public a(int i) {
    }

    @Override // c.c.a.a.q1.m
    public void a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if ((!r1 && (r5 < 12 || r5 > 14)) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(c.c.a.a.q1.j r5) {
        /*
            r4 = this;
            r0 = 0
            r5.f2652f = r0
            byte[] r1 = r4.f2676a
            r2 = 1
            r5.d(r1, r0, r2, r0)
            byte[] r5 = r4.f2676a
            r5 = r5[r0]
            r1 = r5 & 131(0x83, float:1.84E-43)
            if (r1 > 0) goto L6f
            int r5 = r5 >> 3
            r1 = 15
            r5 = r5 & r1
            if (r5 < 0) goto L3b
            if (r5 > r1) goto L3b
            boolean r1 = r4.f2677b
            if (r1 == 0) goto L28
            r3 = 10
            if (r5 < r3) goto L26
            r3 = 13
            if (r5 <= r3) goto L28
        L26:
            r3 = r2
            goto L29
        L28:
            r3 = r0
        L29:
            if (r3 != 0) goto L3a
            if (r1 != 0) goto L37
            r1 = 12
            if (r5 < r1) goto L35
            r1 = 14
            if (r5 <= r1) goto L37
        L35:
            r1 = r2
            goto L38
        L37:
            r1 = r0
        L38:
            if (r1 == 0) goto L3b
        L3a:
            r0 = r2
        L3b:
            if (r0 != 0) goto L61
            c.c.a.a.s0 r0 = new c.c.a.a.s0
            java.lang.String r1 = "Illegal AMR "
            java.lang.StringBuilder r1 = c.a.a.a.a.j(r1)
            boolean r2 = r4.f2677b
            if (r2 == 0) goto L4c
            java.lang.String r2 = "WB"
            goto L4e
        L4c:
            java.lang.String r2 = "NB"
        L4e:
            r1.append(r2)
            java.lang.String r2 = " frame type "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L61:
            boolean r0 = r4.f2677b
            if (r0 == 0) goto L6a
            int[] r0 = c.c.a.a.q1.z.a.p
            r5 = r0[r5]
            goto L6e
        L6a:
            int[] r0 = c.c.a.a.q1.z.a.o
            r5 = r0[r5]
        L6e:
            return r5
        L6f:
            c.c.a.a.s0 r0 = new c.c.a.a.s0
            java.lang.String r1 = "Invalid padding bits for frame header "
            java.lang.String r5 = c.a.a.a.a.b(r1, r5)
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.z.a.b(c.c.a.a.q1.j):int");
    }

    public final boolean c(j jVar) {
        int length;
        byte[] bArr = q;
        jVar.f2652f = 0;
        byte[] bArr2 = new byte[bArr.length];
        jVar.d(bArr2, 0, bArr.length, false);
        if (Arrays.equals(bArr2, bArr)) {
            this.f2677b = false;
            length = bArr.length;
        } else {
            byte[] bArr3 = r;
            jVar.f2652f = 0;
            byte[] bArr4 = new byte[bArr3.length];
            jVar.d(bArr4, 0, bArr3.length, false);
            if (!Arrays.equals(bArr4, bArr3)) {
                return false;
            }
            this.f2677b = true;
            length = bArr3.length;
        }
        jVar.h(length);
        return true;
    }

    @Override // c.c.a.a.q1.m
    public int d(j jVar, s sVar) {
        if (jVar.f2650d == 0 && !c(jVar)) {
            throw new s0("Could not find AMR header.");
        }
        if (!this.n) {
            this.n = true;
            boolean z = this.f2677b;
            this.l.b(c.c.a.a.l0.q(null, z ? "audio/amr-wb" : "audio/3gpp", null, -1, s, 1, z ? 16000 : 8000, -1, null, null, 0, null));
        }
        int i = -1;
        if (this.f2680e == 0) {
            try {
                int b2 = b(jVar);
                this.f2679d = b2;
                this.f2680e = b2;
                if (this.h == -1) {
                    this.g = jVar.f2650d;
                    this.h = b2;
                }
                if (this.h == b2) {
                    this.i++;
                }
            } catch (EOFException unused) {
            }
        }
        int c2 = this.l.c(jVar, this.f2680e, true);
        if (c2 != -1) {
            int i2 = this.f2680e - c2;
            this.f2680e = i2;
            i = 0;
            if (i2 <= 0) {
                this.l.d(this.f2678c + this.j, 1, this.f2679d, 0, null);
                this.f2678c += 20000;
            }
        }
        if (!this.f2681f) {
            u uVar = new u(-9223372036854775807L, 0L);
            this.m = uVar;
            this.k.a(uVar);
            this.f2681f = true;
        }
        return i;
    }

    @Override // c.c.a.a.q1.m
    public void e(n nVar) {
        this.k = nVar;
        this.l = nVar.j(0, 1);
        nVar.c();
    }

    @Override // c.c.a.a.q1.m
    public void h(long j, long j2) {
        this.f2678c = 0L;
        this.f2679d = 0;
        this.f2680e = 0;
        if (j != 0) {
            v vVar = this.m;
            if (vVar instanceof i) {
                i iVar = (i) vVar;
                this.j = i.d(j, iVar.f2642b, iVar.f2645e);
                return;
            }
        }
        this.j = 0L;
    }

    @Override // c.c.a.a.q1.m
    public boolean i(j jVar) {
        return c(jVar);
    }
}
