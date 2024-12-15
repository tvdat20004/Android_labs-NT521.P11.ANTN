package c.c.a.a.v1.s;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import c.c.a.a.z1.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class h implements c.c.a.a.v1.e {

    /* renamed from: b, reason: collision with root package name */
    public final e f3362b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f3363c;

    /* renamed from: d, reason: collision with root package name */
    public final Map<String, g> f3364d;

    /* renamed from: e, reason: collision with root package name */
    public final Map<String, f> f3365e;

    /* renamed from: f, reason: collision with root package name */
    public final Map<String, String> f3366f;

    public h(e eVar, Map<String, g> map, Map<String, f> map2, Map<String, String> map3) {
        this.f3362b = eVar;
        this.f3365e = map2;
        this.f3366f = map3;
        this.f3364d = Collections.unmodifiableMap(map);
        Objects.requireNonNull(eVar);
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        eVar.e(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        this.f3363c = jArr;
    }

    @Override // c.c.a.a.v1.e
    public int a(long j) {
        int b2 = l0.b(this.f3363c, j, false, false);
        if (b2 < this.f3363c.length) {
            return b2;
        }
        return -1;
    }

    @Override // c.c.a.a.v1.e
    public List<c.c.a.a.v1.b> b(long j) {
        int i;
        int i2;
        int i3;
        e eVar = this.f3362b;
        Map<String, g> map = this.f3364d;
        Map<String, f> map2 = this.f3365e;
        Map<String, String> map3 = this.f3366f;
        Objects.requireNonNull(eVar);
        ArrayList arrayList = new ArrayList();
        eVar.h(j, eVar.h, arrayList);
        TreeMap treeMap = new TreeMap();
        eVar.j(j, false, eVar.h, treeMap);
        eVar.i(j, map, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                f fVar = map2.get(pair.first);
                arrayList2.add(new c.c.a.a.v1.b(decodeByteArray, fVar.f3351b, 0, fVar.f3352c, fVar.f3354e, fVar.f3355f, fVar.g));
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            f fVar2 = map2.get(entry.getKey());
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) entry.getValue();
            int length = spannableStringBuilder.length();
            for (int i4 = 0; i4 < length; i4++) {
                if (spannableStringBuilder.charAt(i4) == ' ') {
                    int i5 = i4 + 1;
                    int i6 = i5;
                    while (i6 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i6) == ' ') {
                        i6++;
                    }
                    int i7 = i6 - i5;
                    if (i7 > 0) {
                        spannableStringBuilder.delete(i4, i4 + i7);
                        length -= i7;
                    }
                }
            }
            if (length > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
                length--;
            }
            int i8 = 0;
            while (true) {
                i = length - 1;
                if (i8 >= i) {
                    break;
                }
                if (spannableStringBuilder.charAt(i8) == '\n') {
                    int i9 = i8 + 1;
                    if (spannableStringBuilder.charAt(i9) == ' ') {
                        spannableStringBuilder.delete(i9, i8 + 2);
                        length = i;
                    }
                }
                i8++;
            }
            if (length <= 0 || spannableStringBuilder.charAt(i) != ' ') {
                i2 = 0;
            } else {
                spannableStringBuilder.delete(i, length);
                i2 = 0;
                length = i;
            }
            while (true) {
                i3 = length - 1;
                if (i2 >= i3) {
                    break;
                }
                if (spannableStringBuilder.charAt(i2) == ' ') {
                    int i10 = i2 + 1;
                    if (spannableStringBuilder.charAt(i10) == '\n') {
                        spannableStringBuilder.delete(i2, i10);
                        length = i3;
                    }
                }
                i2++;
            }
            if (length > 0 && spannableStringBuilder.charAt(i3) == '\n') {
                spannableStringBuilder.delete(i3, length);
            }
            arrayList2.add(new c.c.a.a.v1.b(spannableStringBuilder, null, null, fVar2.f3352c, fVar2.f3353d, fVar2.f3354e, fVar2.f3351b, Integer.MIN_VALUE, fVar2.h, fVar2.i, fVar2.f3355f, Float.MIN_VALUE, false, -16777216));
        }
        return arrayList2;
    }

    @Override // c.c.a.a.v1.e
    public long c(int i) {
        return this.f3363c[i];
    }

    @Override // c.c.a.a.v1.e
    public int d() {
        return this.f3363c.length;
    }
}
