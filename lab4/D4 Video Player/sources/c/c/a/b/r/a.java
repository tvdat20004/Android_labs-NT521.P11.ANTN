package c.c.a.b.r;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public final class a extends e {

    /* renamed from: a, reason: collision with root package name */
    public final Typeface f3988a;

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.b.p.c f3989b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3990c;

    public a(c.c.a.b.p.c cVar, Typeface typeface) {
        this.f3988a = typeface;
        this.f3989b = cVar;
    }

    @Override // c.c.a.b.r.e
    public void a(int i) {
        c(this.f3988a);
    }

    @Override // c.c.a.b.r.e
    public void b(Typeface typeface, boolean z) {
        c(typeface);
    }

    public final void c(Typeface typeface) {
        if (this.f3990c) {
            return;
        }
        c.c.a.b.p.d dVar = this.f3989b.f3957a;
        a aVar = dVar.v;
        boolean z = true;
        if (aVar != null) {
            aVar.f3990c = true;
        }
        if (dVar.s != typeface) {
            dVar.s = typeface;
        } else {
            z = false;
        }
        if (z) {
            dVar.k();
        }
    }
}
