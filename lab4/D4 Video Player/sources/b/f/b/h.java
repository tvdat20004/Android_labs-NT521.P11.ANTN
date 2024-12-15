package b.f.b;

/* loaded from: classes.dex */
public class h implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public k f945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f946c;

    public h(i iVar, i iVar2) {
        this.f946c = iVar;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        return this.f945b.f954b - ((k) obj).f954b;
    }

    public String toString() {
        String str = "[ ";
        if (this.f945b != null) {
            for (int i = 0; i < 9; i++) {
                StringBuilder j = c.a.a.a.a.j(str);
                j.append(this.f945b.h[i]);
                j.append(" ");
                str = j.toString();
            }
        }
        return str + "] " + this.f945b;
    }
}
