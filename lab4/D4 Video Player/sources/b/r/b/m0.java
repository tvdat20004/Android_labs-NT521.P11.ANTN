package b.r.b;

import android.util.Log;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class m0 {

    /* renamed from: a, reason: collision with root package name */
    public int f1657a;

    /* renamed from: b, reason: collision with root package name */
    public int f1658b;

    /* renamed from: d, reason: collision with root package name */
    public int f1660d = -1;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1662f = false;
    public int g = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1659c = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public Interpolator f1661e = null;

    public m0(int i, int i2) {
        this.f1657a = i;
        this.f1658b = i2;
    }

    public void a(RecyclerView recyclerView) {
        int i = this.f1660d;
        if (i >= 0) {
            this.f1660d = -1;
            recyclerView.Q(i);
            this.f1662f = false;
            return;
        }
        if (!this.f1662f) {
            this.g = 0;
            return;
        }
        Interpolator interpolator = this.f1661e;
        if (interpolator != null && this.f1659c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f1659c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.e0.b(this.f1657a, this.f1658b, i2, interpolator);
        int i3 = this.g + 1;
        this.g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f1662f = false;
    }

    public void b(int i, int i2, int i3, Interpolator interpolator) {
        this.f1657a = i;
        this.f1658b = i2;
        this.f1659c = i3;
        this.f1661e = interpolator;
        this.f1662f = true;
    }
}
