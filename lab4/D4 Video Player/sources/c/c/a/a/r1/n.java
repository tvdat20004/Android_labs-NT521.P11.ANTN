package c.c.a.a.r1;

import android.annotation.SuppressLint;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.u;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressLint({"InlinedApi"})
/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: c, reason: collision with root package name */
    public static final SparseIntArray f2711c;

    /* renamed from: d, reason: collision with root package name */
    public static final SparseIntArray f2712d;

    /* renamed from: e, reason: collision with root package name */
    public static final Map<String, Integer> f2713e;

    /* renamed from: f, reason: collision with root package name */
    public static final Map<String, Integer> f2714f;
    public static final Map<String, Integer> g;
    public static final SparseIntArray h;

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f2709a = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap<g, List<a>> f2710b = new HashMap<>();
    public static int i = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f2711c = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        sparseIntArray.put(110, 16);
        sparseIntArray.put(122, 32);
        sparseIntArray.put(244, 64);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f2712d = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        f2713e = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        c.a.a.a.a.l(16384, hashMap, "L150", 65536, "L153", 262144, "L156", 1048576, "L180");
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        c.a.a.a.a.l(32768, hashMap, "H150", 131072, "H153", 524288, "H156", 2097152, "H180");
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
        HashMap hashMap2 = new HashMap();
        f2714f = hashMap2;
        hashMap2.put("00", 1);
        hashMap2.put("01", 2);
        hashMap2.put("02", 4);
        hashMap2.put("03", 8);
        hashMap2.put("04", 16);
        hashMap2.put("05", 32);
        hashMap2.put("06", 64);
        hashMap2.put("07", 128);
        hashMap2.put("08", 256);
        hashMap2.put("09", 512);
        HashMap hashMap3 = new HashMap();
        g = hashMap3;
        hashMap3.put("01", 1);
        hashMap3.put("02", 2);
        hashMap3.put("03", 4);
        hashMap3.put("04", 8);
        hashMap3.put("05", 16);
        hashMap3.put("06", 32);
        hashMap3.put("07", 64);
        hashMap3.put("08", 128);
        hashMap3.put("09", 256);
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        h = sparseIntArray3;
        sparseIntArray3.put(1, 1);
        sparseIntArray3.put(2, 2);
        sparseIntArray3.put(3, 3);
        sparseIntArray3.put(4, 4);
        sparseIntArray3.put(5, 5);
        sparseIntArray3.put(6, 6);
        sparseIntArray3.put(17, 17);
        sparseIntArray3.put(20, 20);
        sparseIntArray3.put(23, 23);
        sparseIntArray3.put(29, 29);
        sparseIntArray3.put(39, 39);
        sparseIntArray3.put(42, 42);
    }

    public static void a(String str, List<a> list) {
        Comparator lVar;
        if ("audio/raw".equals(str)) {
            lVar = new m(null);
        } else {
            if (l0.f3761a >= 21 || list.size() <= 1) {
                return;
            }
            String str2 = list.get(0).f2693a;
            if (!"OMX.SEC.mp3.dec".equals(str2) && !"OMX.SEC.MP3.Decoder".equals(str2) && !"OMX.brcm.audio.mp3.decoder".equals(str2)) {
                return;
            } else {
                lVar = new l(null);
            }
        }
        Collections.sort(list, lVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01b0, code lost:
    
        if (r2.startsWith("t0") == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0071, code lost:
    
        if (r0.startsWith("HM") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00e1, code lost:
    
        if ("SO-02E".equals(r2) == false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x010f, code lost:
    
        if ("C1605".equals(r0) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0171, code lost:
    
        if ("SCV31".equals(r0) == false) goto L100;
     */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01dd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.media.MediaCodecInfo r5, java.lang.String r6, boolean r7, java.lang.String r8) {
        /*
            Method dump skipped, instructions count: 574
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.r1.n.b(android.media.MediaCodecInfo, java.lang.String, boolean, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static Pair<Integer, Integer> c(String str) {
        char c2;
        StringBuilder sb;
        int parseInt;
        int parseInt2;
        int i2;
        String b2;
        StringBuilder sb2;
        String str2;
        StringBuilder sb3;
        String str3;
        StringBuilder sb4;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        String str4 = split[0];
        str4.hashCode();
        int i3 = 2;
        switch (str4.hashCode()) {
            case 3006243:
                if (str4.equals("avc1")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 3006244:
                if (str4.equals("avc2")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3095771:
                if (str4.equals("dvh1")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3095823:
                if (str4.equals("dvhe")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3199032:
                if (str4.equals("hev1")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3214780:
                if (str4.equals("hvc1")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3356560:
                if (str4.equals("mp4a")) {
                    c2 = 6;
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
            case 1:
                if (split.length >= 2) {
                    try {
                        if (split[1].length() != 6) {
                            if (split.length < 3) {
                                Log.w("MediaCodecUtil", "Ignoring malformed AVC codec string: " + str);
                                break;
                            } else {
                                parseInt = Integer.parseInt(split[1]);
                                parseInt2 = Integer.parseInt(split[2]);
                            }
                        } else {
                            parseInt = Integer.parseInt(split[1].substring(0, 2), 16);
                            parseInt2 = Integer.parseInt(split[1].substring(4), 16);
                        }
                        i2 = f2711c.get(parseInt, -1);
                    } catch (NumberFormatException unused) {
                        sb = new StringBuilder();
                    }
                    if (i2 != -1) {
                        int i4 = f2712d.get(parseInt2, -1);
                        if (i4 != -1) {
                            break;
                        } else {
                            sb = new StringBuilder();
                            sb.append("Unknown AVC level: ");
                            sb.append(parseInt2);
                            b2 = sb.toString();
                            Log.w("MediaCodecUtil", b2);
                        }
                    } else {
                        b2 = c.a.a.a.a.b("Unknown AVC profile: ", parseInt);
                        Log.w("MediaCodecUtil", b2);
                        break;
                    }
                } else {
                    sb = new StringBuilder();
                }
                sb.append("Ignoring malformed AVC codec string: ");
                sb.append(str);
                b2 = sb.toString();
                Log.w("MediaCodecUtil", b2);
            case 2:
            case 3:
                if (split.length >= 3) {
                    Matcher matcher = f2709a.matcher(split[1]);
                    if (matcher.matches()) {
                        str = matcher.group(1);
                        Integer num = f2714f.get(str);
                        if (num != null) {
                            str = split[2];
                            Integer num2 = g.get(str);
                            if (num2 != null) {
                                break;
                            } else {
                                sb2 = new StringBuilder();
                                str2 = "Unknown Dolby Vision level string: ";
                            }
                        } else {
                            sb2 = new StringBuilder();
                            str2 = "Unknown Dolby Vision profile string: ";
                        }
                        sb2.append(str2);
                        c.a.a.a.a.e(sb2, str, "MediaCodecUtil");
                        break;
                    } else {
                        sb2 = new StringBuilder();
                    }
                } else {
                    sb2 = new StringBuilder();
                }
                sb2.append("Ignoring malformed Dolby Vision codec string: ");
                c.a.a.a.a.e(sb2, str, "MediaCodecUtil");
            case 4:
            case 5:
                if (split.length >= 4) {
                    Matcher matcher2 = f2709a.matcher(split[1]);
                    if (matcher2.matches()) {
                        str = matcher2.group(1);
                        if (!"1".equals(str)) {
                            if (!"2".equals(str)) {
                                sb3 = new StringBuilder();
                                str3 = "Unknown HEVC profile string: ";
                                sb3.append(str3);
                                c.a.a.a.a.e(sb3, str, "MediaCodecUtil");
                                break;
                            }
                        } else {
                            i3 = 1;
                        }
                        str = split[3];
                        Integer num3 = f2713e.get(str);
                        if (num3 != null) {
                            break;
                        } else {
                            sb3 = new StringBuilder();
                            str3 = "Unknown HEVC level string: ";
                            sb3.append(str3);
                            c.a.a.a.a.e(sb3, str, "MediaCodecUtil");
                        }
                    } else {
                        sb3 = new StringBuilder();
                    }
                } else {
                    sb3 = new StringBuilder();
                }
                sb3.append("Ignoring malformed HEVC codec string: ");
                c.a.a.a.a.e(sb3, str, "MediaCodecUtil");
            case 6:
                if (split.length != 3) {
                    sb4 = new StringBuilder();
                } else {
                    try {
                        if ("audio/mp4a-latm".equals(u.d(Integer.parseInt(split[1], 16)))) {
                            int i5 = h.get(Integer.parseInt(split[2]), -1);
                            if (i5 != -1) {
                                break;
                            }
                        }
                    } catch (NumberFormatException unused2) {
                        sb4 = new StringBuilder();
                    }
                }
                sb4.append("Ignoring malformed MP4A codec string: ");
                sb4.append(str);
                Log.w("MediaCodecUtil", sb4.toString());
                break;
        }
        return null;
    }

    public static a d(String str, boolean z, boolean z2) {
        List<a> e2 = e(str, z, z2);
        if (e2.isEmpty()) {
            return null;
        }
        return e2.get(0);
    }

    public static synchronized List<a> e(String str, boolean z, boolean z2) {
        synchronized (n.class) {
            g gVar = new g(str, z, z2);
            HashMap<g, List<a>> hashMap = f2710b;
            List<a> list = hashMap.get(gVar);
            if (list != null) {
                return list;
            }
            int i2 = l0.f3761a;
            ArrayList<a> f2 = f(gVar, i2 >= 21 ? new k(z, z2) : new j(null));
            if (z && f2.isEmpty() && 21 <= i2 && i2 <= 23) {
                f2 = f(gVar, new j(null));
                if (!f2.isEmpty()) {
                    Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + f2.get(0).f2693a);
                }
            }
            a(str, f2);
            List<a> unmodifiableList = Collections.unmodifiableList(f2);
            hashMap.put(gVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static ArrayList<a> f(g gVar, i iVar) {
        String str;
        String str2;
        int i2;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        boolean d2;
        boolean c2;
        boolean z;
        boolean z2;
        try {
            ArrayList<a> arrayList = new ArrayList<>();
            String str3 = gVar.f2704a;
            int a2 = iVar.a();
            boolean e2 = iVar.e();
            for (int i3 = 0; i3 < a2; i3 = i2 + 1) {
                MediaCodecInfo b2 = iVar.b(i3);
                String name = b2.getName();
                String b3 = b(b2, name, e2, str3);
                if (b3 != null) {
                    try {
                        capabilitiesForType = b2.getCapabilitiesForType(b3);
                        d2 = iVar.d("tunneled-playback", b3, capabilitiesForType);
                        c2 = iVar.c("tunneled-playback", b3, capabilitiesForType);
                        z = gVar.f2706c;
                    } catch (Exception e3) {
                        e = e3;
                        str = b3;
                        str2 = name;
                        i2 = i3;
                    }
                    if ((z || !c2) && (!z || d2)) {
                        boolean d3 = iVar.d("secure-playback", b3, capabilitiesForType);
                        boolean c3 = iVar.c("secure-playback", b3, capabilitiesForType);
                        boolean z3 = gVar.f2705b;
                        if ((z3 || !c3) && (!z3 || d3)) {
                            if (l0.f3761a <= 22) {
                                String str4 = l0.f3764d;
                                if (("ODROID-XU3".equals(str4) || "Nexus 10".equals(str4)) && ("OMX.Exynos.AVC.Decoder".equals(name) || "OMX.Exynos.AVC.Decoder.secure".equals(name))) {
                                    z2 = true;
                                    if ((e2 || gVar.f2705b != d3) && (e2 || gVar.f2705b)) {
                                        str = b3;
                                        str2 = name;
                                        i2 = i3;
                                        if (!e2 && d3) {
                                            arrayList.add(a.g(str2 + ".secure", str3, str, capabilitiesForType, z2, true));
                                            return arrayList;
                                        }
                                    } else {
                                        str = b3;
                                        str2 = name;
                                        i2 = i3;
                                        try {
                                            arrayList.add(a.g(name, str3, b3, capabilitiesForType, z2, false));
                                        } catch (Exception e4) {
                                            e = e4;
                                            if (l0.f3761a > 23 || arrayList.isEmpty()) {
                                                Log.e("MediaCodecUtil", "Failed to query codec " + str2 + " (" + str + ")");
                                                throw e;
                                            }
                                            Log.e("MediaCodecUtil", "Skipping codec " + str2 + " (failed to query capabilities)");
                                        }
                                    }
                                }
                            }
                            z2 = false;
                            if (e2) {
                            }
                            str = b3;
                            str2 = name;
                            i2 = i3;
                            if (!e2) {
                                arrayList.add(a.g(str2 + ".secure", str3, str, capabilitiesForType, z2, true));
                                return arrayList;
                            }
                            continue;
                        }
                    }
                }
                i2 = i3;
            }
            return arrayList;
        } catch (Exception e5) {
            throw new h(e5, null);
        }
    }

    public static int g() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i2;
        if (i == -1) {
            int i3 = 0;
            a d2 = d("video/avc", false, false);
            if (d2 != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = d2.f2696d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int length = codecProfileLevelArr.length;
                int i4 = 0;
                while (i3 < length) {
                    int i5 = codecProfileLevelArr[i3].level;
                    if (i5 != 1 && i5 != 2) {
                        switch (i5) {
                            case 8:
                            case 16:
                            case 32:
                                i2 = 101376;
                                break;
                            case 64:
                                i2 = 202752;
                                break;
                            case 128:
                            case 256:
                                i2 = 414720;
                                break;
                            case 512:
                                i2 = 921600;
                                break;
                            case 1024:
                                i2 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i2 = 2097152;
                                break;
                            case 8192:
                                i2 = 2228224;
                                break;
                            case 16384:
                                i2 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                i2 = 9437184;
                                break;
                            default:
                                i2 = -1;
                                break;
                        }
                    } else {
                        i2 = 25344;
                    }
                    i4 = Math.max(i2, i4);
                    i3++;
                }
                i3 = Math.max(i4, l0.f3761a >= 21 ? 345600 : 172800);
            }
            i = i3;
        }
        return i;
    }
}
