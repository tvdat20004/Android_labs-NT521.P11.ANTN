package c.c.a.a.q1;

import c.c.a.a.z1.l0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h implements v {

    /* renamed from: a, reason: collision with root package name */
    public final int f2622a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f2623b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f2624c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f2625d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f2626e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2627f;

    public h(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f2623b = iArr;
        this.f2624c = jArr;
        this.f2625d = jArr2;
        this.f2626e = jArr3;
        int length = iArr.length;
        this.f2622a = length;
        if (length <= 0) {
            this.f2627f = 0L;
        } else {
            int i = length - 1;
            this.f2627f = jArr2[i] + jArr3[i];
        }
    }

    @Override // c.c.a.a.q1.v
    public boolean c() {
        return true;
    }

    @Override // c.c.a.a.q1.v
    public t g(long j) {
        int c2 = l0.c(this.f2626e, j, true, true);
        long[] jArr = this.f2626e;
        long j2 = jArr[c2];
        long[] jArr2 = this.f2624c;
        w wVar = new w(j2, jArr2[c2]);
        if (j2 >= j || c2 == this.f2622a - 1) {
            return new t(wVar);
        }
        int i = c2 + 1;
        return new t(wVar, new w(jArr[i], jArr2[i]));
    }

    @Override // c.c.a.a.q1.v
    public long j() {
        return this.f2627f;
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("ChunkIndex(length=");
        j.append(this.f2622a);
        j.append(", sizes=");
        j.append(Arrays.toString(this.f2623b));
        j.append(", offsets=");
        j.append(Arrays.toString(this.f2624c));
        j.append(", timeUs=");
        j.append(Arrays.toString(this.f2626e));
        j.append(", durationsUs=");
        j.append(Arrays.toString(this.f2625d));
        j.append(")");
        return j.toString();
    }
}
