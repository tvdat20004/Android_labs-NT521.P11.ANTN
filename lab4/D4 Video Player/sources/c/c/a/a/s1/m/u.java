package c.c.a.a.s1.m;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class u implements Parcelable.Creator<v> {
    @Override // android.os.Parcelable.Creator
    public v createFromParcel(Parcel parcel) {
        return new v(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public v[] newArray(int i) {
        return new v[i];
    }
}
