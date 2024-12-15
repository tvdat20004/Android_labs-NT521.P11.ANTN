package c.c.a.a.r1;

import android.text.TextUtils;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final String f2704a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2705b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2706c;

    public g(String str, boolean z, boolean z2) {
        this.f2704a = str;
        this.f2705b = z;
        this.f2706c = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != g.class) {
            return false;
        }
        g gVar = (g) obj;
        return TextUtils.equals(this.f2704a, gVar.f2704a) && this.f2705b == gVar.f2705b && this.f2706c == gVar.f2706c;
    }

    public int hashCode() {
        String str = this.f2704a;
        return (((((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.f2705b ? 1231 : 1237)) * 31) + (this.f2706c ? 1231 : 1237);
    }
}
