package c.c.a.a;

import java.util.UUID;

/* loaded from: classes.dex */
public abstract class s {

    /* renamed from: a, reason: collision with root package name */
    public static final UUID f2715a = new UUID(0, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final UUID f2716b = new UUID(1186680826959645954L, -5988876978535335093L);

    /* renamed from: c, reason: collision with root package name */
    public static final UUID f2717c;

    /* renamed from: d, reason: collision with root package name */
    public static final UUID f2718d;

    static {
        new UUID(-2129748144642739255L, 8654423357094679310L);
        f2717c = new UUID(-1301668207276963122L, -6645017420763422227L);
        f2718d = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long a(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j * 1000;
    }

    public static long b(long j) {
        return (j == -9223372036854775807L || j == Long.MIN_VALUE) ? j : j / 1000;
    }
}
