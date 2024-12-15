package e.a.b;

import android.content.Context;

/* loaded from: classes.dex */
public class e implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Context f4321b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f4322c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f4323d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f4324e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g f4325f;

    public e(g gVar, Context context, String str, String str2, d dVar) {
        this.f4325f = gVar;
        this.f4321b = context;
        this.f4322c = str;
        this.f4323d = str2;
        this.f4324e = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f4325f.d(this.f4321b, this.f4322c, this.f4323d);
            this.f4324e.b();
        } catch (c | UnsatisfiedLinkError e2) {
            this.f4324e.a(e2);
        }
    }
}
