package c.c.a.a.u1.y0.f;

import android.util.Pair;
import c.c.a.a.s0;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f3226a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3227b;

    /* renamed from: c, reason: collision with root package name */
    public final d f3228c;

    /* renamed from: d, reason: collision with root package name */
    public final List<Pair<String, Object>> f3229d = new LinkedList();

    public d(d dVar, String str, String str2) {
        this.f3228c = dVar;
        this.f3226a = str;
        this.f3227b = str2;
    }

    public void a(Object obj) {
    }

    public abstract Object b();

    public final Object c(String str) {
        for (int i = 0; i < this.f3229d.size(); i++) {
            Pair<String, Object> pair = this.f3229d.get(i);
            if (((String) pair.first).equals(str)) {
                return pair.second;
            }
        }
        d dVar = this.f3228c;
        if (dVar == null) {
            return null;
        }
        return dVar.c(str);
    }

    public boolean d(String str) {
        return false;
    }

    public final Object e(XmlPullParser xmlPullParser) {
        boolean z = false;
        int i = 0;
        while (true) {
            int eventType = xmlPullParser.getEventType();
            d dVar = null;
            if (eventType == 1) {
                return null;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (this.f3227b.equals(name)) {
                    k(xmlPullParser);
                    z = true;
                } else if (z) {
                    if (i > 0) {
                        i++;
                    } else if (d(name)) {
                        k(xmlPullParser);
                    } else {
                        String str = this.f3226a;
                        if ("QualityLevel".equals(name)) {
                            dVar = new g(this, str);
                        } else if ("Protection".equals(name)) {
                            dVar = new f(this, str);
                        } else if ("StreamIndex".equals(name)) {
                            dVar = new i(this, str);
                        }
                        if (dVar == null) {
                            i = 1;
                        } else {
                            a(dVar.e(xmlPullParser));
                        }
                    }
                }
            } else if (eventType != 3) {
                if (eventType == 4 && z && i == 0) {
                    l(xmlPullParser);
                }
            } else if (!z) {
                continue;
            } else if (i > 0) {
                i--;
            } else {
                String name2 = xmlPullParser.getName();
                f(xmlPullParser);
                if (!d(name2)) {
                    return b();
                }
            }
            xmlPullParser.next();
        }
    }

    public void f(XmlPullParser xmlPullParser) {
    }

    public final int g(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return i;
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e2) {
            throw new s0(e2);
        }
    }

    public final long h(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        try {
            return Long.parseLong(attributeValue);
        } catch (NumberFormatException e2) {
            throw new s0(e2);
        }
    }

    public final int i(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            throw new e(str);
        }
        try {
            return Integer.parseInt(attributeValue);
        } catch (NumberFormatException e2) {
            throw new s0(e2);
        }
    }

    public final String j(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue != null) {
            return attributeValue;
        }
        throw new e(str);
    }

    public abstract void k(XmlPullParser xmlPullParser);

    public void l(XmlPullParser xmlPullParser) {
    }
}
