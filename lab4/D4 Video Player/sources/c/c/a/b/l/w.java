package c.c.a.b.l;

import android.os.Parcel;
import android.os.Parcelable;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* loaded from: classes.dex */
public final class w implements Comparable<w>, Parcelable {
    public static final Parcelable.Creator<w> CREATOR = new v();

    /* renamed from: b, reason: collision with root package name */
    public final Calendar f3936b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3937c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3938d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3939e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3940f;
    public final int g;
    public final long h;

    public w(Calendar calendar) {
        calendar.set(5, 1);
        Calendar b2 = g0.b(calendar);
        this.f3936b = b2;
        this.f3938d = b2.get(2);
        this.f3939e = b2.get(1);
        this.f3940f = b2.getMaximum(7);
        this.g = b2.getActualMaximum(5);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("LLLL, yyyy", Locale.getDefault());
        simpleDateFormat.setTimeZone(g0.c());
        this.f3937c = simpleDateFormat.format(b2.getTime());
        this.h = b2.getTimeInMillis();
    }

    public static w j(int i, int i2) {
        Calendar e2 = g0.e();
        e2.set(1, i);
        e2.set(2, i2);
        return new w(e2);
    }

    public static w k(long j) {
        Calendar e2 = g0.e();
        e2.setTimeInMillis(j);
        return new w(e2);
    }

    public static w l() {
        return new w(g0.d());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f3938d == wVar.f3938d && this.f3939e == wVar.f3939e;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3938d), Integer.valueOf(this.f3939e)});
    }

    @Override // java.lang.Comparable
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public int compareTo(w wVar) {
        return this.f3936b.compareTo(wVar.f3936b);
    }

    public int m() {
        int firstDayOfWeek = this.f3936b.get(7) - this.f3936b.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f3940f : firstDayOfWeek;
    }

    public w n(int i) {
        Calendar b2 = g0.b(this.f3936b);
        b2.add(2, i);
        return new w(b2);
    }

    public int o(w wVar) {
        if (!(this.f3936b instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (wVar.f3938d - this.f3938d) + ((wVar.f3939e - this.f3939e) * 12);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3939e);
        parcel.writeInt(this.f3938d);
    }
}
