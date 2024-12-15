package b.v;

import android.os.Parcel;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class b extends a {

    /* renamed from: d, reason: collision with root package name */
    public final SparseIntArray f1856d;

    /* renamed from: e, reason: collision with root package name */
    public final Parcel f1857e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1858f;
    public final int g;
    public final String h;
    public int i;
    public int j;
    public int k;

    public b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new b.e.b(), new b.e.b(), new b.e.b());
    }

    public b(Parcel parcel, int i, int i2, String str, b.e.b<String, Method> bVar, b.e.b<String, Method> bVar2, b.e.b<String, Class> bVar3) {
        super(bVar, bVar2, bVar3);
        this.f1856d = new SparseIntArray();
        this.i = -1;
        this.j = 0;
        this.k = -1;
        this.f1857e = parcel;
        this.f1858f = i;
        this.g = i2;
        this.j = i;
        this.h = str;
    }

    @Override // b.v.a
    public void a() {
        int i = this.i;
        if (i >= 0) {
            int i2 = this.f1856d.get(i);
            int dataPosition = this.f1857e.dataPosition();
            this.f1857e.setDataPosition(i2);
            this.f1857e.writeInt(dataPosition - i2);
            this.f1857e.setDataPosition(dataPosition);
        }
    }

    @Override // b.v.a
    public a b() {
        Parcel parcel = this.f1857e;
        int dataPosition = parcel.dataPosition();
        int i = this.j;
        if (i == this.f1858f) {
            i = this.g;
        }
        return new b(parcel, dataPosition, i, this.h + "  ", this.f1853a, this.f1854b, this.f1855c);
    }

    @Override // b.v.a
    public boolean h(int i) {
        while (this.j < this.g) {
            int i2 = this.k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f1857e.setDataPosition(this.j);
            int readInt = this.f1857e.readInt();
            this.k = this.f1857e.readInt();
            this.j += readInt;
        }
        return this.k == i;
    }

    @Override // b.v.a
    public void l(int i) {
        a();
        this.i = i;
        this.f1856d.put(i, this.f1857e.dataPosition());
        this.f1857e.writeInt(0);
        this.f1857e.writeInt(i);
    }
}
