package b.b.h.m;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import b.b.h.m.y;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class x {

    /* renamed from: a, reason: collision with root package name */
    public final Context f633a;

    /* renamed from: b, reason: collision with root package name */
    public final l f634b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f635c;

    /* renamed from: d, reason: collision with root package name */
    public final int f636d;

    /* renamed from: e, reason: collision with root package name */
    public final int f637e;

    /* renamed from: f, reason: collision with root package name */
    public View f638f;
    public boolean h;
    public y.a i;
    public v j;
    public PopupWindow.OnDismissListener k;
    public int g = 8388611;
    public final PopupWindow.OnDismissListener l = new w(this);

    public x(Context context, l lVar, View view, boolean z, int i, int i2) {
        this.f633a = context;
        this.f634b = lVar;
        this.f638f = view;
        this.f635c = z;
        this.f636d = i;
        this.f637e = i2;
    }

    public v a() {
        if (this.j == null) {
            Display defaultDisplay = ((WindowManager) this.f633a.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            v hVar = Math.min(point.x, point.y) >= this.f633a.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width) ? new h(this.f633a, this.f638f, this.f636d, this.f637e, this.f635c) : new e0(this.f633a, this.f634b, this.f638f, this.f636d, this.f637e, this.f635c);
            hVar.o(this.f634b);
            hVar.v(this.l);
            hVar.r(this.f638f);
            hVar.l(this.i);
            hVar.s(this.h);
            hVar.t(this.g);
            this.j = hVar;
        }
        return this.j;
    }

    public boolean b() {
        v vVar = this.j;
        return vVar != null && vVar.b();
    }

    public void c() {
        this.j = null;
        PopupWindow.OnDismissListener onDismissListener = this.k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void d(y.a aVar) {
        this.i = aVar;
        v vVar = this.j;
        if (vVar != null) {
            vVar.l(aVar);
        }
    }

    public final void e(int i, int i2, boolean z, boolean z2) {
        v a2 = a();
        a2.w(z2);
        if (z) {
            int i3 = this.g;
            View view = this.f638f;
            WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
            if ((Gravity.getAbsoluteGravity(i3, view.getLayoutDirection()) & 7) == 5) {
                i -= this.f638f.getWidth();
            }
            a2.u(i);
            a2.x(i2);
            int i4 = (int) ((this.f633a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            a2.f631b = new Rect(i - i4, i2 - i4, i + i4, i2 + i4);
        }
        a2.f();
    }

    public boolean f() {
        if (b()) {
            return true;
        }
        if (this.f638f == null) {
            return false;
        }
        e(0, 0, false, false);
        return true;
    }
}
