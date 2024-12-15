package b.h.g;

import android.content.Context;
import android.graphics.Typeface;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public class b implements Callable<h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f1187a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f1188b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f1189c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f1190d;

    public b(Context context, a aVar, int i, String str) {
        this.f1187a = context;
        this.f1188b = aVar;
        this.f1189c = i;
        this.f1190d = str;
    }

    @Override // java.util.concurrent.Callable
    public h call() {
        h b2 = i.b(this.f1187a, this.f1188b, this.f1189c);
        Typeface typeface = b2.f1201a;
        if (typeface != null) {
            i.f1203a.b(this.f1190d, typeface);
        }
        return b2;
    }
}
