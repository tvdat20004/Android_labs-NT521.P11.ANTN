package c.c.a.a.y1;

import java.io.InputStream;

/* loaded from: classes.dex */
public final class p extends InputStream {

    /* renamed from: b, reason: collision with root package name */
    public final n f3641b;

    /* renamed from: c, reason: collision with root package name */
    public final q f3642c;
    public long g;

    /* renamed from: e, reason: collision with root package name */
    public boolean f3644e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3645f = false;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f3643d = new byte[1];

    public p(n nVar, q qVar) {
        this.f3641b = nVar;
        this.f3642c = qVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f3645f) {
            return;
        }
        this.f3641b.close();
        this.f3645f = true;
    }

    @Override // java.io.InputStream
    public int read() {
        if (read(this.f3643d) == -1) {
            return -1;
        }
        return this.f3643d[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        c.c.a.a.x1.p.g(!this.f3645f);
        if (!this.f3644e) {
            this.f3641b.a(this.f3642c);
            this.f3644e = true;
        }
        int e2 = this.f3641b.e(bArr, i, i2);
        if (e2 == -1) {
            return -1;
        }
        this.g += e2;
        return e2;
    }
}
