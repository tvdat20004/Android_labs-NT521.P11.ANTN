package c.c.a.b.f;

import android.view.View;
import b.h.j.k0.f;
import b.h.j.k0.g;
import b.h.j.u;
import b.h.j.y;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SwipeDismissBehavior f3846a;

    public a(SwipeDismissBehavior swipeDismissBehavior) {
        this.f3846a = swipeDismissBehavior;
    }

    @Override // b.h.j.k0.g
    public boolean a(View view, f fVar) {
        boolean z = false;
        if (!this.f3846a.B(view)) {
            return false;
        }
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = this.f3846a.f4180c;
        if ((i == 0 && z2) || (i == 1 && !z2)) {
            z = true;
        }
        int width = view.getWidth();
        if (z) {
            width = -width;
        }
        view.offsetLeftAndRight(width);
        view.setAlpha(0.0f);
        Objects.requireNonNull(this.f3846a);
        return true;
    }
}
