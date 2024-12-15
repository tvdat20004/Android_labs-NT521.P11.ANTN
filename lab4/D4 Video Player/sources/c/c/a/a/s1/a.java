package c.c.a.a.s1;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<c> {
    @Override // android.os.Parcelable.Creator
    public c createFromParcel(Parcel parcel) {
        return new c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public c[] newArray(int i) {
        return new c[i];
    }
}
