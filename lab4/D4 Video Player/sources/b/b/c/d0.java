package b.b.c;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f418a;

    /* renamed from: b, reason: collision with root package name */
    public int f419b;

    /* renamed from: c, reason: collision with root package name */
    public int f420c;

    /* renamed from: d, reason: collision with root package name */
    public int f421d;

    /* renamed from: e, reason: collision with root package name */
    public ViewGroup f422e;

    /* renamed from: f, reason: collision with root package name */
    public View f423f;
    public View g;
    public b.b.h.m.l h;
    public b.b.h.m.j i;
    public Context j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o = false;
    public boolean p;
    public Bundle q;

    public d0(int i) {
        this.f418a = i;
    }

    public void a(b.b.h.m.l lVar) {
        b.b.h.m.j jVar;
        b.b.h.m.l lVar2 = this.h;
        if (lVar == lVar2) {
            return;
        }
        if (lVar2 != null) {
            lVar2.u(this.i);
        }
        this.h = lVar;
        if (lVar == null || (jVar = this.i) == null) {
            return;
        }
        lVar.b(jVar, lVar.f604a);
    }
}
