package c.c.a.a.q1.d0;

import android.util.Log;
import c.c.a.a.s1.m.x;
import c.c.a.a.z1.l0;
import c.c.a.a.z1.z;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2336a = l0.l("nam");

    /* renamed from: b, reason: collision with root package name */
    public static final int f2337b = l0.l("trk");

    /* renamed from: c, reason: collision with root package name */
    public static final int f2338c = l0.l("cmt");

    /* renamed from: d, reason: collision with root package name */
    public static final int f2339d = l0.l("day");

    /* renamed from: e, reason: collision with root package name */
    public static final int f2340e = l0.l("ART");

    /* renamed from: f, reason: collision with root package name */
    public static final int f2341f = l0.l("too");
    public static final int g = l0.l("alb");
    public static final int h = l0.l("com");
    public static final int i = l0.l("wrt");
    public static final int j = l0.l("lyr");
    public static final int k = l0.l("gen");
    public static final int l = l0.l("covr");
    public static final int m = l0.l("gnre");
    public static final int n = l0.l("grp");
    public static final int o = l0.l("disk");
    public static final int p = l0.l("trkn");
    public static final int q = l0.l("tmpo");
    public static final int r = l0.l("cpil");
    public static final int s = l0.l("aART");
    public static final int t = l0.l("sonm");
    public static final int u = l0.l("soal");
    public static final int v = l0.l("soar");
    public static final int w = l0.l("soaa");
    public static final int x = l0.l("soco");
    public static final int y = l0.l("rtng");
    public static final int z = l0.l("pgap");
    public static final int A = l0.l("sosn");
    public static final int B = l0.l("tvsh");
    public static final int C = l0.l("----");
    public static final String[] D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    public static c.c.a.a.s1.m.j a(int i2, z zVar) {
        int d2 = zVar.d();
        if (zVar.d() == c.T0) {
            zVar.B(8);
            String l2 = zVar.l(d2 - 16);
            return new c.c.a.a.s1.m.j("und", l2, l2);
        }
        StringBuilder j2 = c.a.a.a.a.j("Failed to parse comment attribute: ");
        j2.append(c.a(i2));
        Log.w("MetadataUtil", j2.toString());
        return null;
    }

    public static c.c.a.a.s1.m.b b(z zVar) {
        String str;
        int d2 = zVar.d();
        if (zVar.d() == c.T0) {
            int d3 = zVar.d() & 16777215;
            String str2 = d3 == 13 ? "image/jpeg" : d3 == 14 ? "image/png" : null;
            if (str2 != null) {
                zVar.B(4);
                int i2 = d2 - 16;
                byte[] bArr = new byte[i2];
                System.arraycopy(zVar.f3800a, zVar.f3801b, bArr, 0, i2);
                zVar.f3801b += i2;
                return new c.c.a.a.s1.m.b(str2, null, 3, bArr);
            }
            str = c.a.a.a.a.b("Unrecognized cover art flags: ", d3);
        } else {
            str = "Failed to parse cover art attribute";
        }
        Log.w("MetadataUtil", str);
        return null;
    }

    public static x c(int i2, String str, z zVar) {
        int d2 = zVar.d();
        if (zVar.d() == c.T0 && d2 >= 22) {
            zVar.B(10);
            int u2 = zVar.u();
            if (u2 > 0) {
                String b2 = c.a.a.a.a.b("", u2);
                int u3 = zVar.u();
                if (u3 > 0) {
                    b2 = b2 + "/" + u3;
                }
                return new x(str, null, b2);
            }
        }
        StringBuilder j2 = c.a.a.a.a.j("Failed to parse index/count attribute: ");
        j2.append(c.a(i2));
        Log.w("MetadataUtil", j2.toString());
        return null;
    }

    public static c.c.a.a.s1.m.p d(z zVar, int i2) {
        int i3 = -1;
        int i4 = -1;
        String str = null;
        String str2 = null;
        while (true) {
            int i5 = zVar.f3801b;
            if (i5 >= i2) {
                break;
            }
            int d2 = zVar.d();
            int d3 = zVar.d();
            zVar.B(4);
            if (d3 == c.R0) {
                str = zVar.l(d2 - 12);
            } else if (d3 == c.S0) {
                str2 = zVar.l(d2 - 12);
            } else {
                if (d3 == c.T0) {
                    i3 = i5;
                    i4 = d2;
                }
                zVar.B(d2 - 12);
            }
        }
        if (str == null || str2 == null || i3 == -1) {
            return null;
        }
        zVar.A(i3);
        zVar.B(16);
        return new c.c.a.a.s1.m.r(str, str2, zVar.l(i4 - 16));
    }

    public static x e(int i2, String str, z zVar) {
        int d2 = zVar.d();
        if (zVar.d() == c.T0) {
            zVar.B(8);
            return new x(str, null, zVar.l(d2 - 16));
        }
        StringBuilder j2 = c.a.a.a.a.j("Failed to parse text attribute: ");
        j2.append(c.a(i2));
        Log.w("MetadataUtil", j2.toString());
        return null;
    }

    public static c.c.a.a.s1.m.p f(int i2, String str, z zVar, boolean z2, boolean z3) {
        int g2 = g(zVar);
        if (z3) {
            g2 = Math.min(1, g2);
        }
        if (g2 >= 0) {
            return z2 ? new x(str, null, Integer.toString(g2)) : new c.c.a.a.s1.m.j("und", str, Integer.toString(g2));
        }
        StringBuilder j2 = c.a.a.a.a.j("Failed to parse uint8 attribute: ");
        j2.append(c.a(i2));
        Log.w("MetadataUtil", j2.toString());
        return null;
    }

    public static int g(z zVar) {
        zVar.B(4);
        if (zVar.d() == c.T0) {
            zVar.B(8);
            return zVar.p();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }
}
