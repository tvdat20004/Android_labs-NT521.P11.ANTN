package b.h.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.List;

/* loaded from: classes.dex */
public class f extends l {

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?> f1172b;

    /* renamed from: c, reason: collision with root package name */
    public static final Constructor<?> f1173c;

    /* renamed from: d, reason: collision with root package name */
    public static final Method f1174d;

    /* renamed from: e, reason: collision with root package name */
    public static final Method f1175e;

    static {
        Class<?> cls;
        Method method;
        Method method2;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class<?> cls2 = Integer.TYPE;
            method2 = cls.getMethod("addFontWeightStyle", ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi24Impl", e2.getClass().getName(), e2);
            cls = null;
            method = null;
            method2 = null;
        }
        f1173c = constructor;
        f1172b = cls;
        f1174d = method2;
        f1175e = method;
    }

    public static boolean f(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f1174d.invoke(obj, byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public static Typeface g(Object obj) {
        try {
            Object newInstance = Array.newInstance(f1172b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f1175e.invoke(null, newInstance);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    @Override // b.h.d.l
    public Typeface a(Context context, b.h.c.a.c cVar, Resources resources, int i) {
        Object obj;
        MappedByteBuffer mappedByteBuffer;
        FileInputStream fileInputStream;
        try {
            obj = f1173c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        for (b.h.c.a.d dVar : cVar.f1139a) {
            int i2 = dVar.f1145f;
            File s = b.h.b.h.s(context);
            if (s != null) {
                try {
                    if (b.h.b.h.i(s, resources, i2)) {
                        try {
                            fileInputStream = new FileInputStream(s);
                        } catch (IOException unused2) {
                            mappedByteBuffer = null;
                        }
                        try {
                            FileChannel channel = fileInputStream.getChannel();
                            mappedByteBuffer = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                            fileInputStream.close();
                            if (mappedByteBuffer != null || !f(obj, mappedByteBuffer, dVar.f1144e, dVar.f1141b, dVar.f1142c)) {
                                return null;
                            }
                        } finally {
                        }
                    }
                } finally {
                    s.delete();
                }
            }
            mappedByteBuffer = null;
            if (mappedByteBuffer != null) {
                return null;
            }
        }
        return g(obj);
    }

    @Override // b.h.d.l
    public Typeface b(Context context, CancellationSignal cancellationSignal, b.h.g.g[] gVarArr, int i) {
        Object obj;
        try {
            obj = f1173c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            obj = null;
        }
        if (obj == null) {
            return null;
        }
        b.e.i iVar = new b.e.i();
        for (b.h.g.g gVar : gVarArr) {
            Uri uri = gVar.f1196a;
            ByteBuffer byteBuffer = (ByteBuffer) iVar.get(uri);
            if (byteBuffer == null) {
                byteBuffer = b.h.b.h.y(context, cancellationSignal, uri);
                iVar.put(uri, byteBuffer);
            }
            if (byteBuffer == null || !f(obj, byteBuffer, gVar.f1197b, gVar.f1198c, gVar.f1199d)) {
                return null;
            }
        }
        Typeface g = g(obj);
        if (g == null) {
            return null;
        }
        return Typeface.create(g, i);
    }
}
