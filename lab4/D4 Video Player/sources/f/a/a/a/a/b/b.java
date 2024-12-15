package f.a.a.a.a.b;

import android.util.Base64;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public class b {
    public String a() {
        String str = new String(Base64.decode("Y2FuIHlvdSBmaW5kIG1lPw==", 0));
        MessageDigest messageDigest = MessageDigest.getInstance(new String(Base64.decode("TUQ1", 0)));
        messageDigest.update(str.getBytes());
        byte[] digest = messageDigest.digest();
        StringBuilder sb = new StringBuilder();
        for (byte b2 : digest) {
            String hexString = Integer.toHexString(b2 & 255);
            while (hexString.length() < 2) {
                hexString = c.a.a.a.a.g("0", hexString);
            }
            sb.append(hexString);
        }
        return sb.toString();
    }
}
