package b.f.b.l.k;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class h implements e {

    /* renamed from: d, reason: collision with root package name */
    public s f1011d;

    /* renamed from: f, reason: collision with root package name */
    public int f1013f;
    public int g;

    /* renamed from: a, reason: collision with root package name */
    public e f1008a = null;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1009b = false;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1010c = false;

    /* renamed from: e, reason: collision with root package name */
    public g f1012e = g.UNKNOWN;
    public int h = 1;
    public i i = null;
    public boolean j = false;
    public List<e> k = new ArrayList();
    public List<h> l = new ArrayList();

    public h(s sVar) {
        this.f1011d = sVar;
    }

    @Override // b.f.b.l.k.e
    public void a(e eVar) {
        Iterator<h> it = this.l.iterator();
        while (it.hasNext()) {
            if (!it.next().j) {
                return;
            }
        }
        this.f1010c = true;
        e eVar2 = this.f1008a;
        if (eVar2 != null) {
            eVar2.a(this);
        }
        if (this.f1009b) {
            this.f1011d.a(this);
            return;
        }
        h hVar = null;
        int i = 0;
        for (h hVar2 : this.l) {
            if (!(hVar2 instanceof i)) {
                i++;
                hVar = hVar2;
            }
        }
        if (hVar != null && i == 1 && hVar.j) {
            i iVar = this.i;
            if (iVar != null) {
                if (!iVar.j) {
                    return;
                } else {
                    this.f1013f = this.h * iVar.g;
                }
            }
            c(hVar.g + this.f1013f);
        }
        e eVar3 = this.f1008a;
        if (eVar3 != null) {
            eVar3.a(this);
        }
    }

    public void b() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.f1010c = false;
        this.f1009b = false;
    }

    public void c(int i) {
        if (this.j) {
            return;
        }
        this.j = true;
        this.g = i;
        for (e eVar : this.k) {
            eVar.a(eVar);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f1011d.f1030b.d0);
        sb.append(":");
        sb.append(this.f1012e);
        sb.append("(");
        sb.append(this.j ? Integer.valueOf(this.g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}
