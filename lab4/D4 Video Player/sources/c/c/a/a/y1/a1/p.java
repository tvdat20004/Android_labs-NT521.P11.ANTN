package c.c.a.a.y1.a1;

import android.util.Log;
import java.io.File;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final int f3580a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3581b;

    /* renamed from: c, reason: collision with root package name */
    public final TreeSet<b0> f3582c = new TreeSet<>();

    /* renamed from: d, reason: collision with root package name */
    public x f3583d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3584e;

    public p(int i, String str, x xVar) {
        this.f3580a = i;
        this.f3581b = str;
        this.f3583d = xVar;
    }

    public b0 a(b0 b0Var, long j, boolean z) {
        File file;
        c.c.a.a.x1.p.g(this.f3582c.remove(b0Var));
        File file2 = b0Var.f3578f;
        if (z) {
            File c2 = b0.c(file2.getParentFile(), this.f3580a, b0Var.f3575c, j);
            if (file2.renameTo(c2)) {
                file = c2;
                c.c.a.a.x1.p.g(b0Var.f3577e);
                b0 b0Var2 = new b0(b0Var.f3574b, b0Var.f3575c, b0Var.f3576d, j, file);
                this.f3582c.add(b0Var2);
                return b0Var2;
            }
            Log.w("CachedContent", "Failed to rename " + file2 + " to " + c2);
        }
        file = file2;
        c.c.a.a.x1.p.g(b0Var.f3577e);
        b0 b0Var22 = new b0(b0Var.f3574b, b0Var.f3575c, b0Var.f3576d, j, file);
        this.f3582c.add(b0Var22);
        return b0Var22;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p.class != obj.getClass()) {
            return false;
        }
        p pVar = (p) obj;
        return this.f3580a == pVar.f3580a && this.f3581b.equals(pVar.f3581b) && this.f3582c.equals(pVar.f3582c) && this.f3583d.equals(pVar.f3583d);
    }

    public int hashCode() {
        return this.f3583d.hashCode() + ((this.f3581b.hashCode() + (this.f3580a * 31)) * 31);
    }
}
