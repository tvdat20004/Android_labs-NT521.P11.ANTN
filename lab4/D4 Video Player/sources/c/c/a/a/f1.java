package c.c.a.a;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import c.c.a.a.x0;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class f1 implements c.c.a.a.a2.z, c.c.a.a.m1.t, c.c.a.a.v1.l, c.c.a.a.s1.h, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, x0.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g1 f1998b;

    public f1(g1 g1Var, e1 e1Var) {
        this.f1998b = g1Var;
    }

    @Override // c.c.a.a.m1.t
    public void A(l0 l0Var) {
        Objects.requireNonNull(this.f1998b);
        Iterator<c.c.a.a.m1.t> it = this.f1998b.k.iterator();
        while (it.hasNext()) {
            it.next().A(l0Var);
        }
    }

    @Override // c.c.a.a.a2.z
    public void a(int i, int i2, int i3, float f2) {
        Iterator<c.c.a.a.a2.x> it = this.f1998b.f2008f.iterator();
        while (it.hasNext()) {
            c.c.a.a.a2.x next = it.next();
            if (!this.f1998b.j.contains(next)) {
                next.a(i, i2, i3, f2);
            }
        }
        Iterator<c.c.a.a.a2.z> it2 = this.f1998b.j.iterator();
        while (it2.hasNext()) {
            it2.next().a(i, i2, i3, f2);
        }
    }

    @Override // c.c.a.a.x0.a
    public /* synthetic */ void b(boolean z, int i) {
        w0.d(this, z, i);
    }

    @Override // c.c.a.a.x0.a
    public void c(boolean z) {
        Objects.requireNonNull(this.f1998b);
    }

    @Override // c.c.a.a.m1.t
    public void d(int i, long j, long j2) {
        Iterator<c.c.a.a.m1.t> it = this.f1998b.k.iterator();
        while (it.hasNext()) {
            it.next().d(i, j, j2);
        }
    }

    @Override // c.c.a.a.x0.a
    public /* synthetic */ void e(int i) {
        w0.e(this, i);
    }

    @Override // c.c.a.a.m1.t
    public void f(c.c.a.a.o1.f fVar) {
        Iterator<c.c.a.a.m1.t> it = this.f1998b.k.iterator();
        while (it.hasNext()) {
            it.next().f(fVar);
        }
        Objects.requireNonNull(this.f1998b);
        Objects.requireNonNull(this.f1998b);
        this.f1998b.u = 0;
    }

    @Override // c.c.a.a.a2.z
    public void g(Surface surface) {
        g1 g1Var = this.f1998b;
        if (g1Var.o == surface) {
            Iterator<c.c.a.a.a2.x> it = g1Var.f2008f.iterator();
            while (it.hasNext()) {
                it.next().t();
            }
        }
        Iterator<c.c.a.a.a2.z> it2 = this.f1998b.j.iterator();
        while (it2.hasNext()) {
            it2.next().g(surface);
        }
    }

    @Override // c.c.a.a.m1.t
    public void h(c.c.a.a.o1.f fVar) {
        Objects.requireNonNull(this.f1998b);
        Iterator<c.c.a.a.m1.t> it = this.f1998b.k.iterator();
        while (it.hasNext()) {
            it.next().h(fVar);
        }
    }

    @Override // c.c.a.a.x0.a
    public /* synthetic */ void i(c.c.a.a.u1.s0 s0Var, c.c.a.a.w1.s sVar) {
        w0.j(this, s0Var, sVar);
    }

    @Override // c.c.a.a.a2.z
    public void j(c.c.a.a.o1.f fVar) {
        Iterator<c.c.a.a.a2.z> it = this.f1998b.j.iterator();
        while (it.hasNext()) {
            it.next().j(fVar);
        }
        Objects.requireNonNull(this.f1998b);
        Objects.requireNonNull(this.f1998b);
    }

    @Override // c.c.a.a.m1.t
    public void k(String str, long j, long j2) {
        Iterator<c.c.a.a.m1.t> it = this.f1998b.k.iterator();
        while (it.hasNext()) {
            it.next().k(str, j, j2);
        }
    }

    @Override // c.c.a.a.x0.a
    public /* synthetic */ void l(boolean z) {
        w0.h(this, z);
    }

    @Override // c.c.a.a.a2.z
    public void m(String str, long j, long j2) {
        Iterator<c.c.a.a.a2.z> it = this.f1998b.j.iterator();
        while (it.hasNext()) {
            it.next().m(str, j, j2);
        }
    }

    @Override // c.c.a.a.x0.a
    public /* synthetic */ void n(k1 k1Var, Object obj, int i) {
        w0.i(this, k1Var, obj, i);
    }

    public void o(int i) {
        g1 g1Var = this.f1998b;
        g1Var.M(g1Var.l(), i);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f1998b.J(new Surface(surfaceTexture), true);
        this.f1998b.E(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f1998b.J(null, true);
        this.f1998b.E(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f1998b.E(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // c.c.a.a.x0.a
    public /* synthetic */ void p(u0 u0Var) {
        w0.b(this, u0Var);
    }

    @Override // c.c.a.a.x0.a
    public /* synthetic */ void q(int i) {
        w0.f(this, i);
    }

    @Override // c.c.a.a.s1.h
    public void r(c.c.a.a.s1.c cVar) {
        Iterator<c.c.a.a.s1.h> it = this.f1998b.i.iterator();
        while (it.hasNext()) {
            it.next().r(cVar);
        }
    }

    @Override // c.c.a.a.x0.a
    public /* synthetic */ void s(z zVar) {
        w0.c(this, zVar);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.f1998b.E(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f1998b.J(surfaceHolder.getSurface(), false);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f1998b.J(null, false);
        this.f1998b.E(0, 0);
    }

    @Override // c.c.a.a.x0.a
    public /* synthetic */ void u() {
        w0.g(this);
    }

    @Override // c.c.a.a.a2.z
    public void v(int i, long j) {
        Iterator<c.c.a.a.a2.z> it = this.f1998b.j.iterator();
        while (it.hasNext()) {
            it.next().v(i, j);
        }
    }

    @Override // c.c.a.a.v1.l
    public void w(List<c.c.a.a.v1.b> list) {
        g1 g1Var = this.f1998b;
        g1Var.x = list;
        Iterator<c.c.a.a.v1.l> it = g1Var.h.iterator();
        while (it.hasNext()) {
            it.next().w(list);
        }
    }

    @Override // c.c.a.a.a2.z
    public void x(l0 l0Var) {
        Objects.requireNonNull(this.f1998b);
        Iterator<c.c.a.a.a2.z> it = this.f1998b.j.iterator();
        while (it.hasNext()) {
            it.next().x(l0Var);
        }
    }

    @Override // c.c.a.a.a2.z
    public void y(c.c.a.a.o1.f fVar) {
        Objects.requireNonNull(this.f1998b);
        Iterator<c.c.a.a.a2.z> it = this.f1998b.j.iterator();
        while (it.hasNext()) {
            it.next().y(fVar);
        }
    }

    @Override // c.c.a.a.m1.t
    public void z(int i) {
        g1 g1Var = this.f1998b;
        if (g1Var.u == i) {
            return;
        }
        g1Var.u = i;
        Iterator<c.c.a.a.l1.d> it = g1Var.g.iterator();
        while (it.hasNext()) {
            c.c.a.a.l1.d next = it.next();
            if (!this.f1998b.k.contains(next)) {
                next.z(i);
            }
        }
        Iterator<c.c.a.a.m1.t> it2 = this.f1998b.k.iterator();
        while (it2.hasNext()) {
            it2.next().z(i);
        }
    }
}
