package b.h.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import b.h.g.n;
import b.h.g.o;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Objects;

@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final l f1165a;

    /* renamed from: b, reason: collision with root package name */
    public static final b.e.g<String, Typeface> f1166b;

    static {
        l eVar;
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            eVar = new i();
        } else if (i >= 28) {
            eVar = new h();
        } else if (i >= 26) {
            eVar = new g();
        } else {
            if (i >= 24) {
                Method method = f.f1174d;
                if (method == null) {
                    Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
                }
                if (method != null) {
                    eVar = new f();
                }
            }
            eVar = new e();
        }
        f1165a = eVar;
        f1166b = new b.e.g<>(16);
    }

    public static Typeface a(Context context, b.h.c.a.b bVar, Resources resources, int i, int i2, b.h.c.a.i iVar, Handler handler, boolean z) {
        Typeface a2;
        if (bVar instanceof b.h.c.a.e) {
            b.h.c.a.e eVar = (b.h.c.a.e) bVar;
            boolean z2 = true;
            if (!z ? iVar != null : eVar.f1148c != 0) {
                z2 = false;
            }
            int i3 = z ? eVar.f1147b : -1;
            b.h.g.a aVar = eVar.f1146a;
            b.e.g<String, Typeface> gVar = b.h.g.i.f1203a;
            String str = aVar.f1186e + "-" + i2;
            a2 = b.h.g.i.f1203a.a(str);
            if (a2 != null) {
                if (iVar != null) {
                    iVar.d(a2);
                }
            } else if (z2 && i3 == -1) {
                b.h.g.h b2 = b.h.g.i.b(context, aVar, i2);
                if (iVar != null) {
                    int i4 = b2.f1202b;
                    if (i4 == 0) {
                        iVar.b(b2.f1201a, handler);
                    } else {
                        iVar.a(i4, handler);
                    }
                }
                a2 = b2.f1201a;
            } else {
                b.h.g.b bVar2 = new b.h.g.b(context, aVar, i2, str);
                a2 = null;
                if (z2) {
                    try {
                        a2 = ((b.h.g.h) b.h.g.i.f1204b.b(bVar2, i3)).f1201a;
                    } catch (InterruptedException unused) {
                    }
                } else {
                    b.h.g.c cVar = iVar == null ? null : new b.h.g.c(iVar, handler);
                    synchronized (b.h.g.i.f1205c) {
                        b.e.i<String, ArrayList<n<b.h.g.h>>> iVar2 = b.h.g.i.f1206d;
                        ArrayList<n<b.h.g.h>> orDefault = iVar2.getOrDefault(str, null);
                        if (orDefault == null) {
                            if (cVar != null) {
                                ArrayList<n<b.h.g.h>> arrayList = new ArrayList<>();
                                arrayList.add(cVar);
                                iVar2.put(str, arrayList);
                            }
                            o oVar = b.h.g.i.f1204b;
                            b.h.g.d dVar = new b.h.g.d(str);
                            Objects.requireNonNull(oVar);
                            oVar.a(new b.h.g.l(oVar, bVar2, new Handler(), dVar));
                        } else if (cVar != null) {
                            orDefault.add(cVar);
                        }
                    }
                }
            }
        } else {
            a2 = f1165a.a(context, (b.h.c.a.c) bVar, resources, i2);
            if (iVar != null) {
                if (a2 != null) {
                    iVar.b(a2, handler);
                } else {
                    iVar.a(-3, handler);
                }
            }
        }
        if (a2 != null) {
            f1166b.b(c(resources, i, i2), a2);
        }
        return a2;
    }

    public static Typeface b(Context context, Resources resources, int i, String str, int i2) {
        Typeface d2 = f1165a.d(context, resources, i, str, i2);
        if (d2 != null) {
            f1166b.b(c(resources, i, i2), d2);
        }
        return d2;
    }

    public static String c(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }
}
