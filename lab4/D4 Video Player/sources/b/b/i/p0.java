package b.b.i;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* loaded from: classes.dex */
public class p0 extends View.BaseSavedState {
    public static final Parcelable.Creator<p0> CREATOR = new o0();

    /* renamed from: b, reason: collision with root package name */
    public boolean f758b;

    public p0(Parcel parcel) {
        super(parcel);
        this.f758b = parcel.readByte() != 0;
    }

    public p0(Parcelable parcelable) {
        super(parcelable);
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.f758b ? (byte) 1 : (byte) 0);
    }
}
