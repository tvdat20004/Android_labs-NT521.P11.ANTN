package c.c.a.b.p;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b.t.b0;
import b.t.l0;
import java.util.Map;

/* loaded from: classes.dex */
public class o extends b0 {
    public final void H(l0 l0Var) {
        View view = l0Var.f1755b;
        if (view instanceof TextView) {
            l0Var.f1754a.put("android:textscale:scale", Float.valueOf(((TextView) view).getScaleX()));
        }
    }

    @Override // b.t.b0
    public void d(l0 l0Var) {
        H(l0Var);
    }

    @Override // b.t.b0
    public void g(l0 l0Var) {
        H(l0Var);
    }

    @Override // b.t.b0
    public Animator k(ViewGroup viewGroup, l0 l0Var, l0 l0Var2) {
        if (l0Var == null || l0Var2 == null || !(l0Var.f1755b instanceof TextView)) {
            return null;
        }
        View view = l0Var2.f1755b;
        if (!(view instanceof TextView)) {
            return null;
        }
        TextView textView = (TextView) view;
        Map<String, Object> map = l0Var.f1754a;
        Map<String, Object> map2 = l0Var2.f1754a;
        float floatValue = map.get("android:textscale:scale") != null ? ((Float) map.get("android:textscale:scale")).floatValue() : 1.0f;
        float floatValue2 = map2.get("android:textscale:scale") != null ? ((Float) map2.get("android:textscale:scale")).floatValue() : 1.0f;
        if (floatValue == floatValue2) {
            return null;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(floatValue, floatValue2);
        ofFloat.addUpdateListener(new n(this, textView));
        return ofFloat;
    }
}
