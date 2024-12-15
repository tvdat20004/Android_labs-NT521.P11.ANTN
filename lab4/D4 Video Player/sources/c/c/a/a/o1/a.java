package c.c.a.a.o1;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    public int f2165b;

    public final void e(int i) {
        this.f2165b = i | this.f2165b;
    }

    public final boolean f(int i) {
        return (this.f2165b & i) == i;
    }

    public final boolean g() {
        return f(Integer.MIN_VALUE);
    }

    public final boolean h() {
        return f(4);
    }
}
