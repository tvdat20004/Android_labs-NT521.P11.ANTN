package b.f.c;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class d extends View {

    /* renamed from: b, reason: collision with root package name */
    public int[] f1046b;

    /* renamed from: c, reason: collision with root package name */
    public int f1047c;

    /* renamed from: d, reason: collision with root package name */
    public Context f1048d;

    /* renamed from: e, reason: collision with root package name */
    public b.f.b.l.g f1049e;

    /* renamed from: f, reason: collision with root package name */
    public String f1050f;
    public HashMap<Integer, String> g;

    public d(Context context) {
        super(context);
        this.f1046b = new int[32];
        this.g = new HashMap<>();
        this.f1048d = context;
        a aVar = (a) this;
        b.f.b.l.a aVar2 = new b.f.b.l.a();
        aVar.j = aVar2;
        aVar.f1049e = aVar2;
        aVar.d();
    }

    public final void a(String str) {
        if (str == null || str.length() == 0 || this.f1048d == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object c2 = constraintLayout.c(0, trim);
            if (c2 instanceof Integer) {
                i = ((Integer) c2).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = c(constraintLayout, trim);
        }
        if (i == 0) {
            try {
                i = q.class.getField(trim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i == 0) {
            i = this.f1048d.getResources().getIdentifier(trim, "id", this.f1048d.getPackageName());
        }
        if (i != 0) {
            this.g.put(Integer.valueOf(i), trim);
            b(i);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    public final void b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f1047c + 1;
        int[] iArr = this.f1046b;
        if (i2 > iArr.length) {
            this.f1046b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1046b;
        int i3 = this.f1047c;
        iArr2[i3] = i;
        this.f1047c = i3 + 1;
    }

    public final int c(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f1048d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    public void d() {
        if (this.f1049e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).k0 = (b.f.b.l.d) this.f1049e;
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1046b, this.f1047c);
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1050f;
        if (str != null) {
            setIds(str);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f1050f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f1047c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1050f = null;
        this.f1047c = 0;
        for (int i : iArr) {
            b(i);
        }
    }
}
