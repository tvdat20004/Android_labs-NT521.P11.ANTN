package b.b.h;

import android.view.View;
import android.view.animation.Interpolator;
import b.h.j.a0;
import b.h.j.y;
import b.h.j.z;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class l {

    /* renamed from: c, reason: collision with root package name */
    public Interpolator f559c;

    /* renamed from: d, reason: collision with root package name */
    public z f560d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f561e;

    /* renamed from: b, reason: collision with root package name */
    public long f558b = -1;

    /* renamed from: f, reason: collision with root package name */
    public final a0 f562f = new k(this);

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<y> f557a = new ArrayList<>();

    public void a() {
        if (this.f561e) {
            Iterator<y> it = this.f557a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
            this.f561e = false;
        }
    }

    public void b() {
        View view;
        if (this.f561e) {
            return;
        }
        Iterator<y> it = this.f557a.iterator();
        while (it.hasNext()) {
            y next = it.next();
            long j = this.f558b;
            if (j >= 0) {
                next.c(j);
            }
            Interpolator interpolator = this.f559c;
            if (interpolator != null && (view = next.f1319a.get()) != null) {
                view.animate().setInterpolator(interpolator);
            }
            if (this.f560d != null) {
                next.d(this.f562f);
            }
            View view2 = next.f1319a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f561e = true;
    }
}
