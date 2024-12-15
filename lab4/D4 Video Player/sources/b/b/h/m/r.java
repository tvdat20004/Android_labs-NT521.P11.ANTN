package b.b.h.m;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public class r extends FrameLayout implements b.b.h.c {

    /* renamed from: b, reason: collision with root package name */
    public final CollapsibleActionView f624b;

    /* JADX WARN: Multi-variable type inference failed */
    public r(View view) {
        super(view.getContext());
        this.f624b = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // b.b.h.c
    public void c() {
        this.f624b.onActionViewExpanded();
    }

    @Override // b.b.h.c
    public void e() {
        this.f624b.onActionViewCollapsed();
    }
}
