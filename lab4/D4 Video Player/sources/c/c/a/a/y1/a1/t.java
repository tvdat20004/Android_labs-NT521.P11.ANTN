package c.c.a.a.y1.a1;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import c.c.a.a.z1.l0;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, p> f3596a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<String> f3597b;

    /* renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f3598c;

    /* renamed from: d, reason: collision with root package name */
    public final SparseBooleanArray f3599d;

    /* renamed from: e, reason: collision with root package name */
    public s f3600e;

    /* renamed from: f, reason: collision with root package name */
    public s f3601f;

    public t(c.c.a.a.n1.b bVar, File file, byte[] bArr, boolean z, boolean z2) {
        c.c.a.a.x1.p.g((bVar == null && file == null) ? false : true);
        this.f3596a = new HashMap<>();
        this.f3597b = new SparseArray<>();
        this.f3598c = new SparseBooleanArray();
        this.f3599d = new SparseBooleanArray();
        q qVar = bVar != null ? new q(bVar) : null;
        r rVar = file != null ? new r(new File(file, "cached_content_index.exi"), bArr, z) : null;
        if (qVar == null || (rVar != null && z2)) {
            this.f3600e = rVar;
            this.f3601f = qVar;
        } else {
            this.f3600e = qVar;
            this.f3601f = rVar;
        }
    }

    public static x a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i = 0; i < readInt; i++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 < 0) {
                throw new IOException(c.a.a.a.a.b("Invalid value size: ", readInt2));
            }
            int min = Math.min(readInt2, 10485760);
            byte[] bArr = l0.f3766f;
            int i2 = 0;
            while (i2 != readInt2) {
                int i3 = i2 + min;
                bArr = Arrays.copyOf(bArr, i3);
                dataInputStream.readFully(bArr, i2, min);
                min = Math.min(readInt2 - i3, 10485760);
                i2 = i3;
            }
            hashMap.put(readUTF, bArr);
        }
        return new x(hashMap);
    }

    public static void b(x xVar, DataOutputStream dataOutputStream) {
        Set<Map.Entry<String, byte[]>> entrySet = xVar.f3606b.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (Map.Entry<String, byte[]> entry : entrySet) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public p c(String str) {
        return this.f3596a.get(str);
    }

    public p d(String str) {
        p pVar = this.f3596a.get(str);
        if (pVar != null) {
            return pVar;
        }
        SparseArray<String> sparseArray = this.f3597b;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        p pVar2 = new p(keyAt, str, x.f3604c);
        this.f3596a.put(str, pVar2);
        this.f3597b.put(keyAt, str);
        this.f3599d.put(keyAt, true);
        this.f3600e.h(pVar2);
        return pVar2;
    }

    public void e(long j) {
        s sVar;
        this.f3600e.f(j);
        s sVar2 = this.f3601f;
        if (sVar2 != null) {
            sVar2.f(j);
        }
        if (this.f3600e.c() || (sVar = this.f3601f) == null || !sVar.c()) {
            this.f3600e.b(this.f3596a, this.f3597b);
        } else {
            this.f3601f.b(this.f3596a, this.f3597b);
            this.f3600e.e(this.f3596a);
        }
        s sVar3 = this.f3601f;
        if (sVar3 != null) {
            sVar3.g();
            this.f3601f = null;
        }
    }

    public void f(String str) {
        p pVar = this.f3596a.get(str);
        if (pVar == null || !pVar.f3582c.isEmpty() || pVar.f3584e) {
            return;
        }
        this.f3596a.remove(str);
        int i = pVar.f3580a;
        boolean z = this.f3599d.get(i);
        this.f3600e.a(pVar, z);
        SparseArray<String> sparseArray = this.f3597b;
        if (z) {
            sparseArray.remove(i);
            this.f3599d.delete(i);
        } else {
            sparseArray.put(i, null);
            this.f3598c.put(i, true);
        }
    }

    public void g() {
        this.f3600e.d(this.f3596a);
        int size = this.f3598c.size();
        for (int i = 0; i < size; i++) {
            this.f3597b.remove(this.f3598c.keyAt(i));
        }
        this.f3598c.clear();
        this.f3599d.clear();
    }
}
