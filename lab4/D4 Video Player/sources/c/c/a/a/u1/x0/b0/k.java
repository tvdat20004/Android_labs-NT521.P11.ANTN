package c.c.a.a.u1.x0.b0;

import java.io.BufferedReader;
import java.util.Queue;

/* loaded from: classes.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public final BufferedReader f3144a;

    /* renamed from: b, reason: collision with root package name */
    public final Queue<String> f3145b;

    /* renamed from: c, reason: collision with root package name */
    public String f3146c;

    public k(Queue<String> queue, BufferedReader bufferedReader) {
        this.f3145b = queue;
        this.f3144a = bufferedReader;
    }

    public boolean a() {
        String trim;
        if (this.f3146c != null) {
            return true;
        }
        if (!this.f3145b.isEmpty()) {
            this.f3146c = this.f3145b.poll();
            return true;
        }
        do {
            String readLine = this.f3144a.readLine();
            this.f3146c = readLine;
            if (readLine == null) {
                return false;
            }
            trim = readLine.trim();
            this.f3146c = trim;
        } while (trim.isEmpty());
        return true;
    }

    public String b() {
        if (!a()) {
            return null;
        }
        String str = this.f3146c;
        this.f3146c = null;
        return str;
    }
}
