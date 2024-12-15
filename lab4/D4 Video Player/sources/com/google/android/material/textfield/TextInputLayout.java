package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import b.b.i.d1;
import b.b.i.v0;
import b.h.j.u;
import c.c.a.b.u.i;
import c.c.a.b.u.m;
import c.c.a.b.w.a0;
import c.c.a.b.w.j0;
import c.c.a.b.w.l;
import c.c.a.b.w.y;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout {
    public CharSequence A;
    public int A0;
    public boolean B;
    public int B0;
    public i C;
    public int C0;
    public i D;
    public boolean D0;
    public m E;
    public final c.c.a.b.p.d E0;
    public final int F;
    public boolean F0;
    public int G;
    public ValueAnimator G0;
    public final int H;
    public boolean H0;
    public int I;
    public boolean I0;
    public int J;
    public int K;
    public int L;
    public int M;
    public final Rect N;
    public final Rect O;
    public final RectF P;
    public Typeface Q;
    public final CheckableImageButton R;
    public ColorStateList S;
    public boolean T;
    public PorterDuff.Mode U;
    public boolean V;
    public Drawable W;
    public int a0;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f4246b;
    public View.OnLongClickListener b0;

    /* renamed from: c, reason: collision with root package name */
    public final LinearLayout f4247c;
    public final LinkedHashSet<f> c0;

    /* renamed from: d, reason: collision with root package name */
    public final LinearLayout f4248d;
    public int d0;

    /* renamed from: e, reason: collision with root package name */
    public final FrameLayout f4249e;
    public final SparseArray<y> e0;

    /* renamed from: f, reason: collision with root package name */
    public EditText f4250f;
    public final CheckableImageButton f0;
    public CharSequence g;
    public final LinkedHashSet<g> g0;
    public final a0 h;
    public ColorStateList h0;
    public boolean i;
    public boolean i0;
    public int j;
    public PorterDuff.Mode j0;
    public boolean k;
    public boolean k0;
    public TextView l;
    public Drawable l0;
    public int m;
    public int m0;
    public int n;
    public Drawable n0;
    public CharSequence o;
    public View.OnLongClickListener o0;
    public boolean p;
    public View.OnLongClickListener p0;
    public TextView q;
    public final CheckableImageButton q0;
    public ColorStateList r;
    public ColorStateList r0;
    public int s;
    public ColorStateList s0;
    public ColorStateList t;
    public ColorStateList t0;
    public ColorStateList u;
    public int u0;
    public CharSequence v;
    public int v0;
    public final TextView w;
    public int w0;
    public CharSequence x;
    public ColorStateList x0;
    public final TextView y;
    public int y0;
    public boolean z;
    public int z0;

    public class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout.this.y(!r0.I0, false);
            TextInputLayout textInputLayout = TextInputLayout.this;
            if (textInputLayout.i) {
                textInputLayout.s(editable.length());
            }
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.p) {
                textInputLayout2.z(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f0.performClick();
            TextInputLayout.this.f0.jumpDrawablesToCurrentState();
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f4250f.requestLayout();
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.E0.o(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    public static class e extends b.h.j.b {

        /* renamed from: d, reason: collision with root package name */
        public final TextInputLayout f4255d;

        public e(TextInputLayout textInputLayout) {
            this.f4255d = textInputLayout;
        }

        @Override // b.h.j.b
        public void d(View view, b.h.j.k0.b bVar) {
            this.f1254a.onInitializeAccessibilityNodeInfo(view, bVar.f1286a);
            EditText editText = this.f4255d.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.f4255d.getHint();
            CharSequence helperText = this.f4255d.getHelperText();
            CharSequence error = this.f4255d.getError();
            int counterMaxLength = this.f4255d.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f4255d.getCounterOverflowDescription();
            boolean z = true;
            boolean z2 = !TextUtils.isEmpty(text);
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z4 = !TextUtils.isEmpty(helperText);
            boolean z5 = !TextUtils.isEmpty(error);
            if (!z5 && TextUtils.isEmpty(counterOverflowDescription)) {
                z = false;
            }
            String charSequence = z3 ? hint.toString() : "";
            StringBuilder j = c.a.a.a.a.j(charSequence);
            j.append(((z5 || z4) && !TextUtils.isEmpty(charSequence)) ? ", " : "");
            StringBuilder j2 = c.a.a.a.a.j(j.toString());
            if (z5) {
                helperText = error;
            } else if (!z4) {
                helperText = "";
            }
            j2.append((Object) helperText);
            String sb = j2.toString();
            if (z2) {
                bVar.f1286a.setText(text);
            } else if (!TextUtils.isEmpty(sb)) {
                bVar.f1286a.setText(sb);
            }
            if (!TextUtils.isEmpty(sb)) {
                int i = Build.VERSION.SDK_INT;
                if (i >= 26) {
                    bVar.p(sb);
                } else {
                    if (z2) {
                        sb = ((Object) text) + ", " + sb;
                    }
                    bVar.f1286a.setText(sb);
                }
                boolean z6 = !z2;
                if (i >= 26) {
                    bVar.f1286a.setShowingHintText(z6);
                } else {
                    bVar.m(4, z6);
                }
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            bVar.f1286a.setMaxTextLength(counterMaxLength);
            if (z) {
                if (!z5) {
                    error = counterOverflowDescription;
                }
                bVar.f1286a.setError(error);
            }
        }
    }

    public interface f {
        void a(TextInputLayout textInputLayout);
    }

    public interface g {
        void a(TextInputLayout textInputLayout, int i);
    }

    public static class h extends b.j.a.c {
        public static final Parcelable.Creator<h> CREATOR = new j0();

        /* renamed from: d, reason: collision with root package name */
        public CharSequence f4256d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f4257e;

        public h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4256d = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f4257e = parcel.readInt() == 1;
        }

        public h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder j = c.a.a.a.a.j("TextInputLayout.SavedState{");
            j.append(Integer.toHexString(System.identityHashCode(this)));
            j.append(" error=");
            j.append((Object) this.f4256d);
            j.append("}");
            return j.toString();
        }

        @Override // b.j.a.c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1349b, i);
            TextUtils.writeToParcel(this.f4256d, parcel, i);
            parcel.writeInt(this.f4257e ? 1 : 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x052e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x056e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x05a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public TextInputLayout(android.content.Context r31, android.util.AttributeSet r32) {
        /*
            Method dump skipped, instructions count: 1504
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private y getEndIconDelegate() {
        y yVar = this.e0.get(this.d0);
        return yVar != null ? yVar : this.e0.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.q0.getVisibility() == 0) {
            return this.q0;
        }
        if (k() && l()) {
            return this.f0;
        }
        return null;
    }

    public static void o(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                o((ViewGroup) childAt, z);
            }
        }
    }

    public static void p(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap<View, b.h.j.y> weakHashMap = u.f1311a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = hasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    private void setEditText(EditText editText) {
        if (this.f4250f != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.d0 != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f4250f = editText;
        m();
        setTextInputAccessibilityDelegate(new e(this));
        this.E0.q(this.f4250f.getTypeface());
        c.c.a.b.p.d dVar = this.E0;
        float textSize = this.f4250f.getTextSize();
        if (dVar.i != textSize) {
            dVar.i = textSize;
            dVar.k();
        }
        int gravity = this.f4250f.getGravity();
        this.E0.n((gravity & (-113)) | 48);
        c.c.a.b.p.d dVar2 = this.E0;
        if (dVar2.g != gravity) {
            dVar2.g = gravity;
            dVar2.k();
        }
        this.f4250f.addTextChangedListener(new a());
        if (this.s0 == null) {
            this.s0 = this.f4250f.getHintTextColors();
        }
        if (this.z) {
            if (TextUtils.isEmpty(this.A)) {
                CharSequence hint = this.f4250f.getHint();
                this.g = hint;
                setHint(hint);
                this.f4250f.setHint((CharSequence) null);
            }
            this.B = true;
        }
        if (this.l != null) {
            s(this.f4250f.getText().length());
        }
        v();
        this.h.b();
        this.f4247c.bringToFront();
        this.f4248d.bringToFront();
        this.f4249e.bringToFront();
        this.q0.bringToFront();
        Iterator<f> it = this.c0.iterator();
        while (it.hasNext()) {
            it.next().a(this);
        }
        A();
        D();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        y(false, true);
    }

    private void setErrorIconVisible(boolean z) {
        this.q0.setVisibility(z ? 0 : 8);
        this.f4249e.setVisibility(z ? 8 : 0);
        D();
        if (k()) {
            return;
        }
        u();
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.A)) {
            return;
        }
        this.A = charSequence;
        c.c.a.b.p.d dVar = this.E0;
        if (charSequence == null || !TextUtils.equals(dVar.w, charSequence)) {
            dVar.w = charSequence;
            dVar.x = null;
            Bitmap bitmap = dVar.z;
            if (bitmap != null) {
                bitmap.recycle();
                dVar.z = null;
            }
            dVar.k();
        }
        if (this.D0) {
            return;
        }
        n();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.p == z) {
            return;
        }
        if (z) {
            v0 v0Var = new v0(getContext());
            this.q = v0Var;
            v0Var.setId(R.id.textinput_placeholder);
            this.q.setAccessibilityLiveRegion(1);
            setPlaceholderTextAppearance(this.s);
            setPlaceholderTextColor(this.r);
            TextView textView = this.q;
            if (textView != null) {
                this.f4246b.addView(textView);
                this.q.setVisibility(0);
            }
        } else {
            TextView textView2 = this.q;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
            this.q = null;
        }
        this.p = z;
    }

    public final void A() {
        int paddingStart;
        if (this.f4250f == null) {
            return;
        }
        if (this.R.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            EditText editText = this.f4250f;
            WeakHashMap<View, b.h.j.y> weakHashMap = u.f1311a;
            paddingStart = editText.getPaddingStart();
        }
        TextView textView = this.w;
        int compoundPaddingTop = this.f4250f.getCompoundPaddingTop();
        int compoundPaddingBottom = this.f4250f.getCompoundPaddingBottom();
        WeakHashMap<View, b.h.j.y> weakHashMap2 = u.f1311a;
        textView.setPaddingRelative(paddingStart, compoundPaddingTop, 0, compoundPaddingBottom);
    }

    public final void B() {
        this.w.setVisibility((this.v == null || this.D0) ? 8 : 0);
        u();
    }

    public final void C(boolean z, boolean z2) {
        int defaultColor = this.x0.getDefaultColor();
        int colorForState = this.x0.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.x0.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z) {
            this.L = colorForState2;
        } else if (z2) {
            this.L = colorForState;
        } else {
            this.L = defaultColor;
        }
    }

    public final void D() {
        int i;
        if (this.f4250f == null) {
            return;
        }
        if (!l()) {
            if (!(this.q0.getVisibility() == 0)) {
                EditText editText = this.f4250f;
                WeakHashMap<View, b.h.j.y> weakHashMap = u.f1311a;
                i = editText.getPaddingEnd();
                TextView textView = this.y;
                int paddingTop = this.f4250f.getPaddingTop();
                int paddingBottom = this.f4250f.getPaddingBottom();
                WeakHashMap<View, b.h.j.y> weakHashMap2 = u.f1311a;
                textView.setPaddingRelative(0, paddingTop, i, paddingBottom);
            }
        }
        i = 0;
        TextView textView2 = this.y;
        int paddingTop2 = this.f4250f.getPaddingTop();
        int paddingBottom2 = this.f4250f.getPaddingBottom();
        WeakHashMap<View, b.h.j.y> weakHashMap22 = u.f1311a;
        textView2.setPaddingRelative(0, paddingTop2, i, paddingBottom2);
    }

    public final void E() {
        int visibility = this.y.getVisibility();
        boolean z = (this.x == null || this.D0) ? false : true;
        this.y.setVisibility(z ? 0 : 8);
        if (visibility != this.y.getVisibility()) {
            getEndIconDelegate().c(z);
        }
        u();
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void F() {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.F():void");
    }

    public void a(f fVar) {
        this.c0.add(fVar);
        if (this.f4250f != null) {
            fVar.a(this);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.f4246b.addView(view, layoutParams2);
        this.f4246b.setLayoutParams(layoutParams);
        x();
        setEditText((EditText) view);
    }

    public void b(float f2) {
        if (this.E0.f3960c == f2) {
            return;
        }
        if (this.G0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.G0 = valueAnimator;
            valueAnimator.setInterpolator(c.c.a.b.c.a.f3810b);
            this.G0.setDuration(167L);
            this.G0.addUpdateListener(new d());
        }
        this.G0.setFloatValues(this.E0.f3960c, f2);
        this.G0.start();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r6 = this;
            c.c.a.b.u.i r0 = r6.C
            if (r0 != 0) goto L5
            return
        L5:
            c.c.a.b.u.m r1 = r6.E
            r0.setShapeAppearanceModel(r1)
            int r0 = r6.G
            r1 = 2
            r2 = -1
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L21
            int r0 = r6.I
            if (r0 <= r2) goto L1c
            int r0 = r6.L
            if (r0 == 0) goto L1c
            r0 = r4
            goto L1d
        L1c:
            r0 = r3
        L1d:
            if (r0 == 0) goto L21
            r0 = r4
            goto L22
        L21:
            r0 = r3
        L22:
            if (r0 == 0) goto L2e
            c.c.a.b.u.i r0 = r6.C
            int r1 = r6.I
            float r1 = (float) r1
            int r5 = r6.L
            r0.r(r1, r5)
        L2e:
            int r0 = r6.M
            int r1 = r6.G
            if (r1 != r4) goto L45
            r0 = 2130903244(0x7f0300cc, float:1.74133E38)
            android.content.Context r1 = r6.getContext()
            int r0 = c.c.a.b.a.c(r1, r0, r3)
            int r1 = r6.M
            int r0 = b.h.d.a.a(r1, r0)
        L45:
            r6.M = r0
            c.c.a.b.u.i r1 = r6.C
            android.content.res.ColorStateList r0 = android.content.res.ColorStateList.valueOf(r0)
            r1.p(r0)
            int r0 = r6.d0
            r1 = 3
            if (r0 != r1) goto L5e
            android.widget.EditText r0 = r6.f4250f
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            r0.invalidateSelf()
        L5e:
            c.c.a.b.u.i r0 = r6.D
            if (r0 != 0) goto L63
            goto L7a
        L63:
            int r1 = r6.I
            if (r1 <= r2) goto L6c
            int r1 = r6.L
            if (r1 == 0) goto L6c
            r3 = r4
        L6c:
            if (r3 == 0) goto L77
            int r1 = r6.L
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.p(r1)
        L77:
            r6.invalidate()
        L7a:
            r6.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.c():void");
    }

    public final void d() {
        e(this.f0, this.i0, this.h0, this.k0, this.j0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText;
        if (this.g == null || (editText = this.f4250f) == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        boolean z = this.B;
        this.B = false;
        CharSequence hint = editText.getHint();
        this.f4250f.setHint(this.g);
        try {
            super.dispatchProvideAutofillStructure(viewStructure, i);
        } finally {
            this.f4250f.setHint(hint);
            this.B = z;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.I0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.I0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.z) {
            c.c.a.b.p.d dVar = this.E0;
            Objects.requireNonNull(dVar);
            int save = canvas.save();
            if (dVar.x != null && dVar.f3959b) {
                dVar.M.getLineLeft(0);
                dVar.E.setTextSize(dVar.B);
                float f2 = dVar.q;
                float f3 = dVar.r;
                float f4 = dVar.A;
                if (f4 != 1.0f) {
                    canvas.scale(f4, f4, f2, f3);
                }
                canvas.translate(f2, f3);
                dVar.M.draw(canvas);
                canvas.restoreToCount(save);
            }
        }
        i iVar = this.D;
        if (iVar != null) {
            Rect bounds = iVar.getBounds();
            bounds.top = bounds.bottom - this.I;
            this.D.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        boolean z2;
        if (this.H0) {
            return;
        }
        this.H0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        c.c.a.b.p.d dVar = this.E0;
        if (dVar != null) {
            dVar.C = drawableState;
            ColorStateList colorStateList2 = dVar.l;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = dVar.k) != null && colorStateList.isStateful())) {
                dVar.k();
                z2 = true;
            } else {
                z2 = false;
            }
            z = z2 | false;
        } else {
            z = false;
        }
        if (this.f4250f != null) {
            WeakHashMap<View, b.h.j.y> weakHashMap = u.f1311a;
            y(isLaidOut() && isEnabled(), false);
        }
        v();
        F();
        if (z) {
            invalidate();
        }
        this.H0 = false;
    }

    public final void e(CheckableImageButton checkableImageButton, boolean z, ColorStateList colorStateList, boolean z2, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null && (z || z2)) {
            drawable = drawable.mutate();
            if (z) {
                drawable.setTintList(colorStateList);
            }
            if (z2) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public final void f() {
        e(this.R, this.T, this.S, this.V, this.U);
    }

    public final int g() {
        float f2;
        if (!this.z) {
            return 0;
        }
        int i = this.G;
        if (i == 0 || i == 1) {
            f2 = this.E0.f();
        } else {
            if (i != 2) {
                return 0;
            }
            f2 = this.E0.f() / 2.0f;
        }
        return (int) f2;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f4250f;
        if (editText == null) {
            return super.getBaseline();
        }
        return g() + getPaddingTop() + editText.getBaseline();
    }

    public i getBoxBackground() {
        int i = this.G;
        if (i == 1 || i == 2) {
            return this.C;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.M;
    }

    public int getBoxBackgroundMode() {
        return this.G;
    }

    public float getBoxCornerRadiusBottomEnd() {
        i iVar = this.C;
        return iVar.f4024b.f4018a.h.a(iVar.h());
    }

    public float getBoxCornerRadiusBottomStart() {
        i iVar = this.C;
        return iVar.f4024b.f4018a.g.a(iVar.h());
    }

    public float getBoxCornerRadiusTopEnd() {
        i iVar = this.C;
        return iVar.f4024b.f4018a.f4035f.a(iVar.h());
    }

    public float getBoxCornerRadiusTopStart() {
        return this.C.l();
    }

    public int getBoxStrokeColor() {
        return this.w0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.x0;
    }

    public int getBoxStrokeWidth() {
        return this.J;
    }

    public int getBoxStrokeWidthFocused() {
        return this.K;
    }

    public int getCounterMaxLength() {
        return this.j;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.i && this.k && (textView = this.l) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.t;
    }

    public ColorStateList getCounterTextColor() {
        return this.t;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.s0;
    }

    public EditText getEditText() {
        return this.f4250f;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f0.getDrawable();
    }

    public int getEndIconMode() {
        return this.d0;
    }

    public CheckableImageButton getEndIconView() {
        return this.f0;
    }

    public CharSequence getError() {
        a0 a0Var = this.h;
        if (a0Var.l) {
            return a0Var.k;
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.h.n;
    }

    public int getErrorCurrentTextColors() {
        return this.h.g();
    }

    public Drawable getErrorIconDrawable() {
        return this.q0.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.h.g();
    }

    public CharSequence getHelperText() {
        a0 a0Var = this.h;
        if (a0Var.r) {
            return a0Var.q;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        TextView textView = this.h.s;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.z) {
            return this.A;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.E0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.E0.g();
    }

    public ColorStateList getHintTextColor() {
        return this.t0;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.p) {
            return this.o;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.s;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.r;
    }

    public CharSequence getPrefixText() {
        return this.v;
    }

    public ColorStateList getPrefixTextColor() {
        return this.w.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.w;
    }

    public CharSequence getStartIconContentDescription() {
        return this.R.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.R.getDrawable();
    }

    public CharSequence getSuffixText() {
        return this.x;
    }

    public ColorStateList getSuffixTextColor() {
        return this.y.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.y;
    }

    public Typeface getTypeface() {
        return this.Q;
    }

    public final boolean h() {
        return this.z && !TextUtils.isEmpty(this.A) && (this.C instanceof l);
    }

    public final int i(int i, boolean z) {
        int compoundPaddingLeft = this.f4250f.getCompoundPaddingLeft() + i;
        return (this.v == null || z) ? compoundPaddingLeft : (compoundPaddingLeft - this.w.getMeasuredWidth()) + this.w.getPaddingLeft();
    }

    public final int j(int i, boolean z) {
        int compoundPaddingRight = i - this.f4250f.getCompoundPaddingRight();
        return (this.v == null || !z) ? compoundPaddingRight : compoundPaddingRight + (this.w.getMeasuredWidth() - this.w.getPaddingRight());
    }

    public final boolean k() {
        return this.d0 != 0;
    }

    public boolean l() {
        return this.f4249e.getVisibility() == 0 && this.f0.getVisibility() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m() {
        /*
            r4 = this;
            int r0 = r4.G
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L51
            if (r0 == r2) goto L40
            r3 = 2
            if (r0 != r3) goto L27
            boolean r0 = r4.z
            if (r0 == 0) goto L1d
            c.c.a.b.u.i r0 = r4.C
            boolean r0 = r0 instanceof c.c.a.b.w.l
            if (r0 != 0) goto L1d
            c.c.a.b.w.l r0 = new c.c.a.b.w.l
            c.c.a.b.u.m r3 = r4.E
            r0.<init>(r3)
            goto L24
        L1d:
            c.c.a.b.u.i r0 = new c.c.a.b.u.i
            c.c.a.b.u.m r3 = r4.E
            r0.<init>(r3)
        L24:
            r4.C = r0
            goto L53
        L27:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r4.G
            r1.append(r2)
            java.lang.String r2 = " is illegal; only @BoxBackgroundMode constants are supported."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L40:
            c.c.a.b.u.i r0 = new c.c.a.b.u.i
            c.c.a.b.u.m r1 = r4.E
            r0.<init>(r1)
            r4.C = r0
            c.c.a.b.u.i r0 = new c.c.a.b.u.i
            r0.<init>()
            r4.D = r0
            goto L55
        L51:
            r4.C = r1
        L53:
            r4.D = r1
        L55:
            android.widget.EditText r0 = r4.f4250f
            if (r0 == 0) goto L68
            c.c.a.b.u.i r1 = r4.C
            if (r1 == 0) goto L68
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            if (r0 != 0) goto L68
            int r0 = r4.G
            if (r0 == 0) goto L68
            goto L69
        L68:
            r2 = 0
        L69:
            if (r2 == 0) goto L74
            android.widget.EditText r0 = r4.f4250f
            c.c.a.b.u.i r1 = r4.C
            java.util.WeakHashMap<android.view.View, b.h.j.y> r2 = b.h.j.u.f1311a
            r0.setBackground(r1)
        L74:
            r4.F()
            int r0 = r4.G
            if (r0 == 0) goto L7e
            r4.x()
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.m():void");
    }

    public final void n() {
        float f2;
        float b2;
        float f3;
        if (h()) {
            RectF rectF = this.P;
            c.c.a.b.p.d dVar = this.E0;
            int width = this.f4250f.getWidth();
            int gravity = this.f4250f.getGravity();
            boolean c2 = dVar.c(dVar.w);
            dVar.y = c2;
            if (gravity == 17 || (gravity & 7) == 1) {
                f2 = width / 2.0f;
                b2 = dVar.b() / 2.0f;
            } else {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? c2 : !c2) {
                    f3 = dVar.f3962e.left;
                    rectF.left = f3;
                    Rect rect = dVar.f3962e;
                    rectF.top = rect.top;
                    rectF.right = (gravity != 17 || (gravity & 7) == 1) ? (width / 2.0f) + (dVar.b() / 2.0f) : ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? !dVar.y : dVar.y) ? rect.right : dVar.b() + f3;
                    float f4 = dVar.f() + dVar.f3962e.top;
                    rectF.bottom = f4;
                    float f5 = rectF.left;
                    float f6 = this.F;
                    rectF.left = f5 - f6;
                    rectF.top -= f6;
                    rectF.right += f6;
                    rectF.bottom = f4 + f6;
                    rectF.offset(-getPaddingLeft(), -getPaddingTop());
                    l lVar = (l) this.C;
                    Objects.requireNonNull(lVar);
                    lVar.x(rectF.left, rectF.top, rectF.right, rectF.bottom);
                }
                f2 = dVar.f3962e.right;
                b2 = dVar.b();
            }
            f3 = f2 - b2;
            rectF.left = f3;
            Rect rect2 = dVar.f3962e;
            rectF.top = rect2.top;
            rectF.right = (gravity != 17 || (gravity & 7) == 1) ? (width / 2.0f) + (dVar.b() / 2.0f) : ((gravity & 8388613) == 8388613 || (gravity & 5) == 5 ? !dVar.y : dVar.y) ? rect2.right : dVar.b() + f3;
            float f42 = dVar.f() + dVar.f3962e.top;
            rectF.bottom = f42;
            float f52 = rectF.left;
            float f62 = this.F;
            rectF.left = f52 - f62;
            rectF.top -= f62;
            rectF.right += f62;
            rectF.bottom = f42 + f62;
            rectF.offset(-getPaddingLeft(), -getPaddingTop());
            l lVar2 = (l) this.C;
            Objects.requireNonNull(lVar2);
            lVar2.x(rectF.left, rectF.top, rectF.right, rectF.bottom);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0171  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r5, int r6, int r7, int r8, int r9) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        EditText editText;
        int max;
        super.onMeasure(i, i2);
        boolean z = false;
        if (this.f4250f != null && this.f4250f.getMeasuredHeight() < (max = Math.max(this.f4248d.getMeasuredHeight(), this.f4247c.getMeasuredHeight()))) {
            this.f4250f.setMinimumHeight(max);
            z = true;
        }
        boolean u = u();
        if (z || u) {
            this.f4250f.post(new c());
        }
        if (this.q != null && (editText = this.f4250f) != null) {
            this.q.setGravity(editText.getGravity());
            this.q.setPadding(this.f4250f.getCompoundPaddingLeft(), this.f4250f.getCompoundPaddingTop(), this.f4250f.getCompoundPaddingRight(), this.f4250f.getCompoundPaddingBottom());
        }
        A();
        D();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.f1349b);
        setError(hVar.f4256d);
        if (hVar.f4257e) {
            this.f0.post(new b());
        }
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        if (this.h.e()) {
            hVar.f4256d = getError();
        }
        hVar.f4257e = k() && this.f0.isChecked();
        return hVar;
    }

    public void q(TextView textView, int i) {
        boolean z = true;
        try {
            textView.setTextAppearance(i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            textView.setTextAppearance(R.style.TextAppearance_AppCompat_Caption);
            Context context = getContext();
            Object obj = b.h.b.b.f1117a;
            textView.setTextColor(context.getColor(R.color.design_error));
        }
    }

    public final void r() {
        if (this.l != null) {
            EditText editText = this.f4250f;
            s(editText == null ? 0 : editText.getText().length());
        }
    }

    public void s(int i) {
        boolean z = this.k;
        int i2 = this.j;
        if (i2 == -1) {
            this.l.setText(String.valueOf(i));
            this.l.setContentDescription(null);
            this.k = false;
        } else {
            this.k = i > i2;
            Context context = getContext();
            this.l.setContentDescription(context.getString(this.k ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i), Integer.valueOf(this.j)));
            if (z != this.k) {
                t();
            }
            b.h.h.b c2 = b.h.h.b.c();
            TextView textView = this.l;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i), Integer.valueOf(this.j));
            textView.setText(string != null ? c2.d(string, c2.f1234c, true).toString() : null);
        }
        if (this.f4250f == null || z == this.k) {
            return;
        }
        y(false, false);
        F();
        v();
    }

    public void setBoxBackgroundColor(int i) {
        if (this.M != i) {
            this.M = i;
            this.y0 = i;
            this.A0 = i;
            this.B0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        Context context = getContext();
        Object obj = b.h.b.b.f1117a;
        setBoxBackgroundColor(context.getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.y0 = defaultColor;
        this.M = defaultColor;
        this.z0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.A0 = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.B0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.G) {
            return;
        }
        this.G = i;
        if (this.f4250f != null) {
            m();
        }
    }

    public void setBoxStrokeColor(int i) {
        if (this.w0 != i) {
            this.w0 = i;
            F();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.w0 != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            F();
        } else {
            this.u0 = colorStateList.getDefaultColor();
            this.C0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.v0 = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        }
        this.w0 = defaultColor;
        F();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.x0 != colorStateList) {
            this.x0 = colorStateList;
            F();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.J = i;
        F();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.K = i;
        F();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.i != z) {
            if (z) {
                v0 v0Var = new v0(getContext());
                this.l = v0Var;
                v0Var.setId(R.id.textinput_counter);
                Typeface typeface = this.Q;
                if (typeface != null) {
                    this.l.setTypeface(typeface);
                }
                this.l.setMaxLines(1);
                this.h.a(this.l, 2);
                ((ViewGroup.MarginLayoutParams) this.l.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                t();
                r();
            } else {
                this.h.i(this.l, 2);
                this.l = null;
            }
            this.i = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.j != i) {
            if (i <= 0) {
                i = -1;
            }
            this.j = i;
            if (this.i) {
                r();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.m != i) {
            this.m = i;
            t();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.u != colorStateList) {
            this.u = colorStateList;
            t();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.n != i) {
            this.n = i;
            t();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.t != colorStateList) {
            this.t = colorStateList;
            t();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.s0 = colorStateList;
        this.t0 = colorStateList;
        if (this.f4250f != null) {
            y(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        o(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? b.b.d.a.a.a(getContext(), i) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f0.setImageDrawable(drawable);
    }

    public void setEndIconMode(int i) {
        int i2 = this.d0;
        this.d0 = i;
        Iterator<g> it = this.g0.iterator();
        while (it.hasNext()) {
            it.next().a(this, i2);
        }
        setEndIconVisible(i != 0);
        if (getEndIconDelegate().b(this.G)) {
            getEndIconDelegate().a();
            d();
        } else {
            StringBuilder j = c.a.a.a.a.j("The current box background mode ");
            j.append(this.G);
            j.append(" is not supported by the end icon mode ");
            j.append(i);
            throw new IllegalStateException(j.toString());
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.f0;
        View.OnLongClickListener onLongClickListener = this.o0;
        checkableImageButton.setOnClickListener(onClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.o0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.f0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.h0 != colorStateList) {
            this.h0 = colorStateList;
            this.i0 = true;
            d();
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.j0 != mode) {
            this.j0 = mode;
            this.k0 = true;
            d();
        }
    }

    public void setEndIconVisible(boolean z) {
        if (l() != z) {
            this.f0.setVisibility(z ? 0 : 8);
            D();
            u();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.h.l) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.h.h();
            return;
        }
        a0 a0Var = this.h;
        a0Var.c();
        a0Var.k = charSequence;
        a0Var.m.setText(charSequence);
        int i = a0Var.i;
        if (i != 1) {
            a0Var.j = 1;
        }
        a0Var.k(i, a0Var.j, a0Var.j(a0Var.m, charSequence));
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        a0 a0Var = this.h;
        a0Var.n = charSequence;
        TextView textView = a0Var.m;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        a0 a0Var = this.h;
        if (a0Var.l == z) {
            return;
        }
        a0Var.c();
        if (z) {
            v0 v0Var = new v0(a0Var.f4079a);
            a0Var.m = v0Var;
            v0Var.setId(R.id.textinput_error);
            a0Var.m.setTextAlignment(5);
            Typeface typeface = a0Var.v;
            if (typeface != null) {
                a0Var.m.setTypeface(typeface);
            }
            int i = a0Var.o;
            a0Var.o = i;
            TextView textView = a0Var.m;
            if (textView != null) {
                a0Var.f4080b.q(textView, i);
            }
            ColorStateList colorStateList = a0Var.p;
            a0Var.p = colorStateList;
            TextView textView2 = a0Var.m;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            CharSequence charSequence = a0Var.n;
            a0Var.n = charSequence;
            TextView textView3 = a0Var.m;
            if (textView3 != null) {
                textView3.setContentDescription(charSequence);
            }
            a0Var.m.setVisibility(4);
            a0Var.m.setAccessibilityLiveRegion(1);
            a0Var.a(a0Var.m, 0);
        } else {
            a0Var.h();
            a0Var.i(a0Var.m, 0);
            a0Var.m = null;
            a0Var.f4080b.v();
            a0Var.f4080b.F();
        }
        a0Var.l = z;
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? b.b.d.a.a.a(getContext(), i) : null);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.q0.setImageDrawable(drawable);
        setErrorIconVisible(drawable != null && this.h.l);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.q0;
        View.OnLongClickListener onLongClickListener = this.p0;
        checkableImageButton.setOnClickListener(onClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.p0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.q0;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        this.r0 = colorStateList;
        Drawable drawable = this.q0.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintList(colorStateList);
        }
        if (this.q0.getDrawable() != drawable) {
            this.q0.setImageDrawable(drawable);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.q0.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            drawable.setTintMode(mode);
        }
        if (this.q0.getDrawable() != drawable) {
            this.q0.setImageDrawable(drawable);
        }
    }

    public void setErrorTextAppearance(int i) {
        a0 a0Var = this.h;
        a0Var.o = i;
        TextView textView = a0Var.m;
        if (textView != null) {
            a0Var.f4080b.q(textView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        a0 a0Var = this.h;
        a0Var.p = colorStateList;
        TextView textView = a0Var.m;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (this.h.r) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!this.h.r) {
            setHelperTextEnabled(true);
        }
        a0 a0Var = this.h;
        a0Var.c();
        a0Var.q = charSequence;
        a0Var.s.setText(charSequence);
        int i = a0Var.i;
        if (i != 2) {
            a0Var.j = 2;
        }
        a0Var.k(i, a0Var.j, a0Var.j(a0Var.s, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        a0 a0Var = this.h;
        a0Var.u = colorStateList;
        TextView textView = a0Var.s;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        a0 a0Var = this.h;
        if (a0Var.r == z) {
            return;
        }
        a0Var.c();
        if (z) {
            v0 v0Var = new v0(a0Var.f4079a);
            a0Var.s = v0Var;
            v0Var.setId(R.id.textinput_helper_text);
            a0Var.s.setTextAlignment(5);
            Typeface typeface = a0Var.v;
            if (typeface != null) {
                a0Var.s.setTypeface(typeface);
            }
            a0Var.s.setVisibility(4);
            a0Var.s.setAccessibilityLiveRegion(1);
            int i = a0Var.t;
            a0Var.t = i;
            TextView textView = a0Var.s;
            if (textView != null) {
                textView.setTextAppearance(i);
            }
            ColorStateList colorStateList = a0Var.u;
            a0Var.u = colorStateList;
            TextView textView2 = a0Var.s;
            if (textView2 != null && colorStateList != null) {
                textView2.setTextColor(colorStateList);
            }
            a0Var.a(a0Var.s, 1);
        } else {
            a0Var.c();
            int i2 = a0Var.i;
            if (i2 == 2) {
                a0Var.j = 0;
            }
            a0Var.k(i2, a0Var.j, a0Var.j(a0Var.s, null));
            a0Var.i(a0Var.s, 1);
            a0Var.s = null;
            a0Var.f4080b.v();
            a0Var.f4080b.F();
        }
        a0Var.r = z;
    }

    public void setHelperTextTextAppearance(int i) {
        a0 a0Var = this.h;
        a0Var.t = i;
        TextView textView = a0Var.s;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.z) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.F0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.z) {
            this.z = z;
            if (z) {
                CharSequence hint = this.f4250f.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.A)) {
                        setHint(hint);
                    }
                    this.f4250f.setHint((CharSequence) null);
                }
                this.B = true;
            } else {
                this.B = false;
                if (!TextUtils.isEmpty(this.A) && TextUtils.isEmpty(this.f4250f.getHint())) {
                    this.f4250f.setHint(this.A);
                }
                setHintInternal(null);
            }
            if (this.f4250f != null) {
                x();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        c.c.a.b.p.d dVar = this.E0;
        c.c.a.b.r.d dVar2 = new c.c.a.b.r.d(dVar.f3958a.getContext(), i);
        ColorStateList colorStateList = dVar2.f3997b;
        if (colorStateList != null) {
            dVar.l = colorStateList;
        }
        float f2 = dVar2.f3996a;
        if (f2 != 0.0f) {
            dVar.j = f2;
        }
        ColorStateList colorStateList2 = dVar2.f4001f;
        if (colorStateList2 != null) {
            dVar.L = colorStateList2;
        }
        dVar.J = dVar2.g;
        dVar.K = dVar2.h;
        dVar.I = dVar2.i;
        c.c.a.b.r.a aVar = dVar.v;
        if (aVar != null) {
            aVar.f3990c = true;
        }
        c.c.a.b.p.c cVar = new c.c.a.b.p.c(dVar);
        dVar2.a();
        dVar.v = new c.c.a.b.r.a(cVar, dVar2.l);
        dVar2.b(dVar.f3958a.getContext(), dVar.v);
        dVar.k();
        this.t0 = this.E0.l;
        if (this.f4250f != null) {
            y(false, false);
            x();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.t0 != colorStateList) {
            if (this.s0 == null) {
                c.c.a.b.p.d dVar = this.E0;
                if (dVar.l != colorStateList) {
                    dVar.l = colorStateList;
                    dVar.k();
                }
            }
            this.t0 = colorStateList;
            if (this.f4250f != null) {
                y(false, false);
            }
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? b.b.d.a.a.a(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f0.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.d0 != 1) {
            setEndIconMode(1);
        } else {
            if (z) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.h0 = colorStateList;
        this.i0 = true;
        d();
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.j0 = mode;
        this.k0 = true;
        d();
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.p && TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.p) {
                setPlaceholderTextEnabled(true);
            }
            this.o = charSequence;
        }
        EditText editText = this.f4250f;
        z(editText != null ? editText.getText().length() : 0);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.s = i;
        TextView textView = this.q;
        if (textView != null) {
            textView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.r != colorStateList) {
            this.r = colorStateList;
            TextView textView = this.q;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.v = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.w.setText(charSequence);
        B();
    }

    public void setPrefixTextAppearance(int i) {
        this.w.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.w.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.R.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.R.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? b.b.d.a.a.a(getContext(), i) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.R.setImageDrawable(drawable);
        if (drawable != null) {
            setStartIconVisible(true);
            f();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription((CharSequence) null);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        CheckableImageButton checkableImageButton = this.R;
        View.OnLongClickListener onLongClickListener = this.b0;
        checkableImageButton.setOnClickListener(onClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.b0 = onLongClickListener;
        CheckableImageButton checkableImageButton = this.R;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        p(checkableImageButton, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            this.T = true;
            f();
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.U != mode) {
            this.U = mode;
            this.V = true;
            f();
        }
    }

    public void setStartIconVisible(boolean z) {
        if ((this.R.getVisibility() == 0) != z) {
            this.R.setVisibility(z ? 0 : 8);
            A();
            u();
        }
    }

    public void setSuffixText(CharSequence charSequence) {
        this.x = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.y.setText(charSequence);
        E();
    }

    public void setSuffixTextAppearance(int i) {
        this.y.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.y.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(e eVar) {
        EditText editText = this.f4250f;
        if (editText != null) {
            u.i(editText, eVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.Q) {
            this.Q = typeface;
            this.E0.q(typeface);
            a0 a0Var = this.h;
            if (typeface != a0Var.v) {
                a0Var.v = typeface;
                TextView textView = a0Var.m;
                if (textView != null) {
                    textView.setTypeface(typeface);
                }
                TextView textView2 = a0Var.s;
                if (textView2 != null) {
                    textView2.setTypeface(typeface);
                }
            }
            TextView textView3 = this.l;
            if (textView3 != null) {
                textView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.l;
        if (textView != null) {
            q(textView, this.k ? this.m : this.n);
            if (!this.k && (colorStateList2 = this.t) != null) {
                this.l.setTextColor(colorStateList2);
            }
            if (!this.k || (colorStateList = this.u) == null) {
                return;
            }
            this.l.setTextColor(colorStateList);
        }
    }

    public final boolean u() {
        boolean z;
        if (this.f4250f == null) {
            return false;
        }
        boolean z2 = true;
        if (!(getStartIconDrawable() == null && this.v == null) && this.f4247c.getMeasuredWidth() > 0) {
            int measuredWidth = this.f4247c.getMeasuredWidth() - this.f4250f.getPaddingLeft();
            if (this.W == null || this.a0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.W = colorDrawable;
                this.a0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] compoundDrawablesRelative = this.f4250f.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative[0];
            Drawable drawable2 = this.W;
            if (drawable != drawable2) {
                this.f4250f.setCompoundDrawablesRelative(drawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.W != null) {
                Drawable[] compoundDrawablesRelative2 = this.f4250f.getCompoundDrawablesRelative();
                this.f4250f.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.W = null;
                z = true;
            }
            z = false;
        }
        if ((this.q0.getVisibility() == 0 || ((k() && l()) || this.x != null)) && this.f4248d.getMeasuredWidth() > 0) {
            int measuredWidth2 = this.y.getMeasuredWidth() - this.f4250f.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()).getMarginStart() + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative3 = this.f4250f.getCompoundDrawablesRelative();
            Drawable drawable3 = this.l0;
            if (drawable3 == null || this.m0 == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.l0 = colorDrawable2;
                    this.m0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = compoundDrawablesRelative3[2];
                Drawable drawable5 = this.l0;
                if (drawable4 != drawable5) {
                    this.n0 = compoundDrawablesRelative3[2];
                    this.f4250f.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], drawable5, compoundDrawablesRelative3[3]);
                } else {
                    z2 = z;
                }
            } else {
                this.m0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                this.f4250f.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.l0, compoundDrawablesRelative3[3]);
            }
        } else {
            if (this.l0 == null) {
                return z;
            }
            Drawable[] compoundDrawablesRelative4 = this.f4250f.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative4[2] == this.l0) {
                this.f4250f.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.n0, compoundDrawablesRelative4[3]);
            } else {
                z2 = z;
            }
            this.l0 = null;
        }
        return z2;
    }

    public void v() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.f4250f;
        if (editText == null || this.G != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (d1.a(background)) {
            background = background.mutate();
        }
        if (this.h.e()) {
            currentTextColor = this.h.g();
        } else {
            if (!this.k || (textView = this.l) == null) {
                background.clearColorFilter();
                this.f4250f.refreshDrawableState();
                return;
            }
            currentTextColor = textView.getCurrentTextColor();
        }
        background.setColorFilter(b.b.i.u.c(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public final void w(CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public final void x() {
        if (this.G != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4246b.getLayoutParams();
            int g2 = g();
            if (g2 != layoutParams.topMargin) {
                layoutParams.topMargin = g2;
                this.f4246b.requestLayout();
            }
        }
    }

    public final void y(boolean z, boolean z2) {
        ColorStateList colorStateList;
        c.c.a.b.p.d dVar;
        TextView textView;
        boolean isEnabled = isEnabled();
        EditText editText = this.f4250f;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f4250f;
        boolean z4 = editText2 != null && editText2.hasFocus();
        boolean e2 = this.h.e();
        ColorStateList colorStateList2 = this.s0;
        if (colorStateList2 != null) {
            c.c.a.b.p.d dVar2 = this.E0;
            if (dVar2.l != colorStateList2) {
                dVar2.l = colorStateList2;
                dVar2.k();
            }
            c.c.a.b.p.d dVar3 = this.E0;
            ColorStateList colorStateList3 = this.s0;
            if (dVar3.k != colorStateList3) {
                dVar3.k = colorStateList3;
                dVar3.k();
            }
        }
        if (!isEnabled) {
            ColorStateList colorStateList4 = this.s0;
            int colorForState = colorStateList4 != null ? colorStateList4.getColorForState(new int[]{-16842910}, this.C0) : this.C0;
            this.E0.m(ColorStateList.valueOf(colorForState));
            c.c.a.b.p.d dVar4 = this.E0;
            ColorStateList valueOf = ColorStateList.valueOf(colorForState);
            if (dVar4.k != valueOf) {
                dVar4.k = valueOf;
                dVar4.k();
            }
        } else if (e2) {
            c.c.a.b.p.d dVar5 = this.E0;
            TextView textView2 = this.h.m;
            dVar5.m(textView2 != null ? textView2.getTextColors() : null);
        } else {
            if (this.k && (textView = this.l) != null) {
                dVar = this.E0;
                colorStateList = textView.getTextColors();
            } else if (z4 && (colorStateList = this.t0) != null) {
                dVar = this.E0;
            }
            dVar.m(colorStateList);
        }
        if (z3 || (isEnabled() && (z4 || e2))) {
            if (z2 || this.D0) {
                ValueAnimator valueAnimator = this.G0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.G0.cancel();
                }
                if (z && this.F0) {
                    b(1.0f);
                } else {
                    this.E0.o(1.0f);
                }
                this.D0 = false;
                if (h()) {
                    n();
                }
                EditText editText3 = this.f4250f;
                z(editText3 != null ? editText3.getText().length() : 0);
                B();
                E();
                return;
            }
            return;
        }
        if (z2 || !this.D0) {
            ValueAnimator valueAnimator2 = this.G0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.G0.cancel();
            }
            if (z && this.F0) {
                b(0.0f);
            } else {
                this.E0.o(0.0f);
            }
            if (h() && (!((l) this.C).A.isEmpty()) && h()) {
                ((l) this.C).x(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.D0 = true;
            TextView textView3 = this.q;
            if (textView3 != null && this.p) {
                textView3.setText((CharSequence) null);
                this.q.setVisibility(4);
            }
            B();
            E();
        }
    }

    public final void z(int i) {
        if (i != 0 || this.D0) {
            TextView textView = this.q;
            if (textView == null || !this.p) {
                return;
            }
            textView.setText((CharSequence) null);
            this.q.setVisibility(4);
            return;
        }
        TextView textView2 = this.q;
        if (textView2 == null || !this.p) {
            return;
        }
        textView2.setText(this.o);
        this.q.setVisibility(0);
        this.q.bringToFront();
    }
}
