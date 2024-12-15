package b.h.i;

import android.util.Log;
import java.io.Writer;

@Deprecated
/* loaded from: classes.dex */
public class a extends Writer {

    /* renamed from: b, reason: collision with root package name */
    public final String f1247b;

    /* renamed from: c, reason: collision with root package name */
    public StringBuilder f1248c = new StringBuilder(128);

    public a(String str) {
        this.f1247b = str;
    }

    public final void a() {
        if (this.f1248c.length() > 0) {
            Log.d(this.f1247b, this.f1248c.toString());
            StringBuilder sb = this.f1248c;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        a();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                a();
            } else {
                this.f1248c.append(c2);
            }
        }
    }
}
