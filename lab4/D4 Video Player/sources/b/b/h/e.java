package b.b.h;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import b.b.h.m.l;
import b.b.i.m;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class e extends b implements l.a {

    /* renamed from: d, reason: collision with root package name */
    public Context f530d;

    /* renamed from: e, reason: collision with root package name */
    public ActionBarContextView f531e;

    /* renamed from: f, reason: collision with root package name */
    public a f532f;
    public WeakReference<View> g;
    public boolean h;
    public b.b.h.m.l i;

    public e(Context context, ActionBarContextView actionBarContextView, a aVar, boolean z) {
        this.f530d = context;
        this.f531e = actionBarContextView;
        this.f532f = aVar;
        b.b.h.m.l lVar = new b.b.h.m.l(actionBarContextView.getContext());
        lVar.l = 1;
        this.i = lVar;
        lVar.f608e = this;
    }

    @Override // b.b.h.m.l.a
    public boolean a(b.b.h.m.l lVar, MenuItem menuItem) {
        return this.f532f.b(this, menuItem);
    }

    @Override // b.b.h.m.l.a
    public void b(b.b.h.m.l lVar) {
        i();
        m mVar = this.f531e.f646e;
        if (mVar != null) {
            mVar.q();
        }
    }

    @Override // b.b.h.b
    public void c() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.f531e.sendAccessibilityEvent(32);
        this.f532f.d(this);
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
        return this.i;
    }

    @Override // b.b.h.b
    public MenuInflater f() {
        return new j(this.f531e.getContext());
    }

    @Override // b.b.h.b
    public CharSequence g() {
        return this.f531e.getSubtitle();
    }

    @Override // b.b.h.b
    public CharSequence h() {
        return this.f531e.getTitle();
    }

    @Override // b.b.h.b
    public void i() {
        this.f532f.a(this, this.i);
    }

    @Override // b.b.h.b
    public boolean j() {
        return this.f531e.s;
    }

    @Override // b.b.h.b
    public void k(View view) {
        this.f531e.setCustomView(view);
        this.g = view != null ? new WeakReference<>(view) : null;
    }

    @Override // b.b.h.b
    public void l(int i) {
        this.f531e.setSubtitle(this.f530d.getString(i));
    }

    @Override // b.b.h.b
    public void m(CharSequence charSequence) {
        this.f531e.setSubtitle(charSequence);
    }

    @Override // b.b.h.b
    public void n(int i) {
        this.f531e.setTitle(this.f530d.getString(i));
    }

    @Override // b.b.h.b
    public void o(CharSequence charSequence) {
        this.f531e.setTitle(charSequence);
    }

    @Override // b.b.h.b
    public void p(boolean z) {
        this.f524c = z;
        this.f531e.setTitleOptional(z);
    }
}
