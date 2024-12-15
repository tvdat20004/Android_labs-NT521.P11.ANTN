package c.c.a.a.s1.m;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class q implements Parcelable.Creator<r> {
    @Override // android.os.Parcelable.Creator
    public r createFromParcel(Parcel parcel) {
        return new r(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public r[] newArray(int i) {
        return new r[i];
    }
}
