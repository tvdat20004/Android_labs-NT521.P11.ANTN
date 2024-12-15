package c.c.a.a.m1;

import android.media.AudioTrack;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final i0 f2061a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f2062b;

    /* renamed from: c, reason: collision with root package name */
    public AudioTrack f2063c;

    /* renamed from: d, reason: collision with root package name */
    public int f2064d;

    /* renamed from: e, reason: collision with root package name */
    public int f2065e;

    /* renamed from: f, reason: collision with root package name */
    public z f2066f;
    public int g;
    public boolean h;
    public long i;
    public long j;
    public long k;
    public Method l;
    public long m;
    public boolean n;
    public boolean o;
    public long p;
    public long q;
    public long r;
    public long s;
    public int t;
    public int u;
    public long v;
    public long w;
    public long x;
    public long y;

    public a0(i0 i0Var) {
        this.f2061a = i0Var;
        if (c.c.a.a.z1.l0.f3761a >= 18) {
            try {
                this.l = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f2062b = new long[10];
    }

    public final long a(long j) {
        return (j * 1000000) / this.g;
    }

    public final long b() {
        AudioTrack audioTrack = this.f2063c;
        Objects.requireNonNull(audioTrack);
        if (this.v != -9223372036854775807L) {
            return Math.min(this.y, this.x + ((((SystemClock.elapsedRealtime() * 1000) - this.v) * this.g) / 1000000));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = 4294967295L & audioTrack.getPlaybackHeadPosition();
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.s = this.q;
            }
            playbackHeadPosition += this.s;
        }
        if (c.c.a.a.z1.l0.f3761a <= 29) {
            if (playbackHeadPosition == 0 && this.q > 0 && playState == 3) {
                if (this.w == -9223372036854775807L) {
                    this.w = SystemClock.elapsedRealtime();
                }
                return this.q;
            }
            this.w = -9223372036854775807L;
        }
        if (this.q > playbackHeadPosition) {
            this.r++;
        }
        this.q = playbackHeadPosition;
        return playbackHeadPosition + (this.r << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean c(long r6) {
        /*
            r5 = this;
            long r0 = r5.b()
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r7 = 0
            r0 = 1
            if (r6 > 0) goto L29
            boolean r6 = r5.h
            if (r6 == 0) goto L26
            android.media.AudioTrack r6 = r5.f2063c
            java.util.Objects.requireNonNull(r6)
            int r6 = r6.getPlayState()
            r1 = 2
            if (r6 != r1) goto L26
            long r1 = r5.b()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L26
            r6 = r0
            goto L27
        L26:
            r6 = r7
        L27:
            if (r6 == 0) goto L2a
        L29:
            r7 = r0
        L2a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.m1.a0.c(long):boolean");
    }
}
