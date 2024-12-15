package b.v;

import android.os.Parcelable;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final b.e.b<String, Method> f1853a;

    /* renamed from: b, reason: collision with root package name */
    public final b.e.b<String, Method> f1854b;

    /* renamed from: c, reason: collision with root package name */
    public final b.e.b<String, Class> f1855c;

    public a(b.e.b<String, Method> bVar, b.e.b<String, Method> bVar2, b.e.b<String, Class> bVar3) {
        this.f1853a = bVar;
        this.f1854b = bVar2;
        this.f1855c = bVar3;
    }

    public abstract void a();

    public abstract a b();

    public final Class c(Class<? extends c> cls) {
        Class orDefault = this.f1855c.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class<?> cls2 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f1855c.put(cls.getName(), cls2);
        return cls2;
    }

    public final Method d(String str) {
        Method orDefault = this.f1853a.getOrDefault(str, null);
        if (orDefault != null) {
            return orDefault;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
        this.f1853a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method e(Class cls) {
        Method orDefault = this.f1854b.getOrDefault(cls.getName(), null);
        if (orDefault != null) {
            return orDefault;
        }
        Class c2 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c2.getDeclaredMethod("write", cls, a.class);
        this.f1854b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public boolean f(boolean z, int i) {
        return !h(i) ? z : ((b) this).f1857e.readInt() != 0;
    }

    public CharSequence g(CharSequence charSequence, int i) {
        return !h(i) ? charSequence : (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((b) this).f1857e);
    }

    public abstract boolean h(int i);

    public int i(int i, int i2) {
        return !h(i2) ? i : ((b) this).f1857e.readInt();
    }

    public <T extends Parcelable> T j(T t, int i) {
        return !h(i) ? t : (T) ((b) this).f1857e.readParcelable(b.class.getClassLoader());
    }

    public <T extends c> T k() {
        String readString = ((b) this).f1857e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (T) d(readString).invoke(null, b());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    public abstract void l(int i);

    public void m(int i, int i2) {
        l(i2);
        ((b) this).f1857e.writeInt(i);
    }

    public void n(Parcelable parcelable, int i) {
        l(i);
        ((b) this).f1857e.writeParcelable(parcelable, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void o(c cVar) {
        if (cVar == null) {
            ((b) this).f1857e.writeString(null);
            return;
        }
        try {
            ((b) this).f1857e.writeString(c(cVar.getClass()).getName());
            a b2 = b();
            try {
                e(cVar.getClass()).invoke(null, cVar, b2);
                b2.a();
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (!(e5.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
                }
                throw ((RuntimeException) e5.getCause());
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(cVar.getClass().getSimpleName() + " does not have a Parcelizer", e6);
        }
    }
}
