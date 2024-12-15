package c.b.a;

import android.opengl.GLES20;
import b.q.u;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public int f1862a;

    /* renamed from: b, reason: collision with root package name */
    public int f1863b;

    /* renamed from: c, reason: collision with root package name */
    public int f1864c;

    /* renamed from: d, reason: collision with root package name */
    public int f1865d;

    /* renamed from: e, reason: collision with root package name */
    public int f1866e;

    public void a() {
        GLES20.glBindFramebuffer(36160, this.f1864c);
    }

    public void b() {
        int[] iArr = {this.f1866e};
        GLES20.glDeleteTextures(1, iArr, 0);
        this.f1866e = 0;
        iArr[0] = this.f1865d;
        GLES20.glDeleteRenderbuffers(1, iArr, 0);
        this.f1865d = 0;
        iArr[0] = this.f1864c;
        GLES20.glDeleteFramebuffers(1, iArr, 0);
        this.f1864c = 0;
    }

    public void c(int i, int i2) {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        if (i > iArr[0] || i2 > iArr[0]) {
            StringBuilder j = c.a.a.a.a.j("GL_MAX_TEXTURE_SIZE ");
            j.append(iArr[0]);
            throw new IllegalArgumentException(j.toString());
        }
        GLES20.glGetIntegerv(34024, iArr, 0);
        if (i > iArr[0] || i2 > iArr[0]) {
            StringBuilder j2 = c.a.a.a.a.j("GL_MAX_RENDERBUFFER_SIZE ");
            j2.append(iArr[0]);
            throw new IllegalArgumentException(j2.toString());
        }
        GLES20.glGetIntegerv(36006, iArr, 0);
        int i3 = iArr[0];
        GLES20.glGetIntegerv(36007, iArr, 0);
        int i4 = iArr[0];
        GLES20.glGetIntegerv(32873, iArr, 0);
        int i5 = iArr[0];
        b();
        try {
            this.f1862a = i;
            this.f1863b = i2;
            GLES20.glGenFramebuffers(1, iArr, 0);
            int i6 = iArr[0];
            this.f1864c = i6;
            GLES20.glBindFramebuffer(36160, i6);
            GLES20.glGenRenderbuffers(1, iArr, 0);
            int i7 = iArr[0];
            this.f1865d = i7;
            GLES20.glBindRenderbuffer(36161, i7);
            GLES20.glRenderbufferStorage(36161, 33189, i, i2);
            GLES20.glFramebufferRenderbuffer(36160, 36096, 36161, this.f1865d);
            GLES20.glGenTextures(1, iArr, 0);
            int i8 = iArr[0];
            this.f1866e = i8;
            GLES20.glBindTexture(3553, i8);
            u.r(3553, 9729, 9728);
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.f1866e, 0);
            int glCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
            if (glCheckFramebufferStatus == 36053) {
                GLES20.glBindFramebuffer(36160, i3);
                GLES20.glBindRenderbuffer(36161, i4);
                GLES20.glBindTexture(3553, i5);
            } else {
                throw new RuntimeException("Failed to initialize framebuffer object " + glCheckFramebufferStatus);
            }
        } catch (RuntimeException e2) {
            b();
            throw e2;
        }
    }
}
