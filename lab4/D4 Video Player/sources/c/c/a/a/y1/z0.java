package c.c.a.a.y1;

import android.net.Uri;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketException;

/* loaded from: classes.dex */
public final class z0 extends i {

    /* renamed from: e, reason: collision with root package name */
    public final int f3707e;

    /* renamed from: f, reason: collision with root package name */
    public final byte[] f3708f;
    public final DatagramPacket g;
    public Uri h;
    public DatagramSocket i;
    public MulticastSocket j;
    public InetAddress k;
    public InetSocketAddress l;
    public boolean m;
    public int n;

    public z0() {
        super(true);
        this.f3707e = 8000;
        byte[] bArr = new byte[2000];
        this.f3708f = bArr;
        this.g = new DatagramPacket(bArr, 0, 2000);
    }

    @Override // c.c.a.a.y1.n
    public long a(q qVar) {
        DatagramSocket datagramSocket;
        Uri uri = qVar.f3651a;
        this.h = uri;
        String host = uri.getHost();
        int port = this.h.getPort();
        h(qVar);
        try {
            this.k = InetAddress.getByName(host);
            this.l = new InetSocketAddress(this.k, port);
            if (this.k.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(this.l);
                this.j = multicastSocket;
                multicastSocket.joinGroup(this.k);
                datagramSocket = this.j;
            } else {
                datagramSocket = new DatagramSocket(this.l);
            }
            this.i = datagramSocket;
            try {
                this.i.setSoTimeout(this.f3707e);
                this.m = true;
                i(qVar);
                return -1L;
            } catch (SocketException e2) {
                throw new y0(e2);
            }
        } catch (IOException e3) {
            throw new y0(e3);
        }
    }

    @Override // c.c.a.a.y1.n
    public Uri c() {
        return this.h;
    }

    @Override // c.c.a.a.y1.n
    public void close() {
        this.h = null;
        MulticastSocket multicastSocket = this.j;
        if (multicastSocket != null) {
            try {
                multicastSocket.leaveGroup(this.k);
            } catch (IOException unused) {
            }
            this.j = null;
        }
        DatagramSocket datagramSocket = this.i;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.i = null;
        }
        this.k = null;
        this.l = null;
        this.n = 0;
        if (this.m) {
            this.m = false;
            g();
        }
    }

    @Override // c.c.a.a.y1.n
    public int e(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (this.n == 0) {
            try {
                this.i.receive(this.g);
                int length = this.g.getLength();
                this.n = length;
                f(length);
            } catch (IOException e2) {
                throw new y0(e2);
            }
        }
        int length2 = this.g.getLength();
        int i3 = this.n;
        int min = Math.min(i3, i2);
        System.arraycopy(this.f3708f, length2 - i3, bArr, i, min);
        this.n -= min;
        return min;
    }
}
