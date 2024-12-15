package b.b.h;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import b.b.h.m.p;
import b.b.i.d1;
import b.b.i.l2;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class j extends MenuInflater {

    /* renamed from: e, reason: collision with root package name */
    public static final Class<?>[] f548e;

    /* renamed from: f, reason: collision with root package name */
    public static final Class<?>[] f549f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f550a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f551b;

    /* renamed from: c, reason: collision with root package name */
    public Context f552c;

    /* renamed from: d, reason: collision with root package name */
    public Object f553d;

    static {
        Class<?>[] clsArr = {Context.class};
        f548e = clsArr;
        f549f = clsArr;
    }

    public j(Context context) {
        super(context);
        this.f552c = context;
        Object[] objArr = {context};
        this.f550a = objArr;
        this.f551b = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        p pVar;
        ColorStateList colorStateList;
        i iVar = new i(this, menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException(c.a.a.a.a.g("Expecting menu, got ", name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != 2) {
                if (eventType == 3) {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        str = null;
                        z2 = false;
                    } else if (name2.equals("group")) {
                        iVar.f543b = 0;
                        iVar.f544c = 0;
                        iVar.f545d = 0;
                        iVar.f546e = 0;
                        iVar.f547f = true;
                        iVar.g = true;
                    } else if (name2.equals("item")) {
                        if (!iVar.h) {
                            p pVar2 = iVar.A;
                            if (pVar2 == null || !pVar2.f621b.hasSubMenu()) {
                                iVar.h = true;
                                iVar.c(iVar.f542a.add(iVar.f543b, iVar.i, iVar.j, iVar.k));
                            } else {
                                iVar.a();
                            }
                        }
                    } else if (name2.equals("menu")) {
                        z = true;
                    }
                }
            } else if (!z2) {
                String name3 = xmlPullParser.getName();
                if (name3.equals("group")) {
                    TypedArray obtainStyledAttributes = iVar.F.f552c.obtainStyledAttributes(attributeSet, b.b.b.p);
                    iVar.f543b = obtainStyledAttributes.getResourceId(1, 0);
                    iVar.f544c = obtainStyledAttributes.getInt(3, 0);
                    iVar.f545d = obtainStyledAttributes.getInt(4, 0);
                    iVar.f546e = obtainStyledAttributes.getInt(5, 0);
                    iVar.f547f = obtainStyledAttributes.getBoolean(2, true);
                    iVar.g = obtainStyledAttributes.getBoolean(0, true);
                    obtainStyledAttributes.recycle();
                } else if (name3.equals("item")) {
                    l2 q = l2.q(iVar.F.f552c, attributeSet, b.b.b.q);
                    iVar.i = q.m(2, 0);
                    iVar.j = (q.j(5, iVar.f544c) & (-65536)) | (q.j(6, iVar.f545d) & 65535);
                    iVar.k = q.o(7);
                    iVar.l = q.o(8);
                    iVar.m = q.m(0, 0);
                    String n = q.n(9);
                    iVar.n = n == null ? (char) 0 : n.charAt(0);
                    iVar.o = q.j(16, 4096);
                    String n2 = q.n(10);
                    iVar.p = n2 == null ? (char) 0 : n2.charAt(0);
                    iVar.q = q.j(20, 4096);
                    iVar.r = q.p(11) ? q.a(11, false) : iVar.f546e;
                    iVar.s = q.a(3, false);
                    iVar.t = q.a(4, iVar.f547f);
                    iVar.u = q.a(1, iVar.g);
                    iVar.v = q.j(21, -1);
                    iVar.z = q.n(12);
                    iVar.w = q.m(13, 0);
                    iVar.x = q.n(15);
                    String n3 = q.n(14);
                    iVar.y = n3;
                    boolean z3 = n3 != null;
                    if (z3 && iVar.w == 0 && iVar.x == null) {
                        pVar = (p) iVar.b(n3, f549f, iVar.F.f551b);
                    } else {
                        if (z3) {
                            Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }
                        pVar = null;
                    }
                    iVar.A = pVar;
                    iVar.B = q.o(17);
                    iVar.C = q.o(22);
                    if (q.p(19)) {
                        iVar.E = d1.c(q.j(19, -1), iVar.E);
                        colorStateList = null;
                    } else {
                        colorStateList = null;
                        iVar.E = null;
                    }
                    if (q.p(18)) {
                        colorStateList = q.c(18);
                    }
                    iVar.D = colorStateList;
                    q.f730b.recycle();
                    iVar.h = false;
                } else if (name3.equals("menu")) {
                    b(xmlPullParser, attributeSet, iVar.a());
                } else {
                    str = name3;
                    z2 = true;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    @Override // android.view.MenuInflater
    public void inflate(int i, Menu menu) {
        if (!(menu instanceof b.h.e.a.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            try {
                try {
                    xmlResourceParser = this.f552c.getResources().getLayout(i);
                    b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
                    xmlResourceParser.close();
                } catch (XmlPullParserException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (IOException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
