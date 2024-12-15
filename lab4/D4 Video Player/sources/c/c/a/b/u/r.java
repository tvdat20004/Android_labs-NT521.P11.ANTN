package c.c.a.b.u;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* loaded from: classes.dex */
public class r extends t {
    public static final RectF h = new RectF();

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f4054b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f4055c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f4056d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f4057e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f4058f;

    @Deprecated
    public float g;

    public r(float f2, float f3, float f4, float f5) {
        this.f4054b = f2;
        this.f4055c = f3;
        this.f4056d = f4;
        this.f4057e = f5;
    }

    @Override // c.c.a.b.u.t
    public void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f4061a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = h;
        rectF.set(this.f4054b, this.f4055c, this.f4056d, this.f4057e);
        path.arcTo(rectF, this.f4058f, this.g, false);
        path.transform(matrix);
    }
}
