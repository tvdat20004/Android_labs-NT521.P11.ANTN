package b.q;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import java.util.ArrayList;
import java.util.List;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public final class c extends Preference {
    public long N;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, List<Preference> list, long j) {
        super(context, null);
        CharSequence charSequence = null;
        this.E = R.layout.expand_button;
        Drawable a2 = b.b.d.a.a.a(this.f259b, R.drawable.ic_arrow_down_24dp);
        if (this.k != a2) {
            this.k = a2;
            this.j = 0;
            m();
        }
        this.j = R.drawable.ic_arrow_down_24dp;
        String string = this.f259b.getString(R.string.expand_button_title);
        if ((string == null && this.h != null) || (string != null && !string.equals(this.h))) {
            this.h = string;
            m();
        }
        E(999);
        ArrayList arrayList = new ArrayList();
        for (Preference preference : list) {
            CharSequence charSequence2 = preference.h;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence2)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (arrayList.contains(preference.I)) {
                if (z) {
                    arrayList.add((PreferenceGroup) preference);
                }
            } else if (!TextUtils.isEmpty(charSequence2)) {
                charSequence = charSequence == null ? charSequence2 : this.f259b.getString(R.string.summary_collapsed_preference_list, charSequence, charSequence2);
            }
        }
        if (this.L != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        }
        if (!TextUtils.equals(this.i, charSequence)) {
            this.i = charSequence;
            m();
        }
        this.N = j + 1000000;
    }

    @Override // androidx.preference.Preference
    public long d() {
        return this.N;
    }

    @Override // androidx.preference.Preference
    public void q(t tVar) {
        super.q(tVar);
        tVar.u = false;
    }
}
