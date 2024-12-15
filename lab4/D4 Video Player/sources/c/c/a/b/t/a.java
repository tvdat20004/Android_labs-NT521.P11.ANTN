package c.c.a.b.t;

import android.graphics.Paint;
import android.graphics.Path;

/* loaded from: classes.dex */
public class a {
    public static final int[] i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};
    public static final int[] k = new int[4];
    public static final float[] l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: b, reason: collision with root package name */
    public final Paint f4009b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f4010c;

    /* renamed from: d, reason: collision with root package name */
    public int f4011d;

    /* renamed from: e, reason: collision with root package name */
    public int f4012e;

    /* renamed from: f, reason: collision with root package name */
    public int f4013f;
    public final Path g = new Path();
    public Paint h = new Paint();

    /* renamed from: a, reason: collision with root package name */
    public final Paint f4008a = new Paint();

    public a() {
        a(-16777216);
        this.h.setColor(0);
        Paint paint = new Paint(4);
        this.f4009b = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f4010c = new Paint(paint);
    }

    public void a(int i2) {
        this.f4011d = b.h.d.a.c(i2, 68);
        this.f4012e = b.h.d.a.c(i2, 20);
        this.f4013f = b.h.d.a.c(i2, 0);
        this.f4008a.setColor(this.f4011d);
    }
}
