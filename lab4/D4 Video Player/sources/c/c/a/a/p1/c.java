package c.c.a.a.p1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class c implements Parcelable.Creator<d> {
    @Override // android.os.Parcelable.Creator
    public d createFromParcel(Parcel parcel) {
        return new d(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public d[] newArray(int i) {
        return new d[i];
    }
}
