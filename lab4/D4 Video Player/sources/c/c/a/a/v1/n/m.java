package c.c.a.a.v1.n;

import android.util.Log;
import c.c.a.a.q1.y;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.z;

/* loaded from: classes.dex */
public abstract class m {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3286a = l0.l("GA94");

    public static void a(long j, z zVar, y[] yVarArr) {
        while (true) {
            if (zVar.a() <= 1) {
                return;
            }
            int c2 = c(zVar);
            int c3 = c(zVar);
            int i = zVar.f3801b + c3;
            if (c3 == -1 || c3 > zVar.a()) {
                Log.w("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                i = zVar.f3802c;
            } else if (c2 == 4 && c3 >= 8) {
                int p = zVar.p();
                int u = zVar.u();
                int d2 = u == 49 ? zVar.d() : 0;
                int p2 = zVar.p();
                if (u == 47) {
                    zVar.B(1);
                }
                boolean z = p == 181 && (u == 49 || u == 47) && p2 == 3;
                if (u == 49) {
                    z &= d2 == f3286a;
                }
                if (z) {
                    b(j, zVar, yVarArr);
                }
            }
            zVar.A(i);
        }
    }

    public static void b(long j, z zVar, y[] yVarArr) {
        int p = zVar.p();
        if ((p & 64) != 0) {
            zVar.B(1);
            int i = (p & 31) * 3;
            int i2 = zVar.f3801b;
            for (y yVar : yVarArr) {
                zVar.A(i2);
                yVar.a(zVar, i);
                yVar.d(j, 1, i, 0, null);
            }
        }
    }

    public static int c(z zVar) {
        int i = 0;
        while (zVar.a() != 0) {
            int p = zVar.p();
            i += p;
            if (p != 255) {
                return i;
            }
        }
        return -1;
    }
}
