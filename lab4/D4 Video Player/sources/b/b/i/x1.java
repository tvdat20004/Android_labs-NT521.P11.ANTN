package b.b.i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class x1 implements z1 {
    @Override // b.b.i.z1
    public Drawable a(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            Resources resources = context.getResources();
            b.u.a.a.e eVar = new b.u.a.a.e(context, null, null);
            eVar.inflate(resources, xmlPullParser, attributeSet, theme);
            return eVar;
        } catch (Exception e2) {
            Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e2);
            return null;
        }
    }
}
