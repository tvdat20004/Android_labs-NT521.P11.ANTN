package c.c.a.a.z1;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class c0 extends BufferedOutputStream {

    /* renamed from: b, reason: collision with root package name */
    public boolean f3724b;

    public c0(OutputStream outputStream) {
        super(outputStream);
    }

    public c0(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    public void a(OutputStream outputStream) {
        c.c.a.a.x1.p.g(this.f3724b);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f3724b = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3724b = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th == null) {
            return;
        }
        int i = l0.f3761a;
        throw th;
    }
}
