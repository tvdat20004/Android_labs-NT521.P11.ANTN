package c.c.a.a.m1;

import android.media.AudioTrack;

/* loaded from: classes.dex */
public class e0 extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioTrack f2084b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j0 f2085c;

    public e0(j0 j0Var, AudioTrack audioTrack) {
        this.f2085c = j0Var;
        this.f2084b = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        try {
            this.f2084b.flush();
            this.f2084b.release();
        } finally {
            this.f2085c.g.open();
        }
    }
}
