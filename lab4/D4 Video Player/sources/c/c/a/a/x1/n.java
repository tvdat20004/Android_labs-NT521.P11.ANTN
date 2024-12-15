package c.c.a.a.x1;

import android.view.TextureView;
import android.view.View;
import c.c.a.a.a2.w;
import c.c.a.a.a2.x;
import c.c.a.a.k1;
import c.c.a.a.u0;
import c.c.a.a.u1.s0;
import c.c.a.a.w0;
import c.c.a.a.x0;
import c.c.a.a.z;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.List;

/* loaded from: classes.dex */
public final class n implements x0.a, c.c.a.a.v1.l, x, View.OnLayoutChangeListener, c.c.a.a.x1.v.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f3479b;

    public n(o oVar, m mVar) {
        this.f3479b = oVar;
    }

    @Override // c.c.a.a.a2.x
    public void a(int i, int i2, int i3, float f2) {
        float f3 = (i2 == 0 || i == 0) ? 1.0f : (i * f2) / i2;
        o oVar = this.f3479b;
        View view = oVar.f3482d;
        if (view instanceof TextureView) {
            if (i3 == 90 || i3 == 270) {
                f3 = 1.0f / f3;
            }
            if (oVar.y != 0) {
                view.removeOnLayoutChangeListener(this);
            }
            o oVar2 = this.f3479b;
            oVar2.y = i3;
            if (i3 != 0) {
                oVar2.f3482d.addOnLayoutChangeListener(this);
            }
            o oVar3 = this.f3479b;
            o.b((TextureView) oVar3.f3482d, oVar3.y);
        }
        o oVar4 = this.f3479b;
        AspectRatioFrameLayout aspectRatioFrameLayout = oVar4.f3480b;
        View view2 = oVar4.f3482d;
        if (aspectRatioFrameLayout != null) {
            if (view2 instanceof c.c.a.a.x1.v.k) {
                f3 = 0.0f;
            }
            aspectRatioFrameLayout.setAspectRatio(f3);
        }
    }

    @Override // c.c.a.a.x0.a
    public void b(boolean z, int i) {
        this.f3479b.l();
        this.f3479b.m();
        if (this.f3479b.f()) {
            o oVar = this.f3479b;
            if (oVar.w) {
                oVar.e();
                return;
            }
        }
        this.f3479b.g(false);
    }

    @Override // c.c.a.a.x0.a
    public /* synthetic */ void c(boolean z) {
        w0.a(this, z);
    }

    @Override // c.c.a.a.x0.a
    public void e(int i) {
        if (this.f3479b.f()) {
            o oVar = this.f3479b;
            if (oVar.w) {
                oVar.e();
            }
        }
    }

    @Override // c.c.a.a.x0.a
    public void i(s0 s0Var, c.c.a.a.w1.s sVar) {
        this.f3479b.n(false);
    }

    @Override // c.c.a.a.x0.a
    public /* synthetic */ void l(boolean z) {
        w0.h(this, z);
    }

    @Override // c.c.a.a.x0.a
    public /* synthetic */ void n(k1 k1Var, Object obj, int i) {
        w0.i(this, k1Var, obj, i);
    }

    @Override // c.c.a.a.a2.x
    public /* synthetic */ void o(int i, int i2) {
        w.b(this, i, i2);
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        o.b((TextureView) view, this.f3479b.y);
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
    public /* synthetic */ void s(z zVar) {
        w0.c(this, zVar);
    }

    @Override // c.c.a.a.a2.x
    public void t() {
        View view = this.f3479b.f3481c;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // c.c.a.a.x0.a
    public /* synthetic */ void u() {
        w0.g(this);
    }

    @Override // c.c.a.a.v1.l
    public void w(List<c.c.a.a.v1.b> list) {
        SubtitleView subtitleView = this.f3479b.f3484f;
        if (subtitleView != null) {
            subtitleView.setCues(list);
        }
    }
}
