package c.c.a.a.x1;

import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Trace;
import android.text.TextUtils;
import android.util.Log;
import c.c.a.a.z1.l0;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class p {
    public static void a(int i, String str, int i2) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 1) {
            Log.e("GlUtil", GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str);
        }
        GLES20.glAttachShader(i2, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        e();
    }

    public static void b(String str) {
        if (l0.f3761a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void c(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void d(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void e() {
        int i = 0;
        while (true) {
            int glGetError = GLES20.glGetError();
            if (glGetError == 0) {
                return;
            }
            StringBuilder j = c.a.a.a.a.j("glError ");
            j.append(GLU.gluErrorString(i));
            Log.e("GlUtil", j.toString());
            i = glGetError;
        }
    }

    public static int f(int i, int i2, int i3) {
        if (i < i2 || i >= i3) {
            throw new IndexOutOfBoundsException();
        }
        return i;
    }

    public static void g(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void h(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static FloatBuffer i(float[] fArr) {
        return (FloatBuffer) ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(fArr).flip();
    }

    public static void j() {
        if (l0.f3761a >= 18) {
            Trace.endSection();
        }
    }

    public static String k(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static int[] l(String str) {
        int i;
        int[] iArr = new int[4];
        if (TextUtils.isEmpty(str)) {
            iArr[0] = -1;
            return iArr;
        }
        int length = str.length();
        int indexOf = str.indexOf(35);
        if (indexOf != -1) {
            length = indexOf;
        }
        int indexOf2 = str.indexOf(63);
        if (indexOf2 == -1 || indexOf2 > length) {
            indexOf2 = length;
        }
        int indexOf3 = str.indexOf(47);
        if (indexOf3 == -1 || indexOf3 > indexOf2) {
            indexOf3 = indexOf2;
        }
        int indexOf4 = str.indexOf(58);
        if (indexOf4 > indexOf3) {
            indexOf4 = -1;
        }
        int i2 = indexOf4 + 2;
        if (i2 < indexOf2 && str.charAt(indexOf4 + 1) == '/' && str.charAt(i2) == '/') {
            i = str.indexOf(47, indexOf4 + 3);
            if (i == -1 || i > indexOf2) {
                i = indexOf2;
            }
        } else {
            i = indexOf4 + 1;
        }
        iArr[0] = indexOf4;
        iArr[1] = i;
        iArr[2] = indexOf2;
        iArr[3] = length;
        return iArr;
    }

    public static boolean m(XmlPullParser xmlPullParser, String str) {
        return (xmlPullParser.getEventType() == 3) && xmlPullParser.getName().equals(str);
    }

    public static boolean n(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 2;
    }

    public static boolean o(XmlPullParser xmlPullParser, String str) {
        return n(xmlPullParser) && xmlPullParser.getName().equals(str);
    }

    public static String p(StringBuilder sb, int i, int i2) {
        int i3;
        int i4;
        if (i >= i2) {
            return sb.toString();
        }
        if (sb.charAt(i) == '/') {
            i++;
        }
        int i5 = i;
        int i6 = i5;
        while (i5 <= i2) {
            if (i5 == i2) {
                i3 = i5;
            } else if (sb.charAt(i5) == '/') {
                i3 = i5 + 1;
            } else {
                i5++;
            }
            int i7 = i6 + 1;
            if (i5 == i7 && sb.charAt(i6) == '.') {
                sb.delete(i6, i3);
                i2 -= i3 - i6;
            } else {
                if (i5 == i6 + 2 && sb.charAt(i6) == '.' && sb.charAt(i7) == '.') {
                    i4 = sb.lastIndexOf("/", i6 - 2) + 1;
                    int i8 = i4 > i ? i4 : i;
                    sb.delete(i8, i3);
                    i2 -= i3 - i8;
                } else {
                    i4 = i5 + 1;
                }
                i6 = i4;
            }
            i5 = i6;
        }
        return sb.toString();
    }

    public static String q(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        int[] l = l(str2);
        if (l[0] != -1) {
            sb.append(str2);
            p(sb, l[1], l[2]);
            return sb.toString();
        }
        int[] l2 = l(str);
        if (l[3] == 0) {
            sb.append((CharSequence) str, 0, l2[3]);
            sb.append(str2);
            return sb.toString();
        }
        if (l[2] == 0) {
            sb.append((CharSequence) str, 0, l2[2]);
            sb.append(str2);
            return sb.toString();
        }
        if (l[1] != 0) {
            int i = l2[0] + 1;
            sb.append((CharSequence) str, 0, i);
            sb.append(str2);
            return p(sb, l[1] + i, i + l[2]);
        }
        if (str2.charAt(l[1]) == '/') {
            sb.append((CharSequence) str, 0, l2[1]);
            sb.append(str2);
            return p(sb, l2[1], l2[1] + l[2]);
        }
        if (l2[0] + 2 < l2[1] && l2[1] == l2[2]) {
            sb.append((CharSequence) str, 0, l2[1]);
            sb.append('/');
            sb.append(str2);
            return p(sb, l2[1], l2[1] + l[2] + 1);
        }
        int lastIndexOf = str.lastIndexOf(47, l2[2] - 1);
        int i2 = lastIndexOf == -1 ? l2[1] : lastIndexOf + 1;
        sb.append((CharSequence) str, 0, i2);
        sb.append(str2);
        return p(sb, l2[1], i2 + l[2]);
    }

    public static Uri r(String str, String str2) {
        return Uri.parse(q(str, str2));
    }
}
