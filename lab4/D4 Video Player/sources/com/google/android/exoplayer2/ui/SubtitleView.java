package com.google.android.exoplayer2.ui;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import c.c.a.a.v1.a;
import c.c.a.a.v1.b;
import c.c.a.a.v1.l;
import c.c.a.a.x1.r;
import c.c.a.a.z1.l0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class SubtitleView extends View implements l {

    /* renamed from: b, reason: collision with root package name */
    public final List<r> f4160b;

    /* renamed from: c, reason: collision with root package name */
    public List<b> f4161c;

    /* renamed from: d, reason: collision with root package name */
    public int f4162d;

    /* renamed from: e, reason: collision with root package name */
    public float f4163e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4164f;
    public boolean g;
    public a h;
    public float i;

    public SubtitleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4160b = new ArrayList();
        this.f4162d = 0;
        this.f4163e = 0.0533f;
        this.f4164f = true;
        this.g = true;
        this.h = a.g;
        this.i = 0.08f;
    }

    @TargetApi(19)
    private float getUserCaptionFontScaleV19() {
        return ((CaptioningManager) getContext().getSystemService("captioning")).getFontScale();
    }

    @TargetApi(19)
    private a getUserCaptionStyleV19() {
        CaptioningManager.CaptionStyle userStyle = ((CaptioningManager) getContext().getSystemService("captioning")).getUserStyle();
        if (l0.f3761a >= 21) {
            return new a(userStyle.hasForegroundColor() ? userStyle.foregroundColor : -1, userStyle.hasBackgroundColor() ? userStyle.backgroundColor : -16777216, userStyle.hasWindowColor() ? userStyle.windowColor : 0, userStyle.hasEdgeType() ? userStyle.edgeType : 0, userStyle.hasEdgeColor() ? userStyle.edgeColor : -1, userStyle.getTypeface());
        }
        return new a(userStyle.foregroundColor, userStyle.backgroundColor, 0, userStyle.edgeType, userStyle.edgeColor, userStyle.getTypeface());
    }

    public final float a(int i, float f2, int i2, int i3) {
        float f3;
        if (i == 0) {
            f3 = i3;
        } else {
            if (i != 1) {
                if (i != 2) {
                    return Float.MIN_VALUE;
                }
                return f2;
            }
            f3 = i2;
        }
        return f2 * f3;
    }

    public void b() {
        setStyle((l0.f3761a < 19 || !((CaptioningManager) getContext().getSystemService("captioning")).isEnabled() || isInEditMode()) ? a.g : getUserCaptionStyleV19());
    }

    public void c() {
        setFractionalTextSize(((l0.f3761a < 19 || isInEditMode()) ? 1.0f : getUserCaptionFontScaleV19()) * 0.0533f);
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x03d9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01db  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void dispatchDraw(android.graphics.Canvas r37) {
        /*
            Method dump skipped, instructions count: 1123
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.SubtitleView.dispatchDraw(android.graphics.Canvas):void");
    }

    public void setApplyEmbeddedFontSizes(boolean z) {
        if (this.g == z) {
            return;
        }
        this.g = z;
        invalidate();
    }

    public void setApplyEmbeddedStyles(boolean z) {
        if (this.f4164f == z && this.g == z) {
            return;
        }
        this.f4164f = z;
        this.g = z;
        invalidate();
    }

    public void setBottomPaddingFraction(float f2) {
        if (this.i == f2) {
            return;
        }
        this.i = f2;
        invalidate();
    }

    public void setCues(List<b> list) {
        if (this.f4161c == list) {
            return;
        }
        this.f4161c = list;
        int size = list == null ? 0 : list.size();
        while (this.f4160b.size() < size) {
            this.f4160b.add(new r(getContext()));
        }
        invalidate();
    }

    public void setFractionalTextSize(float f2) {
        if (this.f4162d == 0 && this.f4163e == f2) {
            return;
        }
        this.f4162d = 0;
        this.f4163e = f2;
        invalidate();
    }

    public void setStyle(a aVar) {
        if (this.h == aVar) {
            return;
        }
        this.h = aVar;
        invalidate();
    }

    @Override // c.c.a.a.v1.l
    public void w(List<b> list) {
        setCues(list);
    }
}
