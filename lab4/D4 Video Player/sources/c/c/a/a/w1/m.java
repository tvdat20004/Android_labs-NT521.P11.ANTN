package c.c.a.a.w1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.c.a.a.l0;
import c.c.a.a.w1.r;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public class m extends o {

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f3421f = new int[0];

    /* renamed from: d, reason: collision with root package name */
    public final r.a f3422d;

    /* renamed from: e, reason: collision with root package name */
    public final AtomicReference<k> f3423e = new AtomicReference<>(k.B);

    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new l();

        /* renamed from: b, reason: collision with root package name */
        public final int f3424b;

        /* renamed from: c, reason: collision with root package name */
        public final int[] f3425c;

        /* renamed from: d, reason: collision with root package name */
        public final int f3426d;

        /* renamed from: e, reason: collision with root package name */
        public final int f3427e;

        /* renamed from: f, reason: collision with root package name */
        public final int f3428f;

        public a(int i, int... iArr) {
            this.f3424b = i;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            this.f3425c = copyOf;
            this.f3426d = iArr.length;
            this.f3427e = 2;
            this.f3428f = 0;
            Arrays.sort(copyOf);
        }

        public a(Parcel parcel) {
            this.f3424b = parcel.readInt();
            int readByte = parcel.readByte();
            this.f3426d = readByte;
            int[] iArr = new int[readByte];
            this.f3425c = iArr;
            parcel.readIntArray(iArr);
            this.f3427e = parcel.readInt();
            this.f3428f = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3424b == aVar.f3424b && Arrays.equals(this.f3425c, aVar.f3425c) && this.f3427e == aVar.f3427e && this.f3428f == aVar.f3428f;
        }

        public int hashCode() {
            return ((((Arrays.hashCode(this.f3425c) + (this.f3424b * 31)) * 31) + this.f3427e) * 31) + this.f3428f;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f3424b);
            parcel.writeInt(this.f3425c.length);
            parcel.writeIntArray(this.f3425c);
            parcel.writeInt(this.f3427e);
            parcel.writeInt(this.f3428f);
        }
    }

    public m(r.a aVar) {
        this.f3422d = aVar;
    }

    public static int a(int i, int i2) {
        if (i > i2) {
            return 1;
        }
        return i2 > i ? -1 : 0;
    }

    public static int b(int i, int i2) {
        if (i == -1) {
            return i2 == -1 ? 0 : -1;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    public static int c(l0 l0Var, String str) {
        String str2 = l0Var.B;
        if (str2 == null || str == null) {
            return 0;
        }
        if (TextUtils.equals(str2, str)) {
            return 3;
        }
        if (l0Var.B.startsWith(str) || str.startsWith(l0Var.B)) {
            return 2;
        }
        return c.c.a.a.z1.l0.F(l0Var.B, "-")[0].equals(str.split("-", 2)[0]) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List<java.lang.Integer> d(c.c.a.a.u1.q0 r12, int r13, int r14, boolean r15) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r12.f2918b
            r0.<init>(r1)
            r1 = 0
            r2 = r1
        L9:
            int r3 = r12.f2918b
            if (r2 >= r3) goto L17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r0.add(r3)
            int r2 = r2 + 1
            goto L9
        L17:
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r2) goto La2
            if (r14 != r2) goto L20
            goto La2
        L20:
            r3 = r1
            r4 = r2
        L22:
            int r5 = r12.f2918b
            r6 = 1
            if (r3 >= r5) goto L7c
            c.c.a.a.l0[] r5 = r12.f2919c
            r5 = r5[r3]
            int r7 = r5.o
            if (r7 <= 0) goto L79
            int r8 = r5.p
            if (r8 <= 0) goto L79
            if (r15 == 0) goto L43
            if (r7 <= r8) goto L39
            r9 = r6
            goto L3a
        L39:
            r9 = r1
        L3a:
            if (r13 <= r14) goto L3d
            goto L3e
        L3d:
            r6 = r1
        L3e:
            if (r9 == r6) goto L43
            r6 = r13
            r9 = r14
            goto L45
        L43:
            r9 = r13
            r6 = r14
        L45:
            int r10 = r7 * r6
            int r11 = r8 * r9
            if (r10 < r11) goto L55
            android.graphics.Point r6 = new android.graphics.Point
            int r7 = c.c.a.a.z1.l0.d(r11, r7)
            r6.<init>(r9, r7)
            goto L5f
        L55:
            android.graphics.Point r7 = new android.graphics.Point
            int r8 = c.c.a.a.z1.l0.d(r10, r8)
            r7.<init>(r8, r6)
            r6 = r7
        L5f:
            int r7 = r5.o
            int r5 = r5.p
            int r8 = r7 * r5
            int r9 = r6.x
            float r9 = (float) r9
            r10 = 1065017672(0x3f7ae148, float:0.98)
            float r9 = r9 * r10
            int r9 = (int) r9
            if (r7 < r9) goto L79
            int r6 = r6.y
            float r6 = (float) r6
            float r6 = r6 * r10
            int r6 = (int) r6
            if (r5 < r6) goto L79
            if (r8 >= r4) goto L79
            r4 = r8
        L79:
            int r3 = r3 + 1
            goto L22
        L7c:
            if (r4 == r2) goto La2
            int r13 = r0.size()
            int r13 = r13 - r6
        L83:
            if (r13 < 0) goto La2
            java.lang.Object r14 = r0.get(r13)
            java.lang.Integer r14 = (java.lang.Integer) r14
            int r14 = r14.intValue()
            c.c.a.a.l0[] r15 = r12.f2919c
            r14 = r15[r14]
            int r14 = r14.D()
            r15 = -1
            if (r14 == r15) goto L9c
            if (r14 <= r4) goto L9f
        L9c:
            r0.remove(r13)
        L9f:
            int r13 = r13 + (-1)
            goto L83
        La2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.a.w1.m.d(c.c.a.a.u1.q0, int, int, boolean):java.util.List");
    }

    public static boolean e(int i, boolean z) {
        int i2 = i & 7;
        return i2 == 4 || (z && i2 == 3);
    }

    public static boolean f(l0 l0Var, int i, h hVar, int i2, boolean z, boolean z2) {
        int i3;
        int i4;
        String str;
        if (!e(i, false)) {
            return false;
        }
        int i5 = l0Var.f2041f;
        if ((i5 != -1 && i5 > i2) || (i3 = l0Var.w) == -1 || i3 != hVar.f3413a) {
            return false;
        }
        if (z || ((str = l0Var.j) != null && TextUtils.equals(str, hVar.f3415c))) {
            return z2 || ((i4 = l0Var.x) != -1 && i4 == hVar.f3414b);
        }
        return false;
    }

    public static boolean g(l0 l0Var, String str, int i, int i2, int i3, int i4, int i5, int i6) {
        if (!e(i, false) || (i & i2) == 0) {
            return false;
        }
        if (str != null && !c.c.a.a.z1.l0.a(l0Var.j, str)) {
            return false;
        }
        int i7 = l0Var.o;
        if (i7 != -1 && i7 > i3) {
            return false;
        }
        int i8 = l0Var.p;
        if (i8 != -1 && i8 > i4) {
            return false;
        }
        float f2 = l0Var.q;
        if (f2 != -1.0f && f2 > i5) {
            return false;
        }
        int i9 = l0Var.f2041f;
        return i9 == -1 || i9 <= i6;
    }

    public static boolean h(String str) {
        return TextUtils.isEmpty(str) || TextUtils.equals(str, "und");
    }
}
