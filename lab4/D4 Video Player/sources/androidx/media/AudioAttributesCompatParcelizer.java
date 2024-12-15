package androidx.media;

import b.v.a;
import b.v.c;
import java.util.Objects;

/* loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(a aVar) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        c cVar = audioAttributesCompat.f245a;
        if (aVar.h(1)) {
            cVar = aVar.k();
        }
        audioAttributesCompat.f245a = (b.p.a) cVar;
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, a aVar) {
        Objects.requireNonNull(aVar);
        b.p.a aVar2 = audioAttributesCompat.f245a;
        aVar.l(1);
        aVar.o(aVar2);
    }
}
