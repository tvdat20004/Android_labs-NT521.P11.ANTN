package c.c.a.a.v1.n;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final List<a> f3262a = new ArrayList();

    /* renamed from: b, reason: collision with root package name */
    public final List<SpannableString> f3263b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f3264c = new StringBuilder();

    /* renamed from: d, reason: collision with root package name */
    public int f3265d;

    /* renamed from: e, reason: collision with root package name */
    public int f3266e;

    /* renamed from: f, reason: collision with root package name */
    public int f3267f;
    public int g;
    public int h;

    public b(int i, int i2) {
        e(i);
        this.h = i2;
    }

    public void a() {
        int length = this.f3264c.length();
        if (length > 0) {
            this.f3264c.delete(length - 1, length);
            for (int size = this.f3262a.size() - 1; size >= 0; size--) {
                a aVar = this.f3262a.get(size);
                int i = aVar.f3261c;
                if (i != length) {
                    return;
                }
                aVar.f3261c = i - 1;
            }
        }
    }

    public c.c.a.a.v1.b b(int i) {
        float f2;
        int i2;
        int i3;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        for (int i4 = 0; i4 < this.f3263b.size(); i4++) {
            spannableStringBuilder.append((CharSequence) this.f3263b.get(i4));
            spannableStringBuilder.append('\n');
        }
        spannableStringBuilder.append((CharSequence) c());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i5 = this.f3266e + this.f3267f;
        int length = (32 - i5) - spannableStringBuilder.length();
        int i6 = i5 - length;
        if (i == Integer.MIN_VALUE) {
            i = (this.g != 2 || (Math.abs(i6) >= 3 && length >= 0)) ? (this.g != 2 || i6 <= 0) ? 0 : 2 : 1;
        }
        if (i != 1) {
            if (i == 2) {
                i5 = 32 - length;
            }
            f2 = ((i5 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f2 = 0.5f;
        }
        float f3 = f2;
        if (this.g == 1 || (i2 = this.f3265d) > 7) {
            i2 = (this.f3265d - 15) - 2;
            i3 = 2;
        } else {
            i3 = 0;
        }
        return new c.c.a.a.v1.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, i2, 1, i3, f3, i, Float.MIN_VALUE);
    }

    public final SpannableString c() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f3264c);
        int length = spannableStringBuilder.length();
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = 0;
        int i6 = 0;
        boolean z = false;
        while (i5 < this.f3262a.size()) {
            a aVar = this.f3262a.get(i5);
            boolean z2 = aVar.f3260b;
            int i7 = aVar.f3259a;
            if (i7 != 8) {
                boolean z3 = i7 == 7;
                if (i7 != 7) {
                    i4 = c.y[i7];
                }
                z = z3;
            }
            int i8 = aVar.f3261c;
            i5++;
            if (i8 != (i5 < this.f3262a.size() ? this.f3262a.get(i5).f3261c : length)) {
                if (i != -1 && !z2) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i, i8, 33);
                    i = -1;
                } else if (i == -1 && z2) {
                    i = i8;
                }
                if (i2 != -1 && !z) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i2, i8, 33);
                    i2 = -1;
                } else if (i2 == -1 && z) {
                    i2 = i8;
                }
                if (i4 != i3) {
                    if (i3 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, i8, 33);
                    }
                    i6 = i8;
                    i3 = i4;
                }
            }
        }
        if (i != -1 && i != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, length, 33);
        }
        if (i2 != -1 && i2 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
        }
        if (i6 != length && i3 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i6, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public boolean d() {
        return this.f3262a.isEmpty() && this.f3263b.isEmpty() && this.f3264c.length() == 0;
    }

    public void e(int i) {
        this.g = i;
        this.f3262a.clear();
        this.f3263b.clear();
        this.f3264c.setLength(0);
        this.f3265d = 15;
        this.f3266e = 0;
        this.f3267f = 0;
    }
}
