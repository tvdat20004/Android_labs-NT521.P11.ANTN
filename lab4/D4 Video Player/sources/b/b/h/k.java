package b.b.h;

import android.view.View;
import b.h.j.a0;
import b.h.j.z;

/* loaded from: classes.dex */
public class k extends a0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f554a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f555b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f556c;

    public k(l lVar) {
        this.f556c = lVar;
    }

    @Override // b.h.j.z
    public void a(View view) {
        int i = this.f555b + 1;
        this.f555b = i;
        if (i == this.f556c.f557a.size()) {
            z zVar = this.f556c.f560d;
            if (zVar != null) {
                zVar.a(null);
            }
            this.f555b = 0;
            this.f554a = false;
            this.f556c.f561e = false;
        }
    }

    @Override // b.h.j.a0, b.h.j.z
    public void b(View view) {
        if (this.f554a) {
            return;
        }
        this.f554a = true;
        z zVar = this.f556c.f560d;
        if (zVar != null) {
            zVar.b(null);
        }
    }
}
