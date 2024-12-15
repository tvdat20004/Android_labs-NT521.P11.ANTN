package b.b.i;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public abstract class b extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public final a f643b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f644c;

    /* renamed from: d, reason: collision with root package name */
    public ActionMenuView f645d;

    /* renamed from: e, reason: collision with root package name */
    public m f646e;

    /* renamed from: f, reason: collision with root package name */
    public int f647f;
    public b.h.j.y g;
    public boolean h;
    public boolean i;

    public b(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f643b = new a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f644c = context;
        } else {
            this.f644c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public int c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public int d(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public b.h.j.y e(int i, long j) {
        b.h.j.y yVar = this.g;
        if (yVar != null) {
            yVar.b();
        }
        if (i != 0) {
            b.h.j.y a2 = b.h.j.u.a(this);
            a2.a(0.0f);
            a2.c(j);
            a aVar = this.f643b;
            aVar.f641c.g = a2;
            aVar.f640b = i;
            View view = a2.f1319a.get();
            if (view != null) {
                a2.e(view, aVar);
            }
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        b.h.j.y a3 = b.h.j.u.a(this);
        a3.a(1.0f);
        a3.c(j);
        a aVar2 = this.f643b;
        aVar2.f641c.g = a3;
        aVar2.f640b = i;
        View view2 = a3.f1319a.get();
        if (view2 != null) {
            a3.e(view2, aVar2);
        }
        return a3;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, b.b.b.f404a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        m mVar = this.f646e;
        if (mVar != null) {
            Configuration configuration2 = mVar.f733c.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            mVar.r = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            b.b.h.m.l lVar = mVar.f734d;
            if (lVar != null) {
                lVar.q(true);
            }
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.h = false;
        }
        if (!this.h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            b.h.j.y yVar = this.g;
            if (yVar != null) {
                yVar.b();
            }
            super.setVisibility(i);
        }
    }
}
