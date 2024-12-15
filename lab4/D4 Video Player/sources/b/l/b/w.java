package b.l.b;

import android.content.Context;
import androidx.fragment.app.Fragment;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* loaded from: classes.dex */
public class w {

    /* renamed from: b, reason: collision with root package name */
    public static final b.e.i<String, Class<?>> f1497b = new b.e.i<>();

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f1498a;

    public w(z zVar) {
        this.f1498a = zVar;
    }

    public static Class<?> b(ClassLoader classLoader, String str) {
        b.e.i<String, Class<?>> iVar = f1497b;
        Class<?> orDefault = iVar.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls = Class.forName(str, false, classLoader);
        iVar.put(str, cls);
        return cls;
    }

    public static Class<? extends Fragment> c(ClassLoader classLoader, String str) {
        try {
            return b(classLoader, str);
        } catch (ClassCastException e2) {
            throw new g(c.a.a.a.a.h("Unable to instantiate fragment ", str, ": make sure class is a valid subclass of Fragment"), e2);
        } catch (ClassNotFoundException e3) {
            throw new g(c.a.a.a.a.h("Unable to instantiate fragment ", str, ": make sure class name exists"), e3);
        }
    }

    public Fragment a(String str) {
        h<?> hVar = this.f1498a.o;
        Context context = hVar.f1411c;
        Objects.requireNonNull(hVar);
        Object obj = Fragment.S;
        try {
            return c(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (IllegalAccessException e2) {
            throw new g(c.a.a.a.a.h("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e2);
        } catch (InstantiationException e3) {
            throw new g(c.a.a.a.a.h("Unable to instantiate fragment ", str, ": make sure class name exists, is public, and has an empty constructor that is public"), e3);
        } catch (NoSuchMethodException e4) {
            throw new g(c.a.a.a.a.h("Unable to instantiate fragment ", str, ": could not find Fragment constructor"), e4);
        } catch (InvocationTargetException e5) {
            throw new g(c.a.a.a.a.h("Unable to instantiate fragment ", str, ": calling Fragment constructor caused an exception"), e5);
        }
    }
}
