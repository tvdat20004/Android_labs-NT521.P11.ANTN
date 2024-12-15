package c.c.a.b.l;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class g implements Parcelable.Creator<h> {
    @Override // android.os.Parcelable.Creator
    public h createFromParcel(Parcel parcel) {
        return new h(parcel.readLong(), null);
    }

    @Override // android.os.Parcelable.Creator
    public h[] newArray(int i) {
        return new h[i];
    }
}
