package b.l.b;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class f0 implements Parcelable {
    public static final Parcelable.Creator<f0> CREATOR = new e0();

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<j0> f1404b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList<String> f1405c;

    /* renamed from: d, reason: collision with root package name */
    public c[] f1406d;

    /* renamed from: e, reason: collision with root package name */
    public int f1407e;

    /* renamed from: f, reason: collision with root package name */
    public String f1408f;

    public f0() {
        this.f1408f = null;
    }

    public f0(Parcel parcel) {
        this.f1408f = null;
        this.f1404b = parcel.createTypedArrayList(j0.CREATOR);
        this.f1405c = parcel.createStringArrayList();
        this.f1406d = (c[]) parcel.createTypedArray(c.CREATOR);
        this.f1407e = parcel.readInt();
        this.f1408f = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f1404b);
        parcel.writeStringList(this.f1405c);
        parcel.writeTypedArray(this.f1406d, i);
        parcel.writeInt(this.f1407e);
        parcel.writeString(this.f1408f);
    }
}
