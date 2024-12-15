package c.c.a.a.u1.w0;

import android.net.Uri;
import c.c.a.a.y1.s0;
import c.c.a.a.z1.l0;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* loaded from: classes.dex */
public final class n implements s0.a<Long> {
    public n(DashMediaSource.a aVar) {
    }

    @Override // c.c.a.a.y1.s0.a
    public Long a(Uri uri, InputStream inputStream) {
        return Long.valueOf(l0.z(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
    }
}
