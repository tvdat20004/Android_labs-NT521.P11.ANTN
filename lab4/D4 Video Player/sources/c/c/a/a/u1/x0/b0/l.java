package c.c.a.a.u1.x0.b0;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import b.q.u;
import c.c.a.a.s;
import c.c.a.a.u1.x0.w;
import c.c.a.a.u1.x0.x;
import c.c.a.a.y1.s0;
import c.c.a.a.z1.l0;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class l implements s0.a<j> {

    /* renamed from: a, reason: collision with root package name */
    public final g f3152a;

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f3147b = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3148c = Pattern.compile("VIDEO=\"(.+?)\"");

    /* renamed from: d, reason: collision with root package name */
    public static final Pattern f3149d = Pattern.compile("AUDIO=\"(.+?)\"");

    /* renamed from: e, reason: collision with root package name */
    public static final Pattern f3150e = Pattern.compile("SUBTITLES=\"(.+?)\"");

    /* renamed from: f, reason: collision with root package name */
    public static final Pattern f3151f = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    public static final Pattern g = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    public static final Pattern h = Pattern.compile("CHANNELS=\"(.+?)\"");
    public static final Pattern i = Pattern.compile("CODECS=\"(.+?)\"");
    public static final Pattern j = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    public static final Pattern k = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    public static final Pattern l = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    public static final Pattern m = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    public static final Pattern n = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    public static final Pattern o = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    public static final Pattern p = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    public static final Pattern q = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    public static final Pattern r = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    public static final Pattern s = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    public static final Pattern t = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    public static final Pattern u = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    public static final Pattern v = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    public static final Pattern w = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    public static final Pattern x = Pattern.compile("URI=\"(.+?)\"");
    public static final Pattern y = Pattern.compile("IV=([^,.*]+)");
    public static final Pattern z = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    public static final Pattern A = Pattern.compile("LANGUAGE=\"(.+?)\"");
    public static final Pattern B = Pattern.compile("NAME=\"(.+?)\"");
    public static final Pattern C = Pattern.compile("GROUP-ID=\"(.+?)\"");
    public static final Pattern D = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    public static final Pattern E = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    public static final Pattern F = b("AUTOSELECT");
    public static final Pattern G = b("DEFAULT");
    public static final Pattern H = b("FORCED");
    public static final Pattern I = Pattern.compile("VALUE=\"(.+?)\"");
    public static final Pattern J = Pattern.compile("IMPORT=\"(.+?)\"");
    public static final Pattern K = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    public l() {
        this.f3152a = g.l;
    }

    public l(g gVar) {
        this.f3152a = gVar;
    }

    public static Pattern b(String str) {
        return Pattern.compile(str + "=(NO|YES)");
    }

    public static c.c.a.a.p1.d c(String str, String str2, Map<String, String> map) {
        String i2 = i(str, w, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String k2 = k(str, x, map);
            return new c.c.a.a.p1.d(s.f2717c, "video/mp4", Base64.decode(k2.substring(k2.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            return new c.c.a.a.p1.d(s.f2717c, "hls", l0.s(str));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(i2)) {
            return null;
        }
        String k3 = k(str, x, map);
        byte[] decode = Base64.decode(k3.substring(k3.indexOf(44)), 0);
        UUID uuid = s.f2718d;
        return new c.c.a.a.p1.d(uuid, "video/mp4", u.a(uuid, decode));
    }

    public static String d(String str) {
        return ("SAMPLE-AES-CENC".equals(str) || "SAMPLE-AES-CTR".equals(str)) ? "cenc" : "cbcs";
    }

    public static int e(String str, Pattern pattern) {
        return Integer.parseInt(k(str, pattern, Collections.emptyMap()));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:93:0x0334. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r28v0, types: [int] */
    /* JADX WARN: Type inference failed for: r28v1, types: [int] */
    /* JADX WARN: Type inference failed for: r31v1, types: [int] */
    /* JADX WARN: Type inference failed for: r32v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    public static g f(k kVar, String str) {
        ArrayList arrayList;
        boolean z2;
        int i2;
        char c2;
        int parseInt;
        String str2;
        f fVar;
        int i3;
        f fVar2;
        String str3;
        int i4;
        int i5;
        float f2;
        HashMap hashMap;
        HashSet hashSet;
        ArrayList arrayList2;
        ArrayList arrayList3;
        boolean z3;
        int i6;
        int i7;
        int i8;
        String str4 = str;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        boolean z4 = false;
        boolean z5 = false;
        while (kVar.a()) {
            String b2 = kVar.b();
            if (b2.startsWith("#EXT")) {
                arrayList11.add(b2);
            }
            if (b2.startsWith("#EXT-X-DEFINE")) {
                hashMap3.put(k(b2, B, hashMap3), k(b2, I, hashMap3));
            } else if (b2.equals("#EXT-X-INDEPENDENT-SEGMENTS")) {
                z4 = true;
            } else if (b2.startsWith("#EXT-X-MEDIA")) {
                arrayList9.add(b2);
            } else {
                if (b2.startsWith("#EXT-X-SESSION-KEY")) {
                    c.c.a.a.p1.d c3 = c(b2, i(b2, v, "identity", hashMap3), hashMap3);
                    if (c3 != null) {
                        z3 = z4;
                        arrayList2 = arrayList8;
                        arrayList10.add(new c.c.a.a.p1.e(d(k(b2, u, hashMap3)), true, c3));
                    } else {
                        arrayList2 = arrayList8;
                        z3 = z4;
                    }
                } else {
                    arrayList2 = arrayList8;
                    z3 = z4;
                    if (b2.startsWith("#EXT-X-STREAM-INF")) {
                        boolean contains = z5 | b2.contains("CLOSED-CAPTIONS=NONE");
                        int e2 = e(b2, g);
                        String j2 = j(b2, f3147b, hashMap3);
                        if (j2 != null) {
                            e2 = Integer.parseInt(j2);
                        }
                        String j3 = j(b2, i, hashMap3);
                        String j4 = j(b2, j, hashMap3);
                        if (j4 != null) {
                            String[] split = j4.split("x");
                            int parseInt2 = Integer.parseInt(split[0]);
                            int parseInt3 = Integer.parseInt(split[1]);
                            if (parseInt2 <= 0 || parseInt3 <= 0) {
                                parseInt3 = -1;
                                i8 = -1;
                            } else {
                                i8 = parseInt2;
                            }
                            i7 = parseInt3;
                            i6 = i8;
                        } else {
                            i6 = -1;
                            i7 = -1;
                        }
                        String j5 = j(b2, k, hashMap3);
                        float parseFloat = j5 != null ? Float.parseFloat(j5) : -1.0f;
                        String j6 = j(b2, f3148c, hashMap3);
                        String j7 = j(b2, f3149d, hashMap3);
                        String j8 = j(b2, f3150e, hashMap3);
                        String j9 = j(b2, f3151f, hashMap3);
                        Uri r2 = c.c.a.a.x1.p.r(str4, l(kVar.b(), hashMap3));
                        ArrayList arrayList12 = arrayList10;
                        arrayList4.add(new f(r2, c.c.a.a.l0.A(Integer.toString(arrayList4.size()), null, "application/x-mpegURL", null, j3, e2, i6, i7, parseFloat, null, 0, 0), j6, j7, j8, j9));
                        ArrayList arrayList13 = (ArrayList) hashMap2.get(r2);
                        if (arrayList13 == null) {
                            arrayList13 = new ArrayList();
                            hashMap2.put(r2, arrayList13);
                        }
                        arrayList13.add(new w(e2, j6, j7, j8, j9));
                        z4 = z3;
                        arrayList8 = arrayList2;
                        arrayList10 = arrayList12;
                        arrayList11 = arrayList11;
                        z5 = contains;
                    }
                }
                arrayList3 = arrayList11;
                z4 = z3;
                arrayList8 = arrayList2;
                arrayList10 = arrayList10;
                arrayList11 = arrayList3;
            }
            arrayList2 = arrayList8;
            arrayList3 = arrayList11;
            z3 = z4;
            z4 = z3;
            arrayList8 = arrayList2;
            arrayList10 = arrayList10;
            arrayList11 = arrayList3;
        }
        ArrayList arrayList14 = arrayList8;
        ArrayList arrayList15 = arrayList11;
        boolean z6 = z4;
        ArrayList arrayList16 = arrayList10;
        ArrayList arrayList17 = new ArrayList();
        HashSet hashSet2 = new HashSet();
        int i9 = 0;
        HashMap hashMap4 = hashMap2;
        while (true) {
            arrayList = null;
            if (i9 >= arrayList4.size()) {
                break;
            }
            f fVar3 = (f) arrayList4.get(i9);
            if (hashSet2.add(fVar3.f3124a)) {
                c.c.a.a.x1.p.g(fVar3.f3125b.h == null);
                hashMap = hashMap4;
                hashSet = hashSet2;
                arrayList17.add(new f(fVar3.f3124a, fVar3.f3125b.m(new c.c.a.a.s1.c(new x(null, null, (List) hashMap4.get(fVar3.f3124a)))), fVar3.f3126c, fVar3.f3127d, fVar3.f3128e, fVar3.f3129f));
            } else {
                hashMap = hashMap4;
                hashSet = hashSet2;
            }
            i9++;
            hashSet2 = hashSet;
            hashMap4 = hashMap;
        }
        int i10 = 0;
        c.c.a.a.l0 l0Var = null;
        while (i10 < arrayList9.size()) {
            String str5 = (String) arrayList9.get(i10);
            String k2 = k(str5, C, hashMap3);
            String k3 = k(str5, B, hashMap3);
            String j10 = j(str5, x, hashMap3);
            Uri r3 = j10 == null ? null : c.c.a.a.x1.p.r(str4, j10);
            String j11 = j(str5, A, hashMap3);
            ArrayList arrayList18 = arrayList9;
            c.c.a.a.l0 l0Var2 = l0Var;
            boolean h2 = h(str5, G, false);
            ArrayList arrayList19 = arrayList17;
            boolean z7 = h2;
            if (h(str5, H, false)) {
                z7 = (h2 ? 1 : 0) | 2;
            }
            boolean z8 = z7;
            if (h(str5, F, false)) {
                z8 = (z7 ? 1 : 0) | 4;
            }
            String j12 = j(str5, D, hashMap3);
            if (TextUtils.isEmpty(j12)) {
                i2 = 0;
                z2 = z5;
            } else {
                String[] E2 = l0.E(j12, ",");
                int i11 = l0.h(E2, "public.accessibility.describes-video") ? 512 : 0;
                z2 = z5;
                if (l0.h(E2, "public.accessibility.transcribes-spoken-dialog")) {
                    i11 |= 4096;
                }
                if (l0.h(E2, "public.accessibility.describes-music-and-sound")) {
                    i11 |= 1024;
                }
                i2 = l0.h(E2, "public.easy-to-read") ? i11 | 8192 : i11;
            }
            String h3 = c.a.a.a.a.h(k2, ":", k3);
            int i12 = i10;
            ArrayList arrayList20 = arrayList7;
            c.c.a.a.s1.c cVar = new c.c.a.a.s1.c(new x(k2, k3, Collections.emptyList()));
            String k4 = k(str5, z, hashMap3);
            k4.hashCode();
            switch (k4.hashCode()) {
                case -959297733:
                    if (k4.equals("SUBTITLES")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case -333210994:
                    if (k4.equals("CLOSED-CAPTIONS")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 62628790:
                    if (k4.equals("AUDIO")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 81665115:
                    if (k4.equals("VIDEO")) {
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
                    arrayList7 = arrayList20;
                    arrayList7.add(new e(r3, c.c.a.a.l0.w(h3, k3, "application/x-mpegURL", "text/vtt", null, -1, z8, i2, j11).m(cVar), k2, k3));
                    l0Var = l0Var2;
                    break;
                case 1:
                    String k5 = k(str5, E, hashMap3);
                    if (k5.startsWith("CC")) {
                        parseInt = Integer.parseInt(k5.substring(2));
                        str2 = "application/cea-608";
                    } else {
                        parseInt = Integer.parseInt(k5.substring(7));
                        str2 = "application/cea-708";
                    }
                    int i13 = parseInt;
                    String str6 = str2;
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(c.c.a.a.l0.x(h3, k3, null, str6, null, -1, z8, i2, j11, i13));
                    l0Var = l0Var2;
                    arrayList7 = arrayList20;
                    break;
                case 2:
                    int i14 = 0;
                    while (true) {
                        if (i14 < arrayList4.size()) {
                            fVar = (f) arrayList4.get(i14);
                            if (!k2.equals(fVar.f3127d)) {
                                i14++;
                            }
                        } else {
                            fVar = null;
                        }
                    }
                    String k6 = fVar != null ? l0.k(fVar.f3125b.g, 1) : null;
                    String c4 = k6 != null ? c.c.a.a.z1.u.c(k6) : null;
                    String j13 = j(str5, h, hashMap3);
                    if (j13 != null) {
                        int i15 = l0.f3761a;
                        i3 = Integer.parseInt(j13.split("/", 2)[0]);
                    } else {
                        i3 = -1;
                    }
                    c.c.a.a.l0 o2 = c.c.a.a.l0.o(h3, k3, "application/x-mpegURL", c4, k6, -1, i3, -1, null, z8, i2, j11);
                    if (r3 != null) {
                        arrayList6.add(new e(r3, o2.m(cVar), k2, k3));
                        arrayList7 = arrayList20;
                        l0Var = l0Var2;
                        break;
                    } else {
                        l0Var = o2;
                        arrayList7 = arrayList20;
                        break;
                    }
                case 3:
                    int i16 = 0;
                    while (true) {
                        if (i16 < arrayList4.size()) {
                            fVar2 = (f) arrayList4.get(i16);
                            if (!k2.equals(fVar2.f3126c)) {
                                i16++;
                            }
                        } else {
                            fVar2 = null;
                        }
                    }
                    if (fVar2 != null) {
                        c.c.a.a.l0 l0Var3 = fVar2.f3125b;
                        String k7 = l0.k(l0Var3.g, 2);
                        int i17 = l0Var3.o;
                        int i18 = l0Var3.p;
                        f2 = l0Var3.q;
                        str3 = k7;
                        i4 = i17;
                        i5 = i18;
                    } else {
                        str3 = null;
                        i4 = -1;
                        i5 = -1;
                        f2 = -1.0f;
                    }
                    c.c.a.a.l0 m2 = c.c.a.a.l0.A(h3, k3, "application/x-mpegURL", str3 != null ? c.c.a.a.z1.u.c(str3) : null, str3, -1, i4, i5, f2, null, z8, i2).m(cVar);
                    if (r3 != null) {
                        arrayList5.add(new e(r3, m2, k2, k3));
                    }
                    arrayList7 = arrayList20;
                    l0Var = l0Var2;
                    break;
                default:
                    arrayList7 = arrayList20;
                    l0Var = l0Var2;
                    break;
            }
            i10 = i12 + 1;
            str4 = str;
            arrayList9 = arrayList18;
            arrayList17 = arrayList19;
            z5 = z2;
        }
        return new g(str, arrayList15, arrayList17, arrayList5, arrayList6, arrayList7, arrayList14, l0Var, z5 ? Collections.emptyList() : arrayList, z6, hashMap3, arrayList16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0183, code lost:
    
        if (r1 != null) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c.c.a.a.u1.x0.b0.i g(c.c.a.a.u1.x0.b0.g r74, c.c.a.a.u1.x0.b0.k r75, java.lang.String r76) {
        /*
            Method dump skipped, instructions count: 1065
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.u1.x0.b0.l.g(c.c.a.a.u1.x0.b0.g, c.c.a.a.u1.x0.b0.k, java.lang.String):c.c.a.a.u1.x0.b0.i");
    }

    public static boolean h(String str, Pattern pattern, boolean z2) {
        Matcher matcher = pattern.matcher(str);
        return matcher.find() ? matcher.group(1).equals("YES") : z2;
    }

    public static String i(String str, Pattern pattern, String str2, Map<String, String> map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
        }
        return (map.isEmpty() || str2 == null) ? str2 : l(str2, map);
    }

    public static String j(String str, Pattern pattern, Map<String, String> map) {
        return i(str, pattern, null, map);
    }

    public static String k(String str, Pattern pattern, Map<String, String> map) {
        String i2 = i(str, pattern, null, map);
        if (i2 != null) {
            return i2;
        }
        StringBuilder j2 = c.a.a.a.a.j("Couldn't match ");
        j2.append(pattern.pattern());
        j2.append(" in ");
        j2.append(str);
        throw new c.c.a.a.s0(j2.toString());
    }

    public static String l(String str, Map<String, String> map) {
        Matcher matcher = K.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    public static int m(BufferedReader bufferedReader, boolean z2, int i2) {
        while (i2 != -1 && Character.isWhitespace(i2) && (z2 || !l0.w(i2))) {
            i2 = bufferedReader.read();
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0050, code lost:
    
        r1 = r0.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0054, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        r1 = r1.trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (r1.isEmpty() == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0067, code lost:
    
        if (r1.startsWith("#EXT-X-STREAM-INF") == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0085, code lost:
    
        if (r1.startsWith("#EXT-X-TARGETDURATION") != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008d, code lost:
    
        if (r1.startsWith("#EXT-X-MEDIA-SEQUENCE") != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0095, code lost:
    
        if (r1.startsWith("#EXTINF") != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x009d, code lost:
    
        if (r1.startsWith("#EXT-X-KEY") != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (r1.startsWith("#EXT-X-BYTERANGE") != false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ad, code lost:
    
        if (r1.equals("#EXT-X-DISCONTINUITY") != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b5, code lost:
    
        if (r1.equals("#EXT-X-DISCONTINUITY-SEQUENCE") != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00bd, code lost:
    
        if (r1.equals("#EXT-X-ENDLIST") == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        r8.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        r8.add(r1);
        r7 = g(r6.f3152a, new c.c.a.a.u1.x0.b0.k(r8, r0), r7.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007b, code lost:
    
        r0.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0069, code lost:
    
        r8.add(r1);
        r7 = f(new c.c.a.a.u1.x0.b0.k(r8, r0), r7.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00da, code lost:
    
        r0.close();
     */
    @Override // c.c.a.a.y1.s0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c.c.a.a.u1.x0.b0.j a(android.net.Uri r7, java.io.InputStream r8) {
        /*
            r6 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r8)
            r0.<init>(r1)
            java.util.ArrayDeque r8 = new java.util.ArrayDeque
            r8.<init>()
            int r1 = r0.read()     // Catch: java.lang.Throwable -> Led
            r2 = 0
            r3 = 239(0xef, float:3.35E-43)
            if (r1 != r3) goto L2d
            int r1 = r0.read()     // Catch: java.lang.Throwable -> Led
            r3 = 187(0xbb, float:2.62E-43)
            if (r1 != r3) goto L4e
            int r1 = r0.read()     // Catch: java.lang.Throwable -> Led
            r3 = 191(0xbf, float:2.68E-43)
            if (r1 == r3) goto L29
            goto L4e
        L29:
            int r1 = r0.read()     // Catch: java.lang.Throwable -> Led
        L2d:
            r3 = 1
            int r1 = m(r0, r3, r1)     // Catch: java.lang.Throwable -> Led
            r3 = 7
            r4 = r2
        L34:
            if (r4 >= r3) goto L46
            java.lang.String r5 = "#EXTM3U"
            char r5 = r5.charAt(r4)     // Catch: java.lang.Throwable -> Led
            if (r1 == r5) goto L3f
            goto L4e
        L3f:
            int r1 = r0.read()     // Catch: java.lang.Throwable -> Led
            int r4 = r4 + 1
            goto L34
        L46:
            int r1 = m(r0, r2, r1)     // Catch: java.lang.Throwable -> Led
            boolean r2 = c.c.a.a.z1.l0.w(r1)     // Catch: java.lang.Throwable -> Led
        L4e:
            if (r2 == 0) goto Le5
        L50:
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> Led
            if (r1 == 0) goto Ld8
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> Led
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> Led
            if (r2 == 0) goto L61
            goto L50
        L61:
            java.lang.String r2 = "#EXT-X-STREAM-INF"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> Led
            if (r2 == 0) goto L7f
            r8.add(r1)     // Catch: java.lang.Throwable -> Led
            c.c.a.a.u1.x0.b0.k r1 = new c.c.a.a.u1.x0.b0.k     // Catch: java.lang.Throwable -> Led
            r1.<init>(r8, r0)     // Catch: java.lang.Throwable -> Led
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Led
            c.c.a.a.u1.x0.b0.g r7 = f(r1, r7)     // Catch: java.lang.Throwable -> Led
        L79:
            int r8 = c.c.a.a.z1.l0.f3761a
            r0.close()     // Catch: java.io.IOException -> Ld7
            goto Ld7
        L7f:
            java.lang.String r2 = "#EXT-X-TARGETDURATION"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> Led
            if (r2 != 0) goto Lc4
            java.lang.String r2 = "#EXT-X-MEDIA-SEQUENCE"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> Led
            if (r2 != 0) goto Lc4
            java.lang.String r2 = "#EXTINF"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> Led
            if (r2 != 0) goto Lc4
            java.lang.String r2 = "#EXT-X-KEY"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> Led
            if (r2 != 0) goto Lc4
            java.lang.String r2 = "#EXT-X-BYTERANGE"
            boolean r2 = r1.startsWith(r2)     // Catch: java.lang.Throwable -> Led
            if (r2 != 0) goto Lc4
            java.lang.String r2 = "#EXT-X-DISCONTINUITY"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> Led
            if (r2 != 0) goto Lc4
            java.lang.String r2 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> Led
            if (r2 != 0) goto Lc4
            java.lang.String r2 = "#EXT-X-ENDLIST"
            boolean r2 = r1.equals(r2)     // Catch: java.lang.Throwable -> Led
            if (r2 == 0) goto Lc0
            goto Lc4
        Lc0:
            r8.add(r1)     // Catch: java.lang.Throwable -> Led
            goto L50
        Lc4:
            r8.add(r1)     // Catch: java.lang.Throwable -> Led
            c.c.a.a.u1.x0.b0.g r1 = r6.f3152a     // Catch: java.lang.Throwable -> Led
            c.c.a.a.u1.x0.b0.k r2 = new c.c.a.a.u1.x0.b0.k     // Catch: java.lang.Throwable -> Led
            r2.<init>(r8, r0)     // Catch: java.lang.Throwable -> Led
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Led
            c.c.a.a.u1.x0.b0.i r7 = g(r1, r2, r7)     // Catch: java.lang.Throwable -> Led
            goto L79
        Ld7:
            return r7
        Ld8:
            int r7 = c.c.a.a.z1.l0.f3761a
            r0.close()     // Catch: java.io.IOException -> Ldd
        Ldd:
            c.c.a.a.s0 r7 = new c.c.a.a.s0
            java.lang.String r8 = "Failed to parse the playlist, could not identify any tags."
            r7.<init>(r8)
            throw r7
        Le5:
            c.c.a.a.u1.t0 r8 = new c.c.a.a.u1.t0     // Catch: java.lang.Throwable -> Led
            java.lang.String r1 = "Input does not start with the #EXTM3U header."
            r8.<init>(r1, r7)     // Catch: java.lang.Throwable -> Led
            throw r8     // Catch: java.lang.Throwable -> Led
        Led:
            r7 = move-exception
            int r8 = c.c.a.a.z1.l0.f3761a
            r0.close()     // Catch: java.io.IOException -> Lf3
        Lf3:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.u1.x0.b0.l.a(android.net.Uri, java.io.InputStream):java.lang.Object");
    }
}
