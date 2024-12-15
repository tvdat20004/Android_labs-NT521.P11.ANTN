package c.c.a.a.v1.o;

import java.util.List;

/* loaded from: classes.dex */
public final class a extends c.c.a.a.v1.c {
    public final j n;

    public a(List<byte[]> list) {
        super("DvbDecoder");
        byte[] bArr = list.get(0);
        int length = bArr.length;
        int i = 0 + 1;
        int i2 = i + 1;
        int i3 = ((bArr[0] & 255) << 8) | (bArr[i] & 255);
        int i4 = i2 + 1;
        this.n = new j(i3, (bArr[i4] & 255) | ((bArr[i2] & 255) << 8));
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    @Override // c.c.a.a.v1.c
    public c.c.a.a.v1.e k(byte[] r35, int r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 1068
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.v1.o.a.k(byte[], int, boolean):c.c.a.a.v1.e");
    }
}
