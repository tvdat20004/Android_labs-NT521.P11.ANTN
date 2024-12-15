package c.c.a.a.x1.v;

/* loaded from: classes.dex */
public final class g {
    public static final String[] j = {"uniform mat4 uMvpMatrix;", "uniform mat3 uTexMatrix;", "attribute vec4 aPosition;", "attribute vec2 aTexCoords;", "varying vec2 vTexCoords;", "void main() {", "  gl_Position = uMvpMatrix * aPosition;", "  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;", "}"};
    public static final String[] k = {"#extension GL_OES_EGL_image_external : require", "precision mediump float;", "uniform samplerExternalOES uTexture;", "varying vec2 vTexCoords;", "void main() {", "  gl_FragColor = texture2D(uTexture, vTexCoords);", "}"};
    public static final float[] l = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] m = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};
    public static final float[] n = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] o = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};
    public static final float[] p = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public int f3515a;

    /* renamed from: b, reason: collision with root package name */
    public f f3516b;

    /* renamed from: c, reason: collision with root package name */
    public f f3517c;

    /* renamed from: d, reason: collision with root package name */
    public int f3518d;

    /* renamed from: e, reason: collision with root package name */
    public int f3519e;

    /* renamed from: f, reason: collision with root package name */
    public int f3520f;
    public int g;
    public int h;
    public int i;

    public static boolean a(c.c.a.a.a2.a0.e eVar) {
        c.c.a.a.a2.a0.c cVar = eVar.f1904a;
        c.c.a.a.a2.a0.c cVar2 = eVar.f1905b;
        c.c.a.a.a2.a0.d[] dVarArr = cVar.f1899a;
        if (dVarArr.length != 1 || dVarArr[0].f1900a != 0) {
            return false;
        }
        c.c.a.a.a2.a0.d[] dVarArr2 = cVar2.f1899a;
        return dVarArr2.length == 1 && dVarArr2[0].f1900a == 0;
    }
}
