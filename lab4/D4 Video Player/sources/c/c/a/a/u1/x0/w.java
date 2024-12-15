package c.c.a.a.u1.x0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* loaded from: classes.dex */
public final class w implements Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new v();

    /* renamed from: b, reason: collision with root package name */
    public final long f3185b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3186c;

    /* renamed from: d, reason: collision with root package name */
    public final String f3187d;

    /* renamed from: e, reason: collision with root package name */
    public final String f3188e;

    /* renamed from: f, reason: collision with root package name */
    public final String f3189f;

    public w(long j, String str, String str2, String str3, String str4) {
        this.f3185b = j;
        this.f3186c = str;
        this.f3187d = str2;
        this.f3188e = str3;
        this.f3189f = str4;
    }

    public w(Parcel parcel) {
        this.f3185b = parcel.readLong();
        this.f3186c = parcel.readString();
        this.f3187d = parcel.readString();
        this.f3188e = parcel.readString();
        this.f3189f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        w wVar = (w) obj;
        return this.f3185b == wVar.f3185b && TextUtils.equals(this.f3186c, wVar.f3186c) && TextUtils.equals(this.f3187d, wVar.f3187d) && TextUtils.equals(this.f3188e, wVar.f3188e) && TextUtils.equals(this.f3189f, wVar.f3189f);
    }

    public int hashCode() {
        long j = this.f3185b;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.f3186c;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f3187d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3188e;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f3189f;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f3185b);
        parcel.writeString(this.f3186c);
        parcel.writeString(this.f3187d);
        parcel.writeString(this.f3188e);
        parcel.writeString(this.f3189f);
    }
}
