package c.c.a.a.u1.w0;

import android.net.Uri;
import android.text.TextUtils;
import c.c.a.a.y1.s0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class i implements s0.a<Long> {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f2996a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // c.c.a.a.y1.s0.a
    public Long a(Uri uri, InputStream inputStream) {
        String readLine = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("UTF-8"))).readLine();
        try {
            Matcher matcher = f2996a.matcher(readLine);
            if (!matcher.matches()) {
                throw new c.c.a.a.s0("Couldn't parse timestamp: " + readLine);
            }
            String group = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            long time = simpleDateFormat.parse(group).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j = "+".equals(matcher.group(4)) ? 1L : -1L;
                long parseLong = Long.parseLong(matcher.group(5));
                String group2 = matcher.group(7);
                time -= ((((parseLong * 60) + (TextUtils.isEmpty(group2) ? 0L : Long.parseLong(group2))) * 60) * 1000) * j;
            }
            return Long.valueOf(time);
        } catch (ParseException e2) {
            throw new c.c.a.a.s0(e2);
        }
    }
}
