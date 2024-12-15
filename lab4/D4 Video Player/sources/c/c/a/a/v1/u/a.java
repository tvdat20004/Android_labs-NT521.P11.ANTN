package c.c.a.a.v1.u;

import c.c.a.a.z1.z;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f3369c = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");

    /* renamed from: a, reason: collision with root package name */
    public final z f3370a = new z();

    /* renamed from: b, reason: collision with root package name */
    public final StringBuilder f3371b = new StringBuilder();

    public static String a(z zVar, StringBuilder sb) {
        boolean z = false;
        sb.setLength(0);
        int i = zVar.f3801b;
        int i2 = zVar.f3802c;
        while (i < i2 && !z) {
            char c2 = (char) zVar.f3800a[i];
            if ((c2 < 'A' || c2 > 'Z') && ((c2 < 'a' || c2 > 'z') && !((c2 >= '0' && c2 <= '9') || c2 == '#' || c2 == '-' || c2 == '.' || c2 == '_'))) {
                z = true;
            } else {
                i++;
                sb.append(c2);
            }
        }
        zVar.B(i - zVar.f3801b);
        return sb.toString();
    }

    public static String b(z zVar, StringBuilder sb) {
        c(zVar);
        if (zVar.a() == 0) {
            return null;
        }
        String a2 = a(zVar, sb);
        if (!"".equals(a2)) {
            return a2;
        }
        StringBuilder j = c.a.a.a.a.j("");
        j.append((char) zVar.p());
        return j.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0068 A[LOOP:1: B:3:0x0002->B:41:0x0068, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(c.c.a.a.z1.z r8) {
        /*
            r0 = 1
        L1:
            r1 = r0
        L2:
            int r2 = r8.a()
            if (r2 <= 0) goto L6a
            if (r1 == 0) goto L6a
            int r1 = r8.f3801b
            byte[] r2 = r8.f3800a
            r1 = r2[r1]
            char r1 = (char) r1
            r2 = 9
            r3 = 0
            if (r1 == r2) goto L28
            r2 = 10
            if (r1 == r2) goto L28
            r2 = 12
            if (r1 == r2) goto L28
            r2 = 13
            if (r1 == r2) goto L28
            r2 = 32
            if (r1 == r2) goto L28
            r1 = r3
            goto L2c
        L28:
            r8.B(r0)
            r1 = r0
        L2c:
            if (r1 != 0) goto L1
            int r1 = r8.f3801b
            int r2 = r8.f3802c
            byte[] r4 = r8.f3800a
            int r5 = r1 + 2
            if (r5 > r2) goto L64
            int r5 = r1 + 1
            r1 = r4[r1]
            r6 = 47
            if (r1 != r6) goto L64
            int r1 = r5 + 1
            r5 = r4[r5]
            r7 = 42
            if (r5 != r7) goto L64
        L48:
            int r5 = r1 + 1
            if (r5 >= r2) goto L5c
            r1 = r4[r1]
            char r1 = (char) r1
            if (r1 != r7) goto L5a
            r1 = r4[r5]
            char r1 = (char) r1
            if (r1 != r6) goto L5a
            int r2 = r5 + 1
            r1 = r2
            goto L48
        L5a:
            r1 = r5
            goto L48
        L5c:
            int r1 = r8.f3801b
            int r2 = r2 - r1
            r8.B(r2)
            r1 = r0
            goto L65
        L64:
            r1 = r3
        L65:
            if (r1 == 0) goto L68
            goto L1
        L68:
            r1 = r3
            goto L2
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.v1.u.a.c(c.c.a.a.z1.z):void");
    }
}
