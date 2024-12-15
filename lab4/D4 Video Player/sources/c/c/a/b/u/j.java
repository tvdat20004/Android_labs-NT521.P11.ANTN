package c.c.a.b.u;

import android.graphics.RectF;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class j implements c {

    /* renamed from: a, reason: collision with root package name */
    public final float f4029a;

    public j(float f2) {
        this.f4029a = f2;
    }

    @Override // c.c.a.b.u.c
    public float a(RectF rectF) {
        return rectF.height() * this.f4029a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j) && this.f4029a == ((j) obj).f4029a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f4029a)});
    }
}
