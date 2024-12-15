package c.c.a.b.l;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class u<S> extends c0<S> {
    public f<S> U;
    public b V;

    public class a extends b0<S> {
        public a() {
        }

        @Override // c.c.a.b.l.b0
        public void a(S s) {
            Iterator<b0<S>> it = u.this.T.iterator();
            while (it.hasNext()) {
                it.next().a(s);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void I(Bundle bundle) {
        super.I(bundle);
        if (bundle == null) {
            bundle = this.f226f;
        }
        this.U = (f) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.V = (b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.U.g(layoutInflater, viewGroup, bundle, this.V, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void W(Bundle bundle) {
        bundle.putParcelable("DATE_SELECTOR_KEY", this.U);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.V);
    }
}
