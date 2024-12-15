package c.c.a.b.l;

import android.widget.BaseAdapter;
import java.util.Calendar;

/* loaded from: classes.dex */
public class x extends BaseAdapter {

    /* renamed from: f, reason: collision with root package name */
    public static final int f3941f = g0.e().getMaximum(4);

    /* renamed from: b, reason: collision with root package name */
    public final w f3942b;

    /* renamed from: c, reason: collision with root package name */
    public final f<?> f3943c;

    /* renamed from: d, reason: collision with root package name */
    public e f3944d;

    /* renamed from: e, reason: collision with root package name */
    public final b f3945e;

    public x(w wVar, f<?> fVar, b bVar) {
        this.f3942b = wVar;
        this.f3943c = fVar;
        this.f3945e = bVar;
    }

    public int a() {
        return this.f3942b.m();
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i) {
        if (i < this.f3942b.m() || i > c()) {
            return null;
        }
        w wVar = this.f3942b;
        int m = (i - wVar.m()) + 1;
        Calendar b2 = g0.b(wVar.f3936b);
        b2.set(5, m);
        return Long.valueOf(b2.getTimeInMillis());
    }

    public int c() {
        return (this.f3942b.m() + this.f3942b.g) - 1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return a() + this.f3942b.g;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f3942b.f3940f;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00e9  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a.b.l.x.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
