package b.n;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, p> f1547a = new HashMap<>();

    public final void a() {
        for (p pVar : this.f1547a.values()) {
            Map<String, Object> map = pVar.f1546a;
            if (map != null) {
                synchronized (map) {
                    for (Object obj : pVar.f1546a.values()) {
                        if (obj instanceof Closeable) {
                            try {
                                ((Closeable) obj).close();
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        }
                    }
                }
            }
            pVar.a();
        }
        this.f1547a.clear();
    }
}
