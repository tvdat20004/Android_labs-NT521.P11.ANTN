package c.b.a.j;

/* loaded from: classes.dex */
public class b extends a {
    public final int j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(int r5) {
        /*
            r4 = this;
            java.lang.String r0 = "precision mediump float;\nvarying highp vec2 vTextureCoord;\nuniform lowp sampler2D sTexture;\nvoid main() {\ngl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n"
            r1 = 36197(0x8d65, float:5.0723E-41)
            if (r5 != r1) goto L1c
            java.lang.String r1 = "#extension GL_OES_EGL_image_external : require\n"
            java.lang.StringBuilder r1 = c.a.a.a.a.j(r1)
            java.lang.String r2 = "sampler2D"
            java.lang.String r3 = "samplerExternalOES"
            java.lang.String r0 = r0.replace(r2, r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        L1c:
            java.lang.String r1 = "uniform mat4 uMVPMatrix;\nuniform mat4 uSTMatrix;\nuniform float uCRatio;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying highp vec2 vTextureCoord;\nvoid main() {\nvec4 scaledPos = aPosition;\nscaledPos.x = scaledPos.x * uCRatio;\ngl_Position = uMVPMatrix * scaledPos;\nvTextureCoord = (uSTMatrix * aTextureCoord).xy;\n}\n"
            r4.<init>(r1, r0)
            r4.j = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: c.b.a.j.b.<init>(int):void");
    }
}
