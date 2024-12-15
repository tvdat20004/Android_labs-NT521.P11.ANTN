package c.c.a.a.u1.w0.x;

import android.net.Uri;
import android.text.TextUtils;
import c.c.a.a.y1.s0;
import c.c.a.a.z1.l0;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public class d extends DefaultHandler implements s0.a<b> {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f3050b = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3051c = Pattern.compile("CC([1-4])=.*");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f3052d = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f3053a;

    public d() {
        try {
            this.f3053a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static int b(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 == -1) {
            return i;
        }
        c.c.a.a.x1.p.g(i == i2);
        return i;
    }

    public static void c(XmlPullParser xmlPullParser) {
        if (c.c.a.a.x1.p.n(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (c.c.a.a.x1.p.n(xmlPullParser)) {
                    i++;
                } else {
                    if (xmlPullParser.getEventType() == 3) {
                        i--;
                    }
                }
            }
        }
    }

    public static boolean d(String str) {
        return c.c.a.a.z1.u.i(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str) || "application/cea-608".equals(str);
    }

    public static e i(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = "";
        }
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "value");
        if (attributeValue2 == null) {
            attributeValue2 = null;
        }
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "id");
        String str2 = attributeValue3 != null ? attributeValue3 : null;
        do {
            xmlPullParser.next();
        } while (!c.c.a.a.x1.p.m(xmlPullParser, str));
        return new e(attributeValue, attributeValue2, str2);
    }

    public static long j(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = l0.h.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? Double.parseDouble(group4) * 3600.0d : 0.0d);
        String group5 = matcher.group(12);
        double parseDouble5 = parseDouble4 + (group5 != null ? Double.parseDouble(group5) * 60.0d : 0.0d);
        String group6 = matcher.group(14);
        long parseDouble6 = (long) ((parseDouble5 + (group6 != null ? Double.parseDouble(group6) : 0.0d)) * 1000.0d);
        return isEmpty ? -parseDouble6 : parseDouble6;
    }

    public static float k(XmlPullParser xmlPullParser, float f2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f2;
        }
        Matcher matcher = f3050b.matcher(attributeValue);
        if (!matcher.matches()) {
            return f2;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        float f3 = parseInt;
        return !TextUtils.isEmpty(matcher.group(2)) ? f3 / Integer.parseInt(r2) : f3;
    }

    public static int l(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? i : Integer.parseInt(attributeValue);
    }

    public static long m(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue == null ? j : Long.parseLong(attributeValue);
    }

    @Override // c.c.a.a.y1.s0.a
    public b a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f3053a.newPullParser();
            newPullParser.setInput(inputStream, null);
            if (newPullParser.next() == 2 && "MPD".equals(newPullParser.getName())) {
                return n(newPullParser, uri.toString());
            }
            throw new c.c.a.a.s0("inputStream does not contain a valid media presentation description");
        } catch (XmlPullParserException e2) {
            throw new c.c.a.a.s0(e2);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public int e(XmlPullParser xmlPullParser) {
        String I;
        char c2;
        int i;
        String attributeValue = xmlPullParser.getAttributeValue(null, "schemeIdUri");
        if (attributeValue == null) {
            attributeValue = null;
        }
        int i2 = 2;
        if ("urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(attributeValue)) {
            i2 = l(xmlPullParser, "value", -1);
        } else {
            if ("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(attributeValue) && (I = l0.I(xmlPullParser.getAttributeValue(null, "value"))) != null) {
                switch (I.hashCode()) {
                    case 1596796:
                        if (I.equals("4000")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 2937391:
                        if (I.equals("a000")) {
                            c2 = 1;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3094035:
                        if (I.equals("f801")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 3133436:
                        if (I.equals("fa01")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                switch (c2) {
                    case 0:
                        i2 = 1;
                        break;
                    case 2:
                        i = 6;
                        i2 = i;
                        break;
                    case 3:
                        i = 8;
                        i2 = i;
                        break;
                }
            }
            i2 = -1;
        }
        do {
            xmlPullParser.next();
        } while (!c.c.a.a.x1.p.m(xmlPullParser, "AudioChannelConfiguration"));
        return i2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0169 A[LOOP:2: B:28:0x00ae->B:34:0x0169, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.util.Pair<java.lang.String, c.c.a.a.p1.d> f(org.xmlpull.v1.XmlPullParser r18) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.u1.w0.x.d.f(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    public int g(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        return "text".equals(attributeValue) ? 3 : -1;
    }

    public int h(String str) {
        if (str == null) {
            return 0;
        }
        switch (str) {
        }
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:119:0x095c A[LOOP:3: B:112:0x0290->B:119:0x095c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0838 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x08be A[LOOP:6: B:134:0x087b->B:148:0x08be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x08ba A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0796 A[LOOP:7: B:220:0x03f3->B:229:0x0796, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x04c2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:322:0x074a  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x076a  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x074d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0c4f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0c65  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c.c.a.a.u1.w0.x.b n(org.xmlpull.v1.XmlPullParser r109, java.lang.String r110) {
        /*
            Method dump skipped, instructions count: 3244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.u1.w0.x.d.n(org.xmlpull.v1.XmlPullParser, java.lang.String):c.c.a.a.u1.w0.x.b");
    }

    public i o(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j = Long.parseLong(split[0]);
            if (split.length == 2) {
                j2 = (Long.parseLong(split[1]) - j) + 1;
                return new i(attributeValue, j, j2);
            }
        } else {
            j = 0;
        }
        j2 = -1;
        return new i(attributeValue, j, j2);
    }

    public r p(XmlPullParser xmlPullParser, r rVar) {
        long j;
        long j2;
        long m = m(xmlPullParser, "timescale", rVar != null ? rVar.f3089b : 1L);
        long m2 = m(xmlPullParser, "presentationTimeOffset", rVar != null ? rVar.f3090c : 0L);
        long j3 = rVar != null ? rVar.f3086d : 0L;
        long j4 = rVar != null ? rVar.f3087e : 0L;
        String attributeValue = xmlPullParser.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - parseLong) + 1;
            j2 = parseLong;
        } else {
            j = j4;
            j2 = j3;
        }
        i iVar = rVar != null ? rVar.f3088a : null;
        do {
            xmlPullParser.next();
            if (c.c.a.a.x1.p.o(xmlPullParser, "Initialization")) {
                iVar = o(xmlPullParser, "sourceURL", "range");
            } else {
                c(xmlPullParser);
            }
        } while (!c.c.a.a.x1.p.m(xmlPullParser, "SegmentBase"));
        return new r(iVar, m, m2, j2, j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o q(XmlPullParser xmlPullParser, o oVar) {
        List list;
        long m = m(xmlPullParser, "timescale", oVar != null ? oVar.f3089b : 1L);
        long m2 = m(xmlPullParser, "presentationTimeOffset", oVar != null ? oVar.f3090c : 0L);
        long m3 = m(xmlPullParser, "duration", oVar != null ? oVar.f3082e : -9223372036854775807L);
        long m4 = m(xmlPullParser, "startNumber", oVar != null ? oVar.f3081d : 1L);
        List list2 = null;
        i iVar = null;
        List<q> list3 = null;
        do {
            xmlPullParser.next();
            if (c.c.a.a.x1.p.o(xmlPullParser, "Initialization")) {
                iVar = o(xmlPullParser, "sourceURL", "range");
            } else if (c.c.a.a.x1.p.o(xmlPullParser, "SegmentTimeline")) {
                list3 = s(xmlPullParser);
            } else if (c.c.a.a.x1.p.o(xmlPullParser, "SegmentURL")) {
                if (list2 == null) {
                    list2 = new ArrayList();
                }
                list2.add(o(xmlPullParser, "media", "mediaRange"));
            } else {
                c(xmlPullParser);
            }
        } while (!c.c.a.a.x1.p.m(xmlPullParser, "SegmentList"));
        if (oVar != null) {
            if (iVar == null) {
                iVar = oVar.f3088a;
            }
            if (list3 == null) {
                list3 = oVar.f3083f;
            }
            if (list2 == null) {
                list = oVar.g;
                return new o(iVar, m, m2, m4, m3, list3, list);
            }
        }
        list = list2;
        return new o(iVar, m, m2, m4, m3, list3, list);
    }

    public p r(XmlPullParser xmlPullParser, p pVar, List<e> list) {
        long j;
        i iVar;
        List<q> list2;
        long m = m(xmlPullParser, "timescale", pVar != null ? pVar.f3089b : 1L);
        long m2 = m(xmlPullParser, "presentationTimeOffset", pVar != null ? pVar.f3090c : 0L);
        long m3 = m(xmlPullParser, "duration", pVar != null ? pVar.f3082e : -9223372036854775807L);
        long m4 = m(xmlPullParser, "startNumber", pVar != null ? pVar.f3081d : 1L);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j = -1;
                break;
            }
            e eVar = list.get(i);
            if ("http://dashif.org/guidelines/last-segment-number".equalsIgnoreCase(eVar.f3054a)) {
                j = Long.parseLong(eVar.f3055b);
                break;
            }
            i++;
        }
        long j2 = j;
        i iVar2 = null;
        u t = t(xmlPullParser, "media", pVar != null ? pVar.h : null);
        u t2 = t(xmlPullParser, "initialization", pVar != null ? pVar.g : null);
        List<q> list3 = null;
        do {
            xmlPullParser.next();
            if (c.c.a.a.x1.p.o(xmlPullParser, "Initialization")) {
                iVar2 = o(xmlPullParser, "sourceURL", "range");
            } else if (c.c.a.a.x1.p.o(xmlPullParser, "SegmentTimeline")) {
                list3 = s(xmlPullParser);
            } else {
                c(xmlPullParser);
            }
        } while (!c.c.a.a.x1.p.m(xmlPullParser, "SegmentTemplate"));
        if (pVar != null) {
            if (iVar2 == null) {
                iVar2 = pVar.f3088a;
            }
            if (list3 == null) {
                list2 = pVar.f3083f;
                iVar = iVar2;
                return new p(iVar, m, m2, m4, j2, m3, list2, t2, t);
            }
        }
        iVar = iVar2;
        list2 = list3;
        return new p(iVar, m, m2, m4, j2, m3, list2, t2, t);
    }

    public List<q> s(XmlPullParser xmlPullParser) {
        ArrayList arrayList = new ArrayList();
        long j = 0;
        do {
            xmlPullParser.next();
            if (c.c.a.a.x1.p.o(xmlPullParser, "S")) {
                j = m(xmlPullParser, "t", j);
                long m = m(xmlPullParser, "d", -9223372036854775807L);
                int l = l(xmlPullParser, "r", 0) + 1;
                for (int i = 0; i < l; i++) {
                    arrayList.add(new q(j, m));
                    j += m;
                }
            } else {
                c(xmlPullParser);
            }
        } while (!c.c.a.a.x1.p.m(xmlPullParser, "SegmentTimeline"));
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e8, code lost:
    
        switch(r9) {
            case 0: goto L47;
            case 1: goto L46;
            case 2: goto L45;
            default: goto L60;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f7, code lost:
    
        r0[r5] = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0100, code lost:
    
        r1[r5] = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00fb, code lost:
    
        r0[r5] = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fe, code lost:
    
        r0[r5] = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00f6, code lost:
    
        throw new java.lang.IllegalArgumentException(c.a.a.a.a.g("Invalid template: ", r12));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c.c.a.a.u1.w0.x.u t(org.xmlpull.v1.XmlPullParser r12, java.lang.String r13, c.c.a.a.u1.w0.x.u r14) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.u1.w0.x.d.t(org.xmlpull.v1.XmlPullParser, java.lang.String, c.c.a.a.u1.w0.x.u):c.c.a.a.u1.w0.x.u");
    }
}
