package c.c.a.a.y1.a1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class w {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, Object> f3602a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f3603b = new ArrayList();

    public static w a(w wVar, long j) {
        Long valueOf = Long.valueOf(j);
        Map<String, Object> map = wVar.f3602a;
        Objects.requireNonNull(valueOf);
        map.put("exo_len", valueOf);
        wVar.f3603b.remove("exo_len");
        return wVar;
    }
}
