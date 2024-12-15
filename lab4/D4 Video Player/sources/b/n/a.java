package b.n;

import b.n.e;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    public static a f1524c = new a();

    /* renamed from: a, reason: collision with root package name */
    public final Map<Class<?>, C0002a> f1525a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, Boolean> f1526b = new HashMap();

    /* renamed from: b.n.a$a, reason: collision with other inner class name */
    public static class C0002a {

        /* renamed from: a, reason: collision with root package name */
        public final Map<e.a, List<b>> f1527a = new HashMap();

        /* renamed from: b, reason: collision with root package name */
        public final Map<b, e.a> f1528b;

        public C0002a(Map<b, e.a> map) {
            this.f1528b = map;
            for (Map.Entry<b, e.a> entry : map.entrySet()) {
                e.a value = entry.getValue();
                List<b> list = this.f1527a.get(value);
                if (list == null) {
                    list = new ArrayList<>();
                    this.f1527a.put(value, list);
                }
                list.add(entry.getKey());
            }
        }

        public static void a(List<b> list, h hVar, e.a aVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    b bVar = list.get(size);
                    Objects.requireNonNull(bVar);
                    try {
                        int i = bVar.f1529a;
                        if (i == 0) {
                            bVar.f1530b.invoke(obj, new Object[0]);
                        } else if (i == 1) {
                            bVar.f1530b.invoke(obj, hVar);
                        } else if (i == 2) {
                            bVar.f1530b.invoke(obj, hVar, aVar);
                        }
                    } catch (IllegalAccessException e2) {
                        throw new RuntimeException(e2);
                    } catch (InvocationTargetException e3) {
                        throw new RuntimeException("Failed to call observer method", e3.getCause());
                    }
                }
            }
        }
    }

    public final C0002a a(Class<?> cls, Method[] methodArr) {
        int i;
        C0002a b2;
        Class<?> superclass = cls.getSuperclass();
        HashMap hashMap = new HashMap();
        if (superclass != null && (b2 = b(superclass)) != null) {
            hashMap.putAll(b2.f1528b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry<b, e.a> entry : b(cls2).f1528b.entrySet()) {
                c(hashMap, entry.getKey(), entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e2) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e2);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            n nVar = (n) method.getAnnotation(n.class);
            if (nVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(h.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i = 1;
                }
                e.a value = nVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(e.a.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (value != e.a.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                c(hashMap, new b(i, method), value, cls);
                z = true;
            }
        }
        C0002a c0002a = new C0002a(hashMap);
        this.f1525a.put(cls, c0002a);
        this.f1526b.put(cls, Boolean.valueOf(z));
        return c0002a;
    }

    public C0002a b(Class<?> cls) {
        C0002a c0002a = this.f1525a.get(cls);
        return c0002a != null ? c0002a : a(cls, null);
    }

    public final void c(Map<b, e.a> map, b bVar, e.a aVar, Class<?> cls) {
        e.a aVar2 = map.get(bVar);
        if (aVar2 == null || aVar == aVar2) {
            if (aVar2 == null) {
                map.put(bVar, aVar);
                return;
            }
            return;
        }
        Method method = bVar.f1530b;
        StringBuilder j = c.a.a.a.a.j("Method ");
        j.append(method.getName());
        j.append(" in ");
        j.append(cls.getName());
        j.append(" already declared with different @OnLifecycleEvent value: previous value ");
        j.append(aVar2);
        j.append(", new value ");
        j.append(aVar);
        throw new IllegalArgumentException(j.toString());
    }
}
