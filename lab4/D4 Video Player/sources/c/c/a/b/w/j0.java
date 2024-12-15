package c.c.a.b.w;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class j0 implements Parcelable.ClassLoaderCreator<TextInputLayout.h> {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new TextInputLayout.h(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new TextInputLayout.h[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public TextInputLayout.h createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new TextInputLayout.h(parcel, classLoader);
    }
}
