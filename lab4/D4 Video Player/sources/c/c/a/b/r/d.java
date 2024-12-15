package c.c.a.b.r;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import android.util.TypedValue;
import b.h.c.a.k;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final float f3996a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f3997b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3998c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3999d;

    /* renamed from: e, reason: collision with root package name */
    public final String f4000e;

    /* renamed from: f, reason: collision with root package name */
    public final ColorStateList f4001f;
    public final float g;
    public final float h;
    public final float i;
    public final int j;
    public boolean k = false;
    public Typeface l;

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, c.c.a.b.b.u);
        this.f3996a = obtainStyledAttributes.getDimension(0, 0.0f);
        this.f3997b = c.c.a.b.a.e(context, obtainStyledAttributes, 3);
        c.c.a.b.a.e(context, obtainStyledAttributes, 4);
        c.c.a.b.a.e(context, obtainStyledAttributes, 5);
        this.f3998c = obtainStyledAttributes.getInt(2, 0);
        this.f3999d = obtainStyledAttributes.getInt(1, 1);
        int i2 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        this.j = obtainStyledAttributes.getResourceId(i2, 0);
        this.f4000e = obtainStyledAttributes.getString(i2);
        obtainStyledAttributes.getBoolean(14, false);
        this.f4001f = c.c.a.b.a.e(context, obtainStyledAttributes, 6);
        this.g = obtainStyledAttributes.getFloat(7, 0.0f);
        this.h = obtainStyledAttributes.getFloat(8, 0.0f);
        this.i = obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void a() {
        String str;
        if (this.l == null && (str = this.f4000e) != null) {
            this.l = Typeface.create(str, this.f3998c);
        }
        if (this.l == null) {
            int i = this.f3999d;
            this.l = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.l = Typeface.create(this.l, this.f3998c);
        }
    }

    public void b(Context context, e eVar) {
        a();
        int i = this.j;
        if (i == 0) {
            this.k = true;
        }
        if (this.k) {
            eVar.b(this.l, true);
            return;
        }
        try {
            b bVar = new b(this, eVar);
            if (context.isRestricted()) {
                bVar.a(-4, null);
            } else {
                k.i(context, i, new TypedValue(), 0, bVar, null, false);
            }
        } catch (Resources.NotFoundException unused) {
            this.k = true;
            eVar.a(1);
        } catch (Exception e2) {
            StringBuilder j = c.a.a.a.a.j("Error loading font ");
            j.append(this.f4000e);
            Log.d("TextAppearance", j.toString(), e2);
            this.k = true;
            eVar.a(-3);
        }
    }

    public void c(Context context, TextPaint textPaint, e eVar) {
        a();
        d(textPaint, this.l);
        b(context, new c(this, textPaint, eVar));
        ColorStateList colorStateList = this.f3997b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.i;
        float f3 = this.g;
        float f4 = this.h;
        ColorStateList colorStateList2 = this.f4001f;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void d(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f3998c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f3996a);
    }
}
