package c.b.a;

import android.graphics.SurfaceTexture;

/* loaded from: classes.dex */
public class f implements SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: b, reason: collision with root package name */
    public SurfaceTexture f1875b;

    /* renamed from: c, reason: collision with root package name */
    public SurfaceTexture.OnFrameAvailableListener f1876c;

    public f(int i) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(i);
        this.f1875b = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture.OnFrameAvailableListener onFrameAvailableListener = this.f1876c;
        if (onFrameAvailableListener != null) {
            onFrameAvailableListener.onFrameAvailable(this.f1875b);
        }
    }
}
