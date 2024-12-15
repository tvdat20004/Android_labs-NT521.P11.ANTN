package b.f.c;

import android.content.Context;

/* loaded from: classes.dex */
public class a extends d {
    public int h;
    public int i;
    public b.f.b.l.a j;

    public a(Context context) {
        super(context);
        setVisibility(8);
    }

    public int getMargin() {
        return this.j.p0;
    }

    public int getType() {
        return this.h;
    }

    public void setAllowsGoneWidget(boolean z) {
        this.j.o0 = z;
    }

    public void setDpMargin(int i) {
        this.j.p0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.j.p0 = i;
    }

    public void setType(int i) {
        this.h = i;
    }
}
