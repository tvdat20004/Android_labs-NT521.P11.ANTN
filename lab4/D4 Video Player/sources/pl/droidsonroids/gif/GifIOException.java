package pl.droidsonroids.gif;

import e.a.a.e;
import java.io.IOException;

/* loaded from: classes.dex */
public class GifIOException extends IOException {

    /* renamed from: b, reason: collision with root package name */
    public final e f4366b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4367c;

    public GifIOException(int i, String str) {
        e eVar;
        e[] values = e.values();
        int i2 = 0;
        while (true) {
            if (i2 >= 21) {
                eVar = e.UNKNOWN;
                eVar.f4307c = i;
                break;
            } else {
                eVar = values[i2];
                if (eVar.f4307c == i) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.f4366b = eVar;
        this.f4367c = str;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (this.f4367c == null) {
            return this.f4366b.a();
        }
        return this.f4366b.a() + ": " + this.f4367c;
    }
}
