package b.q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.SeekBarPreference;

/* loaded from: classes.dex */
public final class w implements Parcelable.Creator<SeekBarPreference.c> {
    @Override // android.os.Parcelable.Creator
    public SeekBarPreference.c createFromParcel(Parcel parcel) {
        return new SeekBarPreference.c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public SeekBarPreference.c[] newArray(int i) {
        return new SeekBarPreference.c[i];
    }
}
