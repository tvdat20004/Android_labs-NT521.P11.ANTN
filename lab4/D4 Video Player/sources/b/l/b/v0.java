package b.l.b;

import android.graphics.Rect;
import android.transition.Transition;

/* loaded from: classes.dex */
public class v0 extends Transition.EpicenterCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rect f1496a;

    public v0(a1 a1Var, Rect rect) {
        this.f1496a = rect;
    }

    @Override // android.transition.Transition.EpicenterCallback
    public Rect onGetEpicenter(Transition transition) {
        return this.f1496a;
    }
}
