package c.c.a.a.v1.n;

import android.util.Log;
import c.c.a.a.z1.z;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c extends k {
    public final int h;
    public final int i;
    public final int j;
    public List<c.c.a.a.v1.b> m;
    public List<c.c.a.a.v1.b> n;
    public int o;
    public int p;
    public boolean q;
    public boolean r;
    public byte s;
    public byte t;
    public boolean v;
    public static final int[] w = {11, 1, 3, 12, 14, 5, 7, 9};
    public static final int[] x = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] y = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    public static final int[] z = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] A = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    public static final int[] B = {193, 201, 211, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    public static final int[] C = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] D = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    public final z g = new z();
    public final ArrayList<b> k = new ArrayList<>();
    public b l = new b(0, 4);
    public int u = 0;

    public c(String str, int i) {
        this.h = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i != 1) {
            if (i == 2) {
                this.j = 1;
                this.i = 0;
                l(0);
                k();
                this.v = true;
            }
            if (i == 3) {
                this.j = 0;
            } else if (i != 4) {
                Log.w("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            } else {
                this.j = 1;
            }
            this.i = 1;
            l(0);
            k();
            this.v = true;
        }
        this.j = 0;
        this.i = 0;
        l(0);
        k();
        this.v = true;
    }

    @Override // c.c.a.a.v1.n.k, c.c.a.a.o1.e
    public void a() {
    }

    @Override // c.c.a.a.v1.n.k
    public c.c.a.a.v1.e f() {
        List<c.c.a.a.v1.b> list = this.m;
        this.n = list;
        return new l(list);
    }

    @Override // c.c.a.a.v1.n.k, c.c.a.a.o1.e
    public void flush() {
        super.flush();
        this.m = null;
        this.n = null;
        l(0);
        m(4);
        k();
        this.q = false;
        this.r = false;
        this.s = (byte) 0;
        this.t = (byte) 0;
        this.u = 0;
        this.v = true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0272, code lost:
    
        if (r1 != 3) goto L202;
     */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0014 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8 A[SYNTHETIC] */
    @Override // c.c.a.a.v1.n.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(c.c.a.a.v1.j r14) {
        /*
            Method dump skipped, instructions count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.v1.n.c.g(c.c.a.a.v1.j):void");
    }

    @Override // c.c.a.a.v1.n.k
    public boolean h() {
        return this.m != this.n;
    }

    public final List<c.c.a.a.v1.b> j() {
        int size = this.k.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 2;
        for (int i2 = 0; i2 < size; i2++) {
            c.c.a.a.v1.b b2 = this.k.get(i2).b(Integer.MIN_VALUE);
            arrayList.add(b2);
            if (b2 != null) {
                i = Math.min(i, b2.i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i3 = 0; i3 < size; i3++) {
            c.c.a.a.v1.b bVar = (c.c.a.a.v1.b) arrayList.get(i3);
            if (bVar != null) {
                if (bVar.i != i) {
                    bVar = this.k.get(i3).b(i);
                }
                arrayList2.add(bVar);
            }
        }
        return arrayList2;
    }

    public final void k() {
        this.l.e(this.o);
        this.k.clear();
        this.k.add(this.l);
    }

    public final void l(int i) {
        int i2 = this.o;
        if (i2 == i) {
            return;
        }
        this.o = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.k.size(); i3++) {
                this.k.get(i3).g = i;
            }
            return;
        }
        k();
        if (i2 == 3 || i == 1 || i == 0) {
            this.m = Collections.emptyList();
        }
    }

    public final void m(int i) {
        this.p = i;
        this.l.h = i;
    }
}
