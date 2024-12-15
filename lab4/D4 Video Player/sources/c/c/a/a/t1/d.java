package c.c.a.a.t1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class d implements Comparable<d>, Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* renamed from: b, reason: collision with root package name */
    public final int f2813b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2814c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2815d;

    public d(int i, int i2, int i3) {
        this.f2813b = i;
        this.f2814c = i2;
        this.f2815d = i3;
    }

    public d(Parcel parcel) {
        this.f2813b = parcel.readInt();
        this.f2814c = parcel.readInt();
        this.f2815d = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public int compareTo(d dVar) {
        d dVar2 = dVar;
        int i = this.f2813b - dVar2.f2813b;
        if (i != 0) {
            return i;
        }
        int i2 = this.f2814c - dVar2.f2814c;
        return i2 == 0 ? this.f2815d - dVar2.f2815d : i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f2813b == dVar.f2813b && this.f2814c == dVar.f2814c && this.f2815d == dVar.f2815d;
    }

    public int hashCode() {
        return (((this.f2813b * 31) + this.f2814c) * 31) + this.f2815d;
    }

    public String toString() {
        return this.f2813b + "." + this.f2814c + "." + this.f2815d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2813b);
        parcel.writeInt(this.f2814c);
        parcel.writeInt(this.f2815d);
    }
}
