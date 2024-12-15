package b.h.k;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.widget.NestedScrollView;

/* loaded from: classes.dex */
public class e implements Parcelable.Creator<NestedScrollView.c> {
    @Override // android.os.Parcelable.Creator
    public NestedScrollView.c createFromParcel(Parcel parcel) {
        return new NestedScrollView.c(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public NestedScrollView.c[] newArray(int i) {
        return new NestedScrollView.c[i];
    }
}
