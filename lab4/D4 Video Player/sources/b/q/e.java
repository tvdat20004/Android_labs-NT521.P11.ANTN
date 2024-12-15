package b.q;

import android.content.DialogInterface;
import android.os.Bundle;
import androidx.preference.ListPreference;
import b.b.c.k;
import java.util.Objects;

/* loaded from: classes.dex */
public class e extends i {
    public int p0;
    public CharSequence[] q0;
    public CharSequence[] r0;

    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i) {
            e eVar = e.this;
            eVar.p0 = i;
            eVar.onClick(dialogInterface, -1);
            dialogInterface.dismiss();
        }
    }

    @Override // b.q.i, b.l.b.d, androidx.fragment.app.Fragment
    public void I(Bundle bundle) {
        super.I(bundle);
        if (bundle != null) {
            this.p0 = bundle.getInt("ListPreferenceDialogFragment.index", 0);
            this.q0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
            this.r0 = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
            return;
        }
        ListPreference listPreference = (ListPreference) t0();
        if (listPreference.T == null || listPreference.U == null) {
            throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
        }
        this.p0 = listPreference.H(listPreference.V);
        this.q0 = listPreference.T;
        this.r0 = listPreference.U;
    }

    @Override // b.q.i, b.l.b.d, androidx.fragment.app.Fragment
    public void W(Bundle bundle) {
        super.W(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.p0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.q0);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.r0);
    }

    @Override // b.q.i
    public void x0(boolean z) {
        int i;
        if (!z || (i = this.p0) < 0) {
            return;
        }
        String charSequence = this.r0[i].toString();
        ListPreference listPreference = (ListPreference) t0();
        Objects.requireNonNull(listPreference);
        listPreference.J(charSequence);
    }

    @Override // b.q.i
    public void y0(k.a aVar) {
        CharSequence[] charSequenceArr = this.q0;
        int i = this.p0;
        a aVar2 = new a();
        b.b.c.h hVar = aVar.f455a;
        hVar.l = charSequenceArr;
        hVar.n = aVar2;
        hVar.s = i;
        hVar.r = true;
        hVar.g = null;
        hVar.h = null;
    }
}
