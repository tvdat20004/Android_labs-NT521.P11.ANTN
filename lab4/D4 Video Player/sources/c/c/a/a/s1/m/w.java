package c.c.a.a.s1.m;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class w implements Parcelable.Creator<x> {
    @Override // android.os.Parcelable.Creator
    public x createFromParcel(Parcel parcel) {
        return new x(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public x[] newArray(int i) {
        return new x[i];
    }
}
