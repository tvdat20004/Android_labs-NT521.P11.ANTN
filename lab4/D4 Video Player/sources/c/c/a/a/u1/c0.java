package c.c.a.a.u1;

import android.net.Uri;
import java.io.EOFException;

/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.q1.m[] f2848a;

    /* renamed from: b, reason: collision with root package name */
    public c.c.a.a.q1.m f2849b;

    public c0(c.c.a.a.q1.m[] mVarArr) {
        this.f2848a = mVarArr;
    }

    public c.c.a.a.q1.m a(c.c.a.a.q1.j jVar, c.c.a.a.q1.n nVar, Uri uri) {
        c.c.a.a.q1.m mVar = this.f2849b;
        if (mVar != null) {
            return mVar;
        }
        c.c.a.a.q1.m[] mVarArr = this.f2848a;
        int length = mVarArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            c.c.a.a.q1.m mVar2 = mVarArr[i];
            try {
            } catch (EOFException unused) {
            } catch (Throwable th) {
                jVar.f2652f = 0;
                throw th;
            }
            if (mVar2.i(jVar)) {
                this.f2849b = mVar2;
                jVar.f2652f = 0;
                break;
            }
            continue;
            jVar.f2652f = 0;
            i++;
        }
        c.c.a.a.q1.m mVar3 = this.f2849b;
        if (mVar3 != null) {
            mVar3.e(nVar);
            return this.f2849b;
        }
        StringBuilder j = c.a.a.a.a.j("None of the available extractors (");
        c.c.a.a.q1.m[] mVarArr2 = this.f2848a;
        int i2 = c.c.a.a.z1.l0.f3761a;
        StringBuilder sb = new StringBuilder();
        for (int i3 = 0; i3 < mVarArr2.length; i3++) {
            sb.append(mVarArr2[i3].getClass().getSimpleName());
            if (i3 < mVarArr2.length - 1) {
                sb.append(", ");
            }
        }
        j.append(sb.toString());
        j.append(") could read the stream.");
        throw new t0(j.toString(), uri);
    }
}
