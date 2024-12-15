package c.c.a.a.z1;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f3776a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3777b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3778c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3779d;

    public q(byte[] bArr, int i) {
        y yVar = new y(bArr);
        yVar.j(i * 8);
        yVar.f(16);
        yVar.f(16);
        yVar.f(24);
        yVar.f(24);
        this.f3776a = yVar.f(20);
        this.f3777b = yVar.f(3) + 1;
        this.f3778c = yVar.f(5) + 1;
        this.f3779d = ((yVar.f(4) & 15) << 32) | (yVar.f(32) & 4294967295L);
    }
}
