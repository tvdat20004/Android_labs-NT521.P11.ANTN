package b.r.b;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class l0 implements Parcelable.ClassLoaderCreator<RecyclerView.v> {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new RecyclerView.v(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new RecyclerView.v[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public RecyclerView.v createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new RecyclerView.v(parcel, classLoader);
    }
}
