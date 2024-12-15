package c.c.a.a.y1;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class f extends i {

    /* renamed from: e, reason: collision with root package name */
    public final AssetManager f3619e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f3620f;
    public InputStream g;
    public long h;
    public boolean i;

    public f(Context context) {
        super(false);
        this.f3619e = context.getAssets();
    }

    @Override // c.c.a.a.y1.n
    public long a(q qVar) {
        try {
            Uri uri = qVar.f3651a;
            this.f3620f = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            h(qVar);
            InputStream open = this.f3619e.open(path, 1);
            this.g = open;
            if (open.skip(qVar.f3655e) < qVar.f3655e) {
                throw new EOFException();
            }
            long j = qVar.f3656f;
            if (j != -1) {
                this.h = j;
            } else {
                long available = this.g.available();
                this.h = available;
                if (available == 2147483647L) {
                    this.h = -1L;
                }
            }
            this.i = true;
            i(qVar);
            return this.h;
        } catch (IOException e2) {
            throw new e(e2);
        }
    }

    @Override // c.c.a.a.y1.n
    public Uri c() {
        return this.f3620f;
    }

    @Override // c.c.a.a.y1.n
    public void close() {
        this.f3620f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e2) {
                throw new e(e2);
            }
        } finally {
            this.g = null;
            if (this.i) {
                this.i = false;
                g();
            }
        }
    }

    @Override // c.c.a.a.y1.n
    public int e(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e2) {
                throw new e(e2);
            }
        }
        int read = this.g.read(bArr, i, i2);
        if (read == -1) {
            if (this.h == -1) {
                return -1;
            }
            throw new e(new EOFException());
        }
        long j2 = this.h;
        if (j2 != -1) {
            this.h = j2 - read;
        }
        f(read);
        return read;
    }
}
