package c.c.a.a.s1.n;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class m extends c {
    public static final Parcelable.Creator<m> CREATOR = new j();

    /* renamed from: b, reason: collision with root package name */
    public final List<l> f2802b;

    public m(Parcel parcel, j jVar) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new l(parcel));
        }
        this.f2802b = Collections.unmodifiableList(arrayList);
    }

    public m(List<l> list) {
        this.f2802b = Collections.unmodifiableList(list);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int size = this.f2802b.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            l lVar = this.f2802b.get(i2);
            parcel.writeLong(lVar.f2796a);
            parcel.writeByte(lVar.f2797b ? (byte) 1 : (byte) 0);
            parcel.writeByte(lVar.f2798c ? (byte) 1 : (byte) 0);
            parcel.writeByte(lVar.f2799d ? (byte) 1 : (byte) 0);
            int size2 = lVar.f2801f.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                k kVar = lVar.f2801f.get(i3);
                parcel.writeInt(kVar.f2794a);
                parcel.writeLong(kVar.f2795b);
            }
            parcel.writeLong(lVar.f2800e);
            parcel.writeByte(lVar.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(lVar.h);
            parcel.writeInt(lVar.i);
            parcel.writeInt(lVar.j);
            parcel.writeInt(lVar.k);
        }
    }
}
