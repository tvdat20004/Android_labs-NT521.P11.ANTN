package c.c.a.a.u1.y0.f;

import android.util.Base64;
import b.q.u;
import c.c.a.a.q1.d0.t;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: e, reason: collision with root package name */
    public boolean f3230e;

    /* renamed from: f, reason: collision with root package name */
    public UUID f3231f;
    public byte[] g;

    public f(d dVar, String str) {
        super(dVar, str, "Protection");
    }

    public static void m(byte[] bArr, int i, int i2) {
        byte b2 = bArr[i];
        bArr[i] = bArr[i2];
        bArr[i2] = b2;
    }

    @Override // c.c.a.a.u1.y0.f.d
    public Object b() {
        UUID uuid = this.f3231f;
        byte[] a2 = u.a(uuid, this.g);
        byte[] bArr = this.g;
        t[] tVarArr = new t[1];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i += 2) {
            sb.append((char) bArr[i]);
        }
        String sb2 = sb.toString();
        byte[] decode = Base64.decode(sb2.substring(sb2.indexOf("<KID>") + 5, sb2.indexOf("</KID>")), 0);
        m(decode, 0, 3);
        byte b2 = decode[1];
        decode[1] = decode[2];
        decode[2] = b2;
        byte b3 = decode[4];
        decode[4] = decode[5];
        decode[5] = b3;
        byte b4 = decode[6];
        decode[6] = decode[7];
        decode[7] = b4;
        tVarArr[0] = new t(true, null, 8, decode, 0, 0, null);
        return new a(uuid, a2, tVarArr);
    }

    @Override // c.c.a.a.u1.y0.f.d
    public boolean d(String str) {
        return "ProtectionHeader".equals(str);
    }

    @Override // c.c.a.a.u1.y0.f.d
    public void f(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f3230e = false;
        }
    }

    @Override // c.c.a.a.u1.y0.f.d
    public void k(XmlPullParser xmlPullParser) {
        if ("ProtectionHeader".equals(xmlPullParser.getName())) {
            this.f3230e = true;
            String attributeValue = xmlPullParser.getAttributeValue(null, "SystemID");
            if (attributeValue.charAt(0) == '{' && attributeValue.charAt(attributeValue.length() - 1) == '}') {
                attributeValue = attributeValue.substring(1, attributeValue.length() - 1);
            }
            this.f3231f = UUID.fromString(attributeValue);
        }
    }

    @Override // c.c.a.a.u1.y0.f.d
    public void l(XmlPullParser xmlPullParser) {
        if (this.f3230e) {
            this.g = Base64.decode(xmlPullParser.getText(), 0);
        }
    }
}
