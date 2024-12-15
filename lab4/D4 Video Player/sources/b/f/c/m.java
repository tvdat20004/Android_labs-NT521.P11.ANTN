package b.f.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* loaded from: classes.dex */
public class m {
    public static SparseIntArray n;

    /* renamed from: a, reason: collision with root package name */
    public boolean f1087a = false;

    /* renamed from: b, reason: collision with root package name */
    public float f1088b = 0.0f;

    /* renamed from: c, reason: collision with root package name */
    public float f1089c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    public float f1090d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f1091e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f1092f = 1.0f;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = 0.0f;
    public float j = 0.0f;
    public float k = 0.0f;
    public boolean l = false;
    public float m = 0.0f;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        n = sparseIntArray;
        sparseIntArray.append(6, 1);
        n.append(7, 2);
        n.append(8, 3);
        n.append(4, 4);
        n.append(5, 5);
        n.append(0, 6);
        n.append(1, 7);
        n.append(2, 8);
        n.append(3, 9);
        n.append(9, 10);
        n.append(10, 11);
    }

    public void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r.h);
        this.f1087a = true;
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (n.get(index)) {
                case 1:
                    this.f1088b = obtainStyledAttributes.getFloat(index, this.f1088b);
                    break;
                case 2:
                    this.f1089c = obtainStyledAttributes.getFloat(index, this.f1089c);
                    break;
                case 3:
                    this.f1090d = obtainStyledAttributes.getFloat(index, this.f1090d);
                    break;
                case 4:
                    this.f1091e = obtainStyledAttributes.getFloat(index, this.f1091e);
                    break;
                case 5:
                    this.f1092f = obtainStyledAttributes.getFloat(index, this.f1092f);
                    break;
                case 6:
                    this.g = obtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 7:
                    this.h = obtainStyledAttributes.getDimension(index, this.h);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.j = obtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 10:
                    this.k = obtainStyledAttributes.getDimension(index, this.k);
                    break;
                case 11:
                    this.l = true;
                    this.m = obtainStyledAttributes.getDimension(index, this.m);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
