package b.t;

import android.view.View;
import android.view.WindowId;

/* loaded from: classes.dex */
public class a1 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final WindowId f1725a;

    public a1(View view) {
        this.f1725a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof a1) && ((a1) obj).f1725a.equals(this.f1725a);
    }

    public int hashCode() {
        return this.f1725a.hashCode();
    }
}
