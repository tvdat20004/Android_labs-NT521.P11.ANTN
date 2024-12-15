package c.c.a.b.l;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new c.c.a.b.l.a();

    /* renamed from: b, reason: collision with root package name */
    public final w f3881b;

    /* renamed from: c, reason: collision with root package name */
    public final w f3882c;

    /* renamed from: d, reason: collision with root package name */
    public final w f3883d;

    /* renamed from: e, reason: collision with root package name */
    public final c f3884e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3885f;
    public final int g;

    public static final class a {

        /* renamed from: e, reason: collision with root package name */
        public static final long f3886e = g0.a(w.j(1900, 0).h);

        /* renamed from: f, reason: collision with root package name */
        public static final long f3887f = g0.a(w.j(2100, 11).h);

        /* renamed from: a, reason: collision with root package name */
        public long f3888a;

        /* renamed from: b, reason: collision with root package name */
        public long f3889b;

        /* renamed from: c, reason: collision with root package name */
        public Long f3890c;

        /* renamed from: d, reason: collision with root package name */
        public c f3891d;

        public a(b bVar) {
            this.f3888a = f3886e;
            this.f3889b = f3887f;
            this.f3891d = new h(Long.MIN_VALUE);
            this.f3888a = bVar.f3881b.h;
            this.f3889b = bVar.f3882c.h;
            this.f3890c = Long.valueOf(bVar.f3883d.h);
            this.f3891d = bVar.f3884e;
        }
    }

    public b(w wVar, w wVar2, w wVar3, c cVar, c.c.a.b.l.a aVar) {
        this.f3881b = wVar;
        this.f3882c = wVar2;
        this.f3883d = wVar3;
        this.f3884e = cVar;
        if (wVar.f3936b.compareTo(wVar3.f3936b) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (wVar3.f3936b.compareTo(wVar2.f3936b) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        this.g = wVar.o(wVar2) + 1;
        this.f3885f = (wVar2.f3939e - wVar.f3939e) + 1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f3881b.equals(bVar.f3881b) && this.f3882c.equals(bVar.f3882c) && this.f3883d.equals(bVar.f3883d) && this.f3884e.equals(bVar.f3884e);
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3881b, this.f3882c, this.f3883d, this.f3884e});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3881b, 0);
        parcel.writeParcelable(this.f3882c, 0);
        parcel.writeParcelable(this.f3883d, 0);
        parcel.writeParcelable(this.f3884e, 0);
    }
}
