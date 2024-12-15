package c.c.a.b.w;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.StateListDrawable;
import android.text.TextWatcher;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import c.c.a.b.u.m;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Objects;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class x extends y {

    /* renamed from: d, reason: collision with root package name */
    public final TextWatcher f4119d;

    /* renamed from: e, reason: collision with root package name */
    public final View.OnFocusChangeListener f4120e;

    /* renamed from: f, reason: collision with root package name */
    public final TextInputLayout.e f4121f;
    public final TextInputLayout.f g;

    @SuppressLint({"ClickableViewAccessibility"})
    public final TextInputLayout.g h;
    public boolean i;
    public boolean j;
    public long k;
    public StateListDrawable l;
    public c.c.a.b.u.i m;
    public AccessibilityManager n;
    public ValueAnimator o;
    public ValueAnimator p;

    public x(TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f4119d = new o(this);
        this.f4120e = new p(this);
        this.f4121f = new q(this, this.f4122a);
        this.g = new r(this);
        this.h = new s(this);
        this.i = false;
        this.j = false;
        this.k = Long.MAX_VALUE;
    }

    public static AutoCompleteTextView e(x xVar, EditText editText) {
        Objects.requireNonNull(xVar);
        if (editText instanceof AutoCompleteTextView) {
            return (AutoCompleteTextView) editText;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    public static void f(x xVar, boolean z) {
        if (xVar.j != z) {
            xVar.j = z;
            xVar.p.cancel();
            xVar.o.start();
        }
    }

    public static void g(x xVar, AutoCompleteTextView autoCompleteTextView) {
        Objects.requireNonNull(xVar);
        if (autoCompleteTextView == null) {
            return;
        }
        if (xVar.i()) {
            xVar.i = false;
        }
        if (xVar.i) {
            xVar.i = false;
            return;
        }
        boolean z = xVar.j;
        boolean z2 = !z;
        if (z != z2) {
            xVar.j = z2;
            xVar.p.cancel();
            xVar.o.start();
        }
        if (!xVar.j) {
            autoCompleteTextView.dismissDropDown();
        } else {
            autoCompleteTextView.requestFocus();
            autoCompleteTextView.showDropDown();
        }
    }

    @Override // c.c.a.b.w.y
    public void a() {
        float dimensionPixelOffset = this.f4123b.getResources().getDimensionPixelOffset(R.dimen.mtrl_shape_corner_size_small_component);
        float dimensionPixelOffset2 = this.f4123b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int dimensionPixelOffset3 = this.f4123b.getResources().getDimensionPixelOffset(R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        c.c.a.b.u.i h = h(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        c.c.a.b.u.i h2 = h(0.0f, dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3);
        this.m = h;
        StateListDrawable stateListDrawable = new StateListDrawable();
        this.l = stateListDrawable;
        stateListDrawable.addState(new int[]{android.R.attr.state_above_anchor}, h);
        this.l.addState(new int[0], h2);
        this.f4122a.setEndIconDrawable(b.b.d.a.a.a(this.f4123b, R.drawable.mtrl_dropdown_arrow));
        TextInputLayout textInputLayout = this.f4122a;
        textInputLayout.setEndIconContentDescription(textInputLayout.getResources().getText(R.string.exposed_dropdown_menu_content_description));
        this.f4122a.setEndIconOnClickListener(new t(this));
        this.f4122a.a(this.g);
        this.f4122a.g0.add(this.h);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = c.c.a.b.c.a.f3809a;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(67);
        ofFloat.addUpdateListener(new n(this));
        this.p = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(50);
        ofFloat2.addUpdateListener(new n(this));
        this.o = ofFloat2;
        ofFloat2.addListener(new w(this));
        CheckableImageButton checkableImageButton = this.f4124c;
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        checkableImageButton.setImportantForAccessibility(2);
        this.n = (AccessibilityManager) this.f4123b.getSystemService("accessibility");
    }

    @Override // c.c.a.b.w.y
    public boolean b(int i) {
        return i != 0;
    }

    @Override // c.c.a.b.w.y
    public boolean d() {
        return true;
    }

    public final c.c.a.b.u.i h(float f2, float f3, float f4, int i) {
        m.a aVar = new m.a();
        aVar.f4040e = new c.c.a.b.u.a(f2);
        aVar.f4041f = new c.c.a.b.u.a(f2);
        aVar.h = new c.c.a.b.u.a(f3);
        aVar.g = new c.c.a.b.u.a(f3);
        c.c.a.b.u.m a2 = aVar.a();
        Context context = this.f4123b;
        String str = c.c.a.b.u.i.x;
        int m = c.c.a.b.a.m(context, R.attr.colorSurface, c.c.a.b.u.i.class.getSimpleName());
        c.c.a.b.u.i iVar = new c.c.a.b.u.i();
        iVar.f4024b.f4019b = new c.c.a.b.n.a(context);
        iVar.w();
        iVar.p(ColorStateList.valueOf(m));
        c.c.a.b.u.h hVar = iVar.f4024b;
        if (hVar.o != f4) {
            hVar.o = f4;
            iVar.w();
        }
        iVar.f4024b.f4018a = a2;
        iVar.invalidateSelf();
        c.c.a.b.u.h hVar2 = iVar.f4024b;
        if (hVar2.i == null) {
            hVar2.i = new Rect();
        }
        iVar.f4024b.i.set(0, i, 0, i);
        iVar.invalidateSelf();
        return iVar;
    }

    public final boolean i() {
        long currentTimeMillis = System.currentTimeMillis() - this.k;
        return currentTimeMillis < 0 || currentTimeMillis > 300;
    }
}
