package b.b.i;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class v1 extends s1 implements t1 {
    public static Method F;
    public t1 E;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                F = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public v1(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // b.b.i.t1
    public void e(b.b.h.m.l lVar, MenuItem menuItem) {
        t1 t1Var = this.E;
        if (t1Var != null) {
            t1Var.e(lVar, menuItem);
        }
    }

    @Override // b.b.i.t1
    public void h(b.b.h.m.l lVar, MenuItem menuItem) {
        t1 t1Var = this.E;
        if (t1Var != null) {
            t1Var.h(lVar, menuItem);
        }
    }

    @Override // b.b.i.s1
    public g1 q(Context context, boolean z) {
        u1 u1Var = new u1(context, z);
        u1Var.setHoverListener(this);
        return u1Var;
    }
}
