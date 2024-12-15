package b.e;

import b.e.h;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public final class d<E> implements Collection<E>, Set<E> {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f877f = new int[0];
    public static final Object[] g = new Object[0];
    public static Object[] h;
    public static int i;
    public static Object[] j;
    public static int k;

    /* renamed from: b, reason: collision with root package name */
    public int[] f878b = f877f;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f879c = g;

    /* renamed from: d, reason: collision with root package name */
    public int f880d = 0;

    /* renamed from: e, reason: collision with root package name */
    public h<E, E> f881e;

    public static void b(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (d.class) {
                if (k < 10) {
                    objArr[0] = j;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    j = objArr;
                    k++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (d.class) {
                if (i < 10) {
                    objArr[0] = h;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    h = objArr;
                    i++;
                }
            }
        }
    }

    public final void a(int i2) {
        if (i2 == 8) {
            synchronized (d.class) {
                Object[] objArr = j;
                if (objArr != null) {
                    this.f879c = objArr;
                    j = (Object[]) objArr[0];
                    this.f878b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    k--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (d.class) {
                Object[] objArr2 = h;
                if (objArr2 != null) {
                    this.f879c = objArr2;
                    h = (Object[]) objArr2[0];
                    this.f878b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    i--;
                    return;
                }
            }
        }
        this.f878b = new int[i2];
        this.f879c = new Object[i2];
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e2) {
        int i2;
        int d2;
        if (e2 == null) {
            d2 = e();
            i2 = 0;
        } else {
            int hashCode = e2.hashCode();
            i2 = hashCode;
            d2 = d(e2, hashCode);
        }
        if (d2 >= 0) {
            return false;
        }
        int i3 = ~d2;
        int i4 = this.f880d;
        int[] iArr = this.f878b;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f879c;
            a(i5);
            int[] iArr2 = this.f878b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f879c, 0, objArr.length);
            }
            b(iArr, objArr, this.f880d);
        }
        int i6 = this.f880d;
        if (i3 < i6) {
            int[] iArr3 = this.f878b;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f879c;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f880d - i3);
        }
        this.f878b[i3] = i2;
        this.f879c[i3] = e2;
        this.f880d++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size() + this.f880d;
        int[] iArr = this.f878b;
        boolean z = false;
        if (iArr.length < size) {
            Object[] objArr = this.f879c;
            a(size);
            int i2 = this.f880d;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f878b, 0, i2);
                System.arraycopy(objArr, 0, this.f879c, 0, this.f880d);
            }
            b(iArr, objArr, this.f880d);
        }
        Iterator<? extends E> it = collection.iterator();
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public int c(Object obj) {
        return obj == null ? e() : d(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i2 = this.f880d;
        if (i2 != 0) {
            b(this.f878b, this.f879c, i2);
            this.f878b = f877f;
            this.f879c = g;
            this.f880d = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return c(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int d(Object obj, int i2) {
        int i3 = this.f880d;
        if (i3 == 0) {
            return -1;
        }
        int a2 = e.a(this.f878b, i3, i2);
        if (a2 < 0 || obj.equals(this.f879c[a2])) {
            return a2;
        }
        int i4 = a2 + 1;
        while (i4 < i3 && this.f878b[i4] == i2) {
            if (obj.equals(this.f879c[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = a2 - 1; i5 >= 0 && this.f878b[i5] == i2; i5--) {
            if (obj.equals(this.f879c[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    public final int e() {
        int i2 = this.f880d;
        if (i2 == 0) {
            return -1;
        }
        int a2 = e.a(this.f878b, i2, 0);
        if (a2 < 0 || this.f879c[a2] == null) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f878b[i3] == 0) {
            if (this.f879c[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a2 - 1; i4 >= 0 && this.f878b[i4] == 0; i4--) {
            if (this.f879c[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.f880d != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f880d; i2++) {
                try {
                    if (!set.contains(this.f879c[i2])) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public E f(int i2) {
        Object[] objArr = this.f879c;
        E e2 = (E) objArr[i2];
        int i3 = this.f880d;
        if (i3 <= 1) {
            b(this.f878b, objArr, i3);
            this.f878b = f877f;
            this.f879c = g;
            this.f880d = 0;
        } else {
            int[] iArr = this.f878b;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i4 = i3 - 1;
                this.f880d = i4;
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                    Object[] objArr2 = this.f879c;
                    System.arraycopy(objArr2, i5, objArr2, i2, this.f880d - i2);
                }
                this.f879c[this.f880d] = null;
            } else {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                this.f880d--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f878b, 0, i2);
                    System.arraycopy(objArr, 0, this.f879c, 0, i2);
                }
                int i6 = this.f880d;
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    System.arraycopy(iArr, i7, this.f878b, i2, i6 - i2);
                    System.arraycopy(objArr, i7, this.f879c, i2, this.f880d - i2);
                }
            }
        }
        return e2;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.f878b;
        int i2 = this.f880d;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f880d <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        if (this.f881e == null) {
            this.f881e = new c(this);
        }
        h<E, E> hVar = this.f881e;
        if (hVar.f897b == null) {
            hVar.f897b = new h.c();
        }
        return hVar.f897b.iterator();
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int c2 = c(obj);
        if (c2 < 0) {
            return false;
        }
        f(c2);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f880d - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f879c[i2])) {
                f(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f880d;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i2 = this.f880d;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f879c, 0, objArr, 0, i2);
        return objArr;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f880d) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f880d));
        }
        System.arraycopy(this.f879c, 0, tArr, 0, this.f880d);
        int length = tArr.length;
        int i2 = this.f880d;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f880d * 14);
        sb.append('{');
        for (int i2 = 0; i2 < this.f880d; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            Object obj = this.f879c[i2];
            if (obj != this) {
                sb.append(obj);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
