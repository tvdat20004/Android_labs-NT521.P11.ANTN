package c.c.a.a.x1;

import android.content.res.Resources;
import android.text.TextUtils;
import c.c.a.a.l0;
import java.util.Locale;
import java.util.Objects;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class g implements t {

    /* renamed from: a, reason: collision with root package name */
    public final Resources f3472a;

    public g(Resources resources) {
        Objects.requireNonNull(resources);
        this.f3472a = resources;
    }

    public final String a(l0 l0Var) {
        int i = l0Var.f2041f;
        return i == -1 ? "" : this.f3472a.getString(R.string.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    public final String b(l0 l0Var) {
        String str;
        String[] strArr = new String[2];
        String str2 = l0Var.B;
        if (TextUtils.isEmpty(str2) || "und".equals(str2)) {
            str = "";
        } else {
            str = (c.c.a.a.z1.l0.f3761a >= 21 ? Locale.forLanguageTag(str2) : new Locale(str2)).getDisplayName();
        }
        strArr[0] = str;
        strArr[1] = c(l0Var);
        String d2 = d(strArr);
        if (TextUtils.isEmpty(d2)) {
            return TextUtils.isEmpty(l0Var.f2038c) ? "" : l0Var.f2038c;
        }
        return d2;
    }

    public final String c(l0 l0Var) {
        String string = (l0Var.f2040e & 2) != 0 ? this.f3472a.getString(R.string.exo_track_role_alternate) : "";
        if ((l0Var.f2040e & 4) != 0) {
            string = d(string, this.f3472a.getString(R.string.exo_track_role_supplementary));
        }
        if ((l0Var.f2040e & 8) != 0) {
            string = d(string, this.f3472a.getString(R.string.exo_track_role_commentary));
        }
        return (l0Var.f2040e & 1088) != 0 ? d(string, this.f3472a.getString(R.string.exo_track_role_closed_captions)) : string;
    }

    public final String d(String... strArr) {
        String str = "";
        for (String str2 : strArr) {
            if (str2.length() > 0) {
                str = TextUtils.isEmpty(str) ? str2 : this.f3472a.getString(R.string.exo_item_list, str, str2);
            }
        }
        return str;
    }
}
