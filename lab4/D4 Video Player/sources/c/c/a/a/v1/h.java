package c.c.a.a.v1;

import c.c.a.a.l0;

/* loaded from: classes.dex */
public final class h implements i {
    public f a(l0 l0Var) {
        String str = l0Var.j;
        str.hashCode();
        switch (str) {
            case "application/dvbsubs":
                return new c.c.a.a.v1.o.a(l0Var.l);
            case "application/pgs":
                return new c.c.a.a.v1.p.b();
            case "application/x-mp4-vtt":
                return new c.c.a.a.v1.u.b();
            case "text/vtt":
                return new c.c.a.a.v1.u.k();
            case "application/x-quicktime-tx3g":
                return new c.c.a.a.v1.t.a(l0Var.l);
            case "text/x-ssa":
                return new c.c.a.a.v1.q.a(l0Var.l);
            case "application/x-mp4-cea-608":
            case "application/cea-608":
                return new c.c.a.a.v1.n.c(l0Var.j, l0Var.C);
            case "application/cea-708":
                return new c.c.a.a.v1.n.g(l0Var.C);
            case "application/x-subrip":
                return new c.c.a.a.v1.r.a();
            case "application/ttml+xml":
                return new c.c.a.a.v1.s.d();
            default:
                throw new IllegalArgumentException("Attempted to create decoder for unsupported format");
        }
    }
}
