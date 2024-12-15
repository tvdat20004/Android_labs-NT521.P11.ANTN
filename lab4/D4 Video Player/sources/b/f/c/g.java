package b.f.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public float f1056a;

    /* renamed from: b, reason: collision with root package name */
    public float f1057b;

    /* renamed from: c, reason: collision with root package name */
    public float f1058c;

    /* renamed from: d, reason: collision with root package name */
    public float f1059d;

    /* renamed from: e, reason: collision with root package name */
    public int f1060e;

    /* renamed from: f, reason: collision with root package name */
    public n f1061f;

    public g(Context context, XmlPullParser xmlPullParser) {
        this.f1056a = Float.NaN;
        this.f1057b = Float.NaN;
        this.f1058c = Float.NaN;
        this.f1059d = Float.NaN;
        this.f1060e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), r.i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f1060e = obtainStyledAttributes.getResourceId(index, this.f1060e);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f1060e);
                context.getResources().getResourceName(this.f1060e);
                if ("layout".equals(resourceTypeName)) {
                    n nVar = new n();
                    this.f1061f = nVar;
                    nVar.a(context, this.f1060e);
                }
            } else if (index == 1) {
                this.f1059d = obtainStyledAttributes.getDimension(index, this.f1059d);
            } else if (index == 2) {
                this.f1057b = obtainStyledAttributes.getDimension(index, this.f1057b);
            } else if (index == 3) {
                this.f1058c = obtainStyledAttributes.getDimension(index, this.f1058c);
            } else if (index == 4) {
                this.f1056a = obtainStyledAttributes.getDimension(index, this.f1056a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
