package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import c.c.a.a.x1.q;

/* loaded from: classes.dex */
public final class AspectRatioFrameLayout extends FrameLayout {

    /* renamed from: b, reason: collision with root package name */
    public final c f4151b;

    /* renamed from: c, reason: collision with root package name */
    public b f4152c;

    /* renamed from: d, reason: collision with root package name */
    public float f4153d;

    /* renamed from: e, reason: collision with root package name */
    public int f4154e;

    public interface b {
        void a(float f2, float f3, boolean z);
    }

    public final class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public float f4155b;

        /* renamed from: c, reason: collision with root package name */
        public float f4156c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f4157d;

        /* renamed from: e, reason: collision with root package name */
        public boolean f4158e;

        public c(a aVar) {
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4158e = false;
            b bVar = AspectRatioFrameLayout.this.f4152c;
            if (bVar == null) {
                return;
            }
            bVar.a(this.f4155b, this.f4156c, this.f4157d);
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4154e = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, q.f3485a, 0, 0);
            try {
                this.f4154e = obtainStyledAttributes.getInt(0, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.f4151b = new c(null);
    }

    public int getResizeMode() {
        return this.f4154e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004f, code lost:
    
        if (r4 > 0.0f) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0054, code lost:
    
        if (r4 > 0.0f) goto L24;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.f4153d
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto Lb
            return
        Lb:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.f4153d
            float r4 = r4 / r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            r6 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            r6 = 1
            if (r5 > 0) goto L40
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r9 = r8.f4151b
            float r10 = r8.f4153d
            r0 = 0
            r9.f4155b = r10
            r9.f4156c = r3
            r9.f4157d = r0
            boolean r10 = r9.f4158e
            if (r10 != 0) goto L3f
            r9.f4158e = r6
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r10 = com.google.android.exoplayer2.ui.AspectRatioFrameLayout.this
            r10.post(r9)
        L3f:
            return
        L40:
            int r5 = r8.f4154e
            if (r5 == 0) goto L52
            if (r5 == r6) goto L56
            r7 = 2
            if (r5 == r7) goto L5b
            r7 = 4
            if (r5 == r7) goto L4d
            goto L5f
        L4d:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L56
            goto L5b
        L52:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 <= 0) goto L5b
        L56:
            float r10 = r8.f4153d
            float r1 = r1 / r10
            int r0 = (int) r1
            goto L5f
        L5b:
            float r9 = r8.f4153d
            float r2 = r2 * r9
            int r9 = (int) r2
        L5f:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r10 = r8.f4151b
            float r1 = r8.f4153d
            r10.f4155b = r1
            r10.f4156c = r3
            r10.f4157d = r6
            boolean r1 = r10.f4158e
            if (r1 != 0) goto L74
            r10.f4158e = r6
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout r1 = com.google.android.exoplayer2.ui.AspectRatioFrameLayout.this
            r1.post(r10)
        L74:
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f2) {
        if (this.f4153d != f2) {
            this.f4153d = f2;
            requestLayout();
        }
    }

    public void setAspectRatioListener(b bVar) {
        this.f4152c = bVar;
    }

    public void setResizeMode(int i) {
        if (this.f4154e != i) {
            this.f4154e = i;
            requestLayout();
        }
    }
}
