package c.c.a.a.z1;

import android.text.TextUtils;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final ArrayList<t> f3782a = new ArrayList<>();

    public static String a(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : l0.G(str)) {
            String c2 = c(str2);
            if (c2 != null && h(c2)) {
                return c2;
            }
        }
        return null;
    }

    public static int b(String str) {
        str.hashCode();
        switch (str) {
            case "audio/eac3-joc":
                return 18;
            case "audio/vnd.dts":
                return 7;
            case "audio/ac3":
                return 5;
            case "audio/ac4":
                return 17;
            case "audio/eac3":
                return 6;
            case "audio/vnd.dts.hd":
                return 8;
            case "audio/true-hd":
                return 14;
            default:
                return 0;
        }
    }

    public static String c(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        String I = l0.I(str.trim());
        if (I.startsWith("avc1") || I.startsWith("avc3")) {
            return "video/avc";
        }
        if (I.startsWith("hev1") || I.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (I.startsWith("dvav") || I.startsWith("dva1") || I.startsWith("dvhe") || I.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (I.startsWith("av01")) {
            return "video/av01";
        }
        if (I.startsWith("vp9") || I.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (I.startsWith("vp8") || I.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (I.startsWith("mp4a")) {
            if (I.startsWith("mp4a.")) {
                String substring = I.substring(5);
                if (substring.length() >= 2) {
                    try {
                        str2 = d(Integer.parseInt(l0.J(substring.substring(0, 2)), 16));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        }
        if (I.startsWith("ac-3") || I.startsWith("dac3")) {
            return "audio/ac3";
        }
        if (I.startsWith("ec-3") || I.startsWith("dec3")) {
            return "audio/eac3";
        }
        if (I.startsWith("ec+3")) {
            return "audio/eac3-joc";
        }
        if (I.startsWith("ac-4") || I.startsWith("dac4")) {
            return "audio/ac4";
        }
        if (I.startsWith("dtsc") || I.startsWith("dtse")) {
            return "audio/vnd.dts";
        }
        if (I.startsWith("dtsh") || I.startsWith("dtsl")) {
            return "audio/vnd.dts.hd";
        }
        if (I.startsWith("opus")) {
            return "audio/opus";
        }
        if (I.startsWith("vorbis")) {
            return "audio/vorbis";
        }
        if (I.startsWith("flac")) {
            return "audio/flac";
        }
        ArrayList<t> arrayList = f3782a;
        if (arrayList.size() <= 0) {
            return null;
        }
        arrayList.get(0);
        throw null;
    }

    public static String d(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static String e(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int f(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (h(str)) {
            return 1;
        }
        if (j(str)) {
            return 2;
        }
        if (i(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 4;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 5;
        }
        ArrayList<t> arrayList = f3782a;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0);
        throw null;
    }

    public static String g(String str) {
        if (str == null) {
            return null;
        }
        for (String str2 : l0.G(str)) {
            String c2 = c(str2);
            if (c2 != null && j(c2)) {
                return c2;
            }
        }
        return null;
    }

    public static boolean h(String str) {
        return "audio".equals(e(str));
    }

    public static boolean i(String str) {
        return "text".equals(e(str));
    }

    public static boolean j(String str) {
        return "video".equals(e(str));
    }
}
