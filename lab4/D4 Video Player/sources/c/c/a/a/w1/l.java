package c.c.a.a.w1;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.w1.m;

/* loaded from: classes.dex */
public final class l implements Parcelable.Creator<m.a> {
    @Override // android.os.Parcelable.Creator
    public m.a createFromParcel(Parcel parcel) {
        return new m.a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public m.a[] newArray(int i) {
        return new m.a[i];
    }
}
