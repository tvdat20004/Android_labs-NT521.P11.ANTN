package c.c.a.a.z1;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class e extends OutputStream {

    /* renamed from: b, reason: collision with root package name */
    public final FileOutputStream f3726b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3727c = false;

    public e(File file) {
        this.f3726b = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f3727c) {
            return;
        }
        this.f3727c = true;
        this.f3726b.flush();
        try {
            this.f3726b.getFD().sync();
        } catch (IOException e2) {
            Log.w("AtomicFile", "Failed to sync file descriptor:", e2);
        }
        this.f3726b.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() {
        this.f3726b.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        this.f3726b.write(i);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f3726b.write(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.f3726b.write(bArr, i, i2);
    }
}
