package c.c.a.a.w1;

import android.content.res.Configuration;
import android.content.res.Resources;
import c.c.a.a.l0;

/* loaded from: classes.dex */
public final class i implements Comparable<i> {

    /* renamed from: b, reason: collision with root package name */
    public final boolean f3416b;

    /* renamed from: c, reason: collision with root package name */
    public final k f3417c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3418d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3419e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3420f;
    public final int g;
    public final boolean h;
    public final int i;
    public final int j;
    public final int k;

    public i(l0 l0Var, k kVar, int i) {
        this.f3417c = kVar;
        int i2 = 0;
        this.f3418d = m.e(i, false);
        this.f3419e = m.c(l0Var, kVar.f3444b);
        this.h = (l0Var.f2039d & 1) != 0;
        int i3 = l0Var.w;
        this.i = i3;
        this.j = l0Var.x;
        int i4 = l0Var.f2041f;
        this.k = i4;
        this.f3416b = (i4 == -1 || i4 <= kVar.r) && (i3 == -1 || i3 <= kVar.q);
        int i5 = c.c.a.a.z1.l0.f3761a;
        Configuration configuration = Resources.getSystem().getConfiguration();
        int i6 = c.c.a.a.z1.l0.f3761a;
        String[] E = i6 >= 24 ? c.c.a.a.z1.l0.E(configuration.getLocales().toLanguageTags(), ",") : i6 >= 21 ? new String[]{configuration.locale.toLanguageTag()} : new String[]{configuration.locale.toString()};
        for (int i7 = 0; i7 < E.length; i7++) {
            E[i7] = c.c.a.a.z1.l0.x(E[i7]);
        }
        int i8 = Integer.MAX_VALUE;
        int i9 = 0;
        while (true) {
            if (i9 >= E.length) {
                break;
            }
            int c2 = m.c(l0Var, E[i9]);
            if (c2 > 0) {
                i8 = i9;
                i2 = c2;
                break;
            }
            i9++;
        }
        this.f3420f = i8;
        this.g = i2;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(i iVar) {
        int b2;
        boolean z = this.f3418d;
        if (z != iVar.f3418d) {
            return z ? 1 : -1;
        }
        int i = this.f3419e;
        int i2 = iVar.f3419e;
        if (i != i2) {
            return m.a(i, i2);
        }
        boolean z2 = this.f3416b;
        if (z2 != iVar.f3416b) {
            return z2 ? 1 : -1;
        }
        if (this.f3417c.v && (b2 = m.b(this.k, iVar.k)) != 0) {
            return b2 > 0 ? -1 : 1;
        }
        boolean z3 = this.h;
        if (z3 != iVar.h) {
            return z3 ? 1 : -1;
        }
        int i3 = this.f3420f;
        int i4 = iVar.f3420f;
        if (i3 != i4) {
            return -m.a(i3, i4);
        }
        int i5 = this.g;
        int i6 = iVar.g;
        if (i5 != i6) {
            return m.a(i5, i6);
        }
        int i7 = (this.f3416b && this.f3418d) ? 1 : -1;
        int i8 = this.i;
        int i9 = iVar.i;
        if (i8 != i9) {
            return m.a(i8, i9) * i7;
        }
        int i10 = this.j;
        int i11 = iVar.j;
        return i10 != i11 ? m.a(i10, i11) * i7 : m.a(this.k, iVar.k) * i7;
    }
}
