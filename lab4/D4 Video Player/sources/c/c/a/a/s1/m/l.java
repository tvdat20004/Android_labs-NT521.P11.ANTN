package c.c.a.a.s1.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.z1.l0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class l extends p {
    public static final Parcelable.Creator<l> CREATOR = new k();

    /* renamed from: c, reason: collision with root package name */
    public final String f2757c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2758d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2759e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f2760f;

    public l(Parcel parcel) {
        super("GEOB");
        String readString = parcel.readString();
        int i = l0.f3761a;
        this.f2757c = readString;
        this.f2758d = parcel.readString();
        this.f2759e = parcel.readString();
        this.f2760f = parcel.createByteArray();
    }

    public l(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f2757c = str;
        this.f2758d = str2;
        this.f2759e = str3;
        this.f2760f = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        l lVar = (l) obj;
        return l0.a(this.f2757c, lVar.f2757c) && l0.a(this.f2758d, lVar.f2758d) && l0.a(this.f2759e, lVar.f2759e) && Arrays.equals(this.f2760f, lVar.f2760f);
    }

    public int hashCode() {
        String str = this.f2757c;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2758d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2759e;
        return Arrays.hashCode(this.f2760f) + ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // c.c.a.a.s1.m.p
    public String toString() {
        return this.f2766b + ": mimeType=" + this.f2757c + ", filename=" + this.f2758d + ", description=" + this.f2759e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2757c);
        parcel.writeString(this.f2758d);
        parcel.writeString(this.f2759e);
        parcel.writeByteArray(this.f2760f);
    }
}
