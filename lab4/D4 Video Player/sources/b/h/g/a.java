package b.h.g;

import android.util.Base64;
import java.util.List;
import java.util.Objects;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f1182a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1183b;

    /* renamed from: c, reason: collision with root package name */
    public final String f1184c;

    /* renamed from: d, reason: collision with root package name */
    public final List<List<byte[]>> f1185d;

    /* renamed from: e, reason: collision with root package name */
    public final String f1186e;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f1182a = str;
        this.f1183b = str2;
        this.f1184c = str3;
        Objects.requireNonNull(list);
        this.f1185d = list;
        this.f1186e = str + "-" + str2 + "-" + str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        StringBuilder j = c.a.a.a.a.j("FontRequest {mProviderAuthority: ");
        j.append(this.f1182a);
        j.append(", mProviderPackage: ");
        j.append(this.f1183b);
        j.append(", mQuery: ");
        j.append(this.f1184c);
        j.append(", mCertificates:");
        sb.append(j.toString());
        for (int i = 0; i < this.f1185d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f1185d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: 0");
        return sb.toString();
    }
}
