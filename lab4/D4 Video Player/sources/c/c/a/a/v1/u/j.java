package c.c.a.a.v1.u;

import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.z;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f3393b = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3394c = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: a, reason: collision with root package name */
    public final StringBuilder f3395a = new StringBuilder();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0129  */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16, types: [int] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(java.lang.String r17, c.c.a.a.v1.u.h r18, android.text.SpannableStringBuilder r19, java.util.List<c.c.a.a.v1.u.d> r20, java.util.List<c.c.a.a.v1.u.i> r21) {
        /*
            Method dump skipped, instructions count: 514
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.v1.u.j.a(java.lang.String, c.c.a.a.v1.u.h, android.text.SpannableStringBuilder, java.util.List, java.util.List):void");
    }

    public static boolean b(String str, Matcher matcher, z zVar, f fVar, StringBuilder sb, List<d> list) {
        try {
            fVar.f3380a = l.c(matcher.group(1));
            fVar.f3381b = l.c(matcher.group(2));
            c(matcher.group(3), fVar);
            sb.setLength(0);
            while (true) {
                String e2 = zVar.e();
                if (TextUtils.isEmpty(e2)) {
                    d(str, sb.toString(), fVar, list);
                    return true;
                }
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(e2.trim());
            }
        } catch (NumberFormatException unused) {
            StringBuilder j = c.a.a.a.a.j("Skipping cue with bad header: ");
            j.append(matcher.group());
            Log.w("WebvttCueParser", j.toString());
            return false;
        }
    }

    public static void c(String str, f fVar) {
        Layout.Alignment alignment;
        Matcher matcher = f3394c.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            String group2 = matcher.group(2);
            try {
                if ("line".equals(group)) {
                    int indexOf = group2.indexOf(44);
                    if (indexOf != -1) {
                        fVar.g = e(group2.substring(indexOf + 1));
                        group2 = group2.substring(0, indexOf);
                    } else {
                        fVar.g = Integer.MIN_VALUE;
                    }
                    if (group2.endsWith("%")) {
                        fVar.f3384e = l.b(group2);
                        fVar.f3385f = 0;
                    } else {
                        int parseInt = Integer.parseInt(group2);
                        if (parseInt < 0) {
                            parseInt--;
                        }
                        fVar.f3384e = parseInt;
                        fVar.f3385f = 1;
                    }
                } else if ("align".equals(group)) {
                    group2.hashCode();
                    group2.hashCode();
                    switch (group2) {
                        case "center":
                        case "middle":
                            alignment = Layout.Alignment.ALIGN_CENTER;
                            break;
                        case "end":
                        case "right":
                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                            break;
                        case "left":
                        case "start":
                            alignment = Layout.Alignment.ALIGN_NORMAL;
                            break;
                        default:
                            Log.w("WebvttCueParser", "Invalid alignment value: " + group2);
                            alignment = null;
                            break;
                    }
                    fVar.f3383d = alignment;
                } else if ("position".equals(group)) {
                    int indexOf2 = group2.indexOf(44);
                    if (indexOf2 != -1) {
                        fVar.i = e(group2.substring(indexOf2 + 1));
                        group2 = group2.substring(0, indexOf2);
                    } else {
                        fVar.i = Integer.MIN_VALUE;
                    }
                    fVar.h = l.b(group2);
                } else if ("size".equals(group)) {
                    fVar.j = l.b(group2);
                } else {
                    Log.w("WebvttCueParser", "Unknown cue setting " + group + ":" + group2);
                }
            } catch (NumberFormatException unused) {
                StringBuilder j = c.a.a.a.a.j("Skipping bad cue setting: ");
                j.append(matcher.group());
                Log.w("WebvttCueParser", j.toString());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void d(String str, String str2, f fVar, List<d> list) {
        String str3;
        char c2;
        boolean z;
        char c3;
        h hVar;
        String substring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            String str4 = "";
            if (i >= str2.length()) {
                while (!arrayDeque.isEmpty()) {
                    a(str, (h) arrayDeque.pop(), spannableStringBuilder, list, arrayList);
                }
                a(str, new h("", 0, "", new String[0]), spannableStringBuilder, list, arrayList);
                fVar.f3382c = spannableStringBuilder;
                return;
            }
            char charAt = str2.charAt(i);
            char c4 = '&';
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    substring = str2.substring(i, indexOf);
                    substring.hashCode();
                    switch (substring) {
                        case "gt":
                            c4 = '>';
                            spannableStringBuilder.append(c4);
                            break;
                        case "lt":
                            c4 = '<';
                            spannableStringBuilder.append(c4);
                            break;
                        case "amp":
                            spannableStringBuilder.append(c4);
                            break;
                        case "nbsp":
                            c4 = ' ';
                            spannableStringBuilder.append(c4);
                            break;
                        default:
                            Log.w("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    boolean z2 = str2.charAt(i2) == '/';
                    int indexOf3 = str2.indexOf(62, i2);
                    i2 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i3 = i2 - 2;
                    boolean z3 = str2.charAt(i3) == '/';
                    int i4 = i + (z2 ? 2 : 1);
                    if (!z3) {
                        i3 = i2 - 1;
                    }
                    String substring2 = str2.substring(i4, i3);
                    String trim = substring2.trim();
                    if (trim.isEmpty()) {
                        str3 = null;
                    } else {
                        int i5 = l0.f3761a;
                        str3 = trim.split("[ \\.]", 2)[0];
                    }
                    if (str3 != null) {
                        switch (str3.hashCode()) {
                            case 98:
                                if (str3.equals("b")) {
                                    c2 = 0;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 99:
                                if (str3.equals("c")) {
                                    c2 = 1;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 105:
                                if (str3.equals("i")) {
                                    c2 = 2;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 117:
                                if (str3.equals("u")) {
                                    c2 = 3;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 118:
                                if (str3.equals("v")) {
                                    c2 = 4;
                                    break;
                                }
                                c2 = 65535;
                                break;
                            case 3314158:
                                if (str3.equals("lang")) {
                                    c2 = 5;
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
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                z = true;
                                break;
                            default:
                                z = false;
                                break;
                        }
                        if (z) {
                            if (z2) {
                                while (!arrayDeque.isEmpty()) {
                                    h hVar2 = (h) arrayDeque.pop();
                                    a(str, hVar2, spannableStringBuilder, list, arrayList);
                                    if (hVar2.f3387a.equals(str3)) {
                                    }
                                }
                            } else if (!z3) {
                                int length = spannableStringBuilder.length();
                                String trim2 = substring2.trim();
                                if (trim2.isEmpty()) {
                                    hVar = null;
                                } else {
                                    int indexOf4 = trim2.indexOf(" ");
                                    if (indexOf4 == -1) {
                                        c3 = 0;
                                    } else {
                                        str4 = trim2.substring(indexOf4).trim();
                                        c3 = 0;
                                        trim2 = trim2.substring(0, indexOf4);
                                    }
                                    String[] E = l0.E(trim2, "\\.");
                                    hVar = new h(E[c3], length, str4, E.length > 1 ? (String[]) Arrays.copyOfRange(E, 1, E.length) : h.f3386e);
                                }
                                arrayDeque.push(hVar);
                            }
                        }
                    }
                }
                i = i2;
            }
        }
    }

    public static int e(String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "center":
            case "middle":
                return 1;
            case "end":
                return 2;
            case "start":
                return 0;
            default:
                c.a.a.a.a.c("Invalid anchor value: ", str, "WebvttCueParser");
                return Integer.MIN_VALUE;
        }
    }
}
