package c.c.a.a.m1;

import android.annotation.TargetApi;
import java.util.Arrays;

@TargetApi(21)
/* loaded from: classes.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final m f2122c = new m(new int[]{2}, 8);

    /* renamed from: d, reason: collision with root package name */
    public static final m f2123d = new m(new int[]{2, 5, 6}, 8);

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2124a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2125b;

    public m(int[] iArr, int i) {
        if (iArr != null) {
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f2124a = copyOf;
            Arrays.sort(copyOf);
        } else {
            this.f2124a = new int[0];
        }
        this.f2125b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Arrays.equals(this.f2124a, mVar.f2124a) && this.f2125b == mVar.f2125b;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f2124a) * 31) + this.f2125b;
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("AudioCapabilities[maxChannelCount=");
        j.append(this.f2125b);
        j.append(", supportedEncodings=");
        j.append(Arrays.toString(this.f2124a));
        j.append("]");
        return j.toString();
    }
}
