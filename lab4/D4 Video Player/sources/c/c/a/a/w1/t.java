package c.c.a.a.w1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class t implements Parcelable.Creator<u> {
    @Override // android.os.Parcelable.Creator
    public u createFromParcel(Parcel parcel) {
        return new u(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public u[] newArray(int i) {
        return new u[i];
    }
}
