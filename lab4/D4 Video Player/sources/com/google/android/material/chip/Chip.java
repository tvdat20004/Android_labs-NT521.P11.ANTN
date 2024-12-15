package com.google.android.material.chip;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import b.b.i.q;
import b.h.b.h;
import b.h.j.k0.b;
import b.h.j.u;
import b.h.j.y;
import b.j.b.d;
import c.c.a.b.c.c;
import c.c.a.b.k.b;
import c.c.a.b.r.e;
import c.c.a.b.u.m;
import c.c.a.b.u.w;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class Chip extends q implements b.a, w {
    public static final Rect u = new Rect();
    public static final int[] v = {R.attr.state_selected};
    public static final int[] w = {R.attr.state_checkable};

    /* renamed from: e, reason: collision with root package name */
    public c.c.a.b.k.b f4223e;

    /* renamed from: f, reason: collision with root package name */
    public InsetDrawable f4224f;
    public RippleDrawable g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public int o;
    public int p;
    public final b q;
    public final Rect r;
    public final RectF s;
    public final e t;

    public class a extends e {
        public a() {
        }

        @Override // c.c.a.b.r.e
        public void a(int i) {
        }

        @Override // c.c.a.b.r.e
        public void b(Typeface typeface, boolean z) {
            Chip chip = Chip.this;
            c.c.a.b.k.b bVar = chip.f4223e;
            chip.setText(bVar.F0 ? bVar.G : chip.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    public class b extends d {
        public b(Chip chip) {
            super(chip);
        }

        @Override // b.j.b.d
        public void n(List<Integer> list) {
            boolean z = false;
            list.add(0);
            Chip chip = Chip.this;
            Rect rect = Chip.u;
            if (chip.d()) {
                Chip chip2 = Chip.this;
                c.c.a.b.k.b bVar = chip2.f4223e;
                if (bVar != null && bVar.M) {
                    z = true;
                }
                if (!z || chip2.h == null) {
                    return;
                }
                list.add(1);
            }
        }

        @Override // b.j.b.d
        public boolean q(int i, int i2, Bundle bundle) {
            boolean z = false;
            if (i2 == 16) {
                if (i == 0) {
                    return Chip.this.performClick();
                }
                if (i == 1) {
                    Chip chip = Chip.this;
                    chip.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip.h;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip);
                        z = true;
                    }
                    chip.q.t(1, 1);
                }
            }
            return z;
        }

        @Override // b.j.b.d
        public void r(int i, b.h.j.k0.b bVar) {
            if (i != 1) {
                bVar.f1286a.setContentDescription("");
                bVar.f1286a.setBoundsInParent(Chip.u);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription == null) {
                CharSequence text = Chip.this.getText();
                Context context = Chip.this.getContext();
                Object[] objArr = new Object[1];
                objArr[0] = TextUtils.isEmpty(text) ? "" : text;
                closeIconContentDescription = context.getString(razi.apa.ctf.videoPlayer.R.string.mtrl_chip_close_icon_content_description, objArr).trim();
            }
            bVar.f1286a.setContentDescription(closeIconContentDescription);
            bVar.f1286a.setBoundsInParent(Chip.this.getCloseIconTouchBoundsInt());
            bVar.a(b.a.g);
            bVar.f1286a.setEnabled(Chip.this.isEnabled());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0329  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Chip(android.content.Context r17, android.util.AttributeSet r18) {
        /*
            Method dump skipped, instructions count: 857
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RectF getCloseIconTouchBounds() {
        this.s.setEmpty();
        if (d()) {
            c.c.a.b.k.b bVar = this.f4223e;
            bVar.B(bVar.getBounds(), this.s);
        }
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.r.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.r;
    }

    private c.c.a.b.r.d getTextAppearance() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.m0.f3976f;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z) {
        if (this.l != z) {
            this.l = z;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z) {
        if (this.k != z) {
            this.k = z;
            refreshDrawableState();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r0.right == r7) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(int r10) {
        /*
            r9 = this;
            r9.p = r10
            boolean r0 = r9.n
            r1 = 0
            if (r0 != 0) goto L15
            android.graphics.drawable.InsetDrawable r10 = r9.f4224f
            if (r10 == 0) goto Lf
            r9.f()
            goto L14
        Lf:
            int[] r10 = c.c.a.b.s.a.f4002a
            r9.h()
        L14:
            return r1
        L15:
            c.c.a.b.k.b r0 = r9.f4223e
            float r0 = r0.B
            int r0 = (int) r0
            int r0 = r10 - r0
            int r0 = java.lang.Math.max(r1, r0)
            c.c.a.b.k.b r2 = r9.f4223e
            int r2 = r2.getIntrinsicWidth()
            int r2 = r10 - r2
            int r2 = java.lang.Math.max(r1, r2)
            if (r2 > 0) goto L3e
            if (r0 > 0) goto L3e
            android.graphics.drawable.InsetDrawable r10 = r9.f4224f
            if (r10 == 0) goto L38
            r9.f()
            goto L3d
        L38:
            int[] r10 = c.c.a.b.s.a.f4002a
            r9.h()
        L3d:
            return r1
        L3e:
            if (r2 <= 0) goto L44
            int r2 = r2 / 2
            r7 = r2
            goto L45
        L44:
            r7 = r1
        L45:
            if (r0 <= 0) goto L49
            int r1 = r0 / 2
        L49:
            r8 = r1
            android.graphics.drawable.InsetDrawable r0 = r9.f4224f
            r1 = 1
            if (r0 == 0) goto L6f
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            android.graphics.drawable.InsetDrawable r2 = r9.f4224f
            r2.getPadding(r0)
            int r2 = r0.top
            if (r2 != r8) goto L6f
            int r2 = r0.bottom
            if (r2 != r8) goto L6f
            int r2 = r0.left
            if (r2 != r7) goto L6f
            int r0 = r0.right
            if (r0 != r7) goto L6f
        L69:
            int[] r10 = c.c.a.b.s.a.f4002a
            r9.h()
            return r1
        L6f:
            int r0 = r9.getMinHeight()
            if (r0 == r10) goto L78
            r9.setMinHeight(r10)
        L78:
            int r0 = r9.getMinWidth()
            if (r0 == r10) goto L81
            r9.setMinWidth(r10)
        L81:
            android.graphics.drawable.InsetDrawable r10 = new android.graphics.drawable.InsetDrawable
            c.c.a.b.k.b r4 = r9.f4223e
            r3 = r10
            r5 = r7
            r6 = r8
            r3.<init>(r4, r5, r6, r7, r8)
            r9.f4224f = r10
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.c(int):boolean");
    }

    public final boolean d() {
        c.c.a.b.k.b bVar = this.f4223e;
        return (bVar == null || bVar.E() == null) ? false : true;
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        Field declaredField;
        boolean z;
        if (motionEvent.getAction() == 10) {
            try {
                declaredField = d.class.getDeclaredField("m");
                declaredField.setAccessible(true);
            } catch (IllegalAccessException | NoSuchFieldException | NoSuchMethodException | InvocationTargetException e2) {
                Log.e("Chip", "Unable to send Accessibility Exit event", e2);
            }
            if (((Integer) declaredField.get(this.q)).intValue() != Integer.MIN_VALUE) {
                Method declaredMethod = d.class.getDeclaredMethod("u", Integer.TYPE);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(this.q, Integer.MIN_VALUE);
                z = true;
                return !z ? true : true;
            }
        }
        z = false;
        return !z ? true : true;
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        b bVar = this.q;
        Objects.requireNonNull(bVar);
        boolean z = false;
        int i = 0;
        z = false;
        z = false;
        z = false;
        z = false;
        z = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z2 = false;
                                while (i < repeatCount && bVar.o(i2, null)) {
                                    i++;
                                    z2 = true;
                                }
                                z = z2;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = bVar.l;
                    if (i3 != Integer.MIN_VALUE) {
                        bVar.q(i3, 16, null);
                    }
                    z = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z = bVar.o(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z = bVar.o(1, null);
            }
        }
        if (!z || this.q.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // b.b.i.q, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        c.c.a.b.k.b bVar = this.f4223e;
        boolean z = false;
        int i = 0;
        z = false;
        if (bVar != null && c.c.a.b.k.b.G(bVar.N)) {
            c.c.a.b.k.b bVar2 = this.f4223e;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.m) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.l) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.k) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.m) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.l) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.k) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z = bVar2.c0(iArr);
        }
        if (z) {
            invalidate();
        }
    }

    public boolean e() {
        c.c.a.b.k.b bVar = this.f4223e;
        return bVar != null && bVar.S;
    }

    public final void f() {
        if (this.f4224f != null) {
            this.f4224f = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            int[] iArr = c.c.a.b.s.a.f4002a;
            h();
        }
    }

    public final void g() {
        b bVar;
        if (d()) {
            c.c.a.b.k.b bVar2 = this.f4223e;
            if ((bVar2 != null && bVar2.M) && this.h != null) {
                bVar = this.q;
                u.i(this, bVar);
            }
        }
        bVar = null;
        u.i(this, bVar);
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f4224f;
        return insetDrawable == null ? this.f4223e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.U;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.V;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.A;
        }
        return null;
    }

    public float getChipCornerRadius() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return Math.max(0.0f, bVar.D());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f4223e;
    }

    public float getChipEndPadding() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.f0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar == null || (drawable = bVar.I) == null) {
            return null;
        }
        return h.J(drawable);
    }

    public float getChipIconSize() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.K;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.J;
        }
        return null;
    }

    public float getChipMinHeight() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.B;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.Y;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.D;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.E;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.E();
        }
        return null;
    }

    public CharSequence getCloseIconContentDescription() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.R;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.e0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.Q;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.d0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.P;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.E0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        b bVar = this.q;
        if (bVar.l == 1 || bVar.k == 1) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    public c getHideMotionSpec() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.X;
        }
        return null;
    }

    public float getIconEndPadding() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.a0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.Z;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.F;
        }
        return null;
    }

    public m getShapeAppearanceModel() {
        return this.f4223e.f4024b.f4018a;
    }

    public c getShowMotionSpec() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.W;
        }
        return null;
    }

    public float getTextEndPadding() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.c0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            return bVar.b0;
        }
        return 0.0f;
    }

    public final void h() {
        this.g = new RippleDrawable(c.c.a.b.s.a.b(this.f4223e.F), getBackgroundDrawable(), null);
        this.f4223e.m0(false);
        RippleDrawable rippleDrawable = this.g;
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        setBackground(rippleDrawable);
        i();
    }

    public final void i() {
        c.c.a.b.k.b bVar;
        if (TextUtils.isEmpty(getText()) || (bVar = this.f4223e) == null) {
            return;
        }
        int C = (int) (bVar.C() + bVar.f0 + bVar.c0);
        c.c.a.b.k.b bVar2 = this.f4223e;
        int z = (int) (bVar2.z() + bVar2.Y + bVar2.b0);
        if (this.f4224f != null) {
            Rect rect = new Rect();
            this.f4224f.getPadding(rect);
            z += rect.left;
            C += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        setPaddingRelative(z, paddingTop, C, paddingBottom);
    }

    public final void j() {
        TextPaint paint = getPaint();
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            paint.drawableState = bVar.getState();
        }
        c.c.a.b.r.d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.c(getContext(), paint, this.t);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        c.c.a.b.a.o(this, this.f4223e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, v);
        }
        if (e()) {
            CheckBox.mergeDrawableStates(onCreateDrawableState, w);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        b bVar = this.q;
        int i2 = bVar.l;
        if (i2 != Integer.MIN_VALUE) {
            bVar.k(i2);
        }
        if (z) {
            bVar.o(i, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        boolean contains;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                contains = false;
            }
            return super.onHoverEvent(motionEvent);
        }
        contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        setCloseIconHovered(contains);
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName((e() || isClickable()) ? e() ? "android.widget.CompoundButton" : "android.widget.Button" : "android.view.View");
        accessibilityNodeInfo.setCheckable(e());
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof ChipGroup) {
            ChipGroup chipGroup = (ChipGroup) getParent();
            if (chipGroup.f3968d) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= chipGroup.getChildCount()) {
                        i3 = -1;
                        break;
                    }
                    if (chipGroup.getChildAt(i2) instanceof Chip) {
                        if (((Chip) chipGroup.getChildAt(i2)) == this) {
                            break;
                        } else {
                            i3++;
                        }
                    }
                    i2++;
                }
                i = i3;
            } else {
                i = -1;
            }
            Object tag = getTag(razi.apa.ctf.videoPlayer.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) b.c.a(tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1, false, isChecked()).f1296a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    @TargetApi(24)
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    @TargetApi(17)
    public void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.o != i) {
            this.o = i;
            i();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L25;
     */
    @Override // android.widget.TextView, android.view.View
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getActionMasked()
            android.graphics.RectF r1 = r5.getCloseIconTouchBounds()
            float r2 = r6.getX()
            float r3 = r6.getY()
            boolean r1 = r1.contains(r2, r3)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L45
            if (r0 == r3) goto L2b
            r4 = 2
            if (r0 == r4) goto L21
            r1 = 3
            if (r0 == r1) goto L40
            goto L4c
        L21:
            boolean r0 = r5.k
            if (r0 == 0) goto L4c
            if (r1 != 0) goto L4a
            r5.setCloseIconPressed(r2)
            goto L4a
        L2b:
            boolean r0 = r5.k
            if (r0 == 0) goto L40
            r5.playSoundEffect(r2)
            android.view.View$OnClickListener r0 = r5.h
            if (r0 == 0) goto L39
            r0.onClick(r5)
        L39:
            com.google.android.material.chip.Chip$b r0 = r5.q
            r0.t(r3, r3)
            r0 = r3
            goto L41
        L40:
            r0 = r2
        L41:
            r5.setCloseIconPressed(r2)
            goto L4d
        L45:
            if (r1 == 0) goto L4c
            r5.setCloseIconPressed(r3)
        L4a:
            r0 = r3
            goto L4d
        L4c:
            r0 = r2
        L4d:
            if (r0 != 0) goto L55
            boolean r6 = super.onTouchEvent(r6)
            if (r6 == 0) goto L56
        L55:
            r2 = r3
        L56:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.Chip.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // b.b.i.q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // b.b.i.q, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.J(z);
        }
    }

    public void setCheckableResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.J(bVar.g0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar == null) {
            this.j = z;
            return;
        }
        if (bVar.S) {
            boolean isChecked = isChecked();
            super.setChecked(z);
            if (isChecked == z || (onCheckedChangeListener = this.i) == null) {
                return;
            }
            onCheckedChangeListener.onCheckedChanged(this, z);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.K(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z) {
        setCheckedIconVisible(z);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.K(b.b.d.a.a.a(bVar.g0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.L(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            Context context = bVar.g0;
            ThreadLocal<TypedValue> threadLocal = b.b.d.a.a.f496a;
            bVar.L(context.getColorStateList(i));
        }
    }

    public void setCheckedIconVisible(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.M(bVar.g0.getResources().getBoolean(i));
        }
    }

    public void setCheckedIconVisible(boolean z) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.M(z);
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar == null || bVar.A == colorStateList) {
            return;
        }
        bVar.A = colorStateList;
        bVar.onStateChange(bVar.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            Context context = bVar.g0;
            ThreadLocal<TypedValue> threadLocal = b.b.d.a.a.f496a;
            bVar.N(context.getColorStateList(i));
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.O(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.O(bVar.g0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(c.c.a.b.k.b bVar) {
        c.c.a.b.k.b bVar2 = this.f4223e;
        if (bVar2 != bVar) {
            if (bVar2 != null) {
                bVar2.D0 = new WeakReference<>(null);
            }
            this.f4223e = bVar;
            bVar.F0 = false;
            Objects.requireNonNull(bVar);
            bVar.D0 = new WeakReference<>(this);
            c(this.p);
        }
    }

    public void setChipEndPadding(float f2) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar == null || bVar.f0 == f2) {
            return;
        }
        bVar.f0 = f2;
        bVar.invalidateSelf();
        bVar.H();
    }

    public void setChipEndPaddingResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.P(bVar.g0.getResources().getDimension(i));
        }
    }

    public void setChipIcon(Drawable drawable) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.Q(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z) {
        setChipIconVisible(z);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.Q(b.b.d.a.a.a(bVar.g0, i));
        }
    }

    public void setChipIconSize(float f2) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.R(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.R(bVar.g0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.S(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            Context context = bVar.g0;
            ThreadLocal<TypedValue> threadLocal = b.b.d.a.a.f496a;
            bVar.S(context.getColorStateList(i));
        }
    }

    public void setChipIconVisible(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.T(bVar.g0.getResources().getBoolean(i));
        }
    }

    public void setChipIconVisible(boolean z) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.T(z);
        }
    }

    public void setChipMinHeight(float f2) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar == null || bVar.B == f2) {
            return;
        }
        bVar.B = f2;
        bVar.invalidateSelf();
        bVar.H();
    }

    public void setChipMinHeightResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.U(bVar.g0.getResources().getDimension(i));
        }
    }

    public void setChipStartPadding(float f2) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar == null || bVar.Y == f2) {
            return;
        }
        bVar.Y = f2;
        bVar.invalidateSelf();
        bVar.H();
    }

    public void setChipStartPaddingResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.V(bVar.g0.getResources().getDimension(i));
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.W(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            Context context = bVar.g0;
            ThreadLocal<TypedValue> threadLocal = b.b.d.a.a.f496a;
            bVar.W(context.getColorStateList(i));
        }
    }

    public void setChipStrokeWidth(float f2) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.X(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.X(bVar.g0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.Y(drawable);
        }
        g();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar == null || bVar.R == charSequence) {
            return;
        }
        b.h.h.b c2 = b.h.h.b.c();
        bVar.R = c2.d(charSequence, c2.f1234c, true);
        bVar.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z) {
        setCloseIconVisible(z);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f2) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.Z(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.Z(bVar.g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.Y(b.b.d.a.a.a(bVar.g0, i));
        }
        g();
    }

    public void setCloseIconSize(float f2) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.a0(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.a0(bVar.g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.b0(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.b0(bVar.g0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.d0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            Context context = bVar.g0;
            ThreadLocal<TypedValue> threadLocal = b.b.d.a.a.f496a;
            bVar.d0(context.getColorStateList(i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    public void setCloseIconVisible(boolean z) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.e0(z);
        }
        g();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            c.c.a.b.u.h hVar = bVar.f4024b;
            if (hVar.o != f2) {
                hVar.o = f2;
                bVar.w();
            }
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f4223e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.E0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        this.n = z;
        c(this.p);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(c cVar) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.X = cVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.X = c.b(bVar.g0, i);
        }
    }

    public void setIconEndPadding(float f2) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.f0(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.f0(bVar.g0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f2) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.g0(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.g0(bVar.g0.getResources().getDimension(i));
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f4223e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.G0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    public void setOnCheckedChangeListenerInternal(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        g();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.h0(colorStateList);
        }
        if (this.f4223e.B0) {
            return;
        }
        h();
    }

    public void setRippleColorResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            Context context = bVar.g0;
            ThreadLocal<TypedValue> threadLocal = b.b.d.a.a.f496a;
            bVar.h0(context.getColorStateList(i));
            if (this.f4223e.B0) {
                return;
            }
            h();
        }
    }

    @Override // c.c.a.b.u.w
    public void setShapeAppearanceModel(m mVar) {
        c.c.a.b.k.b bVar = this.f4223e;
        bVar.f4024b.f4018a = mVar;
        bVar.invalidateSelf();
    }

    public void setShowMotionSpec(c cVar) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.W = cVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.W = c.b(bVar.g0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z) {
        if (!z) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(bVar.F0 ? null : charSequence, bufferType);
        c.c.a.b.k.b bVar2 = this.f4223e;
        if (bVar2 != null) {
            bVar2.i0(charSequence);
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.m0.b(new c.c.a.b.r.d(bVar.g0, i), bVar.g0);
        }
        j();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f2) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar == null || bVar.c0 == f2) {
            return;
        }
        bVar.c0 = f2;
        bVar.invalidateSelf();
        bVar.H();
    }

    public void setTextEndPaddingResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.k0(bVar.g0.getResources().getDimension(i));
        }
    }

    public void setTextStartPadding(float f2) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar == null || bVar.b0 == f2) {
            return;
        }
        bVar.b0 = f2;
        bVar.invalidateSelf();
        bVar.H();
    }

    public void setTextStartPaddingResource(int i) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.l0(bVar.g0.getResources().getDimension(i));
        }
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.m0.b(new c.c.a.b.r.d(bVar.g0, i), bVar.g0);
        }
        j();
    }

    public void setTextAppearance(c.c.a.b.r.d dVar) {
        c.c.a.b.k.b bVar = this.f4223e;
        if (bVar != null) {
            bVar.m0.b(dVar, bVar.g0);
        }
        j();
    }
}
