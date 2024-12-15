package b.l.b;

import android.transition.Transition;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class x0 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1503b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1504c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1505d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1506e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1507f;
    public final /* synthetic */ a1 g;

    public x0(a1 a1Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.g = a1Var;
        this.f1502a = obj;
        this.f1503b = arrayList;
        this.f1504c = obj2;
        this.f1505d = arrayList2;
        this.f1506e = obj3;
        this.f1507f = arrayList3;
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public void onTransitionStart(Transition transition) {
        Object obj = this.f1502a;
        if (obj != null) {
            this.g.n(obj, this.f1503b, null);
        }
        Object obj2 = this.f1504c;
        if (obj2 != null) {
            this.g.n(obj2, this.f1505d, null);
        }
        Object obj3 = this.f1506e;
        if (obj3 != null) {
            this.g.n(obj3, this.f1507f, null);
        }
    }
}
