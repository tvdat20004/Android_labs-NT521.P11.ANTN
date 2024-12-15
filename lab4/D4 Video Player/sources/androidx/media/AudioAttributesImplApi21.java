package androidx.media;

import android.media.AudioAttributes;
import b.p.a;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21 implements a {

    /* renamed from: a, reason: collision with root package name */
    public AudioAttributes f246a;

    /* renamed from: b, reason: collision with root package name */
    public int f247b = -1;

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f246a.equals(((AudioAttributesImplApi21) obj).f246a);
        }
        return false;
    }

    public int hashCode() {
        return this.f246a.hashCode();
    }

    public String toString() {
        StringBuilder j = c.a.a.a.a.j("AudioAttributesCompat: audioattributes=");
        j.append(this.f246a);
        return j.toString();
    }
}
