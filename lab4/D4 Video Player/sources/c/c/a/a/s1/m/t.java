package c.c.a.a.s1.m;

import android.os.Parcel;
import android.os.Parcelable;
import c.c.a.a.z1.l0;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class t extends p {
    public static final Parcelable.Creator<t> CREATOR = new s();

    /* renamed from: c, reason: collision with root package name */
    public final int f2770c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2771d;

    /* renamed from: e, reason: collision with root package name */
    public final int f2772e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f2773f;
    public final int[] g;

    public t(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f2770c = i;
        this.f2771d = i2;
        this.f2772e = i3;
        this.f2773f = iArr;
        this.g = iArr2;
    }

    public t(Parcel parcel) {
        super("MLLT");
        this.f2770c = parcel.readInt();
        this.f2771d = parcel.readInt();
        this.f2772e = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        int i = l0.f3761a;
        this.f2773f = createIntArray;
        this.g = parcel.createIntArray();
    }

    @Override // c.c.a.a.s1.m.p, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || t.class != obj.getClass()) {
            return false;
        }
        t tVar = (t) obj;
        return this.f2770c == tVar.f2770c && this.f2771d == tVar.f2771d && this.f2772e == tVar.f2772e && Arrays.equals(this.f2773f, tVar.f2773f) && Arrays.equals(this.g, tVar.g);
    }

    public int hashCode() {
        return Arrays.hashCode(this.g) + ((Arrays.hashCode(this.f2773f) + ((((((527 + this.f2770c) * 31) + this.f2771d) * 31) + this.f2772e) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f2770c);
        parcel.writeInt(this.f2771d);
        parcel.writeInt(this.f2772e);
        parcel.writeIntArray(this.f2773f);
        parcel.writeIntArray(this.g);
    }
}
