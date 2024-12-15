package b.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes.dex */
public class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final TextView f817a;

    /* renamed from: b, reason: collision with root package name */
    public j2 f818b;

    /* renamed from: c, reason: collision with root package name */
    public j2 f819c;

    /* renamed from: d, reason: collision with root package name */
    public j2 f820d;

    /* renamed from: e, reason: collision with root package name */
    public j2 f821e;

    /* renamed from: f, reason: collision with root package name */
    public j2 f822f;
    public j2 g;
    public j2 h;
    public final z0 i;
    public int j = 0;
    public int k = -1;
    public Typeface l;
    public boolean m;

    public u0(TextView textView) {
        this.f817a = textView;
        this.i = new z0(textView);
    }

    public static j2 c(Context context, u uVar, int i) {
        ColorStateList d2 = uVar.d(context, i);
        if (d2 == null) {
            return null;
        }
        j2 j2Var = new j2();
        j2Var.f713d = true;
        j2Var.f710a = d2;
        return j2Var;
    }

    public final void a(Drawable drawable, j2 j2Var) {
        if (drawable == null || j2Var == null) {
            return;
        }
        u.f(drawable, j2Var, this.f817a.getDrawableState());
    }

    public void b() {
        if (this.f818b != null || this.f819c != null || this.f820d != null || this.f821e != null) {
            Drawable[] compoundDrawables = this.f817a.getCompoundDrawables();
            a(compoundDrawables[0], this.f818b);
            a(compoundDrawables[1], this.f819c);
            a(compoundDrawables[2], this.f820d);
            a(compoundDrawables[3], this.f821e);
        }
        if (this.f822f == null && this.g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f817a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f822f);
        a(compoundDrawablesRelative[2], this.g);
    }

    public boolean d() {
        z0 z0Var = this.i;
        return z0Var.i() && z0Var.f841a != 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:154:0x03ac, code lost:
    
        if (r3 != null) goto L220;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:179:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0241  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.util.AttributeSet r25, int r26) {
        /*
            Method dump skipped, instructions count: 1051
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.i.u0.e(android.util.AttributeSet, int):void");
    }

    public void f(Context context, int i) {
        String n;
        l2 l2Var = new l2(context, context.obtainStyledAttributes(i, b.b.b.x));
        if (l2Var.p(14)) {
            this.f817a.setAllCaps(l2Var.a(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (l2Var.p(0) && l2Var.f(0, -1) == 0) {
            this.f817a.setTextSize(0, 0.0f);
        }
        l(context, l2Var);
        if (i2 >= 26 && l2Var.p(13) && (n = l2Var.n(13)) != null) {
            this.f817a.setFontVariationSettings(n);
        }
        l2Var.f730b.recycle();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.f817a.setTypeface(typeface, this.j);
        }
    }

    public void g(int i, int i2, int i3, int i4) {
        z0 z0Var = this.i;
        if (z0Var.i()) {
            DisplayMetrics displayMetrics = z0Var.j.getResources().getDisplayMetrics();
            z0Var.j(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (z0Var.g()) {
                z0Var.a();
            }
        }
    }

    public void h(int[] iArr, int i) {
        z0 z0Var = this.i;
        if (z0Var.i()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = z0Var.j.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                z0Var.f846f = z0Var.b(iArr2);
                if (!z0Var.h()) {
                    StringBuilder j = c.a.a.a.a.j("None of the preset sizes is valid: ");
                    j.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(j.toString());
                }
            } else {
                z0Var.g = false;
            }
            if (z0Var.g()) {
                z0Var.a();
            }
        }
    }

    public void i(int i) {
        z0 z0Var = this.i;
        if (z0Var.i()) {
            if (i == 0) {
                z0Var.f841a = 0;
                z0Var.f844d = -1.0f;
                z0Var.f845e = -1.0f;
                z0Var.f843c = -1.0f;
                z0Var.f846f = new int[0];
                z0Var.f842b = false;
                return;
            }
            if (i != 1) {
                throw new IllegalArgumentException(c.a.a.a.a.b("Unknown auto-size text type: ", i));
            }
            DisplayMetrics displayMetrics = z0Var.j.getResources().getDisplayMetrics();
            z0Var.j(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (z0Var.g()) {
                z0Var.a();
            }
        }
    }

    public void j(ColorStateList colorStateList) {
        if (this.h == null) {
            this.h = new j2();
        }
        j2 j2Var = this.h;
        j2Var.f710a = colorStateList;
        j2Var.f713d = colorStateList != null;
        this.f818b = j2Var;
        this.f819c = j2Var;
        this.f820d = j2Var;
        this.f821e = j2Var;
        this.f822f = j2Var;
        this.g = j2Var;
    }

    public void k(PorterDuff.Mode mode) {
        if (this.h == null) {
            this.h = new j2();
        }
        j2 j2Var = this.h;
        j2Var.f711b = mode;
        j2Var.f712c = mode != null;
        this.f818b = j2Var;
        this.f819c = j2Var;
        this.f820d = j2Var;
        this.f821e = j2Var;
        this.f822f = j2Var;
        this.g = j2Var;
    }

    public final void l(Context context, l2 l2Var) {
        String n;
        Typeface create;
        Typeface typeface;
        int i = Build.VERSION.SDK_INT;
        this.j = l2Var.j(2, this.j);
        if (i >= 28) {
            int j = l2Var.j(11, -1);
            this.k = j;
            if (j != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        if (!l2Var.p(10) && !l2Var.p(12)) {
            if (l2Var.p(1)) {
                this.m = false;
                int j2 = l2Var.j(1, 1);
                if (j2 == 1) {
                    typeface = Typeface.SANS_SERIF;
                } else if (j2 == 2) {
                    typeface = Typeface.SERIF;
                } else if (j2 != 3) {
                    return;
                } else {
                    typeface = Typeface.MONOSPACE;
                }
                this.l = typeface;
                return;
            }
            return;
        }
        this.l = null;
        int i2 = l2Var.p(12) ? 12 : 10;
        int i3 = this.k;
        int i4 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface i5 = l2Var.i(i2, this.j, new t0(this, i3, i4, new WeakReference(this.f817a)));
                if (i5 != null) {
                    if (i >= 28 && this.k != -1) {
                        i5 = Typeface.create(Typeface.create(i5, 0), this.k, (this.j & 2) != 0);
                    }
                    this.l = i5;
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (n = l2Var.n(i2)) == null) {
            return;
        }
        if (i < 28 || this.k == -1) {
            create = Typeface.create(n, this.j);
        } else {
            create = Typeface.create(Typeface.create(n, 0), this.k, (this.j & 2) != 0);
        }
        this.l = create;
    }
}
