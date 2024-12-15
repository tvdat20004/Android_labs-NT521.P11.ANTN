package c.c.a.a.y1.a1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class q implements s {

    /* renamed from: e, reason: collision with root package name */
    public static final String[] f3585e = {"id", "key", "metadata"};

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.n1.b f3586a;

    /* renamed from: b, reason: collision with root package name */
    public final SparseArray<p> f3587b = new SparseArray<>();

    /* renamed from: c, reason: collision with root package name */
    public String f3588c;

    /* renamed from: d, reason: collision with root package name */
    public String f3589d;

    public q(c.c.a.a.n1.b bVar) {
        this.f3586a = bVar;
    }

    @Override // c.c.a.a.y1.a1.s
    public void a(p pVar, boolean z) {
        if (z) {
            this.f3587b.delete(pVar.f3580a);
        } else {
            this.f3587b.put(pVar.f3580a, null);
        }
    }

    @Override // c.c.a.a.y1.a1.s
    public void b(HashMap<String, p> hashMap, SparseArray<String> sparseArray) {
        c.c.a.a.x1.p.g(this.f3587b.size() == 0);
        try {
            if (b.q.u.h(this.f3586a.getReadableDatabase(), 1, this.f3588c) != 1) {
                SQLiteDatabase writableDatabase = this.f3586a.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    j(writableDatabase);
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            Cursor query = this.f3586a.getReadableDatabase().query(this.f3589d, f3585e, null, null, null, null, null);
            while (query.moveToNext()) {
                try {
                    int i = query.getInt(0);
                    String string = query.getString(1);
                    p pVar = new p(i, string, t.a(new DataInputStream(new ByteArrayInputStream(query.getBlob(2)))));
                    hashMap.put(string, pVar);
                    sparseArray.put(pVar.f3580a, pVar.f3581b);
                } finally {
                }
            }
            query.close();
        } catch (SQLiteException e2) {
            hashMap.clear();
            sparseArray.clear();
            throw new c.c.a.a.n1.a(e2);
        }
    }

    @Override // c.c.a.a.y1.a1.s
    public boolean c() {
        return b.q.u.h(this.f3586a.getReadableDatabase(), 1, this.f3588c) != -1;
    }

    @Override // c.c.a.a.y1.a1.s
    public void d(HashMap<String, p> hashMap) {
        if (this.f3587b.size() == 0) {
            return;
        }
        try {
            SQLiteDatabase writableDatabase = this.f3586a.getWritableDatabase();
            writableDatabase.beginTransaction();
            for (int i = 0; i < this.f3587b.size(); i++) {
                try {
                    p valueAt = this.f3587b.valueAt(i);
                    if (valueAt == null) {
                        writableDatabase.delete(this.f3589d, "id = ?", new String[]{Integer.toString(this.f3587b.keyAt(i))});
                    } else {
                        i(writableDatabase, valueAt);
                    }
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
            writableDatabase.setTransactionSuccessful();
            this.f3587b.clear();
            writableDatabase.endTransaction();
        } catch (SQLException e2) {
            throw new c.c.a.a.n1.a(e2);
        }
    }

    @Override // c.c.a.a.y1.a1.s
    public void e(HashMap<String, p> hashMap) {
        try {
            SQLiteDatabase writableDatabase = this.f3586a.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                j(writableDatabase);
                Iterator<p> it = hashMap.values().iterator();
                while (it.hasNext()) {
                    i(writableDatabase, it.next());
                }
                writableDatabase.setTransactionSuccessful();
                this.f3587b.clear();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new c.c.a.a.n1.a(e2);
        }
    }

    @Override // c.c.a.a.y1.a1.s
    public void f(long j) {
        String hexString = Long.toHexString(j);
        this.f3588c = hexString;
        this.f3589d = c.a.a.a.a.g("ExoPlayerCacheIndex", hexString);
    }

    @Override // c.c.a.a.y1.a1.s
    public void g() {
        c.c.a.a.n1.b bVar = this.f3586a;
        String str = this.f3588c;
        try {
            String str2 = "ExoPlayerCacheIndex" + str;
            SQLiteDatabase writableDatabase = bVar.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    if (b.q.u.s(writableDatabase, "ExoPlayerVersions")) {
                        writableDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", new String[]{Integer.toString(1), str});
                    }
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + str2);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e2) {
                throw new c.c.a.a.n1.a(e2);
            }
        } catch (SQLException e3) {
            throw new c.c.a.a.n1.a(e3);
        }
    }

    @Override // c.c.a.a.y1.a1.s
    public void h(p pVar) {
        this.f3587b.put(pVar.f3580a, pVar);
    }

    public final void i(SQLiteDatabase sQLiteDatabase, p pVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        t.b(pVar.f3583d, new DataOutputStream(byteArrayOutputStream));
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", Integer.valueOf(pVar.f3580a));
        contentValues.put("key", pVar.f3581b);
        contentValues.put("metadata", byteArray);
        sQLiteDatabase.replaceOrThrow(this.f3589d, null, contentValues);
    }

    public final void j(SQLiteDatabase sQLiteDatabase) {
        b.q.u.q(sQLiteDatabase, 1, this.f3588c, 1);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + this.f3589d);
        sQLiteDatabase.execSQL("CREATE TABLE " + this.f3589d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
    }
}
