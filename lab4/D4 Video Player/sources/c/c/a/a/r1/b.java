package c.c.a.a.r1;

import c.c.a.a.l0;

/* loaded from: classes.dex */
public class b extends Exception {

    /* renamed from: b, reason: collision with root package name */
    public final String f2699b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2700c;

    /* renamed from: d, reason: collision with root package name */
    public final String f2701d;

    /* renamed from: e, reason: collision with root package name */
    public final String f2702e;

    public b(l0 l0Var, Throwable th, boolean z, int i) {
        this("Decoder init failed: [" + i + "], " + l0Var, th, l0Var.j, z, null, "com.google.android.exoplayer.MediaCodecTrackRenderer_" + (i < 0 ? "neg_" : "") + Math.abs(i), null);
    }

    public b(String str, Throwable th, String str2, boolean z, String str3, String str4, b bVar) {
        super(str, th);
        this.f2699b = str2;
        this.f2700c = z;
        this.f2701d = str3;
        this.f2702e = str4;
    }
}
