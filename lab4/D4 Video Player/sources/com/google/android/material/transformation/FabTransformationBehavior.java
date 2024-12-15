package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import b.h.j.u;
import b.h.j.y;
import c.c.a.b.c.c;
import c.c.a.b.c.d;
import c.c.a.b.c.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

@Deprecated
/* loaded from: classes.dex */
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c, reason: collision with root package name */
    public final Rect f4265c;

    /* renamed from: d, reason: collision with root package name */
    public final RectF f4266d;

    /* renamed from: e, reason: collision with root package name */
    public final RectF f4267e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f4268f;
    public float g;
    public float h;

    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f4269a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f4270b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f4271c;

        public a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f4269a = z;
            this.f4270b = view;
            this.f4271c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f4269a) {
                return;
            }
            this.f4270b.setVisibility(4);
            this.f4271c.setAlpha(1.0f);
            this.f4271c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f4269a) {
                this.f4270b.setVisibility(0);
                this.f4271c.setAlpha(0.0f);
                this.f4271c.setVisibility(4);
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public c f4272a;

        /* renamed from: b, reason: collision with root package name */
        public e f4273b;
    }

    public FabTransformationBehavior() {
        this.f4265c = new Rect();
        this.f4266d = new RectF();
        this.f4267e = new RectF();
        this.f4268f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4265c = new Rect();
        this.f4266d = new RectF();
        this.f4267e = new RectF();
        this.f4268f = new int[2];
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    public AnimatorSet D(View view, View view2, boolean z, boolean z2) {
        b N = N(view2.getContext(), z);
        if (z) {
            this.g = view.getTranslationX();
            this.h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        L(view, view2, z, z2, N, arrayList);
        RectF rectF = this.f4266d;
        M(view, view2, z, z2, N, arrayList, rectF);
        rectF.width();
        rectF.height();
        float F = F(view, view2, N.f4273b);
        float G = G(view, view2, N.f4273b);
        Pair<d, d> E = E(F, G, z, N);
        d dVar = (d) E.first;
        d dVar2 = (d) E.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            F = this.g;
        }
        fArr[0] = F;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            G = this.h;
        }
        fArr2[0] = G;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        dVar.a(ofFloat);
        dVar2.a(ofFloat2);
        arrayList.add(ofFloat);
        arrayList.add(ofFloat2);
        K(view, view2, z, z2, N, arrayList);
        J(view2, z, z2, N, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        c.c.a.b.a.j(animatorSet, arrayList);
        animatorSet.addListener(new a(this, z, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    public final Pair<d, d> E(float f2, float f3, boolean z, b bVar) {
        d d2;
        c cVar;
        String str;
        if (f2 == 0.0f || f3 == 0.0f) {
            d2 = bVar.f4272a.d("translationXLinear");
            cVar = bVar.f4272a;
            str = "translationYLinear";
        } else if ((!z || f3 >= 0.0f) && (z || f3 <= 0.0f)) {
            d2 = bVar.f4272a.d("translationXCurveDownwards");
            cVar = bVar.f4272a;
            str = "translationYCurveDownwards";
        } else {
            d2 = bVar.f4272a.d("translationXCurveUpwards");
            cVar = bVar.f4272a;
            str = "translationYCurveUpwards";
        }
        return new Pair<>(d2, cVar.d(str));
    }

    public final float F(View view, View view2, e eVar) {
        RectF rectF = this.f4266d;
        RectF rectF2 = this.f4267e;
        I(view, rectF);
        rectF.offset(this.g, this.h);
        I(view2, rectF2);
        Objects.requireNonNull(eVar);
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float G(View view, View view2, e eVar) {
        RectF rectF = this.f4266d;
        RectF rectF2 = this.f4267e;
        I(view, rectF);
        rectF.offset(this.g, this.h);
        I(view2, rectF2);
        Objects.requireNonNull(eVar);
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final float H(b bVar, d dVar, float f2, float f3) {
        long j = dVar.f3817a;
        long j2 = dVar.f3818b;
        d d2 = bVar.f4272a.d("expansion");
        float interpolation = dVar.b().getInterpolation((((d2.f3817a + d2.f3818b) + 17) - j) / j2);
        TimeInterpolator timeInterpolator = c.c.a.b.c.a.f3809a;
        return ((f3 - f2) * interpolation) + f2;
    }

    public final void I(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f4268f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public final void J(View view, boolean z, boolean z2, b bVar, List list) {
        ObjectAnimator ofFloat;
        if (view instanceof ViewGroup) {
            View findViewById = view.findViewById(R.id.mtrl_child_content_container);
            ViewGroup O = findViewById != null ? O(findViewById) : O(view);
            if (O == null) {
                return;
            }
            if (z) {
                if (!z2) {
                    c.c.a.b.c.b.f3814a.set(O, Float.valueOf(0.0f));
                }
                ofFloat = ObjectAnimator.ofFloat(O, c.c.a.b.c.b.f3814a, 1.0f);
            } else {
                ofFloat = ObjectAnimator.ofFloat(O, c.c.a.b.c.b.f3814a, 0.0f);
            }
            bVar.f4272a.d("contentFade").a(ofFloat);
            list.add(ofFloat);
        }
    }

    public final void K(View view, View view2, boolean z, boolean z2, b bVar, List list) {
    }

    @TargetApi(21)
    public final void L(View view, View view2, boolean z, boolean z2, b bVar, List list) {
        ObjectAnimator ofFloat;
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        float elevation = view2.getElevation() - view.getElevation();
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-elevation);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        bVar.f4272a.d("elevation").a(ofFloat);
        list.add(ofFloat);
    }

    public final void M(View view, View view2, boolean z, boolean z2, b bVar, List list, RectF rectF) {
        ObjectAnimator ofFloat;
        ObjectAnimator ofFloat2;
        float F = F(view, view2, bVar.f4273b);
        float G = G(view, view2, bVar.f4273b);
        Pair<d, d> E = E(F, G, z, bVar);
        d dVar = (d) E.first;
        d dVar2 = (d) E.second;
        if (z) {
            if (!z2) {
                view2.setTranslationX(-F);
                view2.setTranslationY(-G);
            }
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float H = H(bVar, dVar, -F, 0.0f);
            float H2 = H(bVar, dVar2, -G, 0.0f);
            Rect rect = this.f4265c;
            view2.getWindowVisibleDisplayFrame(rect);
            RectF rectF2 = this.f4266d;
            rectF2.set(rect);
            RectF rectF3 = this.f4267e;
            I(view2, rectF3);
            rectF3.offset(H, H2);
            rectF3.intersect(rectF2);
            rectF.set(rectF3);
        } else {
            ofFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -F);
            ofFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -G);
        }
        dVar.a(ofFloat);
        dVar2.a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    public abstract b N(Context context, boolean z);

    public final ViewGroup O(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() != 8) {
            return false;
        }
        throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public void f(CoordinatorLayout.e eVar) {
        if (eVar.h == 0) {
            eVar.h = 80;
        }
    }
}
