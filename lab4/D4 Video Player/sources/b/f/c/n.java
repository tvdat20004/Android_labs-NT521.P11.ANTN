package b.f.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class n {

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f1093d = {0, 4, 8};

    /* renamed from: e, reason: collision with root package name */
    public static SparseIntArray f1094e;

    /* renamed from: a, reason: collision with root package name */
    public HashMap<String, c> f1095a = new HashMap<>();

    /* renamed from: b, reason: collision with root package name */
    public boolean f1096b = true;

    /* renamed from: c, reason: collision with root package name */
    public HashMap<Integer, i> f1097c = new HashMap<>();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1094e = sparseIntArray;
        sparseIntArray.append(76, 25);
        f1094e.append(77, 26);
        f1094e.append(79, 29);
        f1094e.append(80, 30);
        f1094e.append(86, 36);
        f1094e.append(85, 35);
        f1094e.append(58, 4);
        f1094e.append(57, 3);
        f1094e.append(55, 1);
        f1094e.append(94, 6);
        f1094e.append(95, 7);
        f1094e.append(65, 17);
        f1094e.append(66, 18);
        f1094e.append(67, 19);
        f1094e.append(0, 27);
        f1094e.append(81, 32);
        f1094e.append(82, 33);
        f1094e.append(64, 10);
        f1094e.append(63, 9);
        f1094e.append(98, 13);
        f1094e.append(101, 16);
        f1094e.append(99, 14);
        f1094e.append(96, 11);
        f1094e.append(100, 15);
        f1094e.append(97, 12);
        f1094e.append(89, 40);
        f1094e.append(74, 39);
        f1094e.append(73, 41);
        f1094e.append(88, 42);
        f1094e.append(72, 20);
        f1094e.append(87, 37);
        f1094e.append(62, 5);
        f1094e.append(75, 82);
        f1094e.append(84, 82);
        f1094e.append(78, 82);
        f1094e.append(56, 82);
        f1094e.append(54, 82);
        f1094e.append(5, 24);
        f1094e.append(7, 28);
        f1094e.append(23, 31);
        f1094e.append(24, 8);
        f1094e.append(6, 34);
        f1094e.append(8, 2);
        f1094e.append(3, 23);
        f1094e.append(4, 21);
        f1094e.append(2, 22);
        f1094e.append(13, 43);
        f1094e.append(26, 44);
        f1094e.append(21, 45);
        f1094e.append(22, 46);
        f1094e.append(20, 60);
        f1094e.append(18, 47);
        f1094e.append(19, 48);
        f1094e.append(14, 49);
        f1094e.append(15, 50);
        f1094e.append(16, 51);
        f1094e.append(17, 52);
        f1094e.append(25, 53);
        f1094e.append(90, 54);
        f1094e.append(68, 55);
        f1094e.append(91, 56);
        f1094e.append(69, 57);
        f1094e.append(92, 58);
        f1094e.append(70, 59);
        f1094e.append(59, 61);
        f1094e.append(61, 62);
        f1094e.append(60, 63);
        f1094e.append(27, 64);
        f1094e.append(106, 65);
        f1094e.append(33, 66);
        f1094e.append(107, 67);
        f1094e.append(103, 79);
        f1094e.append(1, 38);
        f1094e.append(102, 68);
        f1094e.append(93, 69);
        f1094e.append(71, 70);
        f1094e.append(31, 71);
        f1094e.append(29, 72);
        f1094e.append(30, 73);
        f1094e.append(32, 74);
        f1094e.append(28, 75);
        f1094e.append(104, 76);
        f1094e.append(83, 77);
        f1094e.append(108, 78);
        f1094e.append(53, 80);
        f1094e.append(52, 81);
    }

    public void a(Context context, int i) {
        c cVar;
        n nVar = this;
        ConstraintLayout constraintLayout = (ConstraintLayout) LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        int childCount = constraintLayout.getChildCount();
        nVar.f1097c.clear();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.a aVar = (ConstraintLayout.a) childAt.getLayoutParams();
            int id = childAt.getId();
            if (nVar.f1096b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!nVar.f1097c.containsKey(Integer.valueOf(id))) {
                nVar.f1097c.put(Integer.valueOf(id), new i());
            }
            i iVar = nVar.f1097c.get(Integer.valueOf(id));
            HashMap<String, c> hashMap = nVar.f1095a;
            HashMap<String, c> hashMap2 = new HashMap<>();
            Class<?> cls = childAt.getClass();
            for (String str : hashMap.keySet()) {
                c cVar2 = hashMap.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        cVar = new c(cVar2, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor()));
                    } else {
                        try {
                            cVar = new c(cVar2, cls.getMethod("getMap" + str, new Class[0]).invoke(childAt, new Object[0]));
                        } catch (IllegalAccessException e2) {
                            e = e2;
                            e.printStackTrace();
                        } catch (NoSuchMethodException e3) {
                            e = e3;
                            e.printStackTrace();
                        } catch (InvocationTargetException e4) {
                            e = e4;
                            e.printStackTrace();
                        }
                    }
                    hashMap2.put(str, cVar);
                } catch (IllegalAccessException e5) {
                    e = e5;
                } catch (NoSuchMethodException e6) {
                    e = e6;
                } catch (InvocationTargetException e7) {
                    e = e7;
                }
            }
            iVar.f1069f = hashMap2;
            iVar.f1064a = id;
            j jVar = iVar.f1067d;
            jVar.h = aVar.f157d;
            jVar.i = aVar.f158e;
            jVar.j = aVar.f159f;
            jVar.k = aVar.g;
            jVar.l = aVar.h;
            jVar.m = aVar.i;
            jVar.n = aVar.j;
            jVar.o = aVar.k;
            jVar.p = aVar.l;
            jVar.q = aVar.p;
            jVar.r = aVar.q;
            jVar.s = aVar.r;
            jVar.t = aVar.s;
            jVar.u = aVar.z;
            jVar.v = aVar.A;
            jVar.w = aVar.B;
            jVar.x = aVar.m;
            jVar.y = aVar.n;
            jVar.z = aVar.o;
            jVar.A = aVar.P;
            jVar.B = aVar.Q;
            jVar.C = aVar.R;
            jVar.g = aVar.f156c;
            jVar.f1074e = aVar.f154a;
            jVar.f1075f = aVar.f155b;
            j jVar2 = iVar.f1067d;
            jVar2.f1072c = ((ViewGroup.MarginLayoutParams) aVar).width;
            jVar2.f1073d = ((ViewGroup.MarginLayoutParams) aVar).height;
            jVar2.D = ((ViewGroup.MarginLayoutParams) aVar).leftMargin;
            jVar2.E = ((ViewGroup.MarginLayoutParams) aVar).rightMargin;
            jVar2.F = ((ViewGroup.MarginLayoutParams) aVar).topMargin;
            jVar2.G = ((ViewGroup.MarginLayoutParams) aVar).bottomMargin;
            jVar2.P = aVar.E;
            jVar2.Q = aVar.D;
            jVar2.S = aVar.G;
            jVar2.R = aVar.F;
            jVar2.h0 = aVar.S;
            jVar2.i0 = aVar.T;
            jVar2.T = aVar.H;
            jVar2.U = aVar.I;
            jVar2.V = aVar.L;
            jVar2.W = aVar.M;
            jVar2.X = aVar.J;
            jVar2.Y = aVar.K;
            jVar2.Z = aVar.N;
            jVar2.a0 = aVar.O;
            jVar2.g0 = aVar.U;
            jVar2.K = aVar.u;
            jVar2.M = aVar.w;
            jVar2.J = aVar.t;
            jVar2.L = aVar.v;
            j jVar3 = iVar.f1067d;
            jVar3.O = aVar.x;
            jVar3.N = aVar.y;
            jVar3.H = aVar.getMarginEnd();
            iVar.f1067d.I = aVar.getMarginStart();
            iVar.f1065b.f1083b = childAt.getVisibility();
            iVar.f1065b.f1085d = childAt.getAlpha();
            iVar.f1068e.f1088b = childAt.getRotation();
            iVar.f1068e.f1089c = childAt.getRotationX();
            iVar.f1068e.f1090d = childAt.getRotationY();
            iVar.f1068e.f1091e = childAt.getScaleX();
            iVar.f1068e.f1092f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                m mVar = iVar.f1068e;
                mVar.g = pivotX;
                mVar.h = pivotY;
            }
            iVar.f1068e.i = childAt.getTranslationX();
            iVar.f1068e.j = childAt.getTranslationY();
            iVar.f1068e.k = childAt.getTranslationZ();
            m mVar2 = iVar.f1068e;
            if (mVar2.l) {
                mVar2.m = childAt.getElevation();
            }
            if (childAt instanceof a) {
                a aVar2 = (a) childAt;
                j jVar4 = iVar.f1067d;
                jVar4.j0 = aVar2.j.o0;
                jVar4.e0 = aVar2.getReferencedIds();
                iVar.f1067d.b0 = aVar2.getType();
                iVar.f1067d.c0 = aVar2.getMargin();
            }
            i2++;
            nVar = this;
        }
    }

    public final int[] b(View view, String str) {
        int i;
        Object c2;
        String[] split = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[split.length];
        int i2 = 0;
        int i3 = 0;
        while (i2 < split.length) {
            String trim = split[i2].trim();
            try {
                i = q.class.getField(trim).getInt(null);
            } catch (Exception unused) {
                i = 0;
            }
            if (i == 0) {
                i = context.getResources().getIdentifier(trim, "id", context.getPackageName());
            }
            if (i == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (c2 = ((ConstraintLayout) view.getParent()).c(0, trim)) != null && (c2 instanceof Integer)) {
                i = ((Integer) c2).intValue();
            }
            iArr[i3] = i;
            i2++;
            i3++;
        }
        return i3 != split.length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    public final i c(Context context, AttributeSet attributeSet) {
        k kVar;
        String str;
        StringBuilder sb;
        String str2;
        i iVar = new i();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1098a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index != 1 && 23 != index && 24 != index) {
                iVar.f1066c.f1076a = true;
                iVar.f1067d.f1071b = true;
                iVar.f1065b.f1082a = true;
                iVar.f1068e.f1087a = true;
            }
            switch (f1094e.get(index)) {
                case 1:
                    j jVar = iVar.f1067d;
                    int resourceId = obtainStyledAttributes.getResourceId(index, jVar.p);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    jVar.p = resourceId;
                    continue;
                case 2:
                    j jVar2 = iVar.f1067d;
                    jVar2.G = obtainStyledAttributes.getDimensionPixelSize(index, jVar2.G);
                    continue;
                case 3:
                    j jVar3 = iVar.f1067d;
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, jVar3.o);
                    if (resourceId2 == -1) {
                        resourceId2 = obtainStyledAttributes.getInt(index, -1);
                    }
                    jVar3.o = resourceId2;
                    continue;
                case 4:
                    j jVar4 = iVar.f1067d;
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, jVar4.n);
                    if (resourceId3 == -1) {
                        resourceId3 = obtainStyledAttributes.getInt(index, -1);
                    }
                    jVar4.n = resourceId3;
                    continue;
                case 5:
                    iVar.f1067d.w = obtainStyledAttributes.getString(index);
                    continue;
                case 6:
                    j jVar5 = iVar.f1067d;
                    jVar5.A = obtainStyledAttributes.getDimensionPixelOffset(index, jVar5.A);
                    continue;
                case 7:
                    j jVar6 = iVar.f1067d;
                    jVar6.B = obtainStyledAttributes.getDimensionPixelOffset(index, jVar6.B);
                    continue;
                case 8:
                    j jVar7 = iVar.f1067d;
                    jVar7.H = obtainStyledAttributes.getDimensionPixelSize(index, jVar7.H);
                    continue;
                case 9:
                    j jVar8 = iVar.f1067d;
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, jVar8.t);
                    if (resourceId4 == -1) {
                        resourceId4 = obtainStyledAttributes.getInt(index, -1);
                    }
                    jVar8.t = resourceId4;
                    continue;
                case 10:
                    j jVar9 = iVar.f1067d;
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, jVar9.s);
                    if (resourceId5 == -1) {
                        resourceId5 = obtainStyledAttributes.getInt(index, -1);
                    }
                    jVar9.s = resourceId5;
                    continue;
                case 11:
                    j jVar10 = iVar.f1067d;
                    jVar10.M = obtainStyledAttributes.getDimensionPixelSize(index, jVar10.M);
                    continue;
                case 12:
                    j jVar11 = iVar.f1067d;
                    jVar11.N = obtainStyledAttributes.getDimensionPixelSize(index, jVar11.N);
                    continue;
                case 13:
                    j jVar12 = iVar.f1067d;
                    jVar12.J = obtainStyledAttributes.getDimensionPixelSize(index, jVar12.J);
                    continue;
                case 14:
                    j jVar13 = iVar.f1067d;
                    jVar13.L = obtainStyledAttributes.getDimensionPixelSize(index, jVar13.L);
                    continue;
                case 15:
                    j jVar14 = iVar.f1067d;
                    jVar14.O = obtainStyledAttributes.getDimensionPixelSize(index, jVar14.O);
                    continue;
                case 16:
                    j jVar15 = iVar.f1067d;
                    jVar15.K = obtainStyledAttributes.getDimensionPixelSize(index, jVar15.K);
                    continue;
                case 17:
                    j jVar16 = iVar.f1067d;
                    jVar16.f1074e = obtainStyledAttributes.getDimensionPixelOffset(index, jVar16.f1074e);
                    continue;
                case 18:
                    j jVar17 = iVar.f1067d;
                    jVar17.f1075f = obtainStyledAttributes.getDimensionPixelOffset(index, jVar17.f1075f);
                    continue;
                case 19:
                    j jVar18 = iVar.f1067d;
                    jVar18.g = obtainStyledAttributes.getFloat(index, jVar18.g);
                    continue;
                case 20:
                    j jVar19 = iVar.f1067d;
                    jVar19.u = obtainStyledAttributes.getFloat(index, jVar19.u);
                    continue;
                case 21:
                    j jVar20 = iVar.f1067d;
                    jVar20.f1073d = obtainStyledAttributes.getLayoutDimension(index, jVar20.f1073d);
                    continue;
                case 22:
                    l lVar = iVar.f1065b;
                    lVar.f1083b = obtainStyledAttributes.getInt(index, lVar.f1083b);
                    l lVar2 = iVar.f1065b;
                    lVar2.f1083b = f1093d[lVar2.f1083b];
                    continue;
                case 23:
                    j jVar21 = iVar.f1067d;
                    jVar21.f1072c = obtainStyledAttributes.getLayoutDimension(index, jVar21.f1072c);
                    continue;
                case 24:
                    j jVar22 = iVar.f1067d;
                    jVar22.D = obtainStyledAttributes.getDimensionPixelSize(index, jVar22.D);
                    continue;
                case 25:
                    j jVar23 = iVar.f1067d;
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, jVar23.h);
                    if (resourceId6 == -1) {
                        resourceId6 = obtainStyledAttributes.getInt(index, -1);
                    }
                    jVar23.h = resourceId6;
                    continue;
                case 26:
                    j jVar24 = iVar.f1067d;
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, jVar24.i);
                    if (resourceId7 == -1) {
                        resourceId7 = obtainStyledAttributes.getInt(index, -1);
                    }
                    jVar24.i = resourceId7;
                    continue;
                case 27:
                    j jVar25 = iVar.f1067d;
                    jVar25.C = obtainStyledAttributes.getInt(index, jVar25.C);
                    continue;
                case 28:
                    j jVar26 = iVar.f1067d;
                    jVar26.E = obtainStyledAttributes.getDimensionPixelSize(index, jVar26.E);
                    continue;
                case 29:
                    j jVar27 = iVar.f1067d;
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, jVar27.j);
                    if (resourceId8 == -1) {
                        resourceId8 = obtainStyledAttributes.getInt(index, -1);
                    }
                    jVar27.j = resourceId8;
                    continue;
                case 30:
                    j jVar28 = iVar.f1067d;
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, jVar28.k);
                    if (resourceId9 == -1) {
                        resourceId9 = obtainStyledAttributes.getInt(index, -1);
                    }
                    jVar28.k = resourceId9;
                    continue;
                case 31:
                    j jVar29 = iVar.f1067d;
                    jVar29.I = obtainStyledAttributes.getDimensionPixelSize(index, jVar29.I);
                    continue;
                case 32:
                    j jVar30 = iVar.f1067d;
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, jVar30.q);
                    if (resourceId10 == -1) {
                        resourceId10 = obtainStyledAttributes.getInt(index, -1);
                    }
                    jVar30.q = resourceId10;
                    continue;
                case 33:
                    j jVar31 = iVar.f1067d;
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, jVar31.r);
                    if (resourceId11 == -1) {
                        resourceId11 = obtainStyledAttributes.getInt(index, -1);
                    }
                    jVar31.r = resourceId11;
                    continue;
                case 34:
                    j jVar32 = iVar.f1067d;
                    jVar32.F = obtainStyledAttributes.getDimensionPixelSize(index, jVar32.F);
                    continue;
                case 35:
                    j jVar33 = iVar.f1067d;
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, jVar33.m);
                    if (resourceId12 == -1) {
                        resourceId12 = obtainStyledAttributes.getInt(index, -1);
                    }
                    jVar33.m = resourceId12;
                    continue;
                case 36:
                    j jVar34 = iVar.f1067d;
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, jVar34.l);
                    if (resourceId13 == -1) {
                        resourceId13 = obtainStyledAttributes.getInt(index, -1);
                    }
                    jVar34.l = resourceId13;
                    continue;
                case 37:
                    j jVar35 = iVar.f1067d;
                    jVar35.v = obtainStyledAttributes.getFloat(index, jVar35.v);
                    continue;
                case 38:
                    iVar.f1064a = obtainStyledAttributes.getResourceId(index, iVar.f1064a);
                    continue;
                case 39:
                    j jVar36 = iVar.f1067d;
                    jVar36.Q = obtainStyledAttributes.getFloat(index, jVar36.Q);
                    continue;
                case 40:
                    j jVar37 = iVar.f1067d;
                    jVar37.P = obtainStyledAttributes.getFloat(index, jVar37.P);
                    continue;
                case 41:
                    j jVar38 = iVar.f1067d;
                    jVar38.R = obtainStyledAttributes.getInt(index, jVar38.R);
                    continue;
                case 42:
                    j jVar39 = iVar.f1067d;
                    jVar39.S = obtainStyledAttributes.getInt(index, jVar39.S);
                    continue;
                case 43:
                    l lVar3 = iVar.f1065b;
                    lVar3.f1085d = obtainStyledAttributes.getFloat(index, lVar3.f1085d);
                    continue;
                case 44:
                    m mVar = iVar.f1068e;
                    mVar.l = true;
                    mVar.m = obtainStyledAttributes.getDimension(index, mVar.m);
                    continue;
                case 45:
                    m mVar2 = iVar.f1068e;
                    mVar2.f1089c = obtainStyledAttributes.getFloat(index, mVar2.f1089c);
                    continue;
                case 46:
                    m mVar3 = iVar.f1068e;
                    mVar3.f1090d = obtainStyledAttributes.getFloat(index, mVar3.f1090d);
                    continue;
                case 47:
                    m mVar4 = iVar.f1068e;
                    mVar4.f1091e = obtainStyledAttributes.getFloat(index, mVar4.f1091e);
                    continue;
                case 48:
                    m mVar5 = iVar.f1068e;
                    mVar5.f1092f = obtainStyledAttributes.getFloat(index, mVar5.f1092f);
                    continue;
                case 49:
                    m mVar6 = iVar.f1068e;
                    mVar6.g = obtainStyledAttributes.getDimension(index, mVar6.g);
                    continue;
                case 50:
                    m mVar7 = iVar.f1068e;
                    mVar7.h = obtainStyledAttributes.getDimension(index, mVar7.h);
                    continue;
                case 51:
                    m mVar8 = iVar.f1068e;
                    mVar8.i = obtainStyledAttributes.getDimension(index, mVar8.i);
                    continue;
                case 52:
                    m mVar9 = iVar.f1068e;
                    mVar9.j = obtainStyledAttributes.getDimension(index, mVar9.j);
                    continue;
                case 53:
                    m mVar10 = iVar.f1068e;
                    mVar10.k = obtainStyledAttributes.getDimension(index, mVar10.k);
                    continue;
                case 54:
                    j jVar40 = iVar.f1067d;
                    jVar40.T = obtainStyledAttributes.getInt(index, jVar40.T);
                    continue;
                case 55:
                    j jVar41 = iVar.f1067d;
                    jVar41.U = obtainStyledAttributes.getInt(index, jVar41.U);
                    continue;
                case 56:
                    j jVar42 = iVar.f1067d;
                    jVar42.V = obtainStyledAttributes.getDimensionPixelSize(index, jVar42.V);
                    continue;
                case 57:
                    j jVar43 = iVar.f1067d;
                    jVar43.W = obtainStyledAttributes.getDimensionPixelSize(index, jVar43.W);
                    continue;
                case 58:
                    j jVar44 = iVar.f1067d;
                    jVar44.X = obtainStyledAttributes.getDimensionPixelSize(index, jVar44.X);
                    continue;
                case 59:
                    j jVar45 = iVar.f1067d;
                    jVar45.Y = obtainStyledAttributes.getDimensionPixelSize(index, jVar45.Y);
                    continue;
                case 60:
                    m mVar11 = iVar.f1068e;
                    mVar11.f1088b = obtainStyledAttributes.getFloat(index, mVar11.f1088b);
                    continue;
                case 61:
                    j jVar46 = iVar.f1067d;
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, jVar46.x);
                    if (resourceId14 == -1) {
                        resourceId14 = obtainStyledAttributes.getInt(index, -1);
                    }
                    jVar46.x = resourceId14;
                    continue;
                case 62:
                    j jVar47 = iVar.f1067d;
                    jVar47.y = obtainStyledAttributes.getDimensionPixelSize(index, jVar47.y);
                    continue;
                case 63:
                    j jVar48 = iVar.f1067d;
                    jVar48.z = obtainStyledAttributes.getFloat(index, jVar48.z);
                    continue;
                case 64:
                    k kVar2 = iVar.f1066c;
                    int resourceId15 = obtainStyledAttributes.getResourceId(index, kVar2.f1077b);
                    if (resourceId15 == -1) {
                        resourceId15 = obtainStyledAttributes.getInt(index, -1);
                    }
                    kVar2.f1077b = resourceId15;
                    continue;
                case 65:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        kVar = iVar.f1066c;
                        str = obtainStyledAttributes.getString(index);
                    } else {
                        kVar = iVar.f1066c;
                        str = b.f.a.a.a.f921a[obtainStyledAttributes.getInteger(index, 0)];
                    }
                    kVar.f1078c = str;
                    continue;
                case 66:
                    iVar.f1066c.f1080e = obtainStyledAttributes.getInt(index, 0);
                    continue;
                case 67:
                    k kVar3 = iVar.f1066c;
                    kVar3.g = obtainStyledAttributes.getFloat(index, kVar3.g);
                    continue;
                case 68:
                    l lVar4 = iVar.f1065b;
                    lVar4.f1086e = obtainStyledAttributes.getFloat(index, lVar4.f1086e);
                    continue;
                case 69:
                    iVar.f1067d.Z = obtainStyledAttributes.getFloat(index, 1.0f);
                    continue;
                case 70:
                    iVar.f1067d.a0 = obtainStyledAttributes.getFloat(index, 1.0f);
                    continue;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    continue;
                case 72:
                    j jVar49 = iVar.f1067d;
                    jVar49.b0 = obtainStyledAttributes.getInt(index, jVar49.b0);
                    continue;
                case 73:
                    j jVar50 = iVar.f1067d;
                    jVar50.c0 = obtainStyledAttributes.getDimensionPixelSize(index, jVar50.c0);
                    continue;
                case 74:
                    iVar.f1067d.f0 = obtainStyledAttributes.getString(index);
                    continue;
                case 75:
                    j jVar51 = iVar.f1067d;
                    jVar51.j0 = obtainStyledAttributes.getBoolean(index, jVar51.j0);
                    continue;
                case 76:
                    k kVar4 = iVar.f1066c;
                    kVar4.f1079d = obtainStyledAttributes.getInt(index, kVar4.f1079d);
                    continue;
                case 77:
                    iVar.f1067d.g0 = obtainStyledAttributes.getString(index);
                    continue;
                case 78:
                    l lVar5 = iVar.f1065b;
                    lVar5.f1084c = obtainStyledAttributes.getInt(index, lVar5.f1084c);
                    continue;
                case 79:
                    k kVar5 = iVar.f1066c;
                    kVar5.f1081f = obtainStyledAttributes.getFloat(index, kVar5.f1081f);
                    continue;
                case 80:
                    j jVar52 = iVar.f1067d;
                    jVar52.h0 = obtainStyledAttributes.getBoolean(index, jVar52.h0);
                    continue;
                case 81:
                    j jVar53 = iVar.f1067d;
                    jVar53.i0 = obtainStyledAttributes.getBoolean(index, jVar53.i0);
                    continue;
                case 82:
                    sb = new StringBuilder();
                    str2 = "unused attribute 0x";
                    break;
                default:
                    sb = new StringBuilder();
                    str2 = "Unknown attribute 0x";
                    break;
            }
            sb.append(str2);
            sb.append(Integer.toHexString(index));
            sb.append("   ");
            sb.append(f1094e.get(index));
            Log.w("ConstraintSet", sb.toString());
        }
        obtainStyledAttributes.recycle();
        return iVar;
    }

    public void d(Context context, int i) {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    i c2 = c(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        c2.f1067d.f1070a = true;
                    }
                    this.f1097c.put(Integer.valueOf(c2.f1064a), c2);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
    }
}
