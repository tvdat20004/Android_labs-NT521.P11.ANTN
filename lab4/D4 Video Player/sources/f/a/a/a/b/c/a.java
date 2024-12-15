package f.a.a.a.b.c;

import c.c.a.a.x0;

/* loaded from: classes.dex */
public class a extends f.a.a.a.b.c.c.b {
    public x0 h0;

    @Override // f.a.a.a.b.c.c.b
    public long t0() {
        return 0L;
    }

    @Override // f.a.a.a.b.c.c.b
    public int u0() {
        x0 x0Var = this.h0;
        if (x0Var != null) {
            return x0Var.getDuration() > 3600000 ? 0 : 2;
        }
        d.a.a.a.f("JumpToFragment: player is null!", new Object[0]);
        return 0;
    }
}
