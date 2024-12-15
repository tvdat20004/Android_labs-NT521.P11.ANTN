package c.c.a.a.x1.v;

import c.c.a.a.x1.p;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f3511a;

    /* renamed from: b, reason: collision with root package name */
    public final FloatBuffer f3512b;

    /* renamed from: c, reason: collision with root package name */
    public final FloatBuffer f3513c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3514d;

    public f(c.c.a.a.a2.a0.d dVar) {
        float[] fArr = dVar.f1902c;
        this.f3511a = fArr.length / 3;
        this.f3512b = p.i(fArr);
        this.f3513c = p.i(dVar.f1903d);
        int i = dVar.f1901b;
        this.f3514d = i != 1 ? i != 2 ? 4 : 6 : 5;
    }
}
