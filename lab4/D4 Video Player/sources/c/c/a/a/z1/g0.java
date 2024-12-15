package c.c.a.a.z1;

import android.os.SystemClock;
import c.c.a.a.u0;
import java.util.Objects;

/* loaded from: classes.dex */
public final class g0 implements s {

    /* renamed from: b, reason: collision with root package name */
    public final g f3740b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3741c;

    /* renamed from: d, reason: collision with root package name */
    public long f3742d;

    /* renamed from: e, reason: collision with root package name */
    public long f3743e;

    /* renamed from: f, reason: collision with root package name */
    public u0 f3744f = u0.f2816e;

    public g0(g gVar) {
        this.f3740b = gVar;
    }

    @Override // c.c.a.a.z1.s
    public u0 a() {
        return this.f3744f;
    }

    @Override // c.c.a.a.z1.s
    public u0 b(u0 u0Var) {
        if (this.f3741c) {
            c(i());
        }
        this.f3744f = u0Var;
        return u0Var;
    }

    public void c(long j) {
        this.f3742d = j;
        if (this.f3741c) {
            Objects.requireNonNull((h0) this.f3740b);
            this.f3743e = SystemClock.elapsedRealtime();
        }
    }

    @Override // c.c.a.a.z1.s
    public long i() {
        long j = this.f3742d;
        if (!this.f3741c) {
            return j;
        }
        Objects.requireNonNull((h0) this.f3740b);
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f3743e;
        return this.f3744f.f2817a == 1.0f ? j + c.c.a.a.s.a(elapsedRealtime) : j + (elapsedRealtime * r4.f2820d);
    }
}
