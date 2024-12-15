package b.b.i;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

/* loaded from: classes.dex */
public class r0 extends Spinner {
    public static final int[] j = {R.attr.spinnerMode};

    /* renamed from: b, reason: collision with root package name */
    public final o f773b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f774c;

    /* renamed from: d, reason: collision with root package name */
    public k1 f775d;

    /* renamed from: e, reason: collision with root package name */
    public SpinnerAdapter f776e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f777f;
    public q0 g;
    public int h;
    public final Rect i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
    
        if (r6 == null) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r0(android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r10 = this;
            int[] r0 = b.b.b.v
            r1 = 2130903804(0x7f0302fc, float:1.7414436E38)
            r10.<init>(r11, r12, r1)
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r10.i = r2
            android.content.Context r2 = r10.getContext()
            b.b.i.h2.a(r10, r2)
            r2 = 0
            android.content.res.TypedArray r3 = r11.obtainStyledAttributes(r12, r0, r1, r2)
            b.b.i.o r4 = new b.b.i.o
            r4.<init>(r10)
            r10.f773b = r4
            r4 = 4
            int r4 = r3.getResourceId(r4, r2)
            if (r4 == 0) goto L31
            b.b.h.d r5 = new b.b.h.d
            r5.<init>(r11, r4)
            r10.f774c = r5
            goto L33
        L31:
            r10.f774c = r11
        L33:
            r4 = 0
            r5 = -1
            int[] r6 = b.b.i.r0.j     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            android.content.res.TypedArray r6 = r11.obtainStyledAttributes(r12, r6, r1, r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L4f
            boolean r7 = r6.hasValue(r2)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4a
            if (r7 == 0) goto L5b
            int r5 = r6.getInt(r2, r2)     // Catch: java.lang.Throwable -> L46 java.lang.Exception -> L4a
            goto L5b
        L46:
            r11 = move-exception
            r4 = r6
            goto Ld1
        L4a:
            r7 = move-exception
            goto L52
        L4c:
            r11 = move-exception
            goto Ld1
        L4f:
            r6 = move-exception
            r7 = r6
            r6 = r4
        L52:
            java.lang.String r8 = "AppCompatSpinner"
            java.lang.String r9 = "Could not read android:spinnerMode"
            android.util.Log.i(r8, r9, r7)     // Catch: java.lang.Throwable -> L46
            if (r6 == 0) goto L5e
        L5b:
            r6.recycle()
        L5e:
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L98
            if (r5 == r7) goto L65
            goto La6
        L65:
            b.b.i.n0 r5 = new b.b.i.n0
            android.content.Context r8 = r10.f774c
            r5.<init>(r10, r8, r12, r1)
            android.content.Context r8 = r10.f774c
            b.b.i.l2 r0 = b.b.i.l2.r(r8, r12, r0, r1, r2)
            r8 = 3
            r9 = -2
            int r8 = r0.l(r8, r9)
            r10.h = r8
            android.graphics.drawable.Drawable r8 = r0.g(r7)
            android.widget.PopupWindow r9 = r5.A
            r9.setBackgroundDrawable(r8)
            java.lang.String r6 = r3.getString(r6)
            r5.E = r6
            android.content.res.TypedArray r0 = r0.f730b
            r0.recycle()
            r10.g = r5
            b.b.i.g0 r0 = new b.b.i.g0
            r0.<init>(r10, r10, r5)
            r10.f775d = r0
            goto La6
        L98:
            b.b.i.i0 r0 = new b.b.i.i0
            r0.<init>(r10)
            r10.g = r0
            java.lang.String r5 = r3.getString(r6)
            r0.l(r5)
        La6:
            java.lang.CharSequence[] r0 = r3.getTextArray(r2)
            if (r0 == 0) goto Lbd
            android.widget.ArrayAdapter r2 = new android.widget.ArrayAdapter
            r5 = 17367048(0x1090008, float:2.5162948E-38)
            r2.<init>(r11, r5, r0)
            r11 = 2131427460(0x7f0b0084, float:1.8476537E38)
            r2.setDropDownViewResource(r11)
            r10.setAdapter(r2)
        Lbd:
            r3.recycle()
            r10.f777f = r7
            android.widget.SpinnerAdapter r11 = r10.f776e
            if (r11 == 0) goto Lcb
            r10.setAdapter(r11)
            r10.f776e = r4
        Lcb:
            b.b.i.o r11 = r10.f773b
            r11.d(r12, r1)
            return
        Ld1:
            if (r4 == 0) goto Ld6
            r4.recycle()
        Ld6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.i.r0.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.i);
        Rect rect = this.i;
        return i2 + rect.left + rect.right;
    }

    public void b() {
        this.g.d(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f773b;
        if (oVar != null) {
            oVar.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        q0 q0Var = this.g;
        return q0Var != null ? q0Var.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        q0 q0Var = this.g;
        return q0Var != null ? q0Var.g() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.g != null ? this.h : super.getDropDownWidth();
    }

    public final q0 getInternalPopup() {
        return this.g;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        q0 q0Var = this.g;
        return q0Var != null ? q0Var.i() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f774c;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        q0 q0Var = this.g;
        return q0Var != null ? q0Var.j() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f773b;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f773b;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        q0 q0Var = this.g;
        if (q0Var == null || !q0Var.b()) {
            return;
        }
        this.g.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.g == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        p0 p0Var = (p0) parcelable;
        super.onRestoreInstanceState(p0Var.getSuperState());
        if (!p0Var.f758b || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new h0(this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        p0 p0Var = new p0(super.onSaveInstanceState());
        q0 q0Var = this.g;
        p0Var.f758b = q0Var != null && q0Var.b();
        return p0Var;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        k1 k1Var = this.f775d;
        if (k1Var == null || !k1Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        q0 q0Var = this.g;
        if (q0Var == null) {
            return super.performClick();
        }
        if (q0Var.b()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f777f) {
            this.f776e = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.g != null) {
            Context context = this.f774c;
            if (context == null) {
                context = getContext();
            }
            this.g.o(new j0(spinnerAdapter, context.getTheme()));
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f773b;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o oVar = this.f773b;
        if (oVar != null) {
            oVar.f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        q0 q0Var = this.g;
        if (q0Var == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            q0Var.p(i);
            this.g.a(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        q0 q0Var = this.g;
        if (q0Var != null) {
            q0Var.n(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.g != null) {
            this.h = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        q0 q0Var = this.g;
        if (q0Var != null) {
            q0Var.m(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(b.b.d.a.a.a(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        q0 q0Var = this.g;
        if (q0Var != null) {
            q0Var.l(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f773b;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f773b;
        if (oVar != null) {
            oVar.i(mode);
        }
    }
}
