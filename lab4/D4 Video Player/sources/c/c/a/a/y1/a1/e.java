package c.c.a.a.y1.a1;

import android.util.Log;
import c.c.a.a.z1.c0;
import c.c.a.a.z1.l0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final c f3552a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3553b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3554c;

    /* renamed from: d, reason: collision with root package name */
    public c.c.a.a.y1.q f3555d;

    /* renamed from: e, reason: collision with root package name */
    public long f3556e;

    /* renamed from: f, reason: collision with root package name */
    public File f3557f;
    public OutputStream g;
    public FileOutputStream h;
    public long i;
    public long j;
    public c0 k;

    public e(c cVar, long j, int i) {
        c.c.a.a.x1.p.h(j > 0 || j == -1, "fragmentSize must be positive or C.LENGTH_UNSET.");
        if (j != -1 && j < 2097152) {
            Log.w("CacheDataSink", "fragmentSize is below the minimum recommended value of 2097152. This may cause poor cache performance.");
        }
        Objects.requireNonNull(cVar);
        this.f3552a = cVar;
        this.f3553b = j == -1 ? Long.MAX_VALUE : j;
        this.f3554c = i;
    }

    public final void a() {
        OutputStream outputStream = this.g;
        if (outputStream == null) {
            return;
        }
        try {
            outputStream.flush();
            OutputStream outputStream2 = this.g;
            int i = l0.f3761a;
            if (outputStream2 != null) {
                try {
                    outputStream2.close();
                } catch (IOException unused) {
                }
            }
            this.g = null;
            File file = this.f3557f;
            this.f3557f = null;
            ((a0) this.f3552a).e(file, this.i);
        } catch (Throwable th) {
            OutputStream outputStream3 = this.g;
            int i2 = l0.f3761a;
            if (outputStream3 != null) {
                try {
                    outputStream3.close();
                } catch (IOException unused2) {
                }
            }
            this.g = null;
            File file2 = this.f3557f;
            this.f3557f = null;
            file2.delete();
            throw th;
        }
    }

    public final void b() {
        File c2;
        long j = this.f3555d.f3656f;
        long min = j == -1 ? -1L : Math.min(j - this.j, this.f3556e);
        c cVar = this.f3552a;
        c.c.a.a.y1.q qVar = this.f3555d;
        String str = qVar.g;
        long j2 = qVar.f3654d + this.j;
        a0 a0Var = (a0) cVar;
        synchronized (a0Var) {
            c.c.a.a.x1.p.g(!a0Var.j);
            a0Var.d();
            p pVar = a0Var.f3548c.f3596a.get(str);
            Objects.requireNonNull(pVar);
            c.c.a.a.x1.p.g(pVar.f3584e);
            if (!a0Var.f3546a.exists()) {
                a0Var.f3546a.mkdirs();
                a0Var.n();
            }
            y yVar = (y) a0Var.f3547b;
            Objects.requireNonNull(yVar);
            if (min != -1) {
                yVar.a(a0Var, min);
            }
            File file = new File(a0Var.f3546a, Integer.toString(a0Var.f3551f.nextInt(10)));
            if (!file.exists()) {
                file.mkdir();
            }
            c2 = b0.c(file, pVar.f3580a, j2, System.currentTimeMillis());
        }
        this.f3557f = c2;
        FileOutputStream fileOutputStream = new FileOutputStream(this.f3557f);
        this.h = fileOutputStream;
        OutputStream outputStream = fileOutputStream;
        if (this.f3554c > 0) {
            c0 c0Var = this.k;
            if (c0Var == null) {
                this.k = new c0(this.h, this.f3554c);
            } else {
                c0Var.a(fileOutputStream);
            }
            outputStream = this.k;
        }
        this.g = outputStream;
        this.i = 0L;
    }
}
