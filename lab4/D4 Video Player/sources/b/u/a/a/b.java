package b.u.a.a;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class b implements Drawable.Callback {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f1810b;

    public b(e eVar) {
        this.f1810b = eVar;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        this.f1810b.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        this.f1810b.scheduleSelf(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f1810b.unscheduleSelf(runnable);
    }
}
