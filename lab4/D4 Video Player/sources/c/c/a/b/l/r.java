package c.c.a.b.l;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import c.c.a.b.l.b;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public final class r<S> extends b.l.b.d {
    public static final /* synthetic */ int y0 = 0;
    public final LinkedHashSet<t<? super S>> h0 = new LinkedHashSet<>();
    public final LinkedHashSet<View.OnClickListener> i0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnCancelListener> j0 = new LinkedHashSet<>();
    public final LinkedHashSet<DialogInterface.OnDismissListener> k0 = new LinkedHashSet<>();
    public int l0;
    public f<S> m0;
    public c0<S> n0;
    public c.c.a.b.l.b o0;
    public j<S> p0;
    public int q0;
    public CharSequence r0;
    public boolean s0;
    public int t0;
    public TextView u0;
    public CheckableImageButton v0;
    public c.c.a.b.u.i w0;
    public Button x0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator<t<? super S>> it = r.this.h0.iterator();
            while (it.hasNext()) {
                it.next().a(r.this.m0.a());
            }
            r.this.q0(false, false);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator<View.OnClickListener> it = r.this.i0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            r.this.q0(false, false);
        }
    }

    public class c extends b0<S> {
        public c() {
        }

        @Override // c.c.a.b.l.b0
        public void a(S s) {
            r rVar = r.this;
            int i = r.y0;
            rVar.w0();
            r rVar2 = r.this;
            rVar2.x0.setEnabled(rVar2.m0.e());
        }
    }

    public static int t0(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        int i = w.l().f3940f;
        return ((i - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * i) + (dimensionPixelOffset * 2);
    }

    public static boolean u0(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(c.c.a.b.a.m(context, R.attr.materialCalendarStyle, j.class.getCanonicalName()), new int[]{android.R.attr.windowFullscreen});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    @Override // b.l.b.d, androidx.fragment.app.Fragment
    public final void I(Bundle bundle) {
        super.I(bundle);
        if (bundle == null) {
            bundle = this.f226f;
        }
        this.l0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.m0 = (f) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.o0 = (c.c.a.b.l.b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.q0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.r0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.t0 = bundle.getInt("INPUT_MODE_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public final View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.s0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.s0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(t0(context), -2));
        } else {
            View findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            View findViewById2 = inflate.findViewById(R.id.mtrl_calendar_frame);
            findViewById.setLayoutParams(new LinearLayout.LayoutParams(t0(context), -1));
            Resources resources = e0().getResources();
            int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_bottom_padding) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_navigation_top_padding) + resources.getDimensionPixelSize(R.dimen.mtrl_calendar_navigation_height);
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_days_of_week_height);
            int i = x.f3941f;
            findViewById2.setMinimumHeight(dimensionPixelOffset + dimensionPixelSize + (resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_vertical_padding) * (i - 1)) + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * i) + resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_bottom_padding));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.u0 = textView;
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        textView.setAccessibilityLiveRegion(1);
        this.v0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        CharSequence charSequence = this.r0;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.q0);
        }
        this.v0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.v0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, b.b.d.a.a.a(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], b.b.d.a.a.a(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.v0.setChecked(this.t0 != 0);
        b.h.j.u.i(this.v0, null);
        x0(this.v0);
        this.v0.setOnClickListener(new s(this));
        this.x0 = (Button) inflate.findViewById(R.id.confirm_button);
        if (this.m0.e()) {
            this.x0.setEnabled(true);
        } else {
            this.x0.setEnabled(false);
        }
        this.x0.setTag("CONFIRM_BUTTON_TAG");
        this.x0.setOnClickListener(new a());
        Button button = (Button) inflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        button.setOnClickListener(new b());
        return inflate;
    }

    @Override // b.l.b.d, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.l0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.m0);
        b.a aVar = new b.a(this.o0);
        w wVar = this.p0.X;
        if (wVar != null) {
            aVar.f3890c = Long.valueOf(wVar.h);
        }
        if (aVar.f3890c == null) {
            long j = w.l().h;
            long j2 = aVar.f3888a;
            if (j2 > j || j > aVar.f3889b) {
                j = j2;
            }
            aVar.f3890c = Long.valueOf(j);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", aVar.f3891d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new c.c.a.b.l.b(w.k(aVar.f3888a), w.k(aVar.f3889b), w.k(aVar.f3890c.longValue()), (c.c.a.b.l.c) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY"), null));
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.q0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.r0);
    }

    @Override // b.l.b.d, androidx.fragment.app.Fragment
    public void X() {
        this.C = true;
        Dialog dialog = this.d0;
        if (dialog != null) {
            this.e0 = false;
            dialog.show();
        }
        Window window = s0().getWindow();
        if (this.s0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.w0);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = r().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.w0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new c.c.a.b.m.a(s0(), rect));
        }
        v0();
    }

    @Override // b.l.b.d, androidx.fragment.app.Fragment
    public void Y() {
        this.n0.T.clear();
        this.C = true;
        Dialog dialog = this.d0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // b.l.b.d, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.j0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
    }

    @Override // b.l.b.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.k0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.E;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // b.l.b.d
    public final Dialog r0(Bundle bundle) {
        Context e0 = e0();
        Context e02 = e0();
        int i = this.l0;
        if (i == 0) {
            i = this.m0.c(e02);
        }
        Dialog dialog = new Dialog(e0, i);
        Context context = dialog.getContext();
        this.s0 = u0(context);
        int m = c.c.a.b.a.m(context, R.attr.colorSurface, r.class.getCanonicalName());
        c.c.a.b.u.i iVar = new c.c.a.b.u.i(c.c.a.b.u.m.b(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar).a());
        this.w0 = iVar;
        iVar.f4024b.f4019b = new c.c.a.b.n.a(context);
        iVar.w();
        this.w0.p(ColorStateList.valueOf(m));
        c.c.a.b.u.i iVar2 = this.w0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        iVar2.o(decorView.getElevation());
        return dialog;
    }

    public final void v0() {
        c0<S> c0Var;
        f<S> fVar = this.m0;
        Context e0 = e0();
        int i = this.l0;
        if (i == 0) {
            i = this.m0.c(e0);
        }
        c.c.a.b.l.b bVar = this.o0;
        j<S> jVar = new j<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", fVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar);
        bundle.putParcelable("CURRENT_MONTH_KEY", bVar.f3883d);
        jVar.j0(bundle);
        this.p0 = jVar;
        if (this.v0.isChecked()) {
            f<S> fVar2 = this.m0;
            c.c.a.b.l.b bVar2 = this.o0;
            c0Var = new u<>();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("DATE_SELECTOR_KEY", fVar2);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar2);
            c0Var.j0(bundle2);
        } else {
            c0Var = this.p0;
        }
        this.n0 = c0Var;
        w0();
        b.l.b.a aVar = new b.l.b.a(h());
        aVar.m(R.id.mtrl_calendar_frame, this.n0);
        if (aVar.g) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        aVar.h = false;
        aVar.q.C(aVar, false);
        c0<S> c0Var2 = this.n0;
        c0Var2.T.add(new c());
    }

    public final void w0() {
        String b2 = this.m0.b(i());
        this.u0.setContentDescription(String.format(w(R.string.mtrl_picker_announce_current_selection), b2));
        this.u0.setText(b2);
    }

    public final void x0(CheckableImageButton checkableImageButton) {
        this.v0.setContentDescription(checkableImageButton.getContext().getString(this.v0.isChecked() ? R.string.mtrl_picker_toggle_to_calendar_input_mode : R.string.mtrl_picker_toggle_to_text_input_mode));
    }
}
