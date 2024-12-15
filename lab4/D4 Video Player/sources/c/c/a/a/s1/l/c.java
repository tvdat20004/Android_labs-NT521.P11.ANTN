package c.c.a.a.s1.l;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.x1.p;
import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public final class c implements c.c.a.a.s1.b {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: b, reason: collision with root package name */
    public final int f2734b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2735c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2736d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2737e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2738f;
    public final int g;

    public c(int i, String str, String str2, String str3, boolean z, int i2) {
        p.c(i2 == -1 || i2 > 0);
        this.f2734b = i;
        this.f2735c = str;
        this.f2736d = str2;
        this.f2737e = str3;
        this.f2738f = z;
        this.g = i2;
    }

    public c(Parcel parcel) {
        this.f2734b = parcel.readInt();
        this.f2735c = parcel.readString();
        this.f2736d = parcel.readString();
        this.f2737e = parcel.readString();
        int i = l0.f3761a;
        this.f2738f = parcel.readInt() != 0;
        this.g = parcel.readInt();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c.c.a.a.s1.l.c i(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.s1.l.c.i(java.util.Map):c.c.a.a.s1.l.c");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.f2734b == cVar.f2734b && l0.a(this.f2735c, cVar.f2735c) && l0.a(this.f2736d, cVar.f2736d) && l0.a(this.f2737e, cVar.f2737e) && this.f2738f == cVar.f2738f && this.g == cVar.g;
    }

    public int hashCode() {
        int i = (527 + this.f2734b) * 31;
        String str = this.f2735c;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2736d;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2737e;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f2738f ? 1 : 0)) * 31) + this.g;
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("IcyHeaders: name=\"");
        j.append(this.f2736d);
        j.append("\", genre=\"");
        j.append(this.f2735c);
        j.append("\", bitrate=");
        j.append(this.f2734b);
        j.append(", metadataInterval=");
        j.append(this.g);
        return j.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2734b);
        parcel.writeString(this.f2735c);
        parcel.writeString(this.f2736d);
        parcel.writeString(this.f2737e);
        boolean z = this.f2738f;
        int i2 = l0.f3761a;
        parcel.writeInt(z ? 1 : 0);
        parcel.writeInt(this.g);
    }
}
