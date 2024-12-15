package c.c.a.a.w1;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f3413a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3414b;

    /* renamed from: c, reason: collision with root package name */
    public final String f3415c;

    public h(int i, int i2, String str) {
        this.f3413a = i;
        this.f3414b = i2;
        this.f3415c = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass()) {
            return false;
        }
        h hVar = (h) obj;
        return this.f3413a == hVar.f3413a && this.f3414b == hVar.f3414b && TextUtils.equals(this.f3415c, hVar.f3415c);
    }

    public int hashCode() {
        int i = ((this.f3413a * 31) + this.f3414b) * 31;
        String str = this.f3415c;
        return i + (str != null ? str.hashCode() : 0);
    }
}
