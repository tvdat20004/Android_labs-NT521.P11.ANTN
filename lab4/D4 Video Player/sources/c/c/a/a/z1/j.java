package c.c.a.a.z1;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3753a;

    public synchronized boolean a() {
        if (this.f3753a) {
            return false;
        }
        this.f3753a = true;
        notifyAll();
        return true;
    }
}
