package b.b.i;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.SearchView;

/* loaded from: classes.dex */
public class e2 implements Parcelable.ClassLoaderCreator<SearchView.o> {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new SearchView.o(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new SearchView.o[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public SearchView.o createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new SearchView.o(parcel, classLoader);
    }
}
