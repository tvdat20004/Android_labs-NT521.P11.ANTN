package c.c.a.a.m1;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final y f2156a;

    /* renamed from: b, reason: collision with root package name */
    public int f2157b;

    /* renamed from: c, reason: collision with root package name */
    public long f2158c;

    /* renamed from: d, reason: collision with root package name */
    public long f2159d;

    /* renamed from: e, reason: collision with root package name */
    public long f2160e;

    /* renamed from: f, reason: collision with root package name */
    public long f2161f;

    public z(AudioTrack audioTrack) {
        if (c.c.a.a.z1.l0.f3761a >= 19) {
            this.f2156a = new y(audioTrack);
            a();
        } else {
            this.f2156a = null;
            b(3);
        }
    }

    public void a() {
        if (this.f2156a != null) {
            b(0);
        }
    }

    public final void b(int i) {
        this.f2157b = i;
        long j = 5000;
        if (i == 0) {
            this.f2160e = 0L;
            this.f2161f = -1L;
            this.f2158c = System.nanoTime() / 1000;
        } else if (i != 1) {
            if (i == 2 || i == 3) {
                j = 10000000;
            } else {
                if (i != 4) {
                    throw new IllegalStateException();
                }
                j = 500000;
            }
        }
        this.f2159d = j;
    }
}
