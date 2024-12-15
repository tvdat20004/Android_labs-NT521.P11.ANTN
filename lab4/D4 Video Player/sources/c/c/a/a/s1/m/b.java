package c.c.a.a.s1.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.z1.l0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b extends p {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: c, reason: collision with root package name */
    public final String f2741c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2742d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2743e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f2744f;

    public b(Parcel parcel) {
        super("APIC");
        String readString = parcel.readString();
        int i = l0.f3761a;
        this.f2741c = readString;
        this.f2742d = parcel.readString();
        this.f2743e = parcel.readInt();
        this.f2744f = parcel.createByteArray();
    }

    public b(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f2741c = str;
        this.f2742d = str2;
        this.f2743e = i;
        this.f2744f = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f2743e == bVar.f2743e && l0.a(this.f2741c, bVar.f2741c) && l0.a(this.f2742d, bVar.f2742d) && Arrays.equals(this.f2744f, bVar.f2744f);
    }

    public int hashCode() {
        int i = (527 + this.f2743e) * 31;
        String str = this.f2741c;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2742d;
        return Arrays.hashCode(this.f2744f) + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // c.c.a.a.s1.m.p
    public String toString() {
        return this.f2766b + ": mimeType=" + this.f2741c + ", description=" + this.f2742d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2741c);
        parcel.writeString(this.f2742d);
        parcel.writeInt(this.f2743e);
        parcel.writeByteArray(this.f2744f);
    }
}
