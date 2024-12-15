package b.h.c.a;

import java.util.List;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1149a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f1150b;

    public f(int i, int i2) {
        this.f1149a = new int[]{i, i2};
        this.f1150b = new float[]{0.0f, 1.0f};
    }

    public f(int i, int i2, int i3) {
        this.f1149a = new int[]{i, i2, i3};
        this.f1150b = new float[]{0.0f, 0.5f, 1.0f};
    }

    public f(List<Integer> list, List<Float> list2) {
        int size = list.size();
        this.f1149a = new int[size];
        this.f1150b = new float[size];
        for (int i = 0; i < size; i++) {
            this.f1149a[i] = list.get(i).intValue();
            this.f1150b[i] = list2.get(i).floatValue();
        }
    }
}
