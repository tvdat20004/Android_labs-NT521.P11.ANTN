package b.t;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class l0 {

    /* renamed from: b, reason: collision with root package name */
    public View f1755b;

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f1754a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<b0> f1756c = new ArrayList<>();

    public l0(View view) {
        this.f1755b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return this.f1755b == l0Var.f1755b && this.f1754a.equals(l0Var.f1754a);
    }

    public int hashCode() {
        return this.f1754a.hashCode() + (this.f1755b.hashCode() * 31);
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("TransitionValues@");
        j.append(Integer.toHexString(hashCode()));
        j.append(":\n");
        String g = c.a.a.a.a.g(j.toString() + "    view = " + this.f1755b + "\n", "    values:");
        for (String str : this.f1754a.keySet()) {
            g = g + "    " + str + ": " + this.f1754a.get(str) + "\n";
        }
        return g;
    }
}
