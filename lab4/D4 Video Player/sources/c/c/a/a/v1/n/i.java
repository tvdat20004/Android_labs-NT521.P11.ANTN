package c.c.a.a.v1.n;

/* loaded from: classes.dex */
public final class i extends c.c.a.a.v1.j implements Comparable<i> {
    public long h;

    public i(h hVar) {
    }

    @Override // java.lang.Comparable
    public int compareTo(i iVar) {
        i iVar2 = iVar;
        if (h() == iVar2.h()) {
            long j = this.f2181e - iVar2.f2181e;
            if (j == 0) {
                j = this.h - iVar2.h;
                if (j == 0) {
                    return 0;
                }
            }
            if (j > 0) {
                return 1;
            }
        } else if (h()) {
            return 1;
        }
        return -1;
    }
}
