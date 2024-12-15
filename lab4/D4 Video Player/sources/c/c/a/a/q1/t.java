package c.c.a.a.q1;

/* loaded from: classes.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final w f2665a;

    /* renamed from: b, reason: collision with root package name */
    public final w f2666b;

    public t(w wVar) {
        this.f2665a = wVar;
        this.f2666b = wVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f2665a.equals(tVar.f2665a) && this.f2666b.equals(tVar.f2666b);
    }

    public int hashCode() {
        return this.f2666b.hashCode() + (this.f2665a.hashCode() * 31);
    }

    public String toString() {
        String sb;
        StringBuilder j = c.a.a.a.a.j("[");
        j.append(this.f2665a);
        if (this.f2665a.equals(this.f2666b)) {
            sb = "";
        } else {
            StringBuilder j2 = c.a.a.a.a.j(", ");
            j2.append(this.f2666b);
            sb = j2.toString();
        }
        j.append(sb);
        j.append("]");
        return j.toString();
    }

    public t(w wVar, w wVar2) {
        this.f2665a = wVar;
        this.f2666b = wVar2;
    }
}
