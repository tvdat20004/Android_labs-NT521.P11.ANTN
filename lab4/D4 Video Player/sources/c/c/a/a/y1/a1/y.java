package c.c.a.a.y1.a1;

import java.util.Comparator;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class y implements j, Comparator<n> {

    /* renamed from: b, reason: collision with root package name */
    public final TreeSet<n> f3607b = new TreeSet<>(this);

    /* renamed from: c, reason: collision with root package name */
    public long f3608c;

    public y(long j) {
    }

    public final void a(c cVar, long j) {
        while (this.f3608c + j > 104857600 && !this.f3607b.isEmpty()) {
            try {
                n first = this.f3607b.first();
                a0 a0Var = (a0) cVar;
                synchronized (a0Var) {
                    c.c.a.a.x1.p.g(!a0Var.j);
                    a0Var.m(first);
                }
            } catch (b unused) {
            }
        }
    }

    public void b(c cVar, n nVar) {
        this.f3607b.add(nVar);
        this.f3608c += nVar.f3576d;
        a(cVar, 0L);
    }

    @Override // java.util.Comparator
    public int compare(n nVar, n nVar2) {
        n nVar3 = nVar;
        n nVar4 = nVar2;
        long j = nVar3.g;
        long j2 = nVar4.g;
        return j - j2 == 0 ? nVar3.compareTo(nVar4) : j < j2 ? -1 : 1;
    }
}
