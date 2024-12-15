package b.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* loaded from: classes.dex */
public class l2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f729a;

    /* renamed from: b, reason: collision with root package name */
    public final TypedArray f730b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f731c;

    public l2(Context context, TypedArray typedArray) {
        this.f729a = context;
        this.f730b = typedArray;
    }

    public static l2 q(Context context, AttributeSet attributeSet, int[] iArr) {
        return new l2(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static l2 r(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new l2(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    public boolean a(int i, boolean z) {
        return this.f730b.getBoolean(i, z);
    }

    public int b(int i, int i2) {
        return this.f730b.getColor(i, i2);
    }

    public ColorStateList c(int i) {
        int resourceId;
        if (this.f730b.hasValue(i) && (resourceId = this.f730b.getResourceId(i, 0)) != 0) {
            Context context = this.f729a;
            ThreadLocal<TypedValue> threadLocal = b.b.d.a.a.f496a;
            ColorStateList colorStateList = context.getColorStateList(resourceId);
            if (colorStateList != null) {
                return colorStateList;
            }
        }
        return this.f730b.getColorStateList(i);
    }

    public float d(int i, float f2) {
        return this.f730b.getDimension(i, f2);
    }

    public int e(int i, int i2) {
        return this.f730b.getDimensionPixelOffset(i, i2);
    }

    public int f(int i, int i2) {
        return this.f730b.getDimensionPixelSize(i, i2);
    }

    public Drawable g(int i) {
        int resourceId;
        return (!this.f730b.hasValue(i) || (resourceId = this.f730b.getResourceId(i, 0)) == 0) ? this.f730b.getDrawable(i) : b.b.d.a.a.a(this.f729a, resourceId);
    }

    public Drawable h(int i) {
        int resourceId;
        Drawable g;
        if (!this.f730b.hasValue(i) || (resourceId = this.f730b.getResourceId(i, 0)) == 0) {
            return null;
        }
        u a2 = u.a();
        Context context = this.f729a;
        synchronized (a2) {
            g = a2.f816a.g(context, resourceId, true);
        }
        return g;
    }

    public Typeface i(int i, int i2, b.h.c.a.i iVar) {
        int resourceId = this.f730b.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f731c == null) {
            this.f731c = new TypedValue();
        }
        Context context = this.f729a;
        TypedValue typedValue = this.f731c;
        if (context.isRestricted()) {
            return null;
        }
        return b.h.c.a.k.i(context, resourceId, typedValue, i2, iVar, null, true);
    }

    public int j(int i, int i2) {
        return this.f730b.getInt(i, i2);
    }

    public int k(int i, int i2) {
        return this.f730b.getInteger(i, i2);
    }

    public int l(int i, int i2) {
        return this.f730b.getLayoutDimension(i, i2);
    }

    public int m(int i, int i2) {
        return this.f730b.getResourceId(i, i2);
    }

    public String n(int i) {
        return this.f730b.getString(i);
    }

    public CharSequence o(int i) {
        return this.f730b.getText(i);
    }

    public boolean p(int i) {
        return this.f730b.hasValue(i);
    }
}
