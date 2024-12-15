package c.c.a.a.s1.n;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class b extends c {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final long f2780b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2781c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f2782d;

    public b(long j, byte[] bArr, long j2) {
        this.f2780b = j2;
        this.f2781c = j;
        this.f2782d = bArr;
    }

    public b(Parcel parcel, a aVar) {
        this.f2780b = parcel.readLong();
        this.f2781c = parcel.readLong();
        byte[] bArr = new byte[parcel.readInt()];
        this.f2782d = bArr;
        parcel.readByteArray(bArr);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2780b);
        parcel.writeLong(this.f2781c);
        parcel.writeInt(this.f2782d.length);
        parcel.writeByteArray(this.f2782d);
    }
}
