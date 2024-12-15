package b.r.b;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class u implements Runnable {

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal<u> f1685f = new ThreadLocal<>();
    public static Comparator<v> g = new t();

    /* renamed from: c, reason: collision with root package name */
    public long f1687c;

    /* renamed from: d, reason: collision with root package name */
    public long f1688d;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList<RecyclerView> f1686b = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    public ArrayList<v> f1689e = new ArrayList<>();

    @SuppressLint({"VisibleForTests"})
    public static class a implements RecyclerView.m.a {

        /* renamed from: a, reason: collision with root package name */
        public int f1690a;

        /* renamed from: b, reason: collision with root package name */
        public int f1691b;

        /* renamed from: c, reason: collision with root package name */
        public int[] f1692c;

        /* renamed from: d, reason: collision with root package name */
        public int f1693d;

        public void a(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            }
            if (i2 < 0) {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
            int i3 = this.f1693d * 2;
            int[] iArr = this.f1692c;
            if (iArr == null) {
                int[] iArr2 = new int[4];
                this.f1692c = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i3 >= iArr.length) {
                int[] iArr3 = new int[i3 * 2];
                this.f1692c = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            }
            int[] iArr4 = this.f1692c;
            iArr4[i3] = i;
            iArr4[i3 + 1] = i2;
            this.f1693d++;
        }

        public void b(RecyclerView recyclerView, boolean z) {
            this.f1693d = 0;
            int[] iArr = this.f1692c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.m mVar = recyclerView.n;
            if (recyclerView.m == null || mVar == null || !mVar.k) {
                return;
            }
            if (z) {
                if (!recyclerView.f302e.g()) {
                    mVar.j(recyclerView.m.a(), this);
                }
            } else if (!recyclerView.M()) {
                mVar.i(this.f1690a, this.f1691b, recyclerView.h0, this);
            }
            int i = this.f1693d;
            if (i > mVar.l) {
                mVar.l = i;
                mVar.m = z;
                recyclerView.f300c.l();
            }
        }

        public boolean c(int i) {
            if (this.f1692c != null) {
                int i2 = this.f1693d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f1692c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public void a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f1687c == 0) {
            this.f1687c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        a aVar = recyclerView.g0;
        aVar.f1690a = i;
        aVar.f1691b = i2;
    }

    public void b(long j) {
        v vVar;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        v vVar2;
        int size = this.f1686b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = this.f1686b.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                recyclerView3.g0.b(recyclerView3, false);
                i += recyclerView3.g0.f1693d;
            }
        }
        this.f1689e.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = this.f1686b.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                a aVar = recyclerView4.g0;
                int abs = Math.abs(aVar.f1691b) + Math.abs(aVar.f1690a);
                for (int i5 = 0; i5 < aVar.f1693d * 2; i5 += 2) {
                    if (i3 >= this.f1689e.size()) {
                        vVar2 = new v();
                        this.f1689e.add(vVar2);
                    } else {
                        vVar2 = this.f1689e.get(i3);
                    }
                    int[] iArr = aVar.f1692c;
                    int i6 = iArr[i5 + 1];
                    vVar2.f1694a = i6 <= abs;
                    vVar2.f1695b = abs;
                    vVar2.f1696c = i6;
                    vVar2.f1697d = recyclerView4;
                    vVar2.f1698e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f1689e, g);
        for (int i7 = 0; i7 < this.f1689e.size() && (recyclerView = (vVar = this.f1689e.get(i7)).f1697d) != null; i7++) {
            RecyclerView.a0 c2 = c(recyclerView, vVar.f1698e, vVar.f1694a ? Long.MAX_VALUE : j);
            if (c2 != null && c2.f306b != null && c2.j() && !c2.k() && (recyclerView2 = c2.f306b.get()) != null) {
                if (recyclerView2.D && recyclerView2.f303f.h() != 0) {
                    recyclerView2.e0();
                }
                a aVar2 = recyclerView2.g0;
                aVar2.b(recyclerView2, true);
                if (aVar2.f1693d != 0) {
                    try {
                        int i8 = b.h.f.b.f1181a;
                        Trace.beginSection("RV Nested Prefetch");
                        RecyclerView.x xVar = recyclerView2.h0;
                        RecyclerView.e eVar = recyclerView2.m;
                        xVar.f357d = 1;
                        xVar.f358e = eVar.a();
                        xVar.g = false;
                        xVar.h = false;
                        xVar.i = false;
                        for (int i9 = 0; i9 < aVar2.f1693d * 2; i9 += 2) {
                            c(recyclerView2, aVar2.f1692c[i9], j);
                        }
                        Trace.endSection();
                    } catch (Throwable th) {
                        int i10 = b.h.f.b.f1181a;
                        Trace.endSection();
                        throw th;
                    }
                } else {
                    continue;
                }
            }
            vVar.f1694a = false;
            vVar.f1695b = 0;
            vVar.f1696c = 0;
            vVar.f1697d = null;
            vVar.f1698e = 0;
        }
    }

    public final RecyclerView.a0 c(RecyclerView recyclerView, int i, long j) {
        boolean z;
        int h = recyclerView.f303f.h();
        int i2 = 0;
        while (true) {
            if (i2 >= h) {
                z = false;
                break;
            }
            RecyclerView.a0 K = RecyclerView.K(recyclerView.f303f.g(i2));
            if (K.f307c == i && !K.k()) {
                z = true;
                break;
            }
            i2++;
        }
        if (z) {
            return null;
        }
        RecyclerView.s sVar = recyclerView.f300c;
        try {
            recyclerView.V();
            RecyclerView.a0 j2 = sVar.j(i, false, j);
            if (j2 != null) {
                if (!j2.j() || j2.k()) {
                    sVar.a(j2, false);
                } else {
                    sVar.g(j2.f305a);
                }
            }
            return j2;
        } finally {
            recyclerView.W(false);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            int i = b.h.f.b.f1181a;
            Trace.beginSection("RV Prefetch");
            if (this.f1686b.isEmpty()) {
                this.f1687c = 0L;
                Trace.endSection();
                return;
            }
            int size = this.f1686b.size();
            long j = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = this.f1686b.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j = Math.max(recyclerView.getDrawingTime(), j);
                }
            }
            if (j == 0) {
                this.f1687c = 0L;
                Trace.endSection();
            } else {
                b(TimeUnit.MILLISECONDS.toNanos(j) + this.f1688d);
                this.f1687c = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f1687c = 0L;
            int i3 = b.h.f.b.f1181a;
            Trace.endSection();
            throw th;
        }
    }
}
