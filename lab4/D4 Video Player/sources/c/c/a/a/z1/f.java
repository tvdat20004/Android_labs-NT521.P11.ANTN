package c.c.a.a.z1;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final File f3731a;

    /* renamed from: b, reason: collision with root package name */
    public final File f3732b;

    public f(File file) {
        this.f3731a = file;
        this.f3732b = new File(file.getPath() + ".bak");
    }

    public boolean a() {
        return this.f3731a.exists() || this.f3732b.exists();
    }

    public InputStream b() {
        if (this.f3732b.exists()) {
            this.f3731a.delete();
            this.f3732b.renameTo(this.f3731a);
        }
        return new FileInputStream(this.f3731a);
    }

    public OutputStream c() {
        if (this.f3731a.exists()) {
            if (this.f3732b.exists()) {
                this.f3731a.delete();
            } else if (!this.f3731a.renameTo(this.f3732b)) {
                StringBuilder j = c.a.a.a.a.j("Couldn't rename file ");
                j.append(this.f3731a);
                j.append(" to backup file ");
                j.append(this.f3732b);
                Log.w("AtomicFile", j.toString());
            }
        }
        try {
            return new e(this.f3731a);
        } catch (FileNotFoundException e2) {
            File parentFile = this.f3731a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                StringBuilder j2 = c.a.a.a.a.j("Couldn't create directory ");
                j2.append(this.f3731a);
                throw new IOException(j2.toString(), e2);
            }
            try {
                return new e(this.f3731a);
            } catch (FileNotFoundException e3) {
                StringBuilder j3 = c.a.a.a.a.j("Couldn't create ");
                j3.append(this.f3731a);
                throw new IOException(j3.toString(), e3);
            }
        }
    }
}
