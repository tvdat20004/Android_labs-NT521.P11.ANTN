package c.c.a.a.m1;

import android.annotation.TargetApi;
import android.media.AudioAttributes;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final l f2120b = new l(0, 0, 1, null);

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f2121a;

    public l(int i, int i2, int i3, k kVar) {
    }

    @TargetApi(21)
    public AudioAttributes a() {
        if (this.f2121a == null) {
            this.f2121a = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1).build();
        }
        return this.f2121a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || l.class != obj.getClass()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return 506448;
    }
}
