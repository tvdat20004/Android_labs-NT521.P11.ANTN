package b.h.j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import b.h.j.k0.b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap<View, y> f1311a;

    /* renamed from: b, reason: collision with root package name */
    public static Field f1312b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f1313c;

    static {
        new AtomicInteger(1);
        f1311a = null;
        f1313c = false;
        new WeakHashMap();
    }

    public static y a(View view) {
        if (f1311a == null) {
            f1311a = new WeakHashMap<>();
        }
        y yVar = f1311a.get(view);
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(view);
        f1311a.put(view, yVar2);
        return yVar2;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList<WeakReference<View>> arrayList = t.f1307d;
        t tVar = (t) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (tVar == null) {
            tVar = new t();
            view.setTag(R.id.tag_unhandled_key_event_manager, tVar);
        }
        if (keyEvent.getAction() == 0) {
            Boolean bool = Boolean.TRUE;
            WeakHashMap<View, Boolean> weakHashMap = tVar.f1308a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList<WeakReference<View>> arrayList2 = t.f1307d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (tVar.f1308a == null) {
                        tVar.f1308a = new WeakHashMap<>();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList<WeakReference<View>> arrayList3 = t.f1307d;
                        View view2 = arrayList3.get(size).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            tVar.f1308a.put(view2, bool);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                tVar.f1308a.put((View) parent, bool);
                            }
                        }
                    }
                }
            }
        }
        View a2 = tVar.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (tVar.f1309b == null) {
                    tVar.f1309b = new SparseArray<>();
                }
                tVar.f1309b.put(keyCode, new WeakReference<>(a2));
            }
        }
        return a2 != null;
    }

    public static b c(View view) {
        View.AccessibilityDelegate d2 = d(view);
        if (d2 == null) {
            return null;
        }
        return d2 instanceof a ? ((a) d2).f1252a : new b(d2);
    }

    public static View.AccessibilityDelegate d(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return view.getAccessibilityDelegate();
        }
        if (f1313c) {
            return null;
        }
        if (f1312b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f1312b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f1313c = true;
                return null;
            }
        }
        Object obj = f1312b.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static void e(View view, int i) {
        if (((AccessibilityManager) view.getContext().getSystemService("accessibility")).isEnabled()) {
            boolean z = new p(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).c(view) != null;
            if (view.getAccessibilityLiveRegion() != 0 || (z && view.getVisibility() == 0)) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e2);
                }
            }
        }
    }

    public static void f(int i, View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList);
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((b.a) arrayList.get(i2)).a() == i) {
                arrayList.remove(i2);
                return;
            }
        }
    }

    public static void g(View view, b.a aVar, CharSequence charSequence, b.h.j.k0.g gVar) {
        b.a aVar2 = new b.a(null, aVar.f1292b, null, gVar, aVar.f1293c);
        b c2 = c(view);
        if (c2 == null) {
            c2 = new b();
        }
        i(view, c2);
        f(aVar2.a(), view);
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList);
        }
        arrayList.add(aVar2);
        e(view, 0);
    }

    public static void h(View view, @SuppressLint({"ContextFirst"}) Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
        }
    }

    public static void i(View view, b bVar) {
        if (bVar == null && (d(view) instanceof a)) {
            bVar = new b();
        }
        view.setAccessibilityDelegate(bVar == null ? null : bVar.f1255b);
    }

    public static void j(View view, k kVar) {
        if (kVar == null) {
            view.setOnApplyWindowInsetsListener(null);
        } else {
            view.setOnApplyWindowInsetsListener(new n(kVar));
        }
    }
}
