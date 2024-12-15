package c.c.a.b.d;

import android.view.View;
import b.h.j.u;
import b.h.j.y;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final View f3831a;

    /* renamed from: b, reason: collision with root package name */
    public int f3832b;

    /* renamed from: c, reason: collision with root package name */
    public int f3833c;

    /* renamed from: d, reason: collision with root package name */
    public int f3834d;

    /* renamed from: e, reason: collision with root package name */
    public int f3835e;

    public e(View view) {
        this.f3831a = view;
    }

    public void a() {
        View view = this.f3831a;
        int top = this.f3834d - (view.getTop() - this.f3832b);
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        view.offsetTopAndBottom(top);
        View view2 = this.f3831a;
        view2.offsetLeftAndRight(this.f3835e - (view2.getLeft() - this.f3833c));
    }
}
