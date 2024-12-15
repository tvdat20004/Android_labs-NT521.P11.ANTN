package c.c.a.a.z1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: classes.dex */
public class f0 {
    public static final /* synthetic */ int h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f3733a;

    /* renamed from: e, reason: collision with root package name */
    public int f3737e;

    /* renamed from: f, reason: collision with root package name */
    public int f3738f;
    public int g;

    /* renamed from: c, reason: collision with root package name */
    public final e0[] f3735c = new e0[5];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<e0> f3734b = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public int f3736d = -1;

    public f0(int i) {
        this.f3733a = i;
    }

    public void a(int i, float f2) {
        e0 e0Var;
        int i2;
        e0 e0Var2;
        int i3;
        if (this.f3736d != 1) {
            Collections.sort(this.f3734b, new Comparator() { // from class: c.c.a.a.z1.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i4 = f0.h;
                    return ((e0) obj).f3728a - ((e0) obj2).f3728a;
                }
            });
            this.f3736d = 1;
        }
        int i4 = this.g;
        if (i4 > 0) {
            e0[] e0VarArr = this.f3735c;
            int i5 = i4 - 1;
            this.g = i5;
            e0Var = e0VarArr[i5];
        } else {
            e0Var = new e0(null);
        }
        int i6 = this.f3737e;
        this.f3737e = i6 + 1;
        e0Var.f3728a = i6;
        e0Var.f3729b = i;
        e0Var.f3730c = f2;
        this.f3734b.add(e0Var);
        int i7 = this.f3738f + i;
        while (true) {
            this.f3738f = i7;
            while (true) {
                int i8 = this.f3738f;
                int i9 = this.f3733a;
                if (i8 <= i9) {
                    return;
                }
                i2 = i8 - i9;
                e0Var2 = this.f3734b.get(0);
                i3 = e0Var2.f3729b;
                if (i3 <= i2) {
                    this.f3738f -= i3;
                    this.f3734b.remove(0);
                    int i10 = this.g;
                    if (i10 < 5) {
                        e0[] e0VarArr2 = this.f3735c;
                        this.g = i10 + 1;
                        e0VarArr2[i10] = e0Var2;
                    }
                }
            }
            e0Var2.f3729b = i3 - i2;
            i7 = this.f3738f - i2;
        }
    }

    public float b(float f2) {
        if (this.f3736d != 0) {
            Collections.sort(this.f3734b, new Comparator() { // from class: c.c.a.a.z1.c
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int i = f0.h;
                    return Float.compare(((e0) obj).f3730c, ((e0) obj2).f3730c);
                }
            });
            this.f3736d = 0;
        }
        float f3 = f2 * this.f3738f;
        int i = 0;
        for (int i2 = 0; i2 < this.f3734b.size(); i2++) {
            e0 e0Var = this.f3734b.get(i2);
            i += e0Var.f3729b;
            if (i >= f3) {
                return e0Var.f3730c;
            }
        }
        if (this.f3734b.isEmpty()) {
            return Float.NaN;
        }
        return this.f3734b.get(r5.size() - 1).f3730c;
    }
}
