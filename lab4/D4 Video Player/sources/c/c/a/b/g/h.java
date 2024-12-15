package c.c.a.b.g;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import b.b.h.m.f0;
import b.b.h.m.l;
import b.b.h.m.o;
import b.b.h.m.y;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class h implements y {

    /* renamed from: b, reason: collision with root package name */
    public l f3861b;

    /* renamed from: c, reason: collision with root package name */
    public e f3862c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f3863d = false;

    /* renamed from: e, reason: collision with root package name */
    public int f3864e;

    @Override // b.b.h.m.y
    public void a(l lVar, boolean z) {
    }

    @Override // b.b.h.m.y
    public int c() {
        return this.f3864e;
    }

    @Override // b.b.h.m.y
    public boolean d() {
        return false;
    }

    @Override // b.b.h.m.y
    public Parcelable e() {
        g gVar = new g();
        gVar.f3859b = this.f3862c.getSelectedItemId();
        SparseArray<c.c.a.b.e.c> badgeDrawables = this.f3862c.getBadgeDrawables();
        c.c.a.b.p.i iVar = new c.c.a.b.p.i();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int keyAt = badgeDrawables.keyAt(i);
            c.c.a.b.e.c valueAt = badgeDrawables.valueAt(i);
            if (valueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            iVar.put(keyAt, valueAt.i);
        }
        gVar.f3860c = iVar;
        return gVar;
    }

    @Override // b.b.h.m.y
    public void g(Context context, l lVar) {
        this.f3861b = lVar;
        this.f3862c.z = lVar;
    }

    @Override // b.b.h.m.y
    public void h(Parcelable parcelable) {
        if (parcelable instanceof g) {
            e eVar = this.f3862c;
            g gVar = (g) parcelable;
            int i = gVar.f3859b;
            int size = eVar.z.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = eVar.z.getItem(i2);
                if (i == item.getItemId()) {
                    eVar.m = i;
                    eVar.n = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.f3862c.getContext();
            c.c.a.b.p.i iVar = gVar.f3860c;
            SparseArray<c.c.a.b.e.c> sparseArray = new SparseArray<>(iVar.size());
            for (int i3 = 0; i3 < iVar.size(); i3++) {
                int keyAt = iVar.keyAt(i3);
                c.c.a.b.e.b bVar = (c.c.a.b.e.b) iVar.valueAt(i3);
                if (bVar == null) {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
                c.c.a.b.e.c cVar = new c.c.a.b.e.c(context);
                int i4 = bVar.f3840f;
                c.c.a.b.e.b bVar2 = cVar.i;
                if (bVar2.f3840f != i4) {
                    bVar2.f3840f = i4;
                    cVar.l = ((int) Math.pow(10.0d, i4 - 1.0d)) - 1;
                    cVar.f3843d.f3974d = true;
                    cVar.e();
                    cVar.invalidateSelf();
                }
                int i5 = bVar.f3839e;
                if (i5 != -1) {
                    int max = Math.max(0, i5);
                    c.c.a.b.e.b bVar3 = cVar.i;
                    if (bVar3.f3839e != max) {
                        bVar3.f3839e = max;
                        cVar.f3843d.f3974d = true;
                        cVar.e();
                        cVar.invalidateSelf();
                    }
                }
                int i6 = bVar.f3836b;
                cVar.i.f3836b = i6;
                ColorStateList valueOf = ColorStateList.valueOf(i6);
                c.c.a.b.u.i iVar2 = cVar.f3842c;
                if (iVar2.f4024b.f4021d != valueOf) {
                    iVar2.p(valueOf);
                    cVar.invalidateSelf();
                }
                int i7 = bVar.f3837c;
                cVar.i.f3837c = i7;
                if (cVar.f3843d.f3971a.getColor() != i7) {
                    cVar.f3843d.f3971a.setColor(i7);
                    cVar.invalidateSelf();
                }
                int i8 = bVar.j;
                c.c.a.b.e.b bVar4 = cVar.i;
                if (bVar4.j != i8) {
                    bVar4.j = i8;
                    WeakReference<View> weakReference = cVar.p;
                    if (weakReference != null && weakReference.get() != null) {
                        View view = cVar.p.get();
                        WeakReference<ViewGroup> weakReference2 = cVar.q;
                        ViewGroup viewGroup = weakReference2 != null ? weakReference2.get() : null;
                        cVar.p = new WeakReference<>(view);
                        cVar.q = new WeakReference<>(viewGroup);
                        cVar.e();
                        cVar.invalidateSelf();
                    }
                }
                cVar.i.k = bVar.k;
                cVar.e();
                cVar.i.l = bVar.l;
                cVar.e();
                sparseArray.put(keyAt, cVar);
            }
            this.f3862c.setBadgeDrawables(sparseArray);
        }
    }

    @Override // b.b.h.m.y
    public boolean i(l lVar, o oVar) {
        return false;
    }

    @Override // b.b.h.m.y
    public boolean j(l lVar, o oVar) {
        return false;
    }

    @Override // b.b.h.m.y
    public boolean m(f0 f0Var) {
        return false;
    }

    @Override // b.b.h.m.y
    public void n(boolean z) {
        if (this.f3863d) {
            return;
        }
        if (z) {
            this.f3862c.a();
            return;
        }
        e eVar = this.f3862c;
        l lVar = eVar.z;
        if (lVar == null || eVar.l == null) {
            return;
        }
        int size = lVar.size();
        if (size != eVar.l.length) {
            eVar.a();
            return;
        }
        int i = eVar.m;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = eVar.z.getItem(i2);
            if (item.isChecked()) {
                eVar.m = item.getItemId();
                eVar.n = i2;
            }
        }
        if (i != eVar.m) {
            b.t.f0.a(eVar, eVar.f3854b);
        }
        boolean d2 = eVar.d(eVar.k, eVar.z.l().size());
        for (int i3 = 0; i3 < size; i3++) {
            eVar.y.f3863d = true;
            eVar.l[i3].setLabelVisibilityMode(eVar.k);
            eVar.l[i3].setShifting(d2);
            eVar.l[i3].d((o) eVar.z.getItem(i3), 0);
            eVar.y.f3863d = false;
        }
    }
}
