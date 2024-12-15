package c.c.a.a.v1.u;

import c.c.a.a.s0;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.z;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f3396a = Pattern.compile("^NOTE(( |\t).*)?$");

    public static boolean a(z zVar) {
        String e2 = zVar.e();
        return e2 != null && e2.startsWith("WEBVTT");
    }

    public static float b(String str) {
        if (str.endsWith("%")) {
            return Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
        }
        throw new NumberFormatException("Percentages must end with %");
    }

    public static long c(String str) {
        int i = l0.f3761a;
        String[] split = str.split("\\.", 2);
        long j = 0;
        for (String str2 : l0.E(split[0], ":")) {
            j = (j * 60) + Long.parseLong(str2);
        }
        long j2 = j * 1000;
        if (split.length == 2) {
            j2 += Long.parseLong(split[1]);
        }
        return j2 * 1000;
    }

    public static void d(z zVar) {
        int i = zVar.f3801b;
        if (a(zVar)) {
            return;
        }
        zVar.A(i);
        StringBuilder j = c.a.a.a.a.j("Expected WEBVTT. Got ");
        j.append(zVar.e());
        throw new s0(j.toString());
    }
}
