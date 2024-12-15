package b.b.i;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public abstract class y0 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) z0.e(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
    }
}
