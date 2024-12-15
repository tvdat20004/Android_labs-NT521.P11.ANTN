package b.q;

import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.preference.DialogPreference;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.q.q;
import java.util.Objects;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public abstract class j extends Fragment implements q.c, q.a, q.b, DialogPreference.a {
    public q U;
    public RecyclerView V;
    public boolean W;
    public boolean X;
    public final c T = new c();
    public int Y = R.layout.preference_list_fragment;
    public Handler Z = new a();
    public final Runnable a0 = new b();

    public class a extends Handler {
        public a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what != 1) {
                return;
            }
            j jVar = j.this;
            PreferenceScreen preferenceScreen = jVar.U.g;
            if (preferenceScreen != null) {
                jVar.V.setAdapter(new o(preferenceScreen));
                preferenceScreen.o();
            }
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = j.this.V;
            recyclerView.focusableViewAvailable(recyclerView);
        }
    }

    public class c extends RecyclerView.l {

        /* renamed from: a, reason: collision with root package name */
        public Drawable f1556a;

        /* renamed from: b, reason: collision with root package name */
        public int f1557b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f1558c = true;

        public c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void a(Rect rect, View view, RecyclerView recyclerView, RecyclerView.x xVar) {
            if (d(view, recyclerView)) {
                rect.bottom = this.f1557b;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.l
        public void c(Canvas canvas, RecyclerView recyclerView, RecyclerView.x xVar) {
            if (this.f1556a == null) {
                return;
            }
            int childCount = recyclerView.getChildCount();
            int width = recyclerView.getWidth();
            for (int i = 0; i < childCount; i++) {
                View childAt = recyclerView.getChildAt(i);
                if (d(childAt, recyclerView)) {
                    int height = childAt.getHeight() + ((int) childAt.getY());
                    this.f1556a.setBounds(0, height, width, this.f1557b + height);
                    this.f1556a.draw(canvas);
                }
            }
        }

        public final boolean d(View view, RecyclerView recyclerView) {
            RecyclerView.a0 J = recyclerView.J(view);
            boolean z = false;
            if (!((J instanceof t) && ((t) J).v)) {
                return false;
            }
            boolean z2 = this.f1558c;
            int indexOfChild = recyclerView.indexOfChild(view);
            if (indexOfChild >= recyclerView.getChildCount() - 1) {
                return z2;
            }
            RecyclerView.a0 J2 = recyclerView.J(recyclerView.getChildAt(indexOfChild + 1));
            if ((J2 instanceof t) && ((t) J2).u) {
                z = true;
            }
            return z;
        }
    }

    public interface d {
    }

    @Override // androidx.fragment.app.Fragment
    public void I(Bundle bundle) {
        super.I(bundle);
        TypedValue typedValue = new TypedValue();
        d().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        d().getTheme().applyStyle(i, false);
        q qVar = new q(i());
        this.U = qVar;
        qVar.j = this;
        Bundle bundle2 = this.f226f;
        q0(bundle, bundle2 != null ? bundle2.getString("androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT") : null);
    }

    @Override // androidx.fragment.app.Fragment
    public View L(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = i().obtainStyledAttributes(null, v.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.Y = obtainStyledAttributes.getResourceId(0, this.Y);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(i());
        View inflate = cloneInContext.inflate(this.Y, viewGroup, false);
        View findViewById = inflate.findViewById(android.R.id.list_container);
        if (!(findViewById instanceof ViewGroup)) {
            throw new IllegalStateException("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        }
        ViewGroup viewGroup2 = (ViewGroup) findViewById;
        RecyclerView r0 = r0(cloneInContext, viewGroup2);
        if (r0 == null) {
            throw new RuntimeException("Could not create RecyclerView");
        }
        this.V = r0;
        r0.g(this.T);
        c cVar = this.T;
        Objects.requireNonNull(cVar);
        cVar.f1557b = drawable != null ? drawable.getIntrinsicHeight() : 0;
        cVar.f1556a = drawable;
        j.this.V.O();
        if (dimensionPixelSize != -1) {
            c cVar2 = this.T;
            cVar2.f1557b = dimensionPixelSize;
            j.this.V.O();
        }
        this.T.f1558c = z;
        if (this.V.getParent() == null) {
            viewGroup2.addView(this.V);
        }
        this.Z.post(this.a0);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void M() {
        this.Z.removeCallbacks(this.a0);
        this.Z.removeMessages(1);
        if (this.W) {
            this.V.setAdapter(null);
            PreferenceScreen preferenceScreen = this.U.g;
            if (preferenceScreen != null) {
                preferenceScreen.t();
            }
        }
        this.V = null;
        this.C = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void W(Bundle bundle) {
        PreferenceScreen preferenceScreen = this.U.g;
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.b(bundle2);
            bundle.putBundle("android:preferences", bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void X() {
        this.C = true;
        q qVar = this.U;
        qVar.h = this;
        qVar.i = this;
    }

    @Override // androidx.fragment.app.Fragment
    public void Y() {
        this.C = true;
        q qVar = this.U;
        qVar.h = null;
        qVar.i = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void Z(View view, Bundle bundle) {
        PreferenceScreen preferenceScreen;
        Bundle bundle2;
        PreferenceScreen preferenceScreen2;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreen2 = this.U.g) != null) {
            preferenceScreen2.a(bundle2);
        }
        if (this.W && (preferenceScreen = this.U.g) != null) {
            this.V.setAdapter(new o(preferenceScreen));
            preferenceScreen.o();
        }
        this.X = true;
    }

    public abstract void q0(Bundle bundle, String str);

    public RecyclerView r0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView;
        if (i().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
        i();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView2.setAccessibilityDelegateCompat(new s(recyclerView2));
        return recyclerView2;
    }
}
