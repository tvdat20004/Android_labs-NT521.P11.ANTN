package c.c.a.a.v1.u;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.util.Log;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public long f3380a;

    /* renamed from: b, reason: collision with root package name */
    public long f3381b;

    /* renamed from: c, reason: collision with root package name */
    public SpannableStringBuilder f3382c;

    /* renamed from: d, reason: collision with root package name */
    public Layout.Alignment f3383d;

    /* renamed from: e, reason: collision with root package name */
    public float f3384e;

    /* renamed from: f, reason: collision with root package name */
    public int f3385f;
    public int g;
    public float h;
    public int i;
    public float j;

    public f() {
        b();
    }

    public g a() {
        if (this.h != Float.MIN_VALUE) {
            int i = Integer.MIN_VALUE;
            if (this.i == Integer.MIN_VALUE) {
                Layout.Alignment alignment = this.f3383d;
                if (alignment != null) {
                    int i2 = e.f3379a[alignment.ordinal()];
                    i = 0;
                    if (i2 != 1) {
                        if (i2 == 2) {
                            this.i = 1;
                        } else if (i2 != 3) {
                            StringBuilder j = c.a.a.a.a.j("Unrecognized alignment: ");
                            j.append(this.f3383d);
                            Log.w("WebvttCueBuilder", j.toString());
                        } else {
                            this.i = 2;
                        }
                    }
                }
                this.i = i;
            }
        }
        return new g(this.f3380a, this.f3381b, this.f3382c, this.f3383d, this.f3384e, this.f3385f, this.g, this.h, this.i, this.j);
    }

    public void b() {
        this.f3380a = 0L;
        this.f3381b = 0L;
        this.f3382c = null;
        this.f3383d = null;
        this.f3384e = Float.MIN_VALUE;
        this.f3385f = Integer.MIN_VALUE;
        this.g = Integer.MIN_VALUE;
        this.h = Float.MIN_VALUE;
        this.i = Integer.MIN_VALUE;
        this.j = Float.MIN_VALUE;
    }
}
