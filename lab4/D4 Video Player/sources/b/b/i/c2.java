package b.b.i;

/* loaded from: classes.dex */
public class c2 {

    /* renamed from: a, reason: collision with root package name */
    public int f661a = 0;

    /* renamed from: b, reason: collision with root package name */
    public int f662b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f663c = Integer.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    public int f664d = Integer.MIN_VALUE;

    /* renamed from: e, reason: collision with root package name */
    public int f665e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f666f = 0;
    public boolean g = false;
    public boolean h = false;

    public void a(int i, int i2) {
        this.f663c = i;
        this.f664d = i2;
        this.h = true;
        if (this.g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f661a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f662b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f661a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f662b = i2;
        }
    }
}
