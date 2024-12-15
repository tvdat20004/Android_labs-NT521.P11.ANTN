package c.c.a.a.q1.g0;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class c0 implements c.c.a.a.q1.m {

    /* renamed from: e, reason: collision with root package name */
    public boolean f2470e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2471f;
    public boolean g;
    public long h;
    public z i;
    public c.c.a.a.q1.n j;
    public boolean k;

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.z1.k0 f2466a = new c.c.a.a.z1.k0(0);

    /* renamed from: c, reason: collision with root package name */
    public final c.c.a.a.z1.z f2468c = new c.c.a.a.z1.z(4096);

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<b0> f2467b = new SparseArray<>();

    /* renamed from: d, reason: collision with root package name */
    public final a0 f2469d = new a0();

    @Override // c.c.a.a.q1.m
    public void a() {
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x01e6  */
    @Override // c.c.a.a.q1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int d(c.c.a.a.q1.j r17, c.c.a.a.q1.s r18) {
        /*
            Method dump skipped, instructions count: 798
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.g0.c0.d(c.c.a.a.q1.j, c.c.a.a.q1.s):int");
    }

    @Override // c.c.a.a.q1.m
    public void e(c.c.a.a.q1.n nVar) {
        this.j = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r2 != r9) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[LOOP:0: B:13:0x0034->B:15:0x003c, LOOP_END] */
    @Override // c.c.a.a.q1.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(long r7, long r9) {
        /*
            r6 = this;
            c.c.a.a.z1.k0 r7 = r6.f2466a
            long r7 = r7.c()
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            r8 = 0
            if (r7 != 0) goto L12
            r7 = 1
            goto L13
        L12:
            r7 = r8
        L13:
            if (r7 != 0) goto L23
            c.c.a.a.z1.k0 r7 = r6.f2466a
            long r2 = r7.f3758a
            r4 = 0
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L2c
            int r7 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r7 == 0) goto L2c
        L23:
            c.c.a.a.z1.k0 r7 = r6.f2466a
            r7.f3760c = r0
            c.c.a.a.z1.k0 r7 = r6.f2466a
            r7.d(r9)
        L2c:
            c.c.a.a.q1.g0.z r7 = r6.i
            if (r7 == 0) goto L33
            r7.d(r9)
        L33:
            r7 = r8
        L34:
            android.util.SparseArray<c.c.a.a.q1.g0.b0> r9 = r6.f2467b
            int r9 = r9.size()
            if (r7 >= r9) goto L4e
            android.util.SparseArray<c.c.a.a.q1.g0.b0> r9 = r6.f2467b
            java.lang.Object r9 = r9.valueAt(r7)
            c.c.a.a.q1.g0.b0 r9 = (c.c.a.a.q1.g0.b0) r9
            r9.f2461f = r8
            c.c.a.a.q1.g0.j r9 = r9.f2456a
            r9.a()
            int r7 = r7 + 1
            goto L34
        L4e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.g0.c0.h(long, long):void");
    }

    @Override // c.c.a.a.q1.m
    public boolean i(c.c.a.a.q1.j jVar) {
        byte[] bArr = new byte[14];
        jVar.d(bArr, 0, 14, false);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        jVar.a(bArr[13] & 7, false);
        jVar.d(bArr, 0, 3, false);
        return 1 == ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255));
    }
}
