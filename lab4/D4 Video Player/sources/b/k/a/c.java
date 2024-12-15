package b.k.a;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* loaded from: classes.dex */
public class c implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DrawerLayout.g f1365b;

    public c(DrawerLayout.g gVar) {
        this.f1365b = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        View d2;
        int width;
        DrawerLayout.g gVar = this.f1365b;
        int i = gVar.f219b.o;
        boolean z = gVar.f218a == 3;
        if (z) {
            d2 = DrawerLayout.this.d(3);
            width = (d2 != null ? -d2.getWidth() : 0) + i;
        } else {
            d2 = DrawerLayout.this.d(5);
            width = DrawerLayout.this.getWidth() - i;
        }
        if (d2 != null) {
            if (((!z || d2.getLeft() >= width) && (z || d2.getLeft() <= width)) || DrawerLayout.this.g(d2) != 0) {
                return;
            }
            DrawerLayout.d dVar = (DrawerLayout.d) d2.getLayoutParams();
            gVar.f219b.x(d2, width, d2.getTop());
            dVar.f213c = true;
            DrawerLayout.this.invalidate();
            gVar.m();
            DrawerLayout drawerLayout = DrawerLayout.this;
            if (drawerLayout.s) {
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
            int childCount = drawerLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                drawerLayout.getChildAt(i2).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            drawerLayout.s = true;
        }
    }
}
