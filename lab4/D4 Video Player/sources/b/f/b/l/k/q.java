package b.f.b.l.k;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public class q {

    /* renamed from: f, reason: collision with root package name */
    public static int f1018f;

    /* renamed from: b, reason: collision with root package name */
    public int f1020b;

    /* renamed from: c, reason: collision with root package name */
    public int f1021c;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<b.f.b.l.d> f1019a = new ArrayList<>();

    /* renamed from: d, reason: collision with root package name */
    public ArrayList<p> f1022d = null;

    /* renamed from: e, reason: collision with root package name */
    public int f1023e = -1;

    public q(int i) {
        this.f1020b = -1;
        this.f1021c = 0;
        int i2 = f1018f;
        f1018f = i2 + 1;
        this.f1020b = i2;
        this.f1021c = i;
    }

    public boolean a(b.f.b.l.d dVar) {
        if (this.f1019a.contains(dVar)) {
            return false;
        }
        this.f1019a.add(dVar);
        return true;
    }

    public void b(ArrayList<q> arrayList) {
        int size = this.f1019a.size();
        if (this.f1023e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                q qVar = arrayList.get(i);
                if (this.f1023e == qVar.f1020b) {
                    d(this.f1021c, qVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public int c(b.f.b.e eVar, int i) {
        int o;
        b.f.b.l.c cVar;
        if (this.f1019a.size() == 0) {
            return 0;
        }
        ArrayList<b.f.b.l.d> arrayList = this.f1019a;
        b.f.b.l.e eVar2 = (b.f.b.l.e) arrayList.get(0).P;
        eVar.u();
        eVar2.c(eVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            arrayList.get(i2).c(eVar, false);
        }
        if (i == 0 && eVar2.t0 > 0) {
            b.d.a.a(eVar2, eVar, arrayList, 0);
        }
        if (i == 1 && eVar2.u0 > 0) {
            b.d.a.a(eVar2, eVar, arrayList, 1);
        }
        try {
            eVar.q();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f1022d = new ArrayList<>();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.f1022d.add(new p(this, arrayList.get(i3), eVar, i));
        }
        if (i == 0) {
            o = eVar.o(eVar2.D);
            cVar = eVar2.F;
        } else {
            o = eVar.o(eVar2.E);
            cVar = eVar2.G;
        }
        int o2 = eVar.o(cVar);
        eVar.u();
        return o2 - o;
    }

    public void d(int i, q qVar) {
        Iterator<b.f.b.l.d> it = this.f1019a.iterator();
        while (it.hasNext()) {
            b.f.b.l.d next = it.next();
            qVar.a(next);
            if (i == 0) {
                next.j0 = qVar.f1020b;
            } else {
                next.k0 = qVar.f1020b;
            }
        }
        this.f1023e = qVar.f1020b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f1021c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f1020b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator<b.f.b.l.d> it = this.f1019a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + it.next().d0;
        }
        return c.a.a.a.a.g(sb2, " >");
    }
}
