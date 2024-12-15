package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleController;
import b.n.e;
import b.n.f;
import b.n.h;
import b.n.j;
import b.n.p;
import b.n.r;
import b.n.s;
import b.s.a;
import b.s.c;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class Recreator implements f {

    /* renamed from: a, reason: collision with root package name */
    public final c f390a;

    public static final class a implements a.b {

        /* renamed from: a, reason: collision with root package name */
        public final Set<String> f391a = new HashSet();

        public a(b.s.a aVar) {
            if (aVar.f1718a.d("androidx.savedstate.Restarter", this) != null) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
        }
    }

    public Recreator(c cVar) {
        this.f390a = cVar;
    }

    @Override // b.n.f
    public void d(h hVar, e.a aVar) {
        Bundle bundle;
        Object obj;
        boolean z;
        if (aVar != e.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        ((j) hVar.g()).f1538a.e(this);
        b.s.a b2 = this.f390a.b();
        if (!b2.f1720c) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
        }
        Bundle bundle2 = b2.f1719b;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("androidx.savedstate.Restarter");
            b2.f1719b.remove("androidx.savedstate.Restarter");
            if (b2.f1719b.isEmpty()) {
                b2.f1719b = null;
            }
        } else {
            bundle = null;
        }
        if (bundle == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            try {
                Class<? extends U> asSubclass = Class.forName(next, false, Recreator.class.getClassLoader()).asSubclass(a.InterfaceC0005a.class);
                try {
                    Constructor declaredConstructor = asSubclass.getDeclaredConstructor(new Class[0]);
                    declaredConstructor.setAccessible(true);
                    try {
                        a.InterfaceC0005a interfaceC0005a = (a.InterfaceC0005a) declaredConstructor.newInstance(new Object[0]);
                        c cVar = this.f390a;
                        Objects.requireNonNull((SavedStateHandleController.a) interfaceC0005a);
                        if (!(cVar instanceof s)) {
                            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
                        }
                        r e2 = ((s) cVar).e();
                        b.s.a b3 = cVar.b();
                        Objects.requireNonNull(e2);
                        Iterator it2 = new HashSet(e2.f1547a.keySet()).iterator();
                        while (it2.hasNext()) {
                            p pVar = e2.f1547a.get((String) it2.next());
                            e g = cVar.g();
                            Map<String, Object> map = pVar.f1546a;
                            if (map == null) {
                                obj = null;
                            } else {
                                synchronized (map) {
                                    obj = pVar.f1546a.get("androidx.lifecycle.savedstate.vm.tag");
                                }
                            }
                            SavedStateHandleController savedStateHandleController = (SavedStateHandleController) obj;
                            if (savedStateHandleController != null && !(z = savedStateHandleController.f240a)) {
                                if (z) {
                                    throw new IllegalStateException("Already attached to lifecycleOwner");
                                }
                                savedStateHandleController.f240a = true;
                                g.a(savedStateHandleController);
                                throw null;
                            }
                        }
                        if (!new HashSet(e2.f1547a.keySet()).isEmpty()) {
                            b3.a(SavedStateHandleController.a.class);
                        }
                    } catch (Exception e3) {
                        throw new RuntimeException(c.a.a.a.a.g("Failed to instantiate ", next), e3);
                    }
                } catch (NoSuchMethodException e4) {
                    StringBuilder j = c.a.a.a.a.j("Class");
                    j.append(asSubclass.getSimpleName());
                    j.append(" must have default constructor in order to be automatically recreated");
                    throw new IllegalStateException(j.toString(), e4);
                }
            } catch (ClassNotFoundException e5) {
                throw new RuntimeException(c.a.a.a.a.h("Class ", next, " wasn't found"), e5);
            }
        }
    }
}
