package b.h.g;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Comparator;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final b.e.g<String, Typeface> f1203a = new b.e.g<>(16);

    /* renamed from: b, reason: collision with root package name */
    public static final o f1204b = new o("fonts", 10, 10000);

    /* renamed from: c, reason: collision with root package name */
    public static final Object f1205c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final b.e.i<String, ArrayList<n<h>>> f1206d = new b.e.i<>();

    /* renamed from: e, reason: collision with root package name */
    public static final Comparator<byte[]> f1207e = new e();

    /* JADX WARN: Removed duplicated region for block: B:28:0x0090 A[LOOP:1: B:14:0x004b->B:28:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094 A[EDGE_INSN: B:29:0x0094->B:30:0x0094 BREAK  A[LOOP:1: B:14:0x004b->B:28:0x0090], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static b.h.g.f a(android.content.Context r20, android.os.CancellationSignal r21, b.h.g.a r22) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.g.i.a(android.content.Context, android.os.CancellationSignal, b.h.g.a):b.h.g.f");
    }

    public static h b(Context context, a aVar, int i) {
        try {
            f a2 = a(context, null, aVar);
            int i2 = a2.f1194a;
            if (i2 != 0) {
                return new h(null, i2 == 1 ? -2 : -3);
            }
            Typeface b2 = b.h.d.d.f1165a.b(context, null, a2.f1195b, i);
            return new h(b2, b2 != null ? 0 : -3);
        } catch (PackageManager.NameNotFoundException unused) {
            return new h(null, -1);
        }
    }
}
