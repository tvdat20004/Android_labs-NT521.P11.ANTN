package b.h.h;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    public static final byte[] f1224e = new byte[1792];

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f1225a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1226b;

    /* renamed from: c, reason: collision with root package name */
    public int f1227c;

    /* renamed from: d, reason: collision with root package name */
    public char f1228d;

    static {
        for (int i = 0; i < 1792; i++) {
            f1224e[i] = Character.getDirectionality(i);
        }
    }

    public a(CharSequence charSequence, boolean z) {
        this.f1225a = charSequence;
        this.f1226b = charSequence.length();
    }

    public byte a() {
        char charAt = this.f1225a.charAt(this.f1227c - 1);
        this.f1228d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(this.f1225a, this.f1227c);
            this.f1227c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f1227c--;
        char c2 = this.f1228d;
        return c2 < 1792 ? f1224e[c2] : Character.getDirectionality(c2);
    }
}
