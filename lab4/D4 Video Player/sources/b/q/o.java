package b.q;

import android.R;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.RecyclerView;
import b.h.j.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX WARN: Unexpected interfaces in signature: [java.lang.Object] */
/* loaded from: classes.dex */
public class o extends RecyclerView.e<t> implements Preference.c {

    /* renamed from: c, reason: collision with root package name */
    public PreferenceGroup f1566c;

    /* renamed from: d, reason: collision with root package name */
    public List<Preference> f1567d;

    /* renamed from: e, reason: collision with root package name */
    public List<Preference> f1568e;

    /* renamed from: f, reason: collision with root package name */
    public List<n> f1569f;
    public Runnable h = new l(this);
    public Handler g = new Handler();

    public o(PreferenceGroup preferenceGroup) {
        this.f1566c = preferenceGroup;
        this.f1566c.G = this;
        this.f1567d = new ArrayList();
        this.f1568e = new ArrayList();
        this.f1569f = new ArrayList();
        PreferenceGroup preferenceGroup2 = this.f1566c;
        f(preferenceGroup2 instanceof PreferenceScreen ? ((PreferenceScreen) preferenceGroup2).T : true);
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int a() {
        return this.f1568e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public long b(int i) {
        if (this.f314b) {
            return i(i).d();
        }
        return -1L;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public int c(int i) {
        n nVar = new n(i(i));
        int indexOf = this.f1569f.indexOf(nVar);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = this.f1569f.size();
        this.f1569f.add(nVar);
        return size;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public void d(t tVar, int i) {
        i(i).q(tVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public t e(ViewGroup viewGroup, int i) {
        n nVar = this.f1569f.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, v.f1584a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = b.b.d.a.a.a(viewGroup.getContext(), R.drawable.list_selector_background);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(nVar.f1563a, viewGroup, false);
        if (inflate.getBackground() == null) {
            WeakHashMap<View, y> weakHashMap = b.h.j.u.f1311a;
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.widget_frame);
        if (viewGroup2 != null) {
            int i2 = nVar.f1564b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new t(inflate);
    }

    public final List<Preference> g(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int J = preferenceGroup.J();
        int i = 0;
        for (int i2 = 0; i2 < J; i2++) {
            Preference I = preferenceGroup.I(i2);
            if (I.w) {
                if (!j(preferenceGroup) || i < preferenceGroup.S) {
                    arrayList.add(I);
                } else {
                    arrayList2.add(I);
                }
                if (I instanceof PreferenceGroup) {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) I;
                    if (!preferenceGroup2.K()) {
                        continue;
                    } else {
                        if (j(preferenceGroup) && j(preferenceGroup2)) {
                            throw new IllegalStateException("Nesting an expandable group inside of another expandable group is not supported!");
                        }
                        for (Preference preference : g(preferenceGroup2)) {
                            if (!j(preferenceGroup) || i < preferenceGroup.S) {
                                arrayList.add(preference);
                            } else {
                                arrayList2.add(preference);
                            }
                            i++;
                        }
                    }
                } else {
                    i++;
                }
            }
        }
        if (j(preferenceGroup) && i > preferenceGroup.S) {
            c cVar = new c(preferenceGroup.f259b, arrayList2, preferenceGroup.f261d);
            cVar.f263f = new m(this, preferenceGroup);
            arrayList.add(cVar);
        }
        return arrayList;
    }

    public final void h(List<Preference> list, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.O);
        }
        int J = preferenceGroup.J();
        for (int i = 0; i < J; i++) {
            Preference I = preferenceGroup.I(i);
            list.add(I);
            n nVar = new n(I);
            if (!this.f1569f.contains(nVar)) {
                this.f1569f.add(nVar);
            }
            if (I instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) I;
                if (preferenceGroup2.K()) {
                    h(list, preferenceGroup2);
                }
            }
            I.G = this;
        }
    }

    public Preference i(int i) {
        if (i < 0 || i >= a()) {
            return null;
        }
        return this.f1568e.get(i);
    }

    public final boolean j(PreferenceGroup preferenceGroup) {
        return preferenceGroup.S != Integer.MAX_VALUE;
    }

    public void k() {
        Iterator<Preference> it = this.f1567d.iterator();
        while (it.hasNext()) {
            it.next().G = null;
        }
        ArrayList arrayList = new ArrayList(this.f1567d.size());
        this.f1567d = arrayList;
        h(arrayList, this.f1566c);
        this.f1568e = g(this.f1566c);
        q qVar = this.f1566c.f260c;
        this.f313a.b();
        Iterator<Preference> it2 = this.f1567d.iterator();
        while (it2.hasNext()) {
            Objects.requireNonNull(it2.next());
        }
    }
}
