package c.c.a.a.y1.a1;

import android.database.SQLException;
import android.os.ConditionVariable;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Random;

/* loaded from: classes.dex */
public final class a0 implements c {
    public static final HashSet<File> l = new HashSet<>();

    /* renamed from: a, reason: collision with root package name */
    public final File f3546a;

    /* renamed from: b, reason: collision with root package name */
    public final j f3547b;

    /* renamed from: c, reason: collision with root package name */
    public final t f3548c;

    /* renamed from: d, reason: collision with root package name */
    public final l f3549d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<String, ArrayList<j>> f3550e;

    /* renamed from: f, reason: collision with root package name */
    public final Random f3551f;
    public final boolean g;
    public long h;
    public long i;
    public boolean j;
    public b k;

    public a0(File file, j jVar, c.c.a.a.n1.b bVar) {
        boolean add;
        t tVar = new t(bVar, file, null, false, false);
        l lVar = bVar != null ? new l(bVar) : null;
        synchronized (a0.class) {
            add = l.add(file.getAbsoluteFile());
        }
        if (!add) {
            throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
        }
        this.f3546a = file;
        this.f3547b = jVar;
        this.f3548c = tVar;
        this.f3549d = lVar;
        this.f3550e = new HashMap<>();
        this.f3551f = new Random();
        this.g = true;
        this.h = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new z(this, "SimpleCache.initialize()", conditionVariable).start();
        conditionVariable.block();
    }

    public static void a(a0 a0Var) {
        long j;
        b bVar;
        if (a0Var.f3546a.exists() || a0Var.f3546a.mkdirs()) {
            File[] listFiles = a0Var.f3546a.listFiles();
            if (listFiles == null) {
                StringBuilder j2 = c.a.a.a.a.j("Failed to list cache directory files: ");
                j2.append(a0Var.f3546a);
                String sb = j2.toString();
                Log.e("SimpleCache", sb);
                bVar = new b(sb);
            } else {
                int length = listFiles.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        j = -1;
                        break;
                    }
                    File file = listFiles[i];
                    String name = file.getName();
                    if (name.endsWith(".uid")) {
                        try {
                            j = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                            break;
                        } catch (NumberFormatException unused) {
                            Log.e("SimpleCache", "Malformed UID file: " + file);
                            file.delete();
                        }
                    }
                    i++;
                }
                a0Var.h = j;
                if (j == -1) {
                    try {
                        a0Var.h = f(a0Var.f3546a);
                    } catch (IOException e2) {
                        StringBuilder j3 = c.a.a.a.a.j("Failed to create cache UID: ");
                        j3.append(a0Var.f3546a);
                        String sb2 = j3.toString();
                        Log.e("SimpleCache", sb2, e2);
                        bVar = new b(sb2, e2);
                    }
                }
                try {
                    a0Var.f3548c.e(a0Var.h);
                    l lVar = a0Var.f3549d;
                    if (lVar != null) {
                        lVar.b(a0Var.h);
                        Map<String, k> a2 = a0Var.f3549d.a();
                        a0Var.j(a0Var.f3546a, true, listFiles, a2);
                        a0Var.f3549d.c(((HashMap) a2).keySet());
                    } else {
                        a0Var.j(a0Var.f3546a, true, listFiles, null);
                    }
                    t tVar = a0Var.f3548c;
                    int size = tVar.f3596a.size();
                    String[] strArr = new String[size];
                    tVar.f3596a.keySet().toArray(strArr);
                    for (int i2 = 0; i2 < size; i2++) {
                        tVar.f(strArr[i2]);
                    }
                    try {
                        a0Var.f3548c.g();
                        return;
                    } catch (IOException e3) {
                        Log.e("SimpleCache", "Storing index file failed", e3);
                        return;
                    }
                } catch (IOException e4) {
                    StringBuilder j4 = c.a.a.a.a.j("Failed to initialize cache indices: ");
                    j4.append(a0Var.f3546a);
                    String sb3 = j4.toString();
                    Log.e("SimpleCache", sb3, e4);
                    bVar = new b(sb3, e4);
                }
            }
        } else {
            StringBuilder j5 = c.a.a.a.a.j("Failed to create cache directory: ");
            j5.append(a0Var.f3546a);
            String sb4 = j5.toString();
            Log.e("SimpleCache", sb4);
            bVar = new b(sb4);
        }
        a0Var.k = bVar;
    }

    public static long f(File file) {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, c.a.a.a.a.g(Long.toString(abs, 16), ".uid"));
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    public static synchronized void p(File file) {
        synchronized (a0.class) {
            l.remove(file.getAbsoluteFile());
        }
    }

    public final void b(b0 b0Var) {
        this.f3548c.d(b0Var.f3574b).f3582c.add(b0Var);
        this.i += b0Var.f3576d;
        ArrayList<j> arrayList = this.f3550e.get(b0Var.f3574b);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((y) arrayList.get(size)).b(this, b0Var);
                }
            }
        }
        ((y) this.f3547b).b(this, b0Var);
    }

    public synchronized void c(String str, w wVar) {
        c.c.a.a.x1.p.g(!this.j);
        d();
        t tVar = this.f3548c;
        p d2 = tVar.d(str);
        d2.f3583d = d2.f3583d.a(wVar);
        if (!r5.equals(r2)) {
            tVar.f3600e.h(d2);
        }
        try {
            this.f3548c.g();
        } catch (IOException e2) {
            throw new b(e2);
        }
    }

    public synchronized void d() {
        b bVar = this.k;
        if (bVar != null) {
            throw bVar;
        }
    }

    public synchronized void e(File file, long j) {
        boolean z = true;
        c.c.a.a.x1.p.g(!this.j);
        if (file.exists()) {
            if (j == 0) {
                file.delete();
                return;
            }
            b0 b2 = b0.b(file, j, -9223372036854775807L, this.f3548c);
            Objects.requireNonNull(b2);
            p c2 = this.f3548c.c(b2.f3574b);
            Objects.requireNonNull(c2);
            c.c.a.a.x1.p.g(c2.f3584e);
            long a2 = u.a(c2.f3583d);
            if (a2 != -1) {
                if (b2.f3575c + b2.f3576d > a2) {
                    z = false;
                }
                c.c.a.a.x1.p.g(z);
            }
            if (this.f3549d != null) {
                try {
                    this.f3549d.d(file.getName(), b2.f3576d, b2.g);
                } catch (IOException e2) {
                    throw new b(e2);
                }
            }
            b(b2);
            try {
                this.f3548c.g();
                notifyAll();
            } catch (IOException e3) {
                throw new b(e3);
            }
        }
    }

    public synchronized long g() {
        c.c.a.a.x1.p.g(!this.j);
        return this.i;
    }

    public synchronized v h(String str) {
        p pVar;
        c.c.a.a.x1.p.g(!this.j);
        pVar = this.f3548c.f3596a.get(str);
        return pVar != null ? pVar.f3583d : x.f3604c;
    }

    public final b0 i(String str, long j) {
        b0 floor;
        p pVar = this.f3548c.f3596a.get(str);
        if (pVar == null) {
            return new b0(str, j, -1L, -9223372036854775807L, null);
        }
        while (true) {
            b0 b0Var = new b0(pVar.f3581b, j, -1L, -9223372036854775807L, null);
            floor = pVar.f3582c.floor(b0Var);
            if (floor == null || floor.f3575c + floor.f3576d <= j) {
                b0 ceiling = pVar.f3582c.ceiling(b0Var);
                String str2 = pVar.f3581b;
                floor = ceiling == null ? new b0(str2, j, -1L, -9223372036854775807L, null) : new b0(str2, j, ceiling.f3575c - j, -9223372036854775807L, null);
            }
            if (!floor.f3577e || floor.f3578f.exists()) {
                break;
            }
            n();
        }
        return floor;
    }

    public final void j(File file, boolean z, File[] fileArr, Map<String, k> map) {
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                j(file2, false, file2.listFiles(), map);
            } else if (!z || (!name.startsWith("cached_content_index.exi") && !name.endsWith(".uid"))) {
                long j = -1;
                long j2 = -9223372036854775807L;
                k remove = map != null ? map.remove(name) : null;
                if (remove != null) {
                    j = remove.f3569a;
                    j2 = remove.f3570b;
                }
                b0 b2 = b0.b(file2, j, j2, this.f3548c);
                if (b2 != null) {
                    b(b2);
                } else {
                    file2.delete();
                }
            }
        }
    }

    public final void k(b0 b0Var, n nVar) {
        ArrayList<j> arrayList = this.f3550e.get(b0Var.f3574b);
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                y yVar = (y) arrayList.get(size);
                yVar.f3607b.remove(b0Var);
                yVar.f3608c -= b0Var.f3576d;
                yVar.b(this, nVar);
            }
        }
        y yVar2 = (y) this.f3547b;
        yVar2.f3607b.remove(b0Var);
        yVar2.f3608c -= b0Var.f3576d;
        yVar2.b(this, nVar);
    }

    public synchronized void l(n nVar) {
        c.c.a.a.x1.p.g(!this.j);
        p c2 = this.f3548c.c(nVar.f3574b);
        Objects.requireNonNull(c2);
        c.c.a.a.x1.p.g(c2.f3584e);
        c2.f3584e = false;
        this.f3548c.f(c2.f3581b);
        notifyAll();
    }

    public final void m(n nVar) {
        boolean z;
        p c2 = this.f3548c.c(nVar.f3574b);
        if (c2 != null) {
            if (c2.f3582c.remove(nVar)) {
                nVar.f3578f.delete();
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.i -= nVar.f3576d;
                if (this.f3549d != null) {
                    String name = nVar.f3578f.getName();
                    try {
                        l lVar = this.f3549d;
                        Objects.requireNonNull(lVar.f3573b);
                        try {
                            lVar.f3572a.getWritableDatabase().delete(lVar.f3573b, "0 = ?", new String[]{name});
                        } catch (SQLException e2) {
                            throw new c.c.a.a.n1.a(e2);
                        }
                    } catch (IOException unused) {
                        c.a.a.a.a.c("Failed to remove file index entry for: ", name, "SimpleCache");
                    }
                }
                this.f3548c.f(c2.f3581b);
                ArrayList<j> arrayList = this.f3550e.get(nVar.f3574b);
                if (arrayList != null) {
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        y yVar = (y) arrayList.get(size);
                        yVar.f3607b.remove(nVar);
                        yVar.f3608c -= nVar.f3576d;
                    }
                }
                y yVar2 = (y) this.f3547b;
                yVar2.f3607b.remove(nVar);
                yVar2.f3608c -= nVar.f3576d;
            }
        }
    }

    public final void n() {
        ArrayList arrayList = new ArrayList();
        Iterator<p> it = this.f3548c.f3596a.values().iterator();
        while (it.hasNext()) {
            Iterator<b0> it2 = it.next().f3582c.iterator();
            while (it2.hasNext()) {
                b0 next = it2.next();
                if (!next.f3578f.exists()) {
                    arrayList.add(next);
                }
            }
        }
        for (int i = 0; i < arrayList.size(); i++) {
            m((n) arrayList.get(i));
        }
    }

    public synchronized b0 o(String str, long j) {
        boolean z = false;
        c.c.a.a.x1.p.g(!this.j);
        d();
        b0 i = i(str, j);
        if (!i.f3577e) {
            p d2 = this.f3548c.d(str);
            if (d2.f3584e) {
                return null;
            }
            d2.f3584e = true;
            return i;
        }
        if (!this.g) {
            return i;
        }
        File file = i.f3578f;
        Objects.requireNonNull(file);
        String name = file.getName();
        long j2 = i.f3576d;
        long currentTimeMillis = System.currentTimeMillis();
        l lVar = this.f3549d;
        if (lVar != null) {
            try {
                lVar.d(name, j2, currentTimeMillis);
            } catch (IOException unused) {
                Log.w("SimpleCache", "Failed to update index with new touch timestamp.");
            }
        } else {
            z = true;
        }
        b0 a2 = this.f3548c.f3596a.get(str).a(i, currentTimeMillis, z);
        k(i, a2);
        return a2;
    }
}
