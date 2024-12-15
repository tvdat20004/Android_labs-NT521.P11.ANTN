package c.c.a.b.g;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class f implements Parcelable.Creator<g> {
    @Override // android.os.Parcelable.Creator
    public g createFromParcel(Parcel parcel) {
        return new g(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public g[] newArray(int i) {
        return new g[i];
    }
}
