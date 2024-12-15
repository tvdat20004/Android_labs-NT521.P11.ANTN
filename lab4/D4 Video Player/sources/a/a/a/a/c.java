package a.a.a.a;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class c implements Parcelable.Creator<e> {
    @Override // android.os.Parcelable.Creator
    public e createFromParcel(Parcel parcel) {
        return new e(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public e[] newArray(int i) {
        return new e[i];
    }
}
