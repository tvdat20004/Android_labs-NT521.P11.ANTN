package c.c.a.a.w1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public class u implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final String f3444b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3445c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3446d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3447e;

    /* renamed from: f, reason: collision with root package name */
    public static final u f3443f = new u();
    public static final Parcelable.Creator<u> CREATOR = new t();

    public u() {
        this.f3444b = l0.x(null);
        this.f3445c = l0.x(null);
        this.f3446d = false;
        this.f3447e = 0;
    }

    public u(String str, String str2, boolean z, int i) {
        this.f3444b = l0.x(str);
        this.f3445c = l0.x(str2);
        this.f3446d = z;
        this.f3447e = i;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        return TextUtils.equals(this.f3444b, uVar.f3444b) && TextUtils.equals(this.f3445c, uVar.f3445c) && this.f3446d == uVar.f3446d && this.f3447e == uVar.f3447e;
    }

    public int hashCode() {
        String str = this.f3444b;
        int hashCode = ((str == null ? 0 : str.hashCode()) + 31) * 31;
        String str2 = this.f3445c;
        return ((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + (this.f3446d ? 1 : 0)) * 31) + this.f3447e;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3444b);
        parcel.writeString(this.f3445c);
        boolean z = this.f3446d;
        int i2 = l0.f3761a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.f3447e);
    }

    public u(Parcel parcel) {
        this.f3444b = parcel.readString();
        this.f3445c = parcel.readString();
        int i = l0.f3761a;
        this.f3446d = parcel.readInt() != 0;
        this.f3447e = parcel.readInt();
    }
}
