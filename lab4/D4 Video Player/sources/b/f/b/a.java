package b.f.b;

import java.util.Arrays;

/* loaded from: classes.dex */
public class a implements b {

    /* renamed from: b, reason: collision with root package name */
    public final c f923b;

    /* renamed from: c, reason: collision with root package name */
    public final d f924c;

    /* renamed from: a, reason: collision with root package name */
    public int f922a = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f925d = 8;

    /* renamed from: e, reason: collision with root package name */
    public int[] f926e = new int[8];

    /* renamed from: f, reason: collision with root package name */
    public int[] f927f = new int[8];
    public float[] g = new float[8];
    public int h = -1;
    public int i = -1;
    public boolean j = false;

    public a(c cVar, d dVar) {
        this.f923b = cVar;
        this.f924c = dVar;
    }

    @Override // b.f.b.b
    public float a(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f922a; i3++) {
            if (i3 == i) {
                return this.g[i2];
            }
            i2 = this.f927f[i2];
        }
        return 0.0f;
    }

    @Override // b.f.b.b
    public float b(c cVar, boolean z) {
        float g = g(cVar.f928a);
        d(cVar.f928a, z);
        b bVar = cVar.f931d;
        int k = bVar.k();
        for (int i = 0; i < k; i++) {
            k f2 = bVar.f(i);
            e(f2, bVar.g(f2) * g, z);
        }
        return g;
    }

    @Override // b.f.b.b
    public final void c(k kVar, float f2) {
        if (f2 == 0.0f) {
            d(kVar, true);
            return;
        }
        int i = this.h;
        if (i == -1) {
            this.h = 0;
            this.g[0] = f2;
            this.f926e[0] = kVar.f954b;
            this.f927f[0] = -1;
            kVar.l++;
            kVar.a(this.f923b);
            this.f922a++;
            if (this.j) {
                return;
            }
            int i2 = this.i + 1;
            this.i = i2;
            int[] iArr = this.f926e;
            if (i2 >= iArr.length) {
                this.j = true;
                this.i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f922a; i4++) {
            int[] iArr2 = this.f926e;
            int i5 = iArr2[i];
            int i6 = kVar.f954b;
            if (i5 == i6) {
                this.g[i] = f2;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.f927f[i];
        }
        int i7 = this.i;
        int i8 = i7 + 1;
        if (this.j) {
            int[] iArr3 = this.f926e;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f926e;
        if (i7 >= iArr4.length && this.f922a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f926e;
                if (i9 >= iArr5.length) {
                    break;
                }
                if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr6 = this.f926e;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f925d * 2;
            this.f925d = i10;
            this.j = false;
            this.i = i7 - 1;
            this.g = Arrays.copyOf(this.g, i10);
            this.f926e = Arrays.copyOf(this.f926e, this.f925d);
            this.f927f = Arrays.copyOf(this.f927f, this.f925d);
        }
        this.f926e[i7] = kVar.f954b;
        this.g[i7] = f2;
        int[] iArr7 = this.f927f;
        if (i3 != -1) {
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            iArr7[i7] = this.h;
            this.h = i7;
        }
        kVar.l++;
        kVar.a(this.f923b);
        int i11 = this.f922a + 1;
        this.f922a = i11;
        if (!this.j) {
            this.i++;
        }
        int[] iArr8 = this.f926e;
        if (i11 >= iArr8.length) {
            this.j = true;
        }
        if (this.i >= iArr8.length) {
            this.j = true;
            this.i = iArr8.length - 1;
        }
    }

    @Override // b.f.b.b
    public final void clear() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f922a; i2++) {
            k kVar = this.f924c.f936d[this.f926e[i]];
            if (kVar != null) {
                kVar.b(this.f923b);
            }
            i = this.f927f[i];
        }
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.f922a = 0;
    }

    @Override // b.f.b.b
    public final float d(k kVar, boolean z) {
        int i = this.h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f922a) {
            if (this.f926e[i] == kVar.f954b) {
                if (i == this.h) {
                    this.h = this.f927f[i];
                } else {
                    int[] iArr = this.f927f;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    kVar.b(this.f923b);
                }
                kVar.l--;
                this.f922a--;
                this.f926e[i] = -1;
                if (this.j) {
                    this.i = i;
                }
                return this.g[i];
            }
            i2++;
            i3 = i;
            i = this.f927f[i];
        }
        return 0.0f;
    }

    @Override // b.f.b.b
    public void e(k kVar, float f2, boolean z) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.h;
            if (i == -1) {
                this.h = 0;
                this.g[0] = f2;
                this.f926e[0] = kVar.f954b;
                this.f927f[0] = -1;
                kVar.l++;
                kVar.a(this.f923b);
                this.f922a++;
                if (this.j) {
                    return;
                }
                int i2 = this.i + 1;
                this.i = i2;
                int[] iArr = this.f926e;
                if (i2 >= iArr.length) {
                    this.j = true;
                    this.i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f922a; i4++) {
                int[] iArr2 = this.f926e;
                int i5 = iArr2[i];
                int i6 = kVar.f954b;
                if (i5 == i6) {
                    float[] fArr = this.g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.h) {
                            this.h = this.f927f[i];
                        } else {
                            int[] iArr3 = this.f927f;
                            iArr3[i3] = iArr3[i];
                        }
                        if (z) {
                            kVar.b(this.f923b);
                        }
                        if (this.j) {
                            this.i = i;
                        }
                        kVar.l--;
                        this.f922a--;
                        return;
                    }
                    return;
                }
                if (iArr2[i] < i6) {
                    i3 = i;
                }
                i = this.f927f[i];
            }
            int i7 = this.i;
            int i8 = i7 + 1;
            if (this.j) {
                int[] iArr4 = this.f926e;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f926e;
            if (i7 >= iArr5.length && this.f922a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f926e;
                    if (i9 >= iArr6.length) {
                        break;
                    }
                    if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr7 = this.f926e;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f925d * 2;
                this.f925d = i10;
                this.j = false;
                this.i = i7 - 1;
                this.g = Arrays.copyOf(this.g, i10);
                this.f926e = Arrays.copyOf(this.f926e, this.f925d);
                this.f927f = Arrays.copyOf(this.f927f, this.f925d);
            }
            this.f926e[i7] = kVar.f954b;
            this.g[i7] = f2;
            int[] iArr8 = this.f927f;
            if (i3 != -1) {
                iArr8[i7] = iArr8[i3];
                iArr8[i3] = i7;
            } else {
                iArr8[i7] = this.h;
                this.h = i7;
            }
            kVar.l++;
            kVar.a(this.f923b);
            this.f922a++;
            if (!this.j) {
                this.i++;
            }
            int i11 = this.i;
            int[] iArr9 = this.f926e;
            if (i11 >= iArr9.length) {
                this.j = true;
                this.i = iArr9.length - 1;
            }
        }
    }

    @Override // b.f.b.b
    public k f(int i) {
        int i2 = this.h;
        for (int i3 = 0; i2 != -1 && i3 < this.f922a; i3++) {
            if (i3 == i) {
                return this.f924c.f936d[this.f926e[i2]];
            }
            i2 = this.f927f[i2];
        }
        return null;
    }

    @Override // b.f.b.b
    public final float g(k kVar) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f922a; i2++) {
            if (this.f926e[i] == kVar.f954b) {
                return this.g[i];
            }
            i = this.f927f[i];
        }
        return 0.0f;
    }

    @Override // b.f.b.b
    public boolean h(k kVar) {
        int i = this.h;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f922a; i2++) {
            if (this.f926e[i] == kVar.f954b) {
                return true;
            }
            i = this.f927f[i];
        }
        return false;
    }

    @Override // b.f.b.b
    public void i(float f2) {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f922a; i2++) {
            float[] fArr = this.g;
            fArr[i] = fArr[i] / f2;
            i = this.f927f[i];
        }
    }

    @Override // b.f.b.b
    public void j() {
        int i = this.h;
        for (int i2 = 0; i != -1 && i2 < this.f922a; i2++) {
            float[] fArr = this.g;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f927f[i];
        }
    }

    @Override // b.f.b.b
    public int k() {
        return this.f922a;
    }

    public String toString() {
        int i = this.h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f922a; i2++) {
            StringBuilder j = c.a.a.a.a.j(c.a.a.a.a.g(str, " -> "));
            j.append(this.g[i]);
            j.append(" : ");
            StringBuilder j2 = c.a.a.a.a.j(j.toString());
            j2.append(this.f924c.f936d[this.f926e[i]]);
            str = j2.toString();
            i = this.f927f[i];
        }
        return str;
    }
}
