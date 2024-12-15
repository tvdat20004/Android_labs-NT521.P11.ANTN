package c.c.a.a.x1;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import c.c.a.a.k1;
import c.c.a.a.x0;
import c.c.a.a.z1.l0;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public class f extends View implements s {
    public final float A;
    public int B;
    public long C;
    public int D;
    public boolean E;
    public long F;
    public long G;
    public long H;
    public long I;
    public int J;
    public long[] K;
    public boolean[] L;

    /* renamed from: b, reason: collision with root package name */
    public final Rect f3467b;

    /* renamed from: c, reason: collision with root package name */
    public final Rect f3468c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f3469d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f3470e;

    /* renamed from: f, reason: collision with root package name */
    public final Paint f3471f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final Paint k;
    public final Drawable l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final StringBuilder u;
    public final Formatter v;
    public final Runnable w;
    public final CopyOnWriteArraySet<i> x;
    public final int[] y;
    public final Point z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    public f(Context context, AttributeSet attributeSet, int i, AttributeSet attributeSet2) {
        super(context, null, i);
        ?? r2;
        int max;
        Paint paint;
        this.f3467b = new Rect();
        this.f3468c = new Rect();
        this.f3469d = new Rect();
        this.f3470e = new Rect();
        Paint paint2 = new Paint();
        this.f3471f = paint2;
        Paint paint3 = new Paint();
        this.g = paint3;
        Paint paint4 = new Paint();
        this.h = paint4;
        Paint paint5 = new Paint();
        this.i = paint5;
        Paint paint6 = new Paint();
        this.j = paint6;
        Paint paint7 = new Paint();
        this.k = paint7;
        paint7.setAntiAlias(true);
        this.x = new CopyOnWriteArraySet<>();
        this.y = new int[2];
        this.z = new Point();
        float f2 = context.getResources().getDisplayMetrics().density;
        this.A = f2;
        this.t = a(f2, -50);
        int a2 = a(f2, 4);
        int a3 = a(f2, 26);
        int a4 = a(f2, 4);
        int a5 = a(f2, 12);
        int a6 = a(f2, 0);
        int a7 = a(f2, 16);
        if (attributeSet2 != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, q.f3486b, 0, 0);
            try {
                Drawable drawable = obtainStyledAttributes.getDrawable(9);
                this.l = drawable;
                if (drawable != null) {
                    int i2 = l0.f3761a;
                    if (i2 >= 23) {
                        paint = paint5;
                        int layoutDirection = getLayoutDirection();
                        if (i2 >= 23) {
                            drawable.setLayoutDirection(layoutDirection);
                        }
                    } else {
                        paint = paint5;
                    }
                    a3 = Math.max(drawable.getMinimumHeight(), a3);
                } else {
                    paint = paint5;
                }
                this.m = obtainStyledAttributes.getDimensionPixelSize(2, a2);
                this.n = obtainStyledAttributes.getDimensionPixelSize(11, a3);
                this.o = obtainStyledAttributes.getDimensionPixelSize(1, a4);
                this.p = obtainStyledAttributes.getDimensionPixelSize(10, a5);
                this.q = obtainStyledAttributes.getDimensionPixelSize(7, a6);
                this.r = obtainStyledAttributes.getDimensionPixelSize(8, a7);
                int i3 = obtainStyledAttributes.getInt(5, -1);
                int i4 = obtainStyledAttributes.getInt(6, (-16777216) | i3);
                int i5 = i3 & 16777215;
                int i6 = obtainStyledAttributes.getInt(3, (-872415232) | i5);
                int i7 = obtainStyledAttributes.getInt(12, i5 | 855638016);
                int i8 = obtainStyledAttributes.getInt(0, -1291845888);
                int i9 = obtainStyledAttributes.getInt(4, (16777215 & i8) | 855638016);
                paint2.setColor(i3);
                paint7.setColor(i4);
                paint3.setColor(i6);
                paint4.setColor(i7);
                paint.setColor(i8);
                paint6.setColor(i9);
            } finally {
                obtainStyledAttributes.recycle();
            }
        } else {
            this.m = a2;
            this.n = a3;
            this.o = a4;
            this.p = a5;
            this.q = a6;
            this.r = a7;
            paint2.setColor(-1);
            paint7.setColor(-1);
            paint3.setColor(-855638017);
            paint4.setColor(872415231);
            paint5.setColor(-1291845888);
            this.l = null;
        }
        StringBuilder sb = new StringBuilder();
        this.u = sb;
        this.v = new Formatter(sb, Locale.getDefault());
        this.w = new Runnable() { // from class: c.c.a.a.x1.b
            @Override // java.lang.Runnable
            public final void run() {
                f.this.e(false);
            }
        };
        Drawable drawable2 = this.l;
        if (drawable2 != null) {
            max = drawable2.getMinimumWidth();
            r2 = 1;
        } else {
            r2 = 1;
            max = Math.max(this.q, Math.max(this.p, this.r));
        }
        this.s = (max + r2) / 2;
        this.G = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.B = 20;
        setFocusable((boolean) r2);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(r2);
        }
    }

    public static int a(float f2, int i) {
        return (int) ((i * f2) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.C;
        if (j != -9223372036854775807L) {
            return j;
        }
        long j2 = this.G;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        return j2 / this.B;
    }

    private String getProgressText() {
        return l0.r(this.u, this.v, this.H);
    }

    private long getScrubberPosition() {
        if (this.f3468c.width() <= 0 || this.G == -9223372036854775807L) {
            return 0L;
        }
        return (this.f3470e.width() * this.G) / this.f3468c.width();
    }

    public final void b(float f2) {
        Rect rect = this.f3470e;
        Rect rect2 = this.f3468c;
        rect.right = l0.f((int) f2, rect2.left, rect2.right);
    }

    public final boolean c(long j) {
        long j2 = this.G;
        if (j2 <= 0) {
            return false;
        }
        long j3 = this.E ? this.F : this.H;
        long g = l0.g(j3 + j, 0L, j2);
        if (g == j3) {
            return false;
        }
        if (this.E) {
            h(g);
        } else {
            d(g);
        }
        f();
        return true;
    }

    public final void d(long j) {
        this.F = j;
        this.E = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator<i> it = this.x.iterator();
        while (it.hasNext()) {
            l lVar = it.next().f3473b;
            lVar.I = true;
            TextView textView = lVar.m;
            if (textView != null) {
                textView.setText(l0.r(lVar.o, lVar.p, j));
            }
        }
    }

    @Override // android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        g();
    }

    public final void e(boolean z) {
        x0 x0Var;
        int v;
        removeCallbacks(this.w);
        this.E = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator<i> it = this.x.iterator();
        while (it.hasNext()) {
            i next = it.next();
            long j = this.F;
            l lVar = next.f3473b;
            lVar.I = false;
            if (!z && (x0Var = lVar.A) != null) {
                k1 o = x0Var.o();
                if (lVar.H && !o.p()) {
                    int o2 = o.o();
                    v = 0;
                    while (true) {
                        long a2 = o.m(v, lVar.r).a();
                        if (j < a2) {
                            break;
                        }
                        if (v == o2 - 1) {
                            j = a2;
                            break;
                        } else {
                            j -= a2;
                            v++;
                        }
                    }
                } else {
                    v = x0Var.v();
                }
                lVar.l(x0Var, v, j);
            }
        }
    }

    public final void f() {
        this.f3469d.set(this.f3468c);
        this.f3470e.set(this.f3468c);
        long j = this.E ? this.F : this.H;
        if (this.G > 0) {
            int width = (int) ((this.f3468c.width() * this.I) / this.G);
            Rect rect = this.f3469d;
            Rect rect2 = this.f3468c;
            rect.right = Math.min(rect2.left + width, rect2.right);
            int width2 = (int) ((this.f3468c.width() * j) / this.G);
            Rect rect3 = this.f3470e;
            Rect rect4 = this.f3468c;
            rect3.right = Math.min(rect4.left + width2, rect4.right);
        } else {
            Rect rect5 = this.f3469d;
            int i = this.f3468c.left;
            rect5.right = i;
            this.f3470e.right = i;
        }
        invalidate(this.f3467b);
    }

    public final void g() {
        Drawable drawable = this.l;
        if (drawable != null && drawable.isStateful() && this.l.setState(getDrawableState())) {
            invalidate();
        }
    }

    public long getPreferredUpdateDelay() {
        int width = (int) (this.f3468c.width() / this.A);
        if (width != 0) {
            long j = this.G;
            if (j != 0 && j != -9223372036854775807L) {
                return j / width;
            }
        }
        return Long.MAX_VALUE;
    }

    public final void h(long j) {
        if (this.F == j) {
            return;
        }
        this.F = j;
        Iterator<i> it = this.x.iterator();
        while (it.hasNext()) {
            l lVar = it.next().f3473b;
            TextView textView = lVar.m;
            if (textView != null) {
                textView.setText(l0.r(lVar.o, lVar.p, j));
            }
        }
    }

    @Override // android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.l;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        canvas.save();
        int height = this.f3468c.height();
        int centerY = this.f3468c.centerY() - (height / 2);
        int i = height + centerY;
        if (this.G <= 0) {
            Rect rect = this.f3468c;
            canvas.drawRect(rect.left, centerY, rect.right, i, this.h);
        } else {
            Rect rect2 = this.f3469d;
            int i2 = rect2.left;
            int i3 = rect2.right;
            int max = Math.max(Math.max(this.f3468c.left, i3), this.f3470e.right);
            int i4 = this.f3468c.right;
            if (max < i4) {
                canvas.drawRect(max, centerY, i4, i, this.h);
            }
            int max2 = Math.max(i2, this.f3470e.right);
            if (i3 > max2) {
                canvas.drawRect(max2, centerY, i3, i, this.g);
            }
            if (this.f3470e.width() > 0) {
                Rect rect3 = this.f3470e;
                canvas.drawRect(rect3.left, centerY, rect3.right, i, this.f3471f);
            }
            if (this.J != 0) {
                long[] jArr = this.K;
                Objects.requireNonNull(jArr);
                boolean[] zArr = this.L;
                Objects.requireNonNull(zArr);
                int i5 = this.o / 2;
                for (int i6 = 0; i6 < this.J; i6++) {
                    int width = ((int) ((this.f3468c.width() * l0.g(jArr[i6], 0L, this.G)) / this.G)) - i5;
                    Rect rect4 = this.f3468c;
                    canvas.drawRect(Math.min(rect4.width() - this.o, Math.max(0, width)) + rect4.left, centerY, r1 + this.o, i, zArr[i6] ? this.j : this.i);
                }
            }
        }
        if (this.G > 0) {
            Rect rect5 = this.f3470e;
            int f2 = l0.f(rect5.right, rect5.left, this.f3468c.right);
            int centerY2 = this.f3470e.centerY();
            Drawable drawable = this.l;
            if (drawable == null) {
                canvas.drawCircle(f2, centerY2, ((this.E || isFocused()) ? this.r : isEnabled() ? this.p : this.q) / 2, this.k);
            } else {
                int intrinsicWidth = drawable.getIntrinsicWidth() / 2;
                int intrinsicHeight = this.l.getIntrinsicHeight() / 2;
                this.l.setBounds(f2 - intrinsicWidth, centerY2 - intrinsicHeight, f2 + intrinsicWidth, centerY2 + intrinsicHeight);
                this.l.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!this.E || z) {
            return;
        }
        e(false);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    @TargetApi(21)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.G <= 0) {
            return;
        }
        if (l0.f3761a >= 21) {
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
            accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
        } else {
            accessibilityNodeInfo.addAction(4096);
            accessibilityNodeInfo.addAction(8192);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onKeyDown(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L30
            long r0 = r4.getPositionIncrement()
            r2 = 66
            r3 = 1
            if (r5 == r2) goto L27
            switch(r5) {
                case 21: goto L13;
                case 22: goto L14;
                case 23: goto L27;
                default: goto L12;
            }
        L12:
            goto L30
        L13:
            long r0 = -r0
        L14:
            boolean r0 = r4.c(r0)
            if (r0 == 0) goto L30
            java.lang.Runnable r5 = r4.w
            r4.removeCallbacks(r5)
            java.lang.Runnable r5 = r4.w
            r0 = 1000(0x3e8, double:4.94E-321)
            r4.postDelayed(r5, r0)
            return r3
        L27:
            boolean r0 = r4.E
            if (r0 == 0) goto L30
            r5 = 0
            r4.e(r5)
            return r3
        L30:
            boolean r5 = super.onKeyDown(r5, r6)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.x1.f.onKeyDown(int, android.view.KeyEvent):boolean");
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = ((i4 - i2) - this.n) / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = (i3 - i) - getPaddingRight();
        int i6 = this.n;
        int i7 = ((i6 - this.m) / 2) + i5;
        this.f3467b.set(paddingLeft, i5, paddingRight, i6 + i5);
        Rect rect = this.f3468c;
        Rect rect2 = this.f3467b;
        int i8 = rect2.left;
        int i9 = this.s;
        rect.set(i8 + i9, i7, rect2.right - i9, this.m + i7);
        f();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == 0) {
            size = this.n;
        } else if (mode != 1073741824) {
            size = Math.min(this.n, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        g();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.l;
        if (drawable != null) {
            if (l0.f3761a >= 23 && drawable.setLayoutDirection(i)) {
                invalidate();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0042, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            boolean r0 = r7.isEnabled()
            r1 = 0
            if (r0 == 0) goto L8d
            long r2 = r7.G
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L11
            goto L8d
        L11:
            int[] r0 = r7.y
            r7.getLocationOnScreen(r0)
            android.graphics.Point r0 = r7.z
            float r2 = r8.getRawX()
            int r2 = (int) r2
            int[] r3 = r7.y
            r3 = r3[r1]
            int r2 = r2 - r3
            float r3 = r8.getRawY()
            int r3 = (int) r3
            int[] r4 = r7.y
            r5 = 1
            r4 = r4[r5]
            int r3 = r3 - r4
            r0.set(r2, r3)
            android.graphics.Point r0 = r7.z
            int r2 = r0.x
            int r0 = r0.y
            int r3 = r8.getAction()
            if (r3 == 0) goto L76
            r4 = 3
            if (r3 == r5) goto L67
            r6 = 2
            if (r3 == r6) goto L45
            if (r3 == r4) goto L67
            goto L8d
        L45:
            boolean r8 = r7.E
            if (r8 == 0) goto L8d
            int r8 = r7.t
            if (r0 >= r8) goto L53
            int r8 = r7.D
            int r2 = r2 - r8
            int r2 = r2 / r4
            int r2 = r2 + r8
            goto L55
        L53:
            r7.D = r2
        L55:
            float r8 = (float) r2
            r7.b(r8)
            long r0 = r7.getScrubberPosition()
            r7.h(r0)
        L60:
            r7.f()
            r7.invalidate()
            return r5
        L67:
            boolean r0 = r7.E
            if (r0 == 0) goto L8d
            int r8 = r8.getAction()
            if (r8 != r4) goto L72
            r1 = r5
        L72:
            r7.e(r1)
            return r5
        L76:
            float r8 = (float) r2
            float r0 = (float) r0
            android.graphics.Rect r2 = r7.f3467b
            int r3 = (int) r8
            int r0 = (int) r0
            boolean r0 = r2.contains(r3, r0)
            if (r0 == 0) goto L8d
            r7.b(r8)
            long r0 = r7.getScrubberPosition()
            r7.d(r0)
            goto L60
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.x1.f.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        if (c(-getPositionIncrement()) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        e(false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        sendAccessibilityEvent(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        if (c(getPositionIncrement()) != false) goto L12;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean performAccessibilityAction(int r6, android.os.Bundle r7) {
        /*
            r5 = this;
            boolean r7 = super.performAccessibilityAction(r6, r7)
            r0 = 1
            if (r7 == 0) goto L8
            return r0
        L8:
            long r1 = r5.G
            r3 = 0
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r1 = 0
            if (r7 > 0) goto L12
            return r1
        L12:
            r7 = 8192(0x2000, float:1.148E-41)
            if (r6 != r7) goto L25
            long r6 = r5.getPositionIncrement()
            long r6 = -r6
            boolean r6 = r5.c(r6)
            if (r6 == 0) goto L34
        L21:
            r5.e(r1)
            goto L34
        L25:
            r7 = 4096(0x1000, float:5.74E-42)
            if (r6 != r7) goto L39
            long r6 = r5.getPositionIncrement()
            boolean r6 = r5.c(r6)
            if (r6 == 0) goto L34
            goto L21
        L34:
            r6 = 4
            r5.sendAccessibilityEvent(r6)
            return r0
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.x1.f.performAccessibilityAction(int, android.os.Bundle):boolean");
    }

    public void setAdMarkerColor(int i) {
        this.i.setColor(i);
        invalidate(this.f3467b);
    }

    public void setBufferedColor(int i) {
        this.g.setColor(i);
        invalidate(this.f3467b);
    }

    public void setBufferedPosition(long j) {
        this.I = j;
        f();
    }

    public void setDuration(long j) {
        this.G = j;
        if (this.E && j == -9223372036854775807L) {
            e(true);
        }
        f();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!this.E || z) {
            return;
        }
        e(true);
    }

    public void setKeyCountIncrement(int i) {
        p.c(i > 0);
        this.B = i;
        this.C = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        p.c(j > 0);
        this.B = -1;
        this.C = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.j.setColor(i);
        invalidate(this.f3467b);
    }

    public void setPlayedColor(int i) {
        this.f3471f.setColor(i);
        invalidate(this.f3467b);
    }

    public void setPosition(long j) {
        this.H = j;
        setContentDescription(getProgressText());
        f();
    }

    public void setScrubberColor(int i) {
        this.k.setColor(i);
        invalidate(this.f3467b);
    }

    public void setUnplayedColor(int i) {
        this.h.setColor(i);
        invalidate(this.f3467b);
    }
}
