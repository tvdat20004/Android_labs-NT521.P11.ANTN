package c.c.a.b.u;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class v {

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public float f4063a;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public float f4064b;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public float f4065c;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public float f4066d;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public float f4067e;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public float f4068f;
    public final List<t> g = new ArrayList();
    public final List<u> h = new ArrayList();

    public v() {
        d(0.0f, 0.0f, 270.0f, 0.0f);
    }

    public final void a(float f2) {
        float f3 = this.f4067e;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f4065c;
        float f6 = this.f4066d;
        r rVar = new r(f5, f6, f5, f6);
        rVar.f4058f = this.f4067e;
        rVar.g = f4;
        this.h.add(new p(rVar));
        this.f4067e = f2;
    }

    public void b(Matrix matrix, Path path) {
        int size = this.g.size();
        for (int i = 0; i < size; i++) {
            this.g.get(i).a(matrix, path);
        }
    }

    public void c(float f2, float f3) {
        s sVar = new s();
        sVar.f4059b = f2;
        sVar.f4060c = f3;
        this.g.add(sVar);
        q qVar = new q(sVar, this.f4065c, this.f4066d);
        float b2 = qVar.b() + 270.0f;
        float b3 = qVar.b() + 270.0f;
        a(b2);
        this.h.add(qVar);
        this.f4067e = b3;
        this.f4065c = f2;
        this.f4066d = f3;
    }

    public void d(float f2, float f3, float f4, float f5) {
        this.f4063a = f2;
        this.f4064b = f3;
        this.f4065c = f2;
        this.f4066d = f3;
        this.f4067e = f4;
        this.f4068f = (f4 + f5) % 360.0f;
        this.g.clear();
        this.h.clear();
    }
}
