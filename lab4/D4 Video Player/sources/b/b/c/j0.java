package b.b.c;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import b.b.i.v0;
import java.lang.reflect.Constructor;

/* loaded from: classes.dex */
public class j0 {

    /* renamed from: b, reason: collision with root package name */
    public static final Class<?>[] f449b = {Context.class, AttributeSet.class};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f450c = {R.attr.onClick};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f451d = {"android.widget.", "android.view.", "android.webkit."};

    /* renamed from: e, reason: collision with root package name */
    public static final b.e.i<String, Constructor<? extends View>> f452e = new b.e.i<>();

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f453a = new Object[2];

    public b.b.i.n a(Context context, AttributeSet attributeSet) {
        return new b.b.i.n(context, attributeSet, razi.apa.ctf.videoPlayer.R.attr.autoCompleteTextViewStyle);
    }

    public b.b.i.p b(Context context, AttributeSet attributeSet) {
        return new b.b.i.p(context, attributeSet, razi.apa.ctf.videoPlayer.R.attr.buttonStyle);
    }

    public b.b.i.q c(Context context, AttributeSet attributeSet) {
        return new b.b.i.q(context, attributeSet, razi.apa.ctf.videoPlayer.R.attr.checkboxStyle);
    }

    public b.b.i.c0 d(Context context, AttributeSet attributeSet) {
        return new b.b.i.c0(context, attributeSet, razi.apa.ctf.videoPlayer.R.attr.radioButtonStyle);
    }

    public v0 e(Context context, AttributeSet attributeSet) {
        return new v0(context, attributeSet, R.attr.textViewStyle);
    }

    public View f() {
        return null;
    }

    public final View g(Context context, String str, String str2) {
        String str3;
        b.e.i<String, Constructor<? extends View>> iVar = f452e;
        Constructor<? extends View> orDefault = iVar.getOrDefault(str, null);
        if (orDefault == null) {
            if (str2 != null) {
                try {
                    str3 = str2 + str;
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            orDefault = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f449b);
            iVar.put(str, orDefault);
        }
        orDefault.setAccessible(true);
        return orDefault.newInstance(this.f453a);
    }

    public final void h(View view, String str) {
        if (view != null) {
            return;
        }
        throw new IllegalStateException(getClass().getName() + " asked to inflate view for <" + str + ">, but returned null");
    }
}
