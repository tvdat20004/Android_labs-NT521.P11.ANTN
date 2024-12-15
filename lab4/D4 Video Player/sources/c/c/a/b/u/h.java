package c.c.a.b.u;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class h extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public m f4018a;

    /* renamed from: b, reason: collision with root package name */
    public c.c.a.b.n.a f4019b;

    /* renamed from: c, reason: collision with root package name */
    public ColorFilter f4020c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f4021d;

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f4022e;

    /* renamed from: f, reason: collision with root package name */
    public ColorStateList f4023f;
    public ColorStateList g;
    public PorterDuff.Mode h;
    public Rect i;
    public float j;
    public float k;
    public float l;
    public int m;
    public float n;
    public float o;
    public float p;
    public int q;
    public int r;
    public int s;
    public int t;
    public boolean u;
    public Paint.Style v;

    public h(h hVar) {
        this.f4021d = null;
        this.f4022e = null;
        this.f4023f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.f4018a = hVar.f4018a;
        this.f4019b = hVar.f4019b;
        this.l = hVar.l;
        this.f4020c = hVar.f4020c;
        this.f4021d = hVar.f4021d;
        this.f4022e = hVar.f4022e;
        this.h = hVar.h;
        this.g = hVar.g;
        this.m = hVar.m;
        this.j = hVar.j;
        this.s = hVar.s;
        this.q = hVar.q;
        this.u = hVar.u;
        this.k = hVar.k;
        this.n = hVar.n;
        this.o = hVar.o;
        this.p = hVar.p;
        this.r = hVar.r;
        this.t = hVar.t;
        this.f4023f = hVar.f4023f;
        this.v = hVar.v;
        if (hVar.i != null) {
            this.i = new Rect(hVar.i);
        }
    }

    public h(m mVar, c.c.a.b.n.a aVar) {
        this.f4021d = null;
        this.f4022e = null;
        this.f4023f = null;
        this.g = null;
        this.h = PorterDuff.Mode.SRC_IN;
        this.i = null;
        this.j = 1.0f;
        this.k = 1.0f;
        this.m = 255;
        this.n = 0.0f;
        this.o = 0.0f;
        this.p = 0.0f;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.t = 0;
        this.u = false;
        this.v = Paint.Style.FILL_AND_STROKE;
        this.f4018a = mVar;
        this.f4019b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        i iVar = new i(this);
        iVar.f4028f = true;
        return iVar;
    }
}
