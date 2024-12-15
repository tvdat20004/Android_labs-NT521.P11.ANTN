package b.n;

import androidx.lifecycle.CompositeGeneratedAdaptersObserver;
import androidx.lifecycle.ReflectiveGenericLifecycleObserver;
import androidx.lifecycle.SingleGeneratedAdapterObserver;
import b.n.e;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public e.b f1536a;

    /* renamed from: b, reason: collision with root package name */
    public f f1537b;

    public i(g gVar, e.b bVar) {
        f reflectiveGenericLifecycleObserver;
        f fVar;
        Map<Class<?>, Integer> map = k.f1544a;
        if (gVar instanceof f) {
            fVar = (f) gVar;
        } else {
            Class<?> cls = gVar.getClass();
            if (k.c(cls) == 2) {
                List<Constructor<? extends d>> list = k.f1545b.get(cls);
                if (list.size() == 1) {
                    reflectiveGenericLifecycleObserver = new SingleGeneratedAdapterObserver(k.a(list.get(0), gVar));
                } else {
                    d[] dVarArr = new d[list.size()];
                    for (int i = 0; i < list.size(); i++) {
                        dVarArr[i] = k.a(list.get(i), gVar);
                    }
                    fVar = new CompositeGeneratedAdaptersObserver(dVarArr);
                }
            } else {
                reflectiveGenericLifecycleObserver = new ReflectiveGenericLifecycleObserver(gVar);
            }
            fVar = reflectiveGenericLifecycleObserver;
        }
        this.f1537b = fVar;
        this.f1536a = bVar;
    }

    public void a(h hVar, e.a aVar) {
        e.b c2 = j.c(aVar);
        this.f1536a = j.e(this.f1536a, c2);
        this.f1537b.d(hVar, aVar);
        this.f1536a = c2;
    }
}
