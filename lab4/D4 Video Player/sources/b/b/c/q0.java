package b.b.c;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import b.b.h.m.l;
import b.b.i.p2;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class q0 extends b.b.h.b implements l.a {

    /* renamed from: d, reason: collision with root package name */
    public final Context f475d;

    /* renamed from: e, reason: collision with root package name */
    public final b.b.h.m.l f476e;

    /* renamed from: f, reason: collision with root package name */
    public b.b.h.a f477f;
    public WeakReference<View> g;
    public final /* synthetic */ r0 h;

    public q0(r0 r0Var, Context context, b.b.h.a aVar) {
        this.h = r0Var;
        this.f475d = context;
        this.f477f = aVar;
        b.b.h.m.l lVar = new b.b.h.m.l(context);
        lVar.l = 1;
        this.f476e = lVar;
        lVar.f608e = this;
    }

    @Override // b.b.h.m.l.a
    public boolean a(b.b.h.m.l lVar, MenuItem menuItem) {
        b.b.h.a aVar = this.f477f;
        if (aVar != null) {
            return aVar.b(this, menuItem);
        }
        return false;
    }

    @Override // b.b.h.m.l.a
    public void b(b.b.h.m.l lVar) {
        if (this.f477f == null) {
            return;
        }
        i();
        b.b.i.m mVar = this.h.f484f.f646e;
        if (mVar != null) {
            mVar.q();
        }
    }

    @Override // b.b.h.b
    public void c() {
        r0 r0Var = this.h;
        if (r0Var.i != this) {
            return;
        }
        if (!r0Var.q) {
            this.f477f.d(this);
        } else {
            r0Var.j = this;
            r0Var.k = this.f477f;
        }
        this.f477f = null;
        this.h.e(false);
        ActionBarContextView actionBarContextView = this.h.f484f;
        if (actionBarContextView.l == null) {
            actionBarContextView.h();
        }
        ((p2) this.h.f483e).f760a.sendAccessibilityEvent(32);
        r0 r0Var2 = this.h;
        r0Var2.f481c.setHideOnContentScrollEnabled(r0Var2.v);
        this.h.i = null;
    }

    @Override // b.b.h.b
    public View d() {
        WeakReference<View> weakReference = this.g;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // b.b.h.b
    public Menu e() {
        return this.f476e;
    }

    @Override // b.b.h.b
    public MenuInflater f() {
        return new b.b.h.j(this.f475d);
    }

    @Override // b.b.h.b
    public CharSequence g() {
        return this.h.f484f.getSubtitle();
    }

    @Override // b.b.h.b
    public CharSequence h() {
        return this.h.f484f.getTitle();
    }

    @Override // b.b.h.b
    public void i() {
        if (this.h.i != this) {
            return;
        }
        this.f476e.A();
        try {
            this.f477f.a(this, this.f476e);
        } finally {
            this.f476e.z();
        }
    }

    @Override // b.b.h.b
    public boolean j() {
        return this.h.f484f.s;
    }

    @Override // b.b.h.b
    public void k(View view) {
        this.h.f484f.setCustomView(view);
        this.g = new WeakReference<>(view);
    }

    @Override // b.b.h.b
    public void l(int i) {
        this.h.f484f.setSubtitle(this.h.f479a.getResources().getString(i));
    }

    @Override // b.b.h.b
    public void m(CharSequence charSequence) {
        this.h.f484f.setSubtitle(charSequence);
    }

    @Override // b.b.h.b
    public void n(int i) {
        this.h.f484f.setTitle(this.h.f479a.getResources().getString(i));
    }

    @Override // b.b.h.b
    public void o(CharSequence charSequence) {
        this.h.f484f.setTitle(charSequence);
    }

    @Override // b.b.h.b
    public void p(boolean z) {
        this.f524c = z;
        this.h.f484f.setTitleOptional(z);
    }
}
