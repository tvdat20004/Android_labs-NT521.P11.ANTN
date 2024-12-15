package c.c.a.a.v1.u;

import c.c.a.a.z1.l0;
import c.c.a.a.z1.z;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class b extends c.c.a.a.v1.c {
    public static final int p = l0.l("payl");
    public static final int q = l0.l("sttg");
    public static final int r = l0.l("vttc");
    public final z n;
    public final f o;

    public b() {
        super("Mp4WebvttDecoder");
        this.n = new z();
        this.o = new f();
    }

    @Override // c.c.a.a.v1.c
    public c.c.a.a.v1.e k(byte[] bArr, int i, boolean z) {
        z zVar = this.n;
        zVar.f3800a = bArr;
        zVar.f3802c = i;
        zVar.f3801b = 0;
        ArrayList arrayList = new ArrayList();
        while (this.n.a() > 0) {
            if (this.n.a() < 8) {
                throw new c.c.a.a.v1.g("Incomplete Mp4Webvtt Top Level box header found.");
            }
            int d2 = this.n.d();
            if (this.n.d() == r) {
                z zVar2 = this.n;
                f fVar = this.o;
                int i2 = d2 - 8;
                fVar.b();
                while (i2 > 0) {
                    if (i2 < 8) {
                        throw new c.c.a.a.v1.g("Incomplete vtt cue box header found.");
                    }
                    int d3 = zVar2.d();
                    int d4 = zVar2.d();
                    int i3 = d3 - 8;
                    String i4 = l0.i(zVar2.f3800a, zVar2.f3801b, i3);
                    zVar2.B(i3);
                    i2 = (i2 - 8) - i3;
                    if (d4 == q) {
                        j.c(i4, fVar);
                    } else if (d4 == p) {
                        j.d(null, i4.trim(), fVar, Collections.emptyList());
                    }
                }
                arrayList.add(fVar.a());
            } else {
                this.n.B(d2 - 8);
            }
        }
        return new c(arrayList);
    }
}
