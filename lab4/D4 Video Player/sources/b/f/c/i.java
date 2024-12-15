package b.f.c;

import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public int f1064a;

    /* renamed from: b, reason: collision with root package name */
    public final l f1065b = new l();

    /* renamed from: c, reason: collision with root package name */
    public final k f1066c = new k();

    /* renamed from: d, reason: collision with root package name */
    public final j f1067d = new j();

    /* renamed from: e, reason: collision with root package name */
    public final m f1068e = new m();

    /* renamed from: f, reason: collision with root package name */
    public HashMap<String, c> f1069f = new HashMap<>();

    public void a(ConstraintLayout.a aVar) {
        j jVar = this.f1067d;
        aVar.f157d = jVar.h;
        aVar.f158e = jVar.i;
        aVar.f159f = jVar.j;
        aVar.g = jVar.k;
        aVar.h = jVar.l;
        aVar.i = jVar.m;
        aVar.j = jVar.n;
        aVar.k = jVar.o;
        aVar.l = jVar.p;
        aVar.p = jVar.q;
        aVar.q = jVar.r;
        aVar.r = jVar.s;
        aVar.s = jVar.t;
        ((ViewGroup.MarginLayoutParams) aVar).leftMargin = jVar.D;
        ((ViewGroup.MarginLayoutParams) aVar).rightMargin = jVar.E;
        ((ViewGroup.MarginLayoutParams) aVar).topMargin = jVar.F;
        ((ViewGroup.MarginLayoutParams) aVar).bottomMargin = jVar.G;
        aVar.x = jVar.O;
        aVar.y = jVar.N;
        aVar.u = jVar.K;
        aVar.w = jVar.M;
        aVar.z = jVar.u;
        aVar.A = jVar.v;
        aVar.m = jVar.x;
        aVar.n = jVar.y;
        j jVar2 = this.f1067d;
        aVar.o = jVar2.z;
        aVar.B = jVar2.w;
        aVar.P = jVar2.A;
        aVar.Q = jVar2.B;
        aVar.E = jVar2.P;
        aVar.D = jVar2.Q;
        aVar.G = jVar2.S;
        aVar.F = jVar2.R;
        aVar.S = jVar2.h0;
        aVar.T = jVar2.i0;
        aVar.H = jVar2.T;
        aVar.I = jVar2.U;
        aVar.L = jVar2.V;
        aVar.M = jVar2.W;
        aVar.J = jVar2.X;
        aVar.K = jVar2.Y;
        aVar.N = jVar2.Z;
        aVar.O = jVar2.a0;
        aVar.R = jVar2.C;
        aVar.f156c = jVar2.g;
        aVar.f154a = jVar2.f1074e;
        aVar.f155b = jVar2.f1075f;
        ((ViewGroup.MarginLayoutParams) aVar).width = jVar2.f1072c;
        ((ViewGroup.MarginLayoutParams) aVar).height = jVar2.f1073d;
        String str = jVar2.g0;
        if (str != null) {
            aVar.U = str;
        }
        aVar.setMarginStart(this.f1067d.I);
        aVar.setMarginEnd(this.f1067d.H);
        aVar.a();
    }

    public Object clone() {
        i iVar = new i();
        j jVar = iVar.f1067d;
        j jVar2 = this.f1067d;
        Objects.requireNonNull(jVar);
        jVar.f1070a = jVar2.f1070a;
        jVar.f1072c = jVar2.f1072c;
        jVar.f1071b = jVar2.f1071b;
        jVar.f1073d = jVar2.f1073d;
        jVar.f1074e = jVar2.f1074e;
        jVar.f1075f = jVar2.f1075f;
        jVar.g = jVar2.g;
        jVar.h = jVar2.h;
        jVar.i = jVar2.i;
        jVar.j = jVar2.j;
        jVar.k = jVar2.k;
        jVar.l = jVar2.l;
        jVar.m = jVar2.m;
        jVar.n = jVar2.n;
        jVar.o = jVar2.o;
        jVar.p = jVar2.p;
        jVar.q = jVar2.q;
        jVar.r = jVar2.r;
        jVar.s = jVar2.s;
        jVar.t = jVar2.t;
        jVar.u = jVar2.u;
        jVar.v = jVar2.v;
        jVar.w = jVar2.w;
        jVar.x = jVar2.x;
        jVar.y = jVar2.y;
        jVar.z = jVar2.z;
        jVar.A = jVar2.A;
        jVar.B = jVar2.B;
        jVar.C = jVar2.C;
        jVar.D = jVar2.D;
        jVar.E = jVar2.E;
        jVar.F = jVar2.F;
        jVar.G = jVar2.G;
        jVar.H = jVar2.H;
        jVar.I = jVar2.I;
        jVar.J = jVar2.J;
        jVar.K = jVar2.K;
        jVar.L = jVar2.L;
        jVar.M = jVar2.M;
        jVar.N = jVar2.N;
        jVar.O = jVar2.O;
        jVar.P = jVar2.P;
        jVar.Q = jVar2.Q;
        jVar.R = jVar2.R;
        jVar.S = jVar2.S;
        jVar.T = jVar2.T;
        jVar.U = jVar2.U;
        jVar.V = jVar2.V;
        jVar.W = jVar2.W;
        jVar.X = jVar2.X;
        jVar.Y = jVar2.Y;
        jVar.Z = jVar2.Z;
        jVar.a0 = jVar2.a0;
        jVar.b0 = jVar2.b0;
        jVar.c0 = jVar2.c0;
        jVar.d0 = jVar2.d0;
        jVar.g0 = jVar2.g0;
        int[] iArr = jVar2.e0;
        if (iArr != null) {
            jVar.e0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            jVar.e0 = null;
        }
        jVar.f0 = jVar2.f0;
        jVar.h0 = jVar2.h0;
        jVar.i0 = jVar2.i0;
        jVar.j0 = jVar2.j0;
        k kVar = iVar.f1066c;
        k kVar2 = this.f1066c;
        Objects.requireNonNull(kVar);
        kVar.f1076a = kVar2.f1076a;
        kVar.f1077b = kVar2.f1077b;
        kVar.f1078c = kVar2.f1078c;
        kVar.f1079d = kVar2.f1079d;
        kVar.f1080e = kVar2.f1080e;
        kVar.g = kVar2.g;
        kVar.f1081f = kVar2.f1081f;
        l lVar = iVar.f1065b;
        l lVar2 = this.f1065b;
        Objects.requireNonNull(lVar);
        lVar.f1082a = lVar2.f1082a;
        lVar.f1083b = lVar2.f1083b;
        lVar.f1085d = lVar2.f1085d;
        lVar.f1086e = lVar2.f1086e;
        lVar.f1084c = lVar2.f1084c;
        m mVar = iVar.f1068e;
        m mVar2 = this.f1068e;
        Objects.requireNonNull(mVar);
        mVar.f1087a = mVar2.f1087a;
        mVar.f1088b = mVar2.f1088b;
        mVar.f1089c = mVar2.f1089c;
        mVar.f1090d = mVar2.f1090d;
        mVar.f1091e = mVar2.f1091e;
        mVar.f1092f = mVar2.f1092f;
        mVar.g = mVar2.g;
        mVar.h = mVar2.h;
        mVar.i = mVar2.i;
        mVar.j = mVar2.j;
        mVar.k = mVar2.k;
        mVar.l = mVar2.l;
        mVar.m = mVar2.m;
        iVar.f1064a = this.f1064a;
        return iVar;
    }
}
