package f.a.a.a.a.c;

import android.content.Context;
import c.c.a.a.y1.a1.a0;
import c.c.a.a.y1.a1.c;
import c.c.a.a.y1.a1.i;
import c.c.a.a.y1.a1.y;
import c.c.a.a.y1.n;
import c.c.a.a.y1.w;
import java.io.File;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final n.a f4330a;

    /* renamed from: b, reason: collision with root package name */
    public File f4331b;

    /* renamed from: c, reason: collision with root package name */
    public c f4332c;

    /* renamed from: d, reason: collision with root package name */
    public c.c.a.a.n1.c f4333d;

    public a(Context context, String str) {
        this.f4333d = new c.c.a.a.n1.c(context);
        this.f4331b = new File(context.getCacheDir(), "media");
        this.f4332c = new a0(this.f4331b, new y(104857600L), this.f4333d);
        this.f4330a = new i(this.f4332c, new w(context, new c.c.a.a.y1.y(str, null, 8000, 8000, true)), 3);
    }
}
