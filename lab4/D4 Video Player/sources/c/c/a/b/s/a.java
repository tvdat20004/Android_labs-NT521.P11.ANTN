package c.c.a.b.s;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f4002a = {R.attr.state_pressed};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f4003b = {R.attr.state_hovered, R.attr.state_focused};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f4004c = {R.attr.state_focused};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f4005d = {R.attr.state_hovered};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f4006e = {R.attr.state_selected, R.attr.state_pressed};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f4007f = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};
    public static final int[] g = {R.attr.state_selected, R.attr.state_focused};
    public static final int[] h = {R.attr.state_selected, R.attr.state_hovered};
    public static final int[] i = {R.attr.state_selected};
    public static final int[] j = {R.attr.state_enabled, R.attr.state_pressed};
    public static final String k = a.class.getSimpleName();

    public static int a(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return b.h.d.a.c(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static ColorStateList b(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(j, 0)) != 0) {
            Log.w(k, "Use a non-transparent color for the default color as it will be used to finish ripple animations.");
        }
        return colorStateList;
    }

    public static boolean c(int[] iArr) {
        boolean z = false;
        boolean z2 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z2 = true;
            }
        }
        return z && z2;
    }
}
