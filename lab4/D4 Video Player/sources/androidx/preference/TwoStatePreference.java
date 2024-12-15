package androidx.preference;

import android.R;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.preference.Preference;
import b.q.t;
import b.q.x;

/* loaded from: classes.dex */
public abstract class TwoStatePreference extends Preference {
    public boolean N;
    public CharSequence O;
    public CharSequence P;
    public boolean Q;
    public boolean R;

    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new x();

        /* renamed from: b, reason: collision with root package name */
        public boolean f274b;

        public a(Parcel parcel) {
            super(parcel);
            this.f274b = parcel.readInt() == 1;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f274b ? 1 : 0);
        }
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
    }

    public TwoStatePreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // androidx.preference.Preference
    public boolean F() {
        return (this.R ? this.N : !this.N) || super.F();
    }

    public void H(boolean z) {
        boolean z2 = this.N != z;
        if (z2 || !this.Q) {
            this.N = z;
            this.Q = true;
            if (G() && z != e(!z)) {
                i();
                SharedPreferences.Editor b2 = this.f260c.b();
                b2.putBoolean(this.l, z);
                if (!this.f260c.f1580e) {
                    b2.apply();
                }
            }
            if (z2) {
                n(F());
                m();
            }
        }
    }

    public void I(CharSequence charSequence) {
        this.P = charSequence;
        if (this.N) {
            return;
        }
        m();
    }

    public void J(CharSequence charSequence) {
        this.O = charSequence;
        if (this.N) {
            m();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(android.view.View r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof android.widget.TextView
            if (r0 != 0) goto L5
            return
        L5:
            android.widget.TextView r5 = (android.widget.TextView) r5
            r0 = 1
            boolean r1 = r4.N
            r2 = 0
            if (r1 == 0) goto L1c
            java.lang.CharSequence r1 = r4.O
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L1c
            java.lang.CharSequence r0 = r4.O
        L17:
            r5.setText(r0)
            r0 = r2
            goto L2b
        L1c:
            boolean r1 = r4.N
            if (r1 != 0) goto L2b
            java.lang.CharSequence r1 = r4.P
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2b
            java.lang.CharSequence r0 = r4.P
            goto L17
        L2b:
            if (r0 == 0) goto L3b
            java.lang.CharSequence r1 = r4.j()
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 != 0) goto L3b
            r5.setText(r1)
            r0 = r2
        L3b:
            r1 = 8
            if (r0 != 0) goto L40
            goto L41
        L40:
            r2 = r1
        L41:
            int r0 = r5.getVisibility()
            if (r2 == r0) goto L4a
            r5.setVisibility(r2)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.TwoStatePreference.K(android.view.View):void");
    }

    public void L(t tVar) {
        K(tVar.w(R.id.summary));
    }

    @Override // androidx.preference.Preference
    public void r() {
        H(!this.N);
    }

    @Override // androidx.preference.Preference
    public Object u(TypedArray typedArray, int i) {
        return Boolean.valueOf(typedArray.getBoolean(i, false));
    }

    @Override // androidx.preference.Preference
    public void x(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.x(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.x(aVar.getSuperState());
        H(aVar.f274b);
    }

    @Override // androidx.preference.Preference
    public Parcelable y() {
        Parcelable y = super.y();
        if (this.r) {
            return y;
        }
        a aVar = new a(y);
        aVar.f274b = this.N;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public void z(Object obj) {
        if (obj == null) {
            obj = Boolean.FALSE;
        }
        H(e(((Boolean) obj).booleanValue()));
    }
}
