package b.b.c;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class i0 implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final View f445b;

    /* renamed from: c, reason: collision with root package name */
    public final String f446c;

    /* renamed from: d, reason: collision with root package name */
    public Method f447d;

    /* renamed from: e, reason: collision with root package name */
    public Context f448e;

    public i0(View view, String str) {
        this.f445b = view;
        this.f446c = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String sb;
        Method method;
        if (this.f447d == null) {
            Context context = this.f445b.getContext();
            while (context != null) {
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(this.f446c, View.class)) != null) {
                        this.f447d = method;
                        this.f448e = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
            int id = this.f445b.getId();
            if (id == -1) {
                sb = "";
            } else {
                StringBuilder j = c.a.a.a.a.j(" with id '");
                j.append(this.f445b.getContext().getResources().getResourceEntryName(id));
                j.append("'");
                sb = j.toString();
            }
            StringBuilder j2 = c.a.a.a.a.j("Could not find method ");
            j2.append(this.f446c);
            j2.append("(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
            j2.append(this.f445b.getClass());
            j2.append(sb);
            throw new IllegalStateException(j2.toString());
        }
        try {
            this.f447d.invoke(this.f448e, view);
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e2);
        } catch (InvocationTargetException e3) {
            throw new IllegalStateException("Could not execute method for android:onClick", e3);
        }
    }
}
