package androidx.core.app;

import android.app.PendingIntent;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import b.v.a;
import b.v.b;
import b.v.c;
import java.util.Objects;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        c cVar = remoteActionCompat.f181a;
        if (aVar.h(1)) {
            cVar = aVar.k();
        }
        remoteActionCompat.f181a = (IconCompat) cVar;
        remoteActionCompat.f182b = aVar.g(remoteActionCompat.f182b, 2);
        remoteActionCompat.f183c = aVar.g(remoteActionCompat.f183c, 3);
        remoteActionCompat.f184d = (PendingIntent) aVar.j(remoteActionCompat.f184d, 4);
        remoteActionCompat.f185e = aVar.f(remoteActionCompat.f185e, 5);
        remoteActionCompat.f186f = aVar.f(remoteActionCompat.f186f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        Objects.requireNonNull(aVar);
        IconCompat iconCompat = remoteActionCompat.f181a;
        aVar.l(1);
        aVar.o(iconCompat);
        CharSequence charSequence = remoteActionCompat.f182b;
        aVar.l(2);
        b bVar = (b) aVar;
        TextUtils.writeToParcel(charSequence, bVar.f1857e, 0);
        CharSequence charSequence2 = remoteActionCompat.f183c;
        aVar.l(3);
        TextUtils.writeToParcel(charSequence2, bVar.f1857e, 0);
        aVar.n(remoteActionCompat.f184d, 4);
        boolean z = remoteActionCompat.f185e;
        aVar.l(5);
        bVar.f1857e.writeInt(z ? 1 : 0);
        boolean z2 = remoteActionCompat.f186f;
        aVar.l(6);
        bVar.f1857e.writeInt(z2 ? 1 : 0);
    }
}
