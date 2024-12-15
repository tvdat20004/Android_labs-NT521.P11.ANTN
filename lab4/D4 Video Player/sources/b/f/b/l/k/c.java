package b.f.b.l.k;

import androidx.constraintlayout.widget.ConstraintLayout;
import b.f.b.l.d;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<b.f.b.l.d> f994a = new ArrayList<>();

    /* renamed from: b, reason: collision with root package name */
    public b f995b = new b();

    /* renamed from: c, reason: collision with root package name */
    public b.f.b.l.e f996c;

    public interface a {
    }

    public c(b.f.b.l.e eVar) {
        this.f996c = eVar;
    }

    public final boolean a(a aVar, b.f.b.l.d dVar, boolean z) {
        d.a aVar2 = d.a.FIXED;
        this.f995b.f988a = dVar.l();
        this.f995b.f989b = dVar.p();
        this.f995b.f990c = dVar.q();
        this.f995b.f991d = dVar.k();
        b bVar = this.f995b;
        bVar.i = false;
        bVar.j = z;
        d.a aVar3 = bVar.f988a;
        d.a aVar4 = d.a.MATCH_CONSTRAINT;
        boolean z2 = aVar3 == aVar4;
        boolean z3 = bVar.f989b == aVar4;
        boolean z4 = z2 && dVar.S > 0.0f;
        boolean z5 = z3 && dVar.S > 0.0f;
        if (z4 && dVar.o[0] == 4) {
            bVar.f988a = aVar2;
        }
        if (z5 && dVar.o[1] == 4) {
            bVar.f989b = aVar2;
        }
        ((ConstraintLayout.b) aVar).b(dVar, bVar);
        dVar.L(this.f995b.f992e);
        dVar.G(this.f995b.f993f);
        b bVar2 = this.f995b;
        dVar.z = bVar2.h;
        dVar.D(bVar2.g);
        b bVar3 = this.f995b;
        bVar3.j = false;
        return bVar3.i;
    }

    public final void b(b.f.b.l.e eVar, int i, int i2) {
        int i3 = eVar.X;
        int i4 = eVar.Y;
        eVar.J(0);
        eVar.I(0);
        eVar.Q = i;
        int i5 = eVar.X;
        if (i < i5) {
            eVar.Q = i5;
        }
        eVar.R = i2;
        int i6 = eVar.Y;
        if (i2 < i6) {
            eVar.R = i6;
        }
        eVar.J(i3);
        eVar.I(i4);
        this.f996c.O();
    }
}
