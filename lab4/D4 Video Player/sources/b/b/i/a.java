package b.b.i;

import android.view.View;

/* loaded from: classes.dex */
public class a implements b.h.j.z {

    /* renamed from: a, reason: collision with root package name */
    public boolean f639a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f640b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f641c;

    public a(b bVar) {
        this.f641c = bVar;
    }

    @Override // b.h.j.z
    public void a(View view) {
        if (this.f639a) {
            return;
        }
        b bVar = this.f641c;
        bVar.g = null;
        super/*android.view.ViewGroup*/.setVisibility(this.f640b);
    }

    @Override // b.h.j.z
    public void b(View view) {
        super/*android.view.ViewGroup*/.setVisibility(0);
        this.f639a = false;
    }

    @Override // b.h.j.z
    public void c(View view) {
        this.f639a = true;
    }
}
