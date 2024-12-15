package b.b.i;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public class q1 implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f769b;

    public q1(s1 s1Var) {
        this.f769b = s1Var;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        PopupWindow popupWindow;
        int action = motionEvent.getAction();
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        if (action == 0 && (popupWindow = this.f769b.A) != null && popupWindow.isShowing() && x >= 0 && x < this.f769b.A.getWidth() && y >= 0 && y < this.f769b.A.getHeight()) {
            s1 s1Var = this.f769b;
            s1Var.w.postDelayed(s1Var.s, 250L);
            return false;
        }
        if (action != 1) {
            return false;
        }
        s1 s1Var2 = this.f769b;
        s1Var2.w.removeCallbacks(s1Var2.s);
        return false;
    }
}
