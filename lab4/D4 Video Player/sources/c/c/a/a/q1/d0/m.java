package c.c.a.a.q1.d0;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.z1.l0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class m implements c.c.a.a.s1.b {
    public static final Parcelable.Creator<m> CREATOR = new l();

    /* renamed from: b, reason: collision with root package name */
    public final String f2332b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2333c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2334d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2335e;

    public m(Parcel parcel, l lVar) {
        String readString = parcel.readString();
        int i = l0.f3761a;
        this.f2332b = readString;
        byte[] bArr = new byte[parcel.readInt()];
        this.f2333c = bArr;
        parcel.readByteArray(bArr);
        this.f2334d = parcel.readInt();
        this.f2335e = parcel.readInt();
    }

    public m(String str, byte[] bArr, int i, int i2) {
        this.f2332b = str;
        this.f2333c = bArr;
        this.f2334d = i;
        this.f2335e = i2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return this.f2332b.equals(mVar.f2332b) && Arrays.equals(this.f2333c, mVar.f2333c) && this.f2334d == mVar.f2334d && this.f2335e == mVar.f2335e;
    }

    public int hashCode() {
        return ((((Arrays.hashCode(this.f2333c) + ((this.f2332b.hashCode() + 527) * 31)) * 31) + this.f2334d) * 31) + this.f2335e;
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("mdta: key=");
        j.append(this.f2332b);
        return j.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2332b);
        parcel.writeInt(this.f2333c.length);
        parcel.writeByteArray(this.f2333c);
        parcel.writeInt(this.f2334d);
        parcel.writeInt(this.f2335e);
    }
}
