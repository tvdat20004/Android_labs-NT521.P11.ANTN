package b.h.j;

import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* loaded from: classes.dex */
public class n implements View.OnApplyWindowInsetsListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k f1303a;

    public n(k kVar) {
        this.f1303a = kVar;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        Objects.requireNonNull(windowInsets);
        return this.f1303a.a(view, new j0(windowInsets)).g();
    }
}
