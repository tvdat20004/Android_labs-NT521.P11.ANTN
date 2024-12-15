package c.c.a.b.u;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    public final c f4015a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4016b;

    public b(float f2, c cVar) {
        while (cVar instanceof b) {
            cVar = ((b) cVar).f4015a;
            f2 += ((b) cVar).f4016b;
        }
        this.f4015a = cVar;
        this.f4016b = f2;
    }

    @Override // c.c.a.b.u.c
    public float a(RectF rectF) {
        return Math.max(0.0f, this.f4015a.a(rectF) + this.f4016b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f4015a.equals(bVar.f4015a) && this.f4016b == bVar.f4016b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4015a, Float.valueOf(this.f4016b)});
    }
}
