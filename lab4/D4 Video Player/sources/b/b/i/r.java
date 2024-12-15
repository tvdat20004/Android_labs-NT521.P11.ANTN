package b.b.i;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public class r extends CheckedTextView {

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f771c = {R.attr.checkMark};

    /* renamed from: b, reason: collision with root package name */
    public final u0 f772b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        i2.a(context);
        h2.a(this, getContext());
        u0 u0Var = new u0(this);
        this.f772b = u0Var;
        u0Var.e(attributeSet, R.attr.checkedTextViewStyle);
        u0Var.b();
        l2 r = l2.r(getContext(), attributeSet, f771c, R.attr.checkedTextViewStyle, 0);
        setCheckMarkDrawable(r.g(0));
        r.f730b.recycle();
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        u0 u0Var = this.f772b;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b.b.a.b(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(b.b.d.a.a.a(getContext(), i));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b.h.b.h.K(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        u0 u0Var = this.f772b;
        if (u0Var != null) {
            u0Var.f(context, i);
        }
    }
}
