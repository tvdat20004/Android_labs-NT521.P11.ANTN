package b.l.b;

import android.view.View;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public class e extends o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Fragment f1397a;

    public e(Fragment fragment) {
        this.f1397a = fragment;
    }

    @Override // b.l.b.o
    public View c(int i) {
        View view = this.f1397a.E;
        if (view != null) {
            return view.findViewById(i);
        }
        throw new IllegalStateException("Fragment " + this + " does not have a view");
    }

    @Override // b.l.b.o
    public boolean d() {
        return this.f1397a.E != null;
    }
}
