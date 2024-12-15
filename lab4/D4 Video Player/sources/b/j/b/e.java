package b.j.b;

import android.graphics.Rect;
import java.util.Comparator;

/* loaded from: classes.dex */
public class e<T> implements Comparator<T> {

    /* renamed from: b, reason: collision with root package name */
    public final Rect f1354b = new Rect();

    /* renamed from: c, reason: collision with root package name */
    public final Rect f1355c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f1356d;

    /* renamed from: e, reason: collision with root package name */
    public final a<T> f1357e;

    public e(boolean z, a<T> aVar) {
        this.f1356d = z;
        this.f1357e = aVar;
    }

    @Override // java.util.Comparator
    public int compare(T t, T t2) {
        Rect rect = this.f1354b;
        Rect rect2 = this.f1355c;
        this.f1357e.a(t, rect);
        this.f1357e.a(t2, rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        if (i3 < i4) {
            return this.f1356d ? 1 : -1;
        }
        if (i3 > i4) {
            return this.f1356d ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return this.f1356d ? 1 : -1;
        }
        if (i7 > i8) {
            return this.f1356d ? -1 : 1;
        }
        return 0;
    }
}
