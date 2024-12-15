package c.c.a.a.y1.a1;

import java.io.File;

/* loaded from: classes.dex */
public abstract class n implements Comparable<n> {

    /* renamed from: b, reason: collision with root package name */
    public final String f3574b;

    /* renamed from: c, reason: collision with root package name */
    public final long f3575c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3576d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3577e;

    /* renamed from: f, reason: collision with root package name */
    public final File f3578f;
    public final long g;

    public n(String str, long j, long j2, long j3, File file) {
        this.f3574b = str;
        this.f3575c = j;
        this.f3576d = j2;
        this.f3577e = file != null;
        this.f3578f = file;
        this.g = j3;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(n nVar) {
        if (!this.f3574b.equals(nVar.f3574b)) {
            return this.f3574b.compareTo(nVar.f3574b);
        }
        long j = this.f3575c - nVar.f3575c;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }
}
