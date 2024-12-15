package b.r.b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes.dex */
public final class r0 implements Parcelable.Creator<StaggeredGridLayoutManager.d.a> {
    @Override // android.os.Parcelable.Creator
    public StaggeredGridLayoutManager.d.a createFromParcel(Parcel parcel) {
        return new StaggeredGridLayoutManager.d.a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public StaggeredGridLayoutManager.d.a[] newArray(int i) {
        return new StaggeredGridLayoutManager.d.a[i];
    }
}
