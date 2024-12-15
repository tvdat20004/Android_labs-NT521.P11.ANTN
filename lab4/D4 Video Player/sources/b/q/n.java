package b.q;

import android.text.TextUtils;
import androidx.preference.Preference;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    public int f1563a;

    /* renamed from: b, reason: collision with root package name */
    public int f1564b;

    /* renamed from: c, reason: collision with root package name */
    public String f1565c;

    public n(Preference preference) {
        this.f1565c = preference.getClass().getName();
        this.f1563a = preference.E;
        this.f1564b = preference.F;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f1563a == nVar.f1563a && this.f1564b == nVar.f1564b && TextUtils.equals(this.f1565c, nVar.f1565c);
    }

    public int hashCode() {
        return this.f1565c.hashCode() + ((((527 + this.f1563a) * 31) + this.f1564b) * 31);
    }
}
