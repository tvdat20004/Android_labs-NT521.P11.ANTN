package b.s;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;
import b.c.a.b.e;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: b, reason: collision with root package name */
    public Bundle f1719b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1720c;

    /* renamed from: d, reason: collision with root package name */
    public Recreator.a f1721d;

    /* renamed from: a, reason: collision with root package name */
    public e<String, b> f1718a = new e<>();

    /* renamed from: e, reason: collision with root package name */
    public boolean f1722e = true;

    /* renamed from: b.s.a$a, reason: collision with other inner class name */
    public interface InterfaceC0005a {
    }

    public interface b {
    }

    public void a(Class<? extends InterfaceC0005a> cls) {
        if (!this.f1722e) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f1721d == null) {
            this.f1721d = new Recreator.a(this);
        }
        try {
            cls.getDeclaredConstructor(new Class[0]);
            Recreator.a aVar = this.f1721d;
            aVar.f391a.add(cls.getName());
        } catch (NoSuchMethodException e2) {
            StringBuilder j = c.a.a.a.a.j("Class");
            j.append(cls.getSimpleName());
            j.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalArgumentException(j.toString(), e2);
        }
    }
}
