package b.u.a.a;

import android.graphics.Paint;

/* loaded from: classes.dex */
public class l extends o {

    /* renamed from: e, reason: collision with root package name */
    public int[] f1824e;

    /* renamed from: f, reason: collision with root package name */
    public b.h.c.a.a f1825f;
    public float g;
    public b.h.c.a.a h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public Paint.Cap n;
    public Paint.Join o;
    public float p;

    public l() {
        this.g = 0.0f;
        this.i = 1.0f;
        this.j = 1.0f;
        this.k = 0.0f;
        this.l = 1.0f;
        this.m = 0.0f;
        this.n = Paint.Cap.BUTT;
        this.o = Paint.Join.MITER;
        this.p = 4.0f;
    }

    public l(l lVar) {
        super(lVar);
        this.g = 0.0f;
        this.i = 1.0f;
        this.j = 1.0f;
        this.k = 0.0f;
        this.l = 1.0f;
        this.m = 0.0f;
        this.n = Paint.Cap.BUTT;
        this.o = Paint.Join.MITER;
        this.p = 4.0f;
        this.f1824e = lVar.f1824e;
        this.f1825f = lVar.f1825f;
        this.g = lVar.g;
        this.i = lVar.i;
        this.h = lVar.h;
        this.f1834c = lVar.f1834c;
        this.j = lVar.j;
        this.k = lVar.k;
        this.l = lVar.l;
        this.m = lVar.m;
        this.n = lVar.n;
        this.o = lVar.o;
        this.p = lVar.p;
    }

    @Override // b.u.a.a.n
    public boolean a() {
        return this.h.c() || this.f1825f.c();
    }

    @Override // b.u.a.a.n
    public boolean b(int[] iArr) {
        return this.f1825f.d(iArr) | this.h.d(iArr);
    }

    public float getFillAlpha() {
        return this.j;
    }

    public int getFillColor() {
        return this.h.f1138c;
    }

    public float getStrokeAlpha() {
        return this.i;
    }

    public int getStrokeColor() {
        return this.f1825f.f1138c;
    }

    public float getStrokeWidth() {
        return this.g;
    }

    public float getTrimPathEnd() {
        return this.l;
    }

    public float getTrimPathOffset() {
        return this.m;
    }

    public float getTrimPathStart() {
        return this.k;
    }

    public void setFillAlpha(float f2) {
        this.j = f2;
    }

    public void setFillColor(int i) {
        this.h.f1138c = i;
    }

    public void setStrokeAlpha(float f2) {
        this.i = f2;
    }

    public void setStrokeColor(int i) {
        this.f1825f.f1138c = i;
    }

    public void setStrokeWidth(float f2) {
        this.g = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.l = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.m = f2;
    }

    public void setTrimPathStart(float f2) {
        this.k = f2;
    }
}
