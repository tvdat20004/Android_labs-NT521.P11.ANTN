package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.StateSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import b.b.h.m.l;
import b.b.i.l2;
import b.h.j.u;
import b.h.j.y;
import c.c.a.b.g.e;
import c.c.a.b.g.h;
import c.c.a.b.g.j;
import c.c.a.b.g.k;
import c.c.a.b.p.p;
import c.c.a.b.u.i;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Objects;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class BottomNavigationView extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final l f4194b;

    /* renamed from: c, reason: collision with root package name */
    public final e f4195c;

    /* renamed from: d, reason: collision with root package name */
    public final h f4196d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f4197e;

    /* renamed from: f, reason: collision with root package name */
    public MenuInflater f4198f;
    public b g;
    public a h;

    public interface a {
        void a(MenuItem menuItem);
    }

    public interface b {
    }

    public static class c extends b.j.a.c {
        public static final Parcelable.Creator<c> CREATOR = new k();

        /* renamed from: d, reason: collision with root package name */
        public Bundle f4199d;

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4199d = parcel.readBundle(classLoader == null ? c.class.getClassLoader() : classLoader);
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // b.j.a.c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1349b, i);
            parcel.writeBundle(this.f4199d);
        }
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        super(c.c.a.b.x.a.a.a(context, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), attributeSet, R.attr.bottomNavigationStyle);
        h hVar = new h();
        this.f4196d = hVar;
        Context context2 = getContext();
        c.c.a.b.g.c cVar = new c.c.a.b.g.c(context2);
        this.f4194b = cVar;
        e eVar = new e(context2);
        this.f4195c = eVar;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        eVar.setLayoutParams(layoutParams);
        hVar.f3862c = eVar;
        hVar.f3864e = 1;
        eVar.setPresenter(hVar);
        cVar.b(hVar, cVar.f604a);
        getContext();
        hVar.f3861b = cVar;
        hVar.f3862c.z = cVar;
        int[] iArr = c.c.a.b.b.f3803a;
        p.a(context2, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView);
        p.b(context2, attributeSet, iArr, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 8, 7);
        l2 l2Var = new l2(context2, context2.obtainStyledAttributes(attributeSet, iArr, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView));
        eVar.setIconTintList(l2Var.p(5) ? l2Var.c(5) : eVar.c(android.R.attr.textColorSecondary));
        setItemIconSize(l2Var.f(4, getResources().getDimensionPixelSize(R.dimen.design_bottom_navigation_icon_size)));
        if (l2Var.p(8)) {
            setItemTextAppearanceInactive(l2Var.m(8, 0));
        }
        if (l2Var.p(7)) {
            setItemTextAppearanceActive(l2Var.m(7, 0));
        }
        if (l2Var.p(9)) {
            setItemTextColor(l2Var.c(9));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            i iVar = new i();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                iVar.p(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            iVar.f4024b.f4019b = new c.c.a.b.n.a(context2);
            iVar.w();
            WeakHashMap<View, y> weakHashMap = u.f1311a;
            setBackground(iVar);
        }
        if (l2Var.p(1)) {
            float f2 = l2Var.f(1, 0);
            WeakHashMap<View, y> weakHashMap2 = u.f1311a;
            setElevation(f2);
        }
        getBackground().mutate().setTintList(c.c.a.b.a.f(context2, l2Var, 0));
        setLabelVisibilityMode(l2Var.k(10, -1));
        setItemHorizontalTranslationEnabled(l2Var.a(3, true));
        int m = l2Var.m(2, 0);
        if (m != 0) {
            eVar.setItemBackgroundRes(m);
        } else {
            setItemRippleColor(c.c.a.b.a.f(context2, l2Var, 6));
        }
        if (l2Var.p(11)) {
            int m2 = l2Var.m(11, 0);
            hVar.f3863d = true;
            getMenuInflater().inflate(m2, cVar);
            hVar.f3863d = false;
            hVar.n(true);
        }
        l2Var.f730b.recycle();
        addView(eVar, layoutParams);
        cVar.x(new c.c.a.b.g.i(this));
        c.c.a.b.a.b(this, new j(this));
    }

    private MenuInflater getMenuInflater() {
        if (this.f4198f == null) {
            this.f4198f = new b.b.h.j(getContext());
        }
        return this.f4198f;
    }

    public Drawable getItemBackground() {
        return this.f4195c.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f4195c.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f4195c.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f4195c.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.f4197e;
    }

    public int getItemTextAppearanceActive() {
        return this.f4195c.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f4195c.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f4195c.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f4195c.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f4194b;
    }

    public int getSelectedItemId() {
        return this.f4195c.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof i) {
            c.c.a.b.a.o(this, (i) background);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.f1349b);
        l lVar = this.f4194b;
        Bundle bundle = cVar.f4199d;
        Objects.requireNonNull(lVar);
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray == null || lVar.u.isEmpty()) {
            return;
        }
        Iterator<WeakReference<b.b.h.m.y>> it = lVar.u.iterator();
        while (it.hasNext()) {
            WeakReference<b.b.h.m.y> next = it.next();
            b.b.h.m.y yVar = next.get();
            if (yVar == null) {
                lVar.u.remove(next);
            } else {
                int c2 = yVar.c();
                if (c2 > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(c2)) != null) {
                    yVar.h(parcelable2);
                }
            }
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Parcelable e2;
        c cVar = new c(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        cVar.f4199d = bundle;
        l lVar = this.f4194b;
        if (!lVar.u.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator<WeakReference<b.b.h.m.y>> it = lVar.u.iterator();
            while (it.hasNext()) {
                WeakReference<b.b.h.m.y> next = it.next();
                b.b.h.m.y yVar = next.get();
                if (yVar == null) {
                    lVar.u.remove(next);
                } else {
                    int c2 = yVar.c();
                    if (c2 > 0 && (e2 = yVar.e()) != null) {
                        sparseArray.put(c2, e2);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return cVar;
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        c.c.a.b.a.n(this, f2);
    }

    public void setItemBackground(Drawable drawable) {
        this.f4195c.setItemBackground(drawable);
        this.f4197e = null;
    }

    public void setItemBackgroundResource(int i) {
        this.f4195c.setItemBackgroundRes(i);
        this.f4197e = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        e eVar = this.f4195c;
        if (eVar.j != z) {
            eVar.setItemHorizontalTranslationEnabled(z);
            this.f4196d.n(false);
        }
    }

    public void setItemIconSize(int i) {
        this.f4195c.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f4195c.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.f4197e == colorStateList) {
            if (colorStateList != null || this.f4195c.getItemBackground() == null) {
                return;
            }
            this.f4195c.setItemBackground(null);
            return;
        }
        this.f4197e = colorStateList;
        if (colorStateList == null) {
            this.f4195c.setItemBackground(null);
        } else {
            this.f4195c.setItemBackground(new RippleDrawable(new ColorStateList(new int[][]{c.c.a.b.s.a.i, StateSet.NOTHING}, new int[]{c.c.a.b.s.a.a(colorStateList, c.c.a.b.s.a.f4006e), c.c.a.b.s.a.a(colorStateList, c.c.a.b.s.a.f4002a)}), null, null));
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.f4195c.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.f4195c.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f4195c.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f4195c.getLabelVisibilityMode() != i) {
            this.f4195c.setLabelVisibilityMode(i);
            this.f4196d.n(false);
        }
    }

    public void setOnNavigationItemReselectedListener(a aVar) {
        this.h = aVar;
    }

    public void setOnNavigationItemSelectedListener(b bVar) {
        this.g = bVar;
    }

    public void setSelectedItemId(int i) {
        MenuItem findItem = this.f4194b.findItem(i);
        if (findItem == null || this.f4194b.s(findItem, this.f4196d, 0)) {
            return;
        }
        findItem.setChecked(true);
    }
}
