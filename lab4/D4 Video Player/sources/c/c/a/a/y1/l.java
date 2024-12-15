package c.c.a.a.y1;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class l extends i {

    /* renamed from: e, reason: collision with root package name */
    public q f3637e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f3638f;
    public int g;
    public int h;

    public l() {
        super(false);
    }

    @Override // c.c.a.a.y1.n
    public long a(q qVar) {
        h(qVar);
        this.f3637e = qVar;
        this.h = (int) qVar.f3655e;
        Uri uri = qVar.f3651a;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            throw new c.c.a.a.s0(c.a.a.a.a.g("Unsupported scheme: ", scheme));
        }
        String[] E = c.c.a.a.z1.l0.E(uri.getSchemeSpecificPart(), ",");
        if (E.length != 2) {
            throw new c.c.a.a.s0("Unexpected URI format: " + uri);
        }
        String str = E[1];
        if (E[0].contains(";base64")) {
            try {
                this.f3638f = Base64.decode(str, 0);
            } catch (IllegalArgumentException e2) {
                throw new c.c.a.a.s0(c.a.a.a.a.g("Error while parsing Base64 encoded string: ", str), e2);
            }
        } else {
            this.f3638f = c.c.a.a.z1.l0.s(URLDecoder.decode(str, "US-ASCII"));
        }
        long j = qVar.f3656f;
        int length = j != -1 ? ((int) j) + this.h : this.f3638f.length;
        this.g = length;
        if (length > this.f3638f.length || this.h > length) {
            this.f3638f = null;
            throw new o(0);
        }
        i(qVar);
        return this.g - this.h;
    }

    @Override // c.c.a.a.y1.n
    public Uri c() {
        q qVar = this.f3637e;
        if (qVar != null) {
            return qVar.f3651a;
        }
        return null;
    }

    @Override // c.c.a.a.y1.n
    public void close() {
        if (this.f3638f != null) {
            this.f3638f = null;
            g();
        }
        this.f3637e = null;
    }

    @Override // c.c.a.a.y1.n
    public int e(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.g - this.h;
        if (i3 == 0) {
            return -1;
        }
        int min = Math.min(i2, i3);
        byte[] bArr2 = this.f3638f;
        int i4 = c.c.a.a.z1.l0.f3761a;
        System.arraycopy(bArr2, this.h, bArr, i, min);
        this.h += min;
        f(min);
        return min;
    }
}
