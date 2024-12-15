package e.a.a;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;

/* loaded from: classes.dex */
public final class h extends ScheduledThreadPoolExecutor {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f4309a = 0;

    public h(f fVar) {
        super(1, new ThreadPoolExecutor.DiscardPolicy());
    }
}
