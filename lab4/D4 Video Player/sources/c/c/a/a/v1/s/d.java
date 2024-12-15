package c.c.a.a.v1.s;

import android.text.Layout;
import android.util.Log;
import c.c.a.a.x1.p;
import c.c.a.a.z1.i;
import c.c.a.a.z1.l0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public final class d extends c.c.a.a.v1.c {
    public static final Pattern o = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    public static final Pattern p = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    public static final Pattern q = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    public static final Pattern r = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");
    public static final Pattern s = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");
    public static final Pattern t = Pattern.compile("^(\\d+) (\\d+)$");
    public static final b u = new b(30.0f, 1, 1);
    public static final a v = new a(32, 15);
    public final XmlPullParserFactory n;

    public d() {
        super("TtmlDecoder");
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.n = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    public static boolean m(String str) {
        return str.equals("tt") || str.equals("head") || str.equals("body") || str.equals("div") || str.equals("p") || str.equals("span") || str.equals("br") || str.equals("style") || str.equals("styling") || str.equals("layout") || str.equals("region") || str.equals("metadata") || str.equals("image") || str.equals("data") || str.equals("information");
    }

    public static void o(String str, g gVar) {
        Matcher matcher;
        String group;
        int i = l0.f3761a;
        String[] split = str.split("\\s+", -1);
        if (split.length == 1) {
            matcher = q.matcher(str);
        } else {
            if (split.length != 2) {
                StringBuilder j = c.a.a.a.a.j("Invalid number of entries for fontSize: ");
                j.append(split.length);
                j.append(".");
                throw new c.c.a.a.v1.g(j.toString());
            }
            matcher = q.matcher(split[1]);
            Log.w("TtmlDecoder", "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new c.c.a.a.v1.g(c.a.a.a.a.h("Invalid expression for fontSize: '", str, "'."));
        }
        group = matcher.group(3);
        group.hashCode();
        group.hashCode();
        switch (group) {
            case "%":
                gVar.j = 3;
                break;
            case "em":
                gVar.j = 2;
                break;
            case "px":
                gVar.j = 1;
                break;
            default:
                throw new c.c.a.a.v1.g(c.a.a.a.a.h("Invalid unit for fontSize: '", group, "'."));
        }
        gVar.k = Float.valueOf(matcher.group(1)).floatValue();
    }

    public static long u(String str, b bVar) {
        double parseDouble;
        double d2;
        double d3;
        Matcher matcher = o.matcher(str);
        if (matcher.matches()) {
            double parseLong = (Long.parseLong(matcher.group(1)) * 3600) + (Long.parseLong(matcher.group(2)) * 60) + Long.parseLong(matcher.group(3));
            String group = matcher.group(4);
            return (long) ((parseLong + (group != null ? Double.parseDouble(group) : 0.0d) + (matcher.group(5) != null ? Long.parseLong(r13) / bVar.f3339a : 0.0d) + (matcher.group(6) != null ? (Long.parseLong(r13) / bVar.f3340b) / bVar.f3339a : 0.0d)) * 1000000.0d);
        }
        Matcher matcher2 = p.matcher(str);
        if (!matcher2.matches()) {
            throw new c.c.a.a.v1.g(c.a.a.a.a.g("Malformed time expression: ", str));
        }
        parseDouble = Double.parseDouble(matcher2.group(1));
        String group2 = matcher2.group(2);
        group2.hashCode();
        group2.hashCode();
        switch (group2) {
            case "f":
                d2 = bVar.f3339a;
                parseDouble /= d2;
                break;
            case "h":
                d3 = 3600.0d;
                break;
            case "m":
                d3 = 60.0d;
                break;
            case "t":
                d2 = bVar.f3341c;
                parseDouble /= d2;
                break;
            case "ms":
                d2 = 1000.0d;
                parseDouble /= d2;
                break;
        }
        parseDouble *= d3;
        return (long) (parseDouble * 1000000.0d);
    }

    @Override // c.c.a.a.v1.c
    public c.c.a.a.v1.e k(byte[] bArr, int i, boolean z) {
        h hVar;
        b bVar;
        try {
            XmlPullParser newPullParser = this.n.newPullParser();
            Map<String, g> hashMap = new HashMap<>();
            HashMap hashMap2 = new HashMap();
            Map<String, String> hashMap3 = new HashMap<>();
            hashMap2.put("", new f(null, Float.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
            c cVar = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, 0, i), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            b bVar2 = u;
            a aVar = v;
            int i2 = 0;
            h hVar2 = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                e eVar = (e) arrayDeque.peek();
                if (i2 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            bVar2 = p(newPullParser);
                            aVar = n(newPullParser, v);
                            cVar = v(newPullParser);
                        }
                        c cVar2 = cVar;
                        b bVar3 = bVar2;
                        a aVar2 = aVar;
                        if (m(name)) {
                            if ("head".equals(name)) {
                                hVar = hVar2;
                                bVar = bVar3;
                                q(newPullParser, hashMap, aVar2, cVar2, hashMap2, hashMap3);
                            } else {
                                hVar = hVar2;
                                bVar = bVar3;
                                try {
                                    e r2 = r(newPullParser, eVar, hashMap2, bVar);
                                    arrayDeque.push(r2);
                                    if (eVar != null) {
                                        eVar.a(r2);
                                    }
                                } catch (c.c.a.a.v1.g e2) {
                                    Log.w("TtmlDecoder", "Suppressing parser error", e2);
                                    i2++;
                                }
                            }
                            bVar2 = bVar;
                            cVar = cVar2;
                            aVar = aVar2;
                        } else {
                            Log.i("TtmlDecoder", "Ignoring unsupported tag: " + newPullParser.getName());
                            i2++;
                            bVar2 = bVar3;
                            cVar = cVar2;
                            aVar = aVar2;
                        }
                    } else {
                        hVar = hVar2;
                        if (eventType == 4) {
                            e b2 = e.b(newPullParser.getText());
                            if (eVar.l == null) {
                                eVar.l = new ArrayList();
                            }
                            eVar.l.add(b2);
                        } else if (eventType == 3) {
                            hVar2 = newPullParser.getName().equals("tt") ? new h((e) arrayDeque.peek(), hashMap, hashMap2, hashMap3) : hVar;
                            arrayDeque.pop();
                        }
                    }
                    newPullParser.next();
                } else {
                    hVar = hVar2;
                    if (eventType == 2) {
                        i2++;
                    } else if (eventType == 3) {
                        i2--;
                    }
                }
                hVar2 = hVar;
                newPullParser.next();
            }
            return hVar2;
        } catch (IOException e3) {
            throw new IllegalStateException("Unexpected error when reading input.", e3);
        } catch (XmlPullParserException e4) {
            throw new c.c.a.a.v1.g("Unable to decode source", e4);
        }
    }

    public final g l(g gVar) {
        return gVar == null ? new g() : gVar;
    }

    public final a n(XmlPullParser xmlPullParser, a aVar) {
        String g;
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "cellResolution");
        if (attributeValue == null) {
            return aVar;
        }
        Matcher matcher = t.matcher(attributeValue);
        if (matcher.matches()) {
            try {
                int parseInt = Integer.parseInt(matcher.group(1));
                int parseInt2 = Integer.parseInt(matcher.group(2));
                if (parseInt != 0 && parseInt2 != 0) {
                    return new a(parseInt, parseInt2);
                }
                throw new c.c.a.a.v1.g("Invalid cell resolution " + parseInt + " " + parseInt2);
            } catch (NumberFormatException unused) {
                g = c.a.a.a.a.g("Ignoring malformed cell resolution: ", attributeValue);
            }
        } else {
            g = c.a.a.a.a.g("Ignoring malformed cell resolution: ", attributeValue);
        }
        Log.w("TtmlDecoder", g);
        return aVar;
    }

    public final b p(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        float f2 = 1.0f;
        String attributeValue2 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "frameRateMultiplier");
        if (attributeValue2 != null) {
            int i = l0.f3761a;
            if (attributeValue2.split(" ", -1).length != 2) {
                throw new c.c.a.a.v1.g("frameRateMultiplier doesn't have 2 parts");
            }
            f2 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        }
        b bVar = u;
        int i2 = bVar.f3340b;
        String attributeValue3 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "subFrameRate");
        if (attributeValue3 != null) {
            i2 = Integer.parseInt(attributeValue3);
        }
        int i3 = bVar.f3341c;
        String attributeValue4 = xmlPullParser.getAttributeValue("http://www.w3.org/ns/ttml#parameter", "tickRate");
        if (attributeValue4 != null) {
            i3 = Integer.parseInt(attributeValue4);
        }
        return new b(parseInt * f2, i2, i3);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Map<java.lang.String, c.c.a.a.v1.s.g> q(org.xmlpull.v1.XmlPullParser r19, java.util.Map<java.lang.String, c.c.a.a.v1.s.g> r20, c.c.a.a.v1.s.a r21, c.c.a.a.v1.s.c r22, java.util.Map<java.lang.String, c.c.a.a.v1.s.f> r23, java.util.Map<java.lang.String, java.lang.String> r24) {
        /*
            Method dump skipped, instructions count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.v1.s.d.q(org.xmlpull.v1.XmlPullParser, java.util.Map, c.c.a.a.v1.s.a, c.c.a.a.v1.s.c, java.util.Map, java.util.Map):java.util.Map");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final e r(XmlPullParser xmlPullParser, e eVar, Map<String, f> map, b bVar) {
        long j;
        char c2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser.getAttributeCount();
        g s2 = s(xmlPullParser2, null);
        String[] strArr = null;
        String str = null;
        String str2 = "";
        int i = 0;
        long j2 = -9223372036854775807L;
        long j3 = -9223372036854775807L;
        long j4 = -9223372036854775807L;
        while (i < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i);
            String attributeValue = xmlPullParser2.getAttributeValue(i);
            attributeName.hashCode();
            switch (attributeName.hashCode()) {
                case -934795532:
                    if (attributeName.equals("region")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 99841:
                    if (attributeName.equals("dur")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 100571:
                    if (attributeName.equals("end")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 93616297:
                    if (attributeName.equals("begin")) {
                        c2 = 3;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109780401:
                    if (attributeName.equals("style")) {
                        c2 = 4;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 1292595405:
                    if (attributeName.equals("backgroundImage")) {
                        c2 = 5;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            if (c2 != 0) {
                if (c2 == 1) {
                    j4 = u(attributeValue, bVar);
                } else if (c2 == 2) {
                    j3 = u(attributeValue, bVar);
                } else if (c2 == 3) {
                    j2 = u(attributeValue, bVar);
                } else if (c2 == 4) {
                    String[] t2 = t(attributeValue);
                    if (t2.length > 0) {
                        strArr = t2;
                    }
                } else if (c2 == 5 && attributeValue.startsWith("#")) {
                    str = attributeValue.substring(1);
                }
            } else if (map.containsKey(attributeValue)) {
                str2 = attributeValue;
            }
            i++;
            xmlPullParser2 = xmlPullParser;
        }
        if (eVar != null) {
            long j5 = eVar.f3347d;
            j = -9223372036854775807L;
            if (j5 != -9223372036854775807L) {
                if (j2 != -9223372036854775807L) {
                    j2 += j5;
                }
                if (j3 != -9223372036854775807L) {
                    j3 += j5;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (j3 == j) {
            if (j4 != j) {
                j3 = j2 + j4;
            } else if (eVar != null) {
                long j6 = eVar.f3348e;
                if (j6 != j) {
                    j3 = j6;
                }
            }
        }
        return new e(xmlPullParser.getName(), null, j2, j3, s2, strArr, str2, str);
    }

    public final g s(XmlPullParser xmlPullParser, g gVar) {
        String attributeValue;
        StringBuilder sb;
        String str;
        Layout.Alignment alignment;
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            attributeValue = xmlPullParser.getAttributeValue(i);
            String attributeName = xmlPullParser.getAttributeName(i);
            attributeName.hashCode();
            attributeName.hashCode();
            switch (attributeName) {
                case "fontStyle":
                    gVar = l(gVar);
                    boolean equalsIgnoreCase = "italic".equalsIgnoreCase(attributeValue);
                    p.g(true);
                    gVar.i = equalsIgnoreCase ? 1 : 0;
                    continue;
                case "fontFamily":
                    gVar = l(gVar);
                    p.g(true);
                    gVar.f3356a = attributeValue;
                    continue;
                case "textAlign":
                    String I = l0.I(attributeValue);
                    I.hashCode();
                    I.hashCode();
                    switch (I) {
                        case "center":
                            gVar = l(gVar);
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            gVar.m = alignment;
                            continue;
                        case "end":
                        case "right":
                            gVar = l(gVar);
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            gVar.m = alignment;
                            continue;
                        case "left":
                        case "start":
                            gVar = l(gVar);
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            gVar.m = alignment;
                            continue;
                    }
                case "textDecoration":
                    String I2 = l0.I(attributeValue);
                    I2.hashCode();
                    I2.hashCode();
                    switch (I2) {
                        case "nounderline":
                            gVar = l(gVar);
                            p.g(true);
                            gVar.g = 0;
                            break;
                        case "underline":
                            gVar = l(gVar);
                            p.g(true);
                            gVar.g = 1;
                            break;
                        case "nolinethrough":
                            gVar = l(gVar);
                            p.g(true);
                            gVar.f3361f = 0;
                            break;
                        case "linethrough":
                            gVar = l(gVar);
                            p.g(true);
                            gVar.f3361f = 1;
                            continue;
                    }
                case "fontWeight":
                    gVar = l(gVar);
                    boolean equalsIgnoreCase2 = "bold".equalsIgnoreCase(attributeValue);
                    p.g(true);
                    gVar.h = equalsIgnoreCase2 ? 1 : 0;
                    continue;
                case "id":
                    if ("style".equals(xmlPullParser.getName())) {
                        gVar = l(gVar);
                        gVar.l = attributeValue;
                        break;
                    } else {
                        continue;
                    }
                case "color":
                    gVar = l(gVar);
                    try {
                        int a2 = i.a(attributeValue, false);
                        p.g(true);
                        gVar.f3357b = a2;
                        gVar.f3358c = true;
                        continue;
                    } catch (IllegalArgumentException unused) {
                        sb = new StringBuilder();
                        str = "Failed parsing color value: ";
                        break;
                    }
                case "fontSize":
                    try {
                        gVar = l(gVar);
                        o(attributeValue, gVar);
                        continue;
                    } catch (c.c.a.a.v1.g unused2) {
                        sb = new StringBuilder();
                        str = "Failed parsing fontSize value: ";
                        break;
                    }
                case "backgroundColor":
                    gVar = l(gVar);
                    try {
                        gVar.f3359d = i.a(attributeValue, false);
                        gVar.f3360e = true;
                        continue;
                    } catch (IllegalArgumentException unused3) {
                        sb = new StringBuilder();
                        str = "Failed parsing background value: ";
                        break;
                    }
            }
            sb.append(str);
            sb.append(attributeValue);
            Log.w("TtmlDecoder", sb.toString());
        }
        return gVar;
    }

    public final String[] t(String str) {
        String trim = str.trim();
        if (trim.isEmpty()) {
            return new String[0];
        }
        int i = l0.f3761a;
        return trim.split("\\s+", -1);
    }

    public final c v(XmlPullParser xmlPullParser) {
        String g;
        String k = p.k(xmlPullParser, "extent");
        if (k == null) {
            return null;
        }
        Matcher matcher = s.matcher(k);
        if (matcher.matches()) {
            try {
                return new c(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
            } catch (NumberFormatException unused) {
                g = c.a.a.a.a.g("Ignoring malformed tts extent: ", k);
            }
        } else {
            g = c.a.a.a.a.g("Ignoring non-pixel tts extent: ", k);
        }
        Log.w("TtmlDecoder", g);
        return null;
    }
}
