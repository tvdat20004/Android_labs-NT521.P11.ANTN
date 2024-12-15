package c.c.a.a.x1;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c.c.a.a.i1;
import c.c.a.a.j0;
import c.c.a.a.j1;
import c.c.a.a.k1;
import c.c.a.a.v0;
import c.c.a.a.x0;
import c.c.a.a.z1.l0;
import java.util.Formatter;
import java.util.Objects;

/* loaded from: classes.dex */
public class l extends FrameLayout {
    public x0 A;
    public c.c.a.a.t B;
    public k C;
    public j D;
    public v0 E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public long P;
    public long[] Q;
    public boolean[] R;
    public long[] S;
    public boolean[] T;
    public long U;

    /* renamed from: b, reason: collision with root package name */
    public final i f3474b;

    /* renamed from: c, reason: collision with root package name */
    public final View f3475c;

    /* renamed from: d, reason: collision with root package name */
    public final View f3476d;

    /* renamed from: e, reason: collision with root package name */
    public final View f3477e;

    /* renamed from: f, reason: collision with root package name */
    public final View f3478f;
    public final View g;
    public final View h;
    public final ImageView i;
    public final View j;
    public final View k;
    public final TextView l;
    public final TextView m;
    public final s n;
    public final StringBuilder o;
    public final Formatter p;
    public final i1 q;
    public final j1 r;
    public final Runnable s;
    public final Runnable t;
    public final Drawable u;
    public final Drawable v;
    public final Drawable w;
    public final String x;
    public final String y;
    public final String z;

    static {
        j0.a("goog.exo.ui");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0198  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(android.content.Context r5, android.util.AttributeSet r6, int r7, android.util.AttributeSet r8) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.x1.l.<init>(android.content.Context, android.util.AttributeSet, int, android.util.AttributeSet):void");
    }

    public boolean a(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.A != null) {
            if (keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88) {
                if (keyEvent.getAction() == 0) {
                    if (keyCode == 90) {
                        b(this.A);
                    } else if (keyCode == 89) {
                        j(this.A);
                    } else if (keyEvent.getRepeatCount() == 0) {
                        if (keyCode == 85) {
                            c.c.a.a.t tVar = this.B;
                            x0 x0Var = this.A;
                            boolean z = !x0Var.l();
                            Objects.requireNonNull((c.c.a.a.u) tVar);
                            x0Var.c(z);
                        } else if (keyCode == 87) {
                            g(this.A);
                        } else if (keyCode == 88) {
                            h(this.A);
                        } else if (keyCode == 126) {
                            c.c.a.a.t tVar2 = this.B;
                            x0 x0Var2 = this.A;
                            Objects.requireNonNull((c.c.a.a.u) tVar2);
                            x0Var2.c(true);
                        } else if (keyCode == 127) {
                            c.c.a.a.t tVar3 = this.B;
                            x0 x0Var3 = this.A;
                            Objects.requireNonNull((c.c.a.a.u) tVar3);
                            x0Var3.c(false);
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void b(x0 x0Var) {
        c.c.a.a.q qVar = (c.c.a.a.q) x0Var;
        if (!qVar.D() || this.K <= 0) {
            return;
        }
        k(qVar, qVar.getCurrentPosition() + this.K);
    }

    public void c() {
        if (f()) {
            setVisibility(8);
            k kVar = this.C;
            if (kVar != null) {
                kVar.a(getVisibility());
            }
            removeCallbacks(this.s);
            removeCallbacks(this.t);
            this.P = -9223372036854775807L;
        }
    }

    public final void d() {
        removeCallbacks(this.t);
        if (this.L <= 0) {
            this.P = -9223372036854775807L;
            return;
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        int i = this.L;
        this.P = uptimeMillis + i;
        if (this.F) {
            postDelayed(this.t, i);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return a(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.t);
        } else if (motionEvent.getAction() == 1) {
            d();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final boolean e() {
        x0 x0Var = this.A;
        return (x0Var == null || x0Var.p() == 4 || this.A.p() == 1 || !this.A.l()) ? false : true;
    }

    public boolean f() {
        return getVisibility() == 0;
    }

    public final void g(x0 x0Var) {
        k1 o = x0Var.o();
        if (o.p() || x0Var.e()) {
            return;
        }
        int v = x0Var.v();
        int B = ((c.c.a.a.q) x0Var).B();
        if (B != -1) {
            l(x0Var, B, -9223372036854775807L);
        } else if (o.m(v, this.r).f2030c) {
            l(x0Var, v, -9223372036854775807L);
        }
    }

    public x0 getPlayer() {
        return this.A;
    }

    public int getRepeatToggleModes() {
        return this.N;
    }

    public boolean getShowShuffleButton() {
        return this.O;
    }

    public int getShowTimeoutMs() {
        return this.L;
    }

    public boolean getShowVrButton() {
        View view = this.k;
        return view != null && view.getVisibility() == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
    
        if (r1.f2029b == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(c.c.a.a.x0 r6) {
        /*
            r5 = this;
            c.c.a.a.k1 r0 = r6.o()
            boolean r1 = r0.p()
            if (r1 != 0) goto L46
            boolean r1 = r6.e()
            if (r1 == 0) goto L11
            goto L46
        L11:
            int r1 = r6.v()
            c.c.a.a.j1 r2 = r5.r
            r0.m(r1, r2)
            r0 = r6
            c.c.a.a.q r0 = (c.c.a.a.q) r0
            int r0 = r0.C()
            r1 = -1
            if (r0 == r1) goto L41
            long r1 = r6.getCurrentPosition()
            r3 = 3000(0xbb8, double:1.482E-320)
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 <= 0) goto L38
            c.c.a.a.j1 r1 = r5.r
            boolean r2 = r1.f2030c
            if (r2 == 0) goto L41
            boolean r1 = r1.f2029b
            if (r1 != 0) goto L41
        L38:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.l(r6, r0, r1)
            goto L46
        L41:
            r0 = 0
            r5.k(r6, r0)
        L46:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.x1.l.h(c.c.a.a.x0):void");
    }

    public final void i() {
        View view;
        View view2;
        boolean e2 = e();
        if (!e2 && (view2 = this.f3477e) != null) {
            view2.requestFocus();
        } else {
            if (!e2 || (view = this.f3478f) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    public final void j(x0 x0Var) {
        c.c.a.a.q qVar = (c.c.a.a.q) x0Var;
        if (!qVar.D() || this.J <= 0) {
            return;
        }
        k(qVar, qVar.getCurrentPosition() - this.J);
    }

    public final void k(x0 x0Var, long j) {
        l(x0Var, x0Var.v(), j);
    }

    public final boolean l(x0 x0Var, int i, long j) {
        long duration = x0Var.getDuration();
        if (duration != -9223372036854775807L) {
            j = Math.min(j, duration);
        }
        long max = Math.max(j, 0L);
        Objects.requireNonNull((c.c.a.a.u) this.B);
        x0Var.j(i, max);
        return true;
    }

    public final void m(boolean z, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? 1.0f : 0.3f);
        view.setVisibility(0);
    }

    public void n() {
        if (!f()) {
            setVisibility(0);
            k kVar = this.C;
            if (kVar != null) {
                kVar.a(getVisibility());
            }
            o();
            i();
        }
        d();
    }

    public final void o() {
        q();
        p();
        s();
        t();
        u();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.F = true;
        long j = this.P;
        if (j != -9223372036854775807L) {
            long uptimeMillis = j - SystemClock.uptimeMillis();
            if (uptimeMillis <= 0) {
                c();
            } else {
                postDelayed(this.t, uptimeMillis);
            }
        } else if (f()) {
            d();
        }
        o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.F = false;
        removeCallbacks(this.s);
        removeCallbacks(this.t);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0072, code lost:
    
        if ((((c.c.a.a.q) r9.A).B() != -1) != false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void p() {
        /*
            r9 = this;
            boolean r0 = r9.f()
            if (r0 == 0) goto L9a
            boolean r0 = r9.F
            if (r0 != 0) goto Lc
            goto L9a
        Lc:
            c.c.a.a.x0 r0 = r9.A
            r1 = 0
            if (r0 == 0) goto L79
            c.c.a.a.k1 r0 = r0.o()
            boolean r2 = r0.p()
            if (r2 != 0) goto L79
            c.c.a.a.x0 r2 = r9.A
            boolean r2 = r2.e()
            if (r2 != 0) goto L79
            c.c.a.a.x0 r2 = r9.A
            int r2 = r2.v()
            c.c.a.a.j1 r3 = r9.r
            r0.m(r2, r3)
            c.c.a.a.j1 r0 = r9.r
            boolean r2 = r0.f2029b
            r3 = -1
            r4 = 1
            if (r2 != 0) goto L4c
            boolean r0 = r0.f2030c
            if (r0 == 0) goto L4c
            c.c.a.a.x0 r0 = r9.A
            c.c.a.a.q r0 = (c.c.a.a.q) r0
            int r0 = r0.C()
            if (r0 == r3) goto L46
            r0 = r4
            goto L47
        L46:
            r0 = r1
        L47:
            if (r0 == 0) goto L4a
            goto L4c
        L4a:
            r0 = r1
            goto L4d
        L4c:
            r0 = r4
        L4d:
            if (r2 == 0) goto L55
            int r5 = r9.J
            if (r5 <= 0) goto L55
            r5 = r4
            goto L56
        L55:
            r5 = r1
        L56:
            if (r2 == 0) goto L5e
            int r6 = r9.K
            if (r6 <= 0) goto L5e
            r6 = r4
            goto L5f
        L5e:
            r6 = r1
        L5f:
            c.c.a.a.j1 r7 = r9.r
            boolean r7 = r7.f2030c
            if (r7 != 0) goto L74
            c.c.a.a.x0 r7 = r9.A
            c.c.a.a.q r7 = (c.c.a.a.q) r7
            int r7 = r7.B()
            if (r7 == r3) goto L71
            r3 = r4
            goto L72
        L71:
            r3 = r1
        L72:
            if (r3 == 0) goto L75
        L74:
            r1 = r4
        L75:
            r8 = r1
            r1 = r0
            r0 = r8
            goto L7d
        L79:
            r0 = r1
            r2 = r0
            r5 = r2
            r6 = r5
        L7d:
            android.view.View r3 = r9.f3475c
            r9.m(r1, r3)
            android.view.View r1 = r9.h
            r9.m(r5, r1)
            android.view.View r1 = r9.g
            r9.m(r6, r1)
            android.view.View r1 = r9.f3476d
            r9.m(r0, r1)
            c.c.a.a.x1.s r0 = r9.n
            if (r0 == 0) goto L9a
            c.c.a.a.x1.f r0 = (c.c.a.a.x1.f) r0
            r0.setEnabled(r2)
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.x1.l.p():void");
    }

    public final void q() {
        boolean z;
        if (f() && this.F) {
            boolean e2 = e();
            View view = this.f3477e;
            if (view != null) {
                z = (e2 && view.isFocused()) | false;
                this.f3477e.setVisibility(e2 ? 8 : 0);
            } else {
                z = false;
            }
            View view2 = this.f3478f;
            if (view2 != null) {
                z |= !e2 && view2.isFocused();
                this.f3478f.setVisibility(e2 ? 0 : 8);
            }
            if (z) {
                i();
            }
        }
    }

    public final void r() {
        long j;
        if (f() && this.F) {
            x0 x0Var = this.A;
            long j2 = 0;
            if (x0Var != null) {
                j2 = this.U + x0Var.h();
                j = this.U + this.A.u();
            } else {
                j = 0;
            }
            TextView textView = this.m;
            if (textView != null && !this.I) {
                textView.setText(l0.r(this.o, this.p, j2));
            }
            s sVar = this.n;
            if (sVar != null) {
                ((f) sVar).setPosition(j2);
                ((f) this.n).setBufferedPosition(j);
            }
            j jVar = this.D;
            if (jVar != null) {
                jVar.a(j2, j);
            }
            removeCallbacks(this.s);
            x0 x0Var2 = this.A;
            int p = x0Var2 == null ? 1 : x0Var2.p();
            if (p == 3 && this.A.l()) {
                s sVar2 = this.n;
                long min = Math.min(sVar2 != null ? ((f) sVar2).getPreferredUpdateDelay() : 1000L, 1000 - (j2 % 1000));
                float f2 = this.A.a().f2817a;
                postDelayed(this.s, l0.g(f2 > 0.0f ? (long) (min / f2) : 1000L, this.M, 1000L));
                return;
            }
            if (p == 4 || p == 1) {
                return;
            }
            postDelayed(this.s, 1000L);
        }
    }

    public final void s() {
        ImageView imageView;
        ImageView imageView2;
        String str;
        if (f() && this.F && (imageView = this.i) != null) {
            if (this.N == 0) {
                imageView.setVisibility(8);
                return;
            }
            if (this.A == null) {
                m(false, imageView);
                return;
            }
            m(true, imageView);
            int m = this.A.m();
            if (m == 0) {
                this.i.setImageDrawable(this.u);
                imageView2 = this.i;
                str = this.x;
            } else {
                if (m != 1) {
                    if (m == 2) {
                        this.i.setImageDrawable(this.w);
                        imageView2 = this.i;
                        str = this.z;
                    }
                    this.i.setVisibility(0);
                }
                this.i.setImageDrawable(this.v);
                imageView2 = this.i;
                str = this.y;
            }
            imageView2.setContentDescription(str);
            this.i.setVisibility(0);
        }
    }

    public void setControlDispatcher(c.c.a.a.t tVar) {
        if (tVar == null) {
            tVar = new c.c.a.a.u();
        }
        this.B = tVar;
    }

    public void setFastForwardIncrementMs(int i) {
        this.K = i;
        p();
    }

    public void setPlaybackPreparer(v0 v0Var) {
        this.E = v0Var;
    }

    public void setPlayer(x0 x0Var) {
        boolean z = true;
        p.g(Looper.myLooper() == Looper.getMainLooper());
        if (x0Var != null && x0Var.q() != Looper.getMainLooper()) {
            z = false;
        }
        p.c(z);
        x0 x0Var2 = this.A;
        if (x0Var2 == x0Var) {
            return;
        }
        if (x0Var2 != null) {
            x0Var2.t(this.f3474b);
        }
        this.A = x0Var;
        if (x0Var != null) {
            x0Var.f(this.f3474b);
        }
        o();
    }

    public void setProgressUpdateListener(j jVar) {
        this.D = jVar;
    }

    public void setRepeatToggleModes(int i) {
        int i2;
        x0 x0Var;
        c.c.a.a.u uVar;
        this.N = i;
        x0 x0Var2 = this.A;
        if (x0Var2 != null) {
            int m = x0Var2.m();
            if (i != 0 || m == 0) {
                i2 = 2;
                if (i == 1 && m == 2) {
                    c.c.a.a.t tVar = this.B;
                    x0 x0Var3 = this.A;
                    Objects.requireNonNull((c.c.a.a.u) tVar);
                    x0Var3.b(1);
                } else if (i == 2 && m == 1) {
                    c.c.a.a.t tVar2 = this.B;
                    x0Var = this.A;
                    uVar = (c.c.a.a.u) tVar2;
                }
            } else {
                c.c.a.a.t tVar3 = this.B;
                x0Var = this.A;
                i2 = 0;
                uVar = (c.c.a.a.u) tVar3;
            }
            Objects.requireNonNull(uVar);
            x0Var.b(i2);
        }
        s();
    }

    public void setRewindIncrementMs(int i) {
        this.J = i;
        p();
    }

    public void setShowMultiWindowTimeBar(boolean z) {
        this.G = z;
        u();
    }

    public void setShowShuffleButton(boolean z) {
        this.O = z;
        t();
    }

    public void setShowTimeoutMs(int i) {
        this.L = i;
        if (f()) {
            d();
        }
    }

    public void setShowVrButton(boolean z) {
        View view = this.k;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.M = l0.f(i, 16, 1000);
    }

    public void setVisibilityListener(k kVar) {
        this.C = kVar;
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        View view = this.k;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public final void t() {
        View view;
        if (f() && this.F && (view = this.j) != null) {
            if (!this.O) {
                view.setVisibility(8);
                return;
            }
            x0 x0Var = this.A;
            if (x0Var == null) {
                m(false, view);
                return;
            }
            view.setAlpha(x0Var.r() ? 1.0f : 0.3f);
            this.j.setEnabled(true);
            this.j.setVisibility(0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u() {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.x1.l.u():void");
    }
}
