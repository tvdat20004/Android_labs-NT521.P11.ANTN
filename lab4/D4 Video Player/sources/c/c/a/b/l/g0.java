package c.c.a.b.l;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static AtomicReference<f0> f3904a = new AtomicReference<>();

    public static long a(long j) {
        Calendar e2 = e();
        e2.setTimeInMillis(j);
        return b(e2).getTimeInMillis();
    }

    public static Calendar b(Calendar calendar) {
        Calendar f2 = f(calendar);
        Calendar e2 = e();
        e2.set(f2.get(1), f2.get(2), f2.get(5));
        return e2;
    }

    public static TimeZone c() {
        return TimeZone.getTimeZone("UTC");
    }

    public static Calendar d() {
        f3904a.get();
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(c());
        return calendar;
    }

    public static Calendar e() {
        return f(null);
    }

    public static Calendar f(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(c());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
