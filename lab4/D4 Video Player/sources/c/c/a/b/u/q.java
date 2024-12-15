package c.c.a.b.u;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.Objects;

/* loaded from: classes.dex */
public class q extends u {

    /* renamed from: b, reason: collision with root package name */
    public final s f4051b;

    /* renamed from: c, reason: collision with root package name */
    public final float f4052c;

    /* renamed from: d, reason: collision with root package name */
    public final float f4053d;

    public q(s sVar, float f2, float f3) {
        this.f4051b = sVar;
        this.f4052c = f2;
        this.f4053d = f3;
    }

    @Override // c.c.a.b.u.u
    public void a(Matrix matrix, c.c.a.b.t.a aVar, int i, Canvas canvas) {
        s sVar = this.f4051b;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(sVar.f4060c - this.f4053d, sVar.f4059b - this.f4052c), 0.0f);
        Matrix matrix2 = new Matrix(matrix);
        matrix2.preTranslate(this.f4052c, this.f4053d);
        matrix2.preRotate(b());
        Objects.requireNonNull(aVar);
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = c.c.a.b.t.a.i;
        iArr[0] = aVar.f4013f;
        iArr[1] = aVar.f4012e;
        iArr[2] = aVar.f4011d;
        Paint paint = aVar.f4010c;
        float f2 = rectF.left;
        paint.setShader(new LinearGradient(f2, rectF.top, f2, rectF.bottom, iArr, c.c.a.b.t.a.j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, aVar.f4010c);
        canvas.restore();
    }

    public float b() {
        s sVar = this.f4051b;
        return (float) Math.toDegrees(Math.atan((sVar.f4060c - this.f4053d) / (sVar.f4059b - this.f4052c)));
    }
}
