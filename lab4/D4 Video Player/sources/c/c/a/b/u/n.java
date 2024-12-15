package c.c.a.b.u;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public final v[] f4042a = new v[4];

    /* renamed from: b, reason: collision with root package name */
    public final Matrix[] f4043b = new Matrix[4];

    /* renamed from: c, reason: collision with root package name */
    public final Matrix[] f4044c = new Matrix[4];

    /* renamed from: d, reason: collision with root package name */
    public final PointF f4045d = new PointF();

    /* renamed from: e, reason: collision with root package name */
    public final Path f4046e = new Path();

    /* renamed from: f, reason: collision with root package name */
    public final Path f4047f = new Path();
    public final v g = new v();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public boolean j = true;

    public n() {
        for (int i = 0; i < 4; i++) {
            this.f4042a[i] = new v();
            this.f4043b[i] = new Matrix();
            this.f4044c[i] = new Matrix();
        }
    }

    public void a(m mVar, float f2, RectF rectF, g gVar, Path path) {
        int i;
        float centerX;
        float f3;
        char c2;
        char c3;
        f fVar;
        v vVar;
        Matrix matrix;
        Path path2;
        float f4;
        float f5;
        path.rewind();
        this.f4046e.rewind();
        this.f4047f.rewind();
        this.f4047f.addRect(rectF, Path.Direction.CW);
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                break;
            }
            c cVar = i2 != 1 ? i2 != 2 ? i2 != 3 ? mVar.f4035f : mVar.f4034e : mVar.h : mVar.g;
            d dVar = i2 != 1 ? i2 != 2 ? i2 != 3 ? mVar.f4031b : mVar.f4030a : mVar.f4033d : mVar.f4032c;
            v vVar2 = this.f4042a[i2];
            Objects.requireNonNull(dVar);
            dVar.a(vVar2, 90.0f, f2, cVar.a(rectF));
            int i3 = i2 + 1;
            float f6 = i3 * 90;
            this.f4043b[i2].reset();
            PointF pointF = this.f4045d;
            if (i2 == 1) {
                f4 = rectF.right;
            } else if (i2 != 2) {
                f4 = i2 != 3 ? rectF.right : rectF.left;
                f5 = rectF.top;
                pointF.set(f4, f5);
                Matrix matrix2 = this.f4043b[i2];
                PointF pointF2 = this.f4045d;
                matrix2.setTranslate(pointF2.x, pointF2.y);
                this.f4043b[i2].preRotate(f6);
                float[] fArr = this.h;
                v[] vVarArr = this.f4042a;
                fArr[0] = vVarArr[i2].f4065c;
                fArr[1] = vVarArr[i2].f4066d;
                this.f4043b[i2].mapPoints(fArr);
                this.f4044c[i2].reset();
                Matrix matrix3 = this.f4044c[i2];
                float[] fArr2 = this.h;
                matrix3.setTranslate(fArr2[0], fArr2[1]);
                this.f4044c[i2].preRotate(f6);
                i2 = i3;
            } else {
                f4 = rectF.left;
            }
            f5 = rectF.bottom;
            pointF.set(f4, f5);
            Matrix matrix22 = this.f4043b[i2];
            PointF pointF22 = this.f4045d;
            matrix22.setTranslate(pointF22.x, pointF22.y);
            this.f4043b[i2].preRotate(f6);
            float[] fArr3 = this.h;
            v[] vVarArr2 = this.f4042a;
            fArr3[0] = vVarArr2[i2].f4065c;
            fArr3[1] = vVarArr2[i2].f4066d;
            this.f4043b[i2].mapPoints(fArr3);
            this.f4044c[i2].reset();
            Matrix matrix32 = this.f4044c[i2];
            float[] fArr22 = this.h;
            matrix32.setTranslate(fArr22[0], fArr22[1]);
            this.f4044c[i2].preRotate(f6);
            i2 = i3;
        }
        int i4 = 0;
        for (i = 4; i4 < i; i = 4) {
            float[] fArr4 = this.h;
            v[] vVarArr3 = this.f4042a;
            fArr4[0] = vVarArr3[i4].f4063a;
            fArr4[1] = vVarArr3[i4].f4064b;
            this.f4043b[i4].mapPoints(fArr4);
            float[] fArr5 = this.h;
            if (i4 == 0) {
                path.moveTo(fArr5[0], fArr5[1]);
            } else {
                path.lineTo(fArr5[0], fArr5[1]);
            }
            this.f4042a[i4].b(this.f4043b[i4], path);
            if (gVar != null) {
                v vVar3 = this.f4042a[i4];
                Matrix matrix4 = this.f4043b[i4];
                BitSet bitSet = gVar.f4017a.f4027e;
                Objects.requireNonNull(vVar3);
                bitSet.set(i4, false);
                u[] uVarArr = gVar.f4017a.f4025c;
                vVar3.a(vVar3.f4068f);
                uVarArr[i4] = new o(vVar3, new ArrayList(vVar3.h), matrix4);
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            float[] fArr6 = this.h;
            v[] vVarArr4 = this.f4042a;
            fArr6[0] = vVarArr4[i4].f4065c;
            fArr6[1] = vVarArr4[i4].f4066d;
            this.f4043b[i4].mapPoints(fArr6);
            float[] fArr7 = this.i;
            v[] vVarArr5 = this.f4042a;
            fArr7[0] = vVarArr5[i6].f4063a;
            fArr7[1] = vVarArr5[i6].f4064b;
            this.f4043b[i6].mapPoints(fArr7);
            float f7 = this.h[0];
            float[] fArr8 = this.i;
            float max = Math.max(((float) Math.hypot(f7 - fArr8[0], r13[1] - fArr8[1])) - 0.001f, 0.0f);
            float[] fArr9 = this.h;
            v[] vVarArr6 = this.f4042a;
            fArr9[0] = vVarArr6[i4].f4065c;
            fArr9[1] = vVarArr6[i4].f4066d;
            this.f4043b[i4].mapPoints(fArr9);
            if (i4 == 1 || i4 == 3) {
                centerX = rectF.centerX();
                f3 = this.h[0];
            } else {
                centerX = rectF.centerY();
                f3 = this.h[1];
            }
            Math.abs(centerX - f3);
            this.g.d(0.0f, 0.0f, 270.0f, 0.0f);
            if (i4 != 1) {
                c2 = 2;
                if (i4 != 2) {
                    c3 = 3;
                    fVar = i4 != 3 ? mVar.j : mVar.i;
                } else {
                    c3 = 3;
                    fVar = mVar.l;
                }
            } else {
                c2 = 2;
                c3 = 3;
                fVar = mVar.k;
            }
            v vVar4 = this.g;
            Objects.requireNonNull(fVar);
            vVar4.c(max, 0.0f);
            Path path3 = new Path();
            this.g.b(this.f4044c[i4], path3);
            if (this.j && (b(path3, i4) || b(path3, i6))) {
                path3.op(path3, this.f4047f, Path.Op.DIFFERENCE);
                float[] fArr10 = this.h;
                v vVar5 = this.g;
                fArr10[0] = vVar5.f4063a;
                fArr10[1] = vVar5.f4064b;
                this.f4044c[i4].mapPoints(fArr10);
                Path path4 = this.f4046e;
                float[] fArr11 = this.h;
                path4.moveTo(fArr11[0], fArr11[1]);
                vVar = this.g;
                matrix = this.f4044c[i4];
                path2 = this.f4046e;
            } else {
                vVar = this.g;
                matrix = this.f4044c[i4];
                path2 = path;
            }
            vVar.b(matrix, path2);
            if (gVar != null) {
                v vVar6 = this.g;
                Matrix matrix5 = this.f4044c[i4];
                Objects.requireNonNull(vVar6);
                gVar.f4017a.f4027e.set(i4 + 4, false);
                u[] uVarArr2 = gVar.f4017a.f4026d;
                vVar6.a(vVar6.f4068f);
                uVarArr2[i4] = new o(vVar6, new ArrayList(vVar6.h), matrix5);
            }
            i4 = i5;
        }
        path.close();
        this.f4046e.close();
        if (this.f4046e.isEmpty()) {
            return;
        }
        path.op(this.f4046e, Path.Op.UNION);
    }

    public final boolean b(Path path, int i) {
        Path path2 = new Path();
        this.f4042a[i].b(this.f4043b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
