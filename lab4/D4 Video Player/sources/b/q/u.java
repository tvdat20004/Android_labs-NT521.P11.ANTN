package b.q;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Path;
import android.graphics.PointF;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Property;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import b.r.b.e0;
import c.c.a.a.s0;
import c.c.a.a.z1.z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public abstract class u {
    public static byte[] a(UUID uuid, byte[] bArr) {
        return b(uuid, null, bArr);
    }

    public static byte[] b(UUID uuid, UUID[] uuidArr, byte[] bArr) {
        int length = (bArr != null ? bArr.length : 0) + 32;
        if (uuidArr != null) {
            length += (uuidArr.length * 16) + 4;
        }
        ByteBuffer allocate = ByteBuffer.allocate(length);
        allocate.putInt(length);
        allocate.putInt(c.c.a.a.q1.d0.c.i0);
        allocate.putInt(uuidArr != null ? 16777216 : 0);
        allocate.putLong(uuid.getMostSignificantBits());
        allocate.putLong(uuid.getLeastSignificantBits());
        if (uuidArr != null) {
            allocate.putInt(uuidArr.length);
            for (UUID uuid2 : uuidArr) {
                allocate.putLong(uuid2.getMostSignificantBits());
                allocate.putLong(uuid2.getLeastSignificantBits());
            }
        }
        if (bArr != null && bArr.length != 0) {
            allocate.putInt(bArr.length);
            allocate.put(bArr);
        }
        return allocate.array();
    }

    public static int c(RecyclerView.x xVar, e0 e0Var, View view, View view2, RecyclerView.m mVar, boolean z) {
        if (mVar.y() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return Math.abs(mVar.Q(view) - mVar.Q(view2)) + 1;
        }
        return Math.min(e0Var.l(), e0Var.b(view2) - e0Var.e(view));
    }

    public static int d(RecyclerView.x xVar, e0 e0Var, View view, View view2, RecyclerView.m mVar, boolean z, boolean z2) {
        if (mVar.y() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z2 ? Math.max(0, (xVar.b() - Math.max(mVar.Q(view), mVar.Q(view2))) - 1) : Math.max(0, Math.min(mVar.Q(view), mVar.Q(view2)));
        if (z) {
            return Math.round((max * (Math.abs(e0Var.b(view2) - e0Var.e(view)) / (Math.abs(mVar.Q(view) - mVar.Q(view2)) + 1))) + (e0Var.k() - e0Var.e(view)));
        }
        return max;
    }

    public static int e(RecyclerView.x xVar, e0 e0Var, View view, View view2, RecyclerView.m mVar, boolean z) {
        if (mVar.y() == 0 || xVar.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z) {
            return xVar.b();
        }
        return (int) (((e0Var.b(view2) - e0Var.e(view)) / (Math.abs(mVar.Q(view) - mVar.Q(view2)) + 1)) * xVar.b());
    }

    public static int f(float[] fArr) {
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        asFloatBuffer.put(fArr).position(0);
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        GLES20.glBindBuffer(34962, iArr[0]);
        GLES20.glBufferData(34962, asFloatBuffer.capacity() * 4, asFloatBuffer, 35044);
        GLES20.glBindBuffer(34962, 0);
        return iArr[0];
    }

    public static int g(int i, int i2) {
        int glCreateProgram = GLES20.glCreateProgram();
        if (glCreateProgram == 0) {
            throw new RuntimeException("Could not create program");
        }
        GLES20.glAttachShader(glCreateProgram, i);
        GLES20.glAttachShader(glCreateProgram, i2);
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return glCreateProgram;
        }
        GLES20.glDeleteProgram(glCreateProgram);
        throw new RuntimeException("Could not link program");
    }

    public static int h(SQLiteDatabase sQLiteDatabase, int i, String str) {
        try {
            if (!s(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            Cursor query = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", new String[]{Integer.toString(i), str}, null, null, null);
            try {
                if (query.getCount() == 0) {
                    query.close();
                    return -1;
                }
                query.moveToNext();
                int i2 = query.getInt(0);
                query.close();
                return i2;
            } finally {
            }
        } catch (SQLException e2) {
            throw new c.c.a.a.n1.a(e2);
        }
    }

    public static int i(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static int j(String str, int i) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder j = c.a.a.a.a.j("Compilation\n");
        j.append(GLES20.glGetShaderInfoLog(glCreateShader));
        Log.d("Load Shader Failed", j.toString());
        return 0;
    }

    public static void k(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static <T> ObjectAnimator l(T t, Property<T, PointF> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.UUID m(byte[] r9) {
        /*
            c.c.a.a.z1.z r0 = new c.c.a.a.z1.z
            r0.<init>(r9)
            int r9 = r0.f3802c
            r1 = 32
            r2 = 0
            if (r9 >= r1) goto Ld
            goto L5c
        Ld:
            r9 = 0
            r0.A(r9)
            int r1 = r0.d()
            int r3 = r0.a()
            int r3 = r3 + 4
            if (r1 == r3) goto L1e
            goto L5c
        L1e:
            int r1 = r0.d()
            int r3 = c.c.a.a.q1.d0.c.i0
            if (r1 == r3) goto L27
            goto L5c
        L27:
            int r1 = r0.d()
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 1
            if (r1 <= r3) goto L3a
            java.lang.String r9 = "Unsupported pssh version: "
            java.lang.String r0 = "PsshAtomUtil"
            c.a.a.a.a.m(r9, r1, r0)
            goto L5c
        L3a:
            java.util.UUID r4 = new java.util.UUID
            long r5 = r0.j()
            long r7 = r0.j()
            r4.<init>(r5, r7)
            if (r1 != r3) goto L52
            int r3 = r0.s()
            int r3 = r3 * 16
            r0.B(r3)
        L52:
            int r3 = r0.s()
            int r5 = r0.a()
            if (r3 == r5) goto L5e
        L5c:
            r9 = r2
            goto L71
        L5e:
            byte[] r5 = new byte[r3]
            byte[] r6 = r0.f3800a
            int r7 = r0.f3801b
            java.lang.System.arraycopy(r6, r7, r5, r9, r3)
            int r9 = r0.f3801b
            int r9 = r9 + r3
            r0.f3801b = r9
            c.c.a.a.q1.d0.q r9 = new c.c.a.a.q1.d0.q
            r9.<init>(r4, r1, r5)
        L71:
            if (r9 != 0) goto L74
            return r2
        L74:
            java.util.UUID r9 = r9.f2352a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.u.m(byte[]):java.util.UUID");
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static c.c.a.a.q1.h0.b n(c.c.a.a.q1.j r17) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b.q.u.n(c.c.a.a.q1.j):c.c.a.a.q1.h0.b");
    }

    public static long o(z zVar, int i, int i2) {
        zVar.A(i);
        if (zVar.a() < 5) {
            return -9223372036854775807L;
        }
        int d2 = zVar.d();
        if ((8388608 & d2) != 0 || ((2096896 & d2) >> 8) != i2) {
            return -9223372036854775807L;
        }
        if (((d2 & 32) != 0) && zVar.p() >= 7 && zVar.a() >= 7) {
            if ((zVar.p() & 16) == 16) {
                System.arraycopy(zVar.f3800a, zVar.f3801b, new byte[6], 0, 6);
                zVar.f3801b += 6;
                return ((r0[0] & 255) << 25) | ((r0[1] & 255) << 17) | ((r0[2] & 255) << 9) | ((r0[3] & 255) << 1) | ((r0[4] & 255) >> 7);
            }
        }
        return -9223372036854775807L;
    }

    public static void p(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < list.size(); i++) {
            mediaFormat.setByteBuffer(c.a.a.a.a.b("csd-", i), ByteBuffer.wrap(list.get(i)));
        }
    }

    public static void q(SQLiteDatabase sQLiteDatabase, int i, String str, int i2) {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i2));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e2) {
            throw new c.c.a.a.n1.a(e2);
        }
    }

    public static void r(int i, int i2, int i3) {
        GLES20.glTexParameterf(i, 10240, i2);
        GLES20.glTexParameterf(i, 10241, i3);
        GLES20.glTexParameteri(i, 10242, 33071);
        GLES20.glTexParameteri(i, 10243, 33071);
    }

    public static boolean s(SQLiteDatabase sQLiteDatabase, String str) {
        return DatabaseUtils.queryNumEntries(sQLiteDatabase, "sqlite_master", "tbl_name = ?", new String[]{str}) > 0;
    }

    public static boolean t(int i, z zVar, boolean z) {
        if (zVar.a() < 7) {
            if (z) {
                return false;
            }
            StringBuilder j = c.a.a.a.a.j("too short header: ");
            j.append(zVar.a());
            throw new s0(j.toString());
        }
        if (zVar.p() != i) {
            if (z) {
                return false;
            }
            StringBuilder j2 = c.a.a.a.a.j("expected header type ");
            j2.append(Integer.toHexString(i));
            throw new s0(j2.toString());
        }
        if (zVar.p() == 118 && zVar.p() == 111 && zVar.p() == 114 && zVar.p() == 98 && zVar.p() == 105 && zVar.p() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw new s0("expected characters 'vorbis'");
    }
}
