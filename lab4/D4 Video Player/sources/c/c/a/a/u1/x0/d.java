package c.c.a.a.u1.x0;

import android.net.Uri;
import c.c.a.a.y1.x0;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public class d implements c.c.a.a.y1.n {

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.y1.n f3154a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f3155b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f3156c;

    /* renamed from: d, reason: collision with root package name */
    public CipherInputStream f3157d;

    public d(c.c.a.a.y1.n nVar, byte[] bArr, byte[] bArr2) {
        this.f3154a = nVar;
        this.f3155b = bArr;
        this.f3156c = bArr2;
    }

    @Override // c.c.a.a.y1.n
    public final long a(c.c.a.a.y1.q qVar) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding");
            try {
                cipher.init(2, new SecretKeySpec(this.f3155b, "AES"), new IvParameterSpec(this.f3156c));
                c.c.a.a.y1.p pVar = new c.c.a.a.y1.p(this.f3154a, qVar);
                this.f3157d = new CipherInputStream(pVar, cipher);
                if (pVar.f3644e) {
                    return -1L;
                }
                pVar.f3641b.a(pVar.f3642c);
                pVar.f3644e = true;
                return -1L;
            } catch (InvalidAlgorithmParameterException | InvalidKeyException e2) {
                throw new RuntimeException(e2);
            }
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // c.c.a.a.y1.n
    public final void b(x0 x0Var) {
        this.f3154a.b(x0Var);
    }

    @Override // c.c.a.a.y1.n
    public final Uri c() {
        return this.f3154a.c();
    }

    @Override // c.c.a.a.y1.n
    public void close() {
        if (this.f3157d != null) {
            this.f3157d = null;
            this.f3154a.close();
        }
    }

    @Override // c.c.a.a.y1.n
    public final Map<String, List<String>> d() {
        return this.f3154a.d();
    }

    @Override // c.c.a.a.y1.n
    public final int e(byte[] bArr, int i, int i2) {
        Objects.requireNonNull(this.f3157d);
        int read = this.f3157d.read(bArr, i, i2);
        if (read < 0) {
            return -1;
        }
        return read;
    }
}
