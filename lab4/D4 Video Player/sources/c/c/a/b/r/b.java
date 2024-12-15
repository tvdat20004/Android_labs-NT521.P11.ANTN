package c.c.a.b.r;

import android.graphics.Typeface;
import b.h.c.a.i;

/* loaded from: classes.dex */
public class b extends i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f3991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f3992b;

    public b(d dVar, e eVar) {
        this.f3992b = dVar;
        this.f3991a = eVar;
    }

    @Override // b.h.c.a.i
    public void c(int i) {
        this.f3992b.k = true;
        this.f3991a.a(i);
    }

    @Override // b.h.c.a.i
    public void d(Typeface typeface) {
        d dVar = this.f3992b;
        dVar.l = Typeface.create(typeface, dVar.f3998c);
        d dVar2 = this.f3992b;
        dVar2.k = true;
        this.f3991a.b(dVar2.l, false);
    }
}
