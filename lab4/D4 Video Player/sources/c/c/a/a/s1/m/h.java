package c.c.a.a.s1.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.z1.l0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class h extends p {
    public static final Parcelable.Creator<h> CREATOR = new g();

    /* renamed from: c, reason: collision with root package name */
    public final String f2750c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2751d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2752e;

    /* renamed from: f, reason: collision with root package name */
    public final String[] f2753f;
    public final p[] g;

    public h(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = l0.f3761a;
        this.f2750c = readString;
        this.f2751d = parcel.readByte() != 0;
        this.f2752e = parcel.readByte() != 0;
        this.f2753f = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.g = new p[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.g[i2] = (p) parcel.readParcelable(p.class.getClassLoader());
        }
    }

    public h(String str, boolean z, boolean z2, String[] strArr, p[] pVarArr) {
        super("CTOC");
        this.f2750c = str;
        this.f2751d = z;
        this.f2752e = z2;
        this.f2753f = strArr;
        this.g = pVarArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f2751d == hVar.f2751d && this.f2752e == hVar.f2752e && l0.a(this.f2750c, hVar.f2750c) && Arrays.equals(this.f2753f, hVar.f2753f) && Arrays.equals(this.g, hVar.g);
    }

    public int hashCode() {
        int i = (((527 + (this.f2751d ? 1 : 0)) * 31) + (this.f2752e ? 1 : 0)) * 31;
        String str = this.f2750c;
        return i + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2750c);
        parcel.writeByte(this.f2751d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2752e ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.f2753f);
        parcel.writeInt(this.g.length);
        for (p pVar : this.g) {
            parcel.writeParcelable(pVar, 0);
        }
    }
}
