package c.c.a.a.r1;

import c.c.a.a.z1.l0;
import java.util.Comparator;

/* loaded from: classes.dex */
public final class m implements Comparator<a> {
    public m(f fVar) {
    }

    public static int a(a aVar) {
        String str = aVar.f2693a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return -1;
        }
        return (l0.f3761a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : 1;
    }

    @Override // java.util.Comparator
    public int compare(a aVar, a aVar2) {
        return a(aVar) - a(aVar2);
    }
}
