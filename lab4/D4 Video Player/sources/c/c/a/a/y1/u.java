package c.c.a.a.y1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class u extends BroadcastReceiver {

    /* renamed from: c, reason: collision with root package name */
    public static u f3678c;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3679a = new Handler(Looper.getMainLooper());

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<WeakReference<t>> f3680b = new ArrayList<>();

    public final void a() {
        for (int size = this.f3680b.size() - 1; size >= 0; size--) {
            if (this.f3680b.get(size).get() == null) {
                this.f3680b.remove(size);
            }
        }
    }

    public final void b(t tVar) {
        Map<String, int[]> map = t.n;
        synchronized (tVar) {
            Context context = tVar.f3668a;
            int m = context == null ? 0 : c.c.a.a.z1.l0.m(context);
            if (tVar.i != m) {
                tVar.i = m;
                if (m != 1 && m != 0 && m != 8) {
                    tVar.l = tVar.a(m);
                    Objects.requireNonNull((c.c.a.a.z1.h0) tVar.f3672e);
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    tVar.b(tVar.f3673f > 0 ? (int) (elapsedRealtime - tVar.g) : 0, tVar.h, tVar.l);
                    tVar.g = elapsedRealtime;
                    tVar.h = 0L;
                    tVar.k = 0L;
                    tVar.j = 0L;
                    c.c.a.a.z1.f0 f0Var = tVar.f3671d;
                    f0Var.f3734b.clear();
                    f0Var.f3736d = -1;
                    f0Var.f3737e = 0;
                    f0Var.f3738f = 0;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public synchronized void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        a();
        for (int i = 0; i < this.f3680b.size(); i++) {
            t tVar = this.f3680b.get(i).get();
            if (tVar != null) {
                b(tVar);
            }
        }
    }
}
