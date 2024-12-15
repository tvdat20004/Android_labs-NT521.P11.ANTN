package b.h.c.a;

import android.graphics.Typeface;

/* loaded from: classes.dex */
public class g implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Typeface f1151b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f1152c;

    public g(i iVar, Typeface typeface) {
        this.f1152c = iVar;
        this.f1151b = typeface;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1152c.d(this.f1151b);
    }
}
