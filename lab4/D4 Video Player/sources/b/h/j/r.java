package b.h.j;

import android.os.Build;
import android.view.View;

/* loaded from: classes.dex */
public abstract class r<T> {

    /* renamed from: a, reason: collision with root package name */
    public final int f1304a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<T> f1305b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1306c;

    public r(int i, Class<T> cls, int i2) {
        this.f1304a = i;
        this.f1305b = cls;
        this.f1306c = i2;
    }

    public r(int i, Class<T> cls, int i2, int i3) {
        this.f1304a = i;
        this.f1305b = cls;
        this.f1306c = i3;
    }

    public boolean a(Boolean bool, Boolean bool2) {
        return (bool == null ? false : bool.booleanValue()) == (bool2 == null ? false : bool2.booleanValue());
    }

    public abstract T b(View view);

    public T c(View view) {
        if (Build.VERSION.SDK_INT >= this.f1306c) {
            return b(view);
        }
        T t = (T) view.getTag(this.f1304a);
        if (this.f1305b.isInstance(t)) {
            return t;
        }
        return null;
    }
}
