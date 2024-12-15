package c.c.a.a.r1;

import java.util.Comparator;

/* loaded from: classes.dex */
public final class l implements Comparator<a> {
    public l(f fVar) {
    }

    @Override // java.util.Comparator
    public int compare(a aVar, a aVar2) {
        return (aVar.f2693a.startsWith("OMX.google") ? -1 : 0) - (aVar2.f2693a.startsWith("OMX.google") ? -1 : 0);
    }
}
