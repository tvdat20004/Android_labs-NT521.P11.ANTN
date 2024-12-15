package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import b.h.c.a.k;
import b.q.j;
import b.q.q;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public final class PreferenceScreen extends PreferenceGroup {
    public boolean T;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, k.a(context, R.attr.preferenceScreenStyle, android.R.attr.preferenceScreenStyle), 0);
        this.T = true;
    }

    @Override // androidx.preference.PreferenceGroup
    public boolean K() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void r() {
        q.b bVar;
        if (this.m != null || this.n != null || J() == 0 || (bVar = this.f260c.j) == null) {
            return;
        }
        ((j) bVar).d();
    }
}
