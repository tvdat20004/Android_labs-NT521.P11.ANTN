package b.q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public final class h implements Parcelable.Creator<Preference.b> {
    @Override // android.os.Parcelable.Creator
    public Preference.b createFromParcel(Parcel parcel) {
        return new Preference.b(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public Preference.b[] newArray(int i) {
        return new Preference.b[i];
    }
}
