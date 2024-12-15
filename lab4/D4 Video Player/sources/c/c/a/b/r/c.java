package c.c.a.b.r;

import android.graphics.Typeface;
import android.text.TextPaint;

/* loaded from: classes.dex */
public class c extends e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ TextPaint f3993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f3994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f3995c;

    public c(d dVar, TextPaint textPaint, e eVar) {
        this.f3995c = dVar;
        this.f3993a = textPaint;
        this.f3994b = eVar;
    }

    @Override // c.c.a.b.r.e
    public void a(int i) {
        this.f3994b.a(i);
    }

    @Override // c.c.a.b.r.e
    public void b(Typeface typeface, boolean z) {
        this.f3995c.d(this.f3993a, typeface);
        this.f3994b.b(typeface, z);
    }
}
