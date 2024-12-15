package c.c.a.b.m;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* loaded from: classes.dex */
public class a implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final Dialog f3948b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3949c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3950d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3951e;

    public a(Dialog dialog, Rect rect) {
        this.f3948b = dialog;
        this.f3949c = rect.left;
        this.f3950d = rect.top;
        this.f3951e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(R.id.content);
        int left = findViewById.getLeft() + this.f3949c;
        int width = findViewById.getWidth() + left;
        if (new RectF(left, findViewById.getTop() + this.f3950d, width, findViewById.getHeight() + r4).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f3951e;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f3948b.onTouchEvent(obtain);
    }
}
