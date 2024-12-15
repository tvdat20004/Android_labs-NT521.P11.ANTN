package c.c.a.a.q1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final int f2672a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2673b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2674c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2675d;

    public x(int i, byte[] bArr, int i2, int i3) {
        this.f2672a = i;
        this.f2673b = bArr;
        this.f2674c = i2;
        this.f2675d = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.f2672a == xVar.f2672a && this.f2674c == xVar.f2674c && this.f2675d == xVar.f2675d && Arrays.equals(this.f2673b, xVar.f2673b);
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.f2673b) + (this.f2672a * 31)) * 31) + this.f2674c) * 31) + this.f2675d;
    }
}
