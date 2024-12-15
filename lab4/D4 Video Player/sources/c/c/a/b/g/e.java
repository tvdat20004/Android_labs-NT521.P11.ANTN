package c.c.a.b.g;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import b.b.h.m.l;
import b.b.h.m.z;
import b.h.j.k0.b;
import b.h.j.u;
import b.h.j.y;
import b.t.j0;
import c.c.a.b.p.o;
import java.util.HashSet;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class e extends ViewGroup implements z {
    public static final int[] A = {R.attr.state_checked};
    public static final int[] B = {-16842910};

    /* renamed from: b, reason: collision with root package name */
    public final j0 f3854b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3855c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3856d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3857e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3858f;
    public final int g;
    public final View.OnClickListener h;
    public final b.h.i.c<b> i;
    public boolean j;
    public int k;
    public b[] l;
    public int m;
    public int n;
    public ColorStateList o;
    public int p;
    public ColorStateList q;
    public final ColorStateList r;
    public int s;
    public int t;
    public Drawable u;
    public int v;
    public int[] w;
    public SparseArray<c.c.a.b.e.c> x;
    public h y;
    public l z;

    public e(Context context) {
        super(context, null);
        this.i = new b.h.i.d(5);
        this.m = 0;
        this.n = 0;
        this.x = new SparseArray<>(5);
        Resources resources = getResources();
        this.f3855c = resources.getDimensionPixelSize(razi.apa.ctf.videoPlayer.R.dimen.design_bottom_navigation_item_max_width);
        this.f3856d = resources.getDimensionPixelSize(razi.apa.ctf.videoPlayer.R.dimen.design_bottom_navigation_item_min_width);
        this.f3857e = resources.getDimensionPixelSize(razi.apa.ctf.videoPlayer.R.dimen.design_bottom_navigation_active_item_max_width);
        this.f3858f = resources.getDimensionPixelSize(razi.apa.ctf.videoPlayer.R.dimen.design_bottom_navigation_active_item_min_width);
        this.g = resources.getDimensionPixelSize(razi.apa.ctf.videoPlayer.R.dimen.design_bottom_navigation_height);
        this.r = c(R.attr.textColorSecondary);
        b.t.a aVar = new b.t.a();
        this.f3854b = aVar;
        aVar.L(0);
        aVar.J(115L);
        aVar.K(new b.m.a.a.b());
        aVar.H(new o());
        this.h = new d(this);
        this.w = new int[5];
        WeakHashMap<View, y> weakHashMap = u.f1311a;
        setImportantForAccessibility(1);
    }

    private b getNewItem() {
        b a2 = this.i.a();
        return a2 == null ? new b(getContext()) : a2;
    }

    private void setBadgeIfNeeded(b bVar) {
        c.c.a.b.e.c cVar;
        int id = bVar.getId();
        if ((id != -1) && (cVar = this.x.get(id)) != null) {
            bVar.setBadge(cVar);
        }
    }

    public void a() {
        removeAllViews();
        b[] bVarArr = this.l;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                if (bVar != null) {
                    this.i.b(bVar);
                    ImageView imageView = bVar.h;
                    if (bVar.b()) {
                        if (imageView != null) {
                            bVar.setClipChildren(true);
                            bVar.setClipToPadding(true);
                            c.c.a.b.e.c cVar = bVar.p;
                            if (cVar != null) {
                                imageView.getOverlay().remove(cVar);
                            }
                        }
                        bVar.p = null;
                    }
                }
            }
        }
        if (this.z.size() == 0) {
            this.m = 0;
            this.n = 0;
            this.l = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.z.size(); i++) {
            hashSet.add(Integer.valueOf(this.z.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.x.size(); i2++) {
            int keyAt = this.x.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.x.delete(keyAt);
            }
        }
        this.l = new b[this.z.size()];
        boolean d2 = d(this.k, this.z.l().size());
        for (int i3 = 0; i3 < this.z.size(); i3++) {
            this.y.f3863d = true;
            this.z.getItem(i3).setCheckable(true);
            this.y.f3863d = false;
            b newItem = getNewItem();
            this.l[i3] = newItem;
            newItem.setIconTintList(this.o);
            newItem.setIconSize(this.p);
            newItem.setTextColor(this.r);
            newItem.setTextAppearanceInactive(this.s);
            newItem.setTextAppearanceActive(this.t);
            newItem.setTextColor(this.q);
            Drawable drawable = this.u;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.v);
            }
            newItem.setShifting(d2);
            newItem.setLabelVisibilityMode(this.k);
            newItem.d((b.b.h.m.o) this.z.getItem(i3), 0);
            newItem.setItemPosition(i3);
            newItem.setOnClickListener(this.h);
            if (this.m != 0 && this.z.getItem(i3).getItemId() == this.m) {
                this.n = i3;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.z.size() - 1, this.n);
        this.n = min;
        this.z.getItem(min).setChecked(true);
    }

    @Override // b.b.h.m.z
    public void b(l lVar) {
        this.z = lVar;
    }

    public ColorStateList c(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        Context context = getContext();
        int i2 = typedValue.resourceId;
        ThreadLocal<TypedValue> threadLocal = b.b.d.a.a.f496a;
        ColorStateList colorStateList = context.getColorStateList(i2);
        if (!getContext().getTheme().resolveAttribute(razi.apa.ctf.videoPlayer.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = B;
        return new ColorStateList(new int[][]{iArr, A, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i3, defaultColor});
    }

    public final boolean d(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    public SparseArray<c.c.a.b.e.c> getBadgeDrawables() {
        return this.x;
    }

    public ColorStateList getIconTintList() {
        return this.o;
    }

    public Drawable getItemBackground() {
        b[] bVarArr = this.l;
        return (bVarArr == null || bVarArr.length <= 0) ? this.u : bVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.v;
    }

    public int getItemIconSize() {
        return this.p;
    }

    public int getItemTextAppearanceActive() {
        return this.t;
    }

    public int getItemTextAppearanceInactive() {
        return this.s;
    }

    public ColorStateList getItemTextColor() {
        return this.q;
    }

    public int getLabelVisibilityMode() {
        return this.k;
    }

    public int getSelectedItemId() {
        return this.m;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0001b.a(1, this.z.l().size(), false, 1).f1295a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                WeakHashMap<View, y> weakHashMap = u.f1311a;
                if (getLayoutDirection() == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.z.l().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.g, 1073741824);
        if (d(this.k, size2) && this.j) {
            View childAt = getChildAt(this.n);
            int i3 = this.f3858f;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f3857e, Integer.MIN_VALUE), makeMeasureSpec);
                i3 = Math.max(i3, childAt.getMeasuredWidth());
            }
            int i4 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.f3856d * i4), Math.min(i3, this.f3857e));
            int i5 = size - min;
            int min2 = Math.min(i5 / (i4 == 0 ? 1 : i4), this.f3855c);
            int i6 = i5 - (i4 * min2);
            int i7 = 0;
            while (i7 < childCount) {
                if (getChildAt(i7).getVisibility() != 8) {
                    int[] iArr = this.w;
                    iArr[i7] = i7 == this.n ? min : min2;
                    if (i6 > 0) {
                        iArr[i7] = iArr[i7] + 1;
                        i6--;
                    }
                } else {
                    this.w[i7] = 0;
                }
                i7++;
            }
        } else {
            int min3 = Math.min(size / (size2 == 0 ? 1 : size2), this.f3857e);
            int i8 = size - (size2 * min3);
            for (int i9 = 0; i9 < childCount; i9++) {
                if (getChildAt(i9).getVisibility() != 8) {
                    int[] iArr2 = this.w;
                    iArr2[i9] = min3;
                    if (i8 > 0) {
                        iArr2[i9] = iArr2[i9] + 1;
                        i8--;
                    }
                } else {
                    this.w[i9] = 0;
                }
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.w[i11], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i10 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10, View.MeasureSpec.makeMeasureSpec(i10, 1073741824), 0), View.resolveSizeAndState(this.g, makeMeasureSpec, 0));
    }

    public void setBadgeDrawables(SparseArray<c.c.a.b.e.c> sparseArray) {
        this.x = sparseArray;
        b[] bVarArr = this.l;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                bVar.setBadge(sparseArray.get(bVar.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.o = colorStateList;
        b[] bVarArr = this.l;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                bVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.u = drawable;
        b[] bVarArr = this.l;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                bVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.v = i;
        b[] bVarArr = this.l;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                bVar.setItemBackground(i);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.j = z;
    }

    public void setItemIconSize(int i) {
        this.p = i;
        b[] bVarArr = this.l;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                bVar.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.t = i;
        b[] bVarArr = this.l;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                bVar.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.q;
                if (colorStateList != null) {
                    bVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.s = i;
        b[] bVarArr = this.l;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                bVar.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.q;
                if (colorStateList != null) {
                    bVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.q = colorStateList;
        b[] bVarArr = this.l;
        if (bVarArr != null) {
            for (b bVar : bVarArr) {
                bVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.k = i;
    }

    public void setPresenter(h hVar) {
        this.y = hVar;
    }
}
