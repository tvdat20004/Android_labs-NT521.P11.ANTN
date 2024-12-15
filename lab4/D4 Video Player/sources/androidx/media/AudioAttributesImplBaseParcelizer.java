package androidx.media;

import b.v.a;
import java.util.Objects;

/* loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(a aVar) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f248a = aVar.i(audioAttributesImplBase.f248a, 1);
        audioAttributesImplBase.f249b = aVar.i(audioAttributesImplBase.f249b, 2);
        audioAttributesImplBase.f250c = aVar.i(audioAttributesImplBase.f250c, 3);
        audioAttributesImplBase.f251d = aVar.i(audioAttributesImplBase.f251d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, a aVar) {
        Objects.requireNonNull(aVar);
        aVar.m(audioAttributesImplBase.f248a, 1);
        aVar.m(audioAttributesImplBase.f249b, 2);
        aVar.m(audioAttributesImplBase.f250c, 3);
        aVar.m(audioAttributesImplBase.f251d, 4);
    }
}
