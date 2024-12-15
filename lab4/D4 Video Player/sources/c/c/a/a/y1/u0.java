package c.c.a.a.y1;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class u0 extends i {

    /* renamed from: e, reason: collision with root package name */
    public final Resources f3681e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f3682f;
    public AssetFileDescriptor g;
    public InputStream h;
    public long i;
    public boolean j;

    public u0(Context context) {
        super(false);
        this.f3681e = context.getResources();
    }

    @Override // c.c.a.a.y1.n
    public long a(q qVar) {
        try {
            Uri uri = qVar.f3651a;
            this.f3682f = uri;
            if (!TextUtils.equals("rawresource", uri.getScheme())) {
                throw new t0("URI must use scheme rawresource");
            }
            try {
                int parseInt = Integer.parseInt(this.f3682f.getLastPathSegment());
                h(qVar);
                this.g = this.f3681e.openRawResourceFd(parseInt);
                FileInputStream fileInputStream = new FileInputStream(this.g.getFileDescriptor());
                this.h = fileInputStream;
                fileInputStream.skip(this.g.getStartOffset());
                if (this.h.skip(qVar.f3655e) < qVar.f3655e) {
                    throw new EOFException();
                }
                long j = qVar.f3656f;
                long j2 = -1;
                if (j != -1) {
                    this.i = j;
                } else {
                    long length = this.g.getLength();
                    if (length != -1) {
                        j2 = length - qVar.f3655e;
                    }
                    this.i = j2;
                }
                this.j = true;
                i(qVar);
                return this.i;
            } catch (NumberFormatException unused) {
                throw new t0("Resource identifier must be an integer.");
            }
        } catch (IOException e2) {
            throw new t0(e2);
        }
    }

    @Override // c.c.a.a.y1.n
    public Uri c() {
        return this.f3682f;
    }

    @Override // c.c.a.a.y1.n
    public void close() {
        this.f3682f = null;
        try {
            try {
                InputStream inputStream = this.h;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.h = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.g;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.g = null;
                        if (this.j) {
                            this.j = false;
                            g();
                        }
                    }
                } catch (IOException e2) {
                    throw new t0(e2);
                }
            } catch (IOException e3) {
                throw new t0(e3);
            }
        } catch (Throwable th) {
            this.h = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.g;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        g();
                    }
                    throw th;
                } catch (IOException e4) {
                    throw new t0(e4);
                }
            } finally {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    g();
                }
            }
        }
    }

    @Override // c.c.a.a.y1.n
    public int e(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e2) {
                throw new t0(e2);
            }
        }
        int read = this.h.read(bArr, i, i2);
        if (read == -1) {
            if (this.i == -1) {
                return -1;
            }
            throw new t0(new EOFException());
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - read;
        }
        f(read);
        return read;
    }
}
