package androidx.preference;

import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityNodeInfo;
import b.h.c.a.k;
import b.h.j.k0.b;
import b.q.t;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class PreferenceCategory extends PreferenceGroup {
    public PreferenceCategory(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, k.a(context, R.attr.preferenceCategoryStyle, android.R.attr.preferenceCategoryStyle), 0);
    }

    @Override // androidx.preference.Preference
    public boolean F() {
        return !super.l();
    }

    @Override // androidx.preference.Preference
    public boolean l() {
        return false;
    }

    @Override // androidx.preference.Preference
    public void q(t tVar) {
        super.q(tVar);
        if (Build.VERSION.SDK_INT >= 28) {
            tVar.f305a.setAccessibilityHeading(true);
        }
    }

    @Override // androidx.preference.Preference
    @Deprecated
    public void v(b bVar) {
        if (Build.VERSION.SDK_INT < 28) {
            AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo = bVar.f1286a.getCollectionItemInfo();
            b.c cVar = collectionItemInfo != null ? new b.c(collectionItemInfo) : null;
            if (cVar == null) {
                return;
            }
            bVar.o(b.c.a(((AccessibilityNodeInfo.CollectionItemInfo) cVar.f1296a).getRowIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) cVar.f1296a).getRowSpan(), ((AccessibilityNodeInfo.CollectionItemInfo) cVar.f1296a).getColumnIndex(), ((AccessibilityNodeInfo.CollectionItemInfo) cVar.f1296a).getColumnSpan(), true, ((AccessibilityNodeInfo.CollectionItemInfo) cVar.f1296a).isSelected()));
        }
    }
}
