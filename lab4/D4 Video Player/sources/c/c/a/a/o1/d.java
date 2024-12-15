package c.c.a.a.o1;

import android.media.MediaCodec;
import c.c.a.a.z1.l0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f2168a;

    /* renamed from: b, reason: collision with root package name */
    public int[] f2169b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f2170c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaCodec.CryptoInfo f2171d;

    /* renamed from: e, reason: collision with root package name */
    public final c f2172e;

    public d() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f2171d = cryptoInfo;
        this.f2172e = l0.f3761a >= 24 ? new c(cryptoInfo, null) : null;
    }
}
