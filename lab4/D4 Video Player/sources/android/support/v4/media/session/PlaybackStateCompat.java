package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f24b;

    /* renamed from: c, reason: collision with root package name */
    public final long f25c;

    /* renamed from: d, reason: collision with root package name */
    public final long f26d;

    /* renamed from: e, reason: collision with root package name */
    public final float f27e;

    /* renamed from: f, reason: collision with root package name */
    public final long f28f;
    public final int g;
    public final CharSequence h;
    public final long i;
    public List<CustomAction> j;
    public final long k;
    public final Bundle l;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final String f29b;

        /* renamed from: c, reason: collision with root package name */
        public final CharSequence f30c;

        /* renamed from: d, reason: collision with root package name */
        public final int f31d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f32e;

        public static class a implements Parcelable.Creator<CustomAction> {
            @Override // android.os.Parcelable.Creator
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public CustomAction[] newArray(int i) {
                return new CustomAction[i];
            }
        }

        public CustomAction(Parcel parcel) {
            this.f29b = parcel.readString();
            this.f30c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f31d = parcel.readInt();
            this.f32e = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder j = c.a.a.a.a.j("Action:mName='");
            j.append((Object) this.f30c);
            j.append(", mIcon=");
            j.append(this.f31d);
            j.append(", mExtras=");
            j.append(this.f32e);
            return j.toString();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f29b);
            TextUtils.writeToParcel(this.f30c, parcel, i);
            parcel.writeInt(this.f31d);
            parcel.writeBundle(this.f32e);
        }
    }

    public static class a implements Parcelable.Creator<PlaybackStateCompat> {
        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public PlaybackStateCompat[] newArray(int i) {
            return new PlaybackStateCompat[i];
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f24b = parcel.readInt();
        this.f25c = parcel.readLong();
        this.f27e = parcel.readFloat();
        this.i = parcel.readLong();
        this.f26d = parcel.readLong();
        this.f28f = parcel.readLong();
        this.h = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.j = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.k = parcel.readLong();
        this.l = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.g = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f24b + ", position=" + this.f25c + ", buffered position=" + this.f26d + ", speed=" + this.f27e + ", updated=" + this.i + ", actions=" + this.f28f + ", error code=" + this.g + ", error message=" + this.h + ", custom actions=" + this.j + ", active item id=" + this.k + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f24b);
        parcel.writeLong(this.f25c);
        parcel.writeFloat(this.f27e);
        parcel.writeLong(this.i);
        parcel.writeLong(this.f26d);
        parcel.writeLong(this.f28f);
        TextUtils.writeToParcel(this.h, parcel, i);
        parcel.writeTypedList(this.j);
        parcel.writeLong(this.k);
        parcel.writeBundle(this.l);
        parcel.writeInt(this.g);
    }
}
