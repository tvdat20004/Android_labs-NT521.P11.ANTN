package c.c.a.b.d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.appbar.AppBarLayout;

/* loaded from: classes.dex */
public final class a implements Parcelable.ClassLoaderCreator<AppBarLayout.BaseBehavior.a> {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new AppBarLayout.BaseBehavior.a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new AppBarLayout.BaseBehavior.a[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public AppBarLayout.BaseBehavior.a createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new AppBarLayout.BaseBehavior.a(parcel, classLoader);
    }
}
