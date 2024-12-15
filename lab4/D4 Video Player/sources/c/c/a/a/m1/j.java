package c.c.a.a.m1;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2110a = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static void a(int i, c.c.a.a.z1.z zVar) {
        zVar.w(7);
        byte[] bArr = zVar.f3800a;
        bArr[0] = -84;
        bArr[1] = 64;
        bArr[2] = -1;
        bArr[3] = -1;
        bArr[4] = (byte) ((i >> 16) & 255);
        bArr[5] = (byte) ((i >> 8) & 255);
        bArr[6] = (byte) (i & 255);
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
    
        if (r11 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0092, code lost:
    
        if (r11 != 11) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0097, code lost:
    
        if (r11 != 8) goto L50;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c.c.a.a.m1.i b(c.c.a.a.z1.y r11) {
        /*
            int[] r0 = c.c.a.a.m1.j.f2110a
            r1 = 16
            int r2 = r11.f(r1)
            int r1 = r11.f(r1)
            r3 = 4
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r1 != r4) goto L1a
            r1 = 24
            int r1 = r11.f(r1)
            r4 = 7
            goto L1b
        L1a:
            r4 = r3
        L1b:
            int r1 = r1 + r4
            r4 = 44097(0xac41, float:6.1793E-41)
            if (r2 != r4) goto L23
            int r1 = r1 + 2
        L23:
            r8 = r1
            r1 = 2
            int r2 = r11.f(r1)
            r4 = 0
            r5 = 3
            if (r2 != r5) goto L40
            r6 = r4
        L2e:
            int r7 = r11.f(r1)
            int r7 = r7 + r6
            boolean r6 = r11.e()
            if (r6 != 0) goto L3b
            int r2 = r2 + r7
            goto L40
        L3b:
            int r7 = r7 + 1
            int r6 = r7 << 2
            goto L2e
        L40:
            r6 = 10
            int r6 = r11.f(r6)
            boolean r7 = r11.e()
            if (r7 == 0) goto L55
            int r7 = r11.f(r5)
            if (r7 <= 0) goto L55
            r11.l(r1)
        L55:
            boolean r7 = r11.e()
            r9 = 48000(0xbb80, float:6.7262E-41)
            r10 = 44100(0xac44, float:6.1797E-41)
            if (r7 == 0) goto L63
            r7 = r9
            goto L64
        L63:
            r7 = r10
        L64:
            int r11 = r11.f(r3)
            if (r7 != r10) goto L72
            r10 = 13
            if (r11 != r10) goto L72
            r11 = r0[r11]
            r9 = r11
            goto La0
        L72:
            if (r7 != r9) goto L9f
            int r9 = r0.length
            if (r11 >= r9) goto L9f
            r0 = r0[r11]
            int r6 = r6 % 5
            r4 = 8
            r9 = 1
            if (r6 == r9) goto L95
            r9 = 11
            if (r6 == r1) goto L90
            if (r6 == r5) goto L95
            if (r6 == r3) goto L89
            goto L9a
        L89:
            if (r11 == r5) goto L9c
            if (r11 == r4) goto L9c
            if (r11 != r9) goto L9a
            goto L9c
        L90:
            if (r11 == r4) goto L9c
            if (r11 != r9) goto L9a
            goto L9c
        L95:
            if (r11 == r5) goto L9c
            if (r11 != r4) goto L9a
            goto L9c
        L9a:
            r9 = r0
            goto La0
        L9c:
            int r0 = r0 + 1
            goto L9a
        L9f:
            r9 = r4
        La0:
            c.c.a.a.m1.i r11 = new c.c.a.a.m1.i
            r6 = 2
            r10 = 0
            r4 = r11
            r5 = r2
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.m1.j.b(c.c.a.a.z1.y):c.c.a.a.m1.i");
    }
}
