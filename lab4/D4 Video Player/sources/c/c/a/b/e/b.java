package c.c.a.b.e;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public int f3836b;

    /* renamed from: c, reason: collision with root package name */
    public int f3837c;

    /* renamed from: d, reason: collision with root package name */
    public int f3838d;

    /* renamed from: e, reason: collision with root package name */
    public int f3839e;

    /* renamed from: f, reason: collision with root package name */
    public int f3840f;
    public CharSequence g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;

    public b(Context context) {
        this.f3838d = 255;
        this.f3839e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.TextAppearance_MaterialComponents_Badge, c.c.a.b.b.u);
        obtainStyledAttributes.getDimension(0, 0.0f);
        ColorStateList e2 = c.c.a.b.a.e(context, obtainStyledAttributes, 3);
        c.c.a.b.a.e(context, obtainStyledAttributes, 4);
        c.c.a.b.a.e(context, obtainStyledAttributes, 5);
        obtainStyledAttributes.getInt(2, 0);
        obtainStyledAttributes.getInt(1, 1);
        int i = obtainStyledAttributes.hasValue(12) ? 12 : 10;
        obtainStyledAttributes.getResourceId(i, 0);
        obtainStyledAttributes.getString(i);
        obtainStyledAttributes.getBoolean(14, false);
        c.c.a.b.a.e(context, obtainStyledAttributes, 6);
        obtainStyledAttributes.getFloat(7, 0.0f);
        obtainStyledAttributes.getFloat(8, 0.0f);
        obtainStyledAttributes.getFloat(9, 0.0f);
        obtainStyledAttributes.recycle();
        this.f3837c = e2.getDefaultColor();
        this.g = context.getString(R.string.mtrl_badge_numberless_content_description);
        this.h = R.plurals.mtrl_badge_content_description;
        this.i = R.string.mtrl_exceed_max_badge_number_content_description;
    }

    public b(Parcel parcel) {
        this.f3838d = 255;
        this.f3839e = -1;
        this.f3836b = parcel.readInt();
        this.f3837c = parcel.readInt();
        this.f3838d = parcel.readInt();
        this.f3839e = parcel.readInt();
        this.f3840f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt();
        this.j = parcel.readInt();
        this.k = parcel.readInt();
        this.l = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3836b);
        parcel.writeInt(this.f3837c);
        parcel.writeInt(this.f3838d);
        parcel.writeInt(this.f3839e);
        parcel.writeInt(this.f3840f);
        parcel.writeString(this.g.toString());
        parcel.writeInt(this.h);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
    }
}
