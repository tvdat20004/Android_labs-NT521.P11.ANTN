package c.c.a.b.w;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class u implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f4115b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ x f4116c;

    public u(x xVar, AutoCompleteTextView autoCompleteTextView) {
        this.f4116c = xVar;
        this.f4115b = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            if (this.f4116c.i()) {
                this.f4116c.i = false;
            }
            x.g(this.f4116c, this.f4115b);
        }
        return false;
    }
}
