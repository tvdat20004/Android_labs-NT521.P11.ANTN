package c.c.a.a.w1;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import c.c.a.a.u1.s0;
import c.c.a.a.w1.m;
import c.c.a.a.z1.l0;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class k extends u {
    public static final k B;
    public static final Parcelable.Creator<k> CREATOR;
    public final SparseBooleanArray A;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final int n;
    public final int o;
    public final boolean p;
    public final int q;
    public final int r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final int y;
    public final SparseArray<Map<s0, m.a>> z;

    static {
        u uVar = u.f3443f;
        B = new k(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, uVar.f3444b, Integer.MAX_VALUE, Integer.MAX_VALUE, true, false, false, uVar.f3445c, uVar.f3446d, uVar.f3447e, false, false, true, 0, new SparseArray(), new SparseBooleanArray());
        CREATOR = new j();
    }

    public k(int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, int i5, int i6, boolean z4, String str, int i7, int i8, boolean z5, boolean z6, boolean z7, String str2, boolean z8, int i9, boolean z9, boolean z10, boolean z11, int i10, SparseArray<Map<s0, m.a>> sparseArray, SparseBooleanArray sparseBooleanArray) {
        super(str, str2, z8, i9);
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = z;
        this.l = z2;
        this.m = z3;
        this.n = i5;
        this.o = i6;
        this.p = z4;
        this.q = i7;
        this.r = i8;
        this.s = z5;
        this.t = z6;
        this.u = z7;
        this.v = z9;
        this.w = z10;
        this.x = z11;
        this.y = i10;
        this.z = sparseArray;
        this.A = sparseBooleanArray;
    }

    public k(Parcel parcel) {
        super(parcel);
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt() != 0;
        this.l = parcel.readInt() != 0;
        this.m = parcel.readInt() != 0;
        this.n = parcel.readInt();
        this.o = parcel.readInt();
        this.p = parcel.readInt() != 0;
        this.q = parcel.readInt();
        this.r = parcel.readInt();
        this.s = parcel.readInt() != 0;
        this.t = parcel.readInt() != 0;
        this.u = parcel.readInt() != 0;
        this.v = parcel.readInt() != 0;
        this.w = parcel.readInt() != 0;
        this.x = parcel.readInt() != 0;
        this.y = parcel.readInt();
        int readInt = parcel.readInt();
        SparseArray<Map<s0, m.a>> sparseArray = new SparseArray<>(readInt);
        for (int i = 0; i < readInt; i++) {
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            HashMap hashMap = new HashMap(readInt3);
            for (int i2 = 0; i2 < readInt3; i2++) {
                hashMap.put((s0) parcel.readParcelable(s0.class.getClassLoader()), (m.a) parcel.readParcelable(m.a.class.getClassLoader()));
            }
            sparseArray.put(readInt2, hashMap);
        }
        this.z = sparseArray;
        this.A = parcel.readSparseBooleanArray();
    }

    @Override // c.c.a.a.w1.u, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0118 A[LOOP:0: B:59:0x00c1->B:77:0x0118, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00be A[SYNTHETIC] */
    @Override // c.c.a.a.w1.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.w1.k.equals(java.lang.Object):boolean");
    }

    @Override // c.c.a.a.w1.u
    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((super.hashCode() * 31) + this.g) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1 : 0)) * 31) + (this.l ? 1 : 0)) * 31) + (this.m ? 1 : 0)) * 31) + (this.p ? 1 : 0)) * 31) + this.n) * 31) + this.o) * 31) + this.q) * 31) + this.r) * 31) + (this.s ? 1 : 0)) * 31) + (this.t ? 1 : 0)) * 31) + (this.u ? 1 : 0)) * 31) + (this.v ? 1 : 0)) * 31) + (this.w ? 1 : 0)) * 31) + (this.x ? 1 : 0)) * 31) + this.y;
    }

    public final boolean i(int i) {
        return this.A.get(i);
    }

    public final m.a j(int i, s0 s0Var) {
        Map<s0, m.a> map = this.z.get(i);
        if (map != null) {
            return map.get(s0Var);
        }
        return null;
    }

    @Override // c.c.a.a.w1.u, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3444b);
        parcel.writeString(this.f3445c);
        boolean z = this.f3446d;
        int i2 = l0.f3761a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.f3447e);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p ? 1 : 0);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r);
        parcel.writeInt(this.s ? 1 : 0);
        parcel.writeInt(this.t ? 1 : 0);
        parcel.writeInt(this.u ? 1 : 0);
        parcel.writeInt(this.v ? 1 : 0);
        parcel.writeInt(this.w ? 1 : 0);
        parcel.writeInt(this.x ? 1 : 0);
        parcel.writeInt(this.y);
        SparseArray<Map<s0, m.a>> sparseArray = this.z;
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            int keyAt = sparseArray.keyAt(i3);
            Map<s0, m.a> valueAt = sparseArray.valueAt(i3);
            int size2 = valueAt.size();
            parcel.writeInt(keyAt);
            parcel.writeInt(size2);
            for (Map.Entry<s0, m.a> entry : valueAt.entrySet()) {
                parcel.writeParcelable(entry.getKey(), 0);
                parcel.writeParcelable(entry.getValue(), 0);
            }
        }
        parcel.writeSparseBooleanArray(this.A);
    }
}
