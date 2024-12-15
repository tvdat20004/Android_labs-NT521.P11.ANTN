package c.c.a.a.s1;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.z1.l0;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final b[] f2719b;

    public c(Parcel parcel) {
        this.f2719b = new b[parcel.readInt()];
        int i = 0;
        while (true) {
            b[] bVarArr = this.f2719b;
            if (i >= bVarArr.length) {
                return;
            }
            bVarArr[i] = (b) parcel.readParcelable(b.class.getClassLoader());
            i++;
        }
    }

    public c(List<? extends b> list) {
        b[] bVarArr = new b[list.size()];
        this.f2719b = bVarArr;
        list.toArray(bVarArr);
    }

    public c(b... bVarArr) {
        this.f2719b = bVarArr == null ? new b[0] : bVarArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f2719b, ((c) obj).f2719b);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f2719b);
    }

    public c i(b... bVarArr) {
        b[] bVarArr2 = this.f2719b;
        b[] bVarArr3 = (b[]) Arrays.copyOf(bVarArr2, bVarArr2.length + bVarArr.length);
        System.arraycopy(bVarArr, 0, bVarArr3, this.f2719b.length, bVarArr.length);
        int i = l0.f3761a;
        return new c(bVarArr3);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2719b.length);
        for (b bVar : this.f2719b) {
            parcel.writeParcelable(bVar, 0);
        }
    }
}
