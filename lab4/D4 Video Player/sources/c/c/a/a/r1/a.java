package c.c.a.a.r1;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import c.c.a.a.l0;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f2693a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2694b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2695c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodecInfo.CodecCapabilities f2696d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2697e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2698f;
    public final boolean g;
    public final boolean h;

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        if (r4 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
    
        if (c.c.a.a.z1.l0.f3761a < 21) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004f, code lost:
    
        if (r4.isFeatureSupported("secure-playback") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r4 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
    
        r1 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(java.lang.String r1, java.lang.String r2, java.lang.String r3, android.media.MediaCodecInfo.CodecCapabilities r4, boolean r5, boolean r6, boolean r7) {
        /*
            r0 = this;
            r0.<init>()
            java.util.Objects.requireNonNull(r1)
            r0.f2693a = r1
            r0.f2694b = r2
            r0.f2695c = r3
            r0.f2696d = r4
            r0.g = r5
            r1 = 1
            r3 = 0
            if (r6 != 0) goto L2b
            if (r4 == 0) goto L2b
            int r5 = c.c.a.a.z1.l0.f3761a
            r6 = 19
            if (r5 < r6) goto L26
            java.lang.String r5 = "adaptive-playback"
            boolean r5 = r4.isFeatureSupported(r5)
            if (r5 == 0) goto L26
            r5 = r1
            goto L27
        L26:
            r5 = r3
        L27:
            if (r5 == 0) goto L2b
            r5 = r1
            goto L2c
        L2b:
            r5 = r3
        L2c:
            r0.f2697e = r5
            r5 = 21
            if (r4 == 0) goto L41
            int r6 = c.c.a.a.z1.l0.f3761a
            if (r6 < r5) goto L40
            java.lang.String r6 = "tunneled-playback"
            boolean r6 = r4.isFeatureSupported(r6)
            if (r6 == 0) goto L40
            r6 = r1
            goto L41
        L40:
            r6 = r3
        L41:
            if (r7 != 0) goto L58
            if (r4 == 0) goto L57
            int r6 = c.c.a.a.z1.l0.f3761a
            if (r6 < r5) goto L53
            java.lang.String r5 = "secure-playback"
            boolean r4 = r4.isFeatureSupported(r5)
            if (r4 == 0) goto L53
            r4 = r1
            goto L54
        L53:
            r4 = r3
        L54:
            if (r4 == 0) goto L57
            goto L58
        L57:
            r1 = r3
        L58:
            r0.f2698f = r1
            boolean r1 = c.c.a.a.z1.u.j(r2)
            r0.h = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.r1.a.<init>(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean):void");
    }

    @TargetApi(21)
    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d2) {
        return (d2 == -1.0d || d2 <= 0.0d) ? videoCapabilities.isSizeSupported(i, i2) : videoCapabilities.areSizeAndRateSupported(i, i2, Math.floor(d2));
    }

    public static a g(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new a(str, str2, str3, codecCapabilities, false, z, z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f0, code lost:
    
        if (r3 == false) goto L124;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0081 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(c.c.a.a.l0 r12) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.r1.a.b(c.c.a.a.l0):boolean");
    }

    public boolean c(l0 l0Var) {
        if (this.h) {
            return this.f2697e;
        }
        Pair<Integer, Integer> c2 = n.c(l0Var.g);
        return c2 != null && ((Integer) c2.first).intValue() == 42;
    }

    public boolean d(l0 l0Var, l0 l0Var2, boolean z) {
        if (this.h) {
            return l0Var.j.equals(l0Var2.j) && l0Var.r == l0Var2.r && (this.f2697e || (l0Var.o == l0Var2.o && l0Var.p == l0Var2.p)) && ((!z && l0Var2.v == null) || c.c.a.a.z1.l0.a(l0Var.v, l0Var2.v));
        }
        if ("audio/mp4a-latm".equals(this.f2694b) && l0Var.j.equals(l0Var2.j) && l0Var.w == l0Var2.w && l0Var.x == l0Var2.x) {
            Pair<Integer, Integer> c2 = n.c(l0Var.g);
            Pair<Integer, Integer> c3 = n.c(l0Var2.g);
            if (c2 != null && c3 != null) {
                return ((Integer) c2.first).intValue() == 42 && ((Integer) c3.first).intValue() == 42;
            }
        }
        return false;
    }

    @TargetApi(21)
    public boolean e(int i, int i2, double d2) {
        String str;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f2696d;
        if (codecCapabilities == null) {
            str = "sizeAndRate.caps";
        } else {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                str = "sizeAndRate.vCaps";
            } else {
                if (a(videoCapabilities, i, i2, d2)) {
                    return true;
                }
                if (i < i2 && a(videoCapabilities, i2, i, d2)) {
                    Log.d("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i + "x" + i2 + "x" + d2) + "] [" + this.f2693a + ", " + this.f2694b + "] [" + c.c.a.a.z1.l0.f3765e + "]");
                    return true;
                }
                str = "sizeAndRate.support, " + i + "x" + i2 + "x" + d2;
            }
        }
        f(str);
        return false;
    }

    public final void f(String str) {
        Log.d("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f2693a + ", " + this.f2694b + "] [" + c.c.a.a.z1.l0.f3765e + "]");
    }

    public String toString() {
        return this.f2693a;
    }
}
