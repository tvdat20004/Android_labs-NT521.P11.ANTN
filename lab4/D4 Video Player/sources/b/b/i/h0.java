package b.b.i;

import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public class h0 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r0 f693b;

    public h0(r0 r0Var) {
        this.f693b = r0Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        if (!this.f693b.getInternalPopup().b()) {
            this.f693b.b();
        }
        ViewTreeObserver viewTreeObserver = this.f693b.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(this);
        }
    }
}
