package b.l.b;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class i0 implements Parcelable.Creator<j0> {
    @Override // android.os.Parcelable.Creator
    public j0 createFromParcel(Parcel parcel) {
        return new j0(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public j0[] newArray(int i) {
        return new j0[i];
    }
}
