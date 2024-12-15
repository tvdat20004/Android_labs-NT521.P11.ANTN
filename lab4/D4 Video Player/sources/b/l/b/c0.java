package b.l.b;

import androidx.fragment.app.Fragment;
import java.util.Iterator;

/* loaded from: classes.dex */
public class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1387a;

    /* renamed from: b, reason: collision with root package name */
    public final a f1388b;

    /* renamed from: c, reason: collision with root package name */
    public int f1389c;

    public c0(a aVar, boolean z) {
        this.f1387a = z;
        this.f1388b = aVar;
    }

    public void a() {
        boolean z = this.f1389c > 0;
        Iterator<Fragment> it = this.f1388b.q.f1514c.g().iterator();
        while (it.hasNext()) {
            it.next().m0(null);
        }
        a aVar = this.f1388b;
        aVar.q.g(aVar, this.f1387a, !z, true);
    }
}
