package b.b.i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class s2 implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {
    public static s2 k;
    public static s2 l;

    /* renamed from: b, reason: collision with root package name */
    public final View f793b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f794c;

    /* renamed from: d, reason: collision with root package name */
    public final int f795d;

    /* renamed from: e, reason: collision with root package name */
    public final Runnable f796e = new q2(this);

    /* renamed from: f, reason: collision with root package name */
    public final Runnable f797f = new r2(this);
    public int g;
    public int h;
    public t2 i;
    public boolean j;

    public s2(View view, CharSequence charSequence) {
        this.f793b = view;
        this.f794c = charSequence;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(view.getContext());
        Method method = b.h.j.v.f1314a;
        this.f795d = Build.VERSION.SDK_INT >= 28 ? viewConfiguration.getScaledHoverSlop() : viewConfiguration.getScaledTouchSlop() / 2;
        a();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    public static void c(s2 s2Var) {
        s2 s2Var2 = k;
        if (s2Var2 != null) {
            s2Var2.f793b.removeCallbacks(s2Var2.f796e);
        }
        k = s2Var;
        if (s2Var != null) {
            s2Var.f793b.postDelayed(s2Var.f796e, ViewConfiguration.getLongPressTimeout());
        }
    }

    public final void a() {
        this.g = Integer.MAX_VALUE;
        this.h = Integer.MAX_VALUE;
    }

    public void b() {
        if (l == this) {
            l = null;
            t2 t2Var = this.i;
            if (t2Var != null) {
                t2Var.a();
                this.i = null;
                a();
                this.f793b.removeOnAttachStateChangeListener(this);
            } else {
                Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
            }
        }
        if (k == this) {
            c(null);
        }
        this.f793b.removeCallbacks(this.f797f);
    }

    public void d(boolean z) {
        int height;
        int i;
        long longPressTimeout;
        View view = this.f793b;
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        if (view.isAttachedToWindow()) {
            c(null);
            s2 s2Var = l;
            if (s2Var != null) {
                s2Var.b();
            }
            l = this;
            this.j = z;
            t2 t2Var = new t2(this.f793b.getContext());
            this.i = t2Var;
            View view2 = this.f793b;
            int i2 = this.g;
            int i3 = this.h;
            boolean z2 = this.j;
            CharSequence charSequence = this.f794c;
            if (t2Var.f809b.getParent() != null) {
                t2Var.a();
            }
            t2Var.f810c.setText(charSequence);
            WindowManager.LayoutParams layoutParams = t2Var.f811d;
            layoutParams.token = view2.getApplicationWindowToken();
            int dimensionPixelOffset = t2Var.f808a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_threshold);
            if (view2.getWidth() < dimensionPixelOffset) {
                i2 = view2.getWidth() / 2;
            }
            if (view2.getHeight() >= dimensionPixelOffset) {
                int dimensionPixelOffset2 = t2Var.f808a.getResources().getDimensionPixelOffset(R.dimen.tooltip_precise_anchor_extra_offset);
                height = i3 + dimensionPixelOffset2;
                i = i3 - dimensionPixelOffset2;
            } else {
                height = view2.getHeight();
                i = 0;
            }
            layoutParams.gravity = 49;
            int dimensionPixelOffset3 = t2Var.f808a.getResources().getDimensionPixelOffset(z2 ? R.dimen.tooltip_y_offset_touch : R.dimen.tooltip_y_offset_non_touch);
            View rootView = view2.getRootView();
            ViewGroup.LayoutParams layoutParams2 = rootView.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams) || ((WindowManager.LayoutParams) layoutParams2).type != 2) {
                Context context = view2.getContext();
                while (true) {
                    if (!(context instanceof ContextWrapper)) {
                        break;
                    }
                    if (context instanceof Activity) {
                        rootView = ((Activity) context).getWindow().getDecorView();
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (rootView == null) {
                Log.e("TooltipPopup", "Cannot find app view");
            } else {
                rootView.getWindowVisibleDisplayFrame(t2Var.f812e);
                Rect rect = t2Var.f812e;
                if (rect.left < 0 && rect.top < 0) {
                    Resources resources = t2Var.f808a.getResources();
                    int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
                    int dimensionPixelSize = identifier != 0 ? resources.getDimensionPixelSize(identifier) : 0;
                    DisplayMetrics displayMetrics = resources.getDisplayMetrics();
                    t2Var.f812e.set(0, dimensionPixelSize, displayMetrics.widthPixels, displayMetrics.heightPixels);
                }
                rootView.getLocationOnScreen(t2Var.g);
                view2.getLocationOnScreen(t2Var.f813f);
                int[] iArr = t2Var.f813f;
                int i4 = iArr[0];
                int[] iArr2 = t2Var.g;
                iArr[0] = i4 - iArr2[0];
                iArr[1] = iArr[1] - iArr2[1];
                layoutParams.x = (iArr[0] + i2) - (rootView.getWidth() / 2);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                t2Var.f809b.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredHeight = t2Var.f809b.getMeasuredHeight();
                int[] iArr3 = t2Var.f813f;
                int i5 = ((iArr3[1] + i) - dimensionPixelOffset3) - measuredHeight;
                int i6 = iArr3[1] + height + dimensionPixelOffset3;
                if (!z2 ? measuredHeight + i6 <= t2Var.f812e.height() : i5 < 0) {
                    layoutParams.y = i5;
                } else {
                    layoutParams.y = i6;
                }
            }
            ((WindowManager) t2Var.f808a.getSystemService("window")).addView(t2Var.f809b, t2Var.f811d);
            this.f793b.addOnAttachStateChangeListener(this);
            if (this.j) {
                longPressTimeout = 2500;
            } else {
                longPressTimeout = ((this.f793b.getWindowSystemUiVisibility() & 1) == 1 ? 3000L : 15000L) - ViewConfiguration.getLongPressTimeout();
            }
            this.f793b.removeCallbacks(this.f797f);
            this.f793b.postDelayed(this.f797f, longPressTimeout);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        boolean z;
        if (this.i != null && this.j) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f793b.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                a();
                b();
            }
        } else if (this.f793b.isEnabled() && this.i == null) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (Math.abs(x - this.g) > this.f795d || Math.abs(y - this.h) > this.f795d) {
                this.g = x;
                this.h = y;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                c(this);
            }
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.g = view.getWidth() / 2;
        this.h = view.getHeight() / 2;
        d(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
