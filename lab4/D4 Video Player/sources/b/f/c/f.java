package b.f.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public int f1052a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<g> f1053b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public int f1054c;

    /* renamed from: d, reason: collision with root package name */
    public n f1055d;

    public f(Context context, XmlPullParser xmlPullParser) {
        this.f1054c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), r.g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f1052a = obtainStyledAttributes.getResourceId(index, this.f1052a);
            } else if (index == 1) {
                this.f1054c = obtainStyledAttributes.getResourceId(index, this.f1054c);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f1054c);
                context.getResources().getResourceName(this.f1054c);
                if ("layout".equals(resourceTypeName)) {
                    n nVar = new n();
                    this.f1055d = nVar;
                    nVar.a(context, this.f1054c);
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
