package b.h.c.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public abstract class k {
    public static int a(Context context, int i, int i2) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        return typedValue.resourceId != 0 ? i : i2;
    }

    public static boolean b(TypedArray typedArray, int i, int i2, boolean z) {
        return typedArray.getBoolean(i, typedArray.getBoolean(i2, z));
    }

    public static a c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i, int i2) {
        a aVar;
        if (h(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i3 = typedValue.type;
            if (i3 >= 28 && i3 <= 31) {
                return new a(null, null, typedValue.data);
            }
            try {
                aVar = a.a(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e2) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e2);
                aVar = null;
            }
            if (aVar != null) {
                return aVar;
            }
        }
        return new a(null, null, i2);
    }

    public static String d(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (h(xmlPullParser, str)) {
            return typedArray.getString(i);
        }
        return null;
    }

    public static int e(TypedArray typedArray, int i, int i2, int i3) {
        return typedArray.getResourceId(i, typedArray.getResourceId(i2, i3));
    }

    public static String f(TypedArray typedArray, int i, int i2) {
        String string = typedArray.getString(i);
        return string == null ? typedArray.getString(i2) : string;
    }

    public static CharSequence[] g(TypedArray typedArray, int i, int i2) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        return textArray == null ? typedArray.getTextArray(i2) : textArray;
    }

    public static boolean h(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a4, code lost:
    
        r20.a(-3, r21);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        if (r20 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0026, code lost:
    
        if (r20 != null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Typeface i(android.content.Context r16, int r17, android.util.TypedValue r18, int r19, b.h.c.a.i r20, android.os.Handler r21, boolean r22) {
        /*
            r9 = r17
            r0 = r18
            r5 = r19
            r10 = r20
            r11 = r21
            android.content.res.Resources r3 = r16.getResources()
            r1 = 1
            r3.getValue(r9, r0, r1)
            java.lang.String r12 = "ResourcesCompat"
            java.lang.CharSequence r1 = r0.string
            if (r1 == 0) goto Lc9
            java.lang.String r13 = r1.toString()
            java.lang.String r0 = "res/"
            boolean r0 = r13.startsWith(r0)
            r14 = 0
            r15 = -3
            if (r0 != 0) goto L2a
            if (r10 == 0) goto La7
            goto La4
        L2a:
            b.e.g<java.lang.String, android.graphics.Typeface> r0 = b.h.d.d.f1166b
            java.lang.String r1 = b.h.d.d.c(r3, r9, r5)
            java.lang.Object r0 = r0.a(r1)
            android.graphics.Typeface r0 = (android.graphics.Typeface) r0
            if (r0 == 0) goto L40
            if (r10 == 0) goto L3d
            r10.b(r0, r11)
        L3d:
            r14 = r0
            goto La7
        L40:
            java.lang.String r0 = r13.toLowerCase()     // Catch: java.io.IOException -> L84 org.xmlpull.v1.XmlPullParserException -> L8d
            java.lang.String r1 = ".xml"
            boolean r0 = r0.endsWith(r1)     // Catch: java.io.IOException -> L84 org.xmlpull.v1.XmlPullParserException -> L8d
            if (r0 == 0) goto L72
            android.content.res.XmlResourceParser r0 = r3.getXml(r9)     // Catch: java.io.IOException -> L84 org.xmlpull.v1.XmlPullParserException -> L8d
            b.h.c.a.b r2 = b.h.b.h.z(r0, r3)     // Catch: java.io.IOException -> L84 org.xmlpull.v1.XmlPullParserException -> L8d
            if (r2 != 0) goto L61
            java.lang.String r0 = "Failed to find font-family tag"
            android.util.Log.e(r12, r0)     // Catch: java.io.IOException -> L84 org.xmlpull.v1.XmlPullParserException -> L8d
            if (r10 == 0) goto La7
            r10.a(r15, r11)     // Catch: java.io.IOException -> L84 org.xmlpull.v1.XmlPullParserException -> L8d
            goto La7
        L61:
            r1 = r16
            r4 = r17
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            android.graphics.Typeface r14 = b.h.d.d.a(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.io.IOException -> L84 org.xmlpull.v1.XmlPullParserException -> L8d
            goto La7
        L72:
            r0 = r16
            android.graphics.Typeface r0 = b.h.d.d.b(r0, r3, r9, r13, r5)     // Catch: java.io.IOException -> L84 org.xmlpull.v1.XmlPullParserException -> L8d
            if (r10 == 0) goto L3d
            if (r0 == 0) goto L80
            r10.b(r0, r11)     // Catch: java.io.IOException -> L84 org.xmlpull.v1.XmlPullParserException -> L8d
            goto L3d
        L80:
            r10.a(r15, r11)     // Catch: java.io.IOException -> L84 org.xmlpull.v1.XmlPullParserException -> L8d
            goto L3d
        L84:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to read xml resource "
            goto L95
        L8d:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Failed to parse xml resource "
        L95:
            r1.append(r2)
            r1.append(r13)
            java.lang.String r1 = r1.toString()
            android.util.Log.e(r12, r1, r0)
            if (r10 == 0) goto La7
        La4:
            r10.a(r15, r11)
        La7:
            if (r14 != 0) goto Lc8
            if (r10 == 0) goto Lac
            goto Lc8
        Lac:
            android.content.res.Resources$NotFoundException r0 = new android.content.res.Resources$NotFoundException
            java.lang.String r1 = "Font resource ID #0x"
            java.lang.StringBuilder r1 = c.a.a.a.a.j(r1)
            java.lang.String r2 = java.lang.Integer.toHexString(r17)
            r1.append(r2)
            java.lang.String r2 = " could not be retrieved."
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lc8:
            return r14
        Lc9:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.String r2 = "Resource \""
            java.lang.StringBuilder r2 = c.a.a.a.a.j(r2)
            java.lang.String r3 = r3.getResourceName(r9)
            r2.append(r3)
            java.lang.String r3 = "\" ("
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r17)
            r2.append(r3)
            java.lang.String r3 = ") is not a Font: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.c.a.k.i(android.content.Context, int, android.util.TypedValue, int, b.h.c.a.i, android.os.Handler, boolean):android.graphics.Typeface");
    }

    public static TypedArray j(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
