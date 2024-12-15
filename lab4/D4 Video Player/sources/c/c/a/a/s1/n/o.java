package c.c.a.a.s1.n;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.z1.z;

/* loaded from: classes.dex */
public final class o extends c {
    public static final Parcelable.Creator<o> CREATOR = new n();

    /* renamed from: b, reason: collision with root package name */
    public final long f2803b;

    /* renamed from: c, reason: collision with root package name */
    public final long f2804c;

    public o(long j, long j2) {
        this.f2803b = j;
        this.f2804c = j2;
    }

    public o(long j, long j2, n nVar) {
        this.f2803b = j;
        this.f2804c = j2;
    }

    public static long i(z zVar, long j) {
        long p = zVar.p();
        if ((128 & p) != 0) {
            return 8589934591L & ((((p & 1) << 32) | zVar.q()) + j);
        }
        return -9223372036854775807L;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2803b);
        parcel.writeLong(this.f2804c);
    }
}
