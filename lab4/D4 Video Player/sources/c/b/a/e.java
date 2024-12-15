package c.b.a;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import c.c.a.a.a2.w;
import c.c.a.a.a2.x;
import c.c.a.a.g1;

/* loaded from: classes.dex */
public abstract class e extends GLSurfaceView implements x {

    /* renamed from: b, reason: collision with root package name */
    public final d f1871b;

    /* renamed from: c, reason: collision with root package name */
    public g1 f1872c;

    /* renamed from: d, reason: collision with root package name */
    public float f1873d;

    /* renamed from: e, reason: collision with root package name */
    public g f1874e;

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1873d = 1.0f;
        this.f1874e = g.RESIZE_FIT_WIDTH;
        setEGLContextFactory(new c.b.a.i.a());
        setEGLConfigChooser(new c.b.a.h.a());
        d dVar = new d(this);
        this.f1871b = dVar;
        setRenderer(dVar);
    }

    @Override // c.c.a.a.a2.x
    public /* synthetic */ void o(int i, int i2) {
        w.b(this, i, i2);
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int ordinal = this.f1874e.ordinal();
        if (ordinal == 0) {
            measuredHeight = (int) (measuredWidth / this.f1873d);
        } else if (ordinal == 1) {
            measuredWidth = (int) (measuredHeight * this.f1873d);
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
    }

    @Override // android.opengl.GLSurfaceView
    public void onPause() {
        super.onPause();
        d dVar = this.f1871b;
        c.b.a.j.a aVar = dVar.o;
        if (aVar != null) {
            aVar.d();
        }
        f fVar = dVar.f1869e;
        if (fVar != null) {
            fVar.f1875b.release();
        }
    }

    public void setGlFilter(c.b.a.j.a aVar) {
        d dVar = this.f1871b;
        dVar.q.queueEvent(new c(dVar, aVar));
    }

    public void setPlayerScaleType(g gVar) {
        this.f1874e = gVar;
        requestLayout();
    }

    @Override // c.c.a.a.a2.x
    public void t() {
    }
}
