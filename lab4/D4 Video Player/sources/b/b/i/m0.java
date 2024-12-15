package b.b.i;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public class m0 implements PopupWindow.OnDismissListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f737b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n0 f738c;

    public m0(n0 n0Var, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        this.f738c = n0Var;
        this.f737b = onGlobalLayoutListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f738c.I.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f737b);
        }
    }
}
