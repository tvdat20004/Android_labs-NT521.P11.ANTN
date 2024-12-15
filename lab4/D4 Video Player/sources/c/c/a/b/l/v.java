package c.c.a.b.l;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class v implements Parcelable.Creator<w> {
    @Override // android.os.Parcelable.Creator
    public w createFromParcel(Parcel parcel) {
        return w.j(parcel.readInt(), parcel.readInt());
    }

    @Override // android.os.Parcelable.Creator
    public w[] newArray(int i) {
        return new w[i];
    }
}
