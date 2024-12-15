package b.s;

import android.os.Bundle;
import androidx.savedstate.Recreator;
import b.n.e;
import b.n.f;
import b.n.h;
import b.n.j;
import b.s.a;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final c f1723a;

    /* renamed from: b, reason: collision with root package name */
    public final a f1724b = new a();

    public b(c cVar) {
        this.f1723a = cVar;
    }

    public void a(Bundle bundle) {
        e g = this.f1723a.g();
        if (((j) g).f1539b != e.b.INITIALIZED) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        g.a(new Recreator(this.f1723a));
        final a aVar = this.f1724b;
        if (aVar.f1720c) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        if (bundle != null) {
            aVar.f1719b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
        }
        g.a(new f() { // from class: androidx.savedstate.SavedStateRegistry$1
            @Override // b.n.f
            public void d(h hVar, e.a aVar2) {
                a aVar3;
                boolean z;
                if (aVar2 == e.a.ON_START) {
                    aVar3 = a.this;
                    z = true;
                } else {
                    if (aVar2 != e.a.ON_STOP) {
                        return;
                    }
                    aVar3 = a.this;
                    z = false;
                }
                aVar3.f1722e = z;
            }
        });
        aVar.f1720c = true;
    }

    public void b(Bundle bundle) {
        a aVar = this.f1724b;
        Objects.requireNonNull(aVar);
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = aVar.f1719b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        b.c.a.b.e<String, a.b>.a b2 = aVar.f1718a.b();
        while (b2.hasNext()) {
            Map.Entry entry = (Map.Entry) b2.next();
            String str = (String) entry.getKey();
            Recreator.a aVar2 = (Recreator.a) ((a.b) entry.getValue());
            Objects.requireNonNull(aVar2);
            Bundle bundle4 = new Bundle();
            bundle4.putStringArrayList("classes_to_restore", new ArrayList<>(aVar2.f391a));
            bundle2.putBundle(str, bundle4);
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
