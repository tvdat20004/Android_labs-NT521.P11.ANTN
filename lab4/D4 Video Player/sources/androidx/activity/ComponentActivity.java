package androidx.activity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import b.a.e;
import b.h.b.i;
import b.n.e;
import b.n.f;
import b.n.h;
import b.n.j;
import b.n.o;
import b.n.r;
import b.n.s;
import b.s.a;
import b.s.b;
import b.s.c;

/* loaded from: classes.dex */
public abstract class ComponentActivity extends i implements h, s, c, e {

    /* renamed from: c, reason: collision with root package name */
    public final j f33c;

    /* renamed from: d, reason: collision with root package name */
    public final b f34d;

    /* renamed from: e, reason: collision with root package name */
    public r f35e;

    /* renamed from: f, reason: collision with root package name */
    public final OnBackPressedDispatcher f36f;

    public ComponentActivity() {
        j jVar = new j(this);
        this.f33c = jVar;
        this.f34d = new b(this);
        this.f36f = new OnBackPressedDispatcher(new b.a.b(this));
        int i = Build.VERSION.SDK_INT;
        jVar.a(new f() { // from class: androidx.activity.ComponentActivity.2
            @Override // b.n.f
            public void d(h hVar, e.a aVar) {
                if (aVar == e.a.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View peekDecorView = window != null ? window.peekDecorView() : null;
                    if (peekDecorView != null) {
                        peekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        jVar.a(new f() { // from class: androidx.activity.ComponentActivity.3
            @Override // b.n.f
            public void d(h hVar, e.a aVar) {
                if (aVar != e.a.ON_DESTROY || ComponentActivity.this.isChangingConfigurations()) {
                    return;
                }
                ComponentActivity.this.e().a();
            }
        });
        if (i <= 23) {
            jVar.a(new ImmLeaksCleaner(this));
        }
    }

    @Override // b.a.e
    public final OnBackPressedDispatcher a() {
        return this.f36f;
    }

    @Override // b.s.c
    public final a b() {
        return this.f34d.f1724b;
    }

    @Override // b.n.s
    public r e() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.f35e == null) {
            b.a.c cVar = (b.a.c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this.f35e = cVar.f395a;
            }
            if (this.f35e == null) {
                this.f35e = new r();
            }
        }
        return this.f35e;
    }

    @Override // b.n.h
    public b.n.e g() {
        return this.f33c;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        this.f36f.a();
    }

    @Override // b.h.b.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f34d.a(bundle);
        o.c(this);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        b.a.c cVar;
        r rVar = this.f35e;
        if (rVar == null && (cVar = (b.a.c) getLastNonConfigurationInstance()) != null) {
            rVar = cVar.f395a;
        }
        if (rVar == null) {
            return null;
        }
        b.a.c cVar2 = new b.a.c();
        cVar2.f395a = rVar;
        return cVar2;
    }

    @Override // b.h.b.i, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        j jVar = this.f33c;
        if (jVar instanceof j) {
            jVar.f(e.b.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.f34d.b(bundle);
    }
}
