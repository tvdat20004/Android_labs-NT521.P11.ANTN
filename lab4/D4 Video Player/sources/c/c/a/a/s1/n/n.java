package c.c.a.a.s1.n;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class n implements Parcelable.Creator<o> {
    @Override // android.os.Parcelable.Creator
    public o createFromParcel(Parcel parcel) {
        return new o(parcel.readLong(), parcel.readLong(), null);
    }

    @Override // android.os.Parcelable.Creator
    public o[] newArray(int i) {
        return new o[i];
    }
}
