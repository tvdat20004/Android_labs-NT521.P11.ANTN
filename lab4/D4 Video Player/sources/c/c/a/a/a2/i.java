package c.c.a.a.a2;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator<j> {
    @Override // android.os.Parcelable.Creator
    public j createFromParcel(Parcel parcel) {
        return new j(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public j[] newArray(int i) {
        return new j[i];
    }
}
