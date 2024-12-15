package c.c.a.b.h;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class c implements Parcelable.ClassLoaderCreator<BottomSheetBehavior.e> {
    @Override // android.os.Parcelable.Creator
    public Object createFromParcel(Parcel parcel) {
        return new BottomSheetBehavior.e(parcel, (ClassLoader) null);
    }

    @Override // android.os.Parcelable.Creator
    public Object[] newArray(int i) {
        return new BottomSheetBehavior.e[i];
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public BottomSheetBehavior.e createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return new BottomSheetBehavior.e(parcel, classLoader);
    }
}
