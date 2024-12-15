package b.u.a.a;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.Objects;

/* loaded from: classes.dex */
public class p {
    public static final Matrix q = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    public final Path f1836a;

    /* renamed from: b, reason: collision with root package name */
    public final Path f1837b;

    /* renamed from: c, reason: collision with root package name */
    public final Matrix f1838c;

    /* renamed from: d, reason: collision with root package name */
    public Paint f1839d;

    /* renamed from: e, reason: collision with root package name */
    public Paint f1840e;

    /* renamed from: f, reason: collision with root package name */
    public PathMeasure f1841f;
    public int g;
    public final m h;
    public float i;
    public float j;
    public float k;
    public float l;
    public int m;
    public String n;
    public Boolean o;
    public final b.e.b<String, Object> p;

    public p() {
        this.f1838c = new Matrix();
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = 255;
        this.n = null;
        this.o = null;
        this.p = new b.e.b<>();
        this.h = new m();
        this.f1836a = new Path();
        this.f1837b = new Path();
    }

    public p(p pVar) {
        this.f1838c = new Matrix();
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 0.0f;
        this.m = 255;
        this.n = null;
        this.o = null;
        b.e.b<String, Object> bVar = new b.e.b<>();
        this.p = bVar;
        this.h = new m(pVar.h, bVar);
        this.f1836a = new Path(pVar.f1836a);
        this.f1837b = new Path(pVar.f1837b);
        this.i = pVar.i;
        this.j = pVar.j;
        this.k = pVar.k;
        this.l = pVar.l;
        this.g = pVar.g;
        this.m = pVar.m;
        this.n = pVar.n;
        String str = pVar.n;
        if (str != null) {
            bVar.put(str, this);
        }
        this.o = pVar.o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    public final void a(m mVar, Matrix matrix, Canvas canvas, int i, int i2, ColorFilter colorFilter) {
        p pVar;
        p pVar2 = this;
        mVar.f1826a.set(matrix);
        mVar.f1826a.preConcat(mVar.j);
        canvas.save();
        ?? r11 = 0;
        int i3 = 0;
        while (i3 < mVar.f1827b.size()) {
            n nVar = mVar.f1827b.get(i3);
            if (nVar instanceof m) {
                a((m) nVar, mVar.f1826a, canvas, i, i2, colorFilter);
            } else if (nVar instanceof o) {
                o oVar = (o) nVar;
                float f2 = i / pVar2.k;
                float f3 = i2 / pVar2.l;
                float min = Math.min(f2, f3);
                Matrix matrix2 = mVar.f1826a;
                pVar2.f1838c.set(matrix2);
                pVar2.f1838c.postScale(f2, f3);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix2.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[r11], fArr[1]);
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f4 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f4) / max : 0.0f;
                if (abs == 0.0f) {
                    pVar = this;
                } else {
                    pVar = this;
                    Path path = pVar.f1836a;
                    Objects.requireNonNull(oVar);
                    path.reset();
                    b.h.d.c[] cVarArr = oVar.f1832a;
                    if (cVarArr != null) {
                        b.h.d.c.b(cVarArr, path);
                    }
                    Path path2 = pVar.f1836a;
                    pVar.f1837b.reset();
                    if (oVar.c()) {
                        pVar.f1837b.setFillType(oVar.f1834c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        pVar.f1837b.addPath(path2, pVar.f1838c);
                        canvas.clipPath(pVar.f1837b);
                    } else {
                        l lVar = (l) oVar;
                        float f5 = lVar.k;
                        if (f5 != 0.0f || lVar.l != 1.0f) {
                            float f6 = lVar.m;
                            float f7 = (f5 + f6) % 1.0f;
                            float f8 = (lVar.l + f6) % 1.0f;
                            if (pVar.f1841f == null) {
                                pVar.f1841f = new PathMeasure();
                            }
                            pVar.f1841f.setPath(pVar.f1836a, r11);
                            float length = pVar.f1841f.getLength();
                            float f9 = f7 * length;
                            float f10 = f8 * length;
                            path2.reset();
                            if (f9 > f10) {
                                pVar.f1841f.getSegment(f9, length, path2, true);
                                pVar.f1841f.getSegment(0.0f, f10, path2, true);
                            } else {
                                pVar.f1841f.getSegment(f9, f10, path2, true);
                            }
                            path2.rLineTo(0.0f, 0.0f);
                        }
                        pVar.f1837b.addPath(path2, pVar.f1838c);
                        b.h.c.a.a aVar = lVar.h;
                        if (aVar.b() || aVar.f1138c != 0) {
                            b.h.c.a.a aVar2 = lVar.h;
                            if (pVar.f1840e == null) {
                                Paint paint = new Paint(1);
                                pVar.f1840e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = pVar.f1840e;
                            if (aVar2.b()) {
                                Shader shader = aVar2.f1136a;
                                shader.setLocalMatrix(pVar.f1838c);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(lVar.j * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i4 = aVar2.f1138c;
                                float f11 = lVar.j;
                                PorterDuff.Mode mode = s.k;
                                paint2.setColor((i4 & 16777215) | (((int) (Color.alpha(i4) * f11)) << 24));
                            }
                            paint2.setColorFilter(colorFilter);
                            pVar.f1837b.setFillType(lVar.f1834c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(pVar.f1837b, paint2);
                        }
                        b.h.c.a.a aVar3 = lVar.f1825f;
                        if (aVar3.b() || aVar3.f1138c != 0) {
                            b.h.c.a.a aVar4 = lVar.f1825f;
                            if (pVar.f1839d == null) {
                                Paint paint3 = new Paint(1);
                                pVar.f1839d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = pVar.f1839d;
                            Paint.Join join = lVar.o;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = lVar.n;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(lVar.p);
                            if (aVar4.b()) {
                                Shader shader2 = aVar4.f1136a;
                                shader2.setLocalMatrix(pVar.f1838c);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(lVar.i * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i5 = aVar4.f1138c;
                                float f12 = lVar.i;
                                PorterDuff.Mode mode2 = s.k;
                                paint4.setColor((i5 & 16777215) | (((int) (Color.alpha(i5) * f12)) << 24));
                            }
                            paint4.setColorFilter(colorFilter);
                            paint4.setStrokeWidth(lVar.g * abs * min);
                            canvas.drawPath(pVar.f1837b, paint4);
                        }
                    }
                }
                i3++;
                pVar2 = pVar;
                r11 = 0;
            }
            pVar = pVar2;
            i3++;
            pVar2 = pVar;
            r11 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.m;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.m = i;
    }
}
