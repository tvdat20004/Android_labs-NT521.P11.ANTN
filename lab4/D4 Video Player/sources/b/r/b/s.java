package b.r.b;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class s extends RecyclerView.l implements RecyclerView.p {
    public static final int[] D = {R.attr.state_pressed};
    public static final int[] E = new int[0];
    public int A;
    public final Runnable B;
    public final RecyclerView.q C;

    /* renamed from: a, reason: collision with root package name */
    public final int f1674a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1675b;

    /* renamed from: c, reason: collision with root package name */
    public final StateListDrawable f1676c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f1677d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1678e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1679f;
    public final StateListDrawable g;
    public final Drawable h;
    public final int i;
    public final int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public int o;
    public float p;
    public RecyclerView s;
    public final ValueAnimator z;
    public int q = 0;
    public int r = 0;
    public boolean t = false;
    public boolean u = false;
    public int v = 0;
    public int w = 0;
    public final int[] x = new int[2];
    public final int[] y = new int[2];

    public s(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.z = ofFloat;
        this.A = 0;
        this.B = new o(this);
        p pVar = new p(this);
        this.C = pVar;
        this.f1676c = stateListDrawable;
        this.f1677d = drawable;
        this.g = stateListDrawable2;
        this.h = drawable2;
        this.f1678e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f1679f = Math.max(i, drawable.getIntrinsicWidth());
        this.i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f1674a = i2;
        this.f1675b = i3;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new q(this));
        ofFloat.addUpdateListener(new r(this));
        RecyclerView recyclerView2 = this.s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            RecyclerView.m mVar = recyclerView2.n;
            if (mVar != null) {
                mVar.d("Cannot remove item decoration during a scroll  or layout");
            }
            recyclerView2.p.remove(this);
            if (recyclerView2.p.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.R();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.s;
            recyclerView3.q.remove(this);
            if (recyclerView3.r == this) {
                recyclerView3.r = null;
            }
            List<RecyclerView.q> list = this.s.j0;
            if (list != null) {
                list.remove(pVar);
            }
            d();
        }
        this.s = recyclerView;
        recyclerView.g(this);
        this.s.q.add(this);
        this.s.h(pVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public void c(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
        if (this.q != this.s.getWidth() || this.r != this.s.getHeight()) {
            this.q = this.s.getWidth();
            this.r = this.s.getHeight();
            h(0);
            return;
        }
        if (this.A != 0) {
            if (this.t) {
                int i = this.q;
                int i2 = this.f1678e;
                int i3 = i - i2;
                int i4 = this.l;
                int i5 = this.k;
                int i6 = i4 - (i5 / 2);
                this.f1676c.setBounds(0, 0, i2, i5);
                this.f1677d.setBounds(0, 0, this.f1679f, this.r);
                RecyclerView recyclerView2 = this.s;
                WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    this.f1677d.draw(canvas);
                    canvas.translate(this.f1678e, i6);
                    canvas.scale(-1.0f, 1.0f);
                    this.f1676c.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    i3 = this.f1678e;
                } else {
                    canvas.translate(i3, 0.0f);
                    this.f1677d.draw(canvas);
                    canvas.translate(0.0f, i6);
                    this.f1676c.draw(canvas);
                }
                canvas.translate(-i3, -i6);
            }
            if (this.u) {
                int i7 = this.r;
                int i8 = this.i;
                int i9 = this.o;
                int i10 = this.n;
                this.g.setBounds(0, 0, i10, i8);
                this.h.setBounds(0, 0, this.q, this.j);
                canvas.translate(0.0f, i7 - i8);
                this.h.draw(canvas);
                canvas.translate(i9 - (i10 / 2), 0.0f);
                this.g.draw(canvas);
                canvas.translate(-r2, -r7);
            }
        }
    }

    public final void d() {
        this.s.removeCallbacks(this.B);
    }

    public boolean e(float f2, float f3) {
        if (f3 >= this.r - this.i) {
            int i = this.o;
            int i2 = this.n;
            if (f2 >= i - (i2 / 2) && f2 <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    public boolean f(float f2, float f3) {
        RecyclerView recyclerView = this.s;
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        if (recyclerView.getLayoutDirection() == 1) {
            if (f2 > this.f1678e / 2) {
                return false;
            }
        } else if (f2 < this.q - this.f1678e) {
            return false;
        }
        int i = this.l;
        int i2 = this.k / 2;
        return f3 >= ((float) (i - i2)) && f3 <= ((float) (i2 + i));
    }

    public final int g(float f2, float f3, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f3 - f2) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    public void h(int i) {
        int i2;
        if (i == 2 && this.v != 2) {
            this.f1676c.setState(D);
            d();
        }
        if (i == 0) {
            this.s.invalidate();
        } else {
            i();
        }
        if (this.v != 2 || i == 2) {
            i2 = i == 1 ? 1500 : 1200;
            this.v = i;
        }
        this.f1676c.setState(E);
        d();
        this.s.postDelayed(this.B, i2);
        this.v = i;
    }

    public void i() {
        int i = this.A;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                this.z.cancel();
            }
        }
        this.A = 1;
        ValueAnimator valueAnimator = this.z;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        this.z.setDuration(500L);
        this.z.setStartDelay(0L);
        this.z.start();
    }
}
