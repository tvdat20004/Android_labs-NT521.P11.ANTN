package b.h.c.a;

import android.content.res.ColorStateList;
import android.graphics.Shader;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final Shader f1136a;

    /* renamed from: b, reason: collision with root package name */
    public final ColorStateList f1137b;

    /* renamed from: c, reason: collision with root package name */
    public int f1138c;

    public a(Shader shader, ColorStateList colorStateList, int i) {
        this.f1136a = shader;
        this.f1137b = colorStateList;
        this.f1138c = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c1, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r2.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static b.h.c.a.a a(android.content.res.Resources r29, int r30, android.content.res.Resources.Theme r31) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.c.a.a.a(android.content.res.Resources, int, android.content.res.Resources$Theme):b.h.c.a.a");
    }

    public boolean b() {
        return this.f1136a != null;
    }

    public boolean c() {
        ColorStateList colorStateList;
        return this.f1136a == null && (colorStateList = this.f1137b) != null && colorStateList.isStateful();
    }

    public boolean d(int[] iArr) {
        if (c()) {
            ColorStateList colorStateList = this.f1137b;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != this.f1138c) {
                this.f1138c = colorForState;
                return true;
            }
        }
        return false;
    }
}
