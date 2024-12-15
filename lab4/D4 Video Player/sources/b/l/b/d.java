package b.l.b;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;

/* loaded from: classes.dex */
public class d extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler T;
    public Runnable U = new a();
    public DialogInterface.OnCancelListener V = new b();
    public DialogInterface.OnDismissListener W = new c();
    public int X = 0;
    public int Y = 0;
    public boolean Z = true;
    public boolean a0 = true;
    public int b0 = -1;
    public boolean c0;
    public Dialog d0;
    public boolean e0;
    public boolean f0;
    public boolean g0;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            d dVar = d.this;
            dVar.W.onDismiss(dVar.d0);
        }
    }

    public class b implements DialogInterface.OnCancelListener {
        public b() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(DialogInterface dialogInterface) {
            d dVar = d.this;
            Dialog dialog = dVar.d0;
            if (dialog != null) {
                dVar.onCancel(dialog);
            }
        }
    }

    public class c implements DialogInterface.OnDismissListener {
        public c() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(DialogInterface dialogInterface) {
            d dVar = d.this;
            Dialog dialog = dVar.d0;
            if (dialog != null) {
                dVar.onDismiss(dialog);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void C(Bundle bundle) {
        Bundle bundle2;
        this.C = true;
        if (this.a0) {
            View view = this.E;
            if (this.d0 != null) {
                if (view != null) {
                    if (view.getParent() != null) {
                        throw new IllegalStateException("DialogFragment can not be attached to a container view");
                    }
                    this.d0.setContentView(view);
                }
                b.b.c.l d2 = d();
                if (d2 != null) {
                    this.d0.setOwnerActivity(d2);
                }
                this.d0.setCancelable(this.Z);
                this.d0.setOnCancelListener(this.V);
                this.d0.setOnDismissListener(this.W);
                if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                    return;
                }
                this.d0.onRestoreInstanceState(bundle2);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void F(Context context) {
        super.F(context);
        if (this.g0) {
            return;
        }
        this.f0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void I(Bundle bundle) {
        super.I(bundle);
        this.T = new Handler();
        this.a0 = this.w == 0;
        if (bundle != null) {
            this.X = bundle.getInt("android:style", 0);
            this.Y = bundle.getInt("android:theme", 0);
            this.Z = bundle.getBoolean("android:cancelable", true);
            this.a0 = bundle.getBoolean("android:showsDialog", this.a0);
            this.b0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void M() {
        this.C = true;
        Dialog dialog = this.d0;
        if (dialog != null) {
            this.e0 = true;
            dialog.setOnDismissListener(null);
            this.d0.dismiss();
            if (!this.f0) {
                onDismiss(this.d0);
            }
            this.d0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void N() {
        this.C = true;
        if (this.g0 || this.f0) {
            return;
        }
        this.f0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater O(Bundle bundle) {
        LayoutInflater n = n();
        if (!this.a0 || this.c0) {
            return n;
        }
        try {
            this.c0 = true;
            Dialog r0 = r0(bundle);
            this.d0 = r0;
            int i = this.X;
            if (i != 1 && i != 2) {
                if (i != 3) {
                    this.c0 = false;
                    return n.cloneInContext(s0().getContext());
                }
                Window window = r0.getWindow();
                if (window != null) {
                    window.addFlags(24);
                }
            }
            r0.requestWindowFeature(1);
            this.c0 = false;
            return n.cloneInContext(s0().getContext());
        } catch (Throwable th) {
            this.c0 = false;
            throw th;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void W(Bundle bundle) {
        Dialog dialog = this.d0;
        if (dialog != null) {
            bundle.putBundle("android:savedDialogState", dialog.onSaveInstanceState());
        }
        int i = this.X;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.Y;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.Z;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.a0;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.b0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void X() {
        this.C = true;
        Dialog dialog = this.d0;
        if (dialog != null) {
            this.e0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.C = true;
        Dialog dialog = this.d0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.e0) {
            return;
        }
        q0(true, true);
    }

    public final void q0(boolean z, boolean z2) {
        if (this.f0) {
            return;
        }
        this.f0 = true;
        this.g0 = false;
        Dialog dialog = this.d0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.d0.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.T.getLooper()) {
                    onDismiss(this.d0);
                } else {
                    this.T.post(this.U);
                }
            }
        }
        this.e0 = true;
        if (this.b0 >= 0) {
            z p = p();
            int i = this.b0;
            if (i < 0) {
                throw new IllegalArgumentException(c.a.a.a.a.b("Bad id: ", i));
            }
            p.z(new b0(p, null, i, 1), false);
            this.b0 = -1;
            return;
        }
        b.l.b.a aVar = new b.l.b.a(p());
        z zVar = this.r;
        if (zVar != null && zVar != aVar.q) {
            StringBuilder j = c.a.a.a.a.j("Cannot remove Fragment attached to a different FragmentManager. Fragment ");
            j.append(toString());
            j.append(" is already attached to a FragmentManager.");
            throw new IllegalStateException(j.toString());
        }
        aVar.b(new m0(3, this));
        if (z) {
            aVar.e(true);
        } else {
            aVar.d();
        }
    }

    public Dialog r0(Bundle bundle) {
        return new Dialog(e0(), this.Y);
    }

    public final Dialog s0() {
        Dialog dialog = this.d0;
        if (dialog != null) {
            return dialog;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }
}
