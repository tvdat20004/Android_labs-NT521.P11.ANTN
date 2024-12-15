package c.c.a.b.l;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<b> {
    @Override // android.os.Parcelable.Creator
    public b createFromParcel(Parcel parcel) {
        return new b((w) parcel.readParcelable(w.class.getClassLoader()), (w) parcel.readParcelable(w.class.getClassLoader()), (w) parcel.readParcelable(w.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), null);
    }

    @Override // android.os.Parcelable.Creator
    public b[] newArray(int i) {
        return new b[i];
    }
}
