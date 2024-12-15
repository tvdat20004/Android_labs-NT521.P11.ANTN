package c.c.a.b.u;

import android.graphics.Matrix;
import android.graphics.Path;

/* loaded from: classes.dex */
public class s extends t {

    /* renamed from: b, reason: collision with root package name */
    public float f4059b;

    /* renamed from: c, reason: collision with root package name */
    public float f4060c;

    @Override // c.c.a.b.u.t
    public void a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f4061a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f4059b, this.f4060c);
        path.transform(matrix);
    }
}
