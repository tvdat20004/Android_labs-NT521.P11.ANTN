package b.b.c;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public BroadcastReceiver f411a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f412b;

    public a0(f0 f0Var) {
        this.f412b = f0Var;
    }

    public void a() {
        BroadcastReceiver broadcastReceiver = this.f411a;
        if (broadcastReceiver != null) {
            try {
                this.f412b.f430e.unregisterReceiver(broadcastReceiver);
            } catch (IllegalArgumentException unused) {
            }
            this.f411a = null;
        }
    }

    public abstract IntentFilter b();

    public abstract int c();

    public abstract void d();

    public void e() {
        a();
        IntentFilter b2 = b();
        if (b2 == null || b2.countActions() == 0) {
            return;
        }
        if (this.f411a == null) {
            this.f411a = new z(this);
        }
        this.f412b.f430e.registerReceiver(this.f411a, b2);
    }
}
