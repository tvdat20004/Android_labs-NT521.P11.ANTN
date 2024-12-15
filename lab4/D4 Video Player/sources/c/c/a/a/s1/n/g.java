package c.c.a.a.s1.n;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g extends c {
    public static final Parcelable.Creator<g> CREATOR = new e();

    /* renamed from: b, reason: collision with root package name */
    public final long f2789b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2790c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2791d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f2792e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f2793f;
    public final long g;
    public final long h;
    public final List<f> i;
    public final boolean j;
    public final long k;
    public final int l;
    public final int m;
    public final int n;

    public g(long j, boolean z, boolean z2, boolean z3, boolean z4, long j2, long j3, List<f> list, boolean z5, long j4, int i, int i2, int i3) {
        this.f2789b = j;
        this.f2790c = z;
        this.f2791d = z2;
        this.f2792e = z3;
        this.f2793f = z4;
        this.g = j2;
        this.h = j3;
        this.i = Collections.unmodifiableList(list);
        this.j = z5;
        this.k = j4;
        this.l = i;
        this.m = i2;
        this.n = i3;
    }

    public g(Parcel parcel, e eVar) {
        this.f2789b = parcel.readLong();
        this.f2790c = parcel.readByte() == 1;
        this.f2791d = parcel.readByte() == 1;
        this.f2792e = parcel.readByte() == 1;
        this.f2793f = parcel.readByte() == 1;
        this.g = parcel.readLong();
        this.h = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new f(parcel.readInt(), parcel.readLong(), parcel.readLong()));
        }
        this.i = Collections.unmodifiableList(arrayList);
        this.j = parcel.readByte() == 1;
        this.k = parcel.readLong();
        this.l = parcel.readInt();
        this.m = parcel.readInt();
        this.n = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f2789b);
        parcel.writeByte(this.f2790c ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2791d ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2792e ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f2793f ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.g);
        parcel.writeLong(this.h);
        int size = this.i.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            f fVar = this.i.get(i2);
            parcel.writeInt(fVar.f2786a);
            parcel.writeLong(fVar.f2787b);
            parcel.writeLong(fVar.f2788c);
        }
        parcel.writeByte(this.j ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m);
        parcel.writeInt(this.n);
    }
}
