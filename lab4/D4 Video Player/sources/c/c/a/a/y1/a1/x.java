package c.c.a.a.y1.a1;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class x implements v {

    /* renamed from: c, reason: collision with root package name */
    public static final x f3604c = new x(Collections.emptyMap());

    /* renamed from: a, reason: collision with root package name */
    public int f3605a;

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, byte[]> f3606b;

    public x(Map<String, byte[]> map) {
        this.f3606b = Collections.unmodifiableMap(map);
    }

    public static boolean b(Map<String, byte[]> map, Map<String, byte[]> map2) {
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, byte[]> entry : map.entrySet()) {
            if (!Arrays.equals(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    public x a(w wVar) {
        byte[] bArr;
        HashMap hashMap = new HashMap(this.f3606b);
        Objects.requireNonNull(wVar);
        List unmodifiableList = Collections.unmodifiableList(new ArrayList(wVar.f3603b));
        for (int i = 0; i < unmodifiableList.size(); i++) {
            hashMap.remove(unmodifiableList.get(i));
        }
        HashMap hashMap2 = new HashMap(wVar.f3602a);
        for (Map.Entry entry : hashMap2.entrySet()) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr2 = (byte[]) value;
                entry.setValue(Arrays.copyOf(bArr2, bArr2.length));
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap2);
        for (String str : unmodifiableMap.keySet()) {
            Object obj = unmodifiableMap.get(str);
            if (obj instanceof Long) {
                bArr = ByteBuffer.allocate(8).putLong(((Long) obj).longValue()).array();
            } else if (obj instanceof String) {
                bArr = ((String) obj).getBytes(Charset.forName("UTF-8"));
            } else {
                if (!(obj instanceof byte[])) {
                    throw new IllegalArgumentException();
                }
                bArr = (byte[]) obj;
            }
            hashMap.put(str, bArr);
        }
        return b(this.f3606b, hashMap) ? this : new x(hashMap);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x.class != obj.getClass()) {
            return false;
        }
        return b(this.f3606b, ((x) obj).f3606b);
    }

    public int hashCode() {
        if (this.f3605a == 0) {
            int i = 0;
            for (Map.Entry<String, byte[]> entry : this.f3606b.entrySet()) {
                i += Arrays.hashCode(entry.getValue()) ^ entry.getKey().hashCode();
            }
            this.f3605a = i;
        }
        return this.f3605a;
    }
}
