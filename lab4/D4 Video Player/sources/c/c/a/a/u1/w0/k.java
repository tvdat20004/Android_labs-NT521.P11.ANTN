package c.c.a.a.u1.w0;

import c.c.a.a.y1.r0;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import java.io.IOException;

/* loaded from: classes.dex */
public final class k implements r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DashMediaSource f2998a;

    public k(DashMediaSource dashMediaSource) {
        this.f2998a = dashMediaSource;
    }

    @Override // c.c.a.a.y1.r0
    public void a() {
        this.f2998a.y.e(Integer.MIN_VALUE);
        IOException iOException = this.f2998a.A;
        if (iOException != null) {
            throw iOException;
        }
    }
}
