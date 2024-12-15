package c.c.a.a.y1;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class v implements n {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3683a;

    /* renamed from: b, reason: collision with root package name */
    public final List<x0> f3684b;

    /* renamed from: c, reason: collision with root package name */
    public final n f3685c;

    /* renamed from: d, reason: collision with root package name */
    public n f3686d;

    /* renamed from: e, reason: collision with root package name */
    public n f3687e;

    /* renamed from: f, reason: collision with root package name */
    public n f3688f;
    public n g;
    public n h;
    public n i;
    public n j;
    public n k;

    public v(Context context, n nVar) {
        this.f3683a = context.getApplicationContext();
        Objects.requireNonNull(nVar);
        this.f3685c = nVar;
        this.f3684b = new ArrayList();
    }

    @Override // c.c.a.a.y1.n
    public long a(q qVar) {
        n nVar;
        f fVar;
        boolean z = true;
        c.c.a.a.x1.p.g(this.k == null);
        String scheme = qVar.f3651a.getScheme();
        Uri uri = qVar.f3651a;
        int i = c.c.a.a.z1.l0.f3761a;
        String scheme2 = uri.getScheme();
        if (!TextUtils.isEmpty(scheme2) && !"file".equals(scheme2)) {
            z = false;
        }
        if (z) {
            String path = qVar.f3651a.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.f3686d == null) {
                    b0 b0Var = new b0();
                    this.f3686d = b0Var;
                    f(b0Var);
                }
                nVar = this.f3686d;
                this.k = nVar;
                return nVar.a(qVar);
            }
            if (this.f3687e == null) {
                fVar = new f(this.f3683a);
                this.f3687e = fVar;
                f(fVar);
            }
            nVar = this.f3687e;
            this.k = nVar;
            return nVar.a(qVar);
        }
        if ("asset".equals(scheme)) {
            if (this.f3687e == null) {
                fVar = new f(this.f3683a);
                this.f3687e = fVar;
                f(fVar);
            }
            nVar = this.f3687e;
            this.k = nVar;
            return nVar.a(qVar);
        }
        if ("content".equals(scheme)) {
            if (this.f3688f == null) {
                k kVar = new k(this.f3683a);
                this.f3688f = kVar;
                f(kVar);
            }
            nVar = this.f3688f;
        } else if ("rtmp".equals(scheme)) {
            if (this.g == null) {
                try {
                    n nVar2 = (n) Class.forName("com.google.android.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(new Class[0]).newInstance(new Object[0]);
                    this.g = nVar2;
                    f(nVar2);
                } catch (ClassNotFoundException unused) {
                    Log.w("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                } catch (Exception e2) {
                    throw new RuntimeException("Error instantiating RTMP extension", e2);
                }
                if (this.g == null) {
                    this.g = this.f3685c;
                }
            }
            nVar = this.g;
        } else if ("udp".equals(scheme)) {
            if (this.h == null) {
                z0 z0Var = new z0();
                this.h = z0Var;
                f(z0Var);
            }
            nVar = this.h;
        } else if ("data".equals(scheme)) {
            if (this.i == null) {
                l lVar = new l();
                this.i = lVar;
                f(lVar);
            }
            nVar = this.i;
        } else if ("rawresource".equals(scheme)) {
            if (this.j == null) {
                u0 u0Var = new u0(this.f3683a);
                this.j = u0Var;
                f(u0Var);
            }
            nVar = this.j;
        } else {
            nVar = this.f3685c;
        }
        this.k = nVar;
        return nVar.a(qVar);
    }

    @Override // c.c.a.a.y1.n
    public void b(x0 x0Var) {
        this.f3685c.b(x0Var);
        this.f3684b.add(x0Var);
        n nVar = this.f3686d;
        if (nVar != null) {
            nVar.b(x0Var);
        }
        n nVar2 = this.f3687e;
        if (nVar2 != null) {
            nVar2.b(x0Var);
        }
        n nVar3 = this.f3688f;
        if (nVar3 != null) {
            nVar3.b(x0Var);
        }
        n nVar4 = this.g;
        if (nVar4 != null) {
            nVar4.b(x0Var);
        }
        n nVar5 = this.h;
        if (nVar5 != null) {
            nVar5.b(x0Var);
        }
        n nVar6 = this.i;
        if (nVar6 != null) {
            nVar6.b(x0Var);
        }
        n nVar7 = this.j;
        if (nVar7 != null) {
            nVar7.b(x0Var);
        }
    }

    @Override // c.c.a.a.y1.n
    public Uri c() {
        n nVar = this.k;
        if (nVar == null) {
            return null;
        }
        return nVar.c();
    }

    @Override // c.c.a.a.y1.n
    public void close() {
        n nVar = this.k;
        if (nVar != null) {
            try {
                nVar.close();
            } finally {
                this.k = null;
            }
        }
    }

    @Override // c.c.a.a.y1.n
    public Map<String, List<String>> d() {
        n nVar = this.k;
        return nVar == null ? Collections.emptyMap() : nVar.d();
    }

    @Override // c.c.a.a.y1.n
    public int e(byte[] bArr, int i, int i2) {
        n nVar = this.k;
        Objects.requireNonNull(nVar);
        return nVar.e(bArr, i, i2);
    }

    public final void f(n nVar) {
        for (int i = 0; i < this.f3684b.size(); i++) {
            nVar.b(this.f3684b.get(i));
        }
    }
}
