package c.c.a.a.u1.w0.x;

import java.util.Locale;

/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final String[] f3092a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f3093b;

    /* renamed from: c, reason: collision with root package name */
    public final String[] f3094c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3095d;

    public u(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.f3092a = strArr;
        this.f3093b = iArr;
        this.f3094c = strArr2;
        this.f3095d = i;
    }

    public String a(String str, long j, int i, long j2) {
        String format;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.f3095d;
            if (i2 >= i3) {
                sb.append(this.f3092a[i3]);
                return sb.toString();
            }
            sb.append(this.f3092a[i2]);
            int[] iArr = this.f3093b;
            if (iArr[i2] == 1) {
                sb.append(str);
            } else {
                if (iArr[i2] == 2) {
                    format = String.format(Locale.US, this.f3094c[i2], Long.valueOf(j));
                } else if (iArr[i2] == 3) {
                    format = String.format(Locale.US, this.f3094c[i2], Integer.valueOf(i));
                } else if (iArr[i2] == 4) {
                    format = String.format(Locale.US, this.f3094c[i2], Long.valueOf(j2));
                }
                sb.append(format);
            }
            i2++;
        }
    }
}
