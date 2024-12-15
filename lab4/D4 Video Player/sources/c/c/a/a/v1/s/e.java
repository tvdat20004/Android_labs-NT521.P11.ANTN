package c.c.a.a.v1.s;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.AlignmentSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f3344a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3345b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f3346c;

    /* renamed from: d, reason: collision with root package name */
    public final long f3347d;

    /* renamed from: e, reason: collision with root package name */
    public final long f3348e;

    /* renamed from: f, reason: collision with root package name */
    public final g f3349f;
    public final String[] g;
    public final String h;
    public final String i;
    public final HashMap<String, Integer> j;
    public final HashMap<String, Integer> k;
    public List<e> l;

    public e(String str, String str2, long j, long j2, g gVar, String[] strArr, String str3, String str4) {
        this.f3344a = str;
        this.f3345b = str2;
        this.i = str4;
        this.f3349f = gVar;
        this.g = strArr;
        this.f3346c = str2 != null;
        this.f3347d = j;
        this.f3348e = j2;
        Objects.requireNonNull(str3);
        this.h = str3;
        this.j = new HashMap<>();
        this.k = new HashMap<>();
    }

    public static e b(String str) {
        return new e(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null);
    }

    public static SpannableStringBuilder f(String str, Map<String, SpannableStringBuilder> map) {
        if (!map.containsKey(str)) {
            map.put(str, new SpannableStringBuilder());
        }
        return map.get(str);
    }

    public void a(e eVar) {
        if (this.l == null) {
            this.l = new ArrayList();
        }
        this.l.add(eVar);
    }

    public e c(int i) {
        List<e> list = this.l;
        if (list != null) {
            return list.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public int d() {
        List<e> list = this.l;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public final void e(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f3344a);
        boolean equals2 = "div".equals(this.f3344a);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.f3347d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.f3348e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.l == null) {
            return;
        }
        for (int i = 0; i < this.l.size(); i++) {
            this.l.get(i).e(treeSet, z || equals);
        }
    }

    public boolean g(long j) {
        long j2 = this.f3347d;
        return (j2 == -9223372036854775807L && this.f3348e == -9223372036854775807L) || (j2 <= j && this.f3348e == -9223372036854775807L) || ((j2 == -9223372036854775807L && j < this.f3348e) || (j2 <= j && j < this.f3348e));
    }

    public final void h(long j, String str, List<Pair<String, String>> list) {
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (g(j) && "div".equals(this.f3344a) && this.i != null) {
            list.add(new Pair<>(str, this.i));
            return;
        }
        for (int i = 0; i < d(); i++) {
            c(i).h(j, str, list);
        }
    }

    public final void i(long j, Map<String, g> map, Map<String, SpannableStringBuilder> map2) {
        Object absoluteSizeSpan;
        if (!g(j)) {
            return;
        }
        Iterator<Map.Entry<String, Integer>> it = this.k.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                while (r2 < d()) {
                    c(r2).i(j, map, map2);
                    r2++;
                }
                return;
            }
            Map.Entry<String, Integer> next = it.next();
            String key = next.getKey();
            int intValue = this.j.containsKey(key) ? this.j.get(key).intValue() : 0;
            int intValue2 = next.getValue().intValue();
            if (intValue != intValue2) {
                SpannableStringBuilder spannableStringBuilder = map2.get(key);
                g gVar = this.f3349f;
                String[] strArr = this.g;
                if (gVar == null && strArr == null) {
                    gVar = null;
                } else if (gVar == null && strArr.length == 1) {
                    gVar = map.get(strArr[0]);
                } else if (gVar == null && strArr.length > 1) {
                    gVar = new g();
                    for (String str : strArr) {
                        gVar.a(map.get(str));
                    }
                } else if (gVar != null && strArr != null && strArr.length == 1) {
                    gVar.a(map.get(strArr[0]));
                } else if (gVar != null && strArr != null && strArr.length > 1) {
                    for (String str2 : strArr) {
                        gVar.a(map.get(str2));
                    }
                }
                if (gVar == null) {
                    continue;
                } else {
                    if (gVar.b() != -1) {
                        spannableStringBuilder.setSpan(new StyleSpan(gVar.b()), intValue, intValue2, 33);
                    }
                    if (gVar.f3361f == 1) {
                        spannableStringBuilder.setSpan(new StrikethroughSpan(), intValue, intValue2, 33);
                    }
                    if ((gVar.g == 1 ? 1 : 0) != 0) {
                        spannableStringBuilder.setSpan(new UnderlineSpan(), intValue, intValue2, 33);
                    }
                    if (gVar.f3358c) {
                        if (!gVar.f3358c) {
                            throw new IllegalStateException("Font color has not been defined.");
                        }
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(gVar.f3357b), intValue, intValue2, 33);
                    }
                    if (gVar.f3360e) {
                        if (!gVar.f3360e) {
                            throw new IllegalStateException("Background color has not been defined.");
                        }
                        spannableStringBuilder.setSpan(new BackgroundColorSpan(gVar.f3359d), intValue, intValue2, 33);
                    }
                    if (gVar.f3356a != null) {
                        spannableStringBuilder.setSpan(new TypefaceSpan(gVar.f3356a), intValue, intValue2, 33);
                    }
                    if (gVar.m != null) {
                        spannableStringBuilder.setSpan(new AlignmentSpan.Standard(gVar.m), intValue, intValue2, 33);
                    }
                    int i = gVar.j;
                    if (i == 1) {
                        absoluteSizeSpan = new AbsoluteSizeSpan((int) gVar.k, true);
                    } else if (i == 2) {
                        absoluteSizeSpan = new RelativeSizeSpan(gVar.k);
                    } else if (i == 3) {
                        absoluteSizeSpan = new RelativeSizeSpan(gVar.k / 100.0f);
                    }
                    spannableStringBuilder.setSpan(absoluteSizeSpan, intValue, intValue2, 33);
                }
            }
        }
    }

    public final void j(long j, boolean z, String str, Map<String, SpannableStringBuilder> map) {
        this.j.clear();
        this.k.clear();
        if ("metadata".equals(this.f3344a)) {
            return;
        }
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (this.f3346c && z) {
            f(str, map).append((CharSequence) this.f3345b);
            return;
        }
        if ("br".equals(this.f3344a) && z) {
            f(str, map).append('\n');
            return;
        }
        if (g(j)) {
            for (Map.Entry<String, SpannableStringBuilder> entry : map.entrySet()) {
                this.j.put(entry.getKey(), Integer.valueOf(entry.getValue().length()));
            }
            boolean equals = "p".equals(this.f3344a);
            for (int i = 0; i < d(); i++) {
                c(i).j(j, z || equals, str, map);
            }
            if (equals) {
                SpannableStringBuilder f2 = f(str, map);
                int length = f2.length();
                do {
                    length--;
                    if (length < 0) {
                        break;
                    }
                } while (f2.charAt(length) == ' ');
                if (length >= 0 && f2.charAt(length) != '\n') {
                    f2.append('\n');
                }
            }
            for (Map.Entry<String, SpannableStringBuilder> entry2 : map.entrySet()) {
                this.k.put(entry2.getKey(), Integer.valueOf(entry2.getValue().length()));
            }
        }
    }
}
