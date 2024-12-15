package c.c.a.a.v1.n;

import android.text.Layout;

/* loaded from: classes.dex */
public final class d extends c.c.a.a.v1.b implements Comparable<d> {
    public final int q;

    public d(CharSequence charSequence, Layout.Alignment alignment, float f2, int i, int i2, float f3, int i3, float f4, boolean z, int i4, int i5) {
        super(charSequence, alignment, f2, i, i2, f3, i3, f4, z, i4);
        this.q = i5;
    }

    @Override // java.lang.Comparable
    public int compareTo(d dVar) {
        int i = dVar.q;
        int i2 = this.q;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }
}
