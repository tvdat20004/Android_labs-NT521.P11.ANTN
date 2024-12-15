package b.h.j;

import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class t {

    /* renamed from: d, reason: collision with root package name */
    public static final ArrayList<WeakReference<View>> f1307d = new ArrayList<>();

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap<View, Boolean> f1308a = null;

    /* renamed from: b, reason: collision with root package name */
    public SparseArray<WeakReference<View>> f1309b = null;

    /* renamed from: c, reason: collision with root package name */
    public WeakReference<KeyEvent> f1310c = null;

    public final View a(View view, KeyEvent keyEvent) {
        WeakHashMap<View, Boolean> weakHashMap = this.f1308a;
        if (weakHashMap != null && weakHashMap.containsKey(view)) {
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                    View a2 = a(viewGroup.getChildAt(childCount), keyEvent);
                    if (a2 != null) {
                        return a2;
                    }
                }
            }
            if (b(view, keyEvent)) {
                return view;
            }
        }
        return null;
    }

    public final boolean b(View view, KeyEvent keyEvent) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            return false;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (((s) arrayList.get(size)).a(view, keyEvent)) {
                return true;
            }
        }
        return false;
    }
}
