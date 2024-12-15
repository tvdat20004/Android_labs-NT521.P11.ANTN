package b.b.h.m;

import android.content.Context;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* loaded from: classes.dex */
public abstract class p {

    /* renamed from: a, reason: collision with root package name */
    public n f620a;

    /* renamed from: b, reason: collision with root package name */
    public final ActionProvider f621b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u f622c;

    public p(u uVar, Context context, ActionProvider actionProvider) {
        this.f622c = uVar;
        this.f621b = actionProvider;
    }

    public abstract /* bridge */ /* synthetic */ boolean a();

    public abstract View b(MenuItem menuItem);

    public abstract /* bridge */ /* synthetic */ boolean c();

    public abstract void d(n nVar);
}
