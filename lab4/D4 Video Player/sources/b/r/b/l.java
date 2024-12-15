package b.r.b;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public RecyclerView.a0 f1646a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView.a0 f1647b;

    /* renamed from: c, reason: collision with root package name */
    public int f1648c;

    /* renamed from: d, reason: collision with root package name */
    public int f1649d;

    /* renamed from: e, reason: collision with root package name */
    public int f1650e;

    /* renamed from: f, reason: collision with root package name */
    public int f1651f;

    public l(RecyclerView.a0 a0Var, RecyclerView.a0 a0Var2, int i, int i2, int i3, int i4) {
        this.f1646a = a0Var;
        this.f1647b = a0Var2;
        this.f1648c = i;
        this.f1649d = i2;
        this.f1650e = i3;
        this.f1651f = i4;
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("ChangeInfo{oldHolder=");
        j.append(this.f1646a);
        j.append(", newHolder=");
        j.append(this.f1647b);
        j.append(", fromX=");
        j.append(this.f1648c);
        j.append(", fromY=");
        j.append(this.f1649d);
        j.append(", toX=");
        j.append(this.f1650e);
        j.append(", toY=");
        j.append(this.f1651f);
        j.append('}');
        return j.toString();
    }
}
