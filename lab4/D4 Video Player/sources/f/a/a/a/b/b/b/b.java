package f.a.a.a.b.b.b;

import android.net.Uri;
import android.util.Size;
import java.util.Locale;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final a f4343a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f4344b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4345c;

    /* renamed from: d, reason: collision with root package name */
    public final int f4346d;

    /* renamed from: e, reason: collision with root package name */
    public final Size f4347e;

    public enum a {
        VIDEO,
        MUSIC
    }

    public b(a aVar, Uri uri, String str, int i, Size size) {
        this.f4343a = aVar;
        this.f4344b = uri;
        this.f4345c = str;
        this.f4346d = i;
        this.f4347e = size;
    }

    public String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[5];
        objArr[0] = this.f4343a;
        objArr[1] = this.f4345c;
        objArr[2] = Integer.valueOf(this.f4346d);
        Size size = this.f4347e;
        objArr[3] = size == null ? "NULL" : size.toString();
        objArr[4] = this.f4344b.toString();
        return String.format(locale, "[kind= %s, title= %s, dur= %d, res= %s, uri= %s]", objArr);
    }
}
