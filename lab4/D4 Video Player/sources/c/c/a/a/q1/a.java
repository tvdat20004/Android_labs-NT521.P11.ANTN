package c.c.a.a.q1;

import java.util.Objects;

/* loaded from: classes.dex */
public class a implements v {

    /* renamed from: a, reason: collision with root package name */
    public final b f2213a;

    /* renamed from: b, reason: collision with root package name */
    public final long f2214b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2215c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2216d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2217e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2218f;
    public final long g;

    public a(b bVar, long j, long j2, long j3, long j4, long j5, long j6) {
        this.f2213a = bVar;
        this.f2214b = j;
        this.f2215c = j2;
        this.f2216d = j3;
        this.f2217e = j4;
        this.f2218f = j5;
        this.g = j6;
    }

    @Override // c.c.a.a.q1.v
    public boolean c() {
        return true;
    }

    @Override // c.c.a.a.q1.v
    public t g(long j) {
        Objects.requireNonNull(this.f2213a);
        return new t(new w(j, d.a(j, this.f2215c, this.f2216d, this.f2217e, this.f2218f, this.g)));
    }

    @Override // c.c.a.a.q1.v
    public long j() {
        return this.f2214b;
    }
}
