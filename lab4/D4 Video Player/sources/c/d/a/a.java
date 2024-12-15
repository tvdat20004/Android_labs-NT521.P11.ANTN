package c.d.a;

import android.os.Parcel;
import android.os.Parcelable;
import com.pnikosis.materialishprogress.ProgressWheel;

/* loaded from: classes.dex */
public final class a implements Parcelable.Creator<ProgressWheel.c> {
    @Override // android.os.Parcelable.Creator
    public ProgressWheel.c createFromParcel(Parcel parcel) {
        return new ProgressWheel.c(parcel, null);
    }

    @Override // android.os.Parcelable.Creator
    public ProgressWheel.c[] newArray(int i) {
        return new ProgressWheel.c[i];
    }
}
