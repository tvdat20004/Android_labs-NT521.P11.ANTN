package c.c.a.a.m1;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public abstract class c0 implements r {

    /* renamed from: b, reason: collision with root package name */
    public int f2073b;

    /* renamed from: c, reason: collision with root package name */
    public int f2074c;

    /* renamed from: d, reason: collision with root package name */
    public int f2075d;

    /* renamed from: e, reason: collision with root package name */
    public ByteBuffer f2076e;

    /* renamed from: f, reason: collision with root package name */
    public ByteBuffer f2077f;
    public boolean g;

    public c0() {
        ByteBuffer byteBuffer = r.f2133a;
        this.f2076e = byteBuffer;
        this.f2077f = byteBuffer;
        this.f2074c = -1;
        this.f2073b = -1;
        this.f2075d = -1;
    }

    @Override // c.c.a.a.m1.r
    public ByteBuffer a() {
        ByteBuffer byteBuffer = this.f2077f;
        this.f2077f = r.f2133a;
        return byteBuffer;
    }

    @Override // c.c.a.a.m1.r
    public final void b() {
        this.g = true;
        l();
    }

    @Override // c.c.a.a.m1.r
    public boolean d() {
        return this.g && this.f2077f == r.f2133a;
    }

    @Override // c.c.a.a.m1.r
    public int f() {
        return this.f2073b;
    }

    @Override // c.c.a.a.m1.r
    public final void flush() {
        this.f2077f = r.f2133a;
        this.g = false;
        k();
    }

    @Override // c.c.a.a.m1.r
    public int g() {
        return this.f2075d;
    }

    @Override // c.c.a.a.m1.r
    public int i() {
        return this.f2074c;
    }

    @Override // c.c.a.a.m1.r
    public final void j() {
        flush();
        this.f2076e = r.f2133a;
        this.f2073b = -1;
        this.f2074c = -1;
        this.f2075d = -1;
        m();
    }

    public void k() {
    }

    public void l() {
    }

    public void m() {
    }

    public final ByteBuffer n(int i) {
        if (this.f2076e.capacity() < i) {
            this.f2076e = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f2076e.clear();
        }
        ByteBuffer byteBuffer = this.f2076e;
        this.f2077f = byteBuffer;
        return byteBuffer;
    }

    public final boolean o(int i, int i2, int i3) {
        if (i == this.f2073b && i2 == this.f2074c && i3 == this.f2075d) {
            return false;
        }
        this.f2073b = i;
        this.f2074c = i2;
        this.f2075d = i3;
        return true;
    }
}
