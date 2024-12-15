package c.c.a.a.y1.a1;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f3571c = {"name", "length", "last_touch_timestamp"};

    /* renamed from: a, reason: collision with root package name */
    public final c.c.a.a.n1.b f3572a;

    /* renamed from: b, reason: collision with root package name */
    public String f3573b;

    public l(c.c.a.a.n1.b bVar) {
        this.f3572a = bVar;
    }

    public Map<String, k> a() {
        try {
            Objects.requireNonNull(this.f3573b);
            Cursor query = this.f3572a.getReadableDatabase().query(this.f3573b, f3571c, null, null, null, null, null);
            try {
                HashMap hashMap = new HashMap(query.getCount());
                while (query.moveToNext()) {
                    hashMap.put(query.getString(0), new k(query.getLong(1), query.getLong(2)));
                }
                query.close();
                return hashMap;
            } finally {
            }
        } catch (SQLException e2) {
            throw new c.c.a.a.n1.a(e2);
        }
    }

    public void b(long j) {
        try {
            String hexString = Long.toHexString(j);
            this.f3573b = "ExoPlayerCacheFileMetadata" + hexString;
            if (b.q.u.h(this.f3572a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f3572a.getWritableDatabase();
                writableDatabase.beginTransaction();
                try {
                    b.q.u.q(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f3573b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f3573b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (SQLException e2) {
            throw new c.c.a.a.n1.a(e2);
        }
    }

    public void c(Set<String> set) {
        Objects.requireNonNull(this.f3573b);
        try {
            SQLiteDatabase writableDatabase = this.f3572a.getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f3573b, "0 = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new c.c.a.a.n1.a(e2);
        }
    }

    public void d(String str, long j, long j2) {
        Objects.requireNonNull(this.f3573b);
        try {
            SQLiteDatabase writableDatabase = this.f3572a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f3573b, null, contentValues);
        } catch (SQLException e2) {
            throw new c.c.a.a.n1.a(e2);
        }
    }
}
