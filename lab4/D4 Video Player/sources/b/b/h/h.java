package b.b.h;

import android.view.InflateException;
import android.view.MenuItem;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class h implements MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public static final Class<?>[] f539d = {MenuItem.class};

    /* renamed from: b, reason: collision with root package name */
    public Object f540b;

    /* renamed from: c, reason: collision with root package name */
    public Method f541c;

    public h(Object obj, String str) {
        this.f540b = obj;
        Class<?> cls = obj.getClass();
        try {
            this.f541c = cls.getMethod(str, f539d);
        } catch (Exception e2) {
            InflateException inflateException = new InflateException("Couldn't resolve menu item onClick handler " + str + " in class " + cls.getName());
            inflateException.initCause(e2);
            throw inflateException;
        }
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(MenuItem menuItem) {
        try {
            if (this.f541c.getReturnType() == Boolean.TYPE) {
                return ((Boolean) this.f541c.invoke(this.f540b, menuItem)).booleanValue();
            }
            this.f541c.invoke(this.f540b, menuItem);
            return true;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}
