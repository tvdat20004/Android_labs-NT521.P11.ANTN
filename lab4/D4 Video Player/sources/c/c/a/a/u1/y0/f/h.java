package c.c.a.a.u1.y0.f;

import android.util.Pair;
import c.c.a.a.l0;
import c.c.a.a.s0;
import c.c.a.a.x1.p;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class h extends d {

    /* renamed from: e, reason: collision with root package name */
    public final List<b> f3233e;

    /* renamed from: f, reason: collision with root package name */
    public int f3234f;
    public int g;
    public long h;
    public long i;
    public long j;
    public int k;
    public boolean l;
    public a m;

    public h(d dVar, String str) {
        super(null, str, "SmoothStreamingMedia");
        this.k = -1;
        this.m = null;
        this.f3233e = new LinkedList();
    }

    @Override // c.c.a.a.u1.y0.f.d
    public void a(Object obj) {
        if (obj instanceof b) {
            this.f3233e.add((b) obj);
        } else if (obj instanceof a) {
            p.g(this.m == null);
            this.m = (a) obj;
        }
    }

    @Override // c.c.a.a.u1.y0.f.d
    public Object b() {
        int size = this.f3233e.size();
        b[] bVarArr = new b[size];
        this.f3233e.toArray(bVarArr);
        a aVar = this.m;
        if (aVar != null) {
            c.c.a.a.p1.e eVar = new c.c.a.a.p1.e(null, true, new c.c.a.a.p1.d(aVar.f3211a, "video/mp4", aVar.f3212b));
            for (int i = 0; i < size; i++) {
                b bVar = bVarArr[i];
                int i2 = bVar.f3214a;
                if (i2 == 2 || i2 == 1) {
                    l0[] l0VarArr = bVar.j;
                    for (int i3 = 0; i3 < l0VarArr.length; i3++) {
                        l0VarArr[i3] = l0VarArr[i3].i(eVar);
                    }
                }
            }
        }
        return new c(this.f3234f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, bVarArr);
    }

    @Override // c.c.a.a.u1.y0.f.d
    public void k(XmlPullParser xmlPullParser) {
        this.f3234f = i(xmlPullParser, "MajorVersion");
        this.g = i(xmlPullParser, "MinorVersion");
        this.h = h(xmlPullParser, "TimeScale", 10000000L);
        String attributeValue = xmlPullParser.getAttributeValue(null, "Duration");
        if (attributeValue == null) {
            throw new e("Duration");
        }
        try {
            this.i = Long.parseLong(attributeValue);
            this.j = h(xmlPullParser, "DVRWindowLength", 0L);
            this.k = g(xmlPullParser, "LookaheadCount", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "IsLive");
            this.l = attributeValue2 != null ? Boolean.parseBoolean(attributeValue2) : false;
            this.f3229d.add(Pair.create("TimeScale", Long.valueOf(this.h)));
        } catch (NumberFormatException e2) {
            throw new s0(e2);
        }
    }
}
