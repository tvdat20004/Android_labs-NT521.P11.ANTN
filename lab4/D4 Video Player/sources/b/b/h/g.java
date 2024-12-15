package b.b.h;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import b.b.h.m.a0;

/* loaded from: classes.dex */
public class g extends ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final Context f537a;

    /* renamed from: b, reason: collision with root package name */
    public final b f538b;

    public g(Context context, b bVar) {
        this.f537a = context;
        this.f538b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f538b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f538b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new a0(this.f537a, (b.h.e.a.a) this.f538b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f538b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f538b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f538b.f523b;
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f538b.h();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f538b.f524c;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f538b.i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f538b.j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f538b.k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i) {
        this.f538b.l(i);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f538b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f538b.f523b = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(int i) {
        this.f538b.n(i);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f538b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z) {
        this.f538b.p(z);
    }
}
