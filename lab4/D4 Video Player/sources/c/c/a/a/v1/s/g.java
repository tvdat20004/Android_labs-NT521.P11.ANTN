package c.c.a.a.v1.s;

import android.text.Layout;
import c.c.a.a.x1.p;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public String f3356a;

    /* renamed from: b, reason: collision with root package name */
    public int f3357b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3358c;

    /* renamed from: d, reason: collision with root package name */
    public int f3359d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3360e;

    /* renamed from: f, reason: collision with root package name */
    public int f3361f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public float k;
    public String l;
    public Layout.Alignment m;

    public g a(g gVar) {
        if (gVar != null) {
            if (!this.f3358c && gVar.f3358c) {
                int i = gVar.f3357b;
                p.g(true);
                this.f3357b = i;
                this.f3358c = true;
            }
            if (this.h == -1) {
                this.h = gVar.h;
            }
            if (this.i == -1) {
                this.i = gVar.i;
            }
            if (this.f3356a == null) {
                this.f3356a = gVar.f3356a;
            }
            if (this.f3361f == -1) {
                this.f3361f = gVar.f3361f;
            }
            if (this.g == -1) {
                this.g = gVar.g;
            }
            if (this.m == null) {
                this.m = gVar.m;
            }
            if (this.j == -1) {
                this.j = gVar.j;
                this.k = gVar.k;
            }
            if (!this.f3360e && gVar.f3360e) {
                this.f3359d = gVar.f3359d;
                this.f3360e = true;
            }
        }
        return this;
    }

    public int b() {
        int i = this.h;
        if (i == -1 && this.i == -1) {
            return -1;
        }
        return (i == 1 ? 1 : 0) | (this.i == 1 ? 2 : 0);
    }
}
