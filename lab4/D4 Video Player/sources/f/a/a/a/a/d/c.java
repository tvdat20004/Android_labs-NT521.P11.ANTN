package f.a.a.a.a.d;

import android.content.Context;
import c.c.a.a.a2.w;
import c.c.a.a.a2.x;
import c.c.a.a.g1;
import c.c.a.a.x0;
import c.c.a.a.x1.o;

/* loaded from: classes.dex */
public class c extends o implements x {
    public a A;
    public float B;

    public c(Context context) {
        super(context, null, 0);
        this.A = a.FillWidth;
        this.B = 1.0f;
        super.setUseController(false);
    }

    @Override // c.c.a.a.a2.x
    public void a(int i, int i2, int i3, float f2) {
        this.B = (i / i2) * f2;
        requestLayout();
    }

    @Override // c.c.a.a.a2.x
    public /* synthetic */ void o(int i, int i2) {
        w.b(this, i, i2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        float f2;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int ordinal = this.A.ordinal();
        if (ordinal == 1) {
            float f3 = this.B;
            int i3 = (int) (measuredWidth / f3);
            if (i3 > measuredHeight) {
                f2 = measuredHeight * f3;
                measuredWidth = (int) f2;
            } else {
                measuredHeight = i3;
            }
        } else if (ordinal == 2) {
            measuredHeight = (int) (measuredWidth / this.B);
        } else if (ordinal == 3) {
            f2 = measuredHeight * this.B;
            measuredWidth = (int) f2;
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // c.c.a.a.x1.o
    @Deprecated
    public void setPlayer(x0 x0Var) {
        throw new UnsupportedOperationException();
    }

    public void setPlayerScaleType(a aVar) {
        this.A = aVar;
        requestLayout();
    }

    public void setSimplePlayer(g1 g1Var) {
        super.setPlayer(g1Var);
        if (g1Var != null) {
            g1Var.f2008f.add(this);
        }
    }

    @Override // c.c.a.a.a2.x
    public /* synthetic */ void t() {
        w.a(this);
    }
}
