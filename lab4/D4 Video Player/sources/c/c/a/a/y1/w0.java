package c.c.a.a.y1;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class w0 implements n {

    /* renamed from: a, reason: collision with root package name */
    public final n f3695a;

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.y1.a1.e f3696b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3697c;

    /* renamed from: d, reason: collision with root package name */
    public long f3698d;

    public w0(n nVar, c.c.a.a.y1.a1.e eVar) {
        Objects.requireNonNull(nVar);
        this.f3695a = nVar;
        this.f3696b = eVar;
    }

    @Override // c.c.a.a.y1.n
    public long a(q qVar) {
        long a2 = this.f3695a.a(qVar);
        this.f3698d = a2;
        if (a2 == 0) {
            return 0L;
        }
        if (qVar.f3656f == -1 && a2 != -1) {
            qVar = qVar.d(0L, a2);
        }
        this.f3697c = true;
        c.c.a.a.y1.a1.e eVar = this.f3696b;
        Objects.requireNonNull(eVar);
        if (qVar.f3656f == -1 && qVar.b(4)) {
            eVar.f3555d = null;
        } else {
            eVar.f3555d = qVar;
            eVar.f3556e = qVar.b(16) ? eVar.f3553b : Long.MAX_VALUE;
            eVar.j = 0L;
            try {
                eVar.b();
            } catch (IOException e2) {
                throw new c.c.a.a.y1.a1.d(e2);
            }
        }
        return this.f3698d;
    }

    @Override // c.c.a.a.y1.n
    public void b(x0 x0Var) {
        this.f3695a.b(x0Var);
    }

    @Override // c.c.a.a.y1.n
    public Uri c() {
        return this.f3695a.c();
    }

    @Override // c.c.a.a.y1.n
    public void close() {
        try {
            this.f3695a.close();
            if (this.f3697c) {
                this.f3697c = false;
                c.c.a.a.y1.a1.e eVar = this.f3696b;
                if (eVar.f3555d == null) {
                    return;
                }
                try {
                    eVar.a();
                } catch (IOException e2) {
                    throw new c.c.a.a.y1.a1.d(e2);
                }
            }
        } catch (Throwable th) {
            if (this.f3697c) {
                this.f3697c = false;
                c.c.a.a.y1.a1.e eVar2 = this.f3696b;
                if (eVar2.f3555d != null) {
                    try {
                        eVar2.a();
                    } catch (IOException e3) {
                        throw new c.c.a.a.y1.a1.d(e3);
                    }
                }
            }
            throw th;
        }
    }

    @Override // c.c.a.a.y1.n
    public Map<String, List<String>> d() {
        return this.f3695a.d();
    }

    @Override // c.c.a.a.y1.n
    public int e(byte[] bArr, int i, int i2) {
        if (this.f3698d == 0) {
            return -1;
        }
        int e2 = this.f3695a.e(bArr, i, i2);
        if (e2 > 0) {
            c.c.a.a.y1.a1.e eVar = this.f3696b;
            if (eVar.f3555d != null) {
                int i3 = 0;
                while (i3 < e2) {
                    try {
                        if (eVar.i == eVar.f3556e) {
                            eVar.a();
                            eVar.b();
                        }
                        int min = (int) Math.min(e2 - i3, eVar.f3556e - eVar.i);
                        eVar.g.write(bArr, i + i3, min);
                        i3 += min;
                        long j = min;
                        eVar.i += j;
                        eVar.j += j;
                    } catch (IOException e3) {
                        throw new c.c.a.a.y1.a1.d(e3);
                    }
                }
            }
            long j2 = this.f3698d;
            if (j2 != -1) {
                this.f3698d = j2 - e2;
            }
        }
        return e2;
    }
}
