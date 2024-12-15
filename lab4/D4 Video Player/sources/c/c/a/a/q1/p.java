package c.c.a.a.q1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f2654c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* renamed from: a, reason: collision with root package name */
    public int f2655a = -1;

    /* renamed from: b, reason: collision with root package name */
    public int f2656b = -1;

    public boolean a() {
        return (this.f2655a == -1 || this.f2656b == -1) ? false : true;
    }

    public final boolean b(String str) {
        Matcher matcher = f2654c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int parseInt = Integer.parseInt(matcher.group(1), 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.f2655a = parseInt;
            this.f2656b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean c(c.c.a.a.s1.c cVar) {
        int i = 0;
        while (true) {
            c.c.a.a.s1.b[] bVarArr = cVar.f2719b;
            if (i >= bVarArr.length) {
                return false;
            }
            c.c.a.a.s1.b bVar = bVarArr[i];
            if (bVar instanceof c.c.a.a.s1.m.j) {
                c.c.a.a.s1.m.j jVar = (c.c.a.a.s1.m.j) bVar;
                if ("iTunSMPB".equals(jVar.f2755d) && b(jVar.f2756e)) {
                    return true;
                }
            } else if (bVar instanceof c.c.a.a.s1.m.r) {
                c.c.a.a.s1.m.r rVar = (c.c.a.a.s1.m.r) bVar;
                if ("com.apple.iTunes".equals(rVar.f2767c) && "iTunSMPB".equals(rVar.f2768d) && b(rVar.f2769e)) {
                    return true;
                }
            } else {
                continue;
            }
            i++;
        }
    }
}
