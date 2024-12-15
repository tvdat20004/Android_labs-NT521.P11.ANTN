package c.c.a.a.u1.w0.x;

import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    public final String f3065a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3066b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3067c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3068d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3069e;

    public h(String str, String str2, String str3, String str4, String str5) {
        this.f3065a = str;
        this.f3066b = str2;
        this.f3067c = str3;
        this.f3068d = str4;
        this.f3069e = str5;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return l0.a(this.f3065a, hVar.f3065a) && l0.a(this.f3066b, hVar.f3066b) && l0.a(this.f3067c, hVar.f3067c) && l0.a(this.f3068d, hVar.f3068d) && l0.a(this.f3069e, hVar.f3069e);
    }

    public int hashCode() {
        String str = this.f3065a;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3066b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3067c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f3068d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f3069e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
