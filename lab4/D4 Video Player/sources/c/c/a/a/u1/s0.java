package c.c.a.a.u1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class s0 implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final int f2922b;

    /* renamed from: c, reason: collision with root package name */
    public final q0[] f2923c;

    /* renamed from: d, reason: collision with root package name */
    public int f2924d;

    /* renamed from: e, reason: collision with root package name */
    public static final s0 f2921e = new s0(new q0[0]);
    public static final Parcelable.Creator<s0> CREATOR = new r0();

    public s0(Parcel parcel) {
        int readInt = parcel.readInt();
        this.f2922b = readInt;
        this.f2923c = new q0[readInt];
        for (int i = 0; i < this.f2922b; i++) {
            this.f2923c[i] = (q0) parcel.readParcelable(q0.class.getClassLoader());
        }
    }

    public s0(q0... q0VarArr) {
        this.f2923c = q0VarArr;
        this.f2922b = q0VarArr.length;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s0.class != obj.getClass()) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return this.f2922b == s0Var.f2922b && Arrays.equals(this.f2923c, s0Var.f2923c);
    }

    public int hashCode() {
        if (this.f2924d == 0) {
            this.f2924d = Arrays.hashCode(this.f2923c);
        }
        return this.f2924d;
    }

    public int i(q0 q0Var) {
        for (int i = 0; i < this.f2922b; i++) {
            if (this.f2923c[i] == q0Var) {
                return i;
            }
        }
        return -1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2922b);
        for (int i2 = 0; i2 < this.f2922b; i2++) {
            parcel.writeParcelable(this.f2923c[i2], 0);
        }
    }
}
