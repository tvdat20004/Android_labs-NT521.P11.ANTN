package c.c.a.a.u1.x0;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class x implements c.c.a.a.s1.b {
    public static final Parcelable.Creator<x> CREATOR = new u();

    /* renamed from: b, reason: collision with root package name */
    public final String f3190b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3191c;

    /* renamed from: d, reason: collision with root package name */
    public final List<w> f3192d;

    public x(Parcel parcel) {
        this.f3190b = parcel.readString();
        this.f3191c = parcel.readString();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(parcel.readParcelable(w.class.getClassLoader()));
        }
        this.f3192d = Collections.unmodifiableList(arrayList);
    }

    public x(String str, String str2, List<w> list) {
        this.f3190b = str;
        this.f3191c = str2;
        this.f3192d = Collections.unmodifiableList(new ArrayList(list));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return TextUtils.equals(this.f3190b, xVar.f3190b) && TextUtils.equals(this.f3191c, xVar.f3191c) && this.f3192d.equals(xVar.f3192d);
    }

    public int hashCode() {
        String str = this.f3190b;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f3191c;
        return this.f3192d.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f3190b);
        parcel.writeString(this.f3191c);
        int size = this.f3192d.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable(this.f3192d.get(i2), 0);
        }
    }
}
