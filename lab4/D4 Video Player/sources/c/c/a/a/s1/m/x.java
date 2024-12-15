package c.c.a.a.s1.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public final class x extends p {
    public static final Parcelable.Creator<x> CREATOR = new w();

    /* renamed from: c, reason: collision with root package name */
    public final String f2776c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2777d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public x(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = c.c.a.a.z1.l0.f3761a
            r2.<init>(r0)
            java.lang.String r0 = r3.readString()
            r2.f2776c = r0
            java.lang.String r3 = r3.readString()
            r2.f2777d = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.s1.m.x.<init>(android.os.Parcel):void");
    }

    public x(String str, String str2, String str3) {
        super(str);
        this.f2776c = str2;
        this.f2777d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return this.f2766b.equals(xVar.f2766b) && l0.a(this.f2776c, xVar.f2776c) && l0.a(this.f2777d, xVar.f2777d);
    }

    public int hashCode() {
        int hashCode = (this.f2766b.hashCode() + 527) * 31;
        String str = this.f2776c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2777d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // c.c.a.a.s1.m.p
    public String toString() {
        return this.f2766b + ": value=" + this.f2777d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2766b);
        parcel.writeString(this.f2776c);
        parcel.writeString(this.f2777d);
    }
}
