package b.l.b;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import b.n.e;
import java.util.Objects;

/* loaded from: classes.dex */
public class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final t f1431a;

    /* renamed from: b, reason: collision with root package name */
    public final Fragment f1432b;

    /* renamed from: c, reason: collision with root package name */
    public int f1433c = -1;

    public k0(t tVar, Fragment fragment) {
        this.f1431a = tVar;
        this.f1432b = fragment;
    }

    public k0(t tVar, Fragment fragment, j0 j0Var) {
        this.f1431a = tVar;
        this.f1432b = fragment;
        fragment.f224d = null;
        fragment.q = 0;
        fragment.n = false;
        fragment.k = false;
        Fragment fragment2 = fragment.g;
        fragment.h = fragment2 != null ? fragment2.f225e : null;
        fragment.g = null;
        Bundle bundle = j0Var.n;
        fragment.f223c = bundle == null ? new Bundle() : bundle;
    }

    public k0(t tVar, ClassLoader classLoader, w wVar, j0 j0Var) {
        this.f1431a = tVar;
        Fragment a2 = wVar.a(j0Var.f1422b);
        this.f1432b = a2;
        Bundle bundle = j0Var.k;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        a2.j0(j0Var.k);
        a2.f225e = j0Var.f1423c;
        a2.m = j0Var.f1424d;
        a2.o = true;
        a2.v = j0Var.f1425e;
        a2.w = j0Var.f1426f;
        a2.x = j0Var.g;
        a2.A = j0Var.h;
        a2.l = j0Var.i;
        a2.z = j0Var.j;
        a2.y = j0Var.l;
        a2.N = e.b.values()[j0Var.m];
        Bundle bundle2 = j0Var.n;
        a2.f223c = bundle2 == null ? new Bundle() : bundle2;
        if (z.M(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + a2);
        }
    }

    public void a(ClassLoader classLoader) {
        Bundle bundle = this.f1432b.f223c;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f1432b;
        fragment.f224d = fragment.f223c.getSparseParcelableArray("android:view_state");
        Fragment fragment2 = this.f1432b;
        fragment2.h = fragment2.f223c.getString("android:target_state");
        Fragment fragment3 = this.f1432b;
        if (fragment3.h != null) {
            fragment3.i = fragment3.f223c.getInt("android:target_req_state", 0);
        }
        Fragment fragment4 = this.f1432b;
        Objects.requireNonNull(fragment4);
        fragment4.G = fragment4.f223c.getBoolean("android:user_visible_hint", true);
        Fragment fragment5 = this.f1432b;
        if (fragment5.G) {
            return;
        }
        fragment5.F = true;
    }

    public void b() {
        if (this.f1432b.E == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f1432b.E.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f1432b.f224d = sparseArray;
        }
    }
}
