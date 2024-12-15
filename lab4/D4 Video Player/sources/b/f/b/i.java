package b.f.b;

import java.util.Arrays;

/* loaded from: classes.dex */
public class i extends c {

    /* renamed from: f, reason: collision with root package name */
    public int f947f;
    public k[] g;
    public k[] h;
    public int i;
    public h j;

    public i(d dVar) {
        super(dVar);
        this.f947f = 128;
        this.g = new k[128];
        this.h = new k[128];
        this.i = 0;
        this.j = new h(this, this);
    }

    @Override // b.f.b.c
    public void b(k kVar) {
        this.j.f945b = kVar;
        Arrays.fill(kVar.h, 0.0f);
        kVar.h[kVar.f956d] = 1.0f;
        o(kVar);
    }

    @Override // b.f.b.c
    public void c() {
        this.i = 0;
        this.f929b = 0.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0053, code lost:
    
        if (r8 < r7) goto L31;
     */
    @Override // b.f.b.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b.f.b.k h(b.f.b.e r11, boolean[] r12) {
        /*
            r10 = this;
            r11 = 0
            r0 = -1
            r1 = r11
            r2 = r0
        L4:
            int r3 = r10.i
            if (r1 >= r3) goto L5d
            b.f.b.k[] r3 = r10.g
            r4 = r3[r1]
            int r5 = r4.f954b
            boolean r5 = r12[r5]
            if (r5 == 0) goto L13
            goto L5a
        L13:
            b.f.b.h r5 = r10.j
            r5.f945b = r4
            r4 = 8
            r6 = 1
            if (r2 != r0) goto L39
            java.util.Objects.requireNonNull(r5)
        L1f:
            if (r4 < 0) goto L35
            b.f.b.k r3 = r5.f945b
            float[] r3 = r3.h
            r3 = r3[r4]
            r7 = 0
            int r8 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r8 <= 0) goto L2d
            goto L35
        L2d:
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 >= 0) goto L32
            goto L36
        L32:
            int r4 = r4 + (-1)
            goto L1f
        L35:
            r6 = r11
        L36:
            if (r6 == 0) goto L5a
            goto L59
        L39:
            r3 = r3[r2]
            java.util.Objects.requireNonNull(r5)
        L3e:
            if (r4 < 0) goto L56
            float[] r7 = r3.h
            r7 = r7[r4]
            b.f.b.k r8 = r5.f945b
            float[] r8 = r8.h
            r8 = r8[r4]
            int r9 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r9 != 0) goto L51
            int r4 = r4 + (-1)
            goto L3e
        L51:
            int r3 = (r8 > r7 ? 1 : (r8 == r7 ? 0 : -1))
            if (r3 >= 0) goto L56
            goto L57
        L56:
            r6 = r11
        L57:
            if (r6 == 0) goto L5a
        L59:
            r2 = r1
        L5a:
            int r1 = r1 + 1
            goto L4
        L5d:
            if (r2 != r0) goto L61
            r11 = 0
            return r11
        L61:
            b.f.b.k[] r11 = r10.g
            r11 = r11[r2]
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: b.f.b.i.h(b.f.b.e, boolean[]):b.f.b.k");
    }

    @Override // b.f.b.c
    public boolean i() {
        return this.i == 0;
    }

    @Override // b.f.b.c
    public void n(e eVar, c cVar, boolean z) {
        k kVar = cVar.f928a;
        if (kVar == null) {
            return;
        }
        b bVar = cVar.f931d;
        int k = bVar.k();
        for (int i = 0; i < k; i++) {
            k f2 = bVar.f(i);
            float a2 = bVar.a(i);
            h hVar = this.j;
            hVar.f945b = f2;
            boolean z2 = true;
            if (f2.f953a) {
                for (int i2 = 0; i2 < 9; i2++) {
                    float[] fArr = hVar.f945b.h;
                    fArr[i2] = (kVar.h[i2] * a2) + fArr[i2];
                    if (Math.abs(fArr[i2]) < 1.0E-4f) {
                        hVar.f945b.h[i2] = 0.0f;
                    } else {
                        z2 = false;
                    }
                }
                if (z2) {
                    hVar.f946c.p(hVar.f945b);
                }
                z2 = false;
            } else {
                for (int i3 = 0; i3 < 9; i3++) {
                    float f3 = kVar.h[i3];
                    if (f3 != 0.0f) {
                        float f4 = f3 * a2;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        hVar.f945b.h[i3] = f4;
                    } else {
                        hVar.f945b.h[i3] = 0.0f;
                    }
                }
            }
            if (z2) {
                o(f2);
            }
            this.f929b = (cVar.f929b * a2) + this.f929b;
        }
        p(kVar);
    }

    public final void o(k kVar) {
        int i;
        int i2 = this.i + 1;
        k[] kVarArr = this.g;
        if (i2 > kVarArr.length) {
            k[] kVarArr2 = (k[]) Arrays.copyOf(kVarArr, kVarArr.length * 2);
            this.g = kVarArr2;
            this.h = (k[]) Arrays.copyOf(kVarArr2, kVarArr2.length * 2);
        }
        k[] kVarArr3 = this.g;
        int i3 = this.i;
        kVarArr3[i3] = kVar;
        int i4 = i3 + 1;
        this.i = i4;
        if (i4 > 1 && kVarArr3[i4 - 1].f954b > kVar.f954b) {
            int i5 = 0;
            while (true) {
                i = this.i;
                if (i5 >= i) {
                    break;
                }
                this.h[i5] = this.g[i5];
                i5++;
            }
            Arrays.sort(this.h, 0, i, new g(this));
            for (int i6 = 0; i6 < this.i; i6++) {
                this.g[i6] = this.h[i6];
            }
        }
        kVar.f953a = true;
        kVar.a(this);
    }

    public final void p(k kVar) {
        int i = 0;
        while (i < this.i) {
            if (this.g[i] == kVar) {
                while (true) {
                    int i2 = this.i;
                    if (i >= i2 - 1) {
                        this.i = i2 - 1;
                        kVar.f953a = false;
                        return;
                    } else {
                        k[] kVarArr = this.g;
                        int i3 = i + 1;
                        kVarArr[i] = kVarArr[i3];
                        i = i3;
                    }
                }
            } else {
                i++;
            }
        }
    }

    @Override // b.f.b.c
    public String toString() {
        String str = " goal -> (" + this.f929b + ") : ";
        for (int i = 0; i < this.i; i++) {
            this.j.f945b = this.g[i];
            StringBuilder j = c.a.a.a.a.j(str);
            j.append(this.j);
            j.append(" ");
            str = j.toString();
        }
        return str;
    }
}
