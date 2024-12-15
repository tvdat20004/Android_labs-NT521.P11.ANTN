package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import b.h.c.a.k;
import b.q.d;
import b.q.v;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class ListPreference extends DialogPreference {
    public CharSequence[] T;
    public CharSequence[] U;
    public String V;
    public String W;
    public boolean X;

    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new d();

        /* renamed from: b, reason: collision with root package name */
        public String f256b;

        public a(Parcel parcel) {
            super(parcel);
            this.f256b = parcel.readString();
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f256b);
        }
    }

    public static final class b implements Preference.f<ListPreference> {

        /* renamed from: a, reason: collision with root package name */
        public static b f257a;

        @Override // androidx.preference.Preference.f
        public CharSequence a(ListPreference listPreference) {
            ListPreference listPreference2 = listPreference;
            return TextUtils.isEmpty(listPreference2.I()) ? listPreference2.f259b.getString(R.string.not_set) : listPreference2.I();
        }
    }

    public ListPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle), 0);
    }

    public int H(String str) {
        CharSequence[] charSequenceArr;
        if (str == null || (charSequenceArr = this.U) == null) {
            return -1;
        }
        for (int length = charSequenceArr.length - 1; length >= 0; length--) {
            if (this.U[length].equals(str)) {
                return length;
            }
        }
        return -1;
    }

    public CharSequence I() {
        CharSequence[] charSequenceArr;
        int H = H(this.V);
        if (H < 0 || (charSequenceArr = this.T) == null) {
            return null;
        }
        return charSequenceArr[H];
    }

    public void J(String str) {
        boolean z = !TextUtils.equals(this.V, str);
        if (z || !this.X) {
            this.V = str;
            this.X = true;
            C(str);
            if (z) {
                m();
            }
        }
    }

    @Override // androidx.preference.Preference
    public CharSequence j() {
        Preference.f fVar = this.L;
        if (fVar != null) {
            return fVar.a(this);
        }
        CharSequence I = I();
        CharSequence j = super.j();
        String str = this.W;
        if (str == null) {
            return j;
        }
        Object[] objArr = new Object[1];
        if (I == null) {
            I = "";
        }
        objArr[0] = I;
        String format = String.format(str, objArr);
        if (TextUtils.equals(format, j)) {
            return j;
        }
        Log.w("ListPreference", "Setting a summary with a String formatting marker is no longer supported. You should use a SummaryProvider instead.");
        return format;
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
        J(aVar.f256b);
    }

    @Override // androidx.preference.Preference
    public Parcelable y() {
        Parcelable y = super.y();
        if (this.r) {
            return y;
        }
        a aVar = new a(y);
        aVar.f256b = this.V;
        return aVar;
    }

    @Override // androidx.preference.Preference
    public void z(Object obj) {
        J(g((String) obj));
    }

    public ListPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f1588e, i, i2);
        this.T = k.g(obtainStyledAttributes, 2, 0);
        CharSequence[] textArray = obtainStyledAttributes.getTextArray(3);
        this.U = textArray == null ? obtainStyledAttributes.getTextArray(1) : textArray;
        if (obtainStyledAttributes.getBoolean(4, obtainStyledAttributes.getBoolean(4, false))) {
            if (b.f257a == null) {
                b.f257a = new b();
            }
            this.L = b.f257a;
            m();
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, v.g, i, i2);
        this.W = k.f(obtainStyledAttributes2, 33, 7);
        obtainStyledAttributes2.recycle();
    }
}
