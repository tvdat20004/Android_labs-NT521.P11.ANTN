package b.l.b;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class j0 implements Parcelable {
    public static final Parcelable.Creator<j0> CREATOR = new i0();

    /* renamed from: b, reason: collision with root package name */
    public final String f1422b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1423c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1424d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1425e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1426f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final Bundle k;
    public final boolean l;
    public final int m;
    public Bundle n;

    public j0(Parcel parcel) {
        this.f1422b = parcel.readString();
        this.f1423c = parcel.readString();
        this.f1424d = parcel.readInt() != 0;
        this.f1425e = parcel.readInt();
        this.f1426f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt() != 0;
        this.i = parcel.readInt() != 0;
        this.j = parcel.readInt() != 0;
        this.k = parcel.readBundle();
        this.l = parcel.readInt() != 0;
        this.n = parcel.readBundle();
        this.m = parcel.readInt();
    }

    public j0(Fragment fragment) {
        this.f1422b = fragment.getClass().getName();
        this.f1423c = fragment.f225e;
        this.f1424d = fragment.m;
        this.f1425e = fragment.v;
        this.f1426f = fragment.w;
        this.g = fragment.x;
        this.h = fragment.A;
        this.i = fragment.l;
        this.j = fragment.z;
        this.k = fragment.f226f;
        this.l = fragment.y;
        this.m = fragment.N.ordinal();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1422b);
        sb.append(" (");
        sb.append(this.f1423c);
        sb.append(")}:");
        if (this.f1424d) {
            sb.append(" fromLayout");
        }
        if (this.f1426f != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f1426f));
        }
        String str = this.g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.g);
        }
        if (this.h) {
            sb.append(" retainInstance");
        }
        if (this.i) {
            sb.append(" removing");
        }
        if (this.j) {
            sb.append(" detached");
        }
        if (this.l) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1422b);
        parcel.writeString(this.f1423c);
        parcel.writeInt(this.f1424d ? 1 : 0);
        parcel.writeInt(this.f1425e);
        parcel.writeInt(this.f1426f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeBundle(this.k);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeBundle(this.n);
        parcel.writeInt(this.m);
    }
}
