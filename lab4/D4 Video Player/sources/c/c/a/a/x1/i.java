package c.c.a.a.x1;

import android.view.View;
import c.c.a.a.k1;
import c.c.a.a.u0;
import c.c.a.a.u1.s0;
import c.c.a.a.w0;
import c.c.a.a.x0;
import c.c.a.a.z;

/* loaded from: classes.dex */
public final class i implements x0.a, View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f3473b;

    public i(l lVar, h hVar) {
        this.f3473b = lVar;
    }

    @Override // c.c.a.a.x0.a
    public void b(boolean z, int i) {
        this.f3473b.q();
        this.f3473b.r();
    }

    @Override // c.c.a.a.x0.a
    public /* synthetic */ void c(boolean z) {
        w0.a(this, z);
    }

    @Override // c.c.a.a.x0.a
    public void e(int i) {
        this.f3473b.p();
        this.f3473b.u();
    }

    @Override // c.c.a.a.x0.a
    public /* synthetic */ void i(s0 s0Var, c.c.a.a.w1.s sVar) {
        w0.j(this, s0Var, sVar);
    }

    @Override // c.c.a.a.x0.a
    public void l(boolean z) {
        this.f3473b.t();
        this.f3473b.p();
    }

    @Override // c.c.a.a.x0.a
    public void n(k1 k1Var, Object obj, int i) {
        this.f3473b.p();
        this.f3473b.u();
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00a8 A[LOOP:0: B:40:0x0089->B:50:0x00a8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a6 A[SYNTHETIC] */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r9) {
        /*
            r8 = this;
            c.c.a.a.x1.l r0 = r8.f3473b
            c.c.a.a.x0 r1 = r0.A
            if (r1 != 0) goto L7
            return
        L7:
            android.view.View r2 = r0.f3476d
            if (r2 != r9) goto L10
            r0.g(r1)
            goto Lc7
        L10:
            android.view.View r2 = r0.f3475c
            if (r2 != r9) goto L19
            r0.h(r1)
            goto Lc7
        L19:
            android.view.View r2 = r0.g
            if (r2 != r9) goto L22
            r0.b(r1)
            goto Lc7
        L22:
            android.view.View r2 = r0.h
            if (r2 != r9) goto L2b
            r0.j(r1)
            goto Lc7
        L2b:
            android.view.View r2 = r0.f3477e
            r3 = 1
            if (r2 != r9) goto L6a
            int r9 = r1.p()
            if (r9 != r3) goto L40
            c.c.a.a.x1.l r9 = r8.f3473b
            c.c.a.a.v0 r9 = r9.E
            if (r9 == 0) goto L5c
            r9.a()
            goto L5c
        L40:
            int r9 = r1.p()
            r0 = 4
            if (r9 != r0) goto L5c
            c.c.a.a.x1.l r9 = r8.f3473b
            c.c.a.a.t r9 = r9.B
            int r0 = r1.v()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            c.c.a.a.u r9 = (c.c.a.a.u) r9
            java.util.Objects.requireNonNull(r9)
            r1.j(r0, r4)
        L5c:
            c.c.a.a.x1.l r9 = r8.f3473b
            c.c.a.a.t r9 = r9.B
            c.c.a.a.u r9 = (c.c.a.a.u) r9
            java.util.Objects.requireNonNull(r9)
            r1.c(r3)
            goto Lc7
        L6a:
            android.view.View r2 = r0.f3478f
            r4 = 0
            if (r2 != r9) goto L7a
            c.c.a.a.t r9 = r0.B
            c.c.a.a.u r9 = (c.c.a.a.u) r9
            java.util.Objects.requireNonNull(r9)
            r1.c(r4)
            goto Lc7
        L7a:
            android.widget.ImageView r2 = r0.i
            if (r2 != r9) goto Lb4
            c.c.a.a.t r9 = r0.B
            int r0 = r1.m()
            c.c.a.a.x1.l r2 = r8.f3473b
            int r2 = r2.N
            r5 = r3
        L89:
            r6 = 2
            if (r5 > r6) goto Lab
            int r7 = r0 + r5
            int r7 = r7 % 3
            if (r7 == 0) goto La3
            if (r7 == r3) goto L9c
            if (r7 == r6) goto L97
            goto La1
        L97:
            r6 = r2 & 2
            if (r6 == 0) goto La1
            goto La3
        L9c:
            r6 = r2 & 1
            if (r6 == 0) goto La1
            goto La3
        La1:
            r6 = r4
            goto La4
        La3:
            r6 = r3
        La4:
            if (r6 == 0) goto La8
            r0 = r7
            goto Lab
        La8:
            int r5 = r5 + 1
            goto L89
        Lab:
            c.c.a.a.u r9 = (c.c.a.a.u) r9
            java.util.Objects.requireNonNull(r9)
            r1.b(r0)
            goto Lc7
        Lb4:
            android.view.View r2 = r0.j
            if (r2 != r9) goto Lc7
            c.c.a.a.t r9 = r0.B
            boolean r0 = r1.r()
            r0 = r0 ^ r3
            c.c.a.a.u r9 = (c.c.a.a.u) r9
            java.util.Objects.requireNonNull(r9)
            r1.n(r0)
        Lc7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.x1.i.onClick(android.view.View):void");
    }

    @Override // c.c.a.a.x0.a
    public /* synthetic */ void p(u0 u0Var) {
        w0.b(this, u0Var);
    }

    @Override // c.c.a.a.x0.a
    public void q(int i) {
        this.f3473b.s();
        this.f3473b.p();
    }

    @Override // c.c.a.a.x0.a
    public /* synthetic */ void s(z zVar) {
        w0.c(this, zVar);
    }

    @Override // c.c.a.a.x0.a
    public /* synthetic */ void u() {
        w0.g(this);
    }
}
