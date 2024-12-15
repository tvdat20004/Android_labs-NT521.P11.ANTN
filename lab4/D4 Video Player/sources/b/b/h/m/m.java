package b.b.h.m;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import b.b.h.m.y;

/* loaded from: classes.dex */
public class m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, y.a {

    /* renamed from: b, reason: collision with root package name */
    public l f610b;

    /* renamed from: c, reason: collision with root package name */
    public b.b.c.k f611c;

    /* renamed from: d, reason: collision with root package name */
    public j f612d;

    public m(l lVar) {
        this.f610b = lVar;
    }

    @Override // b.b.h.m.y.a
    public void a(l lVar, boolean z) {
        b.b.c.k kVar;
        if ((z || lVar == this.f610b) && (kVar = this.f611c) != null) {
            kVar.dismiss();
        }
    }

    @Override // b.b.h.m.y.a
    public boolean b(l lVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f610b.r(((i) this.f612d.b()).getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        j jVar = this.f612d;
        l lVar = this.f610b;
        y.a aVar = jVar.f598f;
        if (aVar != null) {
            aVar.a(lVar, true);
        }
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f611c.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f611c.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f610b.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f610b.performShortcut(i, keyEvent, 0);
    }
}
