package b.u.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class s extends i {
    public static final PorterDuff.Mode k = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public q f1849c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuffColorFilter f1850d;

    /* renamed from: e, reason: collision with root package name */
    public ColorFilter f1851e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1852f;
    public boolean g;
    public final float[] h;
    public final Matrix i;
    public final Rect j;

    public s() {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f1849c = new q();
    }

    public s(q qVar) {
        this.g = true;
        this.h = new float[9];
        this.i = new Matrix();
        this.j = new Rect();
        this.f1849c = qVar;
        this.f1850d = b(qVar.f1844c, qVar.f1845d);
    }

    public static s a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        s sVar = new s();
        sVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return sVar;
    }

    public PorterDuffColorFilter b(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f1823b;
        if (drawable == null) {
            return false;
        }
        drawable.canApplyTheme();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        if ((r1 == r7.getWidth() && r3 == r6.f1847f.getHeight()) == false) goto L40;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.u.a.a.s.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f1823b;
        return drawable != null ? drawable.getAlpha() : this.f1849c.f1843b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f1823b;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f1849c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f1823b;
        return drawable != null ? drawable.getColorFilter() : this.f1851e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f1823b != null && Build.VERSION.SDK_INT >= 24) {
            return new r(this.f1823b.getConstantState());
        }
        this.f1849c.f1842a = getChangingConfigurations();
        return this.f1849c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f1823b;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f1849c.f1843b.j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f1823b;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f1849c.f1843b.i;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:198:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f7  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void inflate(android.content.res.Resources r29, org.xmlpull.v1.XmlPullParser r30, android.util.AttributeSet r31, android.content.res.Resources.Theme r32) {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.u.a.a.s.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f1823b;
        return drawable != null ? drawable.isAutoMirrored() : this.f1849c.f1846e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        q qVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f1823b;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((qVar = this.f1849c) != null && (qVar.a() || ((colorStateList = this.f1849c.f1844c) != null && colorStateList.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f1852f && super.mutate() == this) {
            this.f1849c = new q(this.f1849c);
            this.f1852f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        boolean z = false;
        q qVar = this.f1849c;
        ColorStateList colorStateList = qVar.f1844c;
        if (colorStateList != null && (mode = qVar.f1845d) != null) {
            this.f1850d = b(colorStateList, mode);
            invalidateSelf();
            z = true;
        }
        if (qVar.a()) {
            boolean b2 = qVar.f1843b.h.b(iArr);
            qVar.k |= b2;
            if (b2) {
                invalidateSelf();
                return true;
            }
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f1849c.f1843b.getRootAlpha() != i) {
            this.f1849c.f1843b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.f1849c.f1846e = z;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f1851e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            b.h.b.h.E(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            b.h.b.h.F(drawable, colorStateList);
            return;
        }
        q qVar = this.f1849c;
        if (qVar.f1844c != colorStateList) {
            qVar.f1844c = colorStateList;
            this.f1850d = b(colorStateList, qVar.f1845d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            b.h.b.h.G(drawable, mode);
            return;
        }
        q qVar = this.f1849c;
        if (qVar.f1845d != mode) {
            qVar.f1845d = mode;
            this.f1850d = b(qVar.f1844c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f1823b;
        return drawable != null ? drawable.setVisible(z, z2) : super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f1823b;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
