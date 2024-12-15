package c.c.a.a.u1.y0.f;

import android.net.Uri;
import c.c.a.a.y1.s0;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes.dex */
public class j implements s0.a<c> {

    /* renamed from: a, reason: collision with root package name */
    public final XmlPullParserFactory f3237a;

    public j() {
        try {
            this.f3237a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e2) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e2);
        }
    }

    @Override // c.c.a.a.y1.s0.a
    public c a(Uri uri, InputStream inputStream) {
        try {
            XmlPullParser newPullParser = this.f3237a.newPullParser();
            newPullParser.setInput(inputStream, null);
            return (c) new h(null, uri.toString()).e(newPullParser);
        } catch (XmlPullParserException e2) {
            throw new c.c.a.a.s0(e2);
        }
    }
}
