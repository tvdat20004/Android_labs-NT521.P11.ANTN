package c.c.a.a.y1;

import java.io.FileNotFoundException;
import java.io.IOException;

/* loaded from: classes.dex */
public class z {
    public long a(IOException iOException) {
        if (!(iOException instanceof f0)) {
            return -9223372036854775807L;
        }
        int i = ((f0) iOException).f3621b;
        return (i == 404 || i == 410) ? 60000L : -9223372036854775807L;
    }

    public int b(int i) {
        return i == 7 ? 6 : 3;
    }

    public long c(IOException iOException, int i) {
        if ((iOException instanceof c.c.a.a.s0) || (iOException instanceof FileNotFoundException) || (iOException instanceof o0)) {
            return -9223372036854775807L;
        }
        return Math.min((i - 1) * 1000, 5000);
    }
}
