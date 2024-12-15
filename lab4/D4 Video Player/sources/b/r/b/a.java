package b.r.b;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a implements a0 {

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC0004a f1594d;

    /* renamed from: a, reason: collision with root package name */
    public b.h.i.c<b> f1591a = new b.h.i.c<>(30);

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f1592b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList<b> f1593c = new ArrayList<>();

    /* renamed from: f, reason: collision with root package name */
    public int f1596f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final b0 f1595e = new b0(this);

    /* renamed from: b.r.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0004a {
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f1597a;

        /* renamed from: b, reason: collision with root package name */
        public int f1598b;

        /* renamed from: c, reason: collision with root package name */
        public Object f1599c;

        /* renamed from: d, reason: collision with root package name */
        public int f1600d;

        public b(int i, int i2, int i3, Object obj) {
            this.f1597a = i;
            this.f1598b = i2;
            this.f1600d = i3;
            this.f1599c = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.f1597a;
            if (i != bVar.f1597a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f1600d - this.f1598b) == 1 && this.f1600d == bVar.f1598b && this.f1598b == bVar.f1600d) {
                return true;
            }
            if (this.f1600d != bVar.f1600d || this.f1598b != bVar.f1598b) {
                return false;
            }
            Object obj2 = this.f1599c;
            Object obj3 = bVar.f1599c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f1597a * 31) + this.f1598b) * 31) + this.f1600d;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            int i = this.f1597a;
            sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
            sb.append(",s:");
            sb.append(this.f1598b);
            sb.append("c:");
            sb.append(this.f1600d);
            sb.append(",p:");
            sb.append(this.f1599c);
            sb.append("]");
            return sb.toString();
        }
    }

    public a(InterfaceC0004a interfaceC0004a) {
        this.f1594d = interfaceC0004a;
    }

    public final boolean a(int i) {
        int size = this.f1593c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f1593c.get(i2);
            int i3 = bVar.f1597a;
            if (i3 == 8) {
                if (f(bVar.f1600d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f1598b;
                int i5 = bVar.f1600d + i4;
                while (i4 < i5) {
                    if (f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void b() {
        int size = this.f1593c.size();
        for (int i = 0; i < size; i++) {
            ((g0) this.f1594d).a(this.f1593c.get(i));
        }
        l(this.f1593c);
        this.f1596f = 0;
    }

    public void c() {
        b();
        int size = this.f1592b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f1592b.get(i);
            int i2 = bVar.f1597a;
            if (i2 == 1) {
                ((g0) this.f1594d).a(bVar);
                ((g0) this.f1594d).d(bVar.f1598b, bVar.f1600d);
            } else if (i2 == 2) {
                ((g0) this.f1594d).a(bVar);
                InterfaceC0004a interfaceC0004a = this.f1594d;
                int i3 = bVar.f1598b;
                int i4 = bVar.f1600d;
                g0 g0Var = (g0) interfaceC0004a;
                g0Var.f1621a.S(i3, i4, true);
                RecyclerView recyclerView = g0Var.f1621a;
                recyclerView.k0 = true;
                recyclerView.h0.f356c += i4;
            } else if (i2 == 4) {
                ((g0) this.f1594d).a(bVar);
                ((g0) this.f1594d).c(bVar.f1598b, bVar.f1600d, bVar.f1599c);
            } else if (i2 == 8) {
                ((g0) this.f1594d).a(bVar);
                ((g0) this.f1594d).e(bVar.f1598b, bVar.f1600d);
            }
        }
        l(this.f1592b);
        this.f1596f = 0;
    }

    public final void d(b bVar) {
        int i;
        int i2 = bVar.f1597a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m = m(bVar.f1598b, i2);
        int i3 = bVar.f1598b;
        int i4 = bVar.f1597a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f1600d; i6++) {
            int m2 = m((i * i6) + bVar.f1598b, bVar.f1597a);
            int i7 = bVar.f1597a;
            if (i7 == 2 ? m2 == m : i7 == 4 && m2 == m + 1) {
                i5++;
            } else {
                b h = h(i7, m, i5, bVar.f1599c);
                e(h, i3);
                k(h);
                if (bVar.f1597a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                m = m2;
            }
        }
        Object obj = bVar.f1599c;
        k(bVar);
        if (i5 > 0) {
            b h2 = h(bVar.f1597a, m, i5, obj);
            e(h2, i3);
            k(h2);
        }
    }

    public void e(b bVar, int i) {
        ((g0) this.f1594d).a(bVar);
        int i2 = bVar.f1597a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            ((g0) this.f1594d).c(i, bVar.f1600d, bVar.f1599c);
            return;
        }
        InterfaceC0004a interfaceC0004a = this.f1594d;
        int i3 = bVar.f1600d;
        g0 g0Var = (g0) interfaceC0004a;
        g0Var.f1621a.S(i, i3, true);
        RecyclerView recyclerView = g0Var.f1621a;
        recyclerView.k0 = true;
        recyclerView.h0.f356c += i3;
    }

    public int f(int i, int i2) {
        int size = this.f1593c.size();
        while (i2 < size) {
            b bVar = this.f1593c.get(i2);
            int i3 = bVar.f1597a;
            if (i3 == 8) {
                int i4 = bVar.f1598b;
                if (i4 == i) {
                    i = bVar.f1600d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f1600d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f1598b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f1600d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f1600d;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean g() {
        return this.f1592b.size() > 0;
    }

    public b h(int i, int i2, int i3, Object obj) {
        b a2 = this.f1591a.a();
        if (a2 == null) {
            return new b(i, i2, i3, obj);
        }
        a2.f1597a = i;
        a2.f1598b = i2;
        a2.f1600d = i3;
        a2.f1599c = obj;
        return a2;
    }

    public final void i(b bVar) {
        this.f1593c.add(bVar);
        int i = bVar.f1597a;
        if (i == 1) {
            ((g0) this.f1594d).d(bVar.f1598b, bVar.f1600d);
            return;
        }
        if (i == 2) {
            g0 g0Var = (g0) this.f1594d;
            g0Var.f1621a.S(bVar.f1598b, bVar.f1600d, false);
            g0Var.f1621a.k0 = true;
            return;
        }
        if (i == 4) {
            ((g0) this.f1594d).c(bVar.f1598b, bVar.f1600d, bVar.f1599c);
        } else if (i == 8) {
            ((g0) this.f1594d).e(bVar.f1598b, bVar.f1600d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x014b, code lost:
    
        if (r4 > r12.f1598b) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x017c, code lost:
    
        r2.set(r3, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0183, code lost:
    
        if (r11.f1598b == r11.f1600d) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0185, code lost:
    
        r2.set(r7, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018c, code lost:
    
        if (r6 == null) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x018e, code lost:
    
        r2.add(r3, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0189, code lost:
    
        r2.remove(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0177, code lost:
    
        r11.f1600d = r4 - r12.f1600d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0175, code lost:
    
        if (r4 >= r12.f1598b) goto L96;
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00a3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0009 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0122 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0113 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00cd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j() {
        /*
            Method dump skipped, instructions count: 663
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.r.b.a.j():void");
    }

    public void k(b bVar) {
        bVar.f1599c = null;
        this.f1591a.b(bVar);
    }

    public void l(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            k(list.get(i));
        }
        list.clear();
    }

    public final int m(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f1593c.size() - 1; size >= 0; size--) {
            b bVar = this.f1593c.get(size);
            int i9 = bVar.f1597a;
            if (i9 == 8) {
                int i10 = bVar.f1598b;
                int i11 = bVar.f1600d;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            bVar.f1598b = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            bVar.f1598b = i10 - 1;
                            i6 = i11 - 1;
                        }
                        bVar.f1600d = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    bVar.f1600d = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    bVar.f1598b = i7;
                    i--;
                }
            } else {
                int i12 = bVar.f1598b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    bVar.f1598b = i3;
                } else if (i9 == 1) {
                    i -= bVar.f1600d;
                } else if (i9 == 2) {
                    i += bVar.f1600d;
                }
            }
        }
        for (int size2 = this.f1593c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f1593c.get(size2);
            if (bVar2.f1597a == 8) {
                int i13 = bVar2.f1600d;
                if (i13 != bVar2.f1598b && i13 >= 0) {
                }
                this.f1593c.remove(size2);
                k(bVar2);
            } else {
                if (bVar2.f1600d > 0) {
                }
                this.f1593c.remove(size2);
                k(bVar2);
            }
        }
        return i;
    }
}
