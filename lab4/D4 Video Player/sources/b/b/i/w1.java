package b.b.i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class w1 implements z1 {
    @Override // b.b.i.z1
    public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            return b.b.e.a.h.e(context, context.getResources(), xmlPullParser, attributeSet, theme);
        } catch (Exception e2) {
            Log.e("AsldcInflateDelegate", "Exception while inflating <animated-selector>", e2);
            return null;
        }
    }
}
