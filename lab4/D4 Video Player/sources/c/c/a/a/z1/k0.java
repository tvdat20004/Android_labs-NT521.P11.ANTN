package c.c.a.a.z1;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public long f3758a;

    /* renamed from: b, reason: collision with root package name */
    public long f3759b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f3760c = -9223372036854775807L;

    public k0(long j) {
        d(j);
    }

    public long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f3760c != -9223372036854775807L) {
            this.f3760c = j;
        } else {
            long j2 = this.f3758a;
            if (j2 != Long.MAX_VALUE) {
                this.f3759b = j2 - j;
            }
            synchronized (this) {
                this.f3760c = j;
                notifyAll();
            }
        }
        return j + this.f3759b;
    }

    public long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f3760c != -9223372036854775807L) {
            long j2 = (this.f3760c * 90000) / 1000000;
            long j3 = (4294967296L + j2) / 8589934592L;
            long j4 = ((j3 - 1) * 8589934592L) + j;
            j += j3 * 8589934592L;
            if (Math.abs(j4 - j2) < Math.abs(j - j2)) {
                j = j4;
            }
        }
        return a((j * 1000000) / 90000);
    }

    public long c() {
        if (this.f3758a == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.f3760c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f3759b;
    }

    public synchronized void d(long j) {
        c.c.a.a.x1.p.g(this.f3760c == -9223372036854775807L);
        this.f3758a = j;
    }
}
