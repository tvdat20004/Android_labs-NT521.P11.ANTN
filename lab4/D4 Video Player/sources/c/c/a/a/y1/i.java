package c.c.a.a.y1;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public abstract class i implements n {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3624a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<x0> f3625b = new ArrayList<>(1);

    /* renamed from: c, reason: collision with root package name */
    public int f3626c;

    /* renamed from: d, reason: collision with root package name */
    public q f3627d;

    public i(boolean z) {
        this.f3624a = z;
    }

    @Override // c.c.a.a.y1.n
    public final void b(x0 x0Var) {
        if (this.f3625b.contains(x0Var)) {
            return;
        }
        this.f3625b.add(x0Var);
        this.f3626c++;
    }

    @Override // c.c.a.a.y1.n
    public /* synthetic */ Map d() {
        return m.a(this);
    }

    public final void f(int i) {
        int i2 = c.c.a.a.z1.l0.f3761a;
        for (int i3 = 0; i3 < this.f3626c; i3++) {
            x0 x0Var = this.f3625b.get(i3);
            boolean z = this.f3624a;
            t tVar = (t) x0Var;
            synchronized (tVar) {
                if (z) {
                    tVar.h += i;
                }
            }
        }
    }

    public final void g() {
        int i = c.c.a.a.z1.l0.f3761a;
        for (int i2 = 0; i2 < this.f3626c; i2++) {
            x0 x0Var = this.f3625b.get(i2);
            boolean z = this.f3624a;
            t tVar = (t) x0Var;
            synchronized (tVar) {
                if (z) {
                    c.c.a.a.x1.p.g(tVar.f3673f > 0);
                    Objects.requireNonNull((c.c.a.a.z1.h0) tVar.f3672e);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    int i3 = (int) (elapsedRealtime - tVar.g);
                    tVar.j += i3;
                    long j = tVar.k;
                    long j2 = tVar.h;
                    tVar.k = j + j2;
                    if (i3 > 0) {
                        tVar.f3671d.a((int) Math.sqrt(j2), (8000 * j2) / r6);
                        if (tVar.j >= 2000 || tVar.k >= 524288) {
                            tVar.l = (long) tVar.f3671d.b(0.5f);
                        }
                        tVar.b(i3, tVar.h, tVar.l);
                        tVar.g = elapsedRealtime;
                        tVar.h = 0L;
                    }
                    tVar.f3673f--;
                }
            }
        }
        this.f3627d = null;
    }

    public final void h(q qVar) {
        for (int i = 0; i < this.f3626c; i++) {
            Objects.requireNonNull((t) this.f3625b.get(i));
        }
    }

    public final void i(q qVar) {
        this.f3627d = qVar;
        for (int i = 0; i < this.f3626c; i++) {
            x0 x0Var = this.f3625b.get(i);
            boolean z = this.f3624a;
            t tVar = (t) x0Var;
            synchronized (tVar) {
                if (z) {
                    if (tVar.f3673f == 0) {
                        Objects.requireNonNull((c.c.a.a.z1.h0) tVar.f3672e);
                        tVar.g = SystemClock.elapsedRealtime();
                    }
                    tVar.f3673f++;
                }
            }
        }
    }
}
