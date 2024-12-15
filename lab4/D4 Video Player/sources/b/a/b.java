package b.a;

import androidx.activity.ComponentActivity;

/* loaded from: classes.dex */
public class b implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ComponentActivity f394b;

    public b(ComponentActivity componentActivity) {
        this.f394b = componentActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        super/*android.app.Activity*/.onBackPressed();
    }
}
