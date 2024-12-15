package b.b.h.m;

import android.widget.PopupWindow;

/* loaded from: classes.dex */
public class w implements PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f632b;

    public w(x xVar) {
        this.f632b = xVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f632b.c();
    }
}
