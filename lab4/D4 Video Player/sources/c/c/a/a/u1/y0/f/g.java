package c.c.a.a.u1.y0.f;

import android.text.TextUtils;
import c.c.a.a.l0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class g extends d {

    /* renamed from: e, reason: collision with root package name */
    public l0 f3232e;

    public g(d dVar, String str) {
        super(dVar, str, "QualityLevel");
    }

    public static List<byte[]> m(String str) {
        byte[][] bArr;
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            byte[] j = c.c.a.a.z1.l0.j(str);
            if (c.c.a.a.z1.h.c(j, 0)) {
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                do {
                    arrayList2.add(Integer.valueOf(i));
                    byte[] bArr2 = c.c.a.a.z1.h.f3745a;
                    i += bArr2.length;
                    int length = j.length - bArr2.length;
                    while (true) {
                        if (i > length) {
                            i = -1;
                            break;
                        }
                        if (c.c.a.a.z1.h.c(j, i)) {
                            break;
                        }
                        i++;
                    }
                } while (i != -1);
                byte[][] bArr3 = new byte[arrayList2.size()][];
                int i2 = 0;
                while (i2 < arrayList2.size()) {
                    int intValue = ((Integer) arrayList2.get(i2)).intValue();
                    int intValue2 = (i2 < arrayList2.size() + (-1) ? ((Integer) arrayList2.get(i2 + 1)).intValue() : j.length) - intValue;
                    byte[] bArr4 = new byte[intValue2];
                    System.arraycopy(j, intValue, bArr4, 0, intValue2);
                    bArr3[i2] = bArr4;
                    i2++;
                }
                bArr = bArr3;
            } else {
                bArr = null;
            }
            if (bArr == null) {
                arrayList.add(j);
            } else {
                Collections.addAll(arrayList, bArr);
            }
        }
        return arrayList;
    }

    @Override // c.c.a.a.u1.y0.f.d
    public Object b() {
        return this.f3232e;
    }

    @Override // c.c.a.a.u1.y0.f.d
    public void k(XmlPullParser xmlPullParser) {
        l0 s;
        int i;
        int intValue = ((Integer) c("Type")).intValue();
        String attributeValue = xmlPullParser.getAttributeValue(null, "Index");
        String str = (String) c("Name");
        int i2 = i(xmlPullParser, "Bitrate");
        String j = j(xmlPullParser, "FourCC");
        String str2 = (j.equalsIgnoreCase("H264") || j.equalsIgnoreCase("X264") || j.equalsIgnoreCase("AVC1") || j.equalsIgnoreCase("DAVC")) ? "video/avc" : (j.equalsIgnoreCase("AAC") || j.equalsIgnoreCase("AACL") || j.equalsIgnoreCase("AACH") || j.equalsIgnoreCase("AACP")) ? "audio/mp4a-latm" : (j.equalsIgnoreCase("TTML") || j.equalsIgnoreCase("DFXP")) ? "application/ttml+xml" : (j.equalsIgnoreCase("ac-3") || j.equalsIgnoreCase("dac3")) ? "audio/ac3" : (j.equalsIgnoreCase("ec-3") || j.equalsIgnoreCase("dec3")) ? "audio/eac3" : j.equalsIgnoreCase("dtsc") ? "audio/vnd.dts" : (j.equalsIgnoreCase("dtsh") || j.equalsIgnoreCase("dtsl")) ? "audio/vnd.dts.hd" : j.equalsIgnoreCase("dtse") ? "audio/vnd.dts.hd;profile=lbr" : j.equalsIgnoreCase("opus") ? "audio/opus" : null;
        if (intValue == 2) {
            s = l0.A(attributeValue, str, "video/mp4", str2, null, i2, i(xmlPullParser, "MaxWidth"), i(xmlPullParser, "MaxHeight"), -1.0f, m(xmlPullParser.getAttributeValue(null, "CodecPrivateData")), 0, 0);
        } else {
            int i3 = 0;
            if (intValue == 1) {
                if (str2 == null) {
                    str2 = "audio/mp4a-latm";
                }
                int i4 = i(xmlPullParser, "Channels");
                int i5 = i(xmlPullParser, "SamplingRate");
                List<byte[]> m = m(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (((ArrayList) m).isEmpty() && "audio/mp4a-latm".equals(str2)) {
                    int i6 = -1;
                    int i7 = 0;
                    while (true) {
                        int[] iArr = c.c.a.a.z1.h.f3746b;
                        if (i7 >= iArr.length) {
                            break;
                        }
                        if (i5 == iArr[i7]) {
                            i6 = i7;
                        }
                        i7++;
                    }
                    int i8 = -1;
                    while (true) {
                        int[] iArr2 = c.c.a.a.z1.h.f3747c;
                        if (i3 >= iArr2.length) {
                            break;
                        }
                        if (i4 == iArr2[i3]) {
                            i8 = i3;
                        }
                        i3++;
                    }
                    if (i5 == -1 || i8 == -1) {
                        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i5 + ", " + i4);
                    }
                    m = Collections.singletonList(c.c.a.a.z1.h.a(2, i6, i8));
                }
                s = l0.o(attributeValue, str, "audio/mp4", str2, null, i2, i4, i5, m, 0, 0, (String) c("Language"));
            } else if (intValue == 3) {
                String str3 = (String) c("Subtype");
                str3.hashCode();
                if (!str3.equals("CAPT")) {
                    i = str3.equals("DESC") ? 1024 : 64;
                    s = l0.w(attributeValue, str, "application/mp4", str2, null, i2, 0, i3, (String) c("Language"));
                }
                i3 = i;
                s = l0.w(attributeValue, str, "application/mp4", str2, null, i2, 0, i3, (String) c("Language"));
            } else {
                s = l0.s(attributeValue, str, "application/mp4", str2, null, i2, 0, 0, null);
            }
        }
        this.f3232e = s;
    }
}
