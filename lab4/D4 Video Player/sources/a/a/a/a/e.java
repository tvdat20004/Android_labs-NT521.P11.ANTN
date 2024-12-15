package a.a.a.a;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new c();

    /* renamed from: b, reason: collision with root package name */
    public b f3b;

    public e(Parcel parcel) {
        b aVar;
        IBinder readStrongBinder = parcel.readStrongBinder();
        int i = d.f1b;
        if (readStrongBinder == null) {
            aVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("android.support.v4.os.IResultReceiver");
            aVar = (queryLocalInterface == null || !(queryLocalInterface instanceof b)) ? new a(readStrongBinder) : (b) queryLocalInterface;
        }
        this.f3b = aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void i(int i, Bundle bundle) {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f3b == null) {
                this.f3b = new d(this);
            }
            parcel.writeStrongBinder(this.f3b.asBinder());
        }
    }
}
