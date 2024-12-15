package com.pnikosis.materialishprogress;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;

/* loaded from: classes.dex */
public class ProgressWheel extends View {

    /* renamed from: b, reason: collision with root package name */
    public int f4278b;

    /* renamed from: c, reason: collision with root package name */
    public int f4279c;

    /* renamed from: d, reason: collision with root package name */
    public int f4280d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4281e;

    /* renamed from: f, reason: collision with root package name */
    public double f4282f;
    public double g;
    public float h;
    public boolean i;
    public long j;
    public int k;
    public int l;
    public Paint m;
    public Paint n;
    public RectF o;
    public float p;
    public long q;
    public boolean r;
    public float s;
    public float t;
    public boolean u;
    public b v;
    public boolean w;

    public interface b {
        void a(float f2);
    }

    public static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new c.d.a.a();

        /* renamed from: b, reason: collision with root package name */
        public float f4283b;

        /* renamed from: c, reason: collision with root package name */
        public float f4284c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f4285d;

        /* renamed from: e, reason: collision with root package name */
        public float f4286e;

        /* renamed from: f, reason: collision with root package name */
        public int f4287f;
        public int g;
        public int h;
        public int i;
        public int j;
        public boolean k;
        public boolean l;

        public c(Parcel parcel, a aVar) {
            super(parcel);
            this.f4283b = parcel.readFloat();
            this.f4284c = parcel.readFloat();
            this.f4285d = parcel.readByte() != 0;
            this.f4286e = parcel.readFloat();
            this.f4287f = parcel.readInt();
            this.g = parcel.readInt();
            this.h = parcel.readInt();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readByte() != 0;
            this.l = parcel.readByte() != 0;
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f4283b);
            parcel.writeFloat(this.f4284c);
            parcel.writeByte(this.f4285d ? (byte) 1 : (byte) 0);
            parcel.writeFloat(this.f4286e);
            parcel.writeInt(this.f4287f);
            parcel.writeInt(this.g);
            parcel.writeInt(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeByte(this.k ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.l ? (byte) 1 : (byte) 0);
        }
    }

    public ProgressWheel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4278b = 28;
        this.f4279c = 4;
        this.f4280d = 4;
        this.f4281e = false;
        this.f4282f = 0.0d;
        this.g = 460.0d;
        this.h = 0.0f;
        this.i = true;
        this.j = 0L;
        this.k = -1442840576;
        this.l = 16777215;
        this.m = new Paint();
        this.n = new Paint();
        this.o = new RectF();
        this.p = 230.0f;
        this.q = 0L;
        this.s = 0.0f;
        this.t = 0.0f;
        this.u = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.d.a.b.f4132a);
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        this.f4279c = (int) TypedValue.applyDimension(1, this.f4279c, displayMetrics);
        this.f4280d = (int) TypedValue.applyDimension(1, this.f4280d, displayMetrics);
        int applyDimension = (int) TypedValue.applyDimension(1, this.f4278b, displayMetrics);
        this.f4278b = applyDimension;
        this.f4278b = (int) obtainStyledAttributes.getDimension(3, applyDimension);
        this.f4281e = obtainStyledAttributes.getBoolean(4, false);
        this.f4279c = (int) obtainStyledAttributes.getDimension(2, this.f4279c);
        this.f4280d = (int) obtainStyledAttributes.getDimension(8, this.f4280d);
        this.p = obtainStyledAttributes.getFloat(9, this.p / 360.0f) * 360.0f;
        this.g = obtainStyledAttributes.getInt(1, (int) this.g);
        this.k = obtainStyledAttributes.getColor(0, this.k);
        this.l = obtainStyledAttributes.getColor(7, this.l);
        this.r = obtainStyledAttributes.getBoolean(5, false);
        if (obtainStyledAttributes.getBoolean(6, false)) {
            c();
        }
        obtainStyledAttributes.recycle();
        this.w = Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f;
    }

    public final void a() {
        if (this.v != null) {
            this.v.a(Math.round((this.s * 100.0f) / 360.0f) / 100.0f);
        }
    }

    public final void b() {
        this.m.setColor(this.k);
        this.m.setAntiAlias(true);
        this.m.setStyle(Paint.Style.STROKE);
        this.m.setStrokeWidth(this.f4279c);
        this.n.setColor(this.l);
        this.n.setAntiAlias(true);
        this.n.setStyle(Paint.Style.STROKE);
        this.n.setStrokeWidth(this.f4280d);
    }

    public void c() {
        this.q = SystemClock.uptimeMillis();
        this.u = true;
        invalidate();
    }

    public int getBarColor() {
        return this.k;
    }

    public int getBarWidth() {
        return this.f4279c;
    }

    public int getCircleRadius() {
        return this.f4278b;
    }

    public float getProgress() {
        if (this.u) {
            return -1.0f;
        }
        return this.s / 360.0f;
    }

    public int getRimColor() {
        return this.l;
    }

    public int getRimWidth() {
        return this.f4280d;
    }

    public float getSpinSpeed() {
        return this.p / 360.0f;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f2;
        super.onDraw(canvas);
        canvas.drawArc(this.o, 360.0f, 360.0f, false, this.n);
        if (this.w) {
            float f3 = 0.0f;
            boolean z = true;
            if (this.u) {
                long uptimeMillis = SystemClock.uptimeMillis() - this.q;
                float f4 = (uptimeMillis * this.p) / 1000.0f;
                long j = this.j;
                if (j >= 200) {
                    double d2 = this.f4282f + uptimeMillis;
                    this.f4282f = d2;
                    double d3 = this.g;
                    if (d2 > d3) {
                        this.f4282f = d2 - d3;
                        this.j = 0L;
                        this.i = !this.i;
                    }
                    float cos = (((float) Math.cos(((this.f4282f / d3) + 1.0d) * 3.141592653589793d)) / 2.0f) + 0.5f;
                    if (this.i) {
                        this.h = cos * 254.0f;
                    } else {
                        float f5 = (1.0f - cos) * 254.0f;
                        this.s = (this.h - f5) + this.s;
                        this.h = f5;
                    }
                } else {
                    this.j = j + uptimeMillis;
                }
                float f6 = this.s + f4;
                this.s = f6;
                if (f6 > 360.0f) {
                    this.s = f6 - 360.0f;
                    b bVar = this.v;
                    if (bVar != null) {
                        bVar.a(-1.0f);
                    }
                }
                this.q = SystemClock.uptimeMillis();
                float f7 = this.s - 90.0f;
                float f8 = this.h + 16.0f;
                if (isInEditMode()) {
                    f8 = 135.0f;
                    f2 = 0.0f;
                } else {
                    f2 = f7;
                }
                canvas.drawArc(this.o, f2, f8, false, this.m);
            } else {
                float f9 = this.s;
                if (f9 != this.t) {
                    this.s = Math.min(this.s + (((SystemClock.uptimeMillis() - this.q) / 1000.0f) * this.p), this.t);
                    this.q = SystemClock.uptimeMillis();
                } else {
                    z = false;
                }
                if (f9 != this.s) {
                    a();
                }
                float f10 = this.s;
                if (!this.r) {
                    f3 = ((float) (1.0d - Math.pow(1.0f - (f10 / 360.0f), 4.0f))) * 360.0f;
                    f10 = ((float) (1.0d - Math.pow(1.0f - (this.s / 360.0f), 2.0f))) * 360.0f;
                }
                canvas.drawArc(this.o, f3 - 90.0f, isInEditMode() ? 360.0f : f10, false, this.m);
            }
            if (z) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int paddingRight = getPaddingRight() + getPaddingLeft() + this.f4278b;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f4278b;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == 1073741824) {
            paddingRight = size;
        } else if (mode == Integer.MIN_VALUE) {
            paddingRight = Math.min(paddingRight, size);
        }
        if (mode2 == 1073741824 || mode == 1073741824) {
            paddingBottom = size2;
        } else if (mode2 == Integer.MIN_VALUE) {
            paddingBottom = Math.min(paddingBottom, size2);
        }
        setMeasuredDimension(paddingRight, paddingBottom);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        this.s = cVar.f4283b;
        this.t = cVar.f4284c;
        this.u = cVar.f4285d;
        this.p = cVar.f4286e;
        this.f4279c = cVar.f4287f;
        this.k = cVar.g;
        this.f4280d = cVar.h;
        this.l = cVar.i;
        this.f4278b = cVar.j;
        this.r = cVar.k;
        this.f4281e = cVar.l;
        this.q = SystemClock.uptimeMillis();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f4283b = this.s;
        cVar.f4284c = this.t;
        cVar.f4285d = this.u;
        cVar.f4286e = this.p;
        cVar.f4287f = this.f4279c;
        cVar.g = this.k;
        cVar.h = this.f4280d;
        cVar.i = this.l;
        cVar.j = this.f4278b;
        cVar.k = this.r;
        cVar.l = this.f4281e;
        return cVar;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        if (this.f4281e) {
            int i5 = this.f4279c;
            this.o = new RectF(paddingLeft + i5, paddingTop + i5, (i - paddingRight) - i5, (i2 - paddingBottom) - i5);
        } else {
            int i6 = (i - paddingLeft) - paddingRight;
            int min = Math.min(Math.min(i6, (i2 - paddingBottom) - paddingTop), (this.f4278b * 2) - (this.f4279c * 2));
            int i7 = ((i6 - min) / 2) + paddingLeft;
            int i8 = ((((i2 - paddingTop) - paddingBottom) - min) / 2) + paddingTop;
            int i9 = this.f4279c;
            this.o = new RectF(i7 + i9, i8 + i9, (i7 + min) - i9, (i8 + min) - i9);
        }
        b();
        invalidate();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            this.q = SystemClock.uptimeMillis();
        }
    }

    public void setBarColor(int i) {
        this.k = i;
        b();
        if (this.u) {
            return;
        }
        invalidate();
    }

    public void setBarWidth(int i) {
        this.f4279c = i;
        if (this.u) {
            return;
        }
        invalidate();
    }

    public void setCallback(b bVar) {
        this.v = bVar;
        if (this.u) {
            return;
        }
        a();
    }

    public void setCircleRadius(int i) {
        this.f4278b = i;
        if (this.u) {
            return;
        }
        invalidate();
    }

    public void setInstantProgress(float f2) {
        if (this.u) {
            this.s = 0.0f;
            this.u = false;
        }
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        } else if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 == this.t) {
            return;
        }
        float min = Math.min(f2 * 360.0f, 360.0f);
        this.t = min;
        this.s = min;
        this.q = SystemClock.uptimeMillis();
        invalidate();
    }

    public void setLinearProgress(boolean z) {
        this.r = z;
        if (this.u) {
            return;
        }
        invalidate();
    }

    public void setProgress(float f2) {
        if (this.u) {
            this.s = 0.0f;
            this.u = false;
            a();
        }
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        } else if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        float f3 = this.t;
        if (f2 == f3) {
            return;
        }
        if (this.s == f3) {
            this.q = SystemClock.uptimeMillis();
        }
        this.t = Math.min(f2 * 360.0f, 360.0f);
        invalidate();
    }

    public void setRimColor(int i) {
        this.l = i;
        b();
        if (this.u) {
            return;
        }
        invalidate();
    }

    public void setRimWidth(int i) {
        this.f4280d = i;
        if (this.u) {
            return;
        }
        invalidate();
    }

    public void setSpinSpeed(float f2) {
        this.p = f2 * 360.0f;
    }
}
