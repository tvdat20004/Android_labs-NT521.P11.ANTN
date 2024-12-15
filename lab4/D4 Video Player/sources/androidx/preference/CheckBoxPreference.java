package androidx.preference;

import android.R;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Checkable;
import android.widget.CompoundButton;
import b.q.t;
import java.util.Objects;

/* loaded from: classes.dex */
public class CheckBoxPreference extends TwoStatePreference {
    public final a S;

    public class a implements CompoundButton.OnCheckedChangeListener {
        public a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            Objects.requireNonNull(CheckBoxPreference.this);
            CheckBoxPreference.this.H(z);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public CheckBoxPreference(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 2130903180(0x7f03008c, float:1.741317E38)
            r1 = 16842895(0x101008f, float:2.369396E-38)
            int r0 = b.h.c.a.k.a(r4, r0, r1)
            r1 = 0
            r3.<init>(r4, r5, r0, r1)
            androidx.preference.CheckBoxPreference$a r2 = new androidx.preference.CheckBoxPreference$a
            r2.<init>()
            r3.S = r2
            int[] r2 = b.q.v.f1585b
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r5, r2, r0, r1)
            r5 = 5
            java.lang.String r5 = b.h.c.a.k.f(r4, r5, r1)
            r3.J(r5)
            r5 = 4
            java.lang.String r5 = r4.getString(r5)
            if (r5 != 0) goto L2f
            r5 = 1
            java.lang.String r5 = r4.getString(r5)
        L2f:
            r3.I(r5)
            r5 = 3
            r0 = 2
            boolean r0 = r4.getBoolean(r0, r1)
            boolean r5 = r4.getBoolean(r5, r0)
            r3.R = r5
            r4.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.CheckBoxPreference.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    @Override // androidx.preference.Preference
    public void B(View view) {
        super.B(view);
        if (((AccessibilityManager) this.f259b.getSystemService("accessibility")).isEnabled()) {
            M(view.findViewById(R.id.checkbox));
            K(view.findViewById(R.id.summary));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void M(View view) {
        boolean z = view instanceof CompoundButton;
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(null);
        }
        if (view instanceof Checkable) {
            ((Checkable) view).setChecked(this.N);
        }
        if (z) {
            ((CompoundButton) view).setOnCheckedChangeListener(this.S);
        }
    }

    @Override // androidx.preference.Preference
    public void q(t tVar) {
        super.q(tVar);
        M(tVar.w(R.id.checkbox));
        L(tVar);
    }
}
