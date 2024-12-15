package c.c.a.a.u1.v0;

import android.util.Log;
import c.c.a.a.q1.y;
import c.c.a.a.u1.k0;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f2940a;

    /* renamed from: b, reason: collision with root package name */
    public final k0[] f2941b;

    public c(int[] iArr, k0[] k0VarArr) {
        this.f2940a = iArr;
        this.f2941b = k0VarArr;
    }

    public void a(long j) {
        for (k0 k0Var : this.f2941b) {
            if (k0Var != null && k0Var.l != j) {
                k0Var.l = j;
                k0Var.j = true;
            }
        }
    }

    public y b(int i) {
        int i2 = 0;
        while (true) {
            int[] iArr = this.f2940a;
            if (i2 >= iArr.length) {
                Log.e("BaseMediaChunkOutput", "Unmatched track of type: " + i);
                return new c.c.a.a.q1.l();
            }
            if (i == iArr[i2]) {
                return this.f2941b[i2];
            }
            i2++;
        }
    }
}
