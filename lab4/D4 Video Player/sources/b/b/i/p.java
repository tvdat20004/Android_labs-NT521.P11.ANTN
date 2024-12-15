package b.b.i;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

/* loaded from: classes.dex */
public class p extends Button implements b.h.k.c, b.h.k.g {

    /* renamed from: b, reason: collision with root package name */
    public final o f756b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f757c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i2.a(context);
        h2.a(this, getContext());
        o oVar = new o(this);
        this.f756b = oVar;
        oVar.d(attributeSet, i);
        u0 u0Var = new u0(this);
        this.f757c = u0Var;
        u0Var.e(attributeSet, i);
        u0Var.b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f756b;
        if (oVar != null) {
            oVar.a();
        }
        u0 u0Var = this.f757c;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (b.h.k.c.f1328a) {
            return super.getAutoSizeMaxTextSize();
        }
        u0 u0Var = this.f757c;
        if (u0Var != null) {
            return Math.round(u0Var.i.f845e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (b.h.k.c.f1328a) {
            return super.getAutoSizeMinTextSize();
        }
        u0 u0Var = this.f757c;
        if (u0Var != null) {
            return Math.round(u0Var.i.f844d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (b.h.k.c.f1328a) {
            return super.getAutoSizeStepGranularity();
        }
        u0 u0Var = this.f757c;
        if (u0Var != null) {
            return Math.round(u0Var.i.f843c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (b.h.k.c.f1328a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        u0 u0Var = this.f757c;
        return u0Var != null ? u0Var.i.f846f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.h.k.c.f1328a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        u0 u0Var = this.f757c;
        if (u0Var != null) {
            return u0Var.i.f841a;
        }
        return 0;
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f756b;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f756b;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        j2 j2Var = this.f757c.h;
        if (j2Var != null) {
            return j2Var.f710a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        j2 j2Var = this.f757c.h;
        if (j2Var != null) {
            return j2Var.f711b;
        }
        return null;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        u0 u0Var = this.f757c;
        if (u0Var == null || b.h.k.c.f1328a) {
            return;
        }
        u0Var.i.a();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        u0 u0Var = this.f757c;
        if (u0Var == null || b.h.k.c.f1328a || !u0Var.d()) {
            return;
        }
        this.f757c.i.a();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (b.h.k.c.f1328a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        u0 u0Var = this.f757c;
        if (u0Var != null) {
            u0Var.g(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (b.h.k.c.f1328a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        u0 u0Var = this.f757c;
        if (u0Var != null) {
            u0Var.h(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (b.h.k.c.f1328a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        u0 u0Var = this.f757c;
        if (u0Var != null) {
            u0Var.i(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f756b;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o oVar = this.f756b;
        if (oVar != null) {
            oVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b.h.b.h.K(this, callback));
    }

    public void setSupportAllCaps(boolean z) {
        u0 u0Var = this.f757c;
        if (u0Var != null) {
            u0Var.f817a.setAllCaps(z);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f756b;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f756b;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    @Override // b.h.k.g
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f757c.j(colorStateList);
        this.f757c.b();
    }

    @Override // b.h.k.g
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f757c.k(mode);
        this.f757c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        u0 u0Var = this.f757c;
        if (u0Var != null) {
            u0Var.f(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f2) {
        boolean z = b.h.k.c.f1328a;
        if (z) {
            super.setTextSize(i, f2);
            return;
        }
        u0 u0Var = this.f757c;
        if (u0Var == null || z || u0Var.d()) {
            return;
        }
        u0Var.i.f(i, f2);
    }
}
