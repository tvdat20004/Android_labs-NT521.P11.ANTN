package c.c.a.a.s1.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public final class j extends p {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* renamed from: c, reason: collision with root package name */
    public final String f2754c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2755d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2756e;

    public j(Parcel parcel) {
        super("COMM");
        String readString = parcel.readString();
        int i = l0.f3761a;
        this.f2754c = readString;
        this.f2755d = parcel.readString();
        this.f2756e = parcel.readString();
    }

    public j(String str, String str2, String str3) {
        super("COMM");
        this.f2754c = str;
        this.f2755d = str2;
        this.f2756e = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return l0.a(this.f2755d, jVar.f2755d) && l0.a(this.f2754c, jVar.f2754c) && l0.a(this.f2756e, jVar.f2756e);
    }

    public int hashCode() {
        String str = this.f2754c;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2755d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2756e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // c.c.a.a.s1.m.p
    public String toString() {
        return this.f2766b + ": language=" + this.f2754c + ", description=" + this.f2755d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2766b);
        parcel.writeString(this.f2754c);
        parcel.writeString(this.f2756e);
    }
}
