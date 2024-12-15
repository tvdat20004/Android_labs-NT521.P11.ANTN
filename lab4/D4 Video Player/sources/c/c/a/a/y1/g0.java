package c.c.a.a.y1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, String> f3622a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public Map<String, String> f3623b;

    public synchronized Map<String, String> a() {
        if (this.f3623b == null) {
            this.f3623b = Collections.unmodifiableMap(new HashMap(this.f3622a));
        }
        return this.f3623b;
    }
}
