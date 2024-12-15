package b.h.h;

import android.annotation.SuppressLint;
import android.os.Build;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f1235a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f1236b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1237c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1238d;

    public c(PrecomputedText.Params params) {
        this.f1235a = params.getTextPaint();
        this.f1236b = params.getTextDirection();
        this.f1237c = params.getBreakStrategy();
        this.f1238d = params.getHyphenationFrequency();
        int i = Build.VERSION.SDK_INT;
    }

    @SuppressLint({"NewApi"})
    public c(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            new PrecomputedText.Params.Builder(textPaint).setBreakStrategy(i).setHyphenationFrequency(i2).setTextDirection(textDirectionHeuristic).build();
        }
        this.f1235a = textPaint;
        this.f1236b = textDirectionHeuristic;
        this.f1237c = i;
        this.f1238d = i2;
    }

    public boolean a(c cVar) {
        int i = Build.VERSION.SDK_INT;
        if (this.f1237c != cVar.f1237c || this.f1238d != cVar.f1238d || this.f1235a.getTextSize() != cVar.f1235a.getTextSize() || this.f1235a.getTextScaleX() != cVar.f1235a.getTextScaleX() || this.f1235a.getTextSkewX() != cVar.f1235a.getTextSkewX() || this.f1235a.getLetterSpacing() != cVar.f1235a.getLetterSpacing() || !TextUtils.equals(this.f1235a.getFontFeatureSettings(), cVar.f1235a.getFontFeatureSettings()) || this.f1235a.getFlags() != cVar.f1235a.getFlags()) {
            return false;
        }
        if (i >= 24) {
            if (!this.f1235a.getTextLocales().equals(cVar.f1235a.getTextLocales())) {
                return false;
            }
        } else if (!this.f1235a.getTextLocale().equals(cVar.f1235a.getTextLocale())) {
            return false;
        }
        return this.f1235a.getTypeface() == null ? cVar.f1235a.getTypeface() == null : this.f1235a.getTypeface().equals(cVar.f1235a.getTypeface());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return a(cVar) && this.f1236b == cVar.f1236b;
    }

    public int hashCode() {
        return Build.VERSION.SDK_INT >= 24 ? Objects.hash(Float.valueOf(this.f1235a.getTextSize()), Float.valueOf(this.f1235a.getTextScaleX()), Float.valueOf(this.f1235a.getTextSkewX()), Float.valueOf(this.f1235a.getLetterSpacing()), Integer.valueOf(this.f1235a.getFlags()), this.f1235a.getTextLocales(), this.f1235a.getTypeface(), Boolean.valueOf(this.f1235a.isElegantTextHeight()), this.f1236b, Integer.valueOf(this.f1237c), Integer.valueOf(this.f1238d)) : Objects.hash(Float.valueOf(this.f1235a.getTextSize()), Float.valueOf(this.f1235a.getTextScaleX()), Float.valueOf(this.f1235a.getTextSkewX()), Float.valueOf(this.f1235a.getLetterSpacing()), Integer.valueOf(this.f1235a.getFlags()), this.f1235a.getTextLocale(), this.f1235a.getTypeface(), Boolean.valueOf(this.f1235a.isElegantTextHeight()), this.f1236b, Integer.valueOf(this.f1237c), Integer.valueOf(this.f1238d));
    }

    public String toString() {
        StringBuilder j;
        Object textLocale;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder j2 = c.a.a.a.a.j("textSize=");
        j2.append(this.f1235a.getTextSize());
        sb.append(j2.toString());
        sb.append(", textScaleX=" + this.f1235a.getTextScaleX());
        sb.append(", textSkewX=" + this.f1235a.getTextSkewX());
        int i = Build.VERSION.SDK_INT;
        StringBuilder j3 = c.a.a.a.a.j(", letterSpacing=");
        j3.append(this.f1235a.getLetterSpacing());
        sb.append(j3.toString());
        sb.append(", elegantTextHeight=" + this.f1235a.isElegantTextHeight());
        if (i >= 24) {
            j = c.a.a.a.a.j(", textLocale=");
            textLocale = this.f1235a.getTextLocales();
        } else {
            j = c.a.a.a.a.j(", textLocale=");
            textLocale = this.f1235a.getTextLocale();
        }
        j.append(textLocale);
        sb.append(j.toString());
        StringBuilder j4 = c.a.a.a.a.j(", typeface=");
        j4.append(this.f1235a.getTypeface());
        sb.append(j4.toString());
        if (i >= 26) {
            StringBuilder j5 = c.a.a.a.a.j(", variationSettings=");
            j5.append(this.f1235a.getFontVariationSettings());
            sb.append(j5.toString());
        }
        StringBuilder j6 = c.a.a.a.a.j(", textDir=");
        j6.append(this.f1236b);
        sb.append(j6.toString());
        sb.append(", breakStrategy=" + this.f1237c);
        sb.append(", hyphenationFrequency=" + this.f1238d);
        sb.append("}");
        return sb.toString();
    }
}
