package b.r.b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;

/* loaded from: classes.dex */
public final class x implements Parcelable.Creator<LinearLayoutManager.d> {
    @Override // android.os.Parcelable.Creator
    public LinearLayoutManager.d createFromParcel(Parcel parcel) {
        return new LinearLayoutManager.d(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public LinearLayoutManager.d[] newArray(int i) {
        return new LinearLayoutManager.d[i];
    }
}
