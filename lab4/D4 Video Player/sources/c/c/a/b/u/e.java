package c.c.a.b.u;

/* loaded from: classes.dex */
public class e extends d {
    @Override // c.c.a.b.u.d
    public void a(v vVar, float f2, float f3, float f4) {
        vVar.d(0.0f, f4 * f3, 180.0f, 180.0f - f2);
        double d2 = f4;
        double d3 = f3;
        vVar.c((float) (Math.sin(Math.toRadians(f2)) * d2 * d3), (float) (Math.sin(Math.toRadians(90.0f - f2)) * d2 * d3));
    }
}
