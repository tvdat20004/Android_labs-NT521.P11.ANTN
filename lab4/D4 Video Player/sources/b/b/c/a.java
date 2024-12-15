package b.b.c;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: b.b.c.a$a, reason: collision with other inner class name */
    public static class C0000a extends ViewGroup.MarginLayoutParams {

        /* renamed from: a, reason: collision with root package name */
        public int f410a;

        public C0000a(int i, int i2) {
            super(i, i2);
            this.f410a = 0;
            this.f410a = 8388627;
        }

        public C0000a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f410a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.b.b.f405b);
            this.f410a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public C0000a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f410a = 0;
        }

        public C0000a(C0000a c0000a) {
            super((ViewGroup.MarginLayoutParams) c0000a);
            this.f410a = 0;
            this.f410a = c0000a.f410a;
        }
    }

    public abstract void a(boolean z);

    public abstract Context b();

    public abstract void c(boolean z);

    public abstract void d(CharSequence charSequence);
}
