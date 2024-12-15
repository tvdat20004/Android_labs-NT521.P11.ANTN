package b.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.ref.WeakReference;
import java.util.Objects;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public final class b2 {
    public static b2 i;

    /* renamed from: a, reason: collision with root package name */
    public WeakHashMap<Context, b.e.j<ColorStateList>> f651a;

    /* renamed from: b, reason: collision with root package name */
    public b.e.i<String, z1> f652b;

    /* renamed from: c, reason: collision with root package name */
    public b.e.j<String> f653c;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap<Context, b.e.f<WeakReference<Drawable.ConstantState>>> f654d = new WeakHashMap<>(0);

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f655e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f656f;
    public t g;
    public static final PorterDuff.Mode h = PorterDuff.Mode.SRC_IN;
    public static final y1 j = new y1(6);

    public static synchronized b2 d() {
        b2 b2Var;
        synchronized (b2.class) {
            if (i == null) {
                b2 b2Var2 = new b2();
                i = b2Var2;
                if (Build.VERSION.SDK_INT < 24) {
                    b2Var2.a("vector", new a2());
                    b2Var2.a("animated-vector", new x1());
                    b2Var2.a("animated-selector", new w1());
                }
            }
            b2Var = i;
        }
        return b2Var;
    }

    public static synchronized PorterDuffColorFilter h(int i2, PorterDuff.Mode mode) {
        PorterDuffColorFilter a2;
        synchronized (b2.class) {
            y1 y1Var = j;
            Objects.requireNonNull(y1Var);
            int i3 = (i2 + 31) * 31;
            a2 = y1Var.a(Integer.valueOf(mode.hashCode() + i3));
            if (a2 == null) {
                a2 = new PorterDuffColorFilter(i2, mode);
                Objects.requireNonNull(y1Var);
                y1Var.b(Integer.valueOf(mode.hashCode() + i3), a2);
            }
        }
        return a2;
    }

    public final void a(String str, z1 z1Var) {
        if (this.f652b == null) {
            this.f652b = new b.e.i<>();
        }
        this.f652b.put(str, z1Var);
    }

    public final synchronized boolean b(Context context, long j2, Drawable drawable) {
        boolean z;
        Drawable.ConstantState constantState = drawable.getConstantState();
        if (constantState != null) {
            b.e.f<WeakReference<Drawable.ConstantState>> fVar = this.f654d.get(context);
            if (fVar == null) {
                fVar = new b.e.f<>();
                this.f654d.put(context, fVar);
            }
            fVar.g(j2, new WeakReference<>(constantState));
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public final Drawable c(Context context, int i2) {
        if (this.f655e == null) {
            this.f655e = new TypedValue();
        }
        TypedValue typedValue = this.f655e;
        context.getResources().getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e2 = e(context, j2);
        if (e2 != null) {
            return e2;
        }
        LayerDrawable layerDrawable = null;
        if (this.g != null && i2 == R.drawable.abc_cab_background_top_material) {
            layerDrawable = new LayerDrawable(new Drawable[]{f(context, R.drawable.abc_cab_background_internal_bg), f(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            b(context, j2, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable e(Context context, long j2) {
        b.e.f<WeakReference<Drawable.ConstantState>> fVar = this.f654d.get(context);
        if (fVar == null) {
            return null;
        }
        WeakReference<Drawable.ConstantState> f2 = fVar.f(j2, null);
        if (f2 != null) {
            Drawable.ConstantState constantState = f2.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int b2 = b.e.e.b(fVar.f887c, fVar.f889e, j2);
            if (b2 >= 0) {
                Object[] objArr = fVar.f888d;
                Object obj = objArr[b2];
                Object obj2 = b.e.f.f885f;
                if (obj != obj2) {
                    objArr[b2] = obj2;
                    fVar.f886b = true;
                }
            }
        }
        return null;
    }

    public synchronized Drawable f(Context context, int i2) {
        return g(context, i2, false);
    }

    public synchronized Drawable g(Context context, int i2, boolean z) {
        Drawable j2;
        if (!this.f656f) {
            boolean z2 = true;
            this.f656f = true;
            Drawable f2 = f(context, R.drawable.abc_vector_test);
            if (f2 != null) {
                if (!(f2 instanceof b.u.a.a.s) && !"android.graphics.drawable.VectorDrawable".equals(f2.getClass().getName())) {
                    z2 = false;
                }
            }
            this.f656f = false;
            throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
        }
        j2 = j(context, i2);
        if (j2 == null) {
            j2 = c(context, i2);
        }
        if (j2 == null) {
            Object obj = b.h.b.b.f1117a;
            j2 = context.getDrawable(i2);
        }
        if (j2 != null) {
            j2 = k(context, i2, z, j2);
        }
        if (j2 != null) {
            int[] iArr = d1.f668a;
        }
        return j2;
    }

    public synchronized ColorStateList i(Context context, int i2) {
        ColorStateList e2;
        b.e.j<ColorStateList> jVar;
        WeakHashMap<Context, b.e.j<ColorStateList>> weakHashMap = this.f651a;
        ColorStateList colorStateList = null;
        e2 = (weakHashMap == null || (jVar = weakHashMap.get(context)) == null) ? null : jVar.e(i2, null);
        if (e2 == null) {
            t tVar = this.g;
            if (tVar != null) {
                colorStateList = tVar.c(context, i2);
            }
            if (colorStateList != null) {
                if (this.f651a == null) {
                    this.f651a = new WeakHashMap<>();
                }
                b.e.j<ColorStateList> jVar2 = this.f651a.get(context);
                if (jVar2 == null) {
                    jVar2 = new b.e.j<>(10);
                    this.f651a.put(context, jVar2);
                }
                jVar2.a(i2, colorStateList);
            }
            e2 = colorStateList;
        }
        return e2;
    }

    public final Drawable j(Context context, int i2) {
        int next;
        b.e.i<String, z1> iVar = this.f652b;
        if (iVar == null || iVar.isEmpty()) {
            return null;
        }
        b.e.j<String> jVar = this.f653c;
        if (jVar != null) {
            String e2 = jVar.e(i2, null);
            if ("appcompat_skip_skip".equals(e2) || (e2 != null && this.f652b.getOrDefault(e2, null) == null)) {
                return null;
            }
        } else {
            this.f653c = new b.e.j<>(10);
        }
        if (this.f655e == null) {
            this.f655e = new TypedValue();
        }
        TypedValue typedValue = this.f655e;
        Resources resources = context.getResources();
        resources.getValue(i2, typedValue, true);
        long j2 = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable e3 = e(context, j2);
        if (e3 != null) {
            return e3;
        }
        CharSequence charSequence = typedValue.string;
        if (charSequence != null && charSequence.toString().endsWith(".xml")) {
            try {
                XmlResourceParser xml = resources.getXml(i2);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                String name = xml.getName();
                this.f653c.a(i2, name);
                z1 z1Var = this.f652b.get(name);
                if (z1Var != null) {
                    e3 = z1Var.a(context, xml, asAttributeSet, context.getTheme());
                }
                if (e3 != null) {
                    e3.setChangingConfigurations(typedValue.changingConfigurations);
                    b(context, j2, e3);
                }
            } catch (Exception e4) {
                Log.e("ResourceManagerInternal", "Exception while inflating drawable", e4);
            }
        }
        if (e3 == null) {
            this.f653c.a(i2, "appcompat_skip_skip");
        }
        return e3;
    }

    public final Drawable k(Context context, int i2, boolean z, Drawable drawable) {
        ColorStateList i3 = i(context, i2);
        PorterDuff.Mode mode = null;
        if (i3 != null) {
            if (d1.a(drawable)) {
                drawable = drawable.mutate();
            }
            drawable.setTintList(i3);
            if (this.g != null && i2 == R.drawable.abc_switch_thumb_material) {
                mode = PorterDuff.Mode.MULTIPLY;
            }
            if (mode == null) {
                return drawable;
            }
            drawable.setTintMode(mode);
            return drawable;
        }
        t tVar = this.g;
        if (tVar != null) {
            Objects.requireNonNull(tVar);
            boolean z2 = true;
            if (i2 == R.drawable.abc_seekbar_track_material) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(android.R.id.background);
                int c2 = h2.c(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode2 = u.f814b;
                tVar.d(findDrawableByLayerId, c2, mode2);
                tVar.d(layerDrawable.findDrawableByLayerId(android.R.id.secondaryProgress), h2.c(context, R.attr.colorControlNormal), mode2);
                tVar.d(layerDrawable.findDrawableByLayerId(android.R.id.progress), h2.c(context, R.attr.colorControlActivated), mode2);
            } else if (i2 == R.drawable.abc_ratingbar_material || i2 == R.drawable.abc_ratingbar_indicator_material || i2 == R.drawable.abc_ratingbar_small_material) {
                LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(android.R.id.background);
                int b2 = h2.b(context, R.attr.colorControlNormal);
                PorterDuff.Mode mode3 = u.f814b;
                tVar.d(findDrawableByLayerId2, b2, mode3);
                tVar.d(layerDrawable2.findDrawableByLayerId(android.R.id.secondaryProgress), h2.c(context, R.attr.colorControlActivated), mode3);
                tVar.d(layerDrawable2.findDrawableByLayerId(android.R.id.progress), h2.c(context, R.attr.colorControlActivated), mode3);
            } else {
                z2 = false;
            }
            if (z2) {
                return drawable;
            }
        }
        if (l(context, i2, drawable) || !z) {
            return drawable;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean l(android.content.Context r8, int r9, android.graphics.drawable.Drawable r10) {
        /*
            r7 = this;
            b.b.i.t r0 = r7.g
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L70
            java.util.Objects.requireNonNull(r0)
            android.graphics.PorterDuff$Mode r3 = b.b.i.u.f814b
            int[] r4 = r0.f798a
            boolean r4 = r0.a(r4, r9)
            r5 = 16842801(0x1010031, float:2.3693695E-38)
            r6 = -1
            if (r4 == 0) goto L1b
            r5 = 2130903230(0x7f0300be, float:1.7413272E38)
            goto L47
        L1b:
            int[] r4 = r0.f800c
            boolean r4 = r0.a(r4, r9)
            if (r4 == 0) goto L27
            r5 = 2130903228(0x7f0300bc, float:1.7413268E38)
            goto L47
        L27:
            int[] r4 = r0.f801d
            boolean r0 = r0.a(r4, r9)
            if (r0 == 0) goto L32
            android.graphics.PorterDuff$Mode r3 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto L47
        L32:
            r0 = 2131165234(0x7f070032, float:1.794468E38)
            if (r9 != r0) goto L42
            r9 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = 1109603123(0x42233333, float:40.8)
            int r0 = java.lang.Math.round(r0)
            goto L49
        L42:
            r0 = 2131165210(0x7f07001a, float:1.794463E38)
            if (r9 != r0) goto L4b
        L47:
            r9 = r5
            r0 = r6
        L49:
            r4 = r1
            goto L4e
        L4b:
            r9 = r2
            r4 = r9
            r0 = r6
        L4e:
            if (r4 == 0) goto L6c
            boolean r4 = b.b.i.d1.a(r10)
            if (r4 == 0) goto L5a
            android.graphics.drawable.Drawable r10 = r10.mutate()
        L5a:
            int r8 = b.b.i.h2.c(r8, r9)
            android.graphics.PorterDuffColorFilter r8 = b.b.i.u.c(r8, r3)
            r10.setColorFilter(r8)
            if (r0 == r6) goto L6a
            r10.setAlpha(r0)
        L6a:
            r8 = r1
            goto L6d
        L6c:
            r8 = r2
        L6d:
            if (r8 == 0) goto L70
            goto L71
        L70:
            r1 = r2
        L71:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.i.b2.l(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
