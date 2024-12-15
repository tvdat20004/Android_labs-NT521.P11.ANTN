package b.h.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class e extends l {

    /* renamed from: b, reason: collision with root package name */
    public static Class<?> f1167b = null;

    /* renamed from: c, reason: collision with root package name */
    public static Constructor<?> f1168c = null;

    /* renamed from: d, reason: collision with root package name */
    public static Method f1169d = null;

    /* renamed from: e, reason: collision with root package name */
    public static Method f1170e = null;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f1171f = false;

    public static boolean f(Object obj, String str, int i, boolean z) {
        g();
        try {
            return ((Boolean) f1169d.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static void g() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f1171f) {
            return;
        }
        f1171f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f1168c = constructor;
        f1167b = cls;
        f1169d = method2;
        f1170e = method;
    }

    @Override // b.h.d.l
    public Typeface a(Context context, b.h.c.a.c cVar, Resources resources, int i) {
        g();
        try {
            Object newInstance = f1168c.newInstance(new Object[0]);
            for (b.h.c.a.d dVar : cVar.f1139a) {
                File s = b.h.b.h.s(context);
                if (s == null) {
                    return null;
                }
                try {
                    if (!b.h.b.h.i(s, resources, dVar.f1145f)) {
                        return null;
                    }
                    if (!f(newInstance, s.getPath(), dVar.f1141b, dVar.f1142c)) {
                        return null;
                    }
                } catch (RuntimeException unused) {
                    return null;
                } finally {
                    s.delete();
                }
            }
            g();
            try {
                Object newInstance2 = Array.newInstance(f1167b, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f1170e.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // b.h.d.l
    public Typeface b(Context context, CancellationSignal cancellationSignal, b.h.g.g[] gVarArr, int i) {
        File file;
        String readlink;
        if (gVarArr.length < 1) {
            return null;
        }
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(((b.h.g.g) l.e(gVarArr, i, new j(this))).f1196a, "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                try {
                    readlink = Os.readlink("/proc/self/fd/" + openFileDescriptor.getFd());
                } finally {
                }
            } catch (ErrnoException unused) {
            }
            try {
                if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                    file = new File(readlink);
                    if (file != null && file.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(file);
                        openFileDescriptor.close();
                        return createFromFile;
                    }
                    FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                    Typeface c2 = c(context, fileInputStream);
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return c2;
                }
                Typeface c22 = c(context, fileInputStream);
                fileInputStream.close();
                openFileDescriptor.close();
                return c22;
            } finally {
            }
            file = null;
            if (file != null) {
                Typeface createFromFile2 = Typeface.createFromFile(file);
                openFileDescriptor.close();
                return createFromFile2;
            }
            FileInputStream fileInputStream2 = new FileInputStream(openFileDescriptor.getFileDescriptor());
        } catch (IOException unused2) {
            return null;
        }
    }
}
