package c.c.a.a.a2;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.z1.l0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements Parcelable {
    public static final Parcelable.Creator<j> CREATOR = new i();

    /* renamed from: b, reason: collision with root package name */
    public final int f1937b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1938c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1939d;

    /* renamed from: e, reason: collision with root package name */
    public final byte[] f1940e;

    /* renamed from: f, reason: collision with root package name */
    public int f1941f;

    public j(int i, int i2, int i3, byte[] bArr) {
        this.f1937b = i;
        this.f1938c = i2;
        this.f1939d = i3;
        this.f1940e = bArr;
    }

    public j(Parcel parcel) {
        this.f1937b = parcel.readInt();
        this.f1938c = parcel.readInt();
        this.f1939d = parcel.readInt();
        int i = l0.f3761a;
        this.f1940e = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f1937b == jVar.f1937b && this.f1938c == jVar.f1938c && this.f1939d == jVar.f1939d && Arrays.equals(this.f1940e, jVar.f1940e);
    }

    public int hashCode() {
        if (this.f1941f == 0) {
            this.f1941f = Arrays.hashCode(this.f1940e) + ((((((527 + this.f1937b) * 31) + this.f1938c) * 31) + this.f1939d) * 31);
        }
        return this.f1941f;
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("ColorInfo(");
        j.append(this.f1937b);
        j.append(", ");
        j.append(this.f1938c);
        j.append(", ");
        j.append(this.f1939d);
        j.append(", ");
        j.append(this.f1940e != null);
        j.append(")");
        return j.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f1937b);
        parcel.writeInt(this.f1938c);
        parcel.writeInt(this.f1939d);
        int i2 = this.f1940e != null ? 1 : 0;
        int i3 = l0.f3761a;
        parcel.writeInt(i2);
        byte[] bArr = this.f1940e;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
