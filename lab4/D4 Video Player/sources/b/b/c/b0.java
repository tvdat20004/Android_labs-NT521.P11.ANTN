package b.b.c;

import android.content.IntentFilter;

/* loaded from: classes.dex */
public class b0 extends a0 {

    /* renamed from: c, reason: collision with root package name */
    public final m0 f413c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0 f414d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(f0 f0Var, m0 m0Var) {
        super(f0Var);
        this.f414d = f0Var;
        this.f413c = m0Var;
    }

    @Override // b.b.c.a0
    public IntentFilter b() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.TIME_SET");
        intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
        intentFilter.addAction("android.intent.action.TIME_TICK");
        return intentFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x00ec A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    @Override // b.b.c.a0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c() {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.c.b0.c():int");
    }

    @Override // b.b.c.a0
    public void d() {
        this.f414d.o();
    }
}
