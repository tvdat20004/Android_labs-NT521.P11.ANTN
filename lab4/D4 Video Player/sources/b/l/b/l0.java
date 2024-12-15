package b.l.b;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<Fragment> f1439a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<String, k0> f1440b = new HashMap<>();

    public void a(Fragment fragment) {
        if (this.f1439a.contains(fragment)) {
            throw new IllegalStateException("Fragment already added: " + fragment);
        }
        synchronized (this.f1439a) {
            this.f1439a.add(fragment);
        }
        fragment.k = true;
    }

    public void b() {
        this.f1440b.values().removeAll(Collections.singleton(null));
    }

    public boolean c(String str) {
        return this.f1440b.containsKey(str);
    }

    public void d(int i) {
        Iterator<Fragment> it = this.f1439a.iterator();
        while (it.hasNext()) {
            k0 k0Var = this.f1440b.get(it.next().f225e);
            if (k0Var != null) {
                k0Var.f1433c = i;
            }
        }
        for (k0 k0Var2 : this.f1440b.values()) {
            if (k0Var2 != null) {
                k0Var2.f1433c = i;
            }
        }
    }

    public Fragment e(String str) {
        k0 k0Var = this.f1440b.get(str);
        if (k0Var != null) {
            return k0Var.f1432b;
        }
        return null;
    }

    public List<Fragment> f() {
        ArrayList arrayList = new ArrayList();
        Iterator<k0> it = this.f1440b.values().iterator();
        while (it.hasNext()) {
            k0 next = it.next();
            arrayList.add(next != null ? next.f1432b : null);
        }
        return arrayList;
    }

    public List<Fragment> g() {
        ArrayList arrayList;
        if (this.f1439a.isEmpty()) {
            return Collections.emptyList();
        }
        synchronized (this.f1439a) {
            arrayList = new ArrayList(this.f1439a);
        }
        return arrayList;
    }

    public void h(Fragment fragment) {
        synchronized (this.f1439a) {
            this.f1439a.remove(fragment);
        }
        fragment.k = false;
    }
}
