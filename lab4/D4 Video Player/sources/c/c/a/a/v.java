package c.c.a.a;

/* loaded from: classes.dex */
public class v implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.y1.r f3238a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3239b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3240c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3241d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3242e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3243f;
    public final int g;
    public final boolean h;
    public final long i;
    public final boolean j;
    public int k;
    public boolean l;
    public boolean m;

    public v(c.c.a.a.y1.r rVar, int i, int i2, int i3, int i4, int i5, int i6, boolean z, int i7, boolean z2) {
        a(i4, 0, "bufferForPlaybackMs", "0");
        a(i5, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i, i4, "minBufferAudioMs", "bufferForPlaybackMs");
        a(i2, i4, "minBufferVideoMs", "bufferForPlaybackMs");
        a(i, i5, "minBufferAudioMs", "bufferForPlaybackAfterRebufferMs");
        a(i2, i5, "minBufferVideoMs", "bufferForPlaybackAfterRebufferMs");
        a(i3, i, "maxBufferMs", "minBufferAudioMs");
        a(i3, i2, "maxBufferMs", "minBufferVideoMs");
        a(i7, 0, "backBufferDurationMs", "0");
        this.f3238a = rVar;
        this.f3239b = s.a(i);
        this.f3240c = s.a(i2);
        this.f3241d = s.a(i3);
        this.f3242e = s.a(i4);
        this.f3243f = s.a(i5);
        this.g = i6;
        this.h = z;
        this.i = s.a(i7);
        this.j = z2;
    }

    public static void a(int i, int i2, String str, String str2) {
        c.c.a.a.x1.p.d(i >= i2, str + " cannot be less than " + str2);
    }

    public final void b(boolean z) {
        this.k = 0;
        this.l = false;
        if (z) {
            c.c.a.a.y1.r rVar = this.f3238a;
            synchronized (rVar) {
                if (rVar.f3657a) {
                    rVar.b(0);
                }
            }
        }
    }
}
