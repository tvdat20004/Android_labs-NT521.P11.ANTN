package b.f.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1082a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f1083b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f1084c = 0;

    /* renamed from: d, reason: collision with root package name */
    public float f1085d = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f1086e = Float.NaN;

    public void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1103f);
        this.f1082a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f1085d = obtainStyledAttributes.getFloat(index, this.f1085d);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f1083b);
                this.f1083b = i2;
                int[] iArr = n.f1093d;
                this.f1083b = n.f1093d[i2];
            } else if (index == 4) {
                this.f1084c = obtainStyledAttributes.getInt(index, this.f1084c);
            } else if (index == 3) {
                this.f1086e = obtainStyledAttributes.getFloat(index, this.f1086e);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
