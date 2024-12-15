package b.k.a;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator<DrawerLayout.e> {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new DrawerLayout.e(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new DrawerLayout.e[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public DrawerLayout.e createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new DrawerLayout.e(parcel, classLoader);
    }
}
