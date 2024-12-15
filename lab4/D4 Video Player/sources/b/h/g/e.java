package b.h.g;

import java.util.Comparator;

/* loaded from: classes.dex */
public class e implements Comparator<byte[]> {
    @Override // java.util.Comparator
    public int compare(byte[] bArr, byte[] bArr2) {
        int i;
        int i2;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == bArr4.length) {
            for (int i3 = 0; i3 < bArr3.length; i3++) {
                if (bArr3[i3] != bArr4[i3]) {
                    i = bArr3[i3];
                    i2 = bArr4[i3];
                }
            }
            return 0;
        }
        i = bArr3.length;
        i2 = bArr4.length;
        return i - i2;
    }
}
