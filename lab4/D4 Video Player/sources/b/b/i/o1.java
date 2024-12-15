package b.b.i;

import android.database.DataSetObserver;

/* loaded from: classes.dex */
public class o1 extends DataSetObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s1 f752a;

    public o1(s1 s1Var) {
        this.f752a = s1Var;
    }

    @Override // android.database.DataSetObserver
    public void onChanged() {
        if (this.f752a.b()) {
            this.f752a.f();
        }
    }

    @Override // android.database.DataSetObserver
    public void onInvalidated() {
        this.f752a.dismiss();
    }
}
