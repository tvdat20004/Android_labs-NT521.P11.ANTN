package c.c.a.a.s1.m;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class s implements Parcelable.Creator<t> {
    @Override // android.os.Parcelable.Creator
    public t createFromParcel(Parcel parcel) {
        return new t(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public t[] newArray(int i) {
        return new t[i];
    }
}
