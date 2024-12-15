package c.c.a.a.r1;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* loaded from: classes.dex */
public final class j implements i {
    public j(f fVar) {
    }

    @Override // c.c.a.a.r1.i
    public int a() {
        return MediaCodecList.getCodecCount();
    }

    @Override // c.c.a.a.r1.i
    public MediaCodecInfo b(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    @Override // c.c.a.a.r1.i
    public boolean c(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    @Override // c.c.a.a.r1.i
    public boolean d(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    @Override // c.c.a.a.r1.i
    public boolean e() {
        return false;
    }
}
