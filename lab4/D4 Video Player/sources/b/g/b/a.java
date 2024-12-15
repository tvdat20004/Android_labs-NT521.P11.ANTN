package b.g.b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes.dex */
public final class a implements Parcelable.ClassLoaderCreator<CoordinatorLayout.g> {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new CoordinatorLayout.g(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new CoordinatorLayout.g[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public CoordinatorLayout.g createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new CoordinatorLayout.g(parcel, classLoader);
    }
}
