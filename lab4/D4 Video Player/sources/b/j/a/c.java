package b.j.a;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public abstract class c implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    public final Parcelable f1349b;

    /* renamed from: c, reason: collision with root package name */
    public static final c f1348c = new a();
    public static final Parcelable.Creator<c> CREATOR = new b();

    public c(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f1349b = readParcelable == null ? f1348c : readParcelable;
    }

    public c(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.f1349b = parcelable == f1348c ? null : parcelable;
    }

    public c(a aVar) {
        this.f1349b = null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f1349b, i);
    }
}
