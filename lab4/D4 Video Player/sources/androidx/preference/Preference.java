package androidx.preference;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import b.h.c.a.k;
import b.l.b.w;
import b.l.b.z;
import b.q.h;
import b.q.j;
import b.q.m;
import b.q.o;
import b.q.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import razi.apa.ctf.videoPlayer.R;
import razi.apa.ctf.videoPlayer.ui.AppSettingsActivity;

/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public c G;
    public List<Preference> H;
    public PreferenceGroup I;
    public boolean J;
    public e K;
    public f L;
    public final View.OnClickListener M;

    /* renamed from: b, reason: collision with root package name */
    public Context f259b;

    /* renamed from: c, reason: collision with root package name */
    public q f260c;

    /* renamed from: d, reason: collision with root package name */
    public long f261d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f262e;

    /* renamed from: f, reason: collision with root package name */
    public d f263f;
    public int g;
    public CharSequence h;
    public CharSequence i;
    public int j;
    public Drawable k;
    public String l;
    public Intent m;
    public String n;
    public Bundle o;
    public boolean p;
    public boolean q;
    public boolean r;
    public String s;
    public Object t;
    public boolean u;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Preference.this.B(view);
        }
    }

    public static class b extends AbsSavedState {
        public static final Parcelable.Creator<b> CREATOR = new h();

        public b(Parcel parcel) {
            super(parcel);
        }

        public b(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public interface c {
    }

    public interface d {
    }

    public static class e implements View.OnCreateContextMenuListener, MenuItem.OnMenuItemClickListener {

        /* renamed from: b, reason: collision with root package name */
        public final Preference f265b;

        public e(Preference preference) {
            this.f265b = preference;
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            CharSequence j = this.f265b.j();
            if (!this.f265b.C || TextUtils.isEmpty(j)) {
                return;
            }
            contextMenu.setHeaderTitle(j);
            contextMenu.add(0, 0, 0, R.string.copy).setOnMenuItemClickListener(this);
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            ClipboardManager clipboardManager = (ClipboardManager) this.f265b.f259b.getSystemService("clipboard");
            CharSequence j = this.f265b.j();
            clipboardManager.setPrimaryClip(ClipData.newPlainText("Preference", j));
            Context context = this.f265b.f259b;
            Toast.makeText(context, context.getString(R.string.preference_copied, j), 0).show();
            return true;
        }
    }

    public interface f<T extends Preference> {
        CharSequence a(T t);
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k.a(context, R.attr.preferenceStyle, android.R.attr.preferenceStyle), 0);
    }

    @Deprecated
    public void A(Object obj) {
        z(obj);
    }

    public void B(View view) {
        q.c cVar;
        boolean z;
        if (l() && this.q) {
            r();
            d dVar = this.f263f;
            if (dVar != null) {
                m mVar = (m) dVar;
                mVar.f1561a.L(Integer.MAX_VALUE);
                o oVar = mVar.f1562b;
                oVar.g.removeCallbacks(oVar.h);
                oVar.g.post(oVar.h);
                Objects.requireNonNull(mVar.f1561a);
                return;
            }
            q qVar = this.f260c;
            if (qVar != null && (cVar = qVar.h) != null) {
                j jVar = (j) cVar;
                boolean z2 = false;
                if (this.n != null) {
                    if (jVar.d() instanceof j.d) {
                        ((AppSettingsActivity) ((j.d) jVar.d())).t(jVar, this);
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        Log.w("PreferenceFragment", "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
                        z n = jVar.d0().n();
                        Bundle c2 = c();
                        w K = n.K();
                        jVar.d0().getClassLoader();
                        Fragment a2 = K.a(this.n);
                        a2.j0(c2);
                        a2.o0(jVar, 0);
                        b.l.b.a aVar = new b.l.b.a(n);
                        aVar.m(((View) jVar.E.getParent()).getId(), a2);
                        if (!aVar.h) {
                            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
                        }
                        aVar.g = true;
                        aVar.i = null;
                        aVar.d();
                    }
                    z2 = true;
                }
                if (z2) {
                    return;
                }
            }
            Intent intent = this.m;
            if (intent != null) {
                this.f259b.startActivity(intent);
            }
        }
    }

    public boolean C(String str) {
        if (!G()) {
            return false;
        }
        if (TextUtils.equals(str, g(null))) {
            return true;
        }
        i();
        SharedPreferences.Editor b2 = this.f260c.b();
        b2.putString(this.l, str);
        if (!this.f260c.f1580e) {
            b2.apply();
        }
        return true;
    }

    public final void D(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                D(viewGroup.getChildAt(childCount), z);
            }
        }
    }

    public void E(int i) {
        if (i != this.g) {
            this.g = i;
            c cVar = this.G;
            if (cVar != null) {
                o oVar = (o) cVar;
                oVar.g.removeCallbacks(oVar.h);
                oVar.g.post(oVar.h);
            }
        }
    }

    public boolean F() {
        return !l();
    }

    public boolean G() {
        return this.f260c != null && this.r && k();
    }

    public void a(Bundle bundle) {
        Parcelable parcelable;
        if (!k() || (parcelable = bundle.getParcelable(this.l)) == null) {
            return;
        }
        this.J = false;
        x(parcelable);
        if (!this.J) {
            throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
        }
    }

    public void b(Bundle bundle) {
        if (k()) {
            this.J = false;
            Parcelable y = y();
            if (!this.J) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            }
            if (y != null) {
                bundle.putParcelable(this.l, y);
            }
        }
    }

    public Bundle c() {
        if (this.o == null) {
            this.o = new Bundle();
        }
        return this.o;
    }

    @Override // java.lang.Comparable
    public int compareTo(Preference preference) {
        Preference preference2 = preference;
        int i = this.g;
        int i2 = preference2.g;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.h;
        CharSequence charSequence2 = preference2.h;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference2.h.toString());
    }

    public long d() {
        return this.f261d;
    }

    public boolean e(boolean z) {
        if (!G()) {
            return z;
        }
        i();
        return this.f260c.c().getBoolean(this.l, z);
    }

    public int f(int i) {
        if (!G()) {
            return i;
        }
        i();
        return this.f260c.c().getInt(this.l, i);
    }

    public String g(String str) {
        if (!G()) {
            return str;
        }
        i();
        return this.f260c.c().getString(this.l, str);
    }

    public Set<String> h(Set<String> set) {
        if (!G()) {
            return set;
        }
        i();
        return this.f260c.c().getStringSet(this.l, set);
    }

    public void i() {
        q qVar = this.f260c;
    }

    public CharSequence j() {
        f fVar = this.L;
        return fVar != null ? fVar.a(this) : this.i;
    }

    public boolean k() {
        return !TextUtils.isEmpty(this.l);
    }

    public boolean l() {
        return this.p && this.u && this.v;
    }

    public void m() {
        c cVar = this.G;
        if (cVar != null) {
            o oVar = (o) cVar;
            int indexOf = oVar.f1568e.indexOf(this);
            if (indexOf != -1) {
                oVar.f313a.c(indexOf, 1, this);
            }
        }
    }

    public void n(boolean z) {
        List<Preference> list = this.H;
        if (list == null) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.get(i).s(z);
        }
    }

    public void o() {
        PreferenceScreen preferenceScreen;
        if (TextUtils.isEmpty(this.s)) {
            return;
        }
        String str = this.s;
        q qVar = this.f260c;
        Preference preference = null;
        if (qVar != null && (preferenceScreen = qVar.g) != null) {
            preference = preferenceScreen.H(str);
        }
        if (preference != null) {
            if (preference.H == null) {
                preference.H = new ArrayList();
            }
            preference.H.add(this);
            s(preference.F());
            return;
        }
        StringBuilder j = c.a.a.a.a.j("Dependency \"");
        j.append(this.s);
        j.append("\" not found for preference \"");
        j.append(this.l);
        j.append("\" (title: \"");
        j.append((Object) this.h);
        j.append("\"");
        throw new IllegalStateException(j.toString());
    }

    public void p(q qVar) {
        SharedPreferences sharedPreferences;
        long j;
        this.f260c = qVar;
        if (!this.f262e) {
            synchronized (qVar) {
                j = qVar.f1577b;
                qVar.f1577b = 1 + j;
            }
            this.f261d = j;
        }
        i();
        if (G()) {
            if (this.f260c != null) {
                i();
                sharedPreferences = this.f260c.c();
            } else {
                sharedPreferences = null;
            }
            if (sharedPreferences.contains(this.l)) {
                A(null);
                return;
            }
        }
        Object obj = this.t;
        if (obj != null) {
            A(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void q(b.q.t r9) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.q(b.q.t):void");
    }

    public void r() {
    }

    public void s(boolean z) {
        if (this.u == z) {
            this.u = !z;
            n(F());
            m();
        }
    }

    public void t() {
        List<Preference> list;
        PreferenceScreen preferenceScreen;
        String str = this.s;
        if (str != null) {
            q qVar = this.f260c;
            Preference preference = null;
            if (qVar != null && (preferenceScreen = qVar.g) != null) {
                preference = preferenceScreen.H(str);
            }
            if (preference == null || (list = preference.H) == null) {
                return;
            }
            list.remove(this);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.h;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence j = j();
        if (!TextUtils.isEmpty(j)) {
            sb.append(j);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public Object u(TypedArray typedArray, int i) {
        return null;
    }

    @Deprecated
    public void v(b.h.j.k0.b bVar) {
    }

    public void w(boolean z) {
        if (this.v == z) {
            this.v = !z;
            n(F());
            m();
        }
    }

    public void x(Parcelable parcelable) {
        this.J = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable y() {
        this.J = true;
        return AbsSavedState.EMPTY_STATE;
    }

    public void z(Object obj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0101, code lost:
    
        if (r5.hasValue(11) != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public Preference(android.content.Context r5, android.util.AttributeSet r6, int r7, int r8) {
        /*
            Method dump skipped, instructions count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }
}
