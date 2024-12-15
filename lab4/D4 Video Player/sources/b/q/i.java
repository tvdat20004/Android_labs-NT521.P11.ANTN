package b.q;

import android.R;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.DialogPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import b.b.c.k;

/* loaded from: classes.dex */
public abstract class i extends b.l.b.d implements DialogInterface.OnClickListener {
    public DialogPreference h0;
    public CharSequence i0;
    public CharSequence j0;
    public CharSequence k0;
    public CharSequence l0;
    public int m0;
    public BitmapDrawable n0;
    public int o0;

    @Override // b.l.b.d, androidx.fragment.app.Fragment
    public void I(Bundle bundle) {
        BitmapDrawable bitmapDrawable;
        PreferenceScreen preferenceScreen;
        super.I(bundle);
        b.n.h x = x();
        if (!(x instanceof DialogPreference.a)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.a aVar = (DialogPreference.a) x;
        String string = this.f226f.getString("key");
        if (bundle != null) {
            this.i0 = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.j0 = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.k0 = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.l0 = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.m0 = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.n0 = new BitmapDrawable(r(), bitmap);
                return;
            }
            return;
        }
        q qVar = ((j) aVar).U;
        Preference preference = null;
        if (qVar != null && (preferenceScreen = qVar.g) != null) {
            preference = preferenceScreen.H(string);
        }
        DialogPreference dialogPreference = (DialogPreference) preference;
        this.h0 = dialogPreference;
        this.i0 = dialogPreference.N;
        this.j0 = dialogPreference.Q;
        this.k0 = dialogPreference.R;
        this.l0 = dialogPreference.O;
        this.m0 = dialogPreference.S;
        Drawable drawable = dialogPreference.P;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            bitmapDrawable = (BitmapDrawable) drawable;
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            bitmapDrawable = new BitmapDrawable(r(), createBitmap);
        }
        this.n0 = bitmapDrawable;
    }

    @Override // b.l.b.d, androidx.fragment.app.Fragment
    public void W(Bundle bundle) {
        super.W(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.i0);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.j0);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.k0);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.l0);
        bundle.putInt("PreferenceDialogFragment.layout", this.m0);
        BitmapDrawable bitmapDrawable = this.n0;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.o0 = i;
    }

    @Override // b.l.b.d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        x0(this.o0 == -1);
    }

    @Override // b.l.b.d
    public Dialog r0(Bundle bundle) {
        b.b.c.l d2 = d();
        this.o0 = -2;
        k.a aVar = new k.a(d2);
        CharSequence charSequence = this.i0;
        b.b.c.h hVar = aVar.f455a;
        hVar.f439d = charSequence;
        hVar.f438c = this.n0;
        hVar.g = this.j0;
        hVar.h = this;
        hVar.i = this.k0;
        hVar.j = this;
        View w0 = w0();
        if (w0 != null) {
            v0(w0);
            aVar.f455a.o = w0;
        } else {
            aVar.f455a.f441f = this.l0;
        }
        y0(aVar);
        b.b.c.k a2 = aVar.a();
        if (u0()) {
            a2.getWindow().setSoftInputMode(5);
        }
        return a2;
    }

    public DialogPreference t0() {
        PreferenceScreen preferenceScreen;
        if (this.h0 == null) {
            String string = this.f226f.getString("key");
            q qVar = ((j) ((DialogPreference.a) x())).U;
            Preference preference = null;
            if (qVar != null && (preferenceScreen = qVar.g) != null) {
                preference = preferenceScreen.H(string);
            }
            this.h0 = (DialogPreference) preference;
        }
        return this.h0;
    }

    public boolean u0() {
        return false;
    }

    public void v0(View view) {
        View findViewById = view.findViewById(R.id.message);
        if (findViewById != null) {
            CharSequence charSequence = this.l0;
            int i = 8;
            if (!TextUtils.isEmpty(charSequence)) {
                if (findViewById instanceof TextView) {
                    ((TextView) findViewById).setText(charSequence);
                }
                i = 0;
            }
            if (findViewById.getVisibility() != i) {
                findViewById.setVisibility(i);
            }
        }
    }

    public View w0() {
        int i = this.m0;
        if (i == 0) {
            return null;
        }
        LayoutInflater layoutInflater = this.L;
        if (layoutInflater == null) {
            layoutInflater = c0(null);
        }
        return layoutInflater.inflate(i, (ViewGroup) null);
    }

    public abstract void x0(boolean z);

    public void y0(k.a aVar) {
    }
}
