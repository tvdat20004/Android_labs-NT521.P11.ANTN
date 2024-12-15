package c.c.a.b.u;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import java.util.Objects;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public d f4030a;

    /* renamed from: b, reason: collision with root package name */
    public d f4031b;

    /* renamed from: c, reason: collision with root package name */
    public d f4032c;

    /* renamed from: d, reason: collision with root package name */
    public d f4033d;

    /* renamed from: e, reason: collision with root package name */
    public c f4034e;

    /* renamed from: f, reason: collision with root package name */
    public c f4035f;
    public c g;
    public c h;
    public f i;
    public f j;
    public f k;
    public f l;

    public m() {
        this.f4030a = new k();
        this.f4031b = new k();
        this.f4032c = new k();
        this.f4033d = new k();
        this.f4034e = new c.c.a.b.u.a(0.0f);
        this.f4035f = new c.c.a.b.u.a(0.0f);
        this.g = new c.c.a.b.u.a(0.0f);
        this.h = new c.c.a.b.u.a(0.0f);
        this.i = new f();
        this.j = new f();
        this.k = new f();
        this.l = new f();
    }

    public static a a(Context context, int i, int i2, c cVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, c.c.a.b.b.s);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            c c2 = c(obtainStyledAttributes, 5, cVar);
            c c3 = c(obtainStyledAttributes, 8, c2);
            c c4 = c(obtainStyledAttributes, 9, c2);
            c c5 = c(obtainStyledAttributes, 7, c2);
            c c6 = c(obtainStyledAttributes, 6, c2);
            a aVar = new a();
            d a2 = c.c.a.b.a.a(i4);
            aVar.f4036a = a2;
            a.b(a2);
            aVar.f4040e = c3;
            d a3 = c.c.a.b.a.a(i5);
            aVar.f4037b = a3;
            a.b(a3);
            aVar.f4041f = c4;
            d a4 = c.c.a.b.a.a(i6);
            aVar.f4038c = a4;
            a.b(a4);
            aVar.g = c5;
            d a5 = c.c.a.b.a.a(i7);
            aVar.f4039d = a5;
            a.b(a5);
            aVar.h = c6;
            return aVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static a b(Context context, AttributeSet attributeSet, int i, int i2) {
        c.c.a.b.u.a aVar = new c.c.a.b.u.a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.c.a.b.b.o, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, aVar);
    }

    public static c c(TypedArray typedArray, int i, c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new c.c.a.b.u.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new j(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public boolean d(RectF rectF) {
        boolean z = this.l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.k.getClass().equals(f.class);
        float a2 = this.f4034e.a(rectF);
        return z && ((this.f4035f.a(rectF) > a2 ? 1 : (this.f4035f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f4031b instanceof k) && (this.f4030a instanceof k) && (this.f4032c instanceof k) && (this.f4033d instanceof k));
    }

    public m e(float f2) {
        a aVar = new a(this);
        aVar.f4040e = new c.c.a.b.u.a(f2);
        aVar.f4041f = new c.c.a.b.u.a(f2);
        aVar.g = new c.c.a.b.u.a(f2);
        aVar.h = new c.c.a.b.u.a(f2);
        return aVar.a();
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public d f4036a;

        /* renamed from: b, reason: collision with root package name */
        public d f4037b;

        /* renamed from: c, reason: collision with root package name */
        public d f4038c;

        /* renamed from: d, reason: collision with root package name */
        public d f4039d;

        /* renamed from: e, reason: collision with root package name */
        public c f4040e;

        /* renamed from: f, reason: collision with root package name */
        public c f4041f;
        public c g;
        public c h;
        public f i;
        public f j;
        public f k;
        public f l;

        public a() {
            this.f4036a = new k();
            this.f4037b = new k();
            this.f4038c = new k();
            this.f4039d = new k();
            this.f4040e = new c.c.a.b.u.a(0.0f);
            this.f4041f = new c.c.a.b.u.a(0.0f);
            this.g = new c.c.a.b.u.a(0.0f);
            this.h = new c.c.a.b.u.a(0.0f);
            this.i = new f();
            this.j = new f();
            this.k = new f();
            this.l = new f();
        }

        public static float b(d dVar) {
            Object obj;
            if (dVar instanceof k) {
                obj = (k) dVar;
            } else {
                if (!(dVar instanceof e)) {
                    return -1.0f;
                }
                obj = (e) dVar;
            }
            Objects.requireNonNull(obj);
            return -1.0f;
        }

        public m a() {
            return new m(this, null);
        }

        public a c(float f2) {
            this.h = new c.c.a.b.u.a(f2);
            return this;
        }

        public a d(float f2) {
            this.g = new c.c.a.b.u.a(f2);
            return this;
        }

        public a e(float f2) {
            this.f4040e = new c.c.a.b.u.a(f2);
            return this;
        }

        public a f(float f2) {
            this.f4041f = new c.c.a.b.u.a(f2);
            return this;
        }

        public a(m mVar) {
            this.f4036a = new k();
            this.f4037b = new k();
            this.f4038c = new k();
            this.f4039d = new k();
            this.f4040e = new c.c.a.b.u.a(0.0f);
            this.f4041f = new c.c.a.b.u.a(0.0f);
            this.g = new c.c.a.b.u.a(0.0f);
            this.h = new c.c.a.b.u.a(0.0f);
            this.i = new f();
            this.j = new f();
            this.k = new f();
            this.l = new f();
            this.f4036a = mVar.f4030a;
            this.f4037b = mVar.f4031b;
            this.f4038c = mVar.f4032c;
            this.f4039d = mVar.f4033d;
            this.f4040e = mVar.f4034e;
            this.f4041f = mVar.f4035f;
            this.g = mVar.g;
            this.h = mVar.h;
            this.i = mVar.i;
            this.j = mVar.j;
            this.k = mVar.k;
            this.l = mVar.l;
        }
    }

    public m(a aVar, l lVar) {
        this.f4030a = aVar.f4036a;
        this.f4031b = aVar.f4037b;
        this.f4032c = aVar.f4038c;
        this.f4033d = aVar.f4039d;
        this.f4034e = aVar.f4040e;
        this.f4035f = aVar.f4041f;
        this.g = aVar.g;
        this.h = aVar.h;
        this.i = aVar.i;
        this.j = aVar.j;
        this.k = aVar.k;
        this.l = aVar.l;
    }
}
