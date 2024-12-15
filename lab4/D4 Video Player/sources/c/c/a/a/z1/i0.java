package c.c.a.a.z1;

import android.os.Handler;
import android.os.Message;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f3752a;

    public i0(Handler handler) {
        this.f3752a = handler;
    }

    public Message a(int i, int i2, int i3) {
        return this.f3752a.obtainMessage(i, i2, i3);
    }

    public Message b(int i, Object obj) {
        return this.f3752a.obtainMessage(i, obj);
    }

    public boolean c(int i) {
        return this.f3752a.sendEmptyMessage(i);
    }
}
