package c.c.a.a.s1.m;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class d extends p {
    public static final Parcelable.Creator<d> CREATOR = new c();

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2745c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(android.os.Parcel r3) {
        /*
            r2 = this;
            java.lang.String r0 = r3.readString()
            int r1 = c.c.a.a.z1.l0.f3761a
            r2.<init>(r0)
            byte[] r3 = r3.createByteArray()
            r2.f2745c = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.s1.m.d.<init>(android.os.Parcel):void");
    }

    public d(String str, byte[] bArr) {
        super(str);
        this.f2745c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || d.class != obj.getClass()) {
            return false;
        }
        d dVar = (d) obj;
        return this.f2766b.equals(dVar.f2766b) && Arrays.equals(this.f2745c, dVar.f2745c);
    }

    public int hashCode() {
        return Arrays.hashCode(this.f2745c) + ((this.f2766b.hashCode() + 527) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2766b);
        parcel.writeByteArray(this.f2745c);
    }
}
