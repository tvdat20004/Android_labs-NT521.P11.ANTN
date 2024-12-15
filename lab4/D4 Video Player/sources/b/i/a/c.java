package b.i.a;

import android.content.Context;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import b.b.i.g2;

/* loaded from: classes.dex */
public abstract class c extends BaseAdapter implements Filterable, d {

    /* renamed from: b, reason: collision with root package name */
    public boolean f1342b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1343c;

    /* renamed from: d, reason: collision with root package name */
    public Cursor f1344d;

    /* renamed from: e, reason: collision with root package name */
    public Context f1345e;

    /* renamed from: f, reason: collision with root package name */
    public int f1346f;
    public a g;
    public DataSetObserver h;
    public e i;

    public c(Context context, Cursor cursor, boolean z) {
        b bVar;
        int i = z ? 1 : 2;
        if ((i & 1) == 1) {
            i |= 2;
            this.f1343c = true;
        } else {
            this.f1343c = false;
        }
        boolean z2 = cursor != null;
        this.f1344d = cursor;
        this.f1342b = z2;
        this.f1345e = context;
        this.f1346f = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i & 2) == 2) {
            this.g = new a(this);
            bVar = new b(this);
        } else {
            bVar = null;
            this.g = null;
        }
        this.h = bVar;
        if (z2) {
            a aVar = this.g;
            if (aVar != null) {
                cursor.registerContentObserver(aVar);
            }
            DataSetObserver dataSetObserver = this.h;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    public abstract void a(View view, Context context, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.f1344d;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.g;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                DataSetObserver dataSetObserver = this.h;
                if (dataSetObserver != null) {
                    cursor2.unregisterDataSetObserver(dataSetObserver);
                }
            }
            this.f1344d = cursor;
            if (cursor != null) {
                a aVar2 = this.g;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                DataSetObserver dataSetObserver2 = this.h;
                if (dataSetObserver2 != null) {
                    cursor.registerDataSetObserver(dataSetObserver2);
                }
                this.f1346f = cursor.getColumnIndexOrThrow("_id");
                this.f1342b = true;
                notifyDataSetChanged();
            } else {
                this.f1346f = -1;
                this.f1342b = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract CharSequence c(Cursor cursor);

    public abstract View d(Context context, Cursor cursor, ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f1342b || (cursor = this.f1344d) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1342b) {
            return null;
        }
        this.f1344d.moveToPosition(i);
        if (view == null) {
            g2 g2Var = (g2) this;
            view = g2Var.l.inflate(g2Var.k, viewGroup, false);
        }
        a(view, this.f1345e, this.f1344d);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.i == null) {
            this.i = new e(this);
        }
        return this.i;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        Cursor cursor;
        if (!this.f1342b || (cursor = this.f1344d) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.f1344d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        Cursor cursor;
        if (this.f1342b && (cursor = this.f1344d) != null && cursor.moveToPosition(i)) {
            return this.f1344d.getLong(this.f1346f);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.f1342b) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f1344d.moveToPosition(i)) {
            throw new IllegalStateException(c.a.a.a.a.b("couldn't move cursor to position ", i));
        }
        if (view == null) {
            view = d(this.f1345e, this.f1344d, viewGroup);
        }
        a(view, this.f1345e, this.f1344d);
        return view;
    }
}
