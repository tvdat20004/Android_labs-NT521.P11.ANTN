package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final String f6b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f7c;

    /* renamed from: d, reason: collision with root package name */
    public final CharSequence f8d;

    /* renamed from: e, reason: collision with root package name */
    public final CharSequence f9e;

    /* renamed from: f, reason: collision with root package name */
    public final Bitmap f10f;
    public final Uri g;
    public final Bundle h;
    public final Uri i;
    public Object j;

    public static class a implements Parcelable.Creator<MediaDescriptionCompat> {
        /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
        @Override // android.os.Parcelable.Creator
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public android.support.v4.media.MediaDescriptionCompat createFromParcel(android.os.Parcel r15) {
            /*
                r14 = this;
                android.os.Parcelable$Creator r0 = android.media.MediaDescription.CREATOR
                java.lang.Object r15 = r0.createFromParcel(r15)
                r0 = 0
                if (r15 == 0) goto L61
                r1 = r15
                android.media.MediaDescription r1 = (android.media.MediaDescription) r1
                java.lang.String r3 = r1.getMediaId()
                java.lang.CharSequence r4 = r1.getTitle()
                java.lang.CharSequence r5 = r1.getSubtitle()
                java.lang.CharSequence r6 = r1.getDescription()
                android.graphics.Bitmap r7 = r1.getIconBitmap()
                android.net.Uri r8 = r1.getIconUri()
                android.os.Bundle r2 = r1.getExtras()
                java.lang.String r9 = "android.support.v4.media.description.MEDIA_URI"
                if (r2 == 0) goto L36
                android.support.v4.media.session.MediaSessionCompat.a(r2)
                android.os.Parcelable r10 = r2.getParcelable(r9)
                android.net.Uri r10 = (android.net.Uri) r10
                goto L37
            L36:
                r10 = r0
            L37:
                if (r10 == 0) goto L50
                java.lang.String r11 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
                boolean r12 = r2.containsKey(r11)
                if (r12 == 0) goto L4a
                int r12 = r2.size()
                r13 = 2
                if (r12 != r13) goto L4a
                r9 = r0
                goto L51
            L4a:
                r2.remove(r9)
                r2.remove(r11)
            L50:
                r9 = r2
            L51:
                if (r10 == 0) goto L54
                goto L59
            L54:
                android.net.Uri r0 = r1.getMediaUri()
                r10 = r0
            L59:
                android.support.v4.media.MediaDescriptionCompat r0 = new android.support.v4.media.MediaDescriptionCompat
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
                r0.j = r15
            L61:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.MediaDescriptionCompat.a.createFromParcel(android.os.Parcel):java.lang.Object");
        }

        @Override // android.os.Parcelable.Creator
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f6b = str;
        this.f7c = charSequence;
        this.f8d = charSequence2;
        this.f9e = charSequence3;
        this.f10f = bitmap;
        this.g = uri;
        this.h = bundle;
        this.i = uri2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f7c) + ", " + ((Object) this.f8d) + ", " + ((Object) this.f9e);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Object obj = this.j;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f6b);
            builder.setTitle(this.f7c);
            builder.setSubtitle(this.f8d);
            builder.setDescription(this.f9e);
            builder.setIconBitmap(this.f10f);
            builder.setIconUri(this.g);
            builder.setExtras(this.h);
            builder.setMediaUri(this.i);
            obj = builder.build();
            this.j = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i);
    }
}
