package b.u.a.a;

/* loaded from: classes.dex */
public abstract class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public b.h.d.c[] f1832a;

    /* renamed from: b, reason: collision with root package name */
    public String f1833b;

    /* renamed from: c, reason: collision with root package name */
    public int f1834c;

    /* renamed from: d, reason: collision with root package name */
    public int f1835d;

    public o() {
        super(null);
        this.f1832a = null;
        this.f1834c = 0;
    }

    public o(o oVar) {
        super(null);
        this.f1832a = null;
        this.f1834c = 0;
        this.f1833b = oVar.f1833b;
        this.f1835d = oVar.f1835d;
        this.f1832a = b.h.b.h.o(oVar.f1832a);
    }

    public boolean c() {
        return false;
    }

    public b.h.d.c[] getPathData() {
        return this.f1832a;
    }

    public String getPathName() {
        return this.f1833b;
    }

    public void setPathData(b.h.d.c[] cVarArr) {
        if (!b.h.b.h.c(this.f1832a, cVarArr)) {
            this.f1832a = b.h.b.h.o(cVarArr);
            return;
        }
        b.h.d.c[] cVarArr2 = this.f1832a;
        for (int i = 0; i < cVarArr.length; i++) {
            cVarArr2[i].f1163a = cVarArr[i].f1163a;
            for (int i2 = 0; i2 < cVarArr[i].f1164b.length; i2++) {
                cVarArr2[i].f1164b[i2] = cVarArr[i].f1164b[i2];
            }
        }
    }
}
