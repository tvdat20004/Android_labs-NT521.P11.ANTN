package c.c.a.b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import b.b.i.l2;
import b.h.j.u;
import b.h.j.y;
import c.c.a.b.p.q;
import c.c.a.b.p.r;
import c.c.a.b.p.s;
import c.c.a.b.p.t;
import c.c.a.b.u.d;
import c.c.a.b.u.e;
import c.c.a.b.u.h;
import c.c.a.b.u.i;
import c.c.a.b.u.k;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class a {
    public static d a(int i) {
        return i != 0 ? i != 1 ? new k() : new e() : new k();
    }

    public static void b(View view, s sVar) {
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        u.j(view, new q(sVar, new t(view.getPaddingStart(), view.getPaddingTop(), view.getPaddingEnd(), view.getPaddingBottom())));
        if (view.isAttachedToWindow()) {
            view.requestApplyInsets();
        } else {
            view.addOnAttachStateChangeListener(new r());
        }
    }

    public static int c(Context context, int i, int i2) {
        TypedValue k = k(context, i);
        return k != null ? k.data : i2;
    }

    public static int d(View view, int i) {
        return m(view.getContext(), i, view.getClass().getCanonicalName());
    }

    public static ColorStateList e(Context context, TypedArray typedArray, int i) {
        int resourceId;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            ThreadLocal<TypedValue> threadLocal = b.b.d.a.a.f496a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return typedArray.getColorStateList(i);
    }

    public static ColorStateList f(Context context, l2 l2Var, int i) {
        int resourceId;
        if (l2Var.f730b.hasValue(i) && (resourceId = l2Var.f730b.getResourceId(i, 0)) != 0) {
            ThreadLocal<TypedValue> threadLocal = b.b.d.a.a.f496a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return l2Var.c(i);
    }

    public static Drawable g(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable a2;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (a2 = b.b.d.a.a.a(context, resourceId)) == null) ? typedArray.getDrawable(i) : a2;
    }

    public static int h(int i, int i2, float f2) {
        return b.h.d.a.a(b.h.d.a.c(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    public static PorterDuff.Mode i(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static void j(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            j = Math.max(j, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }

    public static TypedValue k(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean l(Context context, int i, boolean z) {
        TypedValue k = k(context, i);
        return (k == null || k.type != 18) ? z : k.data != 0;
    }

    public static int m(Context context, int i, String str) {
        TypedValue k = k(context, i);
        if (k != null) {
            return k.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    public static void n(View view, float f2) {
        Drawable background = view.getBackground();
        if (background instanceof i) {
            i iVar = (i) background;
            h hVar = iVar.f4024b;
            if (hVar.o != f2) {
                hVar.o = f2;
                iVar.w();
            }
        }
    }

    public static void o(View view, i iVar) {
        c.c.a.b.n.a aVar = iVar.f4024b.f4019b;
        if (aVar != null && aVar.f3952a) {
            float f2 = 0.0f;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, y> weakHashMap = u.f1311a;
                f2 += ((View) parent).getElevation();
            }
            h hVar = iVar.f4024b;
            if (hVar.n != f2) {
                hVar.n = f2;
                iVar.w();
            }
        }
    }

    public static PorterDuffColorFilter p(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(drawable.getState(), 0), mode);
    }
}
