package c.c.a.b.l;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.GridView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public final class j<S> extends c0<S> {
    public static final /* synthetic */ int e0 = 0;
    public int U;
    public c.c.a.b.l.f<S> V;
    public c.c.a.b.l.b W;
    public w X;
    public e Y;
    public c.c.a.b.l.e Z;
    public RecyclerView a0;
    public RecyclerView b0;
    public View c0;
    public View d0;

    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f3912b;

        public a(int i) {
            this.f3912b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = j.this.b0;
            int i = this.f3912b;
            if (recyclerView.y) {
                return;
            }
            RecyclerView.m mVar = recyclerView.n;
            if (mVar == null) {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                mVar.V0(recyclerView, recyclerView.h0, i);
            }
        }
    }

    public class b extends b.h.j.b {
        public b(j jVar) {
        }

        @Override // b.h.j.b
        public void d(View view, b.h.j.k0.b bVar) {
            this.f1254a.onInitializeAccessibilityNodeInfo(view, bVar.f1286a);
            bVar.n(null);
        }
    }

    public class c extends e0 {
        public final /* synthetic */ int G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.G = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        public void Y0(RecyclerView.x xVar, int[] iArr) {
            if (this.G == 0) {
                iArr[0] = j.this.b0.getWidth();
                iArr[1] = j.this.b0.getWidth();
            } else {
                iArr[0] = j.this.b0.getHeight();
                iArr[1] = j.this.b0.getHeight();
            }
        }
    }

    public class d implements f {
        public d() {
        }
    }

    public enum e {
        DAY,
        YEAR
    }

    public interface f {
    }

    @Override // androidx.fragment.app.Fragment
    public void I(Bundle bundle) {
        super.I(bundle);
        if (bundle == null) {
            bundle = this.f226f;
        }
        this.U = bundle.getInt("THEME_RES_ID_KEY");
        this.V = (c.c.a.b.l.f) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.W = (c.c.a.b.l.b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.X = (w) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        b.r.b.z zVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(i(), this.U);
        this.Z = new c.c.a.b.l.e(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        w wVar = this.W.f3881b;
        if (r.u0(contextThemeWrapper)) {
            i = R.layout.mtrl_calendar_vertical;
            i2 = 1;
        } else {
            i = R.layout.mtrl_calendar_horizontal;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        b.h.j.u.i(gridView, new b(this));
        gridView.setAdapter((ListAdapter) new i());
        gridView.setNumColumns(wVar.f3940f);
        gridView.setEnabled(false);
        this.b0 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.b0.setLayoutManager(new c(i(), i2, false, i2));
        this.b0.setTag("MONTHS_VIEW_GROUP_TAG");
        a0 a0Var = new a0(contextThemeWrapper, this.V, this.W, new d());
        this.b0.setAdapter(a0Var);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        RecyclerView recyclerView3 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
        this.a0 = recyclerView3;
        if (recyclerView3 != null) {
            recyclerView3.setHasFixedSize(true);
            this.a0.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.a0.setAdapter(new j0(this));
            this.a0.g(new k(this));
        }
        if (inflate.findViewById(R.id.month_navigation_fragment_toggle) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.month_navigation_fragment_toggle);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            b.h.j.u.i(materialButton, new l(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.c0 = inflate.findViewById(R.id.mtrl_calendar_year_selector_frame);
            this.d0 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            t0(e.DAY);
            materialButton.setText(this.X.f3937c);
            this.b0.h(new m(this, a0Var, materialButton));
            materialButton.setOnClickListener(new n(this));
            materialButton3.setOnClickListener(new o(this, a0Var));
            materialButton2.setOnClickListener(new p(this, a0Var));
        }
        if (!r.u0(contextThemeWrapper) && (recyclerView2 = (zVar = new b.r.b.z()).f1713a) != (recyclerView = this.b0)) {
            if (recyclerView2 != null) {
                zVar.b();
            }
            zVar.f1713a = recyclerView;
            if (recyclerView != null) {
                zVar.i();
                zVar.f1714b = new Scroller(zVar.f1713a.getContext(), new DecelerateInterpolator());
                zVar.k();
            }
        }
        this.b0.j0(a0Var.h(this.X));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void W(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.U);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.V);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.W);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.X);
    }

    public LinearLayoutManager q0() {
        return (LinearLayoutManager) this.b0.getLayoutManager();
    }

    public final void r0(int i) {
        this.b0.post(new a(i));
    }

    public void s0(w wVar) {
        RecyclerView recyclerView;
        int i;
        a0 a0Var = (a0) this.b0.getAdapter();
        int o = a0Var.f3877c.f3881b.o(wVar);
        int h = o - a0Var.h(this.X);
        boolean z = Math.abs(h) > 3;
        boolean z2 = h > 0;
        this.X = wVar;
        if (!z || !z2) {
            if (z) {
                recyclerView = this.b0;
                i = o + 3;
            }
            r0(o);
        }
        recyclerView = this.b0;
        i = o - 3;
        recyclerView.j0(i);
        r0(o);
    }

    public void t0(e eVar) {
        this.Y = eVar;
        if (eVar == e.YEAR) {
            this.a0.getLayoutManager().L0(((j0) this.a0.getAdapter()).g(this.X.f3939e));
            this.c0.setVisibility(0);
            this.d0.setVisibility(8);
        } else if (eVar == e.DAY) {
            this.c0.setVisibility(8);
            this.d0.setVisibility(0);
            s0(this.X);
        }
    }
}
