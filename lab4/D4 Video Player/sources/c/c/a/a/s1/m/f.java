package c.c.a.a.s1.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.z1.l0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class f extends p {
    public static final Parcelable.Creator<f> CREATOR = new e();

    /* renamed from: c, reason: collision with root package name */
    public final String f2746c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2747d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2748e;

    /* renamed from: f, reason: collision with root package name */
    public final long f2749f;
    public final long g;
    public final p[] h;

    public f(Parcel parcel) {
        super("CHAP");
        String readString = parcel.readString();
        int i = l0.f3761a;
        this.f2746c = readString;
        this.f2747d = parcel.readInt();
        this.f2748e = parcel.readInt();
        this.f2749f = parcel.readLong();
        this.g = parcel.readLong();
        int readInt = parcel.readInt();
        this.h = new p[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.h[i2] = (p) parcel.readParcelable(p.class.getClassLoader());
        }
    }

    public f(String str, int i, int i2, long j, long j2, p[] pVarArr) {
        super("CHAP");
        this.f2746c = str;
        this.f2747d = i;
        this.f2748e = i2;
        this.f2749f = j;
        this.g = j2;
        this.h = pVarArr;
    }

    @Override // c.c.a.a.s1.m.p, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass()) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2747d == fVar.f2747d && this.f2748e == fVar.f2748e && this.f2749f == fVar.f2749f && this.g == fVar.g && l0.a(this.f2746c, fVar.f2746c) && Arrays.equals(this.h, fVar.h);
    }

    public int hashCode() {
        int i = (((((((527 + this.f2747d) * 31) + this.f2748e) * 31) + ((int) this.f2749f)) * 31) + ((int) this.g)) * 31;
        String str = this.f2746c;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2746c);
        parcel.writeInt(this.f2747d);
        parcel.writeInt(this.f2748e);
        parcel.writeLong(this.f2749f);
        parcel.writeLong(this.g);
        parcel.writeInt(this.h.length);
        for (p pVar : this.h) {
            parcel.writeParcelable(pVar, 0);
        }
    }
}
