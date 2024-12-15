package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import b.b.h.m.b0;
import b.b.h.m.l;
import b.b.h.m.o;
import b.b.h.m.z;
import b.b.i.d;
import b.b.i.e;
import b.b.i.k1;
import b.b.i.v0;

/* loaded from: classes.dex */
public class ActionMenuItemView extends v0 implements z.a, View.OnClickListener, ActionMenuView.a {

    /* renamed from: f, reason: collision with root package name */
    public o f58f;
    public CharSequence g;
    public Drawable h;
    public l.b i;
    public k1 j;
    public b k;
    public boolean l;
    public boolean m;
    public int n;
    public int o;
    public int p;

    public class a extends k1 {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // b.b.i.k1
        public b0 b() {
            d dVar;
            b bVar = ActionMenuItemView.this.k;
            if (bVar == null || (dVar = ((e) bVar).f672a.w) == null) {
                return null;
            }
            return dVar.a();
        }

        @Override // b.b.i.k1
        public boolean c() {
            b0 b2;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            l.b bVar = actionMenuItemView.i;
            return bVar != null && bVar.a(actionMenuItemView.f58f) && (b2 = b()) != null && b2.b();
        }
    }

    public static abstract class b {
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.l = f();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.b.f406c, 0, 0);
        this.n = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.p = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.o = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return e();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return e() && this.f58f.getIcon() == null;
    }

    @Override // b.b.h.m.z.a
    public void d(o oVar, int i) {
        this.f58f = oVar;
        setIcon(oVar.getIcon());
        setTitle(oVar.getTitleCondensed());
        setId(oVar.f614a);
        setVisibility(oVar.isVisible() ? 0 : 8);
        setEnabled(oVar.isEnabled());
        if (oVar.hasSubMenu() && this.j == null) {
            this.j = new a();
        }
    }

    public boolean e() {
        return !TextUtils.isEmpty(getText());
    }

    public final boolean f() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void g() {
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.g);
        if (this.h != null) {
            if (!((this.f58f.y & 4) == 4) || (!this.l && !this.m)) {
                z = false;
            }
        }
        boolean z3 = z2 & z;
        setText(z3 ? this.g : null);
        CharSequence charSequence = this.f58f.q;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence = z3 ? null : this.f58f.f618e;
        }
        setContentDescription(charSequence);
        CharSequence charSequence2 = this.f58f.r;
        if (TextUtils.isEmpty(charSequence2)) {
            b.b.a.c(this, z3 ? null : this.f58f.f618e);
        } else {
            b.b.a.c(this, charSequence2);
        }
    }

    @Override // b.b.h.m.z.a
    public o getItemData() {
        return this.f58f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        l.b bVar = this.i;
        if (bVar != null) {
            bVar.a(this.f58f);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.l = f();
        g();
    }

    @Override // b.b.i.v0, android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        boolean e2 = e();
        if (e2 && (i3 = this.o) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.n) : this.n;
        if (mode != 1073741824 && this.n > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (e2 || this.h == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.h.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        k1 k1Var;
        if (this.f58f.hasSubMenu() && (k1Var = this.j) != null && k1Var.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.m != z) {
            this.m = z;
            o oVar = this.f58f;
            if (oVar != null) {
                oVar.n.p();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.p;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        g();
    }

    public void setItemInvoker(l.b bVar) {
        this.i = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
        this.o = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(b bVar) {
        this.k = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.g = charSequence;
        g();
    }
}
