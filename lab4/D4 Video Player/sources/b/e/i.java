package b.e;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* loaded from: classes.dex */
public class i<K, V> {

    /* renamed from: e, reason: collision with root package name */
    public static Object[] f911e;

    /* renamed from: f, reason: collision with root package name */
    public static int f912f;
    public static Object[] g;
    public static int h;

    /* renamed from: b, reason: collision with root package name */
    public int[] f913b;

    /* renamed from: c, reason: collision with root package name */
    public Object[] f914c;

    /* renamed from: d, reason: collision with root package name */
    public int f915d;

    public i() {
        this.f913b = e.f882a;
        this.f914c = e.f884c;
        this.f915d = 0;
    }

    public i(int i) {
        if (i == 0) {
            this.f913b = e.f882a;
            this.f914c = e.f884c;
        } else {
            a(i);
        }
        this.f915d = 0;
    }

    public static void c(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (i.class) {
                if (h < 10) {
                    objArr[0] = g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    g = objArr;
                    h++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (i.class) {
                if (f912f < 10) {
                    objArr[0] = f911e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f911e = objArr;
                    f912f++;
                }
            }
        }
    }

    public final void a(int i) {
        if (i == 8) {
            synchronized (i.class) {
                Object[] objArr = g;
                if (objArr != null) {
                    this.f914c = objArr;
                    g = (Object[]) objArr[0];
                    this.f913b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (i.class) {
                Object[] objArr2 = f911e;
                if (objArr2 != null) {
                    this.f914c = objArr2;
                    f911e = (Object[]) objArr2[0];
                    this.f913b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f912f--;
                    return;
                }
            }
        }
        this.f913b = new int[i];
        this.f914c = new Object[i << 1];
    }

    public void b(int i) {
        int i2 = this.f915d;
        int[] iArr = this.f913b;
        if (iArr.length < i) {
            Object[] objArr = this.f914c;
            a(i);
            if (this.f915d > 0) {
                System.arraycopy(iArr, 0, this.f913b, 0, i2);
                System.arraycopy(objArr, 0, this.f914c, 0, i2 << 1);
            }
            c(iArr, objArr, i2);
        }
        if (this.f915d != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f915d;
        if (i > 0) {
            int[] iArr = this.f913b;
            Object[] objArr = this.f914c;
            this.f913b = e.f882a;
            this.f914c = e.f884c;
            this.f915d = 0;
            c(iArr, objArr, i);
        }
        if (this.f915d > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return e(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return g(obj) >= 0;
    }

    public int d(Object obj, int i) {
        int i2 = this.f915d;
        if (i2 == 0) {
            return -1;
        }
        try {
            int a2 = e.a(this.f913b, i2, i);
            if (a2 < 0 || obj.equals(this.f914c[a2 << 1])) {
                return a2;
            }
            int i3 = a2 + 1;
            while (i3 < i2 && this.f913b[i3] == i) {
                if (obj.equals(this.f914c[i3 << 1])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = a2 - 1; i4 >= 0 && this.f913b[i4] == i; i4--) {
                if (obj.equals(this.f914c[i4 << 1])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int e(Object obj) {
        return obj == null ? f() : d(obj, obj.hashCode());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f915d != iVar.f915d) {
                return false;
            }
            for (int i = 0; i < this.f915d; i++) {
                try {
                    K h2 = h(i);
                    V k = k(i);
                    Object obj2 = iVar.get(h2);
                    if (k == null) {
                        if (obj2 != null || !iVar.containsKey(h2)) {
                            return false;
                        }
                    } else if (!k.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.f915d != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f915d; i2++) {
                try {
                    K h3 = h(i2);
                    V k2 = k(i2);
                    Object obj3 = map.get(h3);
                    if (k2 == null) {
                        if (obj3 != null || !map.containsKey(h3)) {
                            return false;
                        }
                    } else if (!k2.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public int f() {
        int i = this.f915d;
        if (i == 0) {
            return -1;
        }
        try {
            int a2 = e.a(this.f913b, i, 0);
            if (a2 < 0 || this.f914c[a2 << 1] == null) {
                return a2;
            }
            int i2 = a2 + 1;
            while (i2 < i && this.f913b[i2] == 0) {
                if (this.f914c[i2 << 1] == null) {
                    return i2;
                }
                i2++;
            }
            for (int i3 = a2 - 1; i3 >= 0 && this.f913b[i3] == 0; i3--) {
                if (this.f914c[i3 << 1] == null) {
                    return i3;
                }
            }
            return ~i2;
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public int g(Object obj) {
        int i = this.f915d * 2;
        Object[] objArr = this.f914c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int e2 = e(obj);
        return e2 >= 0 ? (V) this.f914c[(e2 << 1) + 1] : v;
    }

    public K h(int i) {
        return (K) this.f914c[i << 1];
    }

    public int hashCode() {
        int[] iArr = this.f913b;
        Object[] objArr = this.f914c;
        int i = this.f915d;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public V i(int i) {
        Object[] objArr = this.f914c;
        int i2 = i << 1;
        V v = (V) objArr[i2 + 1];
        int i3 = this.f915d;
        int i4 = 0;
        if (i3 <= 1) {
            c(this.f913b, objArr, i3);
            this.f913b = e.f882a;
            this.f914c = e.f884c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f913b;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i6 = i + 1;
                    int i7 = i5 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.f914c;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i2, i7 << 1);
                }
                Object[] objArr3 = this.f914c;
                int i8 = i5 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                if (i3 != this.f915d) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f913b, 0, i);
                    System.arraycopy(objArr, 0, this.f914c, 0, i2);
                }
                if (i < i5) {
                    int i9 = i + 1;
                    int i10 = i5 - i;
                    System.arraycopy(iArr, i9, this.f913b, i, i10);
                    System.arraycopy(objArr, i9 << 1, this.f914c, i2, i10 << 1);
                }
            }
            i4 = i5;
        }
        if (i3 != this.f915d) {
            throw new ConcurrentModificationException();
        }
        this.f915d = i4;
        return v;
    }

    public boolean isEmpty() {
        return this.f915d <= 0;
    }

    public V j(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f914c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public V k(int i) {
        return (V) this.f914c[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int d2;
        int i2 = this.f915d;
        if (k == null) {
            d2 = f();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            d2 = d(k, hashCode);
        }
        if (d2 >= 0) {
            int i3 = (d2 << 1) + 1;
            Object[] objArr = this.f914c;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~d2;
        int[] iArr = this.f913b;
        if (i2 >= iArr.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.f914c;
            a(i5);
            if (i2 != this.f915d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f913b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f914c, 0, objArr2.length);
            }
            c(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f913b;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f914c;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f915d - i4) << 1);
        }
        int i7 = this.f915d;
        if (i2 == i7) {
            int[] iArr4 = this.f913b;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f914c;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f915d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V orDefault = getOrDefault(k, null);
        return orDefault == null ? put(k, v) : orDefault;
    }

    public V remove(Object obj) {
        int e2 = e(obj);
        if (e2 >= 0) {
            return i(e2);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int e2 = e(obj);
        if (e2 < 0) {
            return false;
        }
        V k = k(e2);
        if (obj2 != k && (obj2 == null || !obj2.equals(k))) {
            return false;
        }
        i(e2);
        return true;
    }

    public V replace(K k, V v) {
        int e2 = e(k);
        if (e2 >= 0) {
            return j(e2, v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int e2 = e(k);
        if (e2 < 0) {
            return false;
        }
        V k2 = k(e2);
        if (k2 != v && (v == null || !v.equals(k2))) {
            return false;
        }
        j(e2, v2);
        return true;
    }

    public int size() {
        return this.f915d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f915d * 28);
        sb.append('{');
        for (int i = 0; i < this.f915d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K h2 = h(i);
            if (h2 != this) {
                sb.append(h2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V k = k(i);
            if (k != this) {
                sb.append(k);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
