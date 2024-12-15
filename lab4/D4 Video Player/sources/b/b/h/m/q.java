package b.b.h.m;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public class q extends p implements ActionProvider.VisibilityListener {

    /* renamed from: d, reason: collision with root package name */
    public n f623d;

    public q(u uVar, Context context, ActionProvider actionProvider) {
        super(uVar, context, actionProvider);
    }

    @Override // b.b.h.m.p
    public boolean a() {
        return this.f621b.isVisible();
    }

    @Override // b.b.h.m.p
    public View b(MenuItem menuItem) {
        return this.f621b.onCreateActionView(menuItem);
    }

    @Override // b.b.h.m.p
    public boolean c() {
        return this.f621b.overridesItemVisibility();
    }

    @Override // b.b.h.m.p
    public void d(n nVar) {
        this.f623d = nVar;
        this.f621b.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public void onActionProviderVisibilityChanged(boolean z) {
        n nVar = this.f623d;
        if (nVar != null) {
            l lVar = nVar.f613a.n;
            lVar.h = true;
            lVar.q(true);
        }
    }
}
