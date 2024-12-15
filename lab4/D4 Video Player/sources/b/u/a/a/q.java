package b.u.a.a;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class q extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public int f1842a;

    /* renamed from: b, reason: collision with root package name */
    public p f1843b;

    /* renamed from: c, reason: collision with root package name */
    public ColorStateList f1844c;

    /* renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f1845d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1846e;

    /* renamed from: f, reason: collision with root package name */
    public Bitmap f1847f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public int i;
    public boolean j;
    public boolean k;
    public Paint l;

    public q() {
        this.f1844c = null;
        this.f1845d = s.k;
        this.f1843b = new p();
    }

    public q(q qVar) {
        this.f1844c = null;
        this.f1845d = s.k;
        if (qVar != null) {
            this.f1842a = qVar.f1842a;
            p pVar = new p(qVar.f1843b);
            this.f1843b = pVar;
            if (qVar.f1843b.f1840e != null) {
                pVar.f1840e = new Paint(qVar.f1843b.f1840e);
            }
            if (qVar.f1843b.f1839d != null) {
                this.f1843b.f1839d = new Paint(qVar.f1843b.f1839d);
            }
            this.f1844c = qVar.f1844c;
            this.f1845d = qVar.f1845d;
            this.f1846e = qVar.f1846e;
        }
    }

    public boolean a() {
        p pVar = this.f1843b;
        if (pVar.o == null) {
            pVar.o = Boolean.valueOf(pVar.h.a());
        }
        return pVar.o.booleanValue();
    }

    public void b(int i, int i2) {
        this.f1847f.eraseColor(0);
        Canvas canvas = new Canvas(this.f1847f);
        p pVar = this.f1843b;
        pVar.a(pVar.h, p.q, canvas, i, i2, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f1842a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return new s(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new s(this);
    }
}
