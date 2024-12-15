package c.c.a.a.a2;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.os.Handler;

@TargetApi(23)
/* loaded from: classes.dex */
public final class r implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s f1958a;

    public r(s sVar, MediaCodec mediaCodec, p pVar) {
        this.f1958a = sVar;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    @Override // android.media.MediaCodec.OnFrameRenderedListener
    public void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        s sVar = this.f1958a;
        if (this != sVar.W0) {
            return;
        }
        sVar.m0(j);
    }
}
