package b.b.c;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import b.b.h.m.l;
import b.b.i.b1;
import b.b.i.l2;
import b.b.i.p2;
import b.b.i.v2;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class f0 extends n implements l.a, LayoutInflater.Factory2 {
    public static final b.e.i<String, Integer> Z = new b.e.i<>();
    public static final int[] a0 = {R.attr.windowBackground};
    public static final boolean b0 = !"robolectric".equals(Build.FINGERPRINT);
    public static final boolean c0 = true;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public d0[] F;
    public d0 G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public boolean L;
    public int M;
    public int N;
    public boolean O;
    public boolean P;
    public a0 Q;
    public a0 R;
    public boolean S;
    public int T;
    public boolean V;
    public Rect W;
    public Rect X;
    public j0 Y;

    /* renamed from: d, reason: collision with root package name */
    public final Object f429d;

    /* renamed from: e, reason: collision with root package name */
    public final Context f430e;

    /* renamed from: f, reason: collision with root package name */
    public Window f431f;
    public x g;
    public final m h;
    public a i;
    public MenuInflater j;
    public CharSequence k;
    public b1 l;
    public u m;
    public e0 n;
    public b.b.h.b o;
    public ActionBarContextView p;
    public PopupWindow q;
    public Runnable r;
    public boolean t;
    public ViewGroup u;
    public TextView v;
    public View w;
    public boolean x;
    public boolean y;
    public boolean z;
    public b.h.j.y s = null;
    public final Runnable U = new o(this);

    public f0(Context context, Window window, m mVar, Object obj) {
        b.e.i<String, Integer> iVar;
        Integer orDefault;
        l lVar;
        this.M = -100;
        this.f430e = context;
        this.h = mVar;
        this.f429d = obj;
        if (obj instanceof Dialog) {
            while (context != null) {
                if (!(context instanceof l)) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    lVar = (l) context;
                    break;
                }
            }
            lVar = null;
            if (lVar != null) {
                this.M = ((f0) lVar.l()).M;
            }
        }
        if (this.M == -100 && (orDefault = (iVar = Z).getOrDefault(this.f429d.getClass().getName(), null)) != null) {
            this.M = orDefault.intValue();
            iVar.remove(this.f429d.getClass().getName());
        }
        if (window != null) {
            q(window);
        }
        b.b.i.u.e();
    }

    public d0 A(Menu menu) {
        d0[] d0VarArr = this.F;
        int length = d0VarArr != null ? d0VarArr.length : 0;
        for (int i = 0; i < length; i++) {
            d0 d0Var = d0VarArr[i];
            if (d0Var != null && d0Var.h == menu) {
                return d0Var;
            }
        }
        return null;
    }

    public final a0 B(Context context) {
        if (this.Q == null) {
            if (m0.f463d == null) {
                Context applicationContext = context.getApplicationContext();
                m0.f463d = new m0(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.Q = new b0(this, m0.f463d);
        }
        return this.Q;
    }

    public d0 C(int i) {
        d0[] d0VarArr = this.F;
        if (d0VarArr == null || d0VarArr.length <= i) {
            d0[] d0VarArr2 = new d0[i + 1];
            if (d0VarArr != null) {
                System.arraycopy(d0VarArr, 0, d0VarArr2, 0, d0VarArr.length);
            }
            this.F = d0VarArr2;
            d0VarArr = d0VarArr2;
        }
        d0 d0Var = d0VarArr[i];
        if (d0Var != null) {
            return d0Var;
        }
        d0 d0Var2 = new d0(i);
        d0VarArr[i] = d0Var2;
        return d0Var2;
    }

    public final Window.Callback D() {
        return this.f431f.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void E() {
        /*
            r3 = this;
            r3.y()
            boolean r0 = r3.z
            if (r0 == 0) goto L3c
            b.b.c.a r0 = r3.i
            if (r0 == 0) goto Lc
            goto L3c
        Lc:
            java.lang.Object r0 = r3.f429d
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1e
            b.b.c.r0 r0 = new b.b.c.r0
            java.lang.Object r1 = r3.f429d
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.A
            r0.<init>(r1, r2)
            goto L2b
        L1e:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2d
            b.b.c.r0 r0 = new b.b.c.r0
            java.lang.Object r1 = r3.f429d
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
        L2b:
            r3.i = r0
        L2d:
            b.b.c.a r0 = r3.i
            if (r0 == 0) goto L3c
            boolean r1 = r3.V
            b.b.c.r0 r0 = (b.b.c.r0) r0
            boolean r2 = r0.h
            if (r2 != 0) goto L3c
            r0.c(r1)
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.c.f0.E():void");
    }

    public final void F(int i) {
        this.T = (1 << i) | this.T;
        if (this.S) {
            return;
        }
        View decorView = this.f431f.getDecorView();
        Runnable runnable = this.U;
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        decorView.postOnAnimation(runnable);
        this.S = true;
    }

    public int G(Context context, int i) {
        a0 B;
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    if (this.R == null) {
                        this.R = new y(this, context);
                    }
                    B = this.R;
                }
            } else {
                if (((UiModeManager) context.getApplicationContext().getSystemService(UiModeManager.class)).getNightMode() == 0) {
                    return -1;
                }
                B = B(context);
            }
            return B.c();
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:93:0x0154, code lost:
    
        if (r15 != null) goto L79;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(b.b.c.d0 r14, android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.c.f0.H(b.b.c.d0, android.view.KeyEvent):void");
    }

    public final boolean I(d0 d0Var, int i, KeyEvent keyEvent, int i2) {
        b.b.h.m.l lVar;
        boolean z = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((d0Var.k || J(d0Var, keyEvent)) && (lVar = d0Var.h) != null) {
            z = lVar.performShortcut(i, keyEvent, i2);
        }
        if (z && (i2 & 1) == 0 && this.l == null) {
            t(d0Var, true);
        }
        return z;
    }

    public final boolean J(d0 d0Var, KeyEvent keyEvent) {
        b1 b1Var;
        b1 b1Var2;
        Resources.Theme theme;
        b1 b1Var3;
        b1 b1Var4;
        if (this.L) {
            return false;
        }
        if (d0Var.k) {
            return true;
        }
        d0 d0Var2 = this.G;
        if (d0Var2 != null && d0Var2 != d0Var) {
            t(d0Var2, false);
        }
        Window.Callback D = D();
        if (D != null) {
            d0Var.g = D.onCreatePanelView(d0Var.f418a);
        }
        int i = d0Var.f418a;
        boolean z = i == 0 || i == 108;
        if (z && (b1Var4 = this.l) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) b1Var4;
            actionBarOverlayLayout.n();
            ((p2) actionBarOverlayLayout.f76f).m = true;
        }
        if (d0Var.g == null) {
            b.b.h.m.l lVar = d0Var.h;
            if (lVar == null || d0Var.p) {
                if (lVar == null) {
                    Context context = this.f430e;
                    int i2 = d0Var.f418a;
                    if ((i2 == 0 || i2 == 108) && this.l != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(razi.apa.ctf.videoPlayer.R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(razi.apa.ctf.videoPlayer.R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(razi.apa.ctf.videoPlayer.R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            b.b.h.d dVar = new b.b.h.d(context, 0);
                            dVar.getTheme().setTo(theme);
                            context = dVar;
                        }
                    }
                    b.b.h.m.l lVar2 = new b.b.h.m.l(context);
                    lVar2.f608e = this;
                    d0Var.a(lVar2);
                    if (d0Var.h == null) {
                        return false;
                    }
                }
                if (z && (b1Var2 = this.l) != null) {
                    if (this.m == null) {
                        this.m = new u(this);
                    }
                    ((ActionBarOverlayLayout) b1Var2).o(d0Var.h, this.m);
                }
                d0Var.h.A();
                if (!D.onCreatePanelMenu(d0Var.f418a, d0Var.h)) {
                    d0Var.a(null);
                    if (z && (b1Var = this.l) != null) {
                        ((ActionBarOverlayLayout) b1Var).o(null, this.m);
                    }
                    return false;
                }
                d0Var.p = false;
            }
            d0Var.h.A();
            Bundle bundle = d0Var.q;
            if (bundle != null) {
                d0Var.h.v(bundle);
                d0Var.q = null;
            }
            if (!D.onPreparePanel(0, d0Var.g, d0Var.h)) {
                if (z && (b1Var3 = this.l) != null) {
                    ((ActionBarOverlayLayout) b1Var3).o(null, this.m);
                }
                d0Var.h.z();
                return false;
            }
            boolean z2 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            d0Var.n = z2;
            d0Var.h.setQwertyMode(z2);
            d0Var.h.z();
        }
        d0Var.k = true;
        d0Var.l = false;
        this.G = d0Var;
        return true;
    }

    public final boolean K() {
        ViewGroup viewGroup;
        if (this.t && (viewGroup = this.u) != null) {
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            if (viewGroup.isLaidOut()) {
                return true;
            }
        }
        return false;
    }

    public final void L() {
        if (this.t) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final int M(b.h.j.j0 j0Var, Rect rect) {
        boolean z;
        boolean z2;
        Context context;
        int i;
        int d2 = j0Var.d();
        ActionBarContextView actionBarContextView = this.p;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.p.getLayoutParams();
            if (this.p.isShown()) {
                if (this.W == null) {
                    this.W = new Rect();
                    this.X = new Rect();
                }
                Rect rect2 = this.W;
                Rect rect3 = this.X;
                rect2.set(j0Var.b(), j0Var.d(), j0Var.c(), j0Var.a());
                v2.a(this.u, rect2, rect3);
                int i2 = rect2.top;
                int i3 = rect2.left;
                int i4 = rect2.right;
                ViewGroup viewGroup = this.u;
                WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
                b.h.j.j0 h = b.h.j.j0.h(viewGroup.getRootWindowInsets());
                int b2 = h.b();
                int c2 = h.c();
                if (marginLayoutParams.topMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i4) {
                    z2 = false;
                } else {
                    marginLayoutParams.topMargin = i2;
                    marginLayoutParams.leftMargin = i3;
                    marginLayoutParams.rightMargin = i4;
                    z2 = true;
                }
                if (i2 <= 0 || this.w != null) {
                    View view = this.w;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i5 = marginLayoutParams2.height;
                        int i6 = marginLayoutParams.topMargin;
                        if (i5 != i6 || marginLayoutParams2.leftMargin != b2 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i6;
                            marginLayoutParams2.leftMargin = b2;
                            marginLayoutParams2.rightMargin = c2;
                            this.w.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f430e);
                    this.w = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b2;
                    layoutParams.rightMargin = c2;
                    this.u.addView(this.w, -1, layoutParams);
                }
                View view3 = this.w;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    View view4 = this.w;
                    if ((view4.getWindowSystemUiVisibility() & 8192) != 0) {
                        context = this.f430e;
                        i = razi.apa.ctf.videoPlayer.R.color.abc_decor_view_status_guard_light;
                    } else {
                        context = this.f430e;
                        i = razi.apa.ctf.videoPlayer.R.color.abc_decor_view_status_guard;
                    }
                    Object obj = b.h.b.b.f1117a;
                    view4.setBackgroundColor(context.getColor(i));
                }
                if (!this.B && z) {
                    d2 = 0;
                }
                r4 = z2;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z = false;
            } else {
                r4 = false;
                z = false;
            }
            if (r4) {
                this.p.setLayoutParams(marginLayoutParams);
            }
        }
        View view5 = this.w;
        if (view5 != null) {
            view5.setVisibility(z ? 0 : 8);
        }
        return d2;
    }

    @Override // b.b.h.m.l.a
    public boolean a(b.b.h.m.l lVar, MenuItem menuItem) {
        d0 A;
        Window.Callback D = D();
        if (D == null || this.L || (A = A(lVar.k())) == null) {
            return false;
        }
        return D.onMenuItemSelected(A.f418a, menuItem);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
    
        if (r6 == false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    @Override // b.b.h.m.l.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(b.b.h.m.l r6) {
        /*
            r5 = this;
            b.b.i.b1 r6 = r5.l
            r0 = 1
            r1 = 0
            if (r6 == 0) goto Lb7
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            boolean r6 = r6.h()
            if (r6 == 0) goto Lb7
            android.content.Context r6 = r5.f430e
            android.view.ViewConfiguration r6 = android.view.ViewConfiguration.get(r6)
            boolean r6 = r6.hasPermanentMenuKey()
            if (r6 == 0) goto L49
            b.b.i.b1 r6 = r5.l
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.n()
            b.b.i.c1 r6 = r6.f76f
            b.b.i.p2 r6 = (b.b.i.p2) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f760a
            androidx.appcompat.widget.ActionMenuView r6 = r6.f123b
            if (r6 == 0) goto L46
            b.b.i.m r6 = r6.u
            if (r6 == 0) goto L41
            b.b.i.f r2 = r6.x
            if (r2 != 0) goto L3c
            boolean r6 = r6.p()
            if (r6 == 0) goto L3a
            goto L3c
        L3a:
            r6 = r1
            goto L3d
        L3c:
            r6 = r0
        L3d:
            if (r6 == 0) goto L41
            r6 = r0
            goto L42
        L41:
            r6 = r1
        L42:
            if (r6 == 0) goto L46
            r6 = r0
            goto L47
        L46:
            r6 = r1
        L47:
            if (r6 == 0) goto Lb7
        L49:
            android.view.Window$Callback r6 = r5.D()
            b.b.i.b1 r2 = r5.l
            androidx.appcompat.widget.ActionBarOverlayLayout r2 = (androidx.appcompat.widget.ActionBarOverlayLayout) r2
            boolean r2 = r2.m()
            r3 = 108(0x6c, float:1.51E-43)
            if (r2 == 0) goto L6e
            b.b.i.b1 r0 = r5.l
            androidx.appcompat.widget.ActionBarOverlayLayout r0 = (androidx.appcompat.widget.ActionBarOverlayLayout) r0
            r0.j()
            boolean r0 = r5.L
            if (r0 != 0) goto Lc4
            b.b.c.d0 r0 = r5.C(r1)
            b.b.h.m.l r0 = r0.h
            r6.onPanelClosed(r3, r0)
            goto Lc4
        L6e:
            if (r6 == 0) goto Lc4
            boolean r2 = r5.L
            if (r2 != 0) goto Lc4
            boolean r2 = r5.S
            if (r2 == 0) goto L8d
            int r2 = r5.T
            r0 = r0 & r2
            if (r0 == 0) goto L8d
            android.view.Window r0 = r5.f431f
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r2 = r5.U
            r0.removeCallbacks(r2)
            java.lang.Runnable r0 = r5.U
            r0.run()
        L8d:
            b.b.c.d0 r0 = r5.C(r1)
            b.b.h.m.l r2 = r0.h
            if (r2 == 0) goto Lc4
            boolean r4 = r0.p
            if (r4 != 0) goto Lc4
            android.view.View r4 = r0.g
            boolean r1 = r6.onPreparePanel(r1, r4, r2)
            if (r1 == 0) goto Lc4
            b.b.h.m.l r0 = r0.h
            r6.onMenuOpened(r3, r0)
            b.b.i.b1 r6 = r5.l
            androidx.appcompat.widget.ActionBarOverlayLayout r6 = (androidx.appcompat.widget.ActionBarOverlayLayout) r6
            r6.n()
            b.b.i.c1 r6 = r6.f76f
            b.b.i.p2 r6 = (b.b.i.p2) r6
            androidx.appcompat.widget.Toolbar r6 = r6.f760a
            r6.u()
            goto Lc4
        Lb7:
            b.b.c.d0 r6 = r5.C(r1)
            r6.o = r0
            r5.t(r6, r1)
            r0 = 0
            r5.H(r6, r0)
        Lc4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.c.f0.b(b.b.h.m.l):void");
    }

    @Override // b.b.c.n
    public void c(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        ((ViewGroup) this.u.findViewById(R.id.content)).addView(view, layoutParams);
        this.g.f491b.onContentChanged();
    }

    @Override // b.b.c.n
    public void d() {
        LayoutInflater from = LayoutInflater.from(this.f430e);
        if (from.getFactory() == null) {
            from.setFactory2(this);
        } else {
            if (from.getFactory2() instanceof f0) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    @Override // b.b.c.n
    public void e() {
        E();
        a aVar = this.i;
        F(0);
    }

    @Override // b.b.c.n
    public void f(Bundle bundle) {
        this.I = true;
        p(false);
        z();
        Object obj = this.f429d;
        if (obj instanceof Activity) {
            String str = null;
            try {
                Activity activity = (Activity) obj;
                try {
                    str = b.h.b.h.r(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e2) {
                    throw new IllegalArgumentException(e2);
                }
            } catch (IllegalArgumentException unused) {
            }
            if (str != null) {
                a aVar = this.i;
                if (aVar == null) {
                    this.V = true;
                } else {
                    r0 r0Var = (r0) aVar;
                    if (!r0Var.h) {
                        r0Var.c(true);
                    }
                }
            }
            synchronized (n.f468c) {
                n.i(this);
                n.f467b.add(new WeakReference<>(this));
            }
        }
        this.J = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // b.b.c.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g() {
        /*
            r3 = this;
            b.e.i<java.lang.String, java.lang.Integer> r0 = b.b.c.f0.Z
            java.lang.Object r1 = r3.f429d
            boolean r1 = r1 instanceof android.app.Activity
            if (r1 == 0) goto L13
            java.lang.Object r1 = b.b.c.n.f468c
            monitor-enter(r1)
            b.b.c.n.i(r3)     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            goto L13
        L10:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
        L13:
            boolean r1 = r3.S
            if (r1 == 0) goto L22
            android.view.Window r1 = r3.f431f
            android.view.View r1 = r1.getDecorView()
            java.lang.Runnable r2 = r3.U
            r1.removeCallbacks(r2)
        L22:
            r1 = 0
            r3.K = r1
            r1 = 1
            r3.L = r1
            int r1 = r3.M
            r2 = -100
            if (r1 == r2) goto L50
            java.lang.Object r1 = r3.f429d
            boolean r2 = r1 instanceof android.app.Activity
            if (r2 == 0) goto L50
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r1 = r1.isChangingConfigurations()
            if (r1 == 0) goto L50
            java.lang.Object r1 = r3.f429d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.M
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5d
        L50:
            java.lang.Object r1 = r3.f429d
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5d:
            b.b.c.a r0 = r3.i
            if (r0 == 0) goto L64
            java.util.Objects.requireNonNull(r0)
        L64:
            b.b.c.a0 r0 = r3.Q
            if (r0 == 0) goto L6b
            r0.a()
        L6b:
            b.b.c.a0 r0 = r3.R
            if (r0 == 0) goto L72
            r0.a()
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.c.f0.g():void");
    }

    @Override // b.b.c.n
    public void h() {
        this.K = false;
        E();
        a aVar = this.i;
        if (aVar != null) {
            r0 r0Var = (r0) aVar;
            r0Var.u = false;
            b.b.h.l lVar = r0Var.t;
            if (lVar != null) {
                lVar.a();
            }
        }
    }

    @Override // b.b.c.n
    public boolean j(int i) {
        if (i == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            i = 108;
        } else if (i == 9) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            i = 109;
        }
        if (this.D && i == 108) {
            return false;
        }
        if (this.z && i == 1) {
            this.z = false;
        }
        if (i == 1) {
            L();
            this.D = true;
            return true;
        }
        if (i == 2) {
            L();
            this.x = true;
            return true;
        }
        if (i == 5) {
            L();
            this.y = true;
            return true;
        }
        if (i == 10) {
            L();
            this.B = true;
            return true;
        }
        if (i == 108) {
            L();
            this.z = true;
            return true;
        }
        if (i != 109) {
            return this.f431f.requestFeature(i);
        }
        L();
        this.A = true;
        return true;
    }

    @Override // b.b.c.n
    public void k(int i) {
        y();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f430e).inflate(i, viewGroup);
        this.g.f491b.onContentChanged();
    }

    @Override // b.b.c.n
    public void l(View view) {
        y();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.g.f491b.onContentChanged();
    }

    @Override // b.b.c.n
    public void m(View view, ViewGroup.LayoutParams layoutParams) {
        y();
        ViewGroup viewGroup = (ViewGroup) this.u.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.g.f491b.onContentChanged();
    }

    @Override // b.b.c.n
    public final void n(CharSequence charSequence) {
        this.k = charSequence;
        b1 b1Var = this.l;
        if (b1Var != null) {
            b1Var.setWindowTitle(charSequence);
            return;
        }
        a aVar = this.i;
        if (aVar != null) {
            aVar.d(charSequence);
            return;
        }
        TextView textView = this.v;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public boolean o() {
        return p(true);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:46:0x01ef
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1179)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v8 */
    @Override // android.view.LayoutInflater.Factory2
    public final android.view.View onCreateView(android.view.View r7, java.lang.String r8, android.content.Context r9, android.util.AttributeSet r10) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.c.f0.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:109:0x0249, code lost:
    
        if ((((b.n.j) ((b.n.h) r0).g()).f1539b.compareTo(b.n.e.b.STARTED) >= 0) != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0250, code lost:
    
        r0.onConfigurationChanged(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x024e, code lost:
    
        if (r19.K != false) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0145, code lost:
    
        if (r0 != false) goto L81;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x014f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean p(boolean r20) {
        /*
            Method dump skipped, instructions count: 659
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.c.f0.p(boolean):boolean");
    }

    public final void q(Window window) {
        if (this.f431f != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof x) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        x xVar = new x(this, callback);
        this.g = xVar;
        window.setCallback(xVar);
        l2 q = l2.q(this.f430e, null, a0);
        Drawable h = q.h(0);
        if (h != null) {
            window.setBackgroundDrawable(h);
        }
        q.f730b.recycle();
        this.f431f = window;
    }

    public void r(int i, d0 d0Var, Menu menu) {
        if (menu == null && d0Var != null) {
            menu = d0Var.h;
        }
        if ((d0Var == null || d0Var.m) && !this.L) {
            this.g.f491b.onPanelClosed(i, menu);
        }
    }

    public void s(b.b.h.m.l lVar) {
        b.b.i.m mVar;
        if (this.E) {
            return;
        }
        this.E = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.l;
        actionBarOverlayLayout.n();
        ActionMenuView actionMenuView = ((p2) actionBarOverlayLayout.f76f).f760a.f123b;
        if (actionMenuView != null && (mVar = actionMenuView.u) != null) {
            mVar.b();
        }
        Window.Callback D = D();
        if (D != null && !this.L) {
            D.onPanelClosed(108, lVar);
        }
        this.E = false;
    }

    public void t(d0 d0Var, boolean z) {
        ViewGroup viewGroup;
        b1 b1Var;
        if (z && d0Var.f418a == 0 && (b1Var = this.l) != null && ((ActionBarOverlayLayout) b1Var).m()) {
            s(d0Var.h);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f430e.getSystemService("window");
        if (windowManager != null && d0Var.m && (viewGroup = d0Var.f422e) != null) {
            windowManager.removeView(viewGroup);
            if (z) {
                r(d0Var.f418a, d0Var, null);
            }
        }
        d0Var.k = false;
        d0Var.l = false;
        d0Var.m = false;
        d0Var.f423f = null;
        d0Var.o = true;
        if (this.G == d0Var) {
            this.G = null;
        }
    }

    public final Configuration u(Context context, int i, Configuration configuration) {
        int i2 = i != 1 ? i != 2 ? context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        return configuration2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0145, code lost:
    
        if (r7 == false) goto L103;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean v(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.c.f0.v(android.view.KeyEvent):boolean");
    }

    public void w(int i) {
        d0 C = C(i);
        if (C.h != null) {
            Bundle bundle = new Bundle();
            C.h.w(bundle);
            if (bundle.size() > 0) {
                C.q = bundle;
            }
            C.h.A();
            C.h.clear();
        }
        C.p = true;
        C.o = true;
        if ((i == 108 || i == 0) && this.l != null) {
            d0 C2 = C(0);
            C2.k = false;
            J(C2, null);
        }
    }

    public void x() {
        b.h.j.y yVar = this.s;
        if (yVar != null) {
            yVar.b();
        }
    }

    public final void y() {
        ViewGroup viewGroup;
        int[] iArr = b.b.b.j;
        if (this.t) {
            return;
        }
        TypedArray obtainStyledAttributes = this.f430e.obtainStyledAttributes(iArr);
        if (!obtainStyledAttributes.hasValue(115)) {
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (obtainStyledAttributes.getBoolean(124, false)) {
            j(1);
        } else if (obtainStyledAttributes.getBoolean(115, false)) {
            j(108);
        }
        if (obtainStyledAttributes.getBoolean(116, false)) {
            j(109);
        }
        if (obtainStyledAttributes.getBoolean(117, false)) {
            j(10);
        }
        this.C = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        z();
        this.f431f.getDecorView();
        LayoutInflater from = LayoutInflater.from(this.f430e);
        if (this.D) {
            viewGroup = (ViewGroup) from.inflate(this.B ? razi.apa.ctf.videoPlayer.R.layout.abc_screen_simple_overlay_action_mode : razi.apa.ctf.videoPlayer.R.layout.abc_screen_simple, (ViewGroup) null);
        } else if (this.C) {
            viewGroup = (ViewGroup) from.inflate(razi.apa.ctf.videoPlayer.R.layout.abc_dialog_title_material, (ViewGroup) null);
            this.A = false;
            this.z = false;
        } else if (this.z) {
            TypedValue typedValue = new TypedValue();
            this.f430e.getTheme().resolveAttribute(razi.apa.ctf.videoPlayer.R.attr.actionBarTheme, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new b.b.h.d(this.f430e, typedValue.resourceId) : this.f430e).inflate(razi.apa.ctf.videoPlayer.R.layout.abc_screen_toolbar, (ViewGroup) null);
            b1 b1Var = (b1) viewGroup.findViewById(razi.apa.ctf.videoPlayer.R.id.decor_content_parent);
            this.l = b1Var;
            b1Var.setWindowCallback(D());
            if (this.A) {
                ((ActionBarOverlayLayout) this.l).l(109);
            }
            if (this.x) {
                ((ActionBarOverlayLayout) this.l).l(2);
            }
            if (this.y) {
                ((ActionBarOverlayLayout) this.l).l(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            StringBuilder j = c.a.a.a.a.j("AppCompat does not support the current theme features: { windowActionBar: ");
            j.append(this.z);
            j.append(", windowActionBarOverlay: ");
            j.append(this.A);
            j.append(", android:windowIsFloating: ");
            j.append(this.C);
            j.append(", windowActionModeOverlay: ");
            j.append(this.B);
            j.append(", windowNoTitle: ");
            j.append(this.D);
            j.append(" }");
            throw new IllegalArgumentException(j.toString());
        }
        b.h.j.u.j(viewGroup, new p(this));
        if (this.l == null) {
            this.v = (TextView) viewGroup.findViewById(razi.apa.ctf.videoPlayer.R.id.title);
        }
        Method method = v2.f831a;
        try {
            Method method2 = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", new Class[0]);
            if (!method2.isAccessible()) {
                method2.setAccessible(true);
            }
            method2.invoke(viewGroup, new Object[0]);
        } catch (IllegalAccessException e2) {
            e = e2;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        } catch (NoSuchMethodException unused) {
            Log.d("ViewUtils", "Could not find method makeOptionalFitsSystemWindows. Oh well...");
        } catch (InvocationTargetException e3) {
            e = e3;
            Log.d("ViewUtils", "Could not invoke makeOptionalFitsSystemWindows", e);
        }
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(razi.apa.ctf.videoPlayer.R.id.action_bar_activity_content);
        ViewGroup viewGroup2 = (ViewGroup) this.f431f.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f431f.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new q(this));
        this.u = viewGroup;
        Object obj = this.f429d;
        CharSequence title = obj instanceof Activity ? ((Activity) obj).getTitle() : this.k;
        if (!TextUtils.isEmpty(title)) {
            b1 b1Var2 = this.l;
            if (b1Var2 != null) {
                b1Var2.setWindowTitle(title);
            } else {
                a aVar = this.i;
                if (aVar != null) {
                    aVar.d(title);
                } else {
                    TextView textView = this.v;
                    if (textView != null) {
                        textView.setText(title);
                    }
                }
            }
        }
        ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.u.findViewById(R.id.content);
        View decorView = this.f431f.getDecorView();
        contentFrameLayout2.h.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        if (contentFrameLayout2.isLaidOut()) {
            contentFrameLayout2.requestLayout();
        }
        TypedArray obtainStyledAttributes2 = this.f430e.obtainStyledAttributes(iArr);
        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getMinWidthMajor());
        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getMinWidthMinor());
        if (obtainStyledAttributes2.hasValue(120)) {
            obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedWidthMajor());
        }
        if (obtainStyledAttributes2.hasValue(121)) {
            obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedWidthMinor());
        }
        if (obtainStyledAttributes2.hasValue(118)) {
            obtainStyledAttributes2.getValue(118, contentFrameLayout2.getFixedHeightMajor());
        }
        if (obtainStyledAttributes2.hasValue(119)) {
            obtainStyledAttributes2.getValue(119, contentFrameLayout2.getFixedHeightMinor());
        }
        obtainStyledAttributes2.recycle();
        contentFrameLayout2.requestLayout();
        this.t = true;
        d0 C = C(0);
        if (this.L || C.h != null) {
            return;
        }
        F(108);
    }

    public final void z() {
        if (this.f431f == null) {
            Object obj = this.f429d;
            if (obj instanceof Activity) {
                q(((Activity) obj).getWindow());
            }
        }
        if (this.f431f == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }
}
