package b.q;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import b.b.c.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public class g extends i {
    public Set<String> p0 = new HashSet();
    public boolean q0;
    public CharSequence[] r0;
    public CharSequence[] s0;

    public class a implements DialogInterface.OnMultiChoiceClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnMultiChoiceClickListener
        public void onClick(DialogInterface dialogInterface, int i, boolean z) {
            boolean z2;
            boolean remove;
            g gVar = g.this;
            if (z) {
                z2 = gVar.q0;
                remove = gVar.p0.add(gVar.s0[i].toString());
            } else {
                z2 = gVar.q0;
                remove = gVar.p0.remove(gVar.s0[i].toString());
            }
            gVar.q0 = remove | z2;
        }
    }

    @Override // b.q.i, b.l.b.d, androidx.fragment.app.Fragment
    public void I(Bundle bundle) {
        super.I(bundle);
        if (bundle != null) {
            this.p0.clear();
            this.p0.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values"));
            this.q0 = bundle.getBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", false);
            this.r0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries");
            this.s0 = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues");
            return;
        }
        MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) t0();
        if (multiSelectListPreference.T == null || multiSelectListPreference.U == null) {
            throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
        }
        this.p0.clear();
        this.p0.addAll(multiSelectListPreference.V);
        this.q0 = false;
        this.r0 = multiSelectListPreference.T;
        this.s0 = multiSelectListPreference.U;
    }

    @Override // b.q.i, b.l.b.d, androidx.fragment.app.Fragment
    public void W(Bundle bundle) {
        super.W(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragmentCompat.values", new ArrayList<>(this.p0));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragmentCompat.changed", this.q0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entries", this.r0);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragmentCompat.entryValues", this.s0);
    }

    @Override // b.q.i
    public void x0(boolean z) {
        if (z && this.q0) {
            MultiSelectListPreference multiSelectListPreference = (MultiSelectListPreference) t0();
            Objects.requireNonNull(multiSelectListPreference);
            multiSelectListPreference.H(this.p0);
        }
        this.q0 = false;
    }

    @Override // b.q.i
    public void y0(k.a aVar) {
        int length = this.s0.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.p0.contains(this.s0[i].toString());
        }
        CharSequence[] charSequenceArr = this.r0;
        a aVar2 = new a();
        b.b.c.h hVar = aVar.f455a;
        hVar.l = charSequenceArr;
        hVar.t = aVar2;
        hVar.p = zArr;
        hVar.q = true;
    }
}
