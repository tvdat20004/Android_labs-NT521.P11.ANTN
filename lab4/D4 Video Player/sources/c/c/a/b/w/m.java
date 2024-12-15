package c.c.a.b.w;

import android.widget.AutoCompleteTextView;

/* loaded from: classes.dex */
public class m implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f4106b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f4107c;

    public m(o oVar, AutoCompleteTextView autoCompleteTextView) {
        this.f4107c = oVar;
        this.f4106b = autoCompleteTextView;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean isPopupShowing = this.f4106b.isPopupShowing();
        x.f(this.f4107c.f4109b, isPopupShowing);
        this.f4107c.f4109b.i = isPopupShowing;
    }
}
