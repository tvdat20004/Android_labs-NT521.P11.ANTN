package c.c.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import c.c.a.a.x0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class g1 extends q implements x0, y0 {
    public boolean A;
    public boolean B;

    /* renamed from: b, reason: collision with root package name */
    public final b1[] f2004b;

    /* renamed from: c, reason: collision with root package name */
    public final c0 f2005c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f2006d;

    /* renamed from: e, reason: collision with root package name */
    public final f1 f2007e;

    /* renamed from: f, reason: collision with root package name */
    public final CopyOnWriteArraySet<c.c.a.a.a2.x> f2008f;
    public final CopyOnWriteArraySet<c.c.a.a.l1.d> g;
    public final CopyOnWriteArraySet<c.c.a.a.v1.l> h;
    public final CopyOnWriteArraySet<c.c.a.a.s1.h> i;
    public final CopyOnWriteArraySet<c.c.a.a.a2.z> j;
    public final CopyOnWriteArraySet<c.c.a.a.m1.t> k;
    public final c.c.a.a.y1.h l;
    public final c.c.a.a.l1.d m;
    public final c.c.a.a.m1.p n;
    public Surface o;
    public boolean p;
    public SurfaceHolder q;
    public TextureView r;
    public int s;
    public int t;
    public int u;
    public float v;
    public c.c.a.a.u1.l w;
    public List<c.c.a.a.v1.b> x;
    public c.c.a.a.x1.v.h y;
    public c.c.a.a.x1.v.h z;

    public g1(Context context, y yVar, c.c.a.a.w1.v vVar, o0 o0Var, c.c.a.a.y1.h hVar, c.c.a.a.l1.a aVar, Looper looper) {
        CopyOnWriteArraySet<c.c.a.a.a2.z> copyOnWriteArraySet;
        int i;
        c.c.a.a.m1.m mVar;
        c.c.a.a.z1.g gVar = c.c.a.a.z1.g.f3739a;
        this.l = hVar;
        f1 f1Var = new f1(this, null);
        this.f2007e = f1Var;
        CopyOnWriteArraySet<c.c.a.a.a2.x> copyOnWriteArraySet2 = new CopyOnWriteArraySet<>();
        this.f2008f = copyOnWriteArraySet2;
        CopyOnWriteArraySet<c.c.a.a.l1.d> copyOnWriteArraySet3 = new CopyOnWriteArraySet<>();
        this.g = copyOnWriteArraySet3;
        this.h = new CopyOnWriteArraySet<>();
        CopyOnWriteArraySet<c.c.a.a.s1.h> copyOnWriteArraySet4 = new CopyOnWriteArraySet<>();
        this.i = copyOnWriteArraySet4;
        CopyOnWriteArraySet<c.c.a.a.a2.z> copyOnWriteArraySet5 = new CopyOnWriteArraySet<>();
        this.j = copyOnWriteArraySet5;
        CopyOnWriteArraySet<c.c.a.a.m1.t> copyOnWriteArraySet6 = new CopyOnWriteArraySet<>();
        this.k = copyOnWriteArraySet6;
        Handler handler = new Handler(looper);
        this.f2006d = handler;
        Objects.requireNonNull(yVar);
        ArrayList arrayList = new ArrayList();
        Context context2 = yVar.f3542a;
        c.c.a.a.r1.e eVar = c.c.a.a.r1.e.f2703a;
        arrayList.add(new c.c.a.a.a2.s(context2, eVar, 5000L, false, false, handler, f1Var, 50));
        Context context3 = yVar.f3542a;
        c.c.a.a.m1.r[] rVarArr = new c.c.a.a.m1.r[0];
        c.c.a.a.m1.m mVar2 = c.c.a.a.m1.m.f2122c;
        Intent registerReceiver = context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"));
        if (c.c.a.a.z1.l0.f3761a >= 17 && "Amazon".equals(c.c.a.a.z1.l0.f3763c)) {
            copyOnWriteArraySet = copyOnWriteArraySet5;
            i = 0;
            if (Settings.Global.getInt(context3.getContentResolver(), "external_surround_sound_enabled", 0) == 1) {
                mVar = c.c.a.a.m1.m.f2123d;
                arrayList.add(new c.c.a.a.m1.o0(context3, eVar, false, false, handler, f1Var, new c.c.a.a.m1.j0(mVar, rVarArr)));
                arrayList.add(new c.c.a.a.v1.m(f1Var, handler.getLooper()));
                arrayList.add(new c.c.a.a.s1.i(f1Var, handler.getLooper()));
                arrayList.add(new c.c.a.a.a2.a0.a());
                b1[] b1VarArr = (b1[]) arrayList.toArray(new b1[0]);
                this.f2004b = b1VarArr;
                this.v = 1.0f;
                this.u = 0;
                this.x = Collections.emptyList();
                c0 c0Var = new c0(b1VarArr, vVar, o0Var, hVar, gVar, looper);
                this.f2005c = c0Var;
                Objects.requireNonNull(aVar);
                c.c.a.a.l1.d dVar = new c.c.a.a.l1.d(c0Var, gVar);
                this.m = dVar;
                f(dVar);
                f(f1Var);
                copyOnWriteArraySet.add(dVar);
                copyOnWriteArraySet2.add(dVar);
                copyOnWriteArraySet6.add(dVar);
                copyOnWriteArraySet3.add(dVar);
                copyOnWriteArraySet4.add(dVar);
                c.c.a.a.z1.p<c.c.a.a.y1.g> pVar = ((c.c.a.a.y1.t) hVar).f3670c;
                Objects.requireNonNull(pVar);
                c.c.a.a.x1.p.c(true);
                pVar.a(dVar);
                pVar.f3775a.add(new c.c.a.a.z1.o<>(handler, dVar));
                this.n = new c.c.a.a.m1.p(context, f1Var);
            }
        } else {
            copyOnWriteArraySet = copyOnWriteArraySet5;
            i = 0;
        }
        mVar = (registerReceiver == null || registerReceiver.getIntExtra("android.media.extra.AUDIO_PLUG_STATE", i) == 0) ? c.c.a.a.m1.m.f2122c : new c.c.a.a.m1.m(registerReceiver.getIntArrayExtra("android.media.extra.ENCODINGS"), registerReceiver.getIntExtra("android.media.extra.MAX_CHANNEL_COUNT", 8));
        arrayList.add(new c.c.a.a.m1.o0(context3, eVar, false, false, handler, f1Var, new c.c.a.a.m1.j0(mVar, rVarArr)));
        arrayList.add(new c.c.a.a.v1.m(f1Var, handler.getLooper()));
        arrayList.add(new c.c.a.a.s1.i(f1Var, handler.getLooper()));
        arrayList.add(new c.c.a.a.a2.a0.a());
        b1[] b1VarArr2 = (b1[]) arrayList.toArray(new b1[0]);
        this.f2004b = b1VarArr2;
        this.v = 1.0f;
        this.u = 0;
        this.x = Collections.emptyList();
        c0 c0Var2 = new c0(b1VarArr2, vVar, o0Var, hVar, gVar, looper);
        this.f2005c = c0Var2;
        Objects.requireNonNull(aVar);
        c.c.a.a.l1.d dVar2 = new c.c.a.a.l1.d(c0Var2, gVar);
        this.m = dVar2;
        f(dVar2);
        f(f1Var);
        copyOnWriteArraySet.add(dVar2);
        copyOnWriteArraySet2.add(dVar2);
        copyOnWriteArraySet6.add(dVar2);
        copyOnWriteArraySet3.add(dVar2);
        copyOnWriteArraySet4.add(dVar2);
        c.c.a.a.z1.p<c.c.a.a.y1.g> pVar2 = ((c.c.a.a.y1.t) hVar).f3670c;
        Objects.requireNonNull(pVar2);
        c.c.a.a.x1.p.c(true);
        pVar2.a(dVar2);
        pVar2.f3775a.add(new c.c.a.a.z1.o<>(handler, dVar2));
        this.n = new c.c.a.a.m1.p(context, f1Var);
    }

    public final void E(int i, int i2) {
        if (i == this.s && i2 == this.t) {
            return;
        }
        this.s = i;
        this.t = i2;
        Iterator<c.c.a.a.a2.x> it = this.f2008f.iterator();
        while (it.hasNext()) {
            it.next().o(i, i2);
        }
    }

    public void F() {
        String str;
        N();
        this.n.a(true);
        c0 c0Var = this.f2005c;
        Objects.requireNonNull(c0Var);
        StringBuilder sb = new StringBuilder();
        sb.append("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(c0Var)));
        sb.append(" [");
        sb.append("ExoPlayerLib/2.10.4");
        sb.append("] [");
        sb.append(c.c.a.a.z1.l0.f3765e);
        sb.append("] [");
        HashSet<String> hashSet = j0.f2026a;
        synchronized (j0.class) {
            str = j0.f2027b;
        }
        sb.append(str);
        sb.append("]");
        Log.i("ExoPlayerImpl", sb.toString());
        i0 i0Var = c0Var.f1985f;
        synchronized (i0Var) {
            if (!i0Var.x) {
                i0Var.h.c(7);
                boolean z = false;
                while (!i0Var.x) {
                    try {
                        i0Var.wait();
                    } catch (InterruptedException unused) {
                        z = true;
                    }
                }
                if (z) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        c0Var.f1984e.removeCallbacksAndMessages(null);
        c0Var.t = c0Var.F(false, false, 1);
        G();
        Surface surface = this.o;
        if (surface != null) {
            if (this.p) {
                surface.release();
            }
            this.o = null;
        }
        c.c.a.a.u1.l lVar = this.w;
        if (lVar != null) {
            lVar.h(this.m);
            this.w = null;
        }
        if (this.B) {
            throw null;
        }
        ((c.c.a.a.y1.t) this.l).f3670c.a(this.m);
        this.x = Collections.emptyList();
    }

    public final void G() {
        TextureView textureView = this.r;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.f2007e) {
                Log.w("SimpleExoPlayer", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.r.setSurfaceTextureListener(null);
            }
            this.r = null;
        }
        SurfaceHolder surfaceHolder = this.q;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.f2007e);
            this.q = null;
        }
    }

    public void H(Surface surface) {
        N();
        G();
        J(surface, false);
        int i = surface != null ? -1 : 0;
        E(i, i);
    }

    public void I(SurfaceHolder surfaceHolder) {
        N();
        G();
        this.q = surfaceHolder;
        if (surfaceHolder != null) {
            surfaceHolder.addCallback(this.f2007e);
            Surface surface = surfaceHolder.getSurface();
            if (surface != null && surface.isValid()) {
                J(surface, false);
                Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
                E(surfaceFrame.width(), surfaceFrame.height());
                return;
            }
        }
        J(null, false);
        E(0, 0);
    }

    public final void J(Surface surface, boolean z) {
        ArrayList arrayList = new ArrayList();
        for (b1 b1Var : this.f2004b) {
            if (((r) b1Var).f2682b == 2) {
                z0 E = this.f2005c.E(b1Var);
                E.e(1);
                c.c.a.a.x1.p.g(true ^ E.h);
                E.f3714e = surface;
                E.c();
                arrayList.add(E);
            }
        }
        Surface surface2 = this.o;
        if (surface2 != null && surface2 != surface) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    z0 z0Var = (z0) it.next();
                    synchronized (z0Var) {
                        c.c.a.a.x1.p.g(z0Var.h);
                        c.c.a.a.x1.p.g(z0Var.f3715f.getLooper().getThread() != Thread.currentThread());
                        while (!z0Var.j) {
                            z0Var.wait();
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (this.p) {
                this.o.release();
            }
        }
        this.o = surface;
        this.p = z;
    }

    public void K(TextureView textureView) {
        N();
        G();
        this.r = textureView;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != null) {
                Log.w("SimpleExoPlayer", "Replacing existing SurfaceTextureListener.");
            }
            textureView.setSurfaceTextureListener(this.f2007e);
            SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
            if (surfaceTexture != null) {
                J(new Surface(surfaceTexture), true);
                E(textureView.getWidth(), textureView.getHeight());
                return;
            }
        }
        J(null, true);
        E(0, 0);
    }

    public void L(boolean z) {
        N();
        this.f2005c.M(z);
        c.c.a.a.u1.l lVar = this.w;
        if (lVar != null) {
            lVar.h(this.m);
            this.m.I();
            if (z) {
                this.w = null;
            }
        }
        this.n.a(true);
        this.x = Collections.emptyList();
    }

    public final void M(boolean z, int i) {
        this.f2005c.K(z && i != -1, i != 1);
    }

    public final void N() {
        if (Looper.myLooper() != q()) {
            Log.w("SimpleExoPlayer", "Player is accessed on the wrong thread. See https://exoplayer.dev/issues/player-accessed-on-wrong-thread", this.A ? null : new IllegalStateException());
            this.A = true;
        }
    }

    @Override // c.c.a.a.x0
    public u0 a() {
        N();
        return this.f2005c.r;
    }

    @Override // c.c.a.a.x0
    public void b(int i) {
        N();
        this.f2005c.b(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0017, code lost:
    
        if (r5 != false) goto L8;
     */
    @Override // c.c.a.a.x0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(boolean r5) {
        /*
            r4 = this;
            r4.N()
            c.c.a.a.m1.p r0 = r4.n
            int r1 = r4.p()
            java.util.Objects.requireNonNull(r0)
            r2 = -1
            if (r5 != 0) goto L14
            r1 = 0
            r0.a(r1)
            goto L23
        L14:
            r3 = 1
            if (r1 != r3) goto L1b
            if (r5 == 0) goto L23
        L19:
            r2 = r3
            goto L23
        L1b:
            int r1 = r0.f2131d
            if (r1 == 0) goto L19
            r0.a(r3)
            goto L19
        L23:
            r4.M(r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.g1.c(boolean):void");
    }

    @Override // c.c.a.a.x0
    public y0 d() {
        return this;
    }

    @Override // c.c.a.a.x0
    public boolean e() {
        N();
        return this.f2005c.e();
    }

    @Override // c.c.a.a.x0
    public void f(x0.a aVar) {
        N();
        this.f2005c.h.addIfAbsent(new o(aVar));
    }

    @Override // c.c.a.a.x0
    public int g() {
        N();
        c0 c0Var = this.f2005c;
        if (c0Var.e()) {
            return c0Var.t.f2807c.f2974c;
        }
        return -1;
    }

    @Override // c.c.a.a.x0
    public long getCurrentPosition() {
        N();
        return this.f2005c.getCurrentPosition();
    }

    @Override // c.c.a.a.x0
    public long getDuration() {
        N();
        return this.f2005c.getDuration();
    }

    @Override // c.c.a.a.x0
    public long h() {
        N();
        return this.f2005c.h();
    }

    @Override // c.c.a.a.x0
    public long i() {
        N();
        return s.b(this.f2005c.t.l);
    }

    @Override // c.c.a.a.x0
    public void j(int i, long j) {
        N();
        c.c.a.a.l1.d dVar = this.m;
        if (!dVar.f2054e.g) {
            c.c.a.a.l1.e F = dVar.F();
            dVar.f2054e.g = true;
            Iterator<c.c.a.a.l1.f> it = dVar.f2051b.iterator();
            while (it.hasNext()) {
                it.next().w(F);
            }
        }
        this.f2005c.j(i, j);
    }

    @Override // c.c.a.a.x0
    public c.c.a.a.u1.s0 k() {
        N();
        return this.f2005c.t.h;
    }

    @Override // c.c.a.a.x0
    public boolean l() {
        N();
        return this.f2005c.k;
    }

    @Override // c.c.a.a.x0
    public int m() {
        N();
        return this.f2005c.m;
    }

    @Override // c.c.a.a.x0
    public void n(boolean z) {
        N();
        this.f2005c.n(z);
    }

    @Override // c.c.a.a.x0
    public k1 o() {
        N();
        return this.f2005c.t.f2805a;
    }

    @Override // c.c.a.a.x0
    public int p() {
        N();
        return this.f2005c.t.f2810f;
    }

    @Override // c.c.a.a.x0
    public Looper q() {
        return this.f2005c.q();
    }

    @Override // c.c.a.a.x0
    public boolean r() {
        N();
        return this.f2005c.n;
    }

    @Override // c.c.a.a.x0
    public z s() {
        N();
        return this.f2005c.s;
    }

    @Override // c.c.a.a.x0
    public void t(x0.a aVar) {
        N();
        this.f2005c.t(aVar);
    }

    @Override // c.c.a.a.x0
    public long u() {
        N();
        return this.f2005c.u();
    }

    @Override // c.c.a.a.x0
    public int v() {
        N();
        return this.f2005c.v();
    }

    @Override // c.c.a.a.x0
    public c.c.a.a.w1.s w() {
        N();
        return this.f2005c.t.i.f3452c;
    }

    @Override // c.c.a.a.x0
    public int x(int i) {
        N();
        return ((r) this.f2005c.f1982c[i]).f2682b;
    }

    @Override // c.c.a.a.x0
    public int y() {
        N();
        c0 c0Var = this.f2005c;
        if (c0Var.e()) {
            return c0Var.t.f2807c.f2973b;
        }
        return -1;
    }

    @Override // c.c.a.a.x0
    public g1 z() {
        return this;
    }
}
