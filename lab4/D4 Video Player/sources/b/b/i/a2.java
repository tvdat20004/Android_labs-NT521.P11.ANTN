package b.b.i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class a2 implements z1 {
    @Override // b.b.i.z1
    public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            return b.u.a.a.s.a(context.getResources(), xmlPullParser, attributeSet, theme);
        } catch (Exception e2) {
            Log.e("VdcInflateDelegate", "Exception while inflating <vector>", e2);
            return null;
        }
    }
}
