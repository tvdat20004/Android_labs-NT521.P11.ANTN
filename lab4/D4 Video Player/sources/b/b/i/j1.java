package b.b.i;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes.dex */
public class j1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1 f709b;

    public j1(k1 k1Var) {
        this.f709b = k1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        k1 k1Var = this.f709b;
        k1Var.a();
        View view = k1Var.f718e;
        if (view.isEnabled() && !view.isLongClickable() && k1Var.c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(obtain);
            obtain.recycle();
            k1Var.h = true;
        }
    }
}
