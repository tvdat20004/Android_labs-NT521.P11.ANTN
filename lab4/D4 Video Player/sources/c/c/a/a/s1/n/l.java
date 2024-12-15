package c.c.a.a.s1.n;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final long f2796a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2797b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2798c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f2799d;

    /* renamed from: e, reason: collision with root package name */
    public final long f2800e;

    /* renamed from: f, reason: collision with root package name */
    public final List<k> f2801f;
    public final boolean g;
    public final long h;
    public final int i;
    public final int j;
    public final int k;

    public l(long j, boolean z, boolean z2, boolean z3, List<k> list, long j2, boolean z4, long j3, int i, int i2, int i3) {
        this.f2796a = j;
        this.f2797b = z;
        this.f2798c = z2;
        this.f2799d = z3;
        this.f2801f = Collections.unmodifiableList(list);
        this.f2800e = j2;
        this.g = z4;
        this.h = j3;
        this.i = i;
        this.j = i2;
        this.k = i3;
    }

    public l(Parcel parcel) {
        this.f2796a = parcel.readLong();
        this.f2797b = parcel.readByte() == 1;
        this.f2798c = parcel.readByte() == 1;
        this.f2799d = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new k(parcel.readInt(), parcel.readLong()));
        }
        this.f2801f = Collections.unmodifiableList(arrayList);
        this.f2800e = parcel.readLong();
        this.g = parcel.readByte() == 1;
        this.h = parcel.readLong();
        this.i = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
    }
}
