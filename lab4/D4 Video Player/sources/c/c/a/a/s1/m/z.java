package c.c.a.a.s1.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public final class z extends p {
    public static final Parcelable.Creator<z> CREATOR = new y();

    /* renamed from: c, reason: collision with root package name */
    public final String f2778c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2779d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = c.c.a.a.z1.l0.f3761a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f2778c = r0
            java.lang.String r3 = r3.readString()
            r2.f2779d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.s1.m.z.<init>(android.os.Parcel):void");
    }

    public z(String str, String str2, String str3) {
        super(str);
        this.f2778c = str2;
        this.f2779d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z.class != obj.getClass()) {
            return false;
        }
        z zVar = (z) obj;
        return this.f2766b.equals(zVar.f2766b) && l0.a(this.f2778c, zVar.f2778c) && l0.a(this.f2779d, zVar.f2779d);
    }

    public int hashCode() {
        int hashCode = (this.f2766b.hashCode() + 527) * 31;
        String str = this.f2778c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2779d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // c.c.a.a.s1.m.p
    public String toString() {
        return this.f2766b + ": url=" + this.f2779d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2766b);
        parcel.writeString(this.f2778c);
        parcel.writeString(this.f2779d);
    }
}
