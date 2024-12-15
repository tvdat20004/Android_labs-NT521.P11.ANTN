package b.b.i;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class t0 extends b.h.c.a.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ WeakReference f806c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u0 f807d;

    public t0(u0 u0Var, int i, int i2, WeakReference weakReference) {
        this.f807d = u0Var;
        this.f804a = i;
        this.f805b = i2;
        this.f806c = weakReference;
    }

    @Override // b.h.c.a.i
    public void c(int i) {
    }

    @Override // b.h.c.a.i
    public void d(Typeface typeface) {
        int i;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.f804a) != -1) {
            typeface = Typeface.create(typeface, i, (this.f805b & 2) != 0);
        }
        u0 u0Var = this.f807d;
        WeakReference weakReference = this.f806c;
        if (u0Var.m) {
            u0Var.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                textView.setTypeface(typeface, u0Var.j);
            }
        }
    }
}
