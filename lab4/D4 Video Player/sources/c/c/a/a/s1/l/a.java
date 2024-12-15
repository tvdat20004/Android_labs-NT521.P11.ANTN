package c.c.a.a.s1.l;

import c.c.a.a.s1.g;
import c.c.a.a.z1.l0;
import java.nio.ByteBuffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a implements c.c.a.a.s1.d {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f2733a = Pattern.compile("(.+?)='(.*?)';", 32);

    @Override // c.c.a.a.s1.d
    public c.c.a.a.s1.c a(g gVar) {
        ByteBuffer byteBuffer = gVar.f2180d;
        Matcher matcher = f2733a.matcher(l0.i(byteBuffer.array(), 0, byteBuffer.limit()));
        String str = null;
        String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String I = l0.I(matcher.group(1));
            String group = matcher.group(2);
            I.hashCode();
            if (I.equals("streamurl")) {
                str2 = group;
            } else if (I.equals("streamtitle")) {
                str = group;
            } else {
                c.a.a.a.a.c("Unrecognized ICY tag: ", str, "IcyDecoder");
            }
        }
        if (str == null && str2 == null) {
            return null;
        }
        return new c.c.a.a.s1.c(new e(str, str2));
    }
}
