package b.l.b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public class r implements LayoutInflater.Factory2 {

    /* renamed from: b, reason: collision with root package name */
    public final z f1470b;

    public r(z zVar) {
        this.f1470b = zVar;
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        if (p.class.getName().equals(str)) {
            return new p(context, attributeSet, this.f1470b);
        }
        if (!"fragment".equals(str)) {
            return null;
        }
        String attributeValue = attributeSet.getAttributeValue(null, "class");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.l.a.f1366a);
        if (attributeValue == null) {
            attributeValue = obtainStyledAttributes.getString(0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(1, -1);
        String string = obtainStyledAttributes.getString(2);
        obtainStyledAttributes.recycle();
        if (attributeValue != null) {
            ClassLoader classLoader = context.getClassLoader();
            b.e.i<String, Class<?>> iVar = w.f1497b;
            try {
                z = Fragment.class.isAssignableFrom(w.b(classLoader, attributeValue));
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            if (z) {
                int id = view != null ? view.getId() : 0;
                if (id == -1 && resourceId == -1 && string == null) {
                    throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                }
                Fragment G = resourceId != -1 ? this.f1470b.G(resourceId) : null;
                if (G == null && string != null) {
                    G = this.f1470b.H(string);
                }
                if (G == null && id != -1) {
                    G = this.f1470b.G(id);
                }
                if (z.M(2)) {
                    StringBuilder j = c.a.a.a.a.j("onCreateView: id=0x");
                    j.append(Integer.toHexString(resourceId));
                    j.append(" fname=");
                    j.append(attributeValue);
                    j.append(" existing=");
                    j.append(G);
                    Log.v("FragmentManager", j.toString());
                }
                if (G == null) {
                    w K = this.f1470b.K();
                    context.getClassLoader();
                    G = K.a(attributeValue);
                    G.m = true;
                    G.v = resourceId != 0 ? resourceId : id;
                    G.w = id;
                    G.x = string;
                    G.n = true;
                    z zVar = this.f1470b;
                    G.r = zVar;
                    h<?> hVar = zVar.o;
                    G.s = hVar;
                    Context context2 = hVar.f1411c;
                    G.R(attributeSet, G.f223c);
                    this.f1470b.b(G);
                    z zVar2 = this.f1470b;
                    zVar2.T(G, zVar2.n);
                } else {
                    if (G.n) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id) + " with another fragment for " + attributeValue);
                    }
                    G.n = true;
                    h<?> hVar2 = this.f1470b.o;
                    G.s = hVar2;
                    Context context3 = hVar2.f1411c;
                    G.R(attributeSet, G.f223c);
                }
                z zVar3 = this.f1470b;
                int i = zVar3.n;
                if (i >= 1 || !G.m) {
                    zVar3.T(G, i);
                } else {
                    zVar3.T(G, 1);
                }
                View view2 = G.E;
                if (view2 == null) {
                    throw new IllegalStateException(c.a.a.a.a.h("Fragment ", attributeValue, " did not create a view."));
                }
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (G.E.getTag() == null) {
                    G.E.setTag(string);
                }
                return G.E;
            }
        }
        return null;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}
