package b.l.b;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class c implements Parcelable {
    public static final Parcelable.Creator<c> CREATOR = new b();

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1382b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<String> f1383c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f1384d;

    /* renamed from: e, reason: collision with root package name */
    public final int[] f1385e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1386f;
    public final String g;
    public final int h;
    public final int i;
    public final CharSequence j;
    public final int k;
    public final CharSequence l;
    public final ArrayList<String> m;
    public final ArrayList<String> n;
    public final boolean o;

    public c(Parcel parcel) {
        this.f1382b = parcel.createIntArray();
        this.f1383c = parcel.createStringArrayList();
        this.f1384d = parcel.createIntArray();
        this.f1385e = parcel.createIntArray();
        this.f1386f = parcel.readInt();
        this.g = parcel.readString();
        this.h = parcel.readInt();
        this.i = parcel.readInt();
        this.j = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.k = parcel.readInt();
        this.l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.m = parcel.createStringArrayList();
        this.n = parcel.createStringArrayList();
        this.o = parcel.readInt() != 0;
    }

    public c(a aVar) {
        int size = aVar.f1368a.size();
        this.f1382b = new int[size * 5];
        if (!aVar.g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1383c = new ArrayList<>(size);
        this.f1384d = new int[size];
        this.f1385e = new int[size];
        int i = 0;
        int i2 = 0;
        while (i < size) {
            m0 m0Var = aVar.f1368a.get(i);
            int i3 = i2 + 1;
            this.f1382b[i2] = m0Var.f1443a;
            ArrayList<String> arrayList = this.f1383c;
            Fragment fragment = m0Var.f1444b;
            arrayList.add(fragment != null ? fragment.f225e : null);
            int[] iArr = this.f1382b;
            int i4 = i3 + 1;
            iArr[i3] = m0Var.f1445c;
            int i5 = i4 + 1;
            iArr[i4] = m0Var.f1446d;
            int i6 = i5 + 1;
            iArr[i5] = m0Var.f1447e;
            iArr[i6] = m0Var.f1448f;
            this.f1384d[i] = m0Var.g.ordinal();
            this.f1385e[i] = m0Var.h.ordinal();
            i++;
            i2 = i6 + 1;
        }
        this.f1386f = aVar.f1373f;
        this.g = aVar.i;
        this.h = aVar.s;
        this.i = aVar.j;
        this.j = aVar.k;
        this.k = aVar.l;
        this.l = aVar.m;
        this.m = aVar.n;
        this.n = aVar.o;
        this.o = aVar.p;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1382b);
        parcel.writeStringList(this.f1383c);
        parcel.writeIntArray(this.f1384d);
        parcel.writeIntArray(this.f1385e);
        parcel.writeInt(this.f1386f);
        parcel.writeString(this.g);
        parcel.writeInt(this.h);
        parcel.writeInt(this.i);
        TextUtils.writeToParcel(this.j, parcel, 0);
        parcel.writeInt(this.k);
        TextUtils.writeToParcel(this.l, parcel, 0);
        parcel.writeStringList(this.m);
        parcel.writeStringList(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }
}
