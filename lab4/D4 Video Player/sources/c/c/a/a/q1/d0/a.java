package c.c.a.a.q1.d0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class a extends c {
    public final long g1;
    public final List<b> h1;
    public final List<a> i1;

    public a(int i, long j) {
        super(i);
        this.g1 = j;
        this.h1 = new ArrayList();
        this.i1 = new ArrayList();
    }

    public a b(int i) {
        int size = this.i1.size();
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.i1.get(i2);
            if (aVar.f2299a == i) {
                return aVar;
            }
        }
        return null;
    }

    public b c(int i) {
        int size = this.h1.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.h1.get(i2);
            if (bVar.f2299a == i) {
                return bVar;
            }
        }
        return null;
    }

    @Override // c.c.a.a.q1.d0.c
    public String toString() {
        return c.a(this.f2299a) + " leaves: " + Arrays.toString(this.h1.toArray()) + " containers: " + Arrays.toString(this.i1.toArray());
    }
}
