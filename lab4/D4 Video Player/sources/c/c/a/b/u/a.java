package c.c.a.b.u;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f4014a;

    public a(float f2) {
        this.f4014a = f2;
    }

    @Override // c.c.a.b.u.c
    public float a(RectF rectF) {
        return this.f4014a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f4014a == ((a) obj).f4014a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4014a)});
    }
}
