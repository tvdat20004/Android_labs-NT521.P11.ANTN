package c.c.a.b.l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.widget.TextView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final Rect f3892a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f3893b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorStateList f3894c;

    /* renamed from: d, reason: collision with root package name */
    public final ColorStateList f3895d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3896e;

    /* renamed from: f, reason: collision with root package name */
    public final c.c.a.b.u.m f3897f;

    public d(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, c.c.a.b.u.m mVar, Rect rect) {
        b.h.b.h.d(rect.left);
        b.h.b.h.d(rect.top);
        b.h.b.h.d(rect.right);
        b.h.b.h.d(rect.bottom);
        this.f3892a = rect;
        this.f3893b = colorStateList2;
        this.f3894c = colorStateList;
        this.f3895d = colorStateList3;
        this.f3896e = i;
        this.f3897f = mVar;
    }

    public static d a(Context context, int i) {
        if (!(i != 0)) {
            throw new IllegalArgumentException("Cannot create a CalendarItemStyle with a styleResId of 0");
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, c.c.a.b.b.l);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList e2 = c.c.a.b.a.e(context, obtainStyledAttributes, 4);
        ColorStateList e3 = c.c.a.b.a.e(context, obtainStyledAttributes, 9);
        ColorStateList e4 = c.c.a.b.a.e(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        c.c.a.b.u.m a2 = c.c.a.b.u.m.a(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new c.c.a.b.u.a(0)).a();
        obtainStyledAttributes.recycle();
        return new d(e2, e3, e4, dimensionPixelSize, a2, rect);
    }

    public void b(TextView textView) {
        c.c.a.b.u.i iVar = new c.c.a.b.u.i();
        c.c.a.b.u.i iVar2 = new c.c.a.b.u.i();
        iVar.setShapeAppearanceModel(this.f3897f);
        iVar2.setShapeAppearanceModel(this.f3897f);
        iVar.p(this.f3894c);
        iVar.s(this.f3896e, this.f3895d);
        textView.setTextColor(this.f3893b);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f3893b.withAlpha(30), iVar, iVar2);
        Rect rect = this.f3892a;
        InsetDrawable insetDrawable = new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom);
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        textView.setBackground(insetDrawable);
    }
}
