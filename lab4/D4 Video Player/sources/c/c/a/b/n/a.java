package c.c.a.b.n;

import android.content.Context;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3952a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3953b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3954c;

    /* renamed from: d, reason: collision with root package name */
    public final float f3955d;

    public a(Context context) {
        this.f3952a = c.c.a.b.a.l(context, R.attr.elevationOverlayEnabled, false);
        this.f3953b = c.c.a.b.a.c(context, R.attr.elevationOverlayColor, 0);
        this.f3954c = c.c.a.b.a.c(context, R.attr.colorSurface, 0);
        this.f3955d = context.getResources().getDisplayMetrics().density;
    }
}
