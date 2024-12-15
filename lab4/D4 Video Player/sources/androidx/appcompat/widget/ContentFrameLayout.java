package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import b.b.c.f0;
import b.b.c.q;
import b.b.h.m.l;
import b.b.i.b1;
import b.b.i.m;
import b.b.i.p2;
import java.util.Objects;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f88b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f89c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f90d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f91e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f92f;
    public TypedValue g;
    public final Rect h;
    public a i;

    public interface a {
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.h = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f92f == null) {
            this.f92f = new TypedValue();
        }
        return this.f92f;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.g == null) {
            this.g = new TypedValue();
        }
        return this.g;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f90d == null) {
            this.f90d = new TypedValue();
        }
        return this.f90d;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f91e == null) {
            this.f91e = new TypedValue();
        }
        return this.f91e;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f88b == null) {
            this.f88b = new TypedValue();
        }
        return this.f88b;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f89c == null) {
            this.f89c = new TypedValue();
        }
        return this.f89c;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.i;
        if (aVar != null) {
            Objects.requireNonNull((q) aVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        m mVar;
        super.onDetachedFromWindow();
        a aVar = this.i;
        if (aVar != null) {
            f0 f0Var = ((q) aVar).f474a;
            b1 b1Var = f0Var.l;
            if (b1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) b1Var;
                actionBarOverlayLayout.n();
                ActionMenuView actionMenuView = ((p2) actionBarOverlayLayout.f76f).f760a.f123b;
                if (actionMenuView != null && (mVar = actionMenuView.u) != null) {
                    mVar.b();
                }
            }
            if (f0Var.q != null) {
                f0Var.f431f.getDecorView().removeCallbacks(f0Var.r);
                if (f0Var.q.isShowing()) {
                    try {
                        f0Var.q.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                f0Var.q = null;
            }
            f0Var.x();
            l lVar = f0Var.C(0).h;
            if (lVar != null) {
                lVar.c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00ae  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(a aVar) {
        this.i = aVar;
    }
}
