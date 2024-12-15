package c.c.a.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import c.c.a.a.x0;
import java.util.Objects;

/* loaded from: classes.dex */
public class a0 extends Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c0 f1892a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(c0 c0Var, Looper looper) {
        super(looper);
        this.f1892a = c0Var;
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        p pVar;
        c0 c0Var = this.f1892a;
        Objects.requireNonNull(c0Var);
        int i = message.what;
        if (i != 0) {
            if (i == 1) {
                final u0 u0Var = (u0) message.obj;
                if (c0Var.r.equals(u0Var)) {
                    return;
                }
                c0Var.r = u0Var;
                pVar = new p() { // from class: c.c.a.a.j
                    @Override // c.c.a.a.p
                    public final void a(x0.a aVar) {
                        aVar.p(u0.this);
                    }
                };
            } else {
                if (i != 2) {
                    throw new IllegalStateException();
                }
                final z zVar = (z) message.obj;
                c0Var.s = zVar;
                pVar = new p() { // from class: c.c.a.a.k
                    @Override // c.c.a.a.p
                    public final void a(x0.a aVar) {
                        aVar.s(z.this);
                    }
                };
            }
            c0Var.H(pVar);
            return;
        }
        t0 t0Var = (t0) message.obj;
        int i2 = message.arg1;
        int i3 = message.arg2;
        boolean z = i3 != -1;
        int i4 = c0Var.o - i2;
        c0Var.o = i4;
        if (i4 == 0) {
            if (t0Var.f2808d == -9223372036854775807L) {
                c.c.a.a.u1.w wVar = t0Var.f2807c;
                t0Var = new t0(t0Var.f2805a, t0Var.f2806b, wVar, 0L, wVar.a() ? t0Var.f2809e : -9223372036854775807L, t0Var.f2810f, t0Var.g, t0Var.h, t0Var.i, wVar, 0L, 0L, 0L);
            }
            if (!c0Var.t.f2805a.p() && t0Var.f2805a.p()) {
                c0Var.v = 0;
                c0Var.u = 0;
                c0Var.w = 0L;
            }
            int i5 = c0Var.p ? 0 : 2;
            boolean z2 = c0Var.q;
            c0Var.p = false;
            c0Var.q = false;
            c0Var.N(t0Var, z, i3, i5, z2);
        }
    }
}
