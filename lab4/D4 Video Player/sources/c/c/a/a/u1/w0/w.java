package c.c.a.a.u1.w0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c.c.a.a.z1.l0;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class w implements Handler.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.a.y1.r f3028b;

    /* renamed from: c, reason: collision with root package name */
    public final h f3029c;

    /* renamed from: d, reason: collision with root package name */
    public final c.c.a.a.s1.j.c f3030d;

    /* renamed from: e, reason: collision with root package name */
    public final Handler f3031e;

    /* renamed from: f, reason: collision with root package name */
    public final TreeMap<Long, Long> f3032f = new TreeMap<>();
    public c.c.a.a.u1.w0.x.b g;
    public long h;
    public long i;
    public long j;
    public boolean k;
    public boolean l;

    public w(c.c.a.a.u1.w0.x.b bVar, h hVar, c.c.a.a.y1.r rVar) {
        this.g = bVar;
        this.f3029c = hVar;
        this.f3028b = rVar;
        int i = l0.f3761a;
        Looper myLooper = Looper.myLooper();
        this.f3031e = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper, this);
        this.f3030d = new c.c.a.a.s1.j.c();
        this.i = -9223372036854775807L;
        this.j = -9223372036854775807L;
    }

    public final void a() {
        long j = this.j;
        if (j == -9223372036854775807L || j != this.i) {
            this.k = true;
            this.j = this.i;
            DashMediaSource dashMediaSource = this.f3029c.f2995a;
            dashMediaSource.B.removeCallbacks(dashMediaSource.t);
            dashMediaSource.o();
        }
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        if (this.l) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        u uVar = (u) message.obj;
        long j = uVar.f3022a;
        long j2 = uVar.f3023b;
        Long l = this.f3032f.get(Long.valueOf(j2));
        if (l == null || l.longValue() > j) {
            this.f3032f.put(Long.valueOf(j2), Long.valueOf(j));
        }
        return true;
    }
}
