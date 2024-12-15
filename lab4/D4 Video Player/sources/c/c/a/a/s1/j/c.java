package c.c.a.a.s1.j;

import android.util.Log;
import c.c.a.a.s1.g;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.z;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c implements c.c.a.a.s1.d {
    @Override // c.c.a.a.s1.d
    public c.c.a.a.s1.c a(g gVar) {
        ByteBuffer byteBuffer = gVar.f2180d;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        z zVar = new z(array, limit);
        String k = zVar.k();
        Objects.requireNonNull(k);
        String k2 = zVar.k();
        Objects.requireNonNull(k2);
        long q = zVar.q();
        long q2 = zVar.q();
        if (q2 != 0) {
            Log.w("EventMessageDecoder", "Ignoring non-zero presentation_time_delta: " + q2);
        }
        return new c.c.a.a.s1.c(new b(k, k2, l0.C(zVar.q(), 1000L, q), zVar.q(), Arrays.copyOfRange(array, zVar.f3801b, limit)));
    }
}
