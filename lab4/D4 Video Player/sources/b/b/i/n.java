package b.b.i;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class n extends AutoCompleteTextView {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f740d = {R.attr.popupBackground};

    /* renamed from: b, reason: collision with root package name */
    public final o f741b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f742c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i2.a(context);
        h2.a(this, getContext());
        l2 r = l2.r(getContext(), attributeSet, f740d, i, 0);
        if (r.p(0)) {
            setDropDownBackgroundDrawable(r.g(0));
        }
        r.f730b.recycle();
        o oVar = new o(this);
        this.f741b = oVar;
        oVar.d(attributeSet, i);
        u0 u0Var = new u0(this);
        this.f742c = u0Var;
        u0Var.e(attributeSet, i);
        u0Var.b();
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f741b;
        if (oVar != null) {
            oVar.a();
        }
        u0 u0Var = this.f742c;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f741b;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f741b;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b.b.a.b(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f741b;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o oVar = this.f741b;
        if (oVar != null) {
            oVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b.h.b.h.K(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(b.b.d.a.a.a(getContext(), i));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f741b;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f741b;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        u0 u0Var = this.f742c;
        if (u0Var != null) {
            u0Var.f(context, i);
        }
    }
}
