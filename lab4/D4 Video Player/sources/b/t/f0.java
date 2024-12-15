package b.t;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public abstract class f0 {

    /* renamed from: a, reason: collision with root package name */
    public static b0 f1736a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static ThreadLocal<WeakReference<b.e.b<ViewGroup, ArrayList<b0>>>> f1737b = new ThreadLocal<>();

    /* renamed from: c, reason: collision with root package name */
    public static ArrayList<ViewGroup> f1738c = new ArrayList<>();

    public static void a(ViewGroup viewGroup, b0 b0Var) {
        if (f1738c.contains(viewGroup)) {
            return;
        }
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        if (viewGroup.isLaidOut()) {
            f1738c.add(viewGroup);
            if (b0Var == null) {
                b0Var = f1736a;
            }
            b0 clone = b0Var.clone();
            ArrayList<b0> orDefault = b().getOrDefault(viewGroup, null);
            if (orDefault != null && orDefault.size() > 0) {
                Iterator<b0> it = orDefault.iterator();
                while (it.hasNext()) {
                    it.next().u(viewGroup);
                }
            }
            if (clone != null) {
                clone.h(viewGroup, true);
            }
            viewGroup.setTag(R.id.transition_current_scene, null);
            if (clone != null) {
                e0 e0Var = new e0(clone, viewGroup);
                viewGroup.addOnAttachStateChangeListener(e0Var);
                viewGroup.getViewTreeObserver().addOnPreDrawListener(e0Var);
            }
        }
    }

    public static b.e.b<ViewGroup, ArrayList<b0>> b() {
        b.e.b<ViewGroup, ArrayList<b0>> bVar;
        WeakReference<b.e.b<ViewGroup, ArrayList<b0>>> weakReference = f1737b.get();
        if (weakReference != null && (bVar = weakReference.get()) != null) {
            return bVar;
        }
        b.e.b<ViewGroup, ArrayList<b0>> bVar2 = new b.e.b<>();
        f1737b.set(new WeakReference<>(bVar2));
        return bVar2;
    }
}
