package c.b.a.j;

import android.opengl.GLES20;
import b.q.u;
import java.util.HashMap;

/* loaded from: classes.dex */
public class a {
    public static final float[] i = {-1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f, -1.0f, -1.0f, 0.0f, 0.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 0.0f};

    /* renamed from: b, reason: collision with root package name */
    public final String f1885b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1886c;

    /* renamed from: d, reason: collision with root package name */
    public int f1887d;

    /* renamed from: e, reason: collision with root package name */
    public int f1888e;

    /* renamed from: f, reason: collision with root package name */
    public int f1889f;
    public int g;
    public final HashMap<String, Integer> h;

    public a() {
        this.h = new HashMap<>();
        this.f1885b = "attribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying highp vec2 vTextureCoord;\nvoid main() {\ngl_Position = aPosition;\nvTextureCoord = aTextureCoord.xy;\n}\n";
        this.f1886c = "precision mediump float;\nvarying highp vec2 vTextureCoord;\nuniform lowp sampler2D sTexture;\nvoid main() {\ngl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
    }

    public a(String str, String str2) {
        this.h = new HashMap<>();
        this.f1885b = str;
        this.f1886c = str2;
    }

    public void b(int i2, c.b.a.b bVar) {
        GLES20.glUseProgram(this.f1887d);
        GLES20.glBindBuffer(34962, this.g);
        GLES20.glEnableVertexAttribArray(c("aPosition"));
        GLES20.glVertexAttribPointer(c("aPosition"), 3, 5126, false, 20, 0);
        GLES20.glEnableVertexAttribArray(c("aTextureCoord"));
        GLES20.glVertexAttribPointer(c("aTextureCoord"), 2, 5126, false, 20, 12);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i2);
        GLES20.glUniform1i(c("sTexture"), 0);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(c("aPosition"));
        GLES20.glDisableVertexAttribArray(c("aTextureCoord"));
        GLES20.glBindTexture(3553, 0);
        GLES20.glBindBuffer(34962, 0);
    }

    public final int c(String str) {
        Integer num = this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f1887d, str);
        if (glGetAttribLocation == -1) {
            glGetAttribLocation = GLES20.glGetUniformLocation(this.f1887d, str);
        }
        if (glGetAttribLocation == -1) {
            throw new IllegalStateException(c.a.a.a.a.g("Could not get attrib or uniform location for ", str));
        }
        this.h.put(str, Integer.valueOf(glGetAttribLocation));
        return glGetAttribLocation;
    }

    public void d() {
        GLES20.glDeleteProgram(this.f1887d);
        this.f1887d = 0;
        GLES20.glDeleteShader(this.f1888e);
        this.f1888e = 0;
        GLES20.glDeleteShader(this.f1889f);
        this.f1889f = 0;
        GLES20.glDeleteBuffers(1, new int[]{this.g}, 0);
        this.g = 0;
        this.h.clear();
    }

    public void e(int i2, int i3) {
    }

    public void f() {
        d();
        this.f1888e = u.j(this.f1885b, 35633);
        int j = u.j(this.f1886c, 35632);
        this.f1889f = j;
        this.f1887d = u.g(this.f1888e, j);
        this.g = u.f(i);
    }
}
