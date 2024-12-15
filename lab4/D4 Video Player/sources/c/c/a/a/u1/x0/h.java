package c.c.a.a.u1.x0;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class h extends LinkedHashMap<Uri, byte[]> {
    public h() {
        super(8, 1.0f, false);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public byte[] get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (byte[]) super.get(obj);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public byte[] put(Uri uri, byte[] bArr) {
        Objects.requireNonNull(bArr);
        return (byte[]) super.put(uri, bArr);
    }

    @Override // java.util.LinkedHashMap
    public boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
        return size() > 4;
    }
}
