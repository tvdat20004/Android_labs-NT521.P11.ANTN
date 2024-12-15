package c.c.a.a.w1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f3440a;

    /* renamed from: b, reason: collision with root package name */
    public final r[] f3441b;

    /* renamed from: c, reason: collision with root package name */
    public int f3442c;

    public s(r... rVarArr) {
        this.f3441b = rVarArr;
        this.f3440a = rVarArr.length;
    }

    public r[] a() {
        return (r[]) this.f3441b.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f3441b, ((s) obj).f3441b);
    }

    public int hashCode() {
        if (this.f3442c == 0) {
            this.f3442c = 527 + Arrays.hashCode(this.f3441b);
        }
        return this.f3442c;
    }
}
