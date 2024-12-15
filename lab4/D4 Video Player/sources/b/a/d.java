package b.a;

import androidx.activity.OnBackPressedDispatcher;
import b.l.b.u;

/* loaded from: classes.dex */
public class d implements a {

    /* renamed from: a, reason: collision with root package name */
    public final u f396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ OnBackPressedDispatcher f397b;

    public d(OnBackPressedDispatcher onBackPressedDispatcher, u uVar) {
        this.f397b = onBackPressedDispatcher;
        this.f396a = uVar;
    }

    @Override // b.a.a
    public void cancel() {
        this.f397b.f45b.remove(this.f396a);
        this.f396a.f1490b.remove(this);
    }
}
