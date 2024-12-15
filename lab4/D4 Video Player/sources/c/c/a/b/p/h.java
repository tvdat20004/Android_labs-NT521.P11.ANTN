package c.c.a.b.p;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class h implements Parcelable.ClassLoaderCreator<i> {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new i(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new i[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new i(parcel, classLoader);
    }
}
