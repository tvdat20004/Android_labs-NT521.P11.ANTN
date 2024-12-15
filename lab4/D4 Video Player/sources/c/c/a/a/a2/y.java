package c.c.a.a.a2;

import android.os.Handler;
import java.util.Objects;

/* loaded from: classes.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f1972a;

    /* renamed from: b, reason: collision with root package name */
    public final z f1973b;

    public y(Handler handler, z zVar) {
        if (zVar != null) {
            Objects.requireNonNull(handler);
        } else {
            handler = null;
        }
        this.f1972a = handler;
        this.f1973b = zVar;
    }

    public void a(final int i, final int i2, final int i3, final float f2) {
        if (this.f1973b != null) {
            this.f1972a.post(new Runnable() { // from class: c.c.a.a.a2.g
                @Override // java.lang.Runnable
                public final void run() {
                    y yVar = y.this;
                    yVar.f1973b.a(i, i2, i3, f2);
                }
            });
        }
    }
}
