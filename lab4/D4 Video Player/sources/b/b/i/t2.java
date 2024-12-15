package b.b.i;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class t2 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f808a;

    /* renamed from: b, reason: collision with root package name */
    public final View f809b;

    /* renamed from: c, reason: collision with root package name */
    public final TextView f810c;

    /* renamed from: d, reason: collision with root package name */
    public final WindowManager.LayoutParams f811d;

    /* renamed from: e, reason: collision with root package name */
    public final Rect f812e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f813f;
    public final int[] g;

    public t2(Context context) {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.f811d = layoutParams;
        this.f812e = new Rect();
        this.f813f = new int[2];
        this.g = new int[2];
        this.f808a = context;
        View inflate = LayoutInflater.from(context).inflate(R.layout.abc_tooltip, (ViewGroup) null);
        this.f809b = inflate;
        this.f810c = (TextView) inflate.findViewById(R.id.message);
        layoutParams.setTitle(t2.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = R.style.Animation_AppCompat_Tooltip;
        layoutParams.flags = 24;
    }

    public void a() {
        if (this.f809b.getParent() != null) {
            ((WindowManager) this.f808a.getSystemService("window")).removeView(this.f809b);
        }
    }
}
