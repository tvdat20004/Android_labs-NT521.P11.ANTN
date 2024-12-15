package c.c.a.b.g;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class g implements Parcelable {
    public static final Parcelable.Creator<g> CREATOR = new f();

    /* renamed from: b, reason: collision with root package name */
    public int f3859b;

    /* renamed from: c, reason: collision with root package name */
    public c.c.a.b.p.i f3860c;

    public g() {
    }

    public g(Parcel parcel) {
        this.f3859b = parcel.readInt();
        this.f3860c = (c.c.a.b.p.i) parcel.readParcelable(g.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3859b);
        parcel.writeParcelable(this.f3860c, 0);
    }
}
