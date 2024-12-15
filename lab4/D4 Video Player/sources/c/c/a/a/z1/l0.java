package c.c.a.a.z1;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import c.c.a.a.d1;
import c.c.a.a.s0;
import java.math.BigDecimal;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int f3761a;

    /* renamed from: b, reason: collision with root package name */
    public static final String f3762b;

    /* renamed from: c, reason: collision with root package name */
    public static final String f3763c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f3764d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f3765e;

    /* renamed from: f, reason: collision with root package name */
    public static final byte[] f3766f;
    public static final Pattern g;
    public static final Pattern h;
    public static final Pattern i;
    public static HashMap<String, String> j;
    public static final String[] k;
    public static final int[] l;

    static {
        int i2 = Build.VERSION.SDK_INT;
        f3761a = i2;
        String str = Build.DEVICE;
        f3762b = str;
        String str2 = Build.MANUFACTURER;
        f3763c = str2;
        String str3 = Build.MODEL;
        f3764d = str3;
        f3765e = str + ", " + str3 + ", " + str2 + ", " + i2;
        f3766f = new byte[0];
        g = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
        h = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
        i = Pattern.compile("%([A-Fa-f0-9]{2})");
        k = new String[]{"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "slo", "sk", "wel", "cy"};
        l = new int[]{0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    }

    public static <T> void A(List<T> list, int i2, int i3) {
        if (i2 < 0 || i3 > list.size() || i2 > i3) {
            throw new IllegalArgumentException();
        }
        if (i2 != i3) {
            list.subList(i2, i3).clear();
        }
    }

    public static long B(long j2, d1 d1Var, long j3, long j4) {
        if (d1.f1989c.equals(d1Var)) {
            return j2;
        }
        long j5 = d1Var.f1991a;
        long j6 = j2 - j5;
        long j7 = ((j5 ^ j2) & (j2 ^ j6)) >= 0 ? j6 : Long.MIN_VALUE;
        long j8 = d1Var.f1992b;
        long j9 = j2 + j8;
        long j10 = ((j8 ^ j9) & (j2 ^ j9)) >= 0 ? j9 : Long.MAX_VALUE;
        boolean z = j7 <= j3 && j3 <= j10;
        boolean z2 = j7 <= j4 && j4 <= j10;
        return (z && z2) ? Math.abs(j3 - j2) <= Math.abs(j4 - j2) ? j3 : j4 : z ? j3 : z2 ? j4 : j7;
    }

    public static long C(long j2, long j3, long j4) {
        if (j4 >= j3 && j4 % j3 == 0) {
            return j2 / (j4 / j3);
        }
        if (j4 < j3 && j3 % j4 == 0) {
            return (j3 / j4) * j2;
        }
        return (long) (j2 * (j3 / j4));
    }

    public static void D(long[] jArr, long j2, long j3) {
        int i2 = 0;
        if (j3 >= j2 && j3 % j2 == 0) {
            long j4 = j3 / j2;
            while (i2 < jArr.length) {
                jArr[i2] = jArr[i2] / j4;
                i2++;
            }
            return;
        }
        if (j3 >= j2 || j2 % j3 != 0) {
            double d2 = j2 / j3;
            while (i2 < jArr.length) {
                jArr[i2] = (long) (jArr[i2] * d2);
                i2++;
            }
            return;
        }
        long j5 = j2 / j3;
        while (i2 < jArr.length) {
            jArr[i2] = jArr[i2] * j5;
            i2++;
        }
    }

    public static String[] E(String str, String str2) {
        return str.split(str2, -1);
    }

    public static String[] F(String str, String str2) {
        return str.split(str2, 2);
    }

    public static String[] G(String str) {
        return TextUtils.isEmpty(str) ? new String[0] : E(str.trim(), "(\\s*,\\s*)");
    }

    public static int[] H(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = list.get(i2).intValue();
        }
        return iArr;
    }

    public static String I(String str) {
        return str == null ? str : str.toLowerCase(Locale.US);
    }

    public static String J(String str) {
        return str == null ? str : str.toUpperCase(Locale.US);
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static int b(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = ~binarySearch;
        } else {
            do {
                binarySearch++;
                if (binarySearch >= jArr.length) {
                    break;
                }
            } while (jArr[binarySearch] == j2);
            i2 = z ? binarySearch - 1 : binarySearch;
        }
        return z2 ? Math.min(jArr.length - 1, i2) : i2;
    }

    public static int c(long[] jArr, long j2, boolean z, boolean z2) {
        int i2;
        int binarySearch = Arrays.binarySearch(jArr, j2);
        if (binarySearch < 0) {
            i2 = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0) {
                    break;
                }
            } while (jArr[binarySearch] == j2);
            i2 = z ? binarySearch + 1 : binarySearch;
        }
        return z2 ? Math.max(0, i2) : i2;
    }

    public static int d(int i2, int i3) {
        return ((i2 + i3) - 1) / i3;
    }

    public static float e(float f2, float f3, float f4) {
        return Math.max(f3, Math.min(f2, f4));
    }

    public static int f(int i2, int i3, int i4) {
        return Math.max(i3, Math.min(i2, i4));
    }

    public static long g(long j2, long j3, long j4) {
        return Math.max(j3, Math.min(j2, j4));
    }

    public static boolean h(Object[] objArr, Object obj) {
        for (Object obj2 : objArr) {
            if (a(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public static String i(byte[] bArr, int i2, int i3) {
        return new String(bArr, i2, i3, Charset.forName("UTF-8"));
    }

    public static byte[] j(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            int i3 = i2 * 2;
            bArr[i2] = (byte) (Character.digit(str.charAt(i3 + 1), 16) + (Character.digit(str.charAt(i3), 16) << 4));
        }
        return bArr;
    }

    public static String k(String str, int i2) {
        String[] G = G(str);
        if (G.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : G) {
            if (i2 == u.f(u.c(str2))) {
                if (sb.length() > 0) {
                    sb.append(",");
                }
                sb.append(str2);
            }
        }
        if (sb.length() > 0) {
            return sb.toString();
        }
        return null;
    }

    public static int l(String str) {
        int length = str.length();
        c.c.a.a.x1.p.c(length <= 4);
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            i2 = (i2 << 8) | str.charAt(i3);
        }
        return i2;
    }

    public static int m(Context context) {
        ConnectivityManager connectivityManager;
        int i2 = 0;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i2 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                switch (activeNetworkInfo.getSubtype()) {
                }
                return 0;
            }
        } catch (SecurityException unused) {
        }
        return i2;
    }

    public static int n(int i2) {
        if (i2 == 8) {
            return 3;
        }
        if (i2 == 16) {
            return 2;
        }
        if (i2 != 24) {
            return i2 != 32 ? 0 : 1073741824;
        }
        return Integer.MIN_VALUE;
    }

    public static int o(int i2, int i3) {
        if (i2 == Integer.MIN_VALUE) {
            return i3 * 3;
        }
        if (i2 != 1073741824) {
            if (i2 == 2) {
                return i3 * 2;
            }
            if (i2 == 3) {
                return i3;
            }
            if (i2 != 4) {
                throw new IllegalArgumentException();
            }
        }
        return i3 * 4;
    }

    public static long p(long j2, float f2) {
        return f2 == 1.0f ? j2 : Math.round(j2 / f2);
    }

    public static int q(int i2) {
        if (i2 == 13) {
            return 1;
        }
        switch (i2) {
            case 2:
                return 0;
            case 3:
                return 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static String r(StringBuilder sb, Formatter formatter, long j2) {
        if (j2 == -9223372036854775807L) {
            j2 = 0;
        }
        long j3 = (j2 + 500) / 1000;
        long j4 = j3 % 60;
        long j5 = (j3 / 60) % 60;
        long j6 = j3 / 3600;
        sb.setLength(0);
        return (j6 > 0 ? formatter.format("%d:%02d:%02d", Long.valueOf(j6), Long.valueOf(j5), Long.valueOf(j4)) : formatter.format("%02d:%02d", Long.valueOf(j5), Long.valueOf(j4))).toString();
    }

    public static byte[] s(String str) {
        return str.getBytes(Charset.forName("UTF-8"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean t(c.c.a.a.z1.z r4, c.c.a.a.z1.z r5, java.util.zip.Inflater r6) {
        /*
            int r0 = r4.a()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            byte[] r0 = r5.f3800a
            int r2 = r0.length
            int r3 = r4.a()
            if (r2 >= r3) goto L19
            int r0 = r4.a()
            int r0 = r0 * 2
            byte[] r0 = new byte[r0]
        L19:
            if (r6 != 0) goto L20
            java.util.zip.Inflater r6 = new java.util.zip.Inflater
            r6.<init>()
        L20:
            byte[] r2 = r4.f3800a
            int r3 = r4.f3801b
            int r4 = r4.a()
            r6.setInput(r2, r3, r4)
            r4 = r1
        L2c:
            int r2 = r0.length     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r2 = r2 - r4
            int r2 = r6.inflate(r0, r4, r2)     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r4 = r4 + r2
            boolean r2 = r6.finished()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r2 == 0) goto L44
            r5.f3800a = r0     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            r5.f3802c = r4     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            r5.f3801b = r1     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            r4 = 1
            r6.reset()
            return r4
        L44:
            boolean r2 = r6.needsDictionary()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r2 != 0) goto L5c
            boolean r2 = r6.needsInput()     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r2 == 0) goto L51
            goto L5c
        L51:
            int r2 = r0.length     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            if (r4 != r2) goto L2c
            int r2 = r0.length     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            int r2 = r2 * 2
            byte[] r0 = java.util.Arrays.copyOf(r0, r2)     // Catch: java.lang.Throwable -> L60 java.util.zip.DataFormatException -> L65
            goto L2c
        L5c:
            r6.reset()
            return r1
        L60:
            r4 = move-exception
            r6.reset()
            throw r4
        L65:
            r6.reset()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.z1.l0.t(c.c.a.a.z1.z, c.c.a.a.z1.z, java.util.zip.Inflater):boolean");
    }

    public static boolean u(int i2) {
        return i2 == Integer.MIN_VALUE || i2 == 1073741824;
    }

    public static boolean v(int i2) {
        return i2 == 3 || i2 == 2 || i2 == Integer.MIN_VALUE || i2 == 1073741824 || i2 == 4;
    }

    public static boolean w(int i2) {
        return i2 == 10 || i2 == 13;
    }

    public static String x(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (f3761a >= 21) {
            replace = Locale.forLanguageTag(replace).toLanguageTag();
        }
        if (!replace.isEmpty() && !"und".equals(replace)) {
            str = replace;
        }
        String I = I(str);
        int i2 = 0;
        String str2 = F(I, "-")[0];
        if (str2.length() != 3) {
            return I;
        }
        if (j == null) {
            String[] iSOLanguages = Locale.getISOLanguages();
            HashMap<String, String> hashMap = new HashMap<>(iSOLanguages.length + k.length);
            for (String str3 : iSOLanguages) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            while (true) {
                String[] strArr = k;
                if (i2 >= strArr.length) {
                    break;
                }
                hashMap.put(strArr[i2], strArr[i2 + 1]);
                i2 += 2;
            }
            j = hashMap;
        }
        String str4 = j.get(str2);
        if (str4 == null) {
            return I;
        }
        StringBuilder j2 = c.a.a.a.a.j(str4);
        j2.append(I.substring(3));
        return j2.toString();
    }

    public static <T> T[] y(T[] tArr, int i2) {
        c.c.a.a.x1.p.c(i2 <= tArr.length);
        return (T[]) Arrays.copyOf(tArr, i2);
    }

    public static long z(String str) {
        Matcher matcher = g.matcher(str);
        if (!matcher.matches()) {
            throw new s0(c.a.a.a.a.g("Invalid date/time format: ", str));
        }
        int i2 = 0;
        if (matcher.group(9) != null && !matcher.group(9).equalsIgnoreCase("Z")) {
            i2 = Integer.parseInt(matcher.group(13)) + (Integer.parseInt(matcher.group(12)) * 60);
            if ("-".equals(matcher.group(11))) {
                i2 *= -1;
            }
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone("GMT"));
        gregorianCalendar.clear();
        gregorianCalendar.set(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)) - 1, Integer.parseInt(matcher.group(3)), Integer.parseInt(matcher.group(4)), Integer.parseInt(matcher.group(5)), Integer.parseInt(matcher.group(6)));
        if (!TextUtils.isEmpty(matcher.group(8))) {
            StringBuilder j2 = c.a.a.a.a.j("0.");
            j2.append(matcher.group(8));
            gregorianCalendar.set(14, new BigDecimal(j2.toString()).movePointRight(3).intValue());
        }
        long timeInMillis = gregorianCalendar.getTimeInMillis();
        return i2 != 0 ? timeInMillis - (i2 * 60000) : timeInMillis;
    }
}
