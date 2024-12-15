package c.c.a.a;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class l0 implements Parcelable {
    public static final Parcelable.Creator<l0> CREATOR = new k0();
    public final int A;
    public final String B;
    public final int C;
    public int D;

    /* renamed from: b, reason: collision with root package name */
    public final String f2037b;

    /* renamed from: c, reason: collision with root package name */
    public final String f2038c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2039d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2040e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2041f;
    public final String g;
    public final c.c.a.a.s1.c h;
    public final String i;
    public final String j;
    public final int k;
    public final List<byte[]> l;
    public final c.c.a.a.p1.e m;
    public final long n;
    public final int o;
    public final int p;
    public final float q;
    public final int r;
    public final float s;
    public final int t;
    public final byte[] u;
    public final c.c.a.a.a2.j v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public l0(Parcel parcel) {
        this.f2037b = parcel.readString();
        this.f2038c = parcel.readString();
        this.f2039d = parcel.readInt();
        this.f2040e = parcel.readInt();
        this.f2041f = parcel.readInt();
        this.g = parcel.readString();
        this.h = (c.c.a.a.s1.c) parcel.readParcelable(c.c.a.a.s1.c.class.getClassLoader());
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readInt();
        int readInt = parcel.readInt();
        this.l = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            this.l.add(parcel.createByteArray());
        }
        this.m = (c.c.a.a.p1.e) parcel.readParcelable(c.c.a.a.p1.e.class.getClassLoader());
        this.n = parcel.readLong();
        this.o = parcel.readInt();
        this.p = parcel.readInt();
        this.q = parcel.readFloat();
        this.r = parcel.readInt();
        this.s = parcel.readFloat();
        int i2 = c.c.a.a.z1.l0.f3761a;
        this.u = parcel.readInt() != 0 ? parcel.createByteArray() : null;
        this.t = parcel.readInt();
        this.v = (c.c.a.a.a2.j) parcel.readParcelable(c.c.a.a.a2.j.class.getClassLoader());
        this.w = parcel.readInt();
        this.x = parcel.readInt();
        this.y = parcel.readInt();
        this.z = parcel.readInt();
        this.A = parcel.readInt();
        this.B = parcel.readString();
        this.C = parcel.readInt();
    }

    public l0(String str, String str2, int i, int i2, int i3, String str3, c.c.a.a.s1.c cVar, String str4, String str5, int i4, List<byte[]> list, c.c.a.a.p1.e eVar, long j, int i5, int i6, float f2, int i7, float f3, byte[] bArr, int i8, c.c.a.a.a2.j jVar, int i9, int i10, int i11, int i12, int i13, String str6, int i14) {
        this.f2037b = str;
        this.f2038c = str2;
        this.f2039d = i;
        this.f2040e = i2;
        this.f2041f = i3;
        this.g = str3;
        this.h = cVar;
        this.i = str4;
        this.j = str5;
        this.k = i4;
        this.l = list == null ? Collections.emptyList() : list;
        this.m = eVar;
        this.n = j;
        this.o = i5;
        this.p = i6;
        this.q = f2;
        int i15 = i7;
        this.r = i15 == -1 ? 0 : i15;
        this.s = f3 == -1.0f ? 1.0f : f3;
        this.u = bArr;
        this.t = i8;
        this.v = jVar;
        this.w = i9;
        this.x = i10;
        this.y = i11;
        int i16 = i12;
        this.z = i16 == -1 ? 0 : i16;
        int i17 = i13;
        this.A = i17 == -1 ? 0 : i17;
        this.B = c.c.a.a.z1.l0.x(str6);
        this.C = i14;
    }

    public static l0 A(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, float f2, List<byte[]> list, int i4, int i5) {
        return new l0(str, str2, i4, i5, i, str5, null, str3, str4, -1, list, null, Long.MAX_VALUE, i2, i3, f2, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1);
    }

    public static l0 B(String str, String str2, String str3, int i, int i2, int i3, int i4, float f2, List<byte[]> list, int i5, float f3, c.c.a.a.p1.e eVar) {
        return C(str, str2, str3, i, i2, i3, i4, f2, list, i5, f3, null, -1, null, null);
    }

    public static l0 C(String str, String str2, String str3, int i, int i2, int i3, int i4, float f2, List<byte[]> list, int i5, float f3, byte[] bArr, int i6, c.c.a.a.a2.j jVar, c.c.a.a.p1.e eVar) {
        return new l0(str, null, 0, 0, i, str3, null, null, str2, i2, list, eVar, Long.MAX_VALUE, i3, i4, f2, i5, f3, bArr, i6, jVar, -1, -1, -1, -1, -1, null, -1);
    }

    public static l0 o(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, List<byte[]> list, int i4, int i5, String str6) {
        return new l0(str, str2, i4, i5, i, str5, null, str3, str4, -1, list, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i2, i3, -1, -1, -1, str6, -1);
    }

    public static l0 p(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, List<byte[]> list, c.c.a.a.p1.e eVar, int i8, String str4, c.c.a.a.s1.c cVar) {
        return new l0(str, null, i8, 0, i, str3, cVar, null, str2, i2, list, eVar, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, i3, i4, i5, i6, i7, str4, -1);
    }

    public static l0 q(String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, List<byte[]> list, c.c.a.a.p1.e eVar, int i6, String str4) {
        return p(str, str2, str3, i, i2, i3, i4, i5, -1, -1, list, eVar, i6, str4, null);
    }

    public static l0 r(String str, String str2, String str3, int i, int i2, int i3, int i4, List<byte[]> list, c.c.a.a.p1.e eVar, int i5, String str4) {
        return q(str, str2, null, i, i2, i3, i4, -1, list, eVar, i5, str4);
    }

    public static l0 s(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6) {
        return new l0(str, str2, i2, i3, i, str5, null, str3, str4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str6, -1);
    }

    public static l0 t(String str, String str2, String str3, int i, int i2, List<byte[]> list, String str4, c.c.a.a.p1.e eVar) {
        return new l0(str, null, i2, 0, i, null, null, null, str2, -1, list, eVar, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str4, -1);
    }

    public static l0 u(String str, String str2, long j) {
        return new l0(str, null, 0, 0, -1, null, null, null, str2, -1, null, null, j, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1);
    }

    public static l0 v(String str, String str2, String str3, int i, c.c.a.a.p1.e eVar) {
        return new l0(str, null, 0, 0, i, null, null, null, str2, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, null, -1);
    }

    public static l0 w(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6) {
        return x(str, str2, str3, str4, null, i, i2, i3, str6, -1);
    }

    public static l0 x(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, String str6, int i4) {
        return new l0(str, str2, i2, i3, i, str5, null, str3, str4, -1, null, null, Long.MAX_VALUE, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str6, i4);
    }

    public static l0 y(String str, String str2, int i, String str3, c.c.a.a.p1.e eVar) {
        return z(str, str2, null, -1, i, str3, -1, eVar, Long.MAX_VALUE, Collections.emptyList());
    }

    public static l0 z(String str, String str2, String str3, int i, int i2, String str4, int i3, c.c.a.a.p1.e eVar, long j, List<byte[]> list) {
        return new l0(str, null, i2, 0, i, str3, null, null, str2, -1, list, eVar, j, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, str4, i3);
    }

    public int D() {
        int i;
        int i2 = this.o;
        if (i2 == -1 || (i = this.p) == -1) {
            return -1;
        }
        return i2 * i;
    }

    public boolean E(l0 l0Var) {
        if (this.l.size() != l0Var.l.size()) {
            return false;
        }
        for (int i = 0; i < this.l.size(); i++) {
            if (!Arrays.equals(this.l.get(i), l0Var.l.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj == null || l0.class != obj.getClass()) {
            return false;
        }
        l0 l0Var = (l0) obj;
        int i2 = this.D;
        if (i2 == 0 || (i = l0Var.D) == 0 || i2 == i) {
            return this.f2039d == l0Var.f2039d && this.f2040e == l0Var.f2040e && this.f2041f == l0Var.f2041f && this.k == l0Var.k && this.n == l0Var.n && this.o == l0Var.o && this.p == l0Var.p && this.r == l0Var.r && this.t == l0Var.t && this.w == l0Var.w && this.x == l0Var.x && this.y == l0Var.y && this.z == l0Var.z && this.A == l0Var.A && this.C == l0Var.C && Float.compare(this.q, l0Var.q) == 0 && Float.compare(this.s, l0Var.s) == 0 && c.c.a.a.z1.l0.a(this.f2037b, l0Var.f2037b) && c.c.a.a.z1.l0.a(this.f2038c, l0Var.f2038c) && c.c.a.a.z1.l0.a(this.g, l0Var.g) && c.c.a.a.z1.l0.a(this.i, l0Var.i) && c.c.a.a.z1.l0.a(this.j, l0Var.j) && c.c.a.a.z1.l0.a(this.B, l0Var.B) && Arrays.equals(this.u, l0Var.u) && c.c.a.a.z1.l0.a(this.h, l0Var.h) && c.c.a.a.z1.l0.a(this.v, l0Var.v) && c.c.a.a.z1.l0.a(this.m, l0Var.m) && E(l0Var);
        }
        return false;
    }

    public int hashCode() {
        if (this.D == 0) {
            String str = this.f2037b;
            int hashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f2038c;
            int hashCode2 = (((((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f2039d) * 31) + this.f2040e) * 31) + this.f2041f) * 31;
            String str3 = this.g;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            c.c.a.a.s1.c cVar = this.h;
            int hashCode4 = (hashCode3 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            String str4 = this.i;
            int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.j;
            int floatToIntBits = (((((((((((((Float.floatToIntBits(this.s) + ((((Float.floatToIntBits(this.q) + ((((((((((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31) + this.k) * 31) + ((int) this.n)) * 31) + this.o) * 31) + this.p) * 31)) * 31) + this.r) * 31)) * 31) + this.t) * 31) + this.w) * 31) + this.x) * 31) + this.y) * 31) + this.z) * 31) + this.A) * 31;
            String str6 = this.B;
            this.D = ((floatToIntBits + (str6 != null ? str6.hashCode() : 0)) * 31) + this.C;
        }
        return this.D;
    }

    public l0 i(c.c.a.a.p1.e eVar) {
        return new l0(this.f2037b, this.f2038c, this.f2039d, this.f2040e, this.f2041f, this.g, this.h, this.i, this.j, this.k, this.l, eVar, this.n, this.o, this.p, this.q, this.r, this.s, this.u, this.t, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C);
    }

    public l0 j(float f2) {
        return new l0(this.f2037b, this.f2038c, this.f2039d, this.f2040e, this.f2041f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, f2, this.r, this.s, this.u, this.t, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C);
    }

    public l0 k(int i, int i2) {
        return new l0(this.f2037b, this.f2038c, this.f2039d, this.f2040e, this.f2041f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.u, this.t, this.v, this.w, this.x, this.y, i, i2, this.B, this.C);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c.c.a.a.l0 l(c.c.a.a.l0 r35) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.l0.l(c.c.a.a.l0):c.c.a.a.l0");
    }

    public l0 m(c.c.a.a.s1.c cVar) {
        return new l0(this.f2037b, this.f2038c, this.f2039d, this.f2040e, this.f2041f, this.g, cVar, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.u, this.t, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C);
    }

    public l0 n(long j) {
        return new l0(this.f2037b, this.f2038c, this.f2039d, this.f2040e, this.f2041f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, j, this.o, this.p, this.q, this.r, this.s, this.u, this.t, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C);
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("Format(");
        j.append(this.f2037b);
        j.append(", ");
        j.append(this.f2038c);
        j.append(", ");
        j.append(this.i);
        j.append(", ");
        j.append(this.j);
        j.append(", ");
        j.append(this.g);
        j.append(", ");
        j.append(this.f2041f);
        j.append(", ");
        j.append(this.B);
        j.append(", [");
        j.append(this.o);
        j.append(", ");
        j.append(this.p);
        j.append(", ");
        j.append(this.q);
        j.append("], [");
        j.append(this.w);
        j.append(", ");
        j.append(this.x);
        j.append("])");
        return j.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2037b);
        parcel.writeString(this.f2038c);
        parcel.writeInt(this.f2039d);
        parcel.writeInt(this.f2040e);
        parcel.writeInt(this.f2041f);
        parcel.writeString(this.g);
        parcel.writeParcelable(this.h, 0);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k);
        int size = this.l.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeByteArray(this.l.get(i2));
        }
        parcel.writeParcelable(this.m, 0);
        parcel.writeLong(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        parcel.writeFloat(this.q);
        parcel.writeInt(this.r);
        parcel.writeFloat(this.s);
        int i3 = this.u != null ? 1 : 0;
        int i4 = c.c.a.a.z1.l0.f3761a;
        parcel.writeInt(i3);
        byte[] bArr = this.u;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
        parcel.writeInt(this.t);
        parcel.writeParcelable(this.v, i);
        parcel.writeInt(this.w);
        parcel.writeInt(this.x);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
        parcel.writeInt(this.A);
        parcel.writeString(this.B);
        parcel.writeInt(this.C);
    }
}
