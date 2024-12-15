package c.c.a.b.l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public class h implements c {
    public static final Parcelable.Creator<h> CREATOR = new g();

    /* renamed from: b, reason: collision with root package name */
    public final long f3905b;

    public h(long j) {
        this.f3905b = j;
    }

    public h(long j, g gVar) {
        this.f3905b = j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.f3905b == ((h) obj).f3905b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3905b)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f3905b);
    }
}
