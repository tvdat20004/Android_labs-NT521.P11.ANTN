package b.b.i;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.widget.Toolbar;

/* loaded from: classes.dex */
public class m2 implements Parcelable.ClassLoaderCreator<Toolbar.g> {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new Toolbar.g(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new Toolbar.g[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public Toolbar.g createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new Toolbar.g(parcel, classLoader);
    }
}
