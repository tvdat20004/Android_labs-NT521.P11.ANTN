package b.h.h;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final f f1240a;

    public g(f fVar) {
        this.f1240a = fVar;
    }

    public abstract boolean a();

    public boolean b(CharSequence charSequence, int i, int i2) {
        if (i < 0 || i2 < 0 || charSequence.length() - i2 < i) {
            throw new IllegalArgumentException();
        }
        f fVar = this.f1240a;
        if (fVar == null) {
            return a();
        }
        int a2 = fVar.a(charSequence, i, i2);
        if (a2 == 0) {
            return true;
        }
        if (a2 != 1) {
            return a();
        }
        return false;
    }
}
