package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import b.h.c.a.k;
import b.q.t;
import b.q.v;
import java.util.Objects;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class SwitchPreferenceCompat extends TwoStatePreference {
    public final a S;
    public CharSequence T;
    public CharSequence U;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Objects.requireNonNull(SwitchPreferenceCompat.this);
            SwitchPreferenceCompat.this.H(z);
        }
    }

    public SwitchPreferenceCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.switchPreferenceCompatStyle, 0);
        this.S = new a();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.m, R.attr.switchPreferenceCompatStyle, 0);
        J(k.f(obtainStyledAttributes, 7, 0));
        String string = obtainStyledAttributes.getString(6);
        I(string == null ? obtainStyledAttributes.getString(1) : string);
        String string2 = obtainStyledAttributes.getString(9);
        this.T = string2 == null ? obtainStyledAttributes.getString(3) : string2;
        m();
        String string3 = obtainStyledAttributes.getString(8);
        this.U = string3 == null ? obtainStyledAttributes.getString(4) : string3;
        m();
        this.R = obtainStyledAttributes.getBoolean(5, obtainStyledAttributes.getBoolean(2, false));
        obtainStyledAttributes.recycle();
    }

    @Override // androidx.preference.Preference
    public void B(View view) {
        super.B(view);
        if (((AccessibilityManager) this.f259b.getSystemService("accessibility")).isEnabled()) {
            M(view.findViewById(R.id.switchWidget));
            K(view.findViewById(android.R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(View view) {
        boolean z = view instanceof SwitchCompat;
        if (z) {
            ((SwitchCompat) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.N);
        }
        if (z) {
            SwitchCompat switchCompat = (SwitchCompat) view;
            switchCompat.setTextOn(this.T);
            switchCompat.setTextOff(this.U);
            switchCompat.setOnCheckedChangeListener(this.S);
        }
    }

    @Override // androidx.preference.Preference
    public void q(t tVar) {
        super.q(tVar);
        M(tVar.w(R.id.switchWidget));
        L(tVar);
    }
}
