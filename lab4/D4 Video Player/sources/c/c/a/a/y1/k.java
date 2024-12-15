package c.c.a.a.y1;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* loaded from: classes.dex */
public final class k extends i {

    /* renamed from: e, reason: collision with root package name */
    public final ContentResolver f3630e;

    /* renamed from: f, reason: collision with root package name */
    public Uri f3631f;
    public AssetFileDescriptor g;
    public FileInputStream h;
    public long i;
    public boolean j;

    public k(Context context) {
        super(false);
        this.f3630e = context.getContentResolver();
    }

    @Override // c.c.a.a.y1.n
    public long a(q qVar) {
        try {
            this.f3631f = qVar.f3651a;
            h(qVar);
            AssetFileDescriptor openAssetFileDescriptor = this.f3630e.openAssetFileDescriptor(this.f3631f, "r");
            this.g = openAssetFileDescriptor;
            if (openAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.f3631f);
            }
            this.h = new FileInputStream(this.g.getFileDescriptor());
            long startOffset = this.g.getStartOffset();
            long skip = this.h.skip(qVar.f3655e + startOffset) - startOffset;
            if (skip != qVar.f3655e) {
                throw new EOFException();
            }
            long j = qVar.f3656f;
            long j2 = -1;
            if (j != -1) {
                this.i = j;
            } else {
                long length = this.g.getLength();
                if (length == -1) {
                    FileChannel channel = this.h.getChannel();
                    long size = channel.size();
                    if (size != 0) {
                        j2 = size - channel.position();
                    }
                    this.i = j2;
                } else {
                    this.i = length - skip;
                }
            }
            this.j = true;
            i(qVar);
            return this.i;
        } catch (IOException e2) {
            throw new j(e2);
        }
    }

    @Override // c.c.a.a.y1.n
    public Uri c() {
        return this.f3631f;
    }

    @Override // c.c.a.a.y1.n
    public void close() {
        this.f3631f = null;
        try {
            try {
                FileInputStream fileInputStream = this.h;
                if (fileInputStream != null) {
                    fileInputStream.close();
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
                    throw new j(e2);
                }
            } catch (IOException e3) {
                throw new j(e3);
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
                    throw new j(e4);
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
                throw new j(e2);
            }
        }
        int read = this.h.read(bArr, i, i2);
        if (read == -1) {
            if (this.i == -1) {
                return -1;
            }
            throw new j(new EOFException());
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - read;
        }
        f(read);
        return read;
    }
}
