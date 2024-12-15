package c.c.a.a.q1.a0;

import c.c.a.a.q1.l;
import c.c.a.a.s0;
import c.c.a.a.z1.z;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class c extends e {

    /* renamed from: b, reason: collision with root package name */
    public long f2229b;

    public c() {
        super(new l());
        this.f2229b = -9223372036854775807L;
    }

    public static Object d(z zVar, int i) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(zVar.j()));
        }
        if (i == 1) {
            return Boolean.valueOf(zVar.p() == 1);
        }
        if (i == 2) {
            return f(zVar);
        }
        if (i != 3) {
            if (i == 8) {
                return e(zVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.valueOf(Double.longBitsToDouble(zVar.j())).doubleValue());
                zVar.B(2);
                return date;
            }
            int s = zVar.s();
            ArrayList arrayList = new ArrayList(s);
            for (int i2 = 0; i2 < s; i2++) {
                Object d2 = d(zVar, zVar.p());
                if (d2 != null) {
                    arrayList.add(d2);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String f2 = f(zVar);
            int p = zVar.p();
            if (p == 9) {
                return hashMap;
            }
            Object d3 = d(zVar, p);
            if (d3 != null) {
                hashMap.put(f2, d3);
            }
        }
    }

    public static HashMap<String, Object> e(z zVar) {
        int s = zVar.s();
        HashMap<String, Object> hashMap = new HashMap<>(s);
        for (int i = 0; i < s; i++) {
            String f2 = f(zVar);
            Object d2 = d(zVar, zVar.p());
            if (d2 != null) {
                hashMap.put(f2, d2);
            }
        }
        return hashMap;
    }

    public static String f(z zVar) {
        int u = zVar.u();
        int i = zVar.f3801b;
        zVar.B(u);
        return new String(zVar.f3800a, i, u);
    }

    @Override // c.c.a.a.q1.a0.e
    public boolean b(z zVar) {
        return true;
    }

    @Override // c.c.a.a.q1.a0.e
    public boolean c(z zVar, long j) {
        if (zVar.p() != 2) {
            throw new s0();
        }
        if (!"onMetaData".equals(f(zVar)) || zVar.p() != 8) {
            return false;
        }
        HashMap<String, Object> e2 = e(zVar);
        if (e2.containsKey("duration")) {
            double doubleValue = ((Double) e2.get("duration")).doubleValue();
            if (doubleValue > 0.0d) {
                this.f2229b = (long) (doubleValue * 1000000.0d);
            }
        }
        return false;
    }
}
