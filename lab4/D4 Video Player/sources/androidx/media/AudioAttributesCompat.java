package androidx.media;

import android.util.SparseIntArray;
import b.p.a;
import b.v.c;

/* loaded from: classes.dex */
public class AudioAttributesCompat implements c {

    /* renamed from: b, reason: collision with root package name */
    public static final SparseIntArray f244b;

    /* renamed from: a, reason: collision with root package name */
    public a f245a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f244b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        a aVar = this.f245a;
        a aVar2 = ((AudioAttributesCompat) obj).f245a;
        return aVar == null ? aVar2 == null : aVar.equals(aVar2);
    }

    public int hashCode() {
        return this.f245a.hashCode();
    }

    public String toString() {
        return this.f245a.toString();
    }
}
