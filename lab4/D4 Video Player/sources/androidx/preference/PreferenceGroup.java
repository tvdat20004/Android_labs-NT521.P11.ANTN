package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import androidx.preference.Preference;
import b.e.i;
import b.q.k;
import b.q.v;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public abstract class PreferenceGroup extends Preference {
    public final i<String, Long> N;
    public List<Preference> O;
    public boolean P;
    public int Q;
    public boolean R;
    public int S;

    public static class a extends Preference.b {
        public static final Parcelable.Creator<a> CREATOR = new k();

        /* renamed from: b, reason: collision with root package name */
        public int f266b;

        public a(Parcel parcel) {
            super(parcel);
            this.f266b = parcel.readInt();
        }

        public a(Parcelable parcelable, int i) {
            super(parcelable);
            this.f266b = i;
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f266b);
        }
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0);
    }

    public <T extends Preference> T H(CharSequence charSequence) {
        T t;
        if (charSequence == null) {
            throw new IllegalArgumentException("Key cannot be null");
        }
        if (TextUtils.equals(this.l, charSequence)) {
            return this;
        }
        int J = J();
        for (int i = 0; i < J; i++) {
            PreferenceGroup preferenceGroup = (T) I(i);
            if (TextUtils.equals(preferenceGroup.l, charSequence)) {
                return preferenceGroup;
            }
            if ((preferenceGroup instanceof PreferenceGroup) && (t = (T) preferenceGroup.H(charSequence)) != null) {
                return t;
            }
        }
        return null;
    }

    public Preference I(int i) {
        return this.O.get(i);
    }

    public int J() {
        return this.O.size();
    }

    public boolean K() {
        return true;
    }

    public void L(int i) {
        if (i != Integer.MAX_VALUE && !k()) {
            Log.e("PreferenceGroup", getClass().getSimpleName() + " should have a key defined if it contains an expandable preference");
        }
        this.S = i;
    }

    @Override // androidx.preference.Preference
    public void a(Bundle bundle) {
        super.a(bundle);
        int J = J();
        for (int i = 0; i < J; i++) {
            I(i).a(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void b(Bundle bundle) {
        super.b(bundle);
        int J = J();
        for (int i = 0; i < J; i++) {
            I(i).b(bundle);
        }
    }

    @Override // androidx.preference.Preference
    public void n(boolean z) {
        super.n(z);
        int J = J();
        for (int i = 0; i < J; i++) {
            I(i).w(z);
        }
    }

    @Override // androidx.preference.Preference
    public void o() {
        super.o();
        this.R = true;
        int J = J();
        for (int i = 0; i < J; i++) {
            I(i).o();
        }
    }

    @Override // androidx.preference.Preference
    public void t() {
        super.t();
        this.R = false;
        int J = J();
        for (int i = 0; i < J; i++) {
            I(i).t();
        }
    }

    @Override // androidx.preference.Preference
    public void x(Parcelable parcelable) {
        if (!parcelable.getClass().equals(a.class)) {
            super.x(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        this.S = aVar.f266b;
        super.x(aVar.getSuperState());
    }

    @Override // androidx.preference.Preference
    public Parcelable y() {
        return new a(super.y(), this.S);
    }

    public PreferenceGroup(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.N = new i<>();
        new Handler();
        this.P = true;
        this.Q = 0;
        this.R = false;
        this.S = Integer.MAX_VALUE;
        this.O = new ArrayList();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.i, i, i2);
        this.P = b.h.c.a.k.b(obtainStyledAttributes, 2, 2, true);
        if (obtainStyledAttributes.hasValue(1)) {
            L(obtainStyledAttributes.getInt(1, obtainStyledAttributes.getInt(1, Integer.MAX_VALUE)));
        }
        obtainStyledAttributes.recycle();
    }
}
