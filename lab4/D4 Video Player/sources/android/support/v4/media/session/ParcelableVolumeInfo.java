package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public int f19b;

    /* renamed from: c, reason: collision with root package name */
    public int f20c;

    /* renamed from: d, reason: collision with root package name */
    public int f21d;

    /* renamed from: e, reason: collision with root package name */
    public int f22e;

    /* renamed from: f, reason: collision with root package name */
    public int f23f;

    public static class a implements Parcelable.Creator<ParcelableVolumeInfo> {
        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f19b = parcel.readInt();
        this.f21d = parcel.readInt();
        this.f22e = parcel.readInt();
        this.f23f = parcel.readInt();
        this.f20c = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f19b);
        parcel.writeInt(this.f21d);
        parcel.writeInt(this.f22e);
        parcel.writeInt(this.f23f);
        parcel.writeInt(this.f20c);
    }
}
