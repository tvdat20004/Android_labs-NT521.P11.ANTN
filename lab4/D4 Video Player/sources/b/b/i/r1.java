package b.b.i;

import android.view.View;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class r1 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s1 f778b;

    public r1(s1 s1Var) {
        this.f778b = s1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        g1 g1Var = this.f778b.f790d;
        if (g1Var != null) {
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            if (!g1Var.isAttachedToWindow() || this.f778b.f790d.getCount() <= this.f778b.f790d.getChildCount()) {
                return;
            }
            int childCount = this.f778b.f790d.getChildCount();
            s1 s1Var = this.f778b;
            if (childCount <= s1Var.n) {
                s1Var.A.setInputMethodMode(2);
                this.f778b.f();
            }
        }
    }
}
