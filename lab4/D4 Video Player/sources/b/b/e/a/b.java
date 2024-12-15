package b.b.e.a;

import android.graphics.drawable.Animatable;

/* loaded from: classes.dex */
public class b extends g {

    /* renamed from: a, reason: collision with root package name */
    public final Animatable f499a;

    public b(Animatable animatable) {
        super(null);
        this.f499a = animatable;
    }

    @Override // b.b.e.a.g
    public void c() {
        this.f499a.start();
    }

    @Override // b.b.e.a.g
    public void d() {
        this.f499a.stop();
    }
}
