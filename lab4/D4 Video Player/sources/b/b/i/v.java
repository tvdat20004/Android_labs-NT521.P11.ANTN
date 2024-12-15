package b.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;

/* loaded from: classes.dex */
public class v extends EditText {

    /* renamed from: b, reason: collision with root package name */
    public final o f824b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f825c;

    /* renamed from: d, reason: collision with root package name */
    public final s0 f826d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i2.a(context);
        h2.a(this, getContext());
        o oVar = new o(this);
        this.f824b = oVar;
        oVar.d(attributeSet, i);
        u0 u0Var = new u0(this);
        this.f825c = u0Var;
        u0Var.e(attributeSet, i);
        u0Var.b();
        this.f826d = new s0(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f824b;
        if (oVar != null) {
            oVar.a();
        }
        u0 u0Var = this.f825c;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f824b;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f824b;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        s0 s0Var;
        return (Build.VERSION.SDK_INT >= 28 || (s0Var = this.f826d) == null) ? super.getTextClassifier() : s0Var.a();
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
        o oVar = this.f824b;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o oVar = this.f824b;
        if (oVar != null) {
            oVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b.h.b.h.K(this, callback));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f824b;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f824b;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        u0 u0Var = this.f825c;
        if (u0Var != null) {
            u0Var.f(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        s0 s0Var;
        if (Build.VERSION.SDK_INT >= 28 || (s0Var = this.f826d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            s0Var.f787b = textClassifier;
        }
    }
}
