package androidx.preference;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import b.h.c.a.k;
import b.l.b.d;
import b.l.b.z;
import b.q.b;
import b.q.e;
import b.q.g;
import b.q.j;
import b.q.q;
import b.q.v;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    public CharSequence N;
    public CharSequence O;
    public Drawable P;
    public CharSequence Q;
    public CharSequence R;
    public int S;

    public interface a {
    }

    public DialogPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, R.attr.dialogPreferenceStyle, android.R.attr.dialogPreferenceStyle), 0);
    }

    @Override // androidx.preference.Preference
    public void r() {
        d gVar;
        q.a aVar = this.f260c.i;
        if (aVar != null) {
            j jVar = (j) aVar;
            jVar.d();
            if (jVar.p().H("androidx.preference.PreferenceFragment.DIALOG") != null) {
                return;
            }
            if (this instanceof EditTextPreference) {
                String str = this.l;
                gVar = new b();
                Bundle bundle = new Bundle(1);
                bundle.putString("key", str);
                gVar.j0(bundle);
            } else if (this instanceof ListPreference) {
                String str2 = this.l;
                gVar = new e();
                Bundle bundle2 = new Bundle(1);
                bundle2.putString("key", str2);
                gVar.j0(bundle2);
            } else {
                if (!(this instanceof MultiSelectListPreference)) {
                    StringBuilder j = c.a.a.a.a.j("Cannot display dialog for an unknown Preference type: ");
                    j.append(getClass().getSimpleName());
                    j.append(". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
                    throw new IllegalArgumentException(j.toString());
                }
                String str3 = this.l;
                gVar = new g();
                Bundle bundle3 = new Bundle(1);
                bundle3.putString("key", str3);
                gVar.j0(bundle3);
            }
            gVar.o0(jVar, 0);
            z p = jVar.p();
            gVar.f0 = false;
            gVar.g0 = true;
            b.l.b.a aVar2 = new b.l.b.a(p);
            aVar2.f(0, gVar, "androidx.preference.PreferenceFragment.DIALOG", 1);
            aVar2.d();
        }
    }

    public DialogPreference(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f1586c, i, i2);
        String f2 = k.f(obtainStyledAttributes, 9, 0);
        this.N = f2;
        if (f2 == null) {
            this.N = this.h;
        }
        String string = obtainStyledAttributes.getString(8);
        this.O = string == null ? obtainStyledAttributes.getString(1) : string;
        Drawable drawable = obtainStyledAttributes.getDrawable(6);
        this.P = drawable == null ? obtainStyledAttributes.getDrawable(2) : drawable;
        String string2 = obtainStyledAttributes.getString(11);
        this.Q = string2 == null ? obtainStyledAttributes.getString(3) : string2;
        String string3 = obtainStyledAttributes.getString(10);
        this.R = string3 == null ? obtainStyledAttributes.getString(4) : string3;
        this.S = obtainStyledAttributes.getResourceId(7, obtainStyledAttributes.getResourceId(5, 0));
        obtainStyledAttributes.recycle();
    }
}
