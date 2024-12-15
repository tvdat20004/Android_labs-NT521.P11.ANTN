package b.b.i;

import android.view.ViewParent;

/* loaded from: classes.dex */
public class i1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f704b;

    public i1(k1 k1Var) {
        this.f704b = k1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ViewParent parent = this.f704b.f718e.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }
}
