package b.l.b;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
public class z0 extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rect f1518a;

    public z0(a1 a1Var, Rect rect) {
        this.f1518a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public Rect onGetEpicenter(Transition transition) {
        Rect rect = this.f1518a;
        if (rect == null || rect.isEmpty()) {
            return null;
        }
        return this.f1518a;
    }
}