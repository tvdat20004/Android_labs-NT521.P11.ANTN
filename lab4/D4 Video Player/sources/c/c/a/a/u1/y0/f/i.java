package c.c.a.a.u1.y0.f;

import android.util.Pair;
import c.c.a.a.l0;
import c.c.a.a.s0;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class i extends d {

    /* renamed from: e, reason: collision with root package name */
    public final String f3235e;

    /* renamed from: f, reason: collision with root package name */
    public final List<l0> f3236f;
    public int g;
    public String h;
    public long i;
    public String j;
    public String k;
    public int l;
    public int m;
    public int n;
    public int o;
    public String p;
    public ArrayList<Long> q;
    public long r;

    public i(d dVar, String str) {
        super(dVar, str, "StreamIndex");
        this.f3235e = str;
        this.f3236f = new LinkedList();
    }

    @Override // c.c.a.a.u1.y0.f.d
    public void a(Object obj) {
        if (obj instanceof l0) {
            this.f3236f.add((l0) obj);
        }
    }

    @Override // c.c.a.a.u1.y0.f.d
    public Object b() {
        String str;
        String str2;
        String str3;
        l0[] l0VarArr = new l0[this.f3236f.size()];
        this.f3236f.toArray(l0VarArr);
        String str4 = this.f3235e;
        String str5 = this.k;
        int i = this.g;
        String str6 = this.h;
        long j = this.i;
        String str7 = this.j;
        int i2 = this.l;
        int i3 = this.m;
        int i4 = this.n;
        int i5 = this.o;
        String str8 = this.p;
        ArrayList<Long> arrayList = this.q;
        long j2 = this.r;
        int i6 = c.c.a.a.z1.l0.f3761a;
        int size = arrayList.size();
        long[] jArr = new long[size];
        if (j < 1000000 || j % 1000000 != 0) {
            str = str7;
            if (j >= 1000000 || 1000000 % j != 0) {
                str2 = str6;
                str3 = str8;
                double d2 = 1000000 / j;
                int i7 = 0;
                while (i7 < size) {
                    jArr[i7] = (long) (arrayList.get(i7).longValue() * d2);
                    i7++;
                    arrayList = arrayList;
                }
                return new b(str4, str5, i, str2, j, str, i2, i3, i4, i5, str3, l0VarArr, arrayList, jArr, c.c.a.a.z1.l0.C(j2, 1000000L, j));
            }
            long j3 = 1000000 / j;
            for (int i8 = 0; i8 < size; i8++) {
                jArr[i8] = arrayList.get(i8).longValue() * j3;
            }
        } else {
            long j4 = j / 1000000;
            str = str7;
            for (int i9 = 0; i9 < size; i9++) {
                jArr[i9] = arrayList.get(i9).longValue() / j4;
            }
        }
        str2 = str6;
        str3 = str8;
        return new b(str4, str5, i, str2, j, str, i2, i3, i4, i5, str3, l0VarArr, arrayList, jArr, c.c.a.a.z1.l0.C(j2, 1000000L, j));
    }

    @Override // c.c.a.a.u1.y0.f.d
    public boolean d(String str) {
        return "c".equals(str);
    }

    @Override // c.c.a.a.u1.y0.f.d
    public void k(XmlPullParser xmlPullParser) {
        int i = 1;
        if (!"c".equals(xmlPullParser.getName())) {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new e("Type");
            }
            if (!"audio".equalsIgnoreCase(attributeValue)) {
                if ("video".equalsIgnoreCase(attributeValue)) {
                    i = 2;
                } else {
                    if (!"text".equalsIgnoreCase(attributeValue)) {
                        throw new s0(c.a.a.a.a.h("Invalid key value[", attributeValue, "]"));
                    }
                    i = 3;
                }
            }
            this.g = i;
            this.f3229d.add(Pair.create("Type", Integer.valueOf(i)));
            String j = this.g == 3 ? j(xmlPullParser, "Subtype") : xmlPullParser.getAttributeValue(null, "Subtype");
            this.h = j;
            this.f3229d.add(Pair.create("Subtype", j));
            this.j = xmlPullParser.getAttributeValue(null, "Name");
            this.k = j(xmlPullParser, "Url");
            this.l = g(xmlPullParser, "MaxWidth", -1);
            this.m = g(xmlPullParser, "MaxHeight", -1);
            this.n = g(xmlPullParser, "DisplayWidth", -1);
            this.o = g(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.p = attributeValue2;
            this.f3229d.add(Pair.create("Language", attributeValue2));
            long g = g(xmlPullParser, "TimeScale", -1);
            this.i = g;
            if (g == -1) {
                this.i = ((Long) c("TimeScale")).longValue();
            }
            this.q = new ArrayList<>();
            return;
        }
        int size = this.q.size();
        long h = h(xmlPullParser, "t", -9223372036854775807L);
        if (h == -9223372036854775807L) {
            if (size == 0) {
                h = 0;
            } else {
                if (this.r == -1) {
                    throw new s0("Unable to infer start time");
                }
                h = this.r + this.q.get(size - 1).longValue();
            }
        }
        this.q.add(Long.valueOf(h));
        this.r = h(xmlPullParser, "d", -9223372036854775807L);
        long h2 = h(xmlPullParser, "r", 1L);
        if (h2 > 1 && this.r == -9223372036854775807L) {
            throw new s0("Repeated chunk with unspecified duration");
        }
        while (true) {
            long j2 = i;
            if (j2 >= h2) {
                return;
            }
            this.q.add(Long.valueOf((this.r * j2) + h));
            i++;
        }
    }
}
