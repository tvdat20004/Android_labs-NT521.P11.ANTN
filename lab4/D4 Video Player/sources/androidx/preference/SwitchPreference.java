package androidx.preference;

import android.R;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.Switch;
import b.q.t;
import java.util.Objects;

/* loaded from: classes.dex */
public class SwitchPreference extends TwoStatePreference {
    public final a S;
    public CharSequence T;
    public CharSequence U;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Objects.requireNonNull(SwitchPreference.this);
            SwitchPreference.this.H(z);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SwitchPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903842(0x7f030322, float:1.7414513E38)
            r1 = 16843629(0x101036d, float:2.3696016E-38)
            int r0 = b.h.c.a.k.a(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            androidx.preference.SwitchPreference$a r2 = new androidx.preference.SwitchPreference$a
            r2.<init>()
            r3.S = r2
            int[] r2 = b.q.v.l
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 7
            java.lang.String r5 = b.h.c.a.k.f(r4, r5, r1)
            r3.J(r5)
            r5 = 6
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L2f
            r5 = 1
            java.lang.String r5 = r4.getString(r5)
        L2f:
            r3.I(r5)
            r5 = 9
            r0 = 3
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L3f
            java.lang.String r5 = r4.getString(r0)
        L3f:
            r3.T = r5
            r3.m()
            r5 = 8
            r0 = 4
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L51
            java.lang.String r5 = r4.getString(r0)
        L51:
            r3.U = r5
            r3.m()
            r5 = 5
            r0 = 2
            boolean r0 = r4.getBoolean(r0, r1)
            boolean r5 = r4.getBoolean(r5, r0)
            r3.R = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.SwitchPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public void B(View view) {
        super.B(view);
        if (((AccessibilityManager) this.f259b.getSystemService("accessibility")).isEnabled()) {
            M(view.findViewById(R.id.switch_widget));
            K(view.findViewById(R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(View view) {
        boolean z = view instanceof Switch;
        if (z) {
            ((Switch) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.N);
        }
        if (z) {
            Switch r4 = (Switch) view;
            r4.setTextOn(this.T);
            r4.setTextOff(this.U);
            r4.setOnCheckedChangeListener(this.S);
        }
    }

    @Override // androidx.preference.Preference
    public void q(t tVar) {
        super.q(tVar);
        M(tVar.w(R.id.switch_widget));
        L(tVar);
    }
}
