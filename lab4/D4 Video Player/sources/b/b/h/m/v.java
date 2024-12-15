package b.b.h.m;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public abstract class v implements b0, y, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    public Rect f631b;

    public static int q(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        k kVar = (k) listAdapter;
        int count = kVar.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = kVar.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = kVar.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    public static boolean y(l lVar) {
        int size = lVar.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = lVar.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // b.b.h.m.y
    public int c() {
        return 0;
    }

    @Override // b.b.h.m.y
    public void g(Context context, l lVar) {
    }

    @Override // b.b.h.m.y
    public boolean i(l lVar, o oVar) {
        return false;
    }

    @Override // b.b.h.m.y
    public boolean j(l lVar, o oVar) {
        return false;
    }

    public abstract void o(l lVar);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (k) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (k) listAdapter).f599b.s((MenuItem) listAdapter.getItem(i), this, p() ? 0 : 4);
    }

    public boolean p() {
        return true;
    }

    public abstract void r(View view);

    public abstract void s(boolean z);

    public abstract void t(int i);

    public abstract void u(int i);

    public abstract void v(PopupWindow.OnDismissListener onDismissListener);

    public abstract void w(boolean z);

    public abstract void x(int i);
}
