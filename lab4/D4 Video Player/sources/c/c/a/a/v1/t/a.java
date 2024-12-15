package c.c.a.a.v1.t;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import c.c.a.a.v1.c;
import c.c.a.a.v1.e;
import c.c.a.a.v1.g;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.z;
import java.nio.charset.Charset;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends c {
    public static final int u = l0.l("styl");
    public static final int v = l0.l("tbox");
    public final z n;
    public boolean o;
    public int p;
    public int q;
    public String r;
    public float s;
    public int t;

    public a(List<byte[]> list) {
        super("Tx3gDecoder");
        this.n = new z();
        if (list != null && list.size() == 1 && (list.get(0).length == 48 || list.get(0).length == 53)) {
            byte[] bArr = list.get(0);
            this.p = bArr[24];
            this.q = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.r = "Serif".equals(l0.i(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
            int i = bArr[25] * 20;
            this.t = i;
            boolean z = (bArr[0] & 32) != 0;
            this.o = z;
            if (z) {
                float f2 = ((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i;
                this.s = f2;
                this.s = l0.e(f2, 0.0f, 0.95f);
                return;
            }
        } else {
            this.p = 0;
            this.q = -1;
            this.r = "sans-serif";
            this.o = false;
        }
        this.s = 0.85f;
    }

    public static void l(boolean z) {
        if (!z) {
            throw new g("Unexpected subtitle format.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m(android.text.SpannableStringBuilder r5, int r6, int r7, int r8, int r9, int r10) {
        /*
            if (r6 == r7) goto L4c
            r7 = r10 | 33
            r10 = r6 & 1
            r0 = 0
            r1 = 1
            if (r10 == 0) goto Lc
            r10 = r1
            goto Ld
        Lc:
            r10 = r0
        Ld:
            r2 = r6 & 2
            if (r2 == 0) goto L13
            r2 = r1
            goto L14
        L13:
            r2 = r0
        L14:
            if (r10 == 0) goto L23
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            if (r2 == 0) goto L1f
            r4 = 3
            r3.<init>(r4)
            goto L2b
        L1f:
            r3.<init>(r1)
            goto L2b
        L23:
            if (r2 == 0) goto L2e
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r4 = 2
            r3.<init>(r4)
        L2b:
            r5.setSpan(r3, r8, r9, r7)
        L2e:
            r6 = r6 & 4
            if (r6 == 0) goto L33
            goto L34
        L33:
            r1 = r0
        L34:
            if (r1 == 0) goto L3e
            android.text.style.UnderlineSpan r6 = new android.text.style.UnderlineSpan
            r6.<init>()
            r5.setSpan(r6, r8, r9, r7)
        L3e:
            if (r1 != 0) goto L4c
            if (r10 != 0) goto L4c
            if (r2 != 0) goto L4c
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r0)
            r5.setSpan(r6, r8, r9, r7)
        L4c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.v1.t.a.m(android.text.SpannableStringBuilder, int, int, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.c.a.a.v1.c
    public e k(byte[] bArr, int i, boolean z) {
        String str;
        String n;
        z zVar = this.n;
        zVar.f3800a = bArr;
        zVar.f3802c = i;
        int i2 = 0;
        zVar.f3801b = 0;
        int i3 = 1;
        l(zVar.a() >= 2);
        int u2 = zVar.u();
        if (u2 == 0) {
            n = "";
        } else {
            if (zVar.a() >= 2) {
                byte[] bArr2 = zVar.f3800a;
                int i4 = zVar.f3801b;
                char c2 = (char) ((bArr2[i4 + 1] & 255) | ((bArr2[i4] & 255) << 8));
                if (c2 == 65279 || c2 == 65534) {
                    str = "UTF-16";
                    n = zVar.n(u2, Charset.forName(str));
                }
            }
            str = "UTF-8";
            n = zVar.n(u2, Charset.forName(str));
        }
        if (n.isEmpty()) {
            return b.f3367c;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(n);
        m(spannableStringBuilder, this.p, 0, 0, spannableStringBuilder.length(), 16711680);
        int i5 = this.q;
        int length = spannableStringBuilder.length();
        if (i5 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i5 >>> 8) | ((i5 & 255) << 24)), 0, length, 16711713);
        }
        String str2 = this.r;
        int length2 = spannableStringBuilder.length();
        if (str2 != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str2), 0, length2, 16711713);
        }
        float f2 = this.s;
        while (this.n.a() >= 8) {
            z zVar2 = this.n;
            int i6 = zVar2.f3801b;
            int d2 = zVar2.d();
            int d3 = this.n.d();
            if (d3 == u) {
                l(this.n.a() >= 2 ? i3 : i2);
                int u3 = this.n.u();
                int i7 = i2;
                while (i7 < u3) {
                    z zVar3 = this.n;
                    l(zVar3.a() >= 12 ? i3 : i2);
                    int u4 = zVar3.u();
                    int u5 = zVar3.u();
                    zVar3.B(2);
                    int p = zVar3.p();
                    zVar3.B(i3);
                    int d4 = zVar3.d();
                    int i8 = i7;
                    m(spannableStringBuilder, p, this.p, u4, u5, 0);
                    if (d4 != this.q) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan((d4 >>> 8) | ((d4 & 255) << 24)), u4, u5, 33);
                    }
                    i7 = i8 + 1;
                    i2 = 0;
                    i3 = 1;
                }
            } else if (d3 == v && this.o) {
                l(this.n.a() >= 2);
                f2 = l0.e(this.n.u() / this.t, 0.0f, 0.95f);
            }
            this.n.A(i6 + d2);
            i2 = 0;
            i3 = 1;
        }
        return new b(new c.c.a.a.v1.b(spannableStringBuilder, null, f2, 0, 0, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
    }
}
