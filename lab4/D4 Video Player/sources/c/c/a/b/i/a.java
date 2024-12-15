package c.c.a.b.i;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes.dex */
public final class a implements Parcelable.ClassLoaderCreator<MaterialButton.c> {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new MaterialButton.c(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new MaterialButton.c[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public MaterialButton.c createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new MaterialButton.c(parcel, classLoader);
    }
}
