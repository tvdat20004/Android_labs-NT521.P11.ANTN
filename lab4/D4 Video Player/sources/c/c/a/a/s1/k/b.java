package c.c.a.a.s1.k;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.z1.l0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c.c.a.a.s1.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f2728b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2729c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2730d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2731e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2732f;
    public final int g;
    public final int h;
    public final byte[] i;

    public b(Parcel parcel) {
        this.f2728b = parcel.readInt();
        String readString = parcel.readString();
        int i = l0.f3761a;
        this.f2729c = readString;
        this.f2730d = parcel.readString();
        this.f2731e = parcel.readInt();
        this.f2732f = parcel.readInt();
        this.g = parcel.readInt();
        this.h = parcel.readInt();
        this.i = parcel.createByteArray();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2728b == bVar.f2728b && this.f2729c.equals(bVar.f2729c) && this.f2730d.equals(bVar.f2730d) && this.f2731e == bVar.f2731e && this.f2732f == bVar.f2732f && this.g == bVar.g && this.h == bVar.h && Arrays.equals(this.i, bVar.i);
    }

    public int hashCode() {
        return Arrays.hashCode(this.i) + ((((((((((this.f2730d.hashCode() + ((this.f2729c.hashCode() + ((527 + this.f2728b) * 31)) * 31)) * 31) + this.f2731e) * 31) + this.f2732f) * 31) + this.g) * 31) + this.h) * 31);
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("Picture: mimeType=");
        j.append(this.f2729c);
        j.append(", description=");
        j.append(this.f2730d);
        return j.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2728b);
        parcel.writeString(this.f2729c);
        parcel.writeString(this.f2730d);
        parcel.writeInt(this.f2731e);
        parcel.writeInt(this.f2732f);
        parcel.writeInt(this.g);
        parcel.writeInt(this.h);
        parcel.writeByteArray(this.i);
    }
}
