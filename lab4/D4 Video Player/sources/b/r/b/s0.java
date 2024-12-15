package b.r.b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes.dex */
public final class s0 implements Parcelable.Creator<StaggeredGridLayoutManager.e> {
    @Override // android.os.Parcelable.Creator
    public StaggeredGridLayoutManager.e createFromParcel(Parcel parcel) {
        return new StaggeredGridLayoutManager.e(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public StaggeredGridLayoutManager.e[] newArray(int i) {
        return new StaggeredGridLayoutManager.e[i];
    }
}
