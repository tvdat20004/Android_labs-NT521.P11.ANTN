package c.c.a.a.s1.n;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class j implements Parcelable.Creator<m> {
    @Override // android.os.Parcelable.Creator
    public m createFromParcel(Parcel parcel) {
        return new m(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public m[] newArray(int i) {
        return new m[i];
    }
}
