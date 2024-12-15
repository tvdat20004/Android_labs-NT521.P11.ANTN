package c.c.a.a.w1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator<k> {
    @Override // android.os.Parcelable.Creator
    public k createFromParcel(Parcel parcel) {
        return new k(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public k[] newArray(int i) {
        return new k[i];
    }
}
