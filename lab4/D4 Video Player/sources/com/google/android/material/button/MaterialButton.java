package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import b.b.i.p;
import b.h.j.u;
import b.h.j.y;
import c.c.a.b.u.h;
import c.c.a.b.u.i;
import c.c.a.b.u.m;
import c.c.a.b.u.w;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class MaterialButton extends p implements Checkable, w {
    public static final int[] p = {R.attr.state_checkable};
    public static final int[] q = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public final c.c.a.b.i.b f4219d;

    /* renamed from: e, reason: collision with root package name */
    public final LinkedHashSet<a> f4220e;

    /* renamed from: f, reason: collision with root package name */
    public b f4221f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public Drawable i;
    public int j;
    public int k;
    public int l;
    public boolean m;
    public boolean n;
    public int o;

    public interface a {
        void a(MaterialButton materialButton, boolean z);
    }

    public interface b {
        void a(MaterialButton materialButton, boolean z);
    }

    public static class c extends b.j.a.c {
        public static final Parcelable.Creator<c> CREATOR = new c.c.a.b.i.a();

        /* renamed from: d, reason: collision with root package name */
        public boolean f4222d;

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                c.class.getClassLoader();
            }
            this.f4222d = parcel.readInt() == 1;
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // b.j.a.c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1349b, i);
            parcel.writeInt(this.f4222d ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(c.c.a.b.x.a.a.a(context, attributeSet, razi.apa.ctf.videoPlayer.R.attr.materialButtonStyle, razi.apa.ctf.videoPlayer.R.style.Widget_MaterialComponents_Button), attributeSet, razi.apa.ctf.videoPlayer.R.attr.materialButtonStyle);
        this.f4220e = new LinkedHashSet<>();
        this.m = false;
        this.n = false;
        Context context2 = getContext();
        TypedArray d2 = c.c.a.b.p.p.d(context2, attributeSet, c.c.a.b.b.j, razi.apa.ctf.videoPlayer.R.attr.materialButtonStyle, razi.apa.ctf.videoPlayer.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.l = d2.getDimensionPixelSize(12, 0);
        this.g = c.c.a.b.a.i(d2.getInt(15, -1), PorterDuff.Mode.SRC_IN);
        this.h = c.c.a.b.a.e(getContext(), d2, 14);
        this.i = c.c.a.b.a.g(getContext(), d2, 10);
        this.o = d2.getInteger(11, 1);
        this.j = d2.getDimensionPixelSize(13, 0);
        c.c.a.b.i.b bVar = new c.c.a.b.i.b(this, m.b(context2, attributeSet, razi.apa.ctf.videoPlayer.R.attr.materialButtonStyle, razi.apa.ctf.videoPlayer.R.style.Widget_MaterialComponents_Button).a());
        this.f4219d = bVar;
        bVar.f3870c = d2.getDimensionPixelOffset(1, 0);
        bVar.f3871d = d2.getDimensionPixelOffset(2, 0);
        bVar.f3872e = d2.getDimensionPixelOffset(3, 0);
        bVar.f3873f = d2.getDimensionPixelOffset(4, 0);
        if (d2.hasValue(8)) {
            int dimensionPixelSize = d2.getDimensionPixelSize(8, -1);
            bVar.g = dimensionPixelSize;
            bVar.e(bVar.f3869b.e(dimensionPixelSize));
            bVar.p = true;
        }
        bVar.h = d2.getDimensionPixelSize(20, 0);
        bVar.i = c.c.a.b.a.i(d2.getInt(7, -1), PorterDuff.Mode.SRC_IN);
        bVar.j = c.c.a.b.a.e(bVar.f3868a.getContext(), d2, 6);
        bVar.k = c.c.a.b.a.e(bVar.f3868a.getContext(), d2, 19);
        bVar.l = c.c.a.b.a.e(bVar.f3868a.getContext(), d2, 16);
        bVar.q = d2.getBoolean(5, false);
        int dimensionPixelSize2 = d2.getDimensionPixelSize(9, 0);
        MaterialButton materialButton = bVar.f3868a;
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = bVar.f3868a.getPaddingTop();
        int paddingEnd = bVar.f3868a.getPaddingEnd();
        int paddingBottom = bVar.f3868a.getPaddingBottom();
        if (d2.hasValue(0)) {
            bVar.o = true;
            bVar.f3868a.setSupportBackgroundTintList(bVar.j);
            bVar.f3868a.setSupportBackgroundTintMode(bVar.i);
        } else {
            MaterialButton materialButton2 = bVar.f3868a;
            i iVar = new i(bVar.f3869b);
            iVar.n(bVar.f3868a.getContext());
            iVar.setTintList(bVar.j);
            PorterDuff.Mode mode = bVar.i;
            if (mode != null) {
                iVar.setTintMode(mode);
            }
            iVar.s(bVar.h, bVar.k);
            i iVar2 = new i(bVar.f3869b);
            iVar2.setTint(0);
            iVar2.r(bVar.h, bVar.n ? c.c.a.b.a.d(bVar.f3868a, razi.apa.ctf.videoPlayer.R.attr.colorSurface) : 0);
            i iVar3 = new i(bVar.f3869b);
            bVar.m = iVar3;
            iVar3.setTint(-1);
            RippleDrawable rippleDrawable = new RippleDrawable(c.c.a.b.s.a.b(bVar.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{iVar2, iVar}), bVar.f3870c, bVar.f3872e, bVar.f3871d, bVar.f3873f), bVar.m);
            bVar.r = rippleDrawable;
            materialButton2.setInternalBackground(rippleDrawable);
            i b2 = bVar.b();
            if (b2 != null) {
                b2.o(dimensionPixelSize2);
            }
        }
        bVar.f3868a.setPaddingRelative(paddingStart + bVar.f3870c, paddingTop + bVar.f3872e, paddingEnd + bVar.f3871d, paddingBottom + bVar.f3873f);
        d2.recycle();
        setCompoundDrawablePadding(this.l);
        c(this.i != null);
    }

    private String getA11yClassName() {
        return (a() ? CompoundButton.class : Button.class).getName();
    }

    public boolean a() {
        c.c.a.b.i.b bVar = this.f4219d;
        return bVar != null && bVar.q;
    }

    public final boolean b() {
        c.c.a.b.i.b bVar = this.f4219d;
        return (bVar == null || bVar.o) ? false : true;
    }

    public final void c(boolean z) {
        Drawable drawable = this.i;
        boolean z2 = false;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.i = mutate;
            mutate.setTintList(this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                this.i.setTintMode(mode);
            }
            int i = this.j;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.j;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.k;
            drawable2.setBounds(i3, 0, i + i3, i2);
        }
        int i4 = this.o;
        boolean z3 = i4 == 1 || i4 == 2;
        if (z) {
            Drawable drawable3 = this.i;
            if (z3) {
                setCompoundDrawablesRelative(drawable3, null, null, null);
                return;
            } else {
                setCompoundDrawablesRelative(null, null, drawable3, null);
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable4 = compoundDrawablesRelative[0];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((z3 && drawable4 != this.i) || (!z3 && drawable5 != this.i)) {
            z2 = true;
        }
        if (z2) {
            Drawable drawable6 = this.i;
            if (z3) {
                setCompoundDrawablesRelative(drawable6, null, null, null);
            } else {
                setCompoundDrawablesRelative(null, null, drawable6, null);
            }
        }
    }

    public final void d() {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i = this.o;
        if (i == 1 || i == 3) {
            this.k = 0;
            c(false);
            return;
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        int min = Math.min((int) paint.measureText(charSequence), getLayout().getEllipsizedWidth());
        int i2 = this.j;
        if (i2 == 0) {
            i2 = this.i.getIntrinsicWidth();
        }
        int measuredWidth = getMeasuredWidth() - min;
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        int paddingEnd = ((((measuredWidth - getPaddingEnd()) - i2) - this.l) - getPaddingStart()) / 2;
        if ((getLayoutDirection() == 1) != (this.o == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.k != paddingEnd) {
            this.k = paddingEnd;
            c(false);
        }
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (b()) {
            return this.f4219d.g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.o;
    }

    public int getIconPadding() {
        return this.l;
    }

    public int getIconSize() {
        return this.j;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f4219d.l;
        }
        return null;
    }

    public m getShapeAppearanceModel() {
        if (b()) {
            return this.f4219d.f3869b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f4219d.k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f4219d.h;
        }
        return 0;
    }

    @Override // b.b.i.p
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.f4219d.j : super.getSupportBackgroundTintList();
    }

    @Override // b.b.i.p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.f4219d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.m;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            c.c.a.b.a.o(this, this.f4219d.b());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            Button.mergeDrawableStates(onCreateDrawableState, p);
        }
        if (isChecked()) {
            Button.mergeDrawableStates(onCreateDrawableState, q);
        }
        return onCreateDrawableState;
    }

    @Override // b.b.i.p, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // b.b.i.p, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // b.b.i.p, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        d();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f1349b);
        setChecked(cVar.f4222d);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f4222d = this.m;
        return cVar;
    }

    @Override // b.b.i.p, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        d();
    }

    @Override // android.view.View
    public boolean performClick() {
        toggle();
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!b()) {
            super.setBackgroundColor(i);
            return;
        }
        c.c.a.b.i.b bVar = this.f4219d;
        if (bVar.b() != null) {
            bVar.b().setTint(i);
        }
    }

    @Override // b.b.i.p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (b()) {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "Do not set the background; MaterialButton manages its own background drawable.");
            c.c.a.b.i.b bVar = this.f4219d;
            bVar.o = true;
            bVar.f3868a.setSupportBackgroundTintList(bVar.j);
            bVar.f3868a.setSupportBackgroundTintMode(bVar.i);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // b.b.i.p, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? b.b.d.a.a.a(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (b()) {
            this.f4219d.q = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (a() && isEnabled() && this.m != z) {
            this.m = z;
            refreshDrawableState();
            if (this.n) {
                return;
            }
            this.n = true;
            Iterator<a> it = this.f4220e.iterator();
            while (it.hasNext()) {
                it.next().a(this, this.m);
            }
            this.n = false;
        }
    }

    public void setCornerRadius(int i) {
        if (b()) {
            c.c.a.b.i.b bVar = this.f4219d;
            if (bVar.p && bVar.g == i) {
                return;
            }
            bVar.g = i;
            bVar.p = true;
            bVar.e(bVar.f3869b.e(i));
        }
    }

    public void setCornerRadiusResource(int i) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (b()) {
            i b2 = this.f4219d.b();
            h hVar = b2.f4024b;
            if (hVar.o != f2) {
                hVar.o = f2;
                b2.w();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            c(true);
        }
    }

    public void setIconGravity(int i) {
        if (this.o != i) {
            this.o = i;
            d();
        }
    }

    public void setIconPadding(int i) {
        if (this.l != i) {
            this.l = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? b.b.d.a.a.a(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.j != i) {
            this.j = i;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        Context context = getContext();
        ThreadLocal<TypedValue> threadLocal = b.b.d.a.a.f496a;
        setIconTint(context.getColorStateList(i));
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(b bVar) {
        this.f4221f = bVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        b bVar = this.f4221f;
        if (bVar != null) {
            bVar.a(this, z);
        }
        super.setPressed(z);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c.c.a.b.i.b bVar = this.f4219d;
            if (bVar.l != colorStateList) {
                bVar.l = colorStateList;
                if (bVar.f3868a.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) bVar.f3868a.getBackground()).setColor(c.c.a.b.s.a.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            Context context = getContext();
            ThreadLocal<TypedValue> threadLocal = b.b.d.a.a.f496a;
            setRippleColor(context.getColorStateList(i));
        }
    }

    @Override // c.c.a.b.u.w
    public void setShapeAppearanceModel(m mVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f4219d.e(mVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (b()) {
            c.c.a.b.i.b bVar = this.f4219d;
            bVar.n = z;
            bVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c.c.a.b.i.b bVar = this.f4219d;
            if (bVar.k != colorStateList) {
                bVar.k = colorStateList;
                bVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            Context context = getContext();
            ThreadLocal<TypedValue> threadLocal = b.b.d.a.a.f496a;
            setStrokeColor(context.getColorStateList(i));
        }
    }

    public void setStrokeWidth(int i) {
        if (b()) {
            c.c.a.b.i.b bVar = this.f4219d;
            if (bVar.h != i) {
                bVar.h = i;
                bVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // b.b.i.p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c.c.a.b.i.b bVar = this.f4219d;
        if (bVar.j != colorStateList) {
            bVar.j = colorStateList;
            if (bVar.b() != null) {
                bVar.b().setTintList(bVar.j);
            }
        }
    }

    @Override // b.b.i.p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c.c.a.b.i.b bVar = this.f4219d;
        if (bVar.i != mode) {
            bVar.i = mode;
            if (bVar.b() == null || bVar.i == null) {
                return;
            }
            bVar.b().setTintMode(bVar.i);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.m);
    }
}
