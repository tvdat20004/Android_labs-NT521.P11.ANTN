package b.h.g;

import java.util.ArrayList;

/* loaded from: classes.dex */
public class d implements n<h> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1193a;

    public d(String str) {
        this.f1193a = str;
    }

    @Override // b.h.g.n
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(h hVar) {
        synchronized (i.f1205c) {
            b.e.i<String, ArrayList<n<h>>> iVar = i.f1206d;
            ArrayList<n<h>> arrayList = iVar.get(this.f1193a);
            if (arrayList == null) {
                return;
            }
            iVar.remove(this.f1193a);
            for (int i = 0; i < arrayList.size(); i++) {
                arrayList.get(i).a(hVar);
            }
        }
    }
}
