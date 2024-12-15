package b.e;

/* loaded from: classes.dex */
public class j<E> implements Cloneable {

    /* renamed from: f, reason: collision with root package name */
    public static final Object f916f = new Object();

    /* renamed from: b, reason: collision with root package name */
    public boolean f917b = false;

    /* renamed from: c, reason: collision with root package name */
    public int[] f918c;

    /* renamed from: d, reason: collision with root package name */
    public Object[] f919d;

    /* renamed from: e, reason: collision with root package name */
    public int f920e;

    public j(int i) {
        if (i == 0) {
            this.f918c = e.f882a;
            this.f919d = e.f884c;
        } else {
            int e2 = e.e(i);
            this.f918c = new int[e2];
            this.f919d = new Object[e2];
        }
    }

    public void a(int i, E e2) {
        int i2 = this.f920e;
        if (i2 != 0 && i <= this.f918c[i2 - 1]) {
            g(i, e2);
            return;
        }
        if (this.f917b && i2 >= this.f918c.length) {
            c();
        }
        int i3 = this.f920e;
        if (i3 >= this.f918c.length) {
            int e3 = e.e(i3 + 1);
            int[] iArr = new int[e3];
            Object[] objArr = new Object[e3];
            int[] iArr2 = this.f918c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f919d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f918c = iArr;
            this.f919d = objArr;
        }
        this.f918c[i3] = i;
        this.f919d[i3] = e2;
        this.f920e = i3 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public j<E> clone() {
        try {
            j<E> jVar = (j) super.clone();
            jVar.f918c = (int[]) this.f918c.clone();
            jVar.f919d = (Object[]) this.f919d.clone();
            return jVar;
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void c() {
        int i = this.f920e;
        int[] iArr = this.f918c;
        Object[] objArr = this.f919d;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f916f) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f917b = false;
        this.f920e = i2;
    }

    public E d(int i) {
        return e(i, null);
    }

    public E e(int i, E e2) {
        int a2 = e.a(this.f918c, this.f920e, i);
        if (a2 >= 0) {
            Object[] objArr = this.f919d;
            if (objArr[a2] != f916f) {
                return (E) objArr[a2];
            }
        }
        return e2;
    }

    public int f(int i) {
        if (this.f917b) {
            c();
        }
        return this.f918c[i];
    }

    public void g(int i, E e2) {
        int a2 = e.a(this.f918c, this.f920e, i);
        if (a2 >= 0) {
            this.f919d[a2] = e2;
            return;
        }
        int i2 = ~a2;
        int i3 = this.f920e;
        if (i2 < i3) {
            Object[] objArr = this.f919d;
            if (objArr[i2] == f916f) {
                this.f918c[i2] = i;
                objArr[i2] = e2;
                return;
            }
        }
        if (this.f917b && i3 >= this.f918c.length) {
            c();
            i2 = ~e.a(this.f918c, this.f920e, i);
        }
        int i4 = this.f920e;
        if (i4 >= this.f918c.length) {
            int e3 = e.e(i4 + 1);
            int[] iArr = new int[e3];
            Object[] objArr2 = new Object[e3];
            int[] iArr2 = this.f918c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f919d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f918c = iArr;
            this.f919d = objArr2;
        }
        int i5 = this.f920e;
        if (i5 - i2 != 0) {
            int[] iArr3 = this.f918c;
            int i6 = i2 + 1;
            System.arraycopy(iArr3, i2, iArr3, i6, i5 - i2);
            Object[] objArr4 = this.f919d;
            System.arraycopy(objArr4, i2, objArr4, i6, this.f920e - i2);
        }
        this.f918c[i2] = i;
        this.f919d[i2] = e2;
        this.f920e++;
    }

    public void h(int i) {
        int a2 = e.a(this.f918c, this.f920e, i);
        if (a2 >= 0) {
            Object[] objArr = this.f919d;
            Object obj = objArr[a2];
            Object obj2 = f916f;
            if (obj != obj2) {
                objArr[a2] = obj2;
                this.f917b = true;
            }
        }
    }

    public int i() {
        if (this.f917b) {
            c();
        }
        return this.f920e;
    }

    public E j(int i) {
        if (this.f917b) {
            c();
        }
        return (E) this.f919d[i];
    }

    public String toString() {
        if (i() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f920e * 28);
        sb.append('{');
        for (int i = 0; i < this.f920e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(f(i));
            sb.append('=');
            E j = j(i);
            if (j != this) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
