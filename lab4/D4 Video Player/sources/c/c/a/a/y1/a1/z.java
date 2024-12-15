package c.c.a.a.y1.a1;

import android.os.ConditionVariable;
import java.util.Objects;

/* loaded from: classes.dex */
public class z extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f3609b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a0 f3610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, String str, ConditionVariable conditionVariable) {
        super(str);
        this.f3610c = a0Var;
        this.f3609b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        synchronized (this.f3610c) {
            this.f3609b.open();
            a0.a(this.f3610c);
            Objects.requireNonNull((y) this.f3610c.f3547b);
        }
    }
}
