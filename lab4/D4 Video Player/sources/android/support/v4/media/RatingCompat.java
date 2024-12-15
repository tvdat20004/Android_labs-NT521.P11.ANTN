package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class RatingCompat implements Parcelable {
    public static final Parcelable.Creator<RatingCompat> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f13b;

    /* renamed from: c, reason: collision with root package name */
    public final float f14c;

    public static class a implements Parcelable.Creator<RatingCompat> {
        @Override // android.os.Parcelable.Creator
        public RatingCompat createFromParcel(Parcel parcel) {
            return new RatingCompat(parcel.readInt(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public RatingCompat[] newArray(int i) {
            return new RatingCompat[i];
        }
    }

    public RatingCompat(int i, float f2) {
        this.f13b = i;
        this.f14c = f2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return this.f13b;
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("Rating:style=");
        j.append(this.f13b);
        j.append(" rating=");
        float f2 = this.f14c;
        j.append(f2 < 0.0f ? "unrated" : String.valueOf(f2));
        return j.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f13b);
        parcel.writeFloat(this.f14c);
    }
}
