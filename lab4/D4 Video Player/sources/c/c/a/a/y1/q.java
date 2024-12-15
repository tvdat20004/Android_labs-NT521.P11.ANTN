package c.c.a.a.y1;

import android.net.Uri;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f3651a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3652b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3653c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3654d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3655e;

    /* renamed from: f, reason: collision with root package name */
    public final long f3656f;
    public final String g;
    public final int h;

    public q(Uri uri, int i, byte[] bArr, long j, long j2, long j3, String str, int i2) {
        byte[] bArr2 = bArr;
        boolean z = true;
        c.c.a.a.x1.p.c(j >= 0);
        c.c.a.a.x1.p.c(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        c.c.a.a.x1.p.c(z);
        this.f3651a = uri;
        this.f3652b = i;
        this.f3653c = (bArr2 == null || bArr2.length == 0) ? null : bArr2;
        this.f3654d = j;
        this.f3655e = j2;
        this.f3656f = j3;
        this.g = str;
        this.h = i2;
    }

    public q(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, 1, null, j, j2, j3, str, i);
    }

    public q(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public q(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public static String a(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new AssertionError(i);
    }

    public boolean b(int i) {
        return (this.h & i) == i;
    }

    public q c(long j) {
        long j2 = this.f3656f;
        return d(j, j2 != -1 ? j2 - j : -1L);
    }

    public q d(long j, long j2) {
        return (j == 0 && this.f3656f == j2) ? this : new q(this.f3651a, this.f3652b, this.f3653c, this.f3654d + j, this.f3655e + j, j2, this.g, this.h);
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("DataSpec[");
        j.append(a(this.f3652b));
        j.append(" ");
        j.append(this.f3651a);
        j.append(", ");
        j.append(Arrays.toString(this.f3653c));
        j.append(", ");
        j.append(this.f3654d);
        j.append(", ");
        j.append(this.f3655e);
        j.append(", ");
        j.append(this.f3656f);
        j.append(", ");
        j.append(this.g);
        j.append(", ");
        j.append(this.h);
        j.append("]");
        return j.toString();
    }
}
