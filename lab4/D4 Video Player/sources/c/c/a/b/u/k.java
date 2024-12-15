package c.c.a.b.u;

/* loaded from: classes.dex */
public class k extends d {
    @Override // c.c.a.b.u.d
    public void a(v vVar, float f2, float f3, float f4) {
        vVar.d(0.0f, f4 * f3, 180.0f, 180.0f - f2);
        float f5 = f4 * 2.0f * f3;
        r rVar = new r(0.0f, 0.0f, f5, f5);
        rVar.f4058f = 180.0f;
        rVar.g = f2;
        vVar.g.add(rVar);
        p pVar = new p(rVar);
        float f6 = 180.0f + f2;
        boolean z = f2 < 0.0f;
        float f7 = z ? 0.0f : 180.0f;
        float f8 = z ? (180.0f + f6) % 360.0f : f6;
        vVar.a(f7);
        vVar.h.add(pVar);
        vVar.f4067e = f8;
        float f9 = (0.0f + f5) * 0.5f;
        float f10 = (f5 - 0.0f) / 2.0f;
        double d2 = f6;
        vVar.f4065c = (((float) Math.cos(Math.toRadians(d2))) * f10) + f9;
        vVar.f4066d = (f10 * ((float) Math.sin(Math.toRadians(d2)))) + f9;
    }
}
