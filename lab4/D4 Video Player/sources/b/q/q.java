package b.q;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.preference.PreferenceScreen;

/* loaded from: classes.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public Context f1576a;

    /* renamed from: b, reason: collision with root package name */
    public long f1577b = 0;

    /* renamed from: c, reason: collision with root package name */
    public SharedPreferences f1578c = null;

    /* renamed from: d, reason: collision with root package name */
    public SharedPreferences.Editor f1579d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1580e;

    /* renamed from: f, reason: collision with root package name */
    public String f1581f;
    public PreferenceScreen g;
    public c h;
    public a i;
    public b j;

    public interface a {
    }

    public interface b {
    }

    public interface c {
    }

    public q(Context context) {
        this.f1576a = context;
        this.f1581f = context.getPackageName() + "_preferences";
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 0);
    }

    public SharedPreferences.Editor b() {
        if (!this.f1580e) {
            return c().edit();
        }
        if (this.f1579d == null) {
            this.f1579d = c().edit();
        }
        return this.f1579d;
    }

    public SharedPreferences c() {
        if (this.f1578c == null) {
            this.f1578c = this.f1576a.getSharedPreferences(this.f1581f, 0);
        }
        return this.f1578c;
    }
}
