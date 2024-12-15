package b.t;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class e0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public b0 f1734b;

    /* renamed from: c, reason: collision with root package name */
    public ViewGroup f1735c;

    public e0(b0 b0Var, ViewGroup viewGroup) {
        this.f1734b = b0Var;
        this.f1735c = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01f4 A[EDGE_INSN: B:126:0x01f4->B:127:0x01f4 BREAK  A[LOOP:1: B:17:0x009a->B:30:0x01ea], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onPreDraw() {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.t.e0.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f1735c.getViewTreeObserver().removeOnPreDrawListener(this);
        this.f1735c.removeOnAttachStateChangeListener(this);
        f0.f1738c.remove(this.f1735c);
        ArrayList<b0> arrayList = f0.b().get(this.f1735c);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<b0> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().x(this.f1735c);
            }
        }
        this.f1734b.i(true);
    }
}
