package b.b.i;

import android.content.Context;
import android.content.ContextWrapper;

/* loaded from: classes.dex */
public abstract class i2 extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f705a = new Object();

    public static Context a(Context context) {
        if (!(context instanceof i2) && !(context.getResources() instanceof k2)) {
            context.getResources();
            int i = u2.f823a;
        }
        return context;
    }
}
