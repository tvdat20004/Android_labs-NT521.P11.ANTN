package b.f.b;

/* JADX WARN: Unexpected interfaces in signature: [b.f.b.f<T>] */
/* loaded from: classes.dex */
public class f<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f943a;

    /* renamed from: b, reason: collision with root package name */
    public int f944b;

    public f(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f943a = new Object[i];
    }

    public T a() {
        int i = this.f944b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f943a;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.f944b = i - 1;
        return t;
    }

    public boolean b(T t) {
        int i = this.f944b;
        Object[] objArr = this.f943a;
        if (i >= objArr.length) {
            return false;
        }
        objArr[i] = t;
        this.f944b = i + 1;
        return true;
    }
}
