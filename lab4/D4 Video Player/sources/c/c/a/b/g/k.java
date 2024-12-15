package c.c.a.b.g;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomnavigation.BottomNavigationView;

/* loaded from: classes.dex */
public final class k implements Parcelable.ClassLoaderCreator<BottomNavigationView.c> {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new BottomNavigationView.c(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new BottomNavigationView.c[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public BottomNavigationView.c createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new BottomNavigationView.c(parcel, classLoader);
    }
}
