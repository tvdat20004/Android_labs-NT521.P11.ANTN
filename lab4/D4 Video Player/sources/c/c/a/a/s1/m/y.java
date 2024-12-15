package c.c.a.a.s1.m;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class y implements Parcelable.Creator<z> {
    @Override // android.os.Parcelable.Creator
    public z createFromParcel(Parcel parcel) {
        return new z(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public z[] newArray(int i) {
        return new z[i];
    }
}
