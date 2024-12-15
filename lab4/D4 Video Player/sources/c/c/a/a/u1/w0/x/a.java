package c.c.a.a.u1.w0.x;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f3033a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3034b;

    /* renamed from: c, reason: collision with root package name */
    public final List<m> f3035c;

    /* renamed from: d, reason: collision with root package name */
    public final List<e> f3036d;

    /* renamed from: e, reason: collision with root package name */
    public final List<e> f3037e;

    public a(int i, int i2, List<m> list, List<e> list2, List<e> list3) {
        this.f3033a = i;
        this.f3034b = i2;
        this.f3035c = Collections.unmodifiableList(list);
        this.f3036d = list2 == null ? Collections.emptyList() : Collections.unmodifiableList(list2);
        this.f3037e = list3 == null ? Collections.emptyList() : Collections.unmodifiableList(list3);
    }
}
