package e.a.b;

import android.content.Context;
import java.io.File;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    public final Set<String> f4327a;

    /* renamed from: b, reason: collision with root package name */
    public final h f4328b;

    /* renamed from: c, reason: collision with root package name */
    public final b f4329c;

    public g() {
        h hVar = new h();
        b bVar = new b();
        this.f4327a = new HashSet();
        this.f4328b = hVar;
        this.f4329c = bVar;
    }

    public File a(Context context) {
        return context.getDir("lib", 0);
    }

    public File b(Context context, String str, String str2) {
        String a2 = this.f4328b.a(str);
        return d.a.a.a.d(str2) ? new File(a(context), a2) : new File(a(context), c.a.a.a.a.h(a2, ".", str2));
    }

    public void c(Context context, String str, String str2, d dVar) {
        if (context == null) {
            throw new IllegalArgumentException("Given context is null");
        }
        if (d.a.a.a.d(str)) {
            throw new IllegalArgumentException("Given library is either null or empty");
        }
        String.format(Locale.US, "Beginning load of %s...", str);
        if (dVar == null) {
            d(context, str, str2);
        } else {
            new Thread(new e(this, context, str, str2, dVar)).start();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0161 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v7, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.content.Context r20, java.lang.String r21, java.lang.String r22) {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.b.g.d(android.content.Context, java.lang.String, java.lang.String):void");
    }
}
