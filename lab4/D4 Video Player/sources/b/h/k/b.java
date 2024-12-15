package b.h.k;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import b.h.j.u;
import b.h.j.y;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f1327b;

    public b(d dVar) {
        this.f1327b = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        d dVar = this.f1327b;
        if (dVar.p) {
            if (dVar.n) {
                dVar.n = false;
                a aVar = dVar.f1329b;
                Objects.requireNonNull(aVar);
                long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                aVar.f1325e = currentAnimationTimeMillis;
                aVar.i = -1L;
                aVar.f1326f = currentAnimationTimeMillis;
                aVar.j = 0.5f;
                aVar.g = 0;
                aVar.h = 0;
            }
            a aVar2 = this.f1327b.f1329b;
            if ((aVar2.i > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar2.i + ((long) aVar2.k)) || !this.f1327b.f()) {
                this.f1327b.p = false;
                return;
            }
            d dVar2 = this.f1327b;
            if (dVar2.o) {
                dVar2.o = false;
                Objects.requireNonNull(dVar2);
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                dVar2.f1331d.onTouchEvent(obtain);
                obtain.recycle();
            }
            if (aVar2.f1326f == 0) {
                throw new RuntimeException("Cannot compute scroll delta before calling start()");
            }
            long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
            float a2 = aVar2.a(currentAnimationTimeMillis2);
            long j = currentAnimationTimeMillis2 - aVar2.f1326f;
            aVar2.f1326f = currentAnimationTimeMillis2;
            float f2 = j * ((a2 * 4.0f) + ((-4.0f) * a2 * a2));
            aVar2.g = (int) (aVar2.f1323c * f2);
            int i = (int) (f2 * aVar2.f1324d);
            aVar2.h = i;
            this.f1327b.r.scrollListBy(i);
            View view = this.f1327b.f1331d;
            WeakHashMap<View, y> weakHashMap = u.f1311a;
            view.postOnAnimation(this);
        }
    }
}
