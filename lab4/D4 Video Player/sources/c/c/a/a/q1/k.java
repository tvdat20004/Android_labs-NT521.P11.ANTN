package c.c.a.a.q1;

import c.c.a.a.q1.g0.c0;
import c.c.a.a.q1.g0.m0;
import c.c.a.a.z1.k0;
import java.lang.reflect.Constructor;
import java.util.Collections;

/* loaded from: classes.dex */
public final class k implements o {

    /* renamed from: a, reason: collision with root package name */
    public static final Constructor<? extends m> f2653a;

    static {
        Constructor<? extends m> constructor;
        try {
            constructor = Class.forName("com.google.android.exoplayer2.ext.flac.FlacExtractor").asSubclass(m.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
            constructor = null;
        } catch (Exception e2) {
            throw new RuntimeException("Error instantiating FLAC extension", e2);
        }
        f2653a = constructor;
    }

    @Override // c.c.a.a.q1.o
    public synchronized m[] a() {
        m[] mVarArr;
        Constructor<? extends m> constructor = f2653a;
        mVarArr = new m[constructor == null ? 13 : 14];
        mVarArr[0] = new c.c.a.a.q1.b0.h(0);
        mVarArr[1] = new c.c.a.a.q1.d0.k(0, null, null, null, Collections.emptyList(), null);
        mVarArr[2] = new c.c.a.a.q1.d0.p(0);
        mVarArr[3] = new c.c.a.a.q1.c0.d(0, -9223372036854775807L);
        mVarArr[4] = new c.c.a.a.q1.g0.e(0L, 0);
        mVarArr[5] = new c.c.a.a.q1.g0.a();
        mVarArr[6] = new m0(1, new k0(0L), new c.c.a.a.q1.g0.g(0));
        mVarArr[7] = new c.c.a.a.q1.a0.b();
        mVarArr[8] = new c.c.a.a.q1.e0.f();
        mVarArr[9] = new c0();
        mVarArr[10] = new c.c.a.a.q1.h0.a();
        mVarArr[11] = new c.c.a.a.q1.z.a(0);
        mVarArr[12] = new c.c.a.a.q1.g0.c();
        if (constructor != null) {
            try {
                mVarArr[13] = constructor.newInstance(new Object[0]);
            } catch (Exception e2) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e2);
            }
        }
        return mVarArr;
    }
}
