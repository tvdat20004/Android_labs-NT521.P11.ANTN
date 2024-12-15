package b.b.c;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import b.b.i.c1;
import b.b.i.p2;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class r0 extends a implements ActionBarOverlayLayout.d {

    /* renamed from: a, reason: collision with root package name */
    public Context f479a;

    /* renamed from: b, reason: collision with root package name */
    public Context f480b;

    /* renamed from: c, reason: collision with root package name */
    public ActionBarOverlayLayout f481c;

    /* renamed from: d, reason: collision with root package name */
    public ActionBarContainer f482d;

    /* renamed from: e, reason: collision with root package name */
    public c1 f483e;

    /* renamed from: f, reason: collision with root package name */
    public ActionBarContextView f484f;
    public View g;
    public boolean h;
    public q0 i;
    public b.b.h.b j;
    public b.b.h.a k;
    public boolean l;
    public ArrayList<b> m;
    public boolean n;
    public int o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public b.b.h.l t;
    public boolean u;
    public boolean v;
    public final b.h.j.z w;
    public final b.h.j.z x;
    public final p0 y;
    public static final Interpolator z = new AccelerateInterpolator();
    public static final Interpolator A = new DecelerateInterpolator();

    public r0(Activity activity, boolean z2) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.o = 0;
        this.p = true;
        this.s = true;
        this.w = new n0(this);
        this.x = new o0(this);
        this.y = new p0(this);
        View decorView = activity.getWindow().getDecorView();
        f(decorView);
        if (z2) {
            return;
        }
        this.g = decorView.findViewById(R.id.content);
    }

    public r0(Dialog dialog) {
        new ArrayList();
        this.m = new ArrayList<>();
        this.o = 0;
        this.p = true;
        this.s = true;
        this.w = new n0(this);
        this.x = new o0(this);
        this.y = new p0(this);
        f(dialog.getWindow().getDecorView());
    }

    @Override // b.b.c.a
    public void a(boolean z2) {
        if (z2 == this.l) {
            return;
        }
        this.l = z2;
        int size = this.m.size();
        for (int i = 0; i < size; i++) {
            this.m.get(i).a(z2);
        }
    }

    @Override // b.b.c.a
    public Context b() {
        if (this.f480b == null) {
            TypedValue typedValue = new TypedValue();
            this.f479a.getTheme().resolveAttribute(razi.apa.ctf.videoPlayer.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f480b = new ContextThemeWrapper(this.f479a, i);
            } else {
                this.f480b = this.f479a;
            }
        }
        return this.f480b;
    }

    @Override // b.b.c.a
    public void c(boolean z2) {
        int i = z2 ? 4 : 0;
        p2 p2Var = (p2) this.f483e;
        int i2 = p2Var.f761b;
        this.h = true;
        p2Var.b((i & 4) | ((-5) & i2));
    }

    @Override // b.b.c.a
    public void d(CharSequence charSequence) {
        p2 p2Var = (p2) this.f483e;
        if (p2Var.h) {
            return;
        }
        p2Var.i = charSequence;
        if ((p2Var.f761b & 8) != 0) {
            p2Var.f760a.setTitle(charSequence);
        }
    }

    public void e(boolean z2) {
        b.h.j.y c2;
        b.h.j.y e2;
        if (z2) {
            if (!this.r) {
                this.r = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f481c;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                h(false);
            }
        } else if (this.r) {
            this.r = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f481c;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            h(false);
        }
        ActionBarContainer actionBarContainer = this.f482d;
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        if (!actionBarContainer.isLaidOut()) {
            if (z2) {
                ((p2) this.f483e).f760a.setVisibility(4);
                this.f484f.setVisibility(0);
                return;
            } else {
                ((p2) this.f483e).f760a.setVisibility(0);
                this.f484f.setVisibility(8);
                return;
            }
        }
        if (z2) {
            e2 = ((p2) this.f483e).c(4, 100L);
            c2 = this.f484f.e(0, 200L);
        } else {
            c2 = ((p2) this.f483e).c(0, 200L);
            e2 = this.f484f.e(8, 100L);
        }
        b.b.h.l lVar = new b.b.h.l();
        lVar.f557a.add(e2);
        View view = e2.f1319a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = c2.f1319a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        lVar.f557a.add(c2);
        lVar.b();
    }

    public final void f(View view) {
        c1 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(razi.apa.ctf.videoPlayer.R.id.decor_content_parent);
        this.f481c = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(razi.apa.ctf.videoPlayer.R.id.action_bar);
        if (findViewById instanceof c1) {
            wrapper = (c1) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                StringBuilder j = c.a.a.a.a.j("Can't make a decor toolbar out of ");
                j.append(findViewById != null ? findViewById.getClass().getSimpleName() : "null");
                throw new IllegalStateException(j.toString());
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f483e = wrapper;
        this.f484f = (ActionBarContextView) view.findViewById(razi.apa.ctf.videoPlayer.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(razi.apa.ctf.videoPlayer.R.id.action_bar_container);
        this.f482d = actionBarContainer;
        c1 c1Var = this.f483e;
        if (c1Var == null || this.f484f == null || actionBarContainer == null) {
            throw new IllegalStateException(r0.class.getSimpleName() + " can only be used with a compatible window decor layout");
        }
        Context a2 = ((p2) c1Var).a();
        this.f479a = a2;
        if ((((p2) this.f483e).f761b & 4) != 0) {
            this.h = true;
        }
        int i = a2.getApplicationInfo().targetSdkVersion;
        Objects.requireNonNull((p2) this.f483e);
        g(a2.getResources().getBoolean(razi.apa.ctf.videoPlayer.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f479a.obtainStyledAttributes(null, b.b.b.f404a, razi.apa.ctf.videoPlayer.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f481c;
            if (!actionBarOverlayLayout2.i) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.v = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f482d;
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            actionBarContainer2.setElevation(dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    public final void g(boolean z2) {
        this.n = z2;
        if (z2) {
            this.f482d.setTabContainer(null);
            p2 p2Var = (p2) this.f483e;
            View view = p2Var.f762c;
            if (view != null) {
                ViewParent parent = view.getParent();
                Toolbar toolbar = p2Var.f760a;
                if (parent == toolbar) {
                    toolbar.removeView(p2Var.f762c);
                }
            }
            p2Var.f762c = null;
        } else {
            p2 p2Var2 = (p2) this.f483e;
            View view2 = p2Var2.f762c;
            if (view2 != null) {
                ViewParent parent2 = view2.getParent();
                Toolbar toolbar2 = p2Var2.f760a;
                if (parent2 == toolbar2) {
                    toolbar2.removeView(p2Var2.f762c);
                }
            }
            p2Var2.f762c = null;
            this.f482d.setTabContainer(null);
        }
        Objects.requireNonNull(this.f483e);
        ((p2) this.f483e).f760a.setCollapsible(false);
        this.f481c.setHasNonEmbeddedTabs(false);
    }

    public final void h(boolean z2) {
        View view;
        View view2;
        View view3;
        if (!(this.r || !this.q)) {
            if (this.s) {
                this.s = false;
                b.b.h.l lVar = this.t;
                if (lVar != null) {
                    lVar.a();
                }
                if (this.o != 0 || (!this.u && !z2)) {
                    this.w.a(null);
                    return;
                }
                this.f482d.setAlpha(1.0f);
                this.f482d.setTransitioning(true);
                b.b.h.l lVar2 = new b.b.h.l();
                float f2 = -this.f482d.getHeight();
                if (z2) {
                    this.f482d.getLocationInWindow(new int[]{0, 0});
                    f2 -= r9[1];
                }
                b.h.j.y a2 = b.h.j.u.a(this.f482d);
                a2.g(f2);
                a2.f(this.y);
                if (!lVar2.f561e) {
                    lVar2.f557a.add(a2);
                }
                if (this.p && (view = this.g) != null) {
                    b.h.j.y a3 = b.h.j.u.a(view);
                    a3.g(f2);
                    if (!lVar2.f561e) {
                        lVar2.f557a.add(a3);
                    }
                }
                Interpolator interpolator = z;
                boolean z3 = lVar2.f561e;
                if (!z3) {
                    lVar2.f559c = interpolator;
                }
                if (!z3) {
                    lVar2.f558b = 250L;
                }
                b.h.j.z zVar = this.w;
                if (!z3) {
                    lVar2.f560d = zVar;
                }
                this.t = lVar2;
                lVar2.b();
                return;
            }
            return;
        }
        if (this.s) {
            return;
        }
        this.s = true;
        b.b.h.l lVar3 = this.t;
        if (lVar3 != null) {
            lVar3.a();
        }
        this.f482d.setVisibility(0);
        if (this.o == 0 && (this.u || z2)) {
            this.f482d.setTranslationY(0.0f);
            float f3 = -this.f482d.getHeight();
            if (z2) {
                this.f482d.getLocationInWindow(new int[]{0, 0});
                f3 -= r9[1];
            }
            this.f482d.setTranslationY(f3);
            b.b.h.l lVar4 = new b.b.h.l();
            b.h.j.y a4 = b.h.j.u.a(this.f482d);
            a4.g(0.0f);
            a4.f(this.y);
            if (!lVar4.f561e) {
                lVar4.f557a.add(a4);
            }
            if (this.p && (view3 = this.g) != null) {
                view3.setTranslationY(f3);
                b.h.j.y a5 = b.h.j.u.a(this.g);
                a5.g(0.0f);
                if (!lVar4.f561e) {
                    lVar4.f557a.add(a5);
                }
            }
            Interpolator interpolator2 = A;
            boolean z4 = lVar4.f561e;
            if (!z4) {
                lVar4.f559c = interpolator2;
            }
            if (!z4) {
                lVar4.f558b = 250L;
            }
            b.h.j.z zVar2 = this.x;
            if (!z4) {
                lVar4.f560d = zVar2;
            }
            this.t = lVar4;
            lVar4.b();
        } else {
            this.f482d.setAlpha(1.0f);
            this.f482d.setTranslationY(0.0f);
            if (this.p && (view2 = this.g) != null) {
                view2.setTranslationY(0.0f);
            }
            this.x.a(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f481c;
        if (actionBarOverlayLayout != null) {
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            actionBarOverlayLayout.requestApplyInsets();
        }
    }
}
