package c.c.a.a.v1.u;

import android.text.SpannableStringBuilder;
import c.c.a.a.x1.p;
import c.c.a.a.z1.l0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class m implements c.c.a.a.v1.e {

    /* renamed from: b, reason: collision with root package name */
    public final List<g> f3397b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3398c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f3399d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f3400e;

    public m(List<g> list) {
        this.f3397b = list;
        int size = list.size();
        this.f3398c = size;
        this.f3399d = new long[size * 2];
        for (int i = 0; i < this.f3398c; i++) {
            g gVar = list.get(i);
            int i2 = i * 2;
            long[] jArr = this.f3399d;
            jArr[i2] = gVar.q;
            jArr[i2 + 1] = gVar.r;
        }
        long[] jArr2 = this.f3399d;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f3400e = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // c.c.a.a.v1.e
    public int a(long j) {
        int b2 = l0.b(this.f3400e, j, false, false);
        if (b2 < this.f3400e.length) {
            return b2;
        }
        return -1;
    }

    @Override // c.c.a.a.v1.e
    public List<c.c.a.a.v1.b> b(long j) {
        ArrayList arrayList;
        g gVar = null;
        SpannableStringBuilder spannableStringBuilder = null;
        ArrayList arrayList2 = null;
        for (int i = 0; i < this.f3398c; i++) {
            long[] jArr = this.f3399d;
            int i2 = i * 2;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                g gVar2 = this.f3397b.get(i);
                if (!(gVar2.f3253e == Float.MIN_VALUE && gVar2.h == Float.MIN_VALUE)) {
                    arrayList2.add(gVar2);
                } else if (gVar == null) {
                    gVar = gVar2;
                } else if (spannableStringBuilder == null) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append(gVar.f3250b).append((CharSequence) "\n").append(gVar2.f3250b);
                    spannableStringBuilder = spannableStringBuilder2;
                } else {
                    spannableStringBuilder.append((CharSequence) "\n").append(gVar2.f3250b);
                }
            }
        }
        if (spannableStringBuilder != null) {
            arrayList = arrayList2;
            arrayList.add(new g(0L, 0L, spannableStringBuilder, null, Float.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE, Integer.MIN_VALUE, Float.MIN_VALUE));
        } else {
            arrayList = arrayList2;
            if (gVar != null) {
                arrayList.add(gVar);
            }
        }
        return arrayList != null ? arrayList : Collections.emptyList();
    }

    @Override // c.c.a.a.v1.e
    public long c(int i) {
        p.c(i >= 0);
        p.c(i < this.f3400e.length);
        return this.f3400e[i];
    }

    @Override // c.c.a.a.v1.e
    public int d() {
        return this.f3400e.length;
    }
}
