package b.b.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import b.b.i.b2;
import b.b.i.p2;
import b.b.i.u2;
import b.n.e;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Objects;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public abstract class l extends ComponentActivity implements m, b.h.b.a {
    public final b.l.b.q g;
    public final b.n.j h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public boolean m;
    public int n;
    public b.e.j<String> o;
    public n p;

    public l() {
        b.l.b.h hVar = new b.l.b.h(this);
        b.h.b.h.e(hVar, "callbacks == null");
        this.g = new b.l.b.q(hVar);
        this.h = new b.n.j(this);
        this.k = true;
    }

    public static void k(int i) {
        if ((i & (-65536)) != 0) {
            throw new IllegalArgumentException("Can only use lower 16 bits for requestCode");
        }
    }

    public static boolean p(b.l.b.z zVar, e.b bVar) {
        boolean z = false;
        for (Fragment fragment : zVar.f1514c.g()) {
            if (fragment != null) {
                b.l.b.h<?> hVar = fragment.s;
                if ((hVar == null ? null : hVar.f1414f) != null) {
                    z |= p(fragment.h(), bVar);
                }
                if (fragment.O.f1539b.compareTo(e.b.STARTED) >= 0) {
                    fragment.O.f(bVar);
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l().c(view, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x019d  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void attachBaseContext(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 499
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.b.c.l.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        m();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // b.b.c.m
    public void d(b.b.h.b bVar) {
    }

    @Override // b.h.b.i, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        m();
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.i);
        printWriter.print(" mResumed=");
        printWriter.print(this.j);
        printWriter.print(" mStopped=");
        printWriter.print(this.k);
        if (getApplication() != null) {
            b.o.a.a.b(this).a(str2, fileDescriptor, printWriter, strArr);
        }
        this.g.f1464a.f1413e.x(str, fileDescriptor, printWriter, strArr);
    }

    @Override // b.b.c.m
    public void f(b.b.h.b bVar) {
    }

    @Override // android.app.Activity
    public <T extends View> T findViewById(int i) {
        f0 f0Var = (f0) l();
        f0Var.y();
        return (T) f0Var.f431f.findViewById(i);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        f0 f0Var = (f0) l();
        if (f0Var.j == null) {
            f0Var.E();
            a aVar = f0Var.i;
            f0Var.j = new b.b.h.j(aVar != null ? aVar.b() : f0Var.f430e);
        }
        return f0Var.j;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        int i = u2.f823a;
        return super.getResources();
    }

    @Override // b.b.c.m
    public b.b.h.b h(b.b.h.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        l().e();
    }

    public final int j(Fragment fragment) {
        if (this.o.i() >= 65534) {
            throw new IllegalStateException("Too many pending Fragment activity results.");
        }
        while (true) {
            b.e.j<String> jVar = this.o;
            int i = this.n;
            if (jVar.f917b) {
                jVar.c();
            }
            if (b.e.e.a(jVar.f918c, jVar.f920e, i) < 0) {
                int i2 = this.n;
                this.o.g(i2, fragment.f225e);
                this.n = (this.n + 1) % 65534;
                return i2;
            }
            this.n = (this.n + 1) % 65534;
        }
    }

    public n l() {
        if (this.p == null) {
            b.e.d<WeakReference<n>> dVar = n.f467b;
            this.p = new f0(this, null, this, this);
        }
        return this.p;
    }

    public a m() {
        f0 f0Var = (f0) l();
        f0Var.E();
        return f0Var.i;
    }

    public b.l.b.z n() {
        return this.g.f1464a.f1413e;
    }

    public final void o() {
        while (p(n(), e.b.CREATED)) {
        }
    }

    @Override // android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        String g;
        this.g.a();
        int i3 = i >> 16;
        if (i3 == 0) {
            Object obj = b.h.b.b.f1117a;
            super.onActivityResult(i, i2, intent);
            return;
        }
        int i4 = i3 - 1;
        String d2 = this.o.d(i4);
        this.o.h(i4);
        if (d2 == null) {
            g = "Activity result delivered for unknown Fragment.";
        } else {
            Fragment I = this.g.f1464a.f1413e.I(d2);
            if (I != null) {
                I.D();
                return;
            }
            g = c.a.a.a.a.g("Activity result no fragment exists for who: ", d2);
        }
        Log.w("FragmentActivity", g);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.g.a();
        this.g.f1464a.f1413e.j(configuration);
        f0 f0Var = (f0) l();
        if (f0Var.z && f0Var.t) {
            f0Var.E();
            a aVar = f0Var.i;
            if (aVar != null) {
                r0 r0Var = (r0) aVar;
                r0Var.g(r0Var.f479a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        b.b.i.u a2 = b.b.i.u.a();
        Context context = f0Var.f430e;
        synchronized (a2) {
            b2 b2Var = a2.f816a;
            synchronized (b2Var) {
                b.e.f<WeakReference<Drawable.ConstantState>> fVar = b2Var.f654d.get(context);
                if (fVar != null) {
                    fVar.b();
                }
            }
        }
        f0Var.p(false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
    }

    @Override // androidx.activity.ComponentActivity, b.h.b.i, android.app.Activity
    public void onCreate(Bundle bundle) {
        n l = l();
        l.d();
        l.f(bundle);
        b.l.b.h<?> hVar = this.g.f1464a;
        hVar.f1413e.c(hVar, hVar, null);
        if (bundle != null) {
            Parcelable parcelable = bundle.getParcelable("android:support:fragments");
            b.l.b.h<?> hVar2 = this.g.f1464a;
            if (!(hVar2 instanceof b.n.s)) {
                throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
            }
            hVar2.f1413e.a0(parcelable);
            if (bundle.containsKey("android:support:next_request_index")) {
                this.n = bundle.getInt("android:support:next_request_index");
                int[] intArray = bundle.getIntArray("android:support:request_indicies");
                String[] stringArray = bundle.getStringArray("android:support:request_fragment_who");
                if (intArray == null || stringArray == null || intArray.length != stringArray.length) {
                    Log.w("FragmentActivity", "Invalid requestCode mapping in savedInstanceState.");
                } else {
                    this.o = new b.e.j<>(intArray.length);
                    for (int i = 0; i < intArray.length; i++) {
                        this.o.g(intArray[i], stringArray[i]);
                    }
                }
            }
        }
        if (this.o == null) {
            this.o = new b.e.j<>(10);
            this.n = 0;
        }
        super.onCreate(bundle);
        this.h.d(e.a.ON_CREATE);
        this.g.f1464a.f1413e.l();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i, Menu menu) {
        if (i != 0) {
            return super.onCreatePanelMenu(i, menu);
        }
        boolean onCreatePanelMenu = super.onCreatePanelMenu(i, menu);
        b.l.b.q qVar = this.g;
        return onCreatePanelMenu | qVar.f1464a.f1413e.m(menu, getMenuInflater());
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.g.f1464a.f1413e.f1517f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.g.f1464a.f1413e.n();
        this.h.d(e.a.ON_DESTROY);
        l().g();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if ((Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.g.f1464a.f1413e.o();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem) ? true : i != 0 ? i != 6 ? false : this.g.f1464a.f1413e.k(menuItem) : this.g.f1464a.f1413e.q(menuItem)) {
            return true;
        }
        a m = m();
        if (menuItem.getItemId() != 16908332 || m == null || (((p2) ((r0) m).f483e).f761b & 4) == 0) {
            return false;
        }
        return s();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean z) {
        this.g.f1464a.f1413e.p(z);
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.g.a();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i, Menu menu) {
        if (i == 0) {
            this.g.f1464a.f1413e.r(menu);
        }
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.j = false;
        this.g.f1464a.f1413e.v(3);
        this.h.d(e.a.ON_PAUSE);
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean z) {
        this.g.f1464a.f1413e.t(z);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((f0) l()).y();
    }

    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        this.h.d(e.a.ON_RESUME);
        b.l.b.z zVar = this.g.f1464a.f1413e;
        zVar.u = false;
        zVar.v = false;
        zVar.v(4);
        f0 f0Var = (f0) l();
        f0Var.E();
        a aVar = f0Var.i;
        if (aVar != null) {
            ((r0) aVar).u = true;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i, View view, Menu menu) {
        return i == 0 ? super.onPreparePanel(0, view, menu) | this.g.f1464a.f1413e.u(menu) : super.onPreparePanel(i, view, menu);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        String g;
        this.g.a();
        int i2 = (i >> 16) & 65535;
        if (i2 != 0) {
            int i3 = i2 - 1;
            String d2 = this.o.d(i3);
            this.o.h(i3);
            if (d2 == null) {
                g = "Activity result delivered for unknown Fragment.";
            } else {
                Fragment I = this.g.f1464a.f1413e.I(d2);
                if (I != null) {
                    I.V(i & 65535, strArr, iArr);
                    return;
                }
                g = c.a.a.a.a.g("Activity result no fragment exists for who: ", d2);
            }
            Log.w("FragmentActivity", g);
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        this.j = true;
        this.g.a();
        this.g.f1464a.f1413e.B(true);
    }

    @Override // androidx.activity.ComponentActivity, b.h.b.i, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        o();
        this.h.d(e.a.ON_STOP);
        Parcelable b0 = this.g.f1464a.f1413e.b0();
        if (b0 != null) {
            bundle.putParcelable("android:support:fragments", b0);
        }
        if (this.o.i() > 0) {
            bundle.putInt("android:support:next_request_index", this.n);
            int[] iArr = new int[this.o.i()];
            String[] strArr = new String[this.o.i()];
            for (int i = 0; i < this.o.i(); i++) {
                iArr[i] = this.o.f(i);
                strArr[i] = this.o.j(i);
            }
            bundle.putIntArray("android:support:request_indicies", iArr);
            bundle.putStringArray("android:support:request_fragment_who", strArr);
        }
        Objects.requireNonNull((f0) l());
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.k = false;
        if (!this.i) {
            this.i = true;
            b.l.b.z zVar = this.g.f1464a.f1413e;
            zVar.u = false;
            zVar.v = false;
            zVar.v(2);
        }
        this.g.a();
        this.g.f1464a.f1413e.B(true);
        this.h.d(e.a.ON_START);
        b.l.b.z zVar2 = this.g.f1464a.f1413e;
        zVar2.u = false;
        zVar2.v = false;
        zVar2.v(3);
        f0 f0Var = (f0) l();
        f0Var.K = true;
        f0Var.o();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.g.a();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.k = true;
        o();
        b.l.b.z zVar = this.g.f1464a.f1413e;
        zVar.v = true;
        zVar.v(2);
        this.h.d(e.a.ON_STOP);
        l().h();
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        l().n(charSequence);
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        m();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    public void q() {
    }

    public void r() {
    }

    public boolean s() {
        Intent p = b.h.b.h.p(this);
        if (p == null) {
            return false;
        }
        if (!shouldUpRecreateTask(p)) {
            navigateUpTo(p);
            return true;
        }
        ArrayList arrayList = new ArrayList();
        Intent p2 = b.h.b.h.p(this);
        if (p2 == null) {
            p2 = b.h.b.h.p(this);
        }
        if (p2 != null) {
            ComponentName component = p2.getComponent();
            if (component == null) {
                component = p2.resolveActivity(getPackageManager());
            }
            int size = arrayList.size();
            while (true) {
                try {
                    Intent q = b.h.b.h.q(this, component);
                    if (q == null) {
                        break;
                    }
                    arrayList.add(size, q);
                    component = q.getComponent();
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e2);
                }
            }
            arrayList.add(p2);
        }
        r();
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[arrayList.size()]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        Object obj = b.h.b.b.f1117a;
        startActivities(intentArr, null);
        try {
            finishAffinity();
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    @Override // android.app.Activity
    public void setContentView(int i) {
        l().k(i);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        l().l(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        l().m(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        super.setTheme(i);
        ((f0) l()).N = i;
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i) {
        if (!this.m && i != -1) {
            k(i);
        }
        super.startActivityForResult(intent, i);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4) {
        if (i != -1) {
            k(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4);
    }

    @Override // android.app.Activity
    public void startActivityForResult(Intent intent, int i, Bundle bundle) {
        if (!this.m && i != -1) {
            k(i);
        }
        super.startActivityForResult(intent, i, bundle);
    }

    @Override // android.app.Activity
    public void startIntentSenderForResult(IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        if (i != -1) {
            k(i);
        }
        super.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = this.g.f1464a.f1413e.f1517f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }
}
