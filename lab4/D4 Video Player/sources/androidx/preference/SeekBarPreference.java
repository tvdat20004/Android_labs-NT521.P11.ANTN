package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.preference.Preference;
import b.q.t;
import b.q.v;
import b.q.w;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class SeekBarPreference extends Preference {
    public int N;
    public int O;
    public int P;
    public int Q;
    public boolean R;
    public SeekBar S;
    public TextView T;
    public boolean U;
    public boolean V;
    public boolean W;
    public SeekBar.OnSeekBarChangeListener X;
    public View.OnKeyListener Y;

    public class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            if (z) {
                SeekBarPreference seekBarPreference = SeekBarPreference.this;
                if (seekBarPreference.W || !seekBarPreference.R) {
                    int progress = seekBar.getProgress() + seekBarPreference.O;
                    if (progress != seekBarPreference.N) {
                        seekBarPreference.H(progress, false);
                        return;
                    }
                    return;
                }
            }
            SeekBarPreference seekBarPreference2 = SeekBarPreference.this;
            seekBarPreference2.I(i + seekBarPreference2.O);
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            SeekBarPreference.this.R = true;
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            int progress;
            SeekBarPreference.this.R = false;
            int progress2 = seekBar.getProgress();
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            int i = seekBarPreference.O;
            if (progress2 + i == seekBarPreference.N || (progress = seekBar.getProgress() + i) == seekBarPreference.N) {
                return;
            }
            seekBarPreference.H(progress, false);
        }
    }

    public class b implements View.OnKeyListener {
        public b() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() != 0) {
                return false;
            }
            SeekBarPreference seekBarPreference = SeekBarPreference.this;
            if ((!seekBarPreference.U && (i == 21 || i == 22)) || i == 23 || i == 66) {
                return false;
            }
            SeekBar seekBar = seekBarPreference.S;
            if (seekBar != null) {
                return seekBar.onKeyDown(i, keyEvent);
            }
            Log.e("SeekBarPreference", "SeekBar view is null and hence cannot be adjusted.");
            return false;
        }
    }

    public static class c extends Preference.b {
        public static final Parcelable.Creator<c> CREATOR = new w();

        /* renamed from: b, reason: collision with root package name */
        public int f269b;

        /* renamed from: c, reason: collision with root package name */
        public int f270c;

        /* renamed from: d, reason: collision with root package name */
        public int f271d;

        public c(Parcel parcel) {
            super(parcel);
            this.f269b = parcel.readInt();
            this.f270c = parcel.readInt();
            this.f271d = parcel.readInt();
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f269b);
            parcel.writeInt(this.f270c);
            parcel.writeInt(this.f271d);
        }
    }

    public SeekBarPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarPreferenceStyle, 0);
        this.X = new a();
        this.Y = new b();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.k, R.attr.seekBarPreferenceStyle, 0);
        this.O = obtainStyledAttributes.getInt(3, 0);
        int i = obtainStyledAttributes.getInt(1, 100);
        int i2 = this.O;
        i = i < i2 ? i2 : i;
        if (i != this.P) {
            this.P = i;
            m();
        }
        int i3 = obtainStyledAttributes.getInt(4, 0);
        if (i3 != this.Q) {
            this.Q = Math.min(this.P - this.O, Math.abs(i3));
            m();
        }
        this.U = obtainStyledAttributes.getBoolean(2, true);
        this.V = obtainStyledAttributes.getBoolean(5, false);
        this.W = obtainStyledAttributes.getBoolean(6, false);
        obtainStyledAttributes.recycle();
    }

    public final void H(int i, boolean z) {
        int i2 = this.O;
        if (i < i2) {
            i = i2;
        }
        int i3 = this.P;
        if (i > i3) {
            i = i3;
        }
        if (i != this.N) {
            this.N = i;
            I(i);
            if (G() && i != f(~i)) {
                i();
                SharedPreferences.Editor b2 = this.f260c.b();
                b2.putInt(this.l, i);
                if (!this.f260c.f1580e) {
                    b2.apply();
                }
            }
            if (z) {
                m();
            }
        }
    }

    public void I(int i) {
        TextView textView = this.T;
        if (textView != null) {
            textView.setText(String.valueOf(i));
        }
    }

    @Override // androidx.preference.Preference
    public void q(t tVar) {
        super.q(tVar);
        tVar.f305a.setOnKeyListener(this.Y);
        this.S = (SeekBar) tVar.w(R.id.seekbar);
        TextView textView = (TextView) tVar.w(R.id.seekbar_value);
        this.T = textView;
        if (this.V) {
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
            this.T = null;
        }
        SeekBar seekBar = this.S;
        if (seekBar == null) {
            Log.e("SeekBarPreference", "SeekBar view is null in onBindViewHolder.");
            return;
        }
        seekBar.setOnSeekBarChangeListener(this.X);
        this.S.setMax(this.P - this.O);
        int i = this.Q;
        if (i != 0) {
            this.S.setKeyProgressIncrement(i);
        } else {
            this.Q = this.S.getKeyProgressIncrement();
        }
        this.S.setProgress(this.N - this.O);
        I(this.N);
        this.S.setEnabled(l());
    }

    @Override // androidx.preference.Preference
    public Object u(TypedArray typedArray, int i) {
        return Integer.valueOf(typedArray.getInt(i, 0));
    }

    @Override // androidx.preference.Preference
    public void x(Parcelable parcelable) {
        if (!parcelable.getClass().equals(c.class)) {
            super.x(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.x(cVar.getSuperState());
        this.N = cVar.f269b;
        this.O = cVar.f270c;
        this.P = cVar.f271d;
        m();
    }

    @Override // androidx.preference.Preference
    public Parcelable y() {
        Parcelable y = super.y();
        if (this.r) {
            return y;
        }
        c cVar = new c(y);
        cVar.f269b = this.N;
        cVar.f270c = this.O;
        cVar.f271d = this.P;
        return cVar;
    }

    @Override // androidx.preference.Preference
    public void z(Object obj) {
        if (obj == null) {
            obj = 0;
        }
        H(f(((Integer) obj).intValue()), true);
    }
}
