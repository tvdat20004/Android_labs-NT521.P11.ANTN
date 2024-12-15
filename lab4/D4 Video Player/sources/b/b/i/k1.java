package b.b.i;

import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public abstract class k1 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final float f715b;

    /* renamed from: c, reason: collision with root package name */
    public final int f716c;

    /* renamed from: d, reason: collision with root package name */
    public final int f717d;

    /* renamed from: e, reason: collision with root package name */
    public final View f718e;

    /* renamed from: f, reason: collision with root package name */
    public Runnable f719f;
    public Runnable g;
    public boolean h;
    public int i;
    public final int[] j = new int[2];

    public k1(View view) {
        this.f718e = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f715b = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f716c = tapTimeout;
        this.f717d = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.f718e.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f719f;
        if (runnable2 != null) {
            this.f718e.removeCallbacks(runnable2);
        }
    }

    public abstract b.b.h.m.b0 b();

    public abstract boolean c();

    public boolean d() {
        b.b.h.m.b0 b2 = b();
        if (b2 == null || !b2.b()) {
            return true;
        }
        b2.dismiss();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0087, code lost:
    
        if (r4 != 3) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0113  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 305
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.i.k1.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.h = false;
        this.i = -1;
        Runnable runnable = this.f719f;
        if (runnable != null) {
            this.f718e.removeCallbacks(runnable);
        }
    }
}
