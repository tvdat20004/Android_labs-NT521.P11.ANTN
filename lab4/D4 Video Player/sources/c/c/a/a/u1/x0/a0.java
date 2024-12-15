package c.c.a.a.u1.x0;

import android.text.TextUtils;
import c.c.a.a.l0;
import c.c.a.a.s0;
import c.c.a.a.z1.k0;
import java.util.Arrays;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a0 implements c.c.a.a.q1.m {
    public static final Pattern g = Pattern.compile("LOCAL:([^,]+)");
    public static final Pattern h = Pattern.compile("MPEGTS:(\\d+)");

    /* renamed from: a, reason: collision with root package name */
    public final String f3101a;

    /* renamed from: b, reason: collision with root package name */
    public final k0 f3102b;

    /* renamed from: d, reason: collision with root package name */
    public c.c.a.a.q1.n f3104d;

    /* renamed from: f, reason: collision with root package name */
    public int f3106f;

    /* renamed from: c, reason: collision with root package name */
    public final c.c.a.a.z1.z f3103c = new c.c.a.a.z1.z();

    /* renamed from: e, reason: collision with root package name */
    public byte[] f3105e = new byte[1024];

    public a0(String str, k0 k0Var) {
        this.f3101a = str;
        this.f3102b = k0Var;
    }

    @Override // c.c.a.a.q1.m
    public void a() {
    }

    public final c.c.a.a.q1.y b(long j) {
        c.c.a.a.q1.y j2 = this.f3104d.j(0, 3);
        j2.b(l0.z(null, "text/vtt", null, -1, 0, this.f3101a, -1, null, j, Collections.emptyList()));
        this.f3104d.c();
        return j2;
    }

    @Override // c.c.a.a.q1.m
    public int d(c.c.a.a.q1.j jVar, c.c.a.a.q1.s sVar) {
        Matcher matcher;
        String e2;
        int i = (int) jVar.f2649c;
        int i2 = this.f3106f;
        byte[] bArr = this.f3105e;
        if (i2 == bArr.length) {
            this.f3105e = Arrays.copyOf(bArr, ((i != -1 ? i : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f3105e;
        int i3 = this.f3106f;
        int e3 = jVar.e(bArr2, i3, bArr2.length - i3);
        if (e3 != -1) {
            int i4 = this.f3106f + e3;
            this.f3106f = i4;
            if (i == -1 || i4 != i) {
                return 0;
            }
        }
        c.c.a.a.z1.z zVar = new c.c.a.a.z1.z(this.f3105e);
        c.c.a.a.v1.u.l.d(zVar);
        long j = 0;
        long j2 = 0;
        while (true) {
            String e4 = zVar.e();
            if (TextUtils.isEmpty(e4)) {
                while (true) {
                    String e5 = zVar.e();
                    if (e5 == null) {
                        matcher = null;
                        break;
                    }
                    if (c.c.a.a.v1.u.l.f3396a.matcher(e5).matches()) {
                        do {
                            e2 = zVar.e();
                            if (e2 != null) {
                            }
                        } while (!e2.isEmpty());
                    } else {
                        matcher = c.c.a.a.v1.u.j.f3393b.matcher(e5);
                        if (matcher.matches()) {
                            break;
                        }
                    }
                }
                if (matcher == null) {
                    b(0L);
                } else {
                    long c2 = c.c.a.a.v1.u.l.c(matcher.group(1));
                    long b2 = this.f3102b.b((((j + c2) - j2) * 90000) / 1000000);
                    c.c.a.a.q1.y b3 = b(b2 - c2);
                    this.f3103c.y(this.f3105e, this.f3106f);
                    b3.a(this.f3103c, this.f3106f);
                    b3.d(b2, 1, this.f3106f, 0, null);
                }
                return -1;
            }
            if (e4.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher2 = g.matcher(e4);
                if (!matcher2.find()) {
                    throw new s0(c.a.a.a.a.g("X-TIMESTAMP-MAP doesn't contain local timestamp: ", e4));
                }
                Matcher matcher3 = h.matcher(e4);
                if (!matcher3.find()) {
                    throw new s0(c.a.a.a.a.g("X-TIMESTAMP-MAP doesn't contain media timestamp: ", e4));
                }
                j2 = c.c.a.a.v1.u.l.c(matcher2.group(1));
                j = (Long.parseLong(matcher3.group(1)) * 1000000) / 90000;
            }
        }
    }

    @Override // c.c.a.a.q1.m
    public void e(c.c.a.a.q1.n nVar) {
        this.f3104d = nVar;
        nVar.a(new c.c.a.a.q1.u(-9223372036854775807L, 0L));
    }

    @Override // c.c.a.a.q1.m
    public void h(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // c.c.a.a.q1.m
    public boolean i(c.c.a.a.q1.j jVar) {
        jVar.d(this.f3105e, 0, 6, false);
        this.f3103c.y(this.f3105e, 6);
        if (c.c.a.a.v1.u.l.a(this.f3103c)) {
            return true;
        }
        jVar.d(this.f3105e, 6, 3, false);
        this.f3103c.y(this.f3105e, 9);
        return c.c.a.a.v1.u.l.a(this.f3103c);
    }
}
