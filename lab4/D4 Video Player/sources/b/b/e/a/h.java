package b.b.e.a;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

@SuppressLint({"RestrictedAPI"})
/* loaded from: classes.dex */
public class h extends n {
    public c q;
    public g r;
    public int s;
    public int t;
    public boolean u;

    public h(c cVar, Resources resources) {
        super(null);
        this.s = -1;
        this.t = -1;
        d(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0216, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x021d, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01f8, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(c.a.a.a.a.i(r21, new java.lang.StringBuilder(), ": <transition> tag requires 'fromId' & 'toId' attributes"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static b.b.e.a.h e(android.content.Context r19, android.content.res.Resources r20, org.xmlpull.v1.XmlPullParser r21, android.util.AttributeSet r22, android.content.res.Resources.Theme r23) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.e.a.h.e(android.content.Context, android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):b.b.e.a.h");
    }

    @Override // b.b.e.a.l
    public void d(k kVar) {
        this.f514b = kVar;
        int i = this.h;
        if (i >= 0) {
            Drawable d2 = kVar.d(i);
            this.f516d = d2;
            if (d2 != null) {
                b(d2);
            }
        }
        this.f517e = null;
        this.o = (m) kVar;
        if (kVar instanceof c) {
            this.q = (c) kVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // b.b.e.a.l, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.r;
        if (gVar != null) {
            gVar.d();
            this.r = null;
            c(this.s);
            this.s = -1;
            this.t = -1;
        }
    }

    @Override // b.b.e.a.n, b.b.e.a.l, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.u) {
            super.mutate();
            if (this == this) {
                this.q.e();
                this.u = true;
            }
        }
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00ea, code lost:
    
        if (c(r1) == false) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // b.b.e.a.n, android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.e.a.h.onStateChange(int[]):boolean");
    }

    @Override // b.b.e.a.l, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        g gVar = this.r;
        if (gVar != null && (visible || z2)) {
            if (z) {
                gVar.c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }
}
