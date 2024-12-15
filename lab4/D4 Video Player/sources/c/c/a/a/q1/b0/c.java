package c.c.a.a.q1.b0;

import java.util.ArrayDeque;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2238a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque<b> f2239b = new ArrayDeque<>();

    /* renamed from: c, reason: collision with root package name */
    public final j f2240c = new j();

    /* renamed from: d, reason: collision with root package name */
    public e f2241d;

    /* renamed from: e, reason: collision with root package name */
    public int f2242e;

    /* renamed from: f, reason: collision with root package name */
    public int f2243f;
    public long g;

    public final long a(c.c.a.a.q1.j jVar) {
        jVar.f2652f = 0;
        while (true) {
            jVar.d(this.f2238a, 0, 4, false);
            int b2 = j.b(this.f2238a[0]);
            if (b2 != -1 && b2 <= 4) {
                int a2 = (int) j.a(this.f2238a, b2, false);
                Objects.requireNonNull(this.f2241d.f2244a);
                if (a2 == 357149030 || a2 == 524531317 || a2 == 475249515 || a2 == 374648427) {
                    jVar.h(b2);
                    return a2;
                }
            }
            jVar.h(1);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:394:0x07ad, code lost:
    
        if (r2.j() == r10.getLeastSignificantBits()) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:429:0x040e, code lost:
    
        if (r4.equals("V_THEORA") == false) goto L286;
     */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x080e  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0818  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x083d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0810  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x07b4  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x07cd  */
    /* JADX WARN: Removed duplicated region for block: B:491:0x0a88  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(c.c.a.a.q1.j r43) {
        /*
            Method dump skipped, instructions count: 3554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.q1.b0.c.b(c.c.a.a.q1.j):boolean");
    }

    public final double c(c.c.a.a.q1.j jVar, int i) {
        return i == 4 ? Float.intBitsToFloat((int) r0) : Double.longBitsToDouble(d(jVar, i));
    }

    public final long d(c.c.a.a.q1.j jVar, int i) {
        jVar.g(this.f2238a, 0, i, false);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (this.f2238a[i2] & 255);
        }
        return j;
    }

    public final String e(c.c.a.a.q1.j jVar, int i) {
        if (i == 0) {
            return "";
        }
        byte[] bArr = new byte[i];
        jVar.g(bArr, 0, i, false);
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        return new String(bArr, 0, i);
    }
}
