package b.b.h;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class d extends ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public int f525a;

    /* renamed from: b, reason: collision with root package name */
    public Resources.Theme f526b;

    /* renamed from: c, reason: collision with root package name */
    public LayoutInflater f527c;

    /* renamed from: d, reason: collision with root package name */
    public Configuration f528d;

    /* renamed from: e, reason: collision with root package name */
    public Resources f529e;

    public d(Context context, int i) {
        super(context);
        this.f525a = i;
    }

    public void a(Configuration configuration) {
        if (this.f529e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f528d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f528d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f526b == null) {
            this.f526b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f526b.setTo(theme);
            }
        }
        this.f526b.applyStyle(this.f525a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f529e == null) {
            Configuration configuration = this.f528d;
            this.f529e = configuration == null ? super.getResources() : createConfigurationContext(configuration).getResources();
        }
        return this.f529e;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f527c == null) {
            this.f527c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f527c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f526b;
        if (theme != null) {
            return theme;
        }
        if (this.f525a == 0) {
            this.f525a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f526b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        if (this.f525a != i) {
            this.f525a = i;
            b();
        }
    }
}
