package b.u.a.a;

import android.graphics.Matrix;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class m extends n {

    /* renamed from: a, reason: collision with root package name */
    public final Matrix f1826a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<n> f1827b;

    /* renamed from: c, reason: collision with root package name */
    public float f1828c;

    /* renamed from: d, reason: collision with root package name */
    public float f1829d;

    /* renamed from: e, reason: collision with root package name */
    public float f1830e;

    /* renamed from: f, reason: collision with root package name */
    public float f1831f;
    public float g;
    public float h;
    public float i;
    public final Matrix j;
    public int k;
    public int[] l;
    public String m;

    public m() {
        super(null);
        this.f1826a = new Matrix();
        this.f1827b = new ArrayList<>();
        this.f1828c = 0.0f;
        this.f1829d = 0.0f;
        this.f1830e = 0.0f;
        this.f1831f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = new Matrix();
        this.m = null;
    }

    public m(m mVar, b.e.b<String, Object> bVar) {
        super(null);
        o kVar;
        this.f1826a = new Matrix();
        this.f1827b = new ArrayList<>();
        this.f1828c = 0.0f;
        this.f1829d = 0.0f;
        this.f1830e = 0.0f;
        this.f1831f = 1.0f;
        this.g = 1.0f;
        this.h = 0.0f;
        this.i = 0.0f;
        Matrix matrix = new Matrix();
        this.j = matrix;
        this.m = null;
        this.f1828c = mVar.f1828c;
        this.f1829d = mVar.f1829d;
        this.f1830e = mVar.f1830e;
        this.f1831f = mVar.f1831f;
        this.g = mVar.g;
        this.h = mVar.h;
        this.i = mVar.i;
        this.l = mVar.l;
        String str = mVar.m;
        this.m = str;
        this.k = mVar.k;
        if (str != null) {
            bVar.put(str, this);
        }
        matrix.set(mVar.j);
        ArrayList<n> arrayList = mVar.f1827b;
        for (int i = 0; i < arrayList.size(); i++) {
            n nVar = arrayList.get(i);
            if (nVar instanceof m) {
                this.f1827b.add(new m((m) nVar, bVar));
            } else {
                if (nVar instanceof l) {
                    kVar = new l((l) nVar);
                } else {
                    if (!(nVar instanceof k)) {
                        throw new IllegalStateException("Unknown object in the tree!");
                    }
                    kVar = new k((k) nVar);
                }
                this.f1827b.add(kVar);
                String str2 = kVar.f1833b;
                if (str2 != null) {
                    bVar.put(str2, kVar);
                }
            }
        }
    }

    @Override // b.u.a.a.n
    public boolean a() {
        for (int i = 0; i < this.f1827b.size(); i++) {
            if (this.f1827b.get(i).a()) {
                return true;
            }
        }
        return false;
    }

    @Override // b.u.a.a.n
    public boolean b(int[] iArr) {
        boolean z = false;
        for (int i = 0; i < this.f1827b.size(); i++) {
            z |= this.f1827b.get(i).b(iArr);
        }
        return z;
    }

    public final void c() {
        this.j.reset();
        this.j.postTranslate(-this.f1829d, -this.f1830e);
        this.j.postScale(this.f1831f, this.g);
        this.j.postRotate(this.f1828c, 0.0f, 0.0f);
        this.j.postTranslate(this.h + this.f1829d, this.i + this.f1830e);
    }

    public String getGroupName() {
        return this.m;
    }

    public Matrix getLocalMatrix() {
        return this.j;
    }

    public float getPivotX() {
        return this.f1829d;
    }

    public float getPivotY() {
        return this.f1830e;
    }

    public float getRotation() {
        return this.f1828c;
    }

    public float getScaleX() {
        return this.f1831f;
    }

    public float getScaleY() {
        return this.g;
    }

    public float getTranslateX() {
        return this.h;
    }

    public float getTranslateY() {
        return this.i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.f1829d) {
            this.f1829d = f2;
            c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.f1830e) {
            this.f1830e = f2;
            c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f1828c) {
            this.f1828c = f2;
            c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f1831f) {
            this.f1831f = f2;
            c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.g) {
            this.g = f2;
            c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.h) {
            this.h = f2;
            c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.i) {
            this.i = f2;
            c();
        }
    }
}
