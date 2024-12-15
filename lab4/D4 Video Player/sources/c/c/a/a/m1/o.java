package c.c.a.a.m1;

import android.media.AudioManager;
import c.c.a.a.b1;
import c.c.a.a.g1;
import c.c.a.a.z0;
import java.util.Objects;

/* loaded from: classes.dex */
public class o implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f2127a;

    public o(p pVar, n nVar) {
        this.f2127a = pVar;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int i) {
        if (i == -3) {
            Objects.requireNonNull(this.f2127a);
            this.f2127a.f2131d = 3;
        } else if (i == -2) {
            this.f2127a.f2131d = 2;
        } else if (i == -1) {
            this.f2127a.f2131d = -1;
        } else {
            if (i != 1) {
                c.a.a.a.a.m("Unknown focus change type: ", i, "AudioFocusManager");
                return;
            }
            this.f2127a.f2131d = 1;
        }
        p pVar = this.f2127a;
        int i2 = pVar.f2131d;
        if (i2 == -1) {
            pVar.f2130c.o(-1);
            this.f2127a.a(true);
        } else if (i2 != 0) {
            if (i2 == 1) {
                pVar.f2130c.o(1);
            } else if (i2 == 2) {
                pVar.f2130c.o(0);
            } else if (i2 != 3) {
                StringBuilder j = c.a.a.a.a.j("Unknown audio focus state: ");
                j.append(this.f2127a.f2131d);
                throw new IllegalStateException(j.toString());
            }
        }
        p pVar2 = this.f2127a;
        float f2 = pVar2.f2131d == 3 ? 0.2f : 1.0f;
        if (pVar2.f2132e != f2) {
            pVar2.f2132e = f2;
            g1 g1Var = pVar2.f2130c.f1998b;
            float f3 = g1Var.v * g1Var.n.f2132e;
            for (b1 b1Var : g1Var.f2004b) {
                if (((c.c.a.a.r) b1Var).f2682b == 1) {
                    z0 E = g1Var.f2005c.E(b1Var);
                    E.e(2);
                    E.d(Float.valueOf(f3));
                    E.c();
                }
            }
        }
    }
}
