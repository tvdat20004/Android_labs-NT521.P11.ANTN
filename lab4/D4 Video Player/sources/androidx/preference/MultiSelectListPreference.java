package androidx.preference;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.preference.Preference;
import b.q.f;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public class MultiSelectListPreference extends DialogPreference {
    public CharSequence[] T;
    public CharSequence[] U;
    public Set<String> V;

    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new f();

        /* renamed from: b, reason: collision with root package name */
        public Set<String> f258b;

        public a(Parcel parcel) {
            super(parcel);
            int readInt = parcel.readInt();
            this.f258b = new HashSet();
            String[] strArr = new String[readInt];
            parcel.readStringArray(strArr);
            Collections.addAll(this.f258b, strArr);
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f258b.size());
            Set<String> set = this.f258b;
            parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MultiSelectListPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903316(0x7f030114, float:1.7413447E38)
            r1 = 16842897(0x1010091, float:2.3693964E-38)
            int r0 = b.h.c.a.k.a(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>()
            r3.V = r2
            int[] r2 = b.q.v.f1589f
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 2
            java.lang.CharSequence[] r5 = b.h.c.a.k.g(r4, r5, r1)
            r3.T = r5
            r5 = 3
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
            if (r5 != 0) goto L2e
            r5 = 1
            java.lang.CharSequence[] r5 = r4.getTextArray(r5)
        L2e:
            r3.U = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.MultiSelectListPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public void H(Set<String> set) {
        this.V.clear();
        this.V.addAll(set);
        if (G() && !set.equals(h(null))) {
            i();
            SharedPreferences.Editor b2 = this.f260c.b();
            b2.putStringSet(this.l, set);
            if (!this.f260c.f1580e) {
                b2.apply();
            }
        }
        m();
    }

    @Override // androidx.preference.Preference
    public Object u(TypedArray typedArray, int i) {
        CharSequence[] textArray = typedArray.getTextArray(i);
        HashSet hashSet = new HashSet();
        for (CharSequence charSequence : textArray) {
            hashSet.add(charSequence.toString());
        }
        return hashSet;
    }

    @Override // androidx.preference.Preference
    public void x(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.x(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.x(aVar.getSuperState());
        H(aVar.f258b);
    }

    @Override // androidx.preference.Preference
    public Parcelable y() {
        Parcelable y = super.y();
        if (this.r) {
            return y;
        }
        a aVar = new a(y);
        aVar.f258b = this.V;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public void z(Object obj) {
        H(h((Set) obj));
    }
}
