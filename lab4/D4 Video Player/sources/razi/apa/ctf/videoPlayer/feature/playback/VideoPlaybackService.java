package razi.apa.ctf.videoPlayer.feature.playback;

import android.app.Application;
import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import android.webkit.URLUtil;
import c.c.a.a.g1;
import c.c.a.a.k1;
import c.c.a.a.o;
import c.c.a.a.s1.h;
import c.c.a.a.u0;
import c.c.a.a.u1.s0;
import c.c.a.a.v;
import c.c.a.a.w0;
import c.c.a.a.w1.d;
import c.c.a.a.w1.m;
import c.c.a.a.w1.s;
import c.c.a.a.x0;
import c.c.a.a.x1.p;
import c.c.a.a.y;
import c.c.a.a.y1.a1.a0;
import c.c.a.a.y1.r;
import c.c.a.a.y1.t;
import c.c.a.a.z;
import c.c.a.a.z1.l0;
import java.io.IOException;
import java.util.Objects;
import razi.apa.ctf.videoPlayer.R;
import razi.apa.ctf.videoPlayer.YAVPApp;
import razi.apa.ctf.videoPlayer.ui.playback.PlaybackActivity;

/* loaded from: classes.dex */
public class VideoPlaybackService extends Service {
    public static final /* synthetic */ int l = 0;

    /* renamed from: b, reason: collision with root package name */
    public g1 f4373b;

    /* renamed from: c, reason: collision with root package name */
    public f.a.a.a.a.c.a f4374c;

    /* renamed from: d, reason: collision with root package name */
    public f.a.a.a.a.c.b f4375d;

    /* renamed from: f, reason: collision with root package name */
    public m f4377f;
    public t g;

    /* renamed from: e, reason: collision with root package name */
    public Uri f4376e = null;
    public boolean h = false;
    public boolean i = false;
    public long j = 0;
    public boolean k = false;

    public class b implements x0.a {

        /* renamed from: b, reason: collision with root package name */
        public int f4378b = -1;

        public b(a aVar) {
        }

        /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
        @Override // c.c.a.a.x0.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void b(boolean r9, int r10) {
            /*
                Method dump skipped, instructions count: 244
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: razi.apa.ctf.videoPlayer.feature.playback.VideoPlaybackService.b.b(boolean, int):void");
        }

        @Override // c.c.a.a.x0.a
        public void c(boolean z) {
        }

        @Override // c.c.a.a.x0.a
        public /* synthetic */ void e(int i) {
            w0.e(this, i);
        }

        @Override // c.c.a.a.x0.a
        public /* synthetic */ void i(s0 s0Var, s sVar) {
            w0.j(this, s0Var, sVar);
        }

        @Override // c.c.a.a.x0.a
        public /* synthetic */ void l(boolean z) {
            w0.h(this, z);
        }

        @Override // c.c.a.a.x0.a
        public /* synthetic */ void n(k1 k1Var, Object obj, int i) {
            w0.i(this, k1Var, obj, i);
        }

        @Override // c.c.a.a.x0.a
        public /* synthetic */ void p(u0 u0Var) {
            w0.b(this, u0Var);
        }

        @Override // c.c.a.a.x0.a
        public /* synthetic */ void q(int i) {
            w0.f(this, i);
        }

        @Override // c.c.a.a.x0.a
        public void s(z zVar) {
            d.a.a.a.f("onPlayerError(): %s", zVar.toString());
            VideoPlaybackService videoPlaybackService = VideoPlaybackService.this;
            int i = VideoPlaybackService.l;
            if (videoPlaybackService.d()) {
                PlaybackActivity.c cVar = (PlaybackActivity.c) VideoPlaybackService.this.f4375d;
                Objects.requireNonNull(cVar);
                d.a.a.a.f("VideoServiceCallbackListener:onError(): %s", zVar.toString());
                PlaybackActivity playbackActivity = PlaybackActivity.this;
                int i2 = PlaybackActivity.M;
                playbackActivity.v();
                Application application = PlaybackActivity.this.getApplication();
                if (application instanceof YAVPApp) {
                    ((YAVPApp) application).uncaughtException(Thread.currentThread(), zVar);
                }
            }
        }

        @Override // c.c.a.a.x0.a
        public /* synthetic */ void u() {
            w0.g(this);
        }
    }

    public class c implements h {
        public c(a aVar) {
        }

        @Override // c.c.a.a.s1.h
        public void r(c.c.a.a.s1.c cVar) {
            VideoPlaybackService videoPlaybackService = VideoPlaybackService.this;
            int i = VideoPlaybackService.l;
            if (videoPlaybackService.d()) {
                Objects.requireNonNull((PlaybackActivity.c) VideoPlaybackService.this.f4375d);
            }
        }
    }

    public class d extends Binder {
        public d() {
        }
    }

    public boolean a() {
        return f() && this.f4373b.m() == 2;
    }

    public boolean b() {
        return f() && this.f4373b.l();
    }

    public long c() {
        if (f()) {
            return this.f4373b.h();
        }
        return -1L;
    }

    public final boolean d() {
        return this.f4375d != null;
    }

    public final boolean e(Uri uri) {
        return URLUtil.isValidUrl(uri.toString()) && (URLUtil.isFileUrl(uri.toString()) || URLUtil.isContentUrl(uri.toString()));
    }

    public final boolean f() {
        boolean z = this.f4373b != null && this.h;
        if (!z) {
            d.a.a.a.g("Call to isPlayerValid() but player is NOT valid!", new Object[0]);
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(android.net.Uri r17, boolean r18, long r19) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: razi.apa.ctf.videoPlayer.feature.playback.VideoPlaybackService.g(android.net.Uri, boolean, long):void");
    }

    public void h() {
        Uri uri = this.f4376e;
        if (uri == null) {
            throw new IllegalStateException("reloadMedia(): currentMediaUri is null! did you try to reload before loading?");
        }
        g(uri, this.i, this.j);
    }

    public void i(long j) {
        j(c() + j);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r3 == (-9223372036854775807L)) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(long r8) {
        /*
            r7 = this;
            boolean r0 = r7.f()
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r7.f()
            r1 = -1
            if (r0 == 0) goto L1e
            c.c.a.a.g1 r0 = r7.f4373b
            long r3 = r0.A()
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L1f
        L1e:
            r3 = r1
        L1f:
            r5 = 0
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 >= 0) goto L26
            r8 = r5
        L26:
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L2f
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L2f
            goto L30
        L2f:
            r3 = r8
        L30:
            c.c.a.a.g1 r8 = r7.f4373b
            int r9 = r8.v()
            r8.j(r9, r3)
            r8 = 0
            r7.k = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: razi.apa.ctf.videoPlayer.feature.playback.VideoPlaybackService.j(long):void");
    }

    public void k(boolean z) {
        if (f()) {
            this.f4373b.c(z);
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        String str;
        d.a.a.a.e("VideoPlaybackService.onBind()", new Object[0]);
        String packageName = getPackageName();
        int i = l0.f3761a;
        try {
            str = getPackageManager().getPackageInfo(getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = "?";
        }
        this.f4374c = new f.a.a.a.a.c.a(this, packageName + "/" + str + " (Linux;Android " + Build.VERSION.RELEASE + ") ExoPlayerLib/2.10.4");
        this.f4377f = new m(new d.a());
        t.a aVar = new t.a(this);
        this.g = new t(aVar.f3674a, aVar.f3675b, aVar.f3676c, aVar.f3677d, false, null);
        y yVar = new y(this);
        int integer = getResources().getInteger(R.integer.playback_min_buffer_duration);
        int integer2 = getResources().getInteger(R.integer.playback_max_buffer_duration);
        int integer3 = getResources().getInteger(R.integer.playback_min_start_buffer);
        int integer4 = getResources().getInteger(R.integer.playback_min_resume_buffer);
        r rVar = new r(true, 16);
        p.g(true);
        p.g(true);
        p.g(true);
        p.g(true);
        v.a(integer3, 0, "bufferForPlaybackMs", "0");
        v.a(integer4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        v.a(integer, integer3, "minBufferMs", "bufferForPlaybackMs");
        v.a(integer, integer4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        v.a(integer2, integer, "maxBufferMs", "minBufferMs");
        p.g(true);
        v vVar = new v(rVar, integer, integer, integer2, integer3, integer4, -1, true, 0, false);
        m mVar = this.f4377f;
        t tVar = this.g;
        c.c.a.a.l1.a aVar2 = new c.c.a.a.l1.a();
        int i2 = l0.f3761a;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        g1 g1Var = new g1(this, yVar, mVar, vVar, tVar, aVar2, myLooper);
        this.f4373b = g1Var;
        b bVar = new b(null);
        g1Var.N();
        g1Var.f2005c.h.addIfAbsent(new o(bVar));
        this.f4373b.i.add(new c(null));
        this.h = true;
        if (d()) {
            ((PlaybackActivity.c) this.f4375d).c();
        }
        return new d();
    }

    @Override // android.app.Service
    public void onDestroy() {
        d.a.a.a.e("VideoPlaybackService.onDestroy()", new Object[0]);
        d.a.a.a.e("releasing player and media...", new Object[0]);
        g1 g1Var = this.f4373b;
        if (g1Var != null) {
            g1Var.L(false);
            this.f4373b.F();
            this.f4373b = null;
            this.h = false;
        }
        f.a.a.a.a.c.a aVar = this.f4374c;
        if (aVar != null) {
            d.a.a.a.e("Releasing UniversalMediaSourceFactory and clearing %d bytes of cache...", Long.valueOf(((a0) aVar.f4332c).g()));
            c.c.a.a.y1.a1.c cVar = aVar.f4332c;
            if (cVar != null) {
                a0 a0Var = (a0) cVar;
                synchronized (a0Var) {
                    if (!a0Var.j) {
                        a0Var.f3550e.clear();
                        a0Var.n();
                        try {
                            try {
                                a0Var.f3548c.g();
                            } catch (IOException e2) {
                                Log.e("SimpleCache", "Storing index file failed", e2);
                            }
                        } finally {
                            a0.p(a0Var.f3546a);
                            a0Var.j = true;
                        }
                    }
                }
                d.a.a.a.e("Cache released!", new Object[0]);
            }
            c.c.a.a.n1.c cVar2 = aVar.f4333d;
            if (cVar2 != null) {
                cVar2.close();
                d.a.a.a.e("database connection closed!", new Object[0]);
            }
            this.f4374c = null;
        }
        super.onDestroy();
    }
}
