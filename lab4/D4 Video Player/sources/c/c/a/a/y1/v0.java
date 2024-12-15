package c.c.a.a.y1;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v0 implements n {

    /* renamed from: a, reason: collision with root package name */
    public final n f3689a;

    /* renamed from: b, reason: collision with root package name */
    public long f3690b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f3691c;

    /* renamed from: d, reason: collision with root package name */
    public Map<String, List<String>> f3692d;

    public v0(n nVar) {
        Objects.requireNonNull(nVar);
        this.f3689a = nVar;
        this.f3691c = Uri.EMPTY;
        this.f3692d = Collections.emptyMap();
    }

    @Override // c.c.a.a.y1.n
    public long a(q qVar) {
        this.f3691c = qVar.f3651a;
        this.f3692d = Collections.emptyMap();
        long a2 = this.f3689a.a(qVar);
        Uri c2 = c();
        Objects.requireNonNull(c2);
        this.f3691c = c2;
        this.f3692d = d();
        return a2;
    }

    @Override // c.c.a.a.y1.n
    public void b(x0 x0Var) {
        this.f3689a.b(x0Var);
    }

    @Override // c.c.a.a.y1.n
    public Uri c() {
        return this.f3689a.c();
    }

    @Override // c.c.a.a.y1.n
    public void close() {
        this.f3689a.close();
    }

    @Override // c.c.a.a.y1.n
    public Map<String, List<String>> d() {
        return this.f3689a.d();
    }

    @Override // c.c.a.a.y1.n
    public int e(byte[] bArr, int i, int i2) {
        int e2 = this.f3689a.e(bArr, i, i2);
        if (e2 != -1) {
            this.f3690b += e2;
        }
        return e2;
    }
}
