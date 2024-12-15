package c.c.a.a.o1;

import java.util.Objects;

/* loaded from: classes.dex */
public class i extends Thread {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f2184b;

    public i(j jVar) {
        this.f2184b = jVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        j jVar = this.f2184b;
        Objects.requireNonNull(jVar);
        do {
            try {
            } catch (InterruptedException e2) {
                throw new IllegalStateException(e2);
            }
        } while (jVar.g());
    }
}
