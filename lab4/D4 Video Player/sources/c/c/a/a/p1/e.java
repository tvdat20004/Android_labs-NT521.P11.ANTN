package c.c.a.a.p1;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.s;
import c.c.a.a.z1.l0;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class e implements Comparator<d>, Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new b();

    /* renamed from: b, reason: collision with root package name */
    public final d[] f2202b;

    /* renamed from: c, reason: collision with root package name */
    public int f2203c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2204d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2205e;

    public e(Parcel parcel) {
        this.f2204d = parcel.readString();
        Object[] createTypedArray = parcel.createTypedArray(d.CREATOR);
        int i = l0.f3761a;
        d[] dVarArr = (d[]) createTypedArray;
        this.f2202b = dVarArr;
        this.f2205e = dVarArr.length;
    }

    public e(String str, boolean z, d... dVarArr) {
        this.f2204d = str;
        dVarArr = z ? (d[]) dVarArr.clone() : dVarArr;
        this.f2202b = dVarArr;
        this.f2205e = dVarArr.length;
        Arrays.sort(dVarArr, this);
    }

    @Override // java.util.Comparator
    public int compare(d dVar, d dVar2) {
        d dVar3 = dVar;
        d dVar4 = dVar2;
        UUID uuid = s.f2715a;
        return uuid.equals(dVar3.f2198c) ? uuid.equals(dVar4.f2198c) ? 0 : 1 : dVar3.f2198c.compareTo(dVar4.f2198c);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return l0.a(this.f2204d, eVar.f2204d) && Arrays.equals(this.f2202b, eVar.f2202b);
    }

    public int hashCode() {
        if (this.f2203c == 0) {
            String str = this.f2204d;
            this.f2203c = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.f2202b);
        }
        return this.f2203c;
    }

    public e i(String str) {
        return l0.a(this.f2204d, str) ? this : new e(str, false, this.f2202b);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2204d);
        parcel.writeTypedArray(this.f2202b, 0);
    }
}
