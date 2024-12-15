package c.c.a.a.o1;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class g extends a {

    /* renamed from: c, reason: collision with root package name */
    public final d f2179c = new d();

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f2180d;

    /* renamed from: e, reason: collision with root package name */
    public long f2181e;

    /* renamed from: f, reason: collision with root package name */
    public final int f2182f;

    public g(int i) {
        this.f2182f = i;
    }

    public void i() {
        this.f2165b = 0;
        ByteBuffer byteBuffer = this.f2180d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public final ByteBuffer j(int i) {
        int i2 = this.f2182f;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f2180d;
        throw new IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }

    public void k(int i) {
        ByteBuffer byteBuffer = this.f2180d;
        if (byteBuffer == null) {
            this.f2180d = j(i);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = this.f2180d.position();
        int i2 = i + position;
        if (capacity >= i2) {
            return;
        }
        ByteBuffer j = j(i2);
        if (position > 0) {
            this.f2180d.position(0);
            this.f2180d.limit(position);
            j.put(this.f2180d);
        }
        this.f2180d = j;
    }
}
