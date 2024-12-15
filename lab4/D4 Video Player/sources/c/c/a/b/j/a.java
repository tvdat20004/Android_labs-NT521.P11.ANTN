package c.c.a.b.j;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b.b.i.q;
import c.c.a.b.b;
import c.c.a.b.p.p;

/* loaded from: classes.dex */
public class a extends q {
    public static final int[][] g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f3874e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3875f;

    public a(Context context, AttributeSet attributeSet) {
        super(c.c.a.b.x.a.a.a(context, attributeSet, razi.apa.ctf.videoPlayer.R.attr.checkboxStyle, razi.apa.ctf.videoPlayer.R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, razi.apa.ctf.videoPlayer.R.attr.checkboxStyle);
        Context context2 = getContext();
        TypedArray d2 = p.d(context2, attributeSet, b.m, razi.apa.ctf.videoPlayer.R.attr.checkboxStyle, razi.apa.ctf.videoPlayer.R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        if (d2.hasValue(0)) {
            setButtonTintList(c.c.a.b.a.e(context2, d2, 0));
        }
        this.f3875f = d2.getBoolean(1, false);
        d2.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3874e == null) {
            int[][] iArr = g;
            int[] iArr2 = new int[iArr.length];
            int d2 = c.c.a.b.a.d(this, razi.apa.ctf.videoPlayer.R.attr.colorControlActivated);
            int d3 = c.c.a.b.a.d(this, razi.apa.ctf.videoPlayer.R.attr.colorSurface);
            int d4 = c.c.a.b.a.d(this, razi.apa.ctf.videoPlayer.R.attr.colorOnSurface);
            iArr2[0] = c.c.a.b.a.h(d3, d2, 1.0f);
            iArr2[1] = c.c.a.b.a.h(d3, d4, 0.54f);
            iArr2[2] = c.c.a.b.a.h(d3, d4, 0.38f);
            iArr2[3] = c.c.a.b.a.h(d3, d4, 0.38f);
            this.f3874e = new ColorStateList(iArr, iArr2);
        }
        return this.f3874e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3875f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f3875f = z;
        setButtonTintList(z ? getMaterialThemeColorsTintList() : null);
    }
}
