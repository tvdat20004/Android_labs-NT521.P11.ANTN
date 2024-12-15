package c.c.a.b.q;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import b.b.i.c0;
import c.c.a.b.b;
import c.c.a.b.p.p;

/* loaded from: classes.dex */
public class a extends c0 {
    public static final int[][] g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f3986e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3987f;

    public a(Context context, AttributeSet attributeSet) {
        super(c.c.a.b.x.a.a.a(context, attributeSet, razi.apa.ctf.videoPlayer.R.attr.radioButtonStyle, razi.apa.ctf.videoPlayer.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet, razi.apa.ctf.videoPlayer.R.attr.radioButtonStyle);
        Context context2 = getContext();
        TypedArray d2 = p.d(context2, attributeSet, b.n, razi.apa.ctf.videoPlayer.R.attr.radioButtonStyle, razi.apa.ctf.videoPlayer.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (d2.hasValue(0)) {
            setButtonTintList(c.c.a.b.a.e(context2, d2, 0));
        }
        this.f3987f = d2.getBoolean(1, false);
        d2.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f3986e == null) {
            int d2 = c.c.a.b.a.d(this, razi.apa.ctf.videoPlayer.R.attr.colorControlActivated);
            int d3 = c.c.a.b.a.d(this, razi.apa.ctf.videoPlayer.R.attr.colorOnSurface);
            int d4 = c.c.a.b.a.d(this, razi.apa.ctf.videoPlayer.R.attr.colorSurface);
            int[][] iArr = g;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = c.c.a.b.a.h(d4, d2, 1.0f);
            iArr2[1] = c.c.a.b.a.h(d4, d3, 0.54f);
            iArr2[2] = c.c.a.b.a.h(d4, d3, 0.38f);
            iArr2[3] = c.c.a.b.a.h(d4, d3, 0.38f);
            this.f3986e = new ColorStateList(iArr, iArr2);
        }
        return this.f3986e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3987f && getButtonTintList() == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f3987f = z;
        setButtonTintList(z ? getMaterialThemeColorsTintList() : null);
    }
}
