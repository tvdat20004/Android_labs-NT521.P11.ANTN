package c.c.a.a.u1.w0.x;

import android.net.Uri;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f3070a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3071b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3072c;

    /* renamed from: d, reason: collision with root package name */
    public int f3073d;

    public i(String str, long j, long j2) {
        this.f3072c = str == null ? "" : str;
        this.f3070a = j;
        this.f3071b = j2;
    }

    public i a(i iVar, String str) {
        String q = c.c.a.a.x1.p.q(str, this.f3072c);
        if (iVar != null && q.equals(c.c.a.a.x1.p.q(str, iVar.f3072c))) {
            long j = this.f3071b;
            if (j != -1) {
                long j2 = this.f3070a;
                if (j2 + j == iVar.f3070a) {
                    long j3 = iVar.f3071b;
                    return new i(q, j2, j3 == -1 ? -1L : j + j3);
                }
            }
            long j4 = iVar.f3071b;
            if (j4 != -1) {
                long j5 = iVar.f3070a;
                if (j5 + j4 == this.f3070a) {
                    return new i(q, j5, j == -1 ? -1L : j4 + j);
                }
            }
        }
        return null;
    }

    public Uri b(String str) {
        return c.c.a.a.x1.p.r(str, this.f3072c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        return this.f3070a == iVar.f3070a && this.f3071b == iVar.f3071b && this.f3072c.equals(iVar.f3072c);
    }

    public int hashCode() {
        if (this.f3073d == 0) {
            this.f3073d = this.f3072c.hashCode() + ((((527 + ((int) this.f3070a)) * 31) + ((int) this.f3071b)) * 31);
        }
        return this.f3073d;
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("RangedUri(referenceUri=");
        j.append(this.f3072c);
        j.append(", start=");
        j.append(this.f3070a);
        j.append(", length=");
        j.append(this.f3071b);
        j.append(")");
        return j.toString();
    }
}
