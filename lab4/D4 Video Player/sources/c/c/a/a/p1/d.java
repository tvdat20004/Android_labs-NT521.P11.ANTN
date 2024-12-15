package c.c.a.a.p1;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.z1.l0;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* loaded from: classes.dex */
public final class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* renamed from: b, reason: collision with root package name */
    public int f2197b;

    /* renamed from: c, reason: collision with root package name */
    public final UUID f2198c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2199d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2200e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f2201f;
    public final boolean g;

    public d(Parcel parcel) {
        this.f2198c = new UUID(parcel.readLong(), parcel.readLong());
        this.f2199d = parcel.readString();
        String readString = parcel.readString();
        int i = l0.f3761a;
        this.f2200e = readString;
        this.f2201f = parcel.createByteArray();
        this.g = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        d dVar = (d) obj;
        return l0.a(this.f2199d, dVar.f2199d) && l0.a(this.f2200e, dVar.f2200e) && l0.a(this.f2198c, dVar.f2198c) && Arrays.equals(this.f2201f, dVar.f2201f);
    }

    public int hashCode() {
        if (this.f2197b == 0) {
            int hashCode = this.f2198c.hashCode() * 31;
            String str = this.f2199d;
            this.f2197b = Arrays.hashCode(this.f2201f) + ((this.f2200e.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31);
        }
        return this.f2197b;
    }

    public boolean i() {
        return this.f2201f != null;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2198c.getMostSignificantBits());
        parcel.writeLong(this.f2198c.getLeastSignificantBits());
        parcel.writeString(this.f2199d);
        parcel.writeString(this.f2200e);
        parcel.writeByteArray(this.f2201f);
        parcel.writeByte(this.g ? (byte) 1 : (byte) 0);
    }

    public d(UUID uuid, String str, String str2, byte[] bArr, boolean z) {
        Objects.requireNonNull(uuid);
        this.f2198c = uuid;
        this.f2199d = str;
        Objects.requireNonNull(str2);
        this.f2200e = str2;
        this.f2201f = bArr;
        this.g = z;
    }

    public d(UUID uuid, String str, byte[] bArr) {
        this(uuid, null, str, bArr, false);
    }
}
