package b.b.i;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class v0 extends TextView implements b.h.k.g, b.h.k.c {

    /* renamed from: b, reason: collision with root package name */
    public final o f827b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f828c;

    /* renamed from: d, reason: collision with root package name */
    public final s0 f829d;

    /* renamed from: e, reason: collision with root package name */
    public Future<b.h.h.d> f830e;

    public v0(Context context) {
        this(context, null, R.attr.textViewStyle);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i2.a(context);
        h2.a(this, getContext());
        o oVar = new o(this);
        this.f827b = oVar;
        oVar.d(attributeSet, i);
        u0 u0Var = new u0(this);
        this.f828c = u0Var;
        u0Var.e(attributeSet, i);
        u0Var.b();
        this.f829d = new s0(this);
    }

    public final void c() {
        Future<b.h.h.d> future = this.f830e;
        if (future != null) {
            try {
                this.f830e = null;
                future.get();
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                b.h.b.h.t(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f827b;
        if (oVar != null) {
            oVar.a();
        }
        u0 u0Var = this.f828c;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (b.h.k.c.f1328a) {
            return super.getAutoSizeMaxTextSize();
        }
        u0 u0Var = this.f828c;
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
        u0 u0Var = this.f828c;
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
        u0 u0Var = this.f828c;
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
        u0 u0Var = this.f828c;
        return u0Var != null ? u0Var.i.f846f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (b.h.k.c.f1328a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        u0 u0Var = this.f828c;
        if (u0Var != null) {
            return u0Var.i.f841a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f827b;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f827b;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        j2 j2Var = this.f828c.h;
        if (j2Var != null) {
            return j2Var.f710a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        j2 j2Var = this.f828c.h;
        if (j2Var != null) {
            return j2Var.f711b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        c();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        s0 s0Var;
        return (Build.VERSION.SDK_INT >= 28 || (s0Var = this.f829d) == null) ? super.getTextClassifier() : s0Var.a();
    }

    public b.h.h.c getTextMetricsParamsCompat() {
        return b.h.b.h.t(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        b.b.a.b(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        u0 u0Var = this.f828c;
        if (u0Var == null || b.h.k.c.f1328a) {
            return;
        }
        u0Var.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        c();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        u0 u0Var = this.f828c;
        if (u0Var == null || b.h.k.c.f1328a || !u0Var.d()) {
            return;
        }
        this.f828c.i.a();
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (b.h.k.c.f1328a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        u0 u0Var = this.f828c;
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
        u0 u0Var = this.f828c;
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
        u0 u0Var = this.f828c;
        if (u0Var != null) {
            u0Var.i(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f827b;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o oVar = this.f827b;
        if (oVar != null) {
            oVar.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f828c;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f828c;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? b.b.d.a.a.a(context, i) : null, i2 != 0 ? b.b.d.a.a.a(context, i2) : null, i3 != 0 ? b.b.d.a.a.a(context, i3) : null, i4 != 0 ? b.b.d.a.a.a(context, i4) : null);
        u0 u0Var = this.f828c;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? b.b.d.a.a.a(context, i) : null, i2 != 0 ? b.b.d.a.a.a(context, i2) : null, i3 != 0 ? b.b.d.a.a.a(context, i3) : null, i4 != 0 ? b.b.d.a.a.a(context, i4) : null);
        u0 u0Var = this.f828c;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(b.h.b.h.K(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i);
        } else {
            b.h.b.h.B(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i);
        } else {
            b.h.b.h.C(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        b.h.b.h.D(this, i);
    }

    public void setPrecomputedText(b.h.h.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        b.h.b.h.t(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f827b;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f827b;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    @Override // b.h.k.g
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f828c.j(colorStateList);
        this.f828c.b();
    }

    @Override // b.h.k.g
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f828c.k(mode);
        this.f828c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        u0 u0Var = this.f828c;
        if (u0Var != null) {
            u0Var.f(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        s0 s0Var;
        if (Build.VERSION.SDK_INT >= 28 || (s0Var = this.f829d) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            s0Var.f787b = textClassifier;
        }
    }

    public void setTextFuture(Future<b.h.h.d> future) {
        this.f830e = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(b.h.h.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic = cVar.f1236b;
        int i = 1;
        if (textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_RTL && textDirectionHeuristic != TextDirectionHeuristics.FIRSTSTRONG_LTR) {
            if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_LTR) {
                i = 6;
            } else if (textDirectionHeuristic == TextDirectionHeuristics.FIRSTSTRONG_RTL) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(cVar.f1235a);
        setBreakStrategy(cVar.f1237c);
        setHyphenationFrequency(cVar.f1238d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f2) {
        boolean z = b.h.k.c.f1328a;
        if (z) {
            super.setTextSize(i, f2);
            return;
        }
        u0 u0Var = this.f828c;
        if (u0Var == null || z || u0Var.d()) {
            return;
        }
        u0Var.i.f(i, f2);
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            b.h.d.l lVar = b.h.d.d.f1165a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f828c;
        if (u0Var != null) {
            u0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        u0 u0Var = this.f828c;
        if (u0Var != null) {
            u0Var.b();
        }
    }
}
