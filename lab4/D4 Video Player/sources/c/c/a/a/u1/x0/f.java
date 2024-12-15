package c.c.a.a.u1.x0;

import android.text.TextUtils;
import c.c.a.a.l0;
import c.c.a.a.q1.g0.m0;
import c.c.a.a.z1.k0;
import java.io.EOFException;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class f implements n {
    public static m a(c.c.a.a.q1.m mVar) {
        return new m(mVar, (mVar instanceof c.c.a.a.q1.g0.e) || (mVar instanceof c.c.a.a.q1.g0.a) || (mVar instanceof c.c.a.a.q1.g0.c) || (mVar instanceof c.c.a.a.q1.c0.d), (mVar instanceof m0) || (mVar instanceof c.c.a.a.q1.d0.k));
    }

    public static c.c.a.a.q1.d0.k b(k0 k0Var, c.c.a.a.p1.e eVar, List<l0> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        return new c.c.a.a.q1.d0.k(0, k0Var, null, eVar, list, null);
    }

    public static m0 c(int i, boolean z, l0 l0Var, List<l0> list, k0 k0Var) {
        int i2 = i | 16;
        if (list != null) {
            i2 |= 32;
        } else {
            list = z ? Collections.singletonList(l0.y(null, "application/cea-608", 0, null, null)) : Collections.emptyList();
        }
        String str = l0Var.g;
        if (!TextUtils.isEmpty(str)) {
            if (!"audio/mp4a-latm".equals(c.c.a.a.z1.u.a(str))) {
                i2 |= 2;
            }
            if (!"video/avc".equals(c.c.a.a.z1.u.g(str))) {
                i2 |= 4;
            }
        }
        return new m0(2, k0Var, new c.c.a.a.q1.g0.g(i2, list));
    }

    public static boolean d(c.c.a.a.q1.m mVar, c.c.a.a.q1.j jVar) {
        try {
            return mVar.i(jVar);
        } catch (EOFException unused) {
            return false;
        } finally {
            jVar.f2652f = 0;
        }
    }
}
