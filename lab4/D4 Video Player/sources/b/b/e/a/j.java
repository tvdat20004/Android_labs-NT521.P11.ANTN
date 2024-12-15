package b.b.e.a;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public class j implements Drawable.Callback {

    /* renamed from: b, reason: collision with root package name */
    public Drawable.Callback f507b;

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = this.f507b;
        if (callback != null) {
            callback.scheduleDrawable(drawable, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = this.f507b;
        if (callback != null) {
            callback.unscheduleDrawable(drawable, runnable);
        }
    }
}
