package b.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RadioButton;

/* loaded from: classes.dex */
public class c0 extends RadioButton {

    /* renamed from: b, reason: collision with root package name */
    public final s f658b;

    /* renamed from: c, reason: collision with root package name */
    public final o f659c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i2.a(context);
        h2.a(this, getContext());
        s sVar = new s(this);
        this.f658b = sVar;
        sVar.b(attributeSet, i);
        o oVar = new o(this);
        this.f659c = oVar;
        oVar.d(attributeSet, i);
        u0 u0Var = new u0(this);
        this.f660d = u0Var;
        u0Var.e(attributeSet, i);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f659c;
        if (oVar != null) {
            oVar.a();
        }
        u0 u0Var = this.f660d;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        s sVar = this.f658b;
        return compoundPaddingLeft;
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f659c;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f659c;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        s sVar = this.f658b;
        if (sVar != null) {
            return sVar.f781b;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        s sVar = this.f658b;
        if (sVar != null) {
            return sVar.f782c;
        }
        return null;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f659c;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o oVar = this.f659c;
        if (oVar != null) {
            oVar.f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(b.b.d.a.a.a(getContext(), i));
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        s sVar = this.f658b;
        if (sVar != null) {
            if (sVar.f785f) {
                sVar.f785f = false;
            } else {
                sVar.f785f = true;
                sVar.a();
            }
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f659c;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f659c;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        s sVar = this.f658b;
        if (sVar != null) {
            sVar.f781b = colorStateList;
            sVar.f783d = true;
            sVar.a();
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        s sVar = this.f658b;
        if (sVar != null) {
            sVar.f782c = mode;
            sVar.f784e = true;
            sVar.a();
        }
    }
}
