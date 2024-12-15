package c.c.a.b.p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes.dex */
public final class b implements Parcelable.ClassLoaderCreator<CheckableImageButton.a> {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new CheckableImageButton.a(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new CheckableImageButton.a[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public CheckableImageButton.a createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new CheckableImageButton.a(parcel, classLoader);
    }
}
