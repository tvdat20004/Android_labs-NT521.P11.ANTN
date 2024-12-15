package b.b.i;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;

/* loaded from: classes.dex */
public class n0 extends s1 implements q0 {
    public CharSequence E;
    public ListAdapter F;
    public final Rect G;
    public int H;
    public final /* synthetic */ r0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(r0 r0Var, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0);
        this.I = r0Var;
        this.G = new Rect();
        this.q = r0Var;
        s(true);
        this.o = 0;
        this.r = new k0(this, r0Var);
    }

    @Override // b.b.i.q0
    public void d(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        boolean b2 = b();
        t();
        this.A.setInputMethodMode(2);
        f();
        g1 g1Var = this.f790d;
        g1Var.setChoiceMode(1);
        g1Var.setTextDirection(i);
        g1Var.setTextAlignment(i2);
        int selectedItemPosition = this.I.getSelectedItemPosition();
        g1 g1Var2 = this.f790d;
        if (b() && g1Var2 != null) {
            g1Var2.setListSelectionHidden(false);
            g1Var2.setSelection(selectedItemPosition);
            if (g1Var2.getChoiceMode() != 0) {
                g1Var2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (b2 || (viewTreeObserver = this.I.getViewTreeObserver()) == null) {
            return;
        }
        l0 l0Var = new l0(this);
        viewTreeObserver.addOnGlobalLayoutListener(l0Var);
        this.A.setOnDismissListener(new m0(this, l0Var));
    }

    @Override // b.b.i.q0
    public CharSequence j() {
        return this.E;
    }

    @Override // b.b.i.q0
    public void l(CharSequence charSequence) {
        this.E = charSequence;
    }

    @Override // b.b.i.s1, b.b.i.q0
    public void o(ListAdapter listAdapter) {
        super.o(listAdapter);
        this.F = listAdapter;
    }

    @Override // b.b.i.q0
    public void p(int i) {
        this.H = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void t() {
        /*
            r8 = this;
            android.graphics.drawable.Drawable r0 = r8.i()
            r1 = 0
            if (r0 == 0) goto L26
            b.b.i.r0 r1 = r8.I
            android.graphics.Rect r1 = r1.i
            r0.getPadding(r1)
            b.b.i.r0 r0 = r8.I
            boolean r0 = b.b.i.v2.b(r0)
            if (r0 == 0) goto L1d
            b.b.i.r0 r0 = r8.I
            android.graphics.Rect r0 = r0.i
            int r0 = r0.right
            goto L24
        L1d:
            b.b.i.r0 r0 = r8.I
            android.graphics.Rect r0 = r0.i
            int r0 = r0.left
            int r0 = -r0
        L24:
            r1 = r0
            goto L2e
        L26:
            b.b.i.r0 r0 = r8.I
            android.graphics.Rect r0 = r0.i
            r0.right = r1
            r0.left = r1
        L2e:
            b.b.i.r0 r0 = r8.I
            int r0 = r0.getPaddingLeft()
            b.b.i.r0 r2 = r8.I
            int r2 = r2.getPaddingRight()
            b.b.i.r0 r3 = r8.I
            int r3 = r3.getWidth()
            b.b.i.r0 r4 = r8.I
            int r5 = r4.h
            r6 = -2
            if (r5 != r6) goto L78
            android.widget.ListAdapter r5 = r8.F
            android.widget.SpinnerAdapter r5 = (android.widget.SpinnerAdapter) r5
            android.graphics.drawable.Drawable r6 = r8.i()
            int r4 = r4.a(r5, r6)
            b.b.i.r0 r5 = r8.I
            android.content.Context r5 = r5.getContext()
            android.content.res.Resources r5 = r5.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            int r5 = r5.widthPixels
            b.b.i.r0 r6 = r8.I
            android.graphics.Rect r6 = r6.i
            int r7 = r6.left
            int r5 = r5 - r7
            int r6 = r6.right
            int r5 = r5 - r6
            if (r4 <= r5) goto L70
            r4 = r5
        L70:
            int r5 = r3 - r0
            int r5 = r5 - r2
            int r4 = java.lang.Math.max(r4, r5)
            goto L7e
        L78:
            r4 = -1
            if (r5 != r4) goto L82
            int r4 = r3 - r0
            int r4 = r4 - r2
        L7e:
            r8.r(r4)
            goto L85
        L82:
            r8.r(r5)
        L85:
            b.b.i.r0 r4 = r8.I
            boolean r4 = b.b.i.v2.b(r4)
            if (r4 == 0) goto L96
            int r3 = r3 - r2
            int r0 = r8.f792f
            int r3 = r3 - r0
            int r0 = r8.H
            int r3 = r3 - r0
            int r3 = r3 + r1
            goto L9b
        L96:
            int r2 = r8.H
            int r0 = r0 + r2
            int r3 = r0 + r1
        L9b:
            r8.g = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.i.n0.t():void");
    }
}
