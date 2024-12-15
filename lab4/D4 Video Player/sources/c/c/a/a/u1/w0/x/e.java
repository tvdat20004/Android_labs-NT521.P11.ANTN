package c.c.a.a.u1.w0.x;

import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f3054a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3055b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3056c;

    public e(String str, String str2, String str3) {
        this.f3054a = str;
        this.f3055b = str2;
        this.f3056c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return l0.a(this.f3054a, eVar.f3054a) && l0.a(this.f3055b, eVar.f3055b) && l0.a(this.f3056c, eVar.f3056c);
    }

    public int hashCode() {
        String str = this.f3054a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3055b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3056c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }
}
