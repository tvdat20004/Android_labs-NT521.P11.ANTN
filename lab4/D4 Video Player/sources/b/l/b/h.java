package b.l.b;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;

/* JADX WARN: Incorrect class signature: super class is equals to this class */
/* loaded from: classes.dex */
public class h extends o implements b.n.s, b.a.e {

    /* renamed from: b, reason: collision with root package name */
    public final Activity f1410b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f1411c;

    /* renamed from: d, reason: collision with root package name */
    public final Handler f1412d;

    /* renamed from: e, reason: collision with root package name */
    public final z f1413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ b.b.c.l f1414f;

    public h(b.b.c.l lVar) {
        this.f1414f = lVar;
        Handler handler = new Handler();
        this.f1413e = new d0();
        this.f1410b = lVar;
        b.h.b.h.e(lVar, "context == null");
        this.f1411c = lVar;
        b.h.b.h.e(handler, "handler == null");
        this.f1412d = handler;
    }

    @Override // b.a.e
    public OnBackPressedDispatcher a() {
        return this.f1414f.f36f;
    }

    @Override // b.l.b.o
    public View c(int i) {
        return this.f1414f.findViewById(i);
    }

    @Override // b.l.b.o
    public boolean d() {
        Window window = this.f1414f.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // b.n.s
    public b.n.r e() {
        return this.f1414f.e();
    }

    @Override // b.n.h
    public b.n.e g() {
        return this.f1414f.h;
    }
}
