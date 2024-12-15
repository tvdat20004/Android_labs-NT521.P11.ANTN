package c.c.a.a.s1.l;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public final class e implements c.c.a.a.s1.b {
    public static final Parcelable.Creator<e> CREATOR = new d();

    /* renamed from: b, reason: collision with root package name */
    public final String f2739b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2740c;

    public e(Parcel parcel) {
        this.f2739b = parcel.readString();
        this.f2740c = parcel.readString();
    }

    public e(String str, String str2) {
        this.f2739b = str;
        this.f2740c = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return l0.a(this.f2739b, eVar.f2739b) && l0.a(this.f2740c, eVar.f2740c);
    }

    public int hashCode() {
        String str = this.f2739b;
        int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2740c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("ICY: title=\"");
        j.append(this.f2739b);
        j.append("\", url=\"");
        j.append(this.f2740c);
        j.append("\"");
        return j.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2739b);
        parcel.writeString(this.f2740c);
    }
}
