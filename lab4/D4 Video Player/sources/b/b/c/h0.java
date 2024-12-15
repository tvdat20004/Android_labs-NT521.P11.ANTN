package b.b.c;

import android.app.Dialog;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public abstract class h0 extends Dialog implements m {

    /* renamed from: b, reason: collision with root package name */
    public n f442b;

    /* renamed from: c, reason: collision with root package name */
    public final b.h.j.d f443c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h0(android.content.Context r5, int r6) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2130903318(0x7f030116, float:1.741345E38)
            if (r6 != 0) goto L15
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L16
        L15:
            r2 = r6
        L16:
            r4.<init>(r5, r2)
            b.b.c.g0 r2 = new b.b.c.g0
            r2.<init>(r4)
            r4.f443c = r2
            b.b.c.n r2 = r4.a()
            if (r6 != 0) goto L34
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L34:
            r5 = r2
            b.b.c.f0 r5 = (b.b.c.f0) r5
            r5.N = r6
            r5 = 0
            r2.f(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.c.h0.<init>(android.content.Context, int):void");
    }

    public n a() {
        if (this.f442b == null) {
            b.e.d<WeakReference<n>> dVar = n.f467b;
            this.f442b = new f0(getContext(), getWindow(), this, this);
        }
        return this.f442b;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().c(view, layoutParams);
    }

    public boolean b(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // b.b.c.m
    public void d(b.b.h.b bVar) {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        a().g();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return b.h.j.e.b(this.f443c, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // b.b.c.m
    public void f(b.b.h.b bVar) {
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        f0 f0Var = (f0) a();
        f0Var.y();
        return (T) f0Var.f431f.findViewById(i);
    }

    @Override // b.b.c.m
    public b.b.h.b h(b.b.h.a aVar) {
        return null;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        a().e();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        a().d();
        super.onCreate(bundle);
        a().f(bundle);
    }

    @Override // android.app.Dialog
    public void onStop() {
        super.onStop();
        a().h();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        a().k(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        a().l(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        a().m(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        a().n(getContext().getString(i));
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        a().n(charSequence);
    }
}
