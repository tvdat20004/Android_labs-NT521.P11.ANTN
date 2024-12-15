package c.c.a.b.w;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.Filterable;
import android.widget.ListAdapter;
import b.b.i.s1;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class c0 extends b.b.i.n {

    /* renamed from: e, reason: collision with root package name */
    public final s1 f4088e;

    /* renamed from: f, reason: collision with root package name */
    public final AccessibilityManager f4089f;
    public final Rect g;

    public c0(Context context, AttributeSet attributeSet) {
        super(c.c.a.b.x.a.a.a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        this.g = new Rect();
        Context context2 = getContext();
        TypedArray d2 = c.c.a.b.p.p.d(context2, attributeSet, c.c.a.b.b.i, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (d2.hasValue(0) && d2.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f4089f = (AccessibilityManager) context2.getSystemService("accessibility");
        s1 s1Var = new s1(context2, null, R.attr.listPopupWindowStyle, 0);
        this.f4088e = s1Var;
        s1Var.s(true);
        s1Var.q = this;
        s1Var.A.setInputMethodMode(2);
        s1Var.o(getAdapter());
        s1Var.r = new b0(this);
        d2.recycle();
    }

    public static void a(c0 c0Var, Object obj) {
        c0Var.setText(c0Var.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout b2 = b();
        return (b2 == null || !b2.B) ? super.getHint() : b2.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout b2 = b();
        if (b2 != null && b2.B && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout b2 = b();
            int i3 = 0;
            if (adapter != null && b2 != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                s1 s1Var = this.f4088e;
                int min = Math.min(adapter.getCount(), Math.max(0, !s1Var.b() ? -1 : s1Var.f790d.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, b2);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable i5 = this.f4088e.i();
                if (i5 != null) {
                    i5.getPadding(this.g);
                    Rect rect = this.g;
                    i4 += rect.left + rect.right;
                }
                i3 = b2.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.f4088e.o(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager;
        if (getInputType() == 0 && (accessibilityManager = this.f4089f) != null && accessibilityManager.isTouchExplorationEnabled()) {
            this.f4088e.f();
        } else {
            super.showDropDown();
        }
    }
}
