package c.c.a.a.u1.u0;

import android.net.Uri;
import c.c.a.a.x1.p;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f2930a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri[] f2931b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f2932c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f2933d;

    public a() {
        p.c(true);
        this.f2930a = -1;
        this.f2932c = new int[0];
        this.f2931b = new Uri[0];
        this.f2933d = new long[0];
    }

    public int a(int i) {
        int i2 = i + 1;
        while (true) {
            int[] iArr = this.f2932c;
            if (i2 >= iArr.length || iArr[i2] == 0 || iArr[i2] == 1) {
                break;
            }
            i2++;
        }
        return i2;
    }

    public boolean b() {
        return this.f2930a == -1 || a(-1) < this.f2930a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f2930a == aVar.f2930a && Arrays.equals(this.f2931b, aVar.f2931b) && Arrays.equals(this.f2932c, aVar.f2932c) && Arrays.equals(this.f2933d, aVar.f2933d);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f2933d) + ((Arrays.hashCode(this.f2932c) + (((this.f2930a * 31) + Arrays.hashCode(this.f2931b)) * 31)) * 31);
    }
}
