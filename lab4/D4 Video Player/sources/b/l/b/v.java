package b.l.b;

import androidx.fragment.app.Fragment;
import java.util.HashSet;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f1495a;

    public v(z zVar) {
        this.f1495a = zVar;
    }

    public void a(Fragment fragment, b.h.f.a aVar) {
        boolean z;
        synchronized (aVar) {
            z = aVar.f1178a;
        }
        if (z) {
            return;
        }
        z zVar = this.f1495a;
        HashSet<b.h.f.a> hashSet = zVar.k.get(fragment);
        if (hashSet != null && hashSet.remove(aVar) && hashSet.isEmpty()) {
            zVar.k.remove(fragment);
            if (fragment.f222b < 3) {
                zVar.h(fragment);
                zVar.T(fragment, fragment.v());
            }
        }
    }

    public void b(Fragment fragment, b.h.f.a aVar) {
        z zVar = this.f1495a;
        if (zVar.k.get(fragment) == null) {
            zVar.k.put(fragment, new HashSet<>());
        }
        zVar.k.get(fragment).add(aVar);
    }
}
