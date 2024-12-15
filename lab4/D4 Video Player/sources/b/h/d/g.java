package b.h.d;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class g extends e {
    public final Class<?> g;
    public final Constructor<?> h;
    public final Method i;
    public final Method j;
    public final Method k;
    public final Method l;
    public final Method m;

    public g() {
        Method method;
        Method method2;
        Constructor<?> constructor;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(new Class[0]);
            method3 = n(cls2);
            method4 = o(cls2);
            method5 = cls2.getMethod("freeze", new Class[0]);
            method2 = cls2.getMethod("abortCreation", new Class[0]);
            method = p(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            StringBuilder j = c.a.a.a.a.j("Unable to collect necessary methods for class ");
            j.append(e2.getClass().getName());
            Log.e("TypefaceCompatApi26Impl", j.toString(), e2);
            method = null;
            method2 = null;
            constructor = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.g = cls;
        this.h = constructor;
        this.i = method3;
        this.j = method4;
        this.k = method5;
        this.l = method2;
        this.m = method;
    }

    private Object m() {
        try {
            return this.h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // b.h.d.e, b.h.d.l
    public Typeface a(Context context, b.h.c.a.c cVar, Resources resources, int i) {
        if (!l()) {
            return super.a(context, cVar, resources, i);
        }
        Object m = m();
        if (m == null) {
            return null;
        }
        for (b.h.c.a.d dVar : cVar.f1139a) {
            if (!i(context, m, dVar.f1140a, dVar.f1144e, dVar.f1141b, dVar.f1142c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.f1143d))) {
                h(m);
                return null;
            }
        }
        if (k(m)) {
            return j(m);
        }
        return null;
    }

    @Override // b.h.d.e, b.h.d.l
    public Typeface b(Context context, CancellationSignal cancellationSignal, b.h.g.g[] gVarArr, int i) {
        Typeface j;
        boolean z;
        if (gVarArr.length < 1) {
            return null;
        }
        if (!l()) {
            b.h.g.g gVar = (b.h.g.g) l.e(gVarArr, i, new j(this));
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(gVar.f1196a, "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(gVar.f1198c).setItalic(gVar.f1199d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        b.e.g<String, Typeface> gVar2 = b.h.g.i.f1203a;
        HashMap hashMap = new HashMap();
        for (b.h.g.g gVar3 : gVarArr) {
            if (gVar3.f1200e == 0) {
                Uri uri = gVar3.f1196a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, b.h.b.h.y(context, cancellationSignal, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object m = m();
        if (m == null) {
            return null;
        }
        int length = gVarArr.length;
        int i2 = 0;
        boolean z2 = false;
        while (i2 < length) {
            b.h.g.g gVar4 = gVarArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(gVar4.f1196a);
            if (byteBuffer != null) {
                try {
                    z = ((Boolean) this.j.invoke(m, byteBuffer, Integer.valueOf(gVar4.f1197b), null, Integer.valueOf(gVar4.f1198c), Integer.valueOf(gVar4.f1199d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z = false;
                }
                if (!z) {
                    h(m);
                    return null;
                }
                z2 = true;
            }
            i2++;
            z2 = z2;
        }
        if (!z2) {
            h(m);
            return null;
        }
        if (k(m) && (j = j(m)) != null) {
            return Typeface.create(j, i);
        }
        return null;
    }

    @Override // b.h.d.l
    public Typeface d(Context context, Resources resources, int i, String str, int i2) {
        if (!l()) {
            return super.d(context, resources, i, str, i2);
        }
        Object m = m();
        if (m == null) {
            return null;
        }
        if (!i(context, m, str, 0, -1, -1, null)) {
            h(m);
            return null;
        }
        if (k(m)) {
            return j(m);
        }
        return null;
    }

    public final void h(Object obj) {
        try {
            this.l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean i(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public Typeface j(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.m.invoke(null, newInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final boolean k(Object obj) {
        try {
            return ((Boolean) this.k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean l() {
        if (this.i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.i != null;
    }

    public Method n(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    public Method o(Class<?> cls) {
        Class<?> cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method p(Class<?> cls) {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass(), cls2, cls2);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
