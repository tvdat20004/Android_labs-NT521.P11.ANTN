package b.t;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class q extends c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1768c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ArrayList f1771f;
    public final /* synthetic */ s g;

    public q(s sVar, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
        this.g = sVar;
        this.f1766a = obj;
        this.f1767b = arrayList;
        this.f1768c = obj2;
        this.f1769d = arrayList2;
        this.f1770e = obj3;
        this.f1771f = arrayList3;
    }

    @Override // b.t.c0, b.t.a0
    public void c(b0 b0Var) {
        Object obj = this.f1766a;
        if (obj != null) {
            this.g.n(obj, this.f1767b, null);
        }
        Object obj2 = this.f1768c;
        if (obj2 != null) {
            this.g.n(obj2, this.f1769d, null);
        }
        Object obj3 = this.f1770e;
        if (obj3 != null) {
            this.g.n(obj3, this.f1771f, null);
        }
    }

    @Override // b.t.a0
    public void e(b0 b0Var) {
        b0Var.v(this);
    }
}
