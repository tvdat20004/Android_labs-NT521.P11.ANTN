package c.c.a.a.y1.a1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract /* synthetic */ class u {
    public static long a(v vVar) {
        x xVar = (x) vVar;
        if (xVar.f3606b.containsKey("exo_len")) {
            return ByteBuffer.wrap(xVar.f3606b.get("exo_len")).getLong();
        }
        return -1L;
    }
}
