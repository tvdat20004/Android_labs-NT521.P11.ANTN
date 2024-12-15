package androidx.preference;

import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.preference.Preference;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class EditTextPreference extends DialogPreference {
    public String T;

    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new b.q.a();

        /* renamed from: b, reason: collision with root package name */
        public String f254b;

        public a(Parcel parcel) {
            super(parcel);
            this.f254b = parcel.readString();
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f254b);
        }
    }

    public static final class b implements Preference.f<EditTextPreference> {

        /* renamed from: a, reason: collision with root package name */
        public static b f255a;

        @Override // androidx.preference.Preference.f
        public CharSequence a(EditTextPreference editTextPreference) {
            EditTextPreference editTextPreference2 = editTextPreference;
            return TextUtils.isEmpty(editTextPreference2.T) ? editTextPreference2.f259b.getString(R.string.not_set) : editTextPreference2.T;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public EditTextPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903347(0x7f030133, float:1.741351E38)
            r1 = 16842898(0x1010092, float:2.3693967E-38)
            int r0 = b.h.c.a.k.a(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            int[] r2 = b.q.v.f1587d
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            boolean r5 = b.h.c.a.k.b(r4, r1, r1, r1)
            if (r5 == 0) goto L2c
            androidx.preference.EditTextPreference$b r5 = androidx.preference.EditTextPreference.b.f255a
            if (r5 != 0) goto L25
            androidx.preference.EditTextPreference$b r5 = new androidx.preference.EditTextPreference$b
            r5.<init>()
            androidx.preference.EditTextPreference.b.f255a = r5
        L25:
            androidx.preference.EditTextPreference$b r5 = androidx.preference.EditTextPreference.b.f255a
            r3.L = r5
            r3.m()
        L2c:
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.EditTextPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public boolean F() {
        return TextUtils.isEmpty(this.T) || super.F();
    }

    public void H(String str) {
        boolean F = F();
        this.T = str;
        C(str);
        boolean F2 = F();
        if (F2 != F) {
            n(F2);
        }
        m();
    }

    @Override // androidx.preference.Preference
    public Object u(TypedArray typedArray, int i) {
        return typedArray.getString(i);
    }

    @Override // androidx.preference.Preference
    public void x(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.x(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.x(aVar.getSuperState());
        H(aVar.f254b);
    }

    @Override // androidx.preference.Preference
    public Parcelable y() {
        Parcelable y = super.y();
        if (this.r) {
            return y;
        }
        a aVar = new a(y);
        aVar.f254b = this.T;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public void z(Object obj) {
        H(g((String) obj));
    }
}
