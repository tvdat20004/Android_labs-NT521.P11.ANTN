package c.c.a.a.u1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q0 implements Parcelable {
    public static final Parcelable.Creator<q0> CREATOR = new p0();

    /* renamed from: b, reason: collision with root package name */
    public final int f2918b;

    /* renamed from: c, reason: collision with root package name */
    public final c.c.a.a.l0[] f2919c;

    /* renamed from: d, reason: collision with root package name */
    public int f2920d;

    public q0(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f2918b = readInt;
        this.f2919c = new c.c.a.a.l0[readInt];
        for (int i = 0; i < this.f2918b; i++) {
            this.f2919c[i] = (c.c.a.a.l0) parcel.readParcelable(c.c.a.a.l0.class.getClassLoader());
        }
    }

    public q0(c.c.a.a.l0... l0VarArr) {
        c.c.a.a.x1.p.g(l0VarArr.length > 0);
        this.f2919c = l0VarArr;
        this.f2918b = l0VarArr.length;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q0.class != obj.getClass()) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f2918b == q0Var.f2918b && Arrays.equals(this.f2919c, q0Var.f2919c);
    }

    public int hashCode() {
        if (this.f2920d == 0) {
            this.f2920d = 527 + Arrays.hashCode(this.f2919c);
        }
        return this.f2920d;
    }

    public int i(c.c.a.a.l0 l0Var) {
        int i = 0;
        while (true) {
            c.c.a.a.l0[] l0VarArr = this.f2919c;
            if (i >= l0VarArr.length) {
                return -1;
            }
            if (l0Var == l0VarArr[i]) {
                return i;
            }
            i++;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2918b);
        for (int i2 = 0; i2 < this.f2918b; i2++) {
            parcel.writeParcelable(this.f2919c[i2], 0);
        }
    }
}
