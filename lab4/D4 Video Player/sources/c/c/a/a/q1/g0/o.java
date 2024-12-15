package c.c.a.a.q1.g0;

import android.util.SparseArray;

/* loaded from: classes.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.q1.y f2556a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2557b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2558c;

    /* renamed from: f, reason: collision with root package name */
    public final c.c.a.a.z1.a0 f2561f;
    public byte[] g;
    public int h;
    public int i;
    public long j;
    public long l;
    public long p;
    public long q;
    public boolean r;

    /* renamed from: d, reason: collision with root package name */
    public final SparseArray<c.c.a.a.z1.w> f2559d = new SparseArray<>();

    /* renamed from: e, reason: collision with root package name */
    public final SparseArray<c.c.a.a.z1.v> f2560e = new SparseArray<>();
    public n m = new n(null);
    public n n = new n(null);
    public boolean k = false;
    public boolean o = false;

    public o(c.c.a.a.q1.y yVar, boolean z, boolean z2) {
        this.f2556a = yVar;
        this.f2557b = z;
        this.f2558c = z2;
        byte[] bArr = new byte[128];
        this.g = bArr;
        this.f2561f = new c.c.a.a.z1.a0(bArr, 0, 0);
        n nVar = this.n;
        nVar.f2549b = false;
        nVar.f2548a = false;
    }
}
