package b.b.i;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public class x0 extends w0 {
    @Override // b.b.i.w0, b.b.i.y0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // b.b.i.y0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
