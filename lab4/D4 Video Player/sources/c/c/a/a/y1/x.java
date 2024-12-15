package c.c.a.a.y1;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public class x extends i implements n {
    public static final Pattern t = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    public static final AtomicReference<byte[]> u = new AtomicReference<>();

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3699e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3700f;
    public final int g;
    public final String h;
    public final c.c.a.a.z1.b0<String> i;
    public final g0 j;
    public final g0 k;
    public q l;
    public HttpURLConnection m;
    public InputStream n;
    public boolean o;
    public long p;
    public long q;
    public long r;
    public long s;

    public x(String str, c.c.a.a.z1.b0<String> b0Var, int i, int i2, boolean z, g0 g0Var) {
        super(true);
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        this.h = str;
        this.i = null;
        this.k = new g0();
        this.f3700f = i;
        this.g = i2;
        this.f3699e = z;
        this.j = g0Var;
    }

    public static URL k(URL url, String str) {
        if (str == null) {
            throw new ProtocolException("Null location redirect");
        }
        URL url2 = new URL(url, str);
        String protocol = url2.getProtocol();
        if ("https".equals(protocol) || "http".equals(protocol)) {
            return url2;
        }
        throw new ProtocolException(c.a.a.a.a.g("Unsupported protocol redirect: ", protocol));
    }

    public static void n(HttpURLConnection httpURLConnection, long j) {
        int i = c.c.a.a.z1.l0.f3761a;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
    
        if (r7 != 0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
    @Override // c.c.a.a.y1.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(c.c.a.a.y1.q r19) {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.y1.x.a(c.c.a.a.y1.q):long");
    }

    @Override // c.c.a.a.y1.n
    public Uri c() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // c.c.a.a.y1.n
    public void close() {
        try {
            if (this.n != null) {
                HttpURLConnection httpURLConnection = this.m;
                long j = this.q;
                if (j != -1) {
                    j -= this.s;
                }
                n(httpURLConnection, j);
                try {
                    this.n.close();
                } catch (IOException e2) {
                    throw new d0(e2, this.l, 3);
                }
            }
        } finally {
            this.n = null;
            j();
            if (this.o) {
                this.o = false;
                g();
            }
        }
    }

    @Override // c.c.a.a.y1.i, c.c.a.a.y1.n
    public Map<String, List<String>> d() {
        HttpURLConnection httpURLConnection = this.m;
        return httpURLConnection == null ? Collections.emptyMap() : httpURLConnection.getHeaderFields();
    }

    @Override // c.c.a.a.y1.n
    public int e(byte[] bArr, int i, int i2) {
        try {
            o();
            if (i2 == 0) {
                return 0;
            }
            long j = this.q;
            if (j != -1) {
                long j2 = j - this.s;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                }
                return -1;
            }
            int read = this.n.read(bArr, i, i2);
            if (read == -1) {
                if (this.q == -1) {
                    return -1;
                }
                throw new EOFException();
            }
            this.s += read;
            f(read);
            return read;
        } catch (IOException e2) {
            throw new d0(e2, this.l, 2);
        }
    }

    public final void j() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.e("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.m = null;
        }
    }

    public final HttpURLConnection l(q qVar) {
        HttpURLConnection m;
        URL url = new URL(qVar.f3651a.toString());
        int i = qVar.f3652b;
        byte[] bArr = qVar.f3653c;
        long j = qVar.f3655e;
        long j2 = qVar.f3656f;
        boolean b2 = qVar.b(1);
        boolean b3 = qVar.b(2);
        if (!this.f3699e) {
            return m(url, i, bArr, j, j2, b2, b3, true);
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i2 > 20) {
                throw new NoRouteToHostException(c.a.a.a.a.b("Too many redirects: ", i3));
            }
            long j3 = j2;
            long j4 = j;
            m = m(url, i, bArr, j, j2, b2, b3, false);
            int responseCode = m.getResponseCode();
            String headerField = m.getHeaderField("Location");
            if ((i == 1 || i == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                m.disconnect();
                url = k(url, headerField);
            } else {
                if (i != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    break;
                }
                m.disconnect();
                url = k(url, headerField);
                bArr = null;
                i = 1;
            }
            i2 = i3;
            j2 = j3;
            j = j4;
        }
        return m;
    }

    public final HttpURLConnection m(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, boolean z3) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f3700f);
        httpURLConnection.setReadTimeout(this.g);
        g0 g0Var = this.j;
        if (g0Var != null) {
            for (Map.Entry<String, String> entry : g0Var.a().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.k.a().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j != 0 || j2 != -1) {
            String str = "bytes=" + j + "-";
            if (j2 != -1) {
                StringBuilder j3 = c.a.a.a.a.j(str);
                j3.append((j + j2) - 1);
                str = j3.toString();
            }
            httpURLConnection.setRequestProperty("Range", str);
        }
        httpURLConnection.setRequestProperty("User-Agent", this.h);
        if (!z) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        if (z2) {
            httpURLConnection.setRequestProperty("Icy-MetaData", "1");
        }
        httpURLConnection.setInstanceFollowRedirects(z3);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(q.a(i));
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final void o() {
        if (this.r == this.p) {
            return;
        }
        byte[] andSet = u.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j = this.r;
            long j2 = this.p;
            if (j == j2) {
                u.set(andSet);
                return;
            }
            int read = this.n.read(andSet, 0, (int) Math.min(j2 - j, andSet.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (read == -1) {
                throw new EOFException();
            }
            this.r += read;
            f(read);
        }
    }
}
