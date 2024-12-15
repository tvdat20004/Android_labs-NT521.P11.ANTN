package b.n;

import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f1529a;

    /* renamed from: b, reason: collision with root package name */
    public final Method f1530b;

    public b(int i, Method method) {
        this.f1529a = i;
        this.f1530b = method;
        method.setAccessible(true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f1529a == bVar.f1529a && this.f1530b.getName().equals(bVar.f1530b.getName());
    }

    public int hashCode() {
        return this.f1530b.getName().hashCode() + (this.f1529a * 31);
    }
}
