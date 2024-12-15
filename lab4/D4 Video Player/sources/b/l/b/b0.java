package b.l.b;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b0 implements a0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f1374a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1375b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f1376c;

    public b0(z zVar, String str, int i, int i2) {
        this.f1376c = zVar;
        this.f1374a = i;
        this.f1375b = i2;
    }

    @Override // b.l.b.a0
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        Fragment fragment = this.f1376c.r;
        if (fragment == null || this.f1374a >= 0 || !fragment.h().V()) {
            return this.f1376c.W(arrayList, arrayList2, null, this.f1374a, this.f1375b);
        }
        return false;
    }
}
