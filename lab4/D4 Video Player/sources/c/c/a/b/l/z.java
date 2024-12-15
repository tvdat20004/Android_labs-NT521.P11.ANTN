package c.c.a.b.l;

import android.os.Build;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class z extends RecyclerView.a0 {
    public final TextView t;
    public final MaterialCalendarGridView u;

    public z(LinearLayout linearLayout, boolean z) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.t = textView;
        WeakHashMap<View, b.h.j.y> weakHashMap = b.h.j.u.f1311a;
        b.h.j.q qVar = new b.h.j.q(R.id.tag_accessibility_heading, Boolean.class, 28);
        Boolean bool = Boolean.TRUE;
        if (Build.VERSION.SDK_INT >= 28) {
            qVar.d(textView, bool);
        } else if (qVar.e(qVar.c(textView), bool)) {
            b.h.j.b c2 = b.h.j.u.c(textView);
            b.h.j.u.i(textView, c2 == null ? new b.h.j.b() : c2);
            textView.setTag(qVar.f1304a, bool);
            b.h.j.u.e(textView, 0);
        }
        this.u = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z) {
            return;
        }
        textView.setVisibility(8);
    }
}
