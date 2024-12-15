package f.a.a.a.a.d;

import android.content.Context;
import c.b.a.e;
import c.b.a.g;

/* loaded from: classes.dex */
public class b extends e {

    /* renamed from: f, reason: collision with root package name */
    public a f4339f;
    public float g;

    public b(Context context) {
        super(context, null);
        this.f4339f = a.FillWidth;
        this.g = 1.0f;
        super.setPlayerScaleType(g.RESIZE_NONE);
    }

    @Override // c.c.a.a.a2.x
    public void a(int i, int i2, int i3, float f2) {
        this.g = (i / i2) * f2;
        requestLayout();
    }

    @Override // c.b.a.e, android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        float f2;
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int ordinal = this.f4339f.ordinal();
        if (ordinal == 1) {
            float f3 = this.g;
            int i3 = (int) (measuredWidth / f3);
            if (i3 > measuredHeight) {
                f2 = measuredHeight * f3;
                measuredWidth = (int) f2;
            } else {
                measuredHeight = i3;
            }
        } else if (ordinal == 2) {
            measuredHeight = (int) (measuredWidth / this.g);
        } else if (ordinal == 3) {
            f2 = measuredHeight * this.g;
            measuredWidth = (int) f2;
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // c.b.a.e
    @Deprecated
    public void setPlayerScaleType(g gVar) {
        throw new UnsupportedOperationException();
    }

    public void setPlayerScaleType(a aVar) {
        this.f4339f = aVar;
        requestLayout();
    }
}
