package b.b.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* loaded from: classes.dex */
public class u1 extends g1 {
    public final int o;
    public final int p;
    public t1 q;
    public MenuItem r;

    public u1(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.o = 21;
            this.p = 22;
        } else {
            this.o = 22;
            this.p = 21;
        }
    }

    @Override // b.b.i.g1, android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i;
        int pointToPosition;
        int i2;
        if (this.q != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                adapter = headerViewListAdapter.getWrappedAdapter();
            } else {
                i = 0;
            }
            b.b.h.m.k kVar = (b.b.h.m.k) adapter;
            b.b.h.m.o oVar = null;
            if (motionEvent.getAction() != 10 && (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = pointToPosition - i) >= 0 && i2 < kVar.getCount()) {
                oVar = kVar.getItem(i2);
            }
            MenuItem menuItem = this.r;
            if (menuItem != oVar) {
                b.b.h.m.l lVar = kVar.f599b;
                if (menuItem != null) {
                    this.q.h(lVar, menuItem);
                }
                this.r = oVar;
                if (oVar != null) {
                    this.q.e(lVar, oVar);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.o) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.p) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ((b.b.h.m.k) getAdapter()).f599b.c(false);
        return true;
    }

    public void setHoverListener(t1 t1Var) {
        this.q = t1Var;
    }

    @Override // b.b.i.g1, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
