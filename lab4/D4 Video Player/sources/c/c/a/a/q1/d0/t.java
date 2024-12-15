package c.c.a.a.q1.d0;

import c.c.a.a.q1.x;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f2360a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2361b;

    /* renamed from: c, reason: collision with root package name */
    public final x f2362c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2363d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f2364e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
    
        if (r6.equals("cbc1") == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 1
            r1 = 0
            if (r7 != 0) goto L9
            r2 = r0
            goto La
        L9:
            r2 = r1
        La:
            if (r11 != 0) goto Le
            r3 = r0
            goto Lf
        Le:
            r3 = r1
        Lf:
            r2 = r2 ^ r3
            c.c.a.a.x1.p.c(r2)
            r4.f2360a = r5
            r4.f2361b = r6
            r4.f2363d = r7
            r4.f2364e = r11
            c.c.a.a.q1.x r5 = new c.c.a.a.q1.x
            r7 = 2
            if (r6 != 0) goto L21
            goto L75
        L21:
            r11 = -1
            int r2 = r6.hashCode()
            switch(r2) {
                case 3046605: goto L4c;
                case 3046671: goto L41;
                case 3049879: goto L36;
                case 3049895: goto L2b;
                default: goto L29;
            }
        L29:
            r1 = r11
            goto L55
        L2b:
            java.lang.String r1 = "cens"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L34
            goto L29
        L34:
            r1 = 3
            goto L55
        L36:
            java.lang.String r1 = "cenc"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L3f
            goto L29
        L3f:
            r1 = r7
            goto L55
        L41:
            java.lang.String r1 = "cbcs"
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L4a
            goto L29
        L4a:
            r1 = r0
            goto L55
        L4c:
            java.lang.String r2 = "cbc1"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L55
            goto L29
        L55:
            switch(r1) {
                case 0: goto L74;
                case 1: goto L74;
                case 2: goto L75;
                case 3: goto L75;
                default: goto L58;
            }
        L58:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r11 = "Unsupported protection scheme type '"
            r7.append(r11)
            r7.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            java.lang.String r7 = "TrackEncryptionBox"
            android.util.Log.w(r7, r6)
            goto L75
        L74:
            r0 = r7
        L75:
            r5.<init>(r0, r8, r9, r10)
            r4.f2362c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.d0.t.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
