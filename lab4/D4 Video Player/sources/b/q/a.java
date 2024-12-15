package b.q;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.EditTextPreference;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<EditTextPreference.a> {
    @Override // android.os.Parcelable.Creator
    public EditTextPreference.a createFromParcel(Parcel parcel) {
        return new EditTextPreference.a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public EditTextPreference.a[] newArray(int i) {
        return new EditTextPreference.a[i];
    }
}
