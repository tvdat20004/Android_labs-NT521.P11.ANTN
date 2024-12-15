package c.c.a.b.p;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public class m {

    /* renamed from: c, reason: collision with root package name */
    public float f3973c;

    /* renamed from: e, reason: collision with root package name */
    public WeakReference<l> f3975e;

    /* renamed from: f, reason: collision with root package name */
    public c.c.a.b.r.d f3976f;

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f3971a = new TextPaint(1);

    /* renamed from: b, reason: collision with root package name */
    public final c.c.a.b.r.e f3972b = new k(this);

    /* renamed from: d, reason: collision with root package name */
    public boolean f3974d = true;

    public m(l lVar) {
        this.f3975e = new WeakReference<>(null);
        this.f3975e = new WeakReference<>(lVar);
    }

    public float a(String str) {
        if (!this.f3974d) {
            return this.f3973c;
        }
        float measureText = str == null ? 0.0f : this.f3971a.measureText((CharSequence) str, 0, str.length());
        this.f3973c = measureText;
        this.f3974d = false;
        return measureText;
    }

    public void b(c.c.a.b.r.d dVar, Context context) {
        if (this.f3976f != dVar) {
            this.f3976f = dVar;
            if (dVar != null) {
                TextPaint textPaint = this.f3971a;
                c.c.a.b.r.e eVar = this.f3972b;
                dVar.a();
                dVar.d(textPaint, dVar.l);
                dVar.b(context, new c.c.a.b.r.c(dVar, textPaint, eVar));
                l lVar = this.f3975e.get();
                if (lVar != null) {
                    this.f3971a.drawableState = lVar.getState();
                }
                dVar.c(context, this.f3971a, this.f3972b);
                this.f3974d = true;
            }
            l lVar2 = this.f3975e.get();
            if (lVar2 != null) {
                lVar2.a();
                lVar2.onStateChange(lVar2.getState());
            }
        }
    }
}
