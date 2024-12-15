package b.h.h;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final g f1229d;

    /* renamed from: e, reason: collision with root package name */
    public static final String f1230e;

    /* renamed from: f, reason: collision with root package name */
    public static final String f1231f;
    public static final b g;
    public static final b h;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1232a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1233b;

    /* renamed from: c, reason: collision with root package name */
    public final g f1234c;

    static {
        g gVar = i.f1244c;
        f1229d = gVar;
        f1230e = Character.toString((char) 8206);
        f1231f = Character.toString((char) 8207);
        g = new b(false, 2, gVar);
        h = new b(true, 2, gVar);
    }

    public b(boolean z, int i, g gVar) {
        this.f1232a = z;
        this.f1233b = i;
        this.f1234c = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0070, code lost:
    
        if (r3 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0073, code lost:
    
        if (r4 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0091, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0079, code lost:
    
        if (r0.f1227c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007f, code lost:
    
        switch(r0.a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0083, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0086, code lost:
    
        if (r3 != r5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x008e, code lost:
    
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008a, code lost:
    
        if (r3 != r5) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a(java.lang.CharSequence r9) {
        /*
            b.h.h.a r0 = new b.h.h.a
            r1 = 0
            r0.<init>(r9, r1)
            r0.f1227c = r1
            r9 = -1
            r2 = 1
            r3 = r1
            r4 = r3
            r5 = r4
        Ld:
            int r6 = r0.f1227c
            int r7 = r0.f1226b
            if (r6 >= r7) goto L70
            if (r3 != 0) goto L70
            java.lang.CharSequence r7 = r0.f1225a
            char r6 = r7.charAt(r6)
            r0.f1228d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L39
            java.lang.CharSequence r6 = r0.f1225a
            int r7 = r0.f1227c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.f1227c
            int r8 = java.lang.Character.charCount(r6)
            int r8 = r8 + r7
            r0.f1227c = r8
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L4d
        L39:
            int r6 = r0.f1227c
            int r6 = r6 + r2
            r0.f1227c = r6
            char r6 = r0.f1228d
            r7 = 1792(0x700, float:2.511E-42)
            if (r6 >= r7) goto L49
            byte[] r7 = b.h.h.a.f1224e
            r6 = r7[r6]
            goto L4d
        L49:
            byte r6 = java.lang.Character.getDirectionality(r6)
        L4d:
            if (r6 == 0) goto L6b
            if (r6 == r2) goto L68
            r7 = 2
            if (r6 == r7) goto L68
            r7 = 9
            if (r6 == r7) goto Ld
            switch(r6) {
                case 14: goto L64;
                case 15: goto L64;
                case 16: goto L60;
                case 17: goto L60;
                case 18: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L6e
        L5c:
            int r5 = r5 + (-1)
            r4 = r1
            goto Ld
        L60:
            int r5 = r5 + 1
            r4 = r2
            goto Ld
        L64:
            int r5 = r5 + 1
            r4 = r9
            goto Ld
        L68:
            if (r5 != 0) goto L6e
            goto L88
        L6b:
            if (r5 != 0) goto L6e
            goto L8c
        L6e:
            r3 = r5
            goto Ld
        L70:
            if (r3 != 0) goto L73
            goto L91
        L73:
            if (r4 == 0) goto L77
            r1 = r4
            goto L91
        L77:
            int r4 = r0.f1227c
            if (r4 <= 0) goto L91
            byte r4 = r0.a()
            switch(r4) {
                case 14: goto L8a;
                case 15: goto L8a;
                case 16: goto L86;
                case 17: goto L86;
                case 18: goto L83;
                default: goto L82;
            }
        L82:
            goto L77
        L83:
            int r5 = r5 + 1
            goto L77
        L86:
            if (r3 != r5) goto L8e
        L88:
            r1 = r2
            goto L91
        L8a:
            if (r3 != r5) goto L8e
        L8c:
            r1 = r9
            goto L91
        L8e:
            int r5 = r5 + (-1)
            goto L77
        L91:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.h.b.a(java.lang.CharSequence):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        return 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(java.lang.CharSequence r6) {
        /*
            b.h.h.a r0 = new b.h.h.a
            r1 = 0
            r0.<init>(r6, r1)
            int r6 = r0.f1226b
            r0.f1227c = r6
            r6 = r1
        Lb:
            r2 = r6
        Lc:
            int r3 = r0.f1227c
            r4 = 1
            if (r3 <= 0) goto L41
            byte r3 = r0.a()
            if (r3 == 0) goto L39
            if (r3 == r4) goto L32
            r5 = 2
            if (r3 == r5) goto L32
            r5 = 9
            if (r3 == r5) goto Lc
            switch(r3) {
                case 14: goto L2c;
                case 15: goto L2c;
                case 16: goto L29;
                case 17: goto L29;
                case 18: goto L26;
                default: goto L23;
            }
        L23:
            if (r6 != 0) goto Lc
            goto L3f
        L26:
            int r2 = r2 + 1
            goto Lc
        L29:
            if (r6 != r2) goto L2f
            goto L34
        L2c:
            if (r6 != r2) goto L2f
            goto L3b
        L2f:
            int r2 = r2 + (-1)
            goto Lc
        L32:
            if (r2 != 0) goto L36
        L34:
            r1 = r4
            goto L41
        L36:
            if (r6 != 0) goto Lc
            goto L3f
        L39:
            if (r2 != 0) goto L3d
        L3b:
            r1 = -1
            goto L41
        L3d:
            if (r6 != 0) goto Lc
        L3f:
            r6 = r2
            goto Lb
        L41:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: b.h.h.b.b(java.lang.CharSequence):int");
    }

    public static b c() {
        Locale locale = Locale.getDefault();
        Locale locale2 = j.f1246a;
        boolean z = TextUtils.getLayoutDirectionFromLocale(locale) == 1;
        g gVar = f1229d;
        return gVar == f1229d ? z ? h : g : new b(z, 2, gVar);
    }

    public CharSequence d(CharSequence charSequence, g gVar, boolean z) {
        if (charSequence == null) {
            return null;
        }
        boolean b2 = gVar.b(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str = "";
        if (((this.f1233b & 2) != 0) && z) {
            boolean b3 = (b2 ? i.f1243b : i.f1242a).b(charSequence, 0, charSequence.length());
            spannableStringBuilder.append((CharSequence) ((this.f1232a || !(b3 || a(charSequence) == 1)) ? (!this.f1232a || (b3 && a(charSequence) != -1)) ? "" : f1231f : f1230e));
        }
        if (b2 != this.f1232a) {
            spannableStringBuilder.append(b2 ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z) {
            boolean b4 = (b2 ? i.f1243b : i.f1242a).b(charSequence, 0, charSequence.length());
            if (!this.f1232a && (b4 || b(charSequence) == 1)) {
                str = f1230e;
            } else if (this.f1232a && (!b4 || b(charSequence) == -1)) {
                str = f1231f;
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        return spannableStringBuilder;
    }
}
