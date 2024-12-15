package c.c.a.a.m1;

import android.content.Context;
import android.media.AudioManager;
import c.c.a.a.f1;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f2128a;

    /* renamed from: c, reason: collision with root package name */
    public final f1 f2130c;

    /* renamed from: e, reason: collision with root package name */
    public float f2132e = 1.0f;

    /* renamed from: b, reason: collision with root package name */
    public final o f2129b = new o(this, null);

    /* renamed from: d, reason: collision with root package name */
    public int f2131d = 0;

    public p(Context context, f1 f1Var) {
        this.f2128a = (AudioManager) context.getApplicationContext().getSystemService("audio");
        this.f2130c = f1Var;
    }

    public final void a(boolean z) {
        if (this.f2131d == 0) {
            return;
        }
        if (c.c.a.a.z1.l0.f3761a < 26) {
            this.f2128a.abandonAudioFocus(this.f2129b);
        }
        this.f2131d = 0;
    }
}
