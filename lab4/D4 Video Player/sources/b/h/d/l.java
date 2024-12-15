package b.h.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public ConcurrentHashMap<Long, b.h.c.a.c> f1176a = new ConcurrentHashMap<>();

    public static <T> T e(T[] tArr, int i, k<T> kVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(kVar.a(t2) - i2) * 2) + (kVar.b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    public abstract Typeface a(Context context, b.h.c.a.c cVar, Resources resources, int i);

    public abstract Typeface b(Context context, CancellationSignal cancellationSignal, b.h.g.g[] gVarArr, int i);

    public Typeface c(Context context, InputStream inputStream) {
        File s = b.h.b.h.s(context);
        if (s == null) {
            return null;
        }
        try {
            if (b.h.b.h.j(s, inputStream)) {
                return Typeface.createFromFile(s.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            s.delete();
        }
    }

    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        File s = b.h.b.h.s(context);
        if (s == null) {
            return null;
        }
        try {
            if (b.h.b.h.i(s, resources, i)) {
                return Typeface.createFromFile(s.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            s.delete();
        }
    }
}
