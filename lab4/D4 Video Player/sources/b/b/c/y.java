package b.b.c;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;

/* loaded from: classes.dex */
public class y extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final PowerManager f493c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0 f494d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(f0 f0Var, Context context) {
        super(f0Var);
        this.f494d = f0Var;
        this.f493c = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // b.b.c.a0
    public IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
        return intentFilter;
    }

    @Override // b.b.c.a0
    public int c() {
        return this.f493c.isPowerSaveMode() ? 2 : 1;
    }

    @Override // b.b.c.a0
    public void d() {
        this.f494d.o();
    }
}
