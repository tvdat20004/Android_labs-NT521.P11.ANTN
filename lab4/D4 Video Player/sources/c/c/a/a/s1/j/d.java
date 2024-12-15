package c.c.a.a.s1.j;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final ByteArrayOutputStream f2726a;

    /* renamed from: b, reason: collision with root package name */
    public final DataOutputStream f2727b;

    public d() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.f2726a = byteArrayOutputStream;
        this.f2727b = new DataOutputStream(byteArrayOutputStream);
    }

    public static void a(DataOutputStream dataOutputStream, long j) {
        dataOutputStream.writeByte(((int) (j >>> 24)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 16)) & 255);
        dataOutputStream.writeByte(((int) (j >>> 8)) & 255);
        dataOutputStream.writeByte(((int) j) & 255);
    }
}
