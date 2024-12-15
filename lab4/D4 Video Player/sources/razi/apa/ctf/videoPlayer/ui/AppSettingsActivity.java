package razi.apa.ctf.videoPlayer.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import b.b.c.l;
import b.l.b.w;
import b.l.b.z;
import b.q.j;
import b.q.p;
import b.q.q;
import java.util.ArrayList;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class AppSettingsActivity extends l implements j.d {

    public class a implements z.a {
        public a() {
        }
    }

    public static class b extends j {
        @Override // b.q.j
        public void q0(Bundle bundle, String str) {
            q qVar = this.U;
            if (qVar == null) {
                throw new RuntimeException("This should be called after super.onCreate.");
            }
            Context i = i();
            qVar.f1580e = true;
            p pVar = new p(i, qVar);
            XmlResourceParser xml = i.getResources().getXml(R.xml.preferences_root);
            try {
                Preference c2 = pVar.c(xml, null);
                xml.close();
                PreferenceScreen preferenceScreen = (PreferenceScreen) c2;
                preferenceScreen.p(qVar);
                SharedPreferences.Editor editor = qVar.f1579d;
                if (editor != null) {
                    editor.apply();
                }
                boolean z = false;
                qVar.f1580e = false;
                Object obj = preferenceScreen;
                if (str != null) {
                    Object H = preferenceScreen.H(str);
                    boolean z2 = H instanceof PreferenceScreen;
                    obj = H;
                    if (!z2) {
                        throw new IllegalArgumentException(c.a.a.a.a.h("Preference object with key ", str, " is not a PreferenceScreen"));
                    }
                }
                PreferenceScreen preferenceScreen2 = (PreferenceScreen) obj;
                q qVar2 = this.U;
                PreferenceScreen preferenceScreen3 = qVar2.g;
                if (preferenceScreen2 != preferenceScreen3) {
                    if (preferenceScreen3 != null) {
                        preferenceScreen3.t();
                    }
                    qVar2.g = preferenceScreen2;
                    z = true;
                }
                if (!z || preferenceScreen2 == null) {
                    return;
                }
                this.W = true;
                if (!this.X || this.Z.hasMessages(1)) {
                    return;
                }
                this.Z.obtainMessage(1).sendToTarget();
            } catch (Throwable th) {
                xml.close();
                throw th;
            }
        }
    }

    @Override // b.b.c.l, androidx.activity.ComponentActivity, b.h.b.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.settings_activity);
        if (bundle == null) {
            b.l.b.a aVar = new b.l.b.a(n());
            aVar.m(R.id.settings, new b());
            aVar.d();
        } else {
            setTitle(bundle.getCharSequence("settingsActivityTitle"));
        }
        z n = n();
        a aVar2 = new a();
        if (n.j == null) {
            n.j = new ArrayList<>();
        }
        n.j.add(aVar2);
        b.b.c.a m = m();
        if (m != null) {
            m.c(true);
        }
    }

    @Override // b.b.c.l, androidx.activity.ComponentActivity, b.h.b.i, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("settingsActivityTitle", getTitle());
    }

    @Override // b.b.c.l
    public boolean s() {
        if (n().V()) {
            return true;
        }
        return super.s();
    }

    public boolean t(j jVar, Preference preference) {
        Bundle c2 = preference.c();
        w K = n().K();
        getClassLoader();
        Fragment a2 = K.a(preference.n);
        a2.j0(c2);
        a2.o0(jVar, 0);
        b.l.b.a aVar = new b.l.b.a(n());
        aVar.m(R.id.settings, a2);
        if (!aVar.h) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        aVar.g = true;
        aVar.i = null;
        aVar.d();
        setTitle(preference.h);
        return true;
    }
}
