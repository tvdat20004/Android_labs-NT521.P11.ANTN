package c.c.a.a.s1.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public final class r extends p {
    public static final Parcelable.Creator<r> CREATOR = new q();

    /* renamed from: c, reason: collision with root package name */
    public final String f2767c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2768d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2769e;

    public r(Parcel parcel) {
        super("----");
        String readString = parcel.readString();
        int i = l0.f3761a;
        this.f2767c = readString;
        this.f2768d = parcel.readString();
        this.f2769e = parcel.readString();
    }

    public r(String str, String str2, String str3) {
        super("----");
        this.f2767c = str;
        this.f2768d = str2;
        this.f2769e = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        return l0.a(this.f2768d, rVar.f2768d) && l0.a(this.f2767c, rVar.f2767c) && l0.a(this.f2769e, rVar.f2769e);
    }

    public int hashCode() {
        String str = this.f2767c;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2768d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2769e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // c.c.a.a.s1.m.p
    public String toString() {
        return this.f2766b + ": domain=" + this.f2767c + ", description=" + this.f2768d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2766b);
        parcel.writeString(this.f2767c);
        parcel.writeString(this.f2769e);
    }
}
