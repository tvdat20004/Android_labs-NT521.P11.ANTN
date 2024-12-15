package c.c.a.a.x1.v;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.Matrix;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import c.c.a.a.x1.n;

/* loaded from: classes.dex */
public class l extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, d {

    /* renamed from: d, reason: collision with root package name */
    public final j f3539d;

    /* renamed from: e, reason: collision with root package name */
    public final float f3540e;

    /* renamed from: f, reason: collision with root package name */
    public final GestureDetector f3541f;
    public i h;

    /* renamed from: b, reason: collision with root package name */
    public final PointF f3537b = new PointF();

    /* renamed from: c, reason: collision with root package name */
    public final PointF f3538c = new PointF();
    public volatile float g = 3.1415927f;

    public l(Context context, j jVar, float f2) {
        this.f3539d = jVar;
        this.f3540e = f2;
        this.f3541f = new GestureDetector(context, this);
    }

    @Override // c.c.a.a.x1.v.d
    public void a(float[] fArr, float f2) {
        this.g = -f2;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f3537b.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
        float x = (motionEvent2.getX() - this.f3537b.x) / this.f3540e;
        float y = motionEvent2.getY();
        PointF pointF = this.f3537b;
        float f4 = (y - pointF.y) / this.f3540e;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d2 = this.g;
        float cos = (float) Math.cos(d2);
        float sin = (float) Math.sin(d2);
        PointF pointF2 = this.f3538c;
        pointF2.x -= (cos * x) - (sin * f4);
        float f5 = (cos * f4) + (sin * x) + pointF2.y;
        pointF2.y = f5;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f5));
        j jVar = this.f3539d;
        PointF pointF3 = this.f3538c;
        synchronized (jVar) {
            jVar.h = pointF3.y;
            jVar.b();
            Matrix.setRotateM(jVar.g, 0, -pointF3.x, 0.0f, 1.0f, 0.0f);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        i iVar = this.h;
        if (iVar != null) {
            return ((n) iVar).f3479b.k();
        }
        return false;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f3541f.onTouchEvent(motionEvent);
    }
}
