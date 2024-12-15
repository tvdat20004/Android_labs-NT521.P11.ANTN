package c.c.a.b.v;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import b.h.j.u;
import b.h.j.y;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public abstract class e extends FrameLayout {
    public static final View.OnTouchListener i = new d();

    /* renamed from: b, reason: collision with root package name */
    public c f4069b;

    /* renamed from: c, reason: collision with root package name */
    public b f4070c;

    /* renamed from: d, reason: collision with root package name */
    public int f4071d;

    /* renamed from: e, reason: collision with root package name */
    public final float f4072e;

    /* renamed from: f, reason: collision with root package name */
    public final float f4073f;
    public ColorStateList g;
    public PorterDuff.Mode h;

    public e(Context context, AttributeSet attributeSet) {
        super(c.c.a.b.x.a.a.a(context, attributeSet, 0, 0), attributeSet);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, c.c.a.b.b.t);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap<View, y> weakHashMap = u.f1311a;
            setElevation(dimensionPixelSize);
        }
        this.f4071d = obtainStyledAttributes.getInt(2, 0);
        this.f4072e = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(c.c.a.b.a.e(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(c.c.a.b.a.i(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f4073f = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        setOnTouchListener(i);
        setFocusable(true);
        if (getBackground() == null) {
            float dimension = getResources().getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(dimension);
            gradientDrawable.setColor(c.c.a.b.a.h(c.c.a.b.a.d(this, R.attr.colorSurface), c.c.a.b.a.d(this, R.attr.colorOnSurface), getBackgroundOverlayColorAlpha()));
            ColorStateList colorStateList = this.g;
            if (colorStateList != null) {
                gradientDrawable.setTintList(colorStateList);
            }
            WeakHashMap<View, y> weakHashMap2 = u.f1311a;
            setBackground(gradientDrawable);
        }
    }

    public float getActionTextColorAlpha() {
        return this.f4073f;
    }

    public int getAnimationMode() {
        return this.f4071d;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f4072e;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f4070c;
        if (bVar != null) {
            bVar.onViewAttachedToWindow(this);
        }
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        requestApplyInsets();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b bVar = this.f4070c;
        if (bVar != null) {
            bVar.onViewDetachedFromWindow(this);
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        super.onLayout(z, i2, i3, i4, i5);
        c cVar = this.f4069b;
        if (cVar != null) {
            cVar.a(this, i2, i3, i4, i5);
        }
    }

    public void setAnimationMode(int i2) {
        this.f4071d = i2;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.g != null) {
            drawable = drawable.mutate();
            drawable.setTintList(this.g);
            drawable.setTintMode(this.h);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.g = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintList(colorStateList);
            mutate.setTintMode(this.h);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.h = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            mutate.setTintMode(mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    public void setOnAttachStateChangeListener(b bVar) {
        this.f4070c = bVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : i);
        super.setOnClickListener(onClickListener);
    }

    public void setOnLayoutChangeListener(c cVar) {
        this.f4069b = cVar;
    }
}
