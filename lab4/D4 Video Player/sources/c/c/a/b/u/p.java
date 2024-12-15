package c.c.a.b.u;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* loaded from: classes.dex */
public class p extends u {

    /* renamed from: b, reason: collision with root package name */
    public final r f4050b;

    public p(r rVar) {
        this.f4050b = rVar;
    }

    @Override // c.c.a.b.u.u
    public void a(Matrix matrix, c.c.a.b.t.a aVar, int i, Canvas canvas) {
        r rVar = this.f4050b;
        float f2 = rVar.f4058f;
        float f3 = rVar.g;
        r rVar2 = this.f4050b;
        RectF rectF = new RectF(rVar2.f4054b, rVar2.f4055c, rVar2.f4056d, rVar2.f4057e);
        int[] iArr = c.c.a.b.t.a.k;
        boolean z = f3 < 0.0f;
        Path path = aVar.g;
        if (z) {
            iArr[0] = 0;
            iArr[1] = aVar.f4013f;
            iArr[2] = aVar.f4012e;
            iArr[3] = aVar.f4011d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i;
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = aVar.f4011d;
            iArr[2] = aVar.f4012e;
            iArr[3] = aVar.f4013f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f5 = 1.0f - (i / width);
        float[] fArr = c.c.a.b.t.a.l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        aVar.f4009b.setShader(new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix);
        if (!z) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, aVar.h);
        }
        canvas.drawArc(rectF, f2, f3, true, aVar.f4009b);
        canvas.restore();
    }
}
