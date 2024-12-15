package c.c.a.a.v1;

import android.graphics.Bitmap;
import android.text.Layout;

/* loaded from: classes.dex */
public class b {
    public static final b p = new b("");

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f3250b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f3251c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f3252d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3253e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3254f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;

    public b(Bitmap bitmap, float f2, int i, float f3, int i2, float f4, float f5) {
        this(null, null, bitmap, f3, 0, i2, f2, i, Integer.MIN_VALUE, Float.MIN_VALUE, f4, f5, false, -16777216);
    }

    public b(CharSequence charSequence) {
        this(charSequence, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, float f2, int i, int i2, float f3, int i3, float f4) {
        this(charSequence, alignment, f2, i, i2, f3, i3, f4, false, -16777216);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, float f2, int i, int i2, float f3, int i3, float f4, boolean z, int i4) {
        this(charSequence, alignment, null, f2, i, i2, f3, i3, Integer.MIN_VALUE, Float.MIN_VALUE, f4, Float.MIN_VALUE, z, i4);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Bitmap bitmap, float f2, int i, int i2, float f3, int i3, int i4, float f4, float f5, float f6, boolean z, int i5) {
        this.f3250b = charSequence;
        this.f3251c = alignment;
        this.f3252d = bitmap;
        this.f3253e = f2;
        this.f3254f = i;
        this.g = i2;
        this.h = f3;
        this.i = i3;
        this.j = f5;
        this.k = f6;
        this.l = z;
        this.m = i5;
        this.n = i4;
        this.o = f4;
    }
}
