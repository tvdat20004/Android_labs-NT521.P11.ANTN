package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import b.v.a;
import b.v.b;
import java.nio.charset.Charset;
import java.util.Objects;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(a aVar) {
        Parcelable parcelable;
        IconCompat iconCompat = new IconCompat();
        iconCompat.f192a = aVar.i(iconCompat.f192a, 1);
        byte[] bArr = iconCompat.f194c;
        if (aVar.h(2)) {
            b bVar = (b) aVar;
            int readInt = bVar.f1857e.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                bVar.f1857e.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f194c = bArr;
        iconCompat.f195d = aVar.j(iconCompat.f195d, 3);
        iconCompat.f196e = aVar.i(iconCompat.f196e, 4);
        iconCompat.f197f = aVar.i(iconCompat.f197f, 5);
        iconCompat.g = (ColorStateList) aVar.j(iconCompat.g, 6);
        String str = iconCompat.i;
        if (aVar.h(7)) {
            str = ((b) aVar).f1857e.readString();
        }
        iconCompat.i = str;
        iconCompat.h = PorterDuff.Mode.valueOf(str);
        switch (iconCompat.f192a) {
            case -1:
                parcelable = iconCompat.f195d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f193b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                parcelable = iconCompat.f195d;
                if (parcelable == null) {
                    byte[] bArr3 = iconCompat.f194c;
                    iconCompat.f193b = bArr3;
                    iconCompat.f192a = 3;
                    iconCompat.f196e = 0;
                    iconCompat.f197f = bArr3.length;
                    return iconCompat;
                }
                iconCompat.f193b = parcelable;
                return iconCompat;
            case 2:
            case 4:
            case 6:
                iconCompat.f193b = new String(iconCompat.f194c, Charset.forName("UTF-16"));
                return iconCompat;
            case 3:
                iconCompat.f193b = iconCompat.f194c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, a aVar) {
        Objects.requireNonNull(aVar);
        iconCompat.i = iconCompat.h.name();
        switch (iconCompat.f192a) {
            case -1:
            case 1:
            case 5:
                iconCompat.f195d = (Parcelable) iconCompat.f193b;
                break;
            case 2:
                iconCompat.f194c = ((String) iconCompat.f193b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f194c = (byte[]) iconCompat.f193b;
                break;
            case 4:
            case 6:
                iconCompat.f194c = iconCompat.f193b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f192a;
        if (-1 != i) {
            aVar.m(i, 1);
        }
        byte[] bArr = iconCompat.f194c;
        if (bArr != null) {
            aVar.l(2);
            b bVar = (b) aVar;
            if (bArr != null) {
                bVar.f1857e.writeInt(bArr.length);
                bVar.f1857e.writeByteArray(bArr);
            } else {
                bVar.f1857e.writeInt(-1);
            }
        }
        Parcelable parcelable = iconCompat.f195d;
        if (parcelable != null) {
            aVar.n(parcelable, 3);
        }
        int i2 = iconCompat.f196e;
        if (i2 != 0) {
            aVar.m(i2, 4);
        }
        int i3 = iconCompat.f197f;
        if (i3 != 0) {
            aVar.m(i3, 5);
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            aVar.n(colorStateList, 6);
        }
        String str = iconCompat.i;
        if (str != null) {
            aVar.l(7);
            ((b) aVar).f1857e.writeString(str);
        }
    }
}
