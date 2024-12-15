package b.o.a;

import b.e.j;
import b.n.h;
import b.n.m;
import b.n.p;
import b.n.q;
import b.n.r;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
public class b extends b.o.a.a {

    /* renamed from: a, reason: collision with root package name */
    public final h f1548a;

    /* renamed from: b, reason: collision with root package name */
    public final C0003b f1549b;

    /* JADX WARN: Unexpected interfaces in signature: [java.lang.Object<D>] */
    public static class a<D> extends m<D> {
    }

    /* renamed from: b.o.a.b$b, reason: collision with other inner class name */
    public static class C0003b extends p {

        /* renamed from: c, reason: collision with root package name */
        public static final q f1550c = new a();

        /* renamed from: b, reason: collision with root package name */
        public j<a> f1551b = new j<>(10);

        /* renamed from: b.o.a.b$b$a */
        public static class a implements q {
        }

        @Override // b.n.p
        public void a() {
            if (this.f1551b.i() > 0) {
                this.f1551b.j(0);
                throw null;
            }
            j<a> jVar = this.f1551b;
            int i = jVar.f920e;
            Object[] objArr = jVar.f919d;
            for (int i2 = 0; i2 < i; i2++) {
                objArr[i2] = null;
            }
            jVar.f920e = 0;
            jVar.f917b = false;
        }
    }

    public b(h hVar, r rVar) {
        p put;
        this.f1548a = hVar;
        String canonicalName = C0003b.class.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        String g = c.a.a.a.a.g("androidx.lifecycle.ViewModelProvider.DefaultKey:", canonicalName);
        p pVar = rVar.f1547a.get(g);
        if (!C0003b.class.isInstance(pVar) && (put = rVar.f1547a.put(g, (pVar = new C0003b()))) != null) {
            put.a();
        }
        this.f1549b = (C0003b) pVar;
    }

    @Override // b.o.a.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        C0003b c0003b = this.f1549b;
        if (c0003b.f1551b.i() > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (c0003b.f1551b.i() <= 0) {
                return;
            }
            c0003b.f1551b.j(0);
            printWriter.print(str);
            printWriter.print("  #");
            printWriter.print(c0003b.f1551b.f(0));
            printWriter.print(": ");
            throw null;
        }
    }

    public String toString() {
        String hexString;
        int lastIndexOf;
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        h hVar = this.f1548a;
        if (hVar == null) {
            hexString = "null";
        } else {
            String simpleName = hVar.getClass().getSimpleName();
            if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = hVar.getClass().getName()).lastIndexOf(46)) > 0) {
                simpleName = simpleName.substring(lastIndexOf + 1);
            }
            sb.append(simpleName);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(hVar));
        }
        sb.append(hexString);
        sb.append("}}");
        return sb.toString();
    }
}
