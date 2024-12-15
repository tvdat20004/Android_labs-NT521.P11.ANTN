package b.f.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public class k {
    public static SparseIntArray h;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1076a = false;

    /* renamed from: b, reason: collision with root package name */
    public int f1077b = -1;

    /* renamed from: c, reason: collision with root package name */
    public String f1078c = null;

    /* renamed from: d, reason: collision with root package name */
    public int f1079d = -1;

    /* renamed from: e, reason: collision with root package name */
    public int f1080e = 0;

    /* renamed from: f, reason: collision with root package name */
    public float f1081f = Float.NaN;
    public float g = Float.NaN;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        h = sparseIntArray;
        sparseIntArray.append(2, 1);
        h.append(4, 2);
        h.append(5, 3);
        h.append(1, 4);
        h.append(0, 5);
        h.append(3, 6);
    }

    public void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.f1102e);
        this.f1076a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (h.get(index)) {
                case 1:
                    this.g = obtainStyledAttributes.getFloat(index, this.g);
                    break;
                case 2:
                    this.f1079d = obtainStyledAttributes.getInt(index, this.f1079d);
                    break;
                case 3:
                    this.f1078c = obtainStyledAttributes.peekValue(index).type == 3 ? obtainStyledAttributes.getString(index) : b.f.a.a.a.f921a[obtainStyledAttributes.getInteger(index, 0)];
                    break;
                case 4:
                    this.f1080e = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    int i2 = this.f1077b;
                    int[] iArr = n.f1093d;
                    int resourceId = obtainStyledAttributes.getResourceId(index, i2);
                    if (resourceId == -1) {
                        resourceId = obtainStyledAttributes.getInt(index, -1);
                    }
                    this.f1077b = resourceId;
                    break;
                case 6:
                    this.f1081f = obtainStyledAttributes.getFloat(index, this.f1081f);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
