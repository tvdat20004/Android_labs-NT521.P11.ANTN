package b.b.i;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class k implements Parcelable.Creator<l> {
    @Override // android.os.Parcelable.Creator
    public l createFromParcel(Parcel parcel) {
        return new l(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public l[] newArray(int i) {
        return new l[i];
    }
}
