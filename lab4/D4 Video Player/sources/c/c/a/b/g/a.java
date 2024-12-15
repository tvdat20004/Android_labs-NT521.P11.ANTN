package c.c.a.b.g;

import android.view.View;
import android.widget.ImageView;

/* loaded from: classes.dex */
public class a implements View.OnLayoutChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f3847b;

    public a(b bVar) {
        this.f3847b = bVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.f3847b.h.getVisibility() == 0) {
            b bVar = this.f3847b;
            ImageView imageView = bVar.h;
            if (bVar.b()) {
                c.c.a.b.e.d.a(bVar.p, imageView, null);
            }
        }
    }
}
