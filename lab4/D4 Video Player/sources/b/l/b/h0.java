package b.l.b;

import android.util.Log;
import androidx.fragment.app.Fragment;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h0 extends b.n.p {
    public static final b.n.q g = new g0();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f1418e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<String, Fragment> f1415b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap<String, h0> f1416c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap<String, b.n.r> f1417d = new HashMap<>();

    /* renamed from: f, reason: collision with root package name */
    public boolean f1419f = false;

    public h0(boolean z) {
        this.f1418e = z;
    }

    @Override // b.n.p
    public void a() {
        if (z.M(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1419f = true;
    }

    public boolean b(Fragment fragment) {
        if (this.f1415b.containsKey(fragment.f225e) && this.f1418e) {
            return this.f1419f;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f1415b.equals(h0Var.f1415b) && this.f1416c.equals(h0Var.f1416c) && this.f1417d.equals(h0Var.f1417d);
    }

    public int hashCode() {
        return this.f1417d.hashCode() + ((this.f1416c.hashCode() + (this.f1415b.hashCode() * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator<Fragment> it = this.f1415b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator<String> it2 = this.f1416c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append(it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator<String> it3 = this.f1417d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append(it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
