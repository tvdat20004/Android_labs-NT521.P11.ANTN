package c.c.a.a.u1.w0.x;

import android.net.Uri;
import c.c.a.a.l0;
import java.util.List;

/* loaded from: classes.dex */
public class l extends m {

    /* renamed from: f, reason: collision with root package name */
    public final String f3075f;
    public final i g;
    public final t h;

    public l(long j, l0 l0Var, String str, r rVar, List<e> list, String str2, long j2) {
        super(j, l0Var, str, rVar, list, null);
        Uri.parse(str);
        long j3 = rVar.f3087e;
        i iVar = j3 <= 0 ? null : new i(null, rVar.f3086d, j3);
        this.g = iVar;
        this.f3075f = str2;
        this.h = iVar == null ? new t(new i(null, 0L, j2)) : null;
    }

    @Override // c.c.a.a.u1.w0.x.m
    public String h() {
        return this.f3075f;
    }

    @Override // c.c.a.a.u1.w0.x.m
    public c.c.a.a.u1.w0.o i() {
        return this.h;
    }

    @Override // c.c.a.a.u1.w0.x.m
    public i j() {
        return this.g;
    }
}
