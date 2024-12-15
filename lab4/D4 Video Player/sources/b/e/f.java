package b.e;

/* loaded from: classes.dex */
public class f<E> implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f885f = new Object();

    /* renamed from: b, reason: collision with root package name */
    public boolean f886b = false;

    /* renamed from: c, reason: collision with root package name */
    public long[] f887c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f888d;

    /* renamed from: e, reason: collision with root package name */
    public int f889e;

    public f() {
        int f2 = e.f(10);
        this.f887c = new long[f2];
        this.f888d = new Object[f2];
    }

    public void a(long j, E e2) {
        int i = this.f889e;
        if (i != 0 && j <= this.f887c[i - 1]) {
            g(j, e2);
            return;
        }
        if (this.f886b && i >= this.f887c.length) {
            d();
        }
        int i2 = this.f889e;
        if (i2 >= this.f887c.length) {
            int f2 = e.f(i2 + 1);
            long[] jArr = new long[f2];
            Object[] objArr = new Object[f2];
            long[] jArr2 = this.f887c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f888d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f887c = jArr;
            this.f888d = objArr;
        }
        this.f887c[i2] = j;
        this.f888d[i2] = e2;
        this.f889e = i2 + 1;
    }

    public void b() {
        int i = this.f889e;
        Object[] objArr = this.f888d;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.f889e = 0;
        this.f886b = false;
    }

    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public f<E> clone() {
        try {
            f<E> fVar = (f) super.clone();
            fVar.f887c = (long[]) this.f887c.clone();
            fVar.f888d = (Object[]) this.f888d.clone();
            return fVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void d() {
        int i = this.f889e;
        long[] jArr = this.f887c;
        Object[] objArr = this.f888d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f885f) {
                if (i3 != i2) {
                    jArr[i2] = jArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f886b = false;
        this.f889e = i2;
    }

    public E e(long j) {
        return f(j, null);
    }

    public E f(long j, E e2) {
        int b2 = e.b(this.f887c, this.f889e, j);
        if (b2 >= 0) {
            Object[] objArr = this.f888d;
            if (objArr[b2] != f885f) {
                return (E) objArr[b2];
            }
        }
        return e2;
    }

    public void g(long j, E e2) {
        int b2 = e.b(this.f887c, this.f889e, j);
        if (b2 >= 0) {
            this.f888d[b2] = e2;
            return;
        }
        int i = ~b2;
        int i2 = this.f889e;
        if (i < i2) {
            Object[] objArr = this.f888d;
            if (objArr[i] == f885f) {
                this.f887c[i] = j;
                objArr[i] = e2;
                return;
            }
        }
        if (this.f886b && i2 >= this.f887c.length) {
            d();
            i = ~e.b(this.f887c, this.f889e, j);
        }
        int i3 = this.f889e;
        if (i3 >= this.f887c.length) {
            int f2 = e.f(i3 + 1);
            long[] jArr = new long[f2];
            Object[] objArr2 = new Object[f2];
            long[] jArr2 = this.f887c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f888d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f887c = jArr;
            this.f888d = objArr2;
        }
        int i4 = this.f889e;
        if (i4 - i != 0) {
            long[] jArr3 = this.f887c;
            int i5 = i + 1;
            System.arraycopy(jArr3, i, jArr3, i5, i4 - i);
            Object[] objArr4 = this.f888d;
            System.arraycopy(objArr4, i, objArr4, i5, this.f889e - i);
        }
        this.f887c[i] = j;
        this.f888d[i] = e2;
        this.f889e++;
    }

    public int h() {
        if (this.f886b) {
            d();
        }
        return this.f889e;
    }

    public E i(int i) {
        if (this.f886b) {
            d();
        }
        return (E) this.f888d[i];
    }

    public String toString() {
        if (h() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f889e * 28);
        sb.append('{');
        for (int i = 0; i < this.f889e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            if (this.f886b) {
                d();
            }
            sb.append(this.f887c[i]);
            sb.append('=');
            E i2 = i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
