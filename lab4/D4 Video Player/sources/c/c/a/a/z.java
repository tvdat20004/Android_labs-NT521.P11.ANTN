package c.c.a.a;

/* loaded from: classes.dex */
public final class z extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final int f3709b;

    public z(int i, Throwable th, int i2) {
        super(th);
        this.f3709b = i;
    }

    public static z a(Exception exc, int i) {
        return new z(1, exc, i);
    }
}
