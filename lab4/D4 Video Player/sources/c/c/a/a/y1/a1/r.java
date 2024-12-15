package c.c.a.a.y1.a1;

import c.c.a.a.z1.c0;
import c.c.a.a.z1.l0;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.Objects;
import java.util.Random;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f3590a;

    /* renamed from: b, reason: collision with root package name */
    public final Cipher f3591b;

    /* renamed from: c, reason: collision with root package name */
    public final SecretKeySpec f3592c;

    /* renamed from: d, reason: collision with root package name */
    public final Random f3593d;

    /* renamed from: e, reason: collision with root package name */
    public final c.c.a.a.z1.f f3594e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3595f;
    public c0 g;

    public r(File file, byte[] bArr, boolean z) {
        Cipher cipher;
        SecretKeySpec secretKeySpec;
        if (bArr != null) {
            c.c.a.a.x1.p.c(bArr.length == 16);
            try {
                if (l0.f3761a == 18) {
                    try {
                        cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
                    } catch (Throwable unused) {
                    }
                    secretKeySpec = new SecretKeySpec(bArr, "AES");
                }
                cipher = Cipher.getInstance("AES/CBC/PKCS5PADDING");
                secretKeySpec = new SecretKeySpec(bArr, "AES");
            } catch (NoSuchAlgorithmException | NoSuchPaddingException e2) {
                throw new IllegalStateException(e2);
            }
        } else {
            c.c.a.a.x1.p.c(!z);
            cipher = null;
            secretKeySpec = null;
        }
        this.f3590a = z;
        this.f3591b = cipher;
        this.f3592c = secretKeySpec;
        this.f3593d = z ? new Random() : null;
        this.f3594e = new c.c.a.a.z1.f(file);
    }

    @Override // c.c.a.a.y1.a1.s
    public void a(p pVar, boolean z) {
        this.f3595f = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    @Override // c.c.a.a.y1.a1.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(java.util.HashMap<java.lang.String, c.c.a.a.y1.a1.p> r11, android.util.SparseArray<java.lang.String> r12) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.y1.a1.r.b(java.util.HashMap, android.util.SparseArray):void");
    }

    @Override // c.c.a.a.y1.a1.s
    public boolean c() {
        return this.f3594e.a();
    }

    @Override // c.c.a.a.y1.a1.s
    public void d(HashMap<String, p> hashMap) {
        if (this.f3595f) {
            e(hashMap);
        }
    }

    @Override // c.c.a.a.y1.a1.s
    public void e(HashMap<String, p> hashMap) {
        DataOutputStream dataOutputStream = null;
        try {
            OutputStream c2 = this.f3594e.c();
            c0 c0Var = this.g;
            if (c0Var == null) {
                this.g = new c0(c2);
            } else {
                c0Var.a(c2);
            }
            DataOutputStream dataOutputStream2 = new DataOutputStream(this.g);
            try {
                dataOutputStream2.writeInt(2);
                dataOutputStream2.writeInt(this.f3590a ? 1 : 0);
                if (this.f3590a) {
                    byte[] bArr = new byte[16];
                    this.f3593d.nextBytes(bArr);
                    dataOutputStream2.write(bArr);
                    try {
                        this.f3591b.init(1, this.f3592c, new IvParameterSpec(bArr));
                        dataOutputStream2.flush();
                        dataOutputStream2 = new DataOutputStream(new CipherOutputStream(this.g, this.f3591b));
                    } catch (InvalidAlgorithmParameterException e2) {
                        e = e2;
                        throw new IllegalStateException(e);
                    } catch (InvalidKeyException e3) {
                        e = e3;
                        throw new IllegalStateException(e);
                    }
                }
                dataOutputStream2.writeInt(hashMap.size());
                int i = 0;
                for (p pVar : hashMap.values()) {
                    dataOutputStream2.writeInt(pVar.f3580a);
                    dataOutputStream2.writeUTF(pVar.f3581b);
                    t.b(pVar.f3583d, dataOutputStream2);
                    i += i(pVar, 2);
                }
                dataOutputStream2.writeInt(i);
                c.c.a.a.z1.f fVar = this.f3594e;
                Objects.requireNonNull(fVar);
                dataOutputStream2.close();
                fVar.f3732b.delete();
                int i2 = l0.f3761a;
                this.f3595f = false;
            } catch (Throwable th) {
                th = th;
                dataOutputStream = dataOutputStream2;
                int i3 = l0.f3761a;
                if (dataOutputStream != null) {
                    try {
                        dataOutputStream.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // c.c.a.a.y1.a1.s
    public void f(long j) {
    }

    @Override // c.c.a.a.y1.a1.s
    public void g() {
        c.c.a.a.z1.f fVar = this.f3594e;
        fVar.f3731a.delete();
        fVar.f3732b.delete();
    }

    @Override // c.c.a.a.y1.a1.s
    public void h(p pVar) {
        this.f3595f = true;
    }

    public final int i(p pVar, int i) {
        int i2;
        int hashCode;
        int hashCode2 = pVar.f3581b.hashCode() + (pVar.f3580a * 31);
        if (i < 2) {
            long a2 = u.a(pVar.f3583d);
            i2 = hashCode2 * 31;
            hashCode = (int) (a2 ^ (a2 >>> 32));
        } else {
            i2 = hashCode2 * 31;
            hashCode = pVar.f3583d.hashCode();
        }
        return i2 + hashCode;
    }

    public final p j(int i, DataInputStream dataInputStream) {
        x a2;
        int readInt = dataInputStream.readInt();
        String readUTF = dataInputStream.readUTF();
        if (i < 2) {
            long readLong = dataInputStream.readLong();
            w wVar = new w();
            w.a(wVar, readLong);
            a2 = x.f3604c.a(wVar);
        } else {
            a2 = t.a(dataInputStream);
        }
        return new p(readInt, readUTF, a2);
    }
}
