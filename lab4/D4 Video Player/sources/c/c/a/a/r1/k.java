package c.c.a.a.r1;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a, reason: collision with root package name */
    public final int f2707a;

    /* renamed from: b, reason: collision with root package name */
    public MediaCodecInfo[] f2708b;

    public k(boolean z, boolean z2) {
        this.f2707a = (z || z2) ? 1 : 0;
    }

    @Override // c.c.a.a.r1.i
    public int a() {
        if (this.f2708b == null) {
            this.f2708b = new MediaCodecList(this.f2707a).getCodecInfos();
        }
        return this.f2708b.length;
    }

    @Override // c.c.a.a.r1.i
    public MediaCodecInfo b(int i) {
        if (this.f2708b == null) {
            this.f2708b = new MediaCodecList(this.f2707a).getCodecInfos();
        }
        return this.f2708b[i];
    }

    @Override // c.c.a.a.r1.i
    public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // c.c.a.a.r1.i
    public boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    @Override // c.c.a.a.r1.i
    public boolean e() {
        return true;
    }
}
