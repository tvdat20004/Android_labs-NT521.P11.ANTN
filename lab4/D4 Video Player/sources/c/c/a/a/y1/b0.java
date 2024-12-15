package c.c.a.a.y1;

import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* loaded from: classes.dex */
public final class b0 extends i {

    /* renamed from: e, reason: collision with root package name */
    public RandomAccessFile f3614e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f3615f;
    public long g;
    public boolean h;

    public b0() {
        super(false);
    }

    @Override // c.c.a.a.y1.n
    public long a(q qVar) {
        try {
            this.f3615f = qVar.f3651a;
            h(qVar);
            RandomAccessFile randomAccessFile = new RandomAccessFile(qVar.f3651a.getPath(), "r");
            this.f3614e = randomAccessFile;
            randomAccessFile.seek(qVar.f3655e);
            long j = qVar.f3656f;
            if (j == -1) {
                j = this.f3614e.length() - qVar.f3655e;
            }
            this.g = j;
            if (j < 0) {
                throw new EOFException();
            }
            this.h = true;
            i(qVar);
            return this.g;
        } catch (IOException e2) {
            throw new a0(e2);
        }
    }

    @Override // c.c.a.a.y1.n
    public Uri c() {
        return this.f3615f;
    }

    @Override // c.c.a.a.y1.n
    public void close() {
        this.f3615f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f3614e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
            } catch (IOException e2) {
                throw new a0(e2);
            }
        } finally {
            this.f3614e = null;
            if (this.h) {
                this.h = false;
                g();
            }
        }
    }

    @Override // c.c.a.a.y1.n
    public int e(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            int read = this.f3614e.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.g -= read;
                f(read);
            }
            return read;
        } catch (IOException e2) {
            throw new a0(e2);
        }
    }
}
