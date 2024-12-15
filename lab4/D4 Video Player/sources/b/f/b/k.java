package b.f.b;

import java.util.Arrays;

/* loaded from: classes.dex */
public class k {
    public static int n = 1;

    /* renamed from: a, reason: collision with root package name */
    public boolean f953a;

    /* renamed from: e, reason: collision with root package name */
    public float f957e;
    public j i;

    /* renamed from: b, reason: collision with root package name */
    public int f954b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f955c = -1;

    /* renamed from: d, reason: collision with root package name */
    public int f956d = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f958f = false;
    public float[] g = new float[9];
    public float[] h = new float[9];
    public c[] j = new c[16];
    public int k = 0;
    public int l = 0;
    public int m = -1;

    public k(j jVar) {
        this.i = jVar;
    }

    public final void a(c cVar) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            if (i >= i2) {
                c[] cVarArr = this.j;
                if (i2 >= cVarArr.length) {
                    this.j = (c[]) Arrays.copyOf(cVarArr, cVarArr.length * 2);
                }
                c[] cVarArr2 = this.j;
                int i3 = this.k;
                cVarArr2[i3] = cVar;
                this.k = i3 + 1;
                return;
            }
            if (this.j[i] == cVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(c cVar) {
        int i = this.k;
        int i2 = 0;
        while (i2 < i) {
            if (this.j[i2] == cVar) {
                while (i2 < i - 1) {
                    c[] cVarArr = this.j;
                    int i3 = i2 + 1;
                    cVarArr[i2] = cVarArr[i3];
                    i2 = i3;
                }
                this.k--;
                return;
            }
            i2++;
        }
    }

    public void c() {
        this.i = j.UNKNOWN;
        this.f956d = 0;
        this.f954b = -1;
        this.f955c = -1;
        this.f957e = 0.0f;
        this.f958f = false;
        this.m = -1;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.f953a = false;
        Arrays.fill(this.h, 0.0f);
    }

    public void d(e eVar, float f2) {
        this.f957e = f2;
        this.f958f = true;
        this.m = -1;
        int i = this.k;
        this.f955c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].m(eVar, this, false);
        }
        this.k = 0;
    }

    public final void e(e eVar, c cVar) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].n(eVar, cVar, false);
        }
        this.k = 0;
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("");
        j.append(this.f954b);
        return j.toString();
    }
}
