package c.c.a.a.m1;

import java.util.Arrays;

/* loaded from: classes.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final r[] f2100a;

    /* renamed from: b, reason: collision with root package name */
    public final q0 f2101b;

    /* renamed from: c, reason: collision with root package name */
    public final s0 f2102c;

    public g0(r... rVarArr) {
        r[] rVarArr2 = (r[]) Arrays.copyOf(rVarArr, rVarArr.length + 2);
        this.f2100a = rVarArr2;
        q0 q0Var = new q0();
        this.f2101b = q0Var;
        s0 s0Var = new s0();
        this.f2102c = s0Var;
        rVarArr2[rVarArr.length] = q0Var;
        rVarArr2[rVarArr.length + 1] = s0Var;
    }
}
