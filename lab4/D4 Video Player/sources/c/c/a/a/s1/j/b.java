package c.c.a.a.s1.j;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.z1.l0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c.c.a.a.s1.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f2721b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2722c;

    /* renamed from: d, reason: collision with root package name */
    public final long f2723d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2724e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f2725f;
    public int g;

    public b(Parcel parcel) {
        String readString = parcel.readString();
        int i = l0.f3761a;
        this.f2721b = readString;
        this.f2722c = parcel.readString();
        this.f2723d = parcel.readLong();
        this.f2724e = parcel.readLong();
        this.f2725f = parcel.createByteArray();
    }

    public b(String str, String str2, long j, long j2, byte[] bArr) {
        this.f2721b = str;
        this.f2722c = str2;
        this.f2723d = j;
        this.f2724e = j2;
        this.f2725f = bArr;
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
        return this.f2723d == bVar.f2723d && this.f2724e == bVar.f2724e && l0.a(this.f2721b, bVar.f2721b) && l0.a(this.f2722c, bVar.f2722c) && Arrays.equals(this.f2725f, bVar.f2725f);
    }

    public int hashCode() {
        if (this.g == 0) {
            String str = this.f2721b;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f2722c;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            long j = this.f2723d;
            int i = (((hashCode + hashCode2) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.f2724e;
            this.g = Arrays.hashCode(this.f2725f) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.g;
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("EMSG: scheme=");
        j.append(this.f2721b);
        j.append(", id=");
        j.append(this.f2724e);
        j.append(", value=");
        j.append(this.f2722c);
        return j.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2721b);
        parcel.writeString(this.f2722c);
        parcel.writeLong(this.f2723d);
        parcel.writeLong(this.f2724e);
        parcel.writeByteArray(this.f2725f);
    }
}
