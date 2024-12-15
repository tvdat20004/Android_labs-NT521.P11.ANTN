package c.c.a.a.v1.q;

import android.text.TextUtils;
import android.util.Log;
import c.c.a.a.v1.c;
import c.c.a.a.v1.e;
import c.c.a.a.x1.p;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.z;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class a extends c {
    public static final Pattern s = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)(?::|\\.)(\\d+)");
    public final boolean n;
    public int o;
    public int p;
    public int q;
    public int r;

    public a(List<byte[]> list) {
        super("SsaDecoder");
        String str;
        int i = 0;
        if (list == null || list.isEmpty()) {
            this.n = false;
            return;
        }
        this.n = true;
        byte[] bArr = list.get(0);
        int i2 = l0.f3761a;
        String str2 = new String(bArr, Charset.forName("UTF-8"));
        p.c(str2.startsWith("Format: "));
        l(str2);
        byte[] bArr2 = list.get(1);
        int length = bArr2.length;
        do {
            if (length - i == 0) {
                str = null;
            } else {
                int i3 = i;
                while (i3 < length && !l0.w(bArr2[i3])) {
                    i3++;
                }
                if (i3 - i >= 3 && bArr2[i] == -17 && bArr2[i + 1] == -69 && bArr2[i + 2] == -65) {
                    i += 3;
                }
                String i4 = l0.i(bArr2, i, i3 - i);
                if (i3 != length && ((bArr2[i3] != 13 || (i3 = i3 + 1) != length) && bArr2[i3] == 10)) {
                    i3++;
                }
                int i5 = i3;
                str = i4;
                i = i5;
            }
            if (str == null) {
                return;
            }
        } while (!str.startsWith("[Events]"));
    }

    public static long m(String str) {
        Matcher matcher = s.matcher(str);
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong(matcher.group(4)) * 10000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(2)) * 60 * 1000000) + (Long.parseLong(matcher.group(1)) * 60 * 60 * 1000000);
    }

    @Override // c.c.a.a.v1.c
    public e k(byte[] bArr, int i, boolean z) {
        StringBuilder sb;
        String str;
        long j;
        String e2;
        ArrayList arrayList = new ArrayList();
        long[] jArr = new long[32];
        z zVar = new z(bArr, i);
        if (!this.n) {
            do {
                e2 = zVar.e();
                if (e2 == null) {
                    break;
                }
            } while (!e2.startsWith("[Events]"));
        }
        int i2 = 0;
        while (true) {
            String e3 = zVar.e();
            if (e3 == null) {
                c.c.a.a.v1.b[] bVarArr = new c.c.a.a.v1.b[arrayList.size()];
                arrayList.toArray(bVarArr);
                return new b(bVarArr, Arrays.copyOf(jArr, i2));
            }
            if (!this.n && e3.startsWith("Format: ")) {
                l(e3);
            } else if (e3.startsWith("Dialogue: ")) {
                if (this.o == 0) {
                    sb = new StringBuilder();
                    str = "Skipping dialogue line before complete format: ";
                } else {
                    String[] split = e3.substring(10).split(",", this.o);
                    if (split.length != this.o) {
                        sb = new StringBuilder();
                        str = "Skipping dialogue line with fewer columns than format: ";
                    } else {
                        long m = m(split[this.p]);
                        if (m == -9223372036854775807L) {
                            sb = new StringBuilder();
                        } else {
                            String str2 = split[this.q];
                            if (str2.trim().isEmpty()) {
                                j = -9223372036854775807L;
                            } else {
                                j = m(str2);
                                if (j == -9223372036854775807L) {
                                    sb = new StringBuilder();
                                }
                            }
                            arrayList.add(new c.c.a.a.v1.b(split[this.r].replaceAll("\\{.*?\\}", "").replaceAll("\\\\N", "\n").replaceAll("\\\\n", "\n")));
                            if (i2 == jArr.length) {
                                jArr = Arrays.copyOf(jArr, i2 * 2);
                            }
                            int i3 = i2 + 1;
                            jArr[i2] = m;
                            if (j != -9223372036854775807L) {
                                arrayList.add(c.c.a.a.v1.b.p);
                                if (i3 == jArr.length) {
                                    jArr = Arrays.copyOf(jArr, i3 * 2);
                                }
                                i2 = i3 + 1;
                                jArr[i3] = j;
                            } else {
                                i2 = i3;
                            }
                        }
                        str = "Skipping invalid timing: ";
                    }
                }
                sb.append(str);
                sb.append(e3);
                Log.w("SsaDecoder", sb.toString());
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void l(String str) {
        char c2;
        String[] split = TextUtils.split(str.substring(8), ",");
        this.o = split.length;
        this.p = -1;
        this.q = -1;
        this.r = -1;
        for (int i = 0; i < this.o; i++) {
            String I = l0.I(split[i].trim());
            I.hashCode();
            switch (I.hashCode()) {
                case 100571:
                    if (I.equals("end")) {
                        c2 = 0;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 3556653:
                    if (I.equals("text")) {
                        c2 = 1;
                        break;
                    }
                    c2 = 65535;
                    break;
                case 109757538:
                    if (I.equals("start")) {
                        c2 = 2;
                        break;
                    }
                    c2 = 65535;
                    break;
                default:
                    c2 = 65535;
                    break;
            }
            switch (c2) {
                case 0:
                    this.q = i;
                    break;
                case 1:
                    this.r = i;
                    break;
                case 2:
                    this.p = i;
                    break;
            }
        }
        if (this.p == -1 || this.q == -1 || this.r == -1) {
            this.o = 0;
        }
    }
}
