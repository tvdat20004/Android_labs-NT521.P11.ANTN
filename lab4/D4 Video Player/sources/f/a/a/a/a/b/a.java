package f.a.a.a.a.b;

import android.content.Context;
import android.opengl.GLES20;
import b.q.u;
import c.c.a.a.a2.w;
import c.c.a.a.a2.x;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a extends c.b.a.j.a implements x {
    public static final float[] M = {-1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f};
    public int A;
    public int B;
    public int C;
    public c.b.a.b D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int k;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final String t;
    public int u;
    public int v;
    public int w;
    public int x;
    public int y;
    public int z;
    public final HashMap<String, Integer> j = new HashMap<>();
    public long l = 0;
    public long m = 0;
    public long n = 0;
    public long o = 60;
    public int I = 2;
    public float J = 0.33f;
    public float K = 0.33f;
    public boolean L = true;

    public a(Context context, int i, int i2, int i3, int i4, int i5) {
        this.p = j(context, i);
        this.q = j(context, i2);
        this.r = j(context, i3);
        this.s = j(context, i4);
        this.t = j(context, i5);
    }

    @Override // c.c.a.a.a2.x
    public void a(int i, int i2, int i3, float f2) {
        d.a.a.a.e("[A4K] VIDEO size changed to " + i + " x " + i2, new Object[0]);
        this.G = i;
        this.H = i2;
        g();
    }

    @Override // c.b.a.j.a
    public void b(int i, c.b.a.b bVar) {
        for (int i2 = 0; i2 < this.I; i2++) {
            int i3 = this.w;
            if (i2 == 0) {
                h(i3, i, this.D);
            } else {
                h(i3, bVar.f1866e, this.D);
            }
            h(this.y, this.D.f1866e, bVar);
            h(this.A, bVar.f1866e, this.D);
            h(this.C, this.D.f1866e, bVar);
        }
        long j = this.o;
        long currentTimeMillis = System.currentTimeMillis();
        if (j > 0) {
            long j2 = currentTimeMillis - this.l;
            long j3 = 1000 / j;
            if (j2 < j3) {
                long j4 = (j3 - j2) * 2;
                if (j4 > 0 && j4 < 2000) {
                    try {
                        Thread.sleep(j4, 0);
                    } catch (InterruptedException unused) {
                        d.a.a.a.f("FPS Limiter Thread.sleep threw InterruptedException! Not stretching frame time!", new Object[0]);
                    }
                }
            }
        }
        this.n++;
        long j5 = currentTimeMillis - this.m;
        if (j5 >= 5000) {
            StringBuilder j6 = c.a.a.a.a.j("Average FPS: ");
            j6.append(this.n / (j5 / 1000.0f));
            d.a.a.a.e(j6.toString(), new Object[0]);
            this.m = currentTimeMillis;
            this.n = 0L;
        }
        this.l = currentTimeMillis;
    }

    @Override // c.b.a.j.a
    public void d() {
        GLES20.glDeleteProgram(this.w);
        GLES20.glDeleteProgram(this.y);
        GLES20.glDeleteProgram(this.A);
        GLES20.glDeleteProgram(this.C);
        GLES20.glDeleteShader(this.v);
        GLES20.glDeleteShader(this.x);
        GLES20.glDeleteShader(this.z);
        GLES20.glDeleteShader(this.B);
        GLES20.glDeleteShader(this.u);
        this.w = 0;
        this.y = 0;
        this.A = 0;
        this.C = 0;
        this.v = 0;
        this.x = 0;
        this.z = 0;
        this.B = 0;
        this.u = 0;
        GLES20.glDeleteBuffers(1, new int[]{this.k}, 0);
        this.k = 0;
        d.a.a.a.e("[A4K] Released shader.", new Object[0]);
    }

    @Override // c.b.a.j.a
    public void e(int i, int i2) {
        d.a.a.a.e("[A4K] RENDER size to " + i + " x " + i2, new Object[0]);
        if (this.D == null) {
            this.D = new c.b.a.b();
        }
        this.D.c(i, i2);
        this.E = i;
        this.F = i2;
        g();
    }

    @Override // c.b.a.j.a
    public void f() {
        this.u = u.j(this.p, 35633);
        int j = u.j(this.q, 35632);
        this.v = j;
        this.w = u.g(this.u, j);
        int j2 = u.j(this.r, 35632);
        this.x = j2;
        this.y = u.g(this.u, j2);
        int j3 = u.j(this.s, 35632);
        this.z = j3;
        this.A = u.g(this.u, j3);
        int j4 = u.j(this.t, 35632);
        this.B = j4;
        this.C = u.g(this.u, j4);
        this.k = u.f(M);
        d.a.a.a.e("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~", new Object[0]);
        d.a.a.a.e("[A4K] GL Environment Debug Info:", new Object[0]);
        d.a.a.a.e("GL_VENDOR:     " + GLES20.glGetString(7936), new Object[0]);
        d.a.a.a.e("GL_RENDERER:   " + GLES20.glGetString(7937), new Object[0]);
        d.a.a.a.e("GL_VERSION:    " + GLES20.glGetString(7938), new Object[0]);
        d.a.a.a.e("GL_SL_VERSION: " + GLES20.glGetString(35724), new Object[0]);
        d.a.a.a.e("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~", new Object[0]);
        d.a.a.a.e("[A4K] setup shader finished.", new Object[0]);
    }

    public final void g() {
        int i;
        int i2;
        int i3;
        if (this.E <= 0 || (i = this.F) <= 0 || (i2 = this.G) <= 0 || (i3 = this.H) <= 0 || !this.L) {
            return;
        }
        float f2 = ((r0 / i2) + (i / i3)) / 2.0f;
        float f3 = f2 / 6.0f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        } else if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        this.J = f3;
        float f4 = f2 / 2.0f;
        this.K = f4 >= 0.0f ? f4 > 1.0f ? 1.0f : f4 : 0.0f;
        d.a.a.a.e("[A4K] Auto- Adjusting Push Strength to COL= %.2f and GRAD= %.2f. (RENDER: %d x %d; VIDEO: %d x %d)", Float.valueOf(f3), Float.valueOf(this.K), Integer.valueOf(this.E), Integer.valueOf(this.F), Integer.valueOf(this.G), Integer.valueOf(this.H));
    }

    public void h(int i, int i2, c.b.a.b bVar) {
        bVar.a();
        GLES20.glUseProgram(i);
        int i3 = i(i, "aPosition");
        int i4 = i(i, "aTextureCoord");
        GLES20.glBindBuffer(34962, this.k);
        GLES20.glEnableVertexAttribArray(i3);
        GLES20.glVertexAttribPointer(i3, 3, 5126, false, 20, 0);
        GLES20.glEnableVertexAttribArray(i4);
        GLES20.glVertexAttribPointer(i4, 2, 5126, false, 20, 12);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i2);
        GLES20.glUniform1i(i(i, "sTexture"), 0);
        if (i != this.w) {
            int i5 = i(i, "vTextureSize");
            c.b.a.b bVar2 = this.D;
            GLES20.glUniform2f(i5, bVar2.f1862a, bVar2.f1863b);
        }
        if (i == this.y) {
            GLES20.glUniform1f(i(i, "fPushStrength"), this.J);
        }
        if (i == this.C) {
            GLES20.glUniform1f(i(i, "fPushStrength"), this.K);
        }
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(i3);
        GLES20.glDisableVertexAttribArray(i4);
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindBuffer(34962, 0);
    }

    public int i(int i, String str) {
        Integer num = this.j.get(i + ":" + str);
        if (num != null) {
            return num.intValue();
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(i, str);
        if (glGetAttribLocation == -1) {
            glGetAttribLocation = GLES20.glGetUniformLocation(i, str);
        }
        if (glGetAttribLocation == -1) {
            throw new IllegalStateException(c.a.a.a.a.g("Cannot find handle for ", str));
        }
        this.j.put(i + ":" + str, Integer.valueOf(glGetAttribLocation));
        return glGetAttribLocation;
    }

    public final String j(Context context, int i) {
        try {
            StringBuilder sb = new StringBuilder();
            InputStream openRawResource = context.getResources().openRawResource(i);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(openRawResource));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    openRawResource.close();
                    return sb.toString();
                }
                sb.append(readLine);
                sb.append("\n");
            }
        } catch (IOException e2) {
            StringBuilder k = c.a.a.a.a.k("[A4K] Error loading shader source from Res ID ", i, "! Exception: ");
            k.append(e2.toString());
            d.a.a.a.f(k.toString(), new Object[0]);
            return "precision mediump float;\nvarying highp vec2 vTextureCoord;\nuniform lowp sampler2D sTexture;\nvoid main() {\nvec4 c = texture2D(sTexture, vTextureCoord);\ngl_FragColor = c.rgba; \n}\n";
        }
    }

    @Override // c.c.a.a.a2.x
    public /* synthetic */ void o(int i, int i2) {
        w.b(this, i, i2);
    }

    @Override // c.c.a.a.a2.x
    public /* synthetic */ void t() {
        w.a(this);
    }
}
