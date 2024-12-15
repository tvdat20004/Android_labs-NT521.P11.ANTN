package b.b.c;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: b, reason: collision with root package name */
    public static final b.e.d<WeakReference<n>> f467b = new b.e.d<>();

    /* renamed from: c, reason: collision with root package name */
    public static final Object f468c = new Object();

    public static void i(n nVar) {
        synchronized (f468c) {
            Iterator<WeakReference<n>> it = f467b.iterator();
            while (it.hasNext()) {
                n nVar2 = it.next().get();
                if (nVar2 == nVar || nVar2 == null) {
                    it.remove();
                }
            }
        }
    }

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void d();

    public abstract void e();

    public abstract void f(Bundle bundle);

    public abstract void g();

    public abstract void h();

    public abstract boolean j(int i);

    public abstract void k(int i);

    public abstract void l(View view);

    public abstract void m(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void n(CharSequence charSequence);
}
