package c.c.a.a.u1.u0;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final b f2934e = new b(new long[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f2935a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f2936b;

    /* renamed from: c, reason: collision with root package name */
    public final a[] f2937c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2938d;

    public b(long... jArr) {
        int length = jArr.length;
        this.f2935a = length;
        this.f2936b = Arrays.copyOf(jArr, length);
        this.f2937c = new a[length];
        for (int i = 0; i < length; i++) {
            this.f2937c[i] = new a();
        }
        this.f2938d = -9223372036854775807L;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2935a == bVar.f2935a && this.f2938d == bVar.f2938d && Arrays.equals(this.f2936b, bVar.f2936b) && Arrays.equals(this.f2937c, bVar.f2937c);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f2937c) + ((Arrays.hashCode(this.f2936b) + (((((this.f2935a * 31) + ((int) 0)) * 31) + ((int) this.f2938d)) * 31)) * 31);
    }
}
