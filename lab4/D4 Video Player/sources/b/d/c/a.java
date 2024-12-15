package b.d.c;

import androidx.cardview.widget.CardView;

/* loaded from: classes.dex */
public class a implements c {
    public final d a(b bVar) {
        return (d) ((CardView.a) bVar).f147a;
    }

    public void b(b bVar, float f2) {
        d a2 = a(bVar);
        CardView.a aVar = (CardView.a) bVar;
        boolean useCompatPadding = CardView.this.getUseCompatPadding();
        boolean a3 = aVar.a();
        if (f2 != a2.f872e || a2.f873f != useCompatPadding || a2.g != a3) {
            a2.f872e = f2;
            a2.f873f = useCompatPadding;
            a2.g = a3;
            a2.c(null);
            a2.invalidateSelf();
        }
        if (!CardView.this.getUseCompatPadding()) {
            aVar.b(0, 0, 0, 0);
            return;
        }
        float f3 = a(bVar).f872e;
        float f4 = a(bVar).f868a;
        int ceil = (int) Math.ceil(e.a(f3, f4, aVar.a()));
        int ceil2 = (int) Math.ceil(e.b(f3, f4, aVar.a()));
        aVar.b(ceil, ceil2, ceil, ceil2);
    }
}
