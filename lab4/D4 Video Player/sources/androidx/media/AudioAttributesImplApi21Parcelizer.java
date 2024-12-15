package androidx.media;

import android.media.AudioAttributes;
import b.v.a;
import java.util.Objects;

/* loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(a aVar) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f246a = (AudioAttributes) aVar.j(audioAttributesImplApi21.f246a, 1);
        audioAttributesImplApi21.f247b = aVar.i(audioAttributesImplApi21.f247b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, a aVar) {
        Objects.requireNonNull(aVar);
        aVar.n(audioAttributesImplApi21.f246a, 1);
        aVar.m(audioAttributesImplApi21.f247b, 2);
    }
}
