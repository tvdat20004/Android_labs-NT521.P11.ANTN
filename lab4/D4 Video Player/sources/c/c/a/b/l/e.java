package c.c.a.b.l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final d f3898a;

    /* renamed from: b, reason: collision with root package name */
    public final d f3899b;

    /* renamed from: c, reason: collision with root package name */
    public final d f3900c;

    /* renamed from: d, reason: collision with root package name */
    public final d f3901d;

    /* renamed from: e, reason: collision with root package name */
    public final d f3902e;

    /* renamed from: f, reason: collision with root package name */
    public final d f3903f;
    public final d g;
    public final Paint h;

    public e(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(c.c.a.b.a.m(context, R.attr.materialCalendarStyle, j.class.getCanonicalName()), c.c.a.b.b.k);
        this.f3898a = d.a(context, obtainStyledAttributes.getResourceId(3, 0));
        this.g = d.a(context, obtainStyledAttributes.getResourceId(1, 0));
        this.f3899b = d.a(context, obtainStyledAttributes.getResourceId(2, 0));
        this.f3900c = d.a(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList e2 = c.c.a.b.a.e(context, obtainStyledAttributes, 5);
        this.f3901d = d.a(context, obtainStyledAttributes.getResourceId(7, 0));
        this.f3902e = d.a(context, obtainStyledAttributes.getResourceId(6, 0));
        this.f3903f = d.a(context, obtainStyledAttributes.getResourceId(8, 0));
        Paint paint = new Paint();
        this.h = paint;
        paint.setColor(e2.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
