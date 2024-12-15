package c.c.a.a.s1.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.z1.l0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class v extends p {
    public static final Parcelable.Creator<v> CREATOR = new u();

    /* renamed from: c, reason: collision with root package name */
    public final String f2774c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2775d;

    public v(Parcel parcel) {
        super("PRIV");
        String readString = parcel.readString();
        int i = l0.f3761a;
        this.f2774c = readString;
        this.f2775d = parcel.createByteArray();
    }

    public v(String str, byte[] bArr) {
        super("PRIV");
        this.f2774c = str;
        this.f2775d = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || v.class != obj.getClass()) {
            return false;
        }
        v vVar = (v) obj;
        return l0.a(this.f2774c, vVar.f2774c) && Arrays.equals(this.f2775d, vVar.f2775d);
    }

    public int hashCode() {
        String str = this.f2774c;
        return Arrays.hashCode(this.f2775d) + ((527 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // c.c.a.a.s1.m.p
    public String toString() {
        return this.f2766b + ": owner=" + this.f2774c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2774c);
        parcel.writeByteArray(this.f2775d);
    }
}
