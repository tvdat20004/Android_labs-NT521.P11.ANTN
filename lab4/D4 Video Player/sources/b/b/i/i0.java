package b.b.i;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;
import b.b.c.k;

/* loaded from: classes.dex */
public class i0 implements q0, DialogInterface.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public b.b.c.k f700b;

    /* renamed from: c, reason: collision with root package name */
    public ListAdapter f701c;

    /* renamed from: d, reason: collision with root package name */
    public CharSequence f702d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0 f703e;

    public i0(r0 r0Var) {
        this.f703e = r0Var;
    }

    @Override // b.b.i.q0
    public void a(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // b.b.i.q0
    public boolean b() {
        b.b.c.k kVar = this.f700b;
        if (kVar != null) {
            return kVar.isShowing();
        }
        return false;
    }

    @Override // b.b.i.q0
    public int c() {
        return 0;
    }

    @Override // b.b.i.q0
    public void d(int i, int i2) {
        if (this.f701c == null) {
            return;
        }
        k.a aVar = new k.a(this.f703e.getPopupContext());
        CharSequence charSequence = this.f702d;
        if (charSequence != null) {
            aVar.f455a.f439d = charSequence;
        }
        ListAdapter listAdapter = this.f701c;
        int selectedItemPosition = this.f703e.getSelectedItemPosition();
        b.b.c.h hVar = aVar.f455a;
        hVar.m = listAdapter;
        hVar.n = this;
        hVar.s = selectedItemPosition;
        hVar.r = true;
        b.b.c.k a2 = aVar.a();
        this.f700b = a2;
        ListView listView = a2.f454d.g;
        listView.setTextDirection(i);
        listView.setTextAlignment(i2);
        this.f700b.show();
    }

    @Override // b.b.i.q0
    public void dismiss() {
        b.b.c.k kVar = this.f700b;
        if (kVar != null) {
            kVar.dismiss();
            this.f700b = null;
        }
    }

    @Override // b.b.i.q0
    public int g() {
        return 0;
    }

    @Override // b.b.i.q0
    public Drawable i() {
        return null;
    }

    @Override // b.b.i.q0
    public CharSequence j() {
        return this.f702d;
    }

    @Override // b.b.i.q0
    public void l(CharSequence charSequence) {
        this.f702d = charSequence;
    }

    @Override // b.b.i.q0
    public void m(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // b.b.i.q0
    public void n(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // b.b.i.q0
    public void o(ListAdapter listAdapter) {
        this.f701c = listAdapter;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f703e.setSelection(i);
        if (this.f703e.getOnItemClickListener() != null) {
            this.f703e.performItemClick(null, i, this.f701c.getItemId(i));
        }
        b.b.c.k kVar = this.f700b;
        if (kVar != null) {
            kVar.dismiss();
            this.f700b = null;
        }
    }

    @Override // b.b.i.q0
    public void p(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }
}
