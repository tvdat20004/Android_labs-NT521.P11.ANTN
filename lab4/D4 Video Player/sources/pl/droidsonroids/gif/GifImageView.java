package pl.droidsonroids.gif;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import e.a.a.j;
import e.a.a.k;
import java.util.List;

/* loaded from: classes.dex */
public class GifImageView extends ImageView {

    /* renamed from: b, reason: collision with root package name */
    public boolean f4368b;

    public GifImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        k.a aVar;
        List<String> list = k.f4311a;
        if (attributeSet == null || isInEditMode()) {
            aVar = new k.a();
        } else {
            aVar = new k.a(this, attributeSet, 0, 0);
            int i = aVar.f4315b;
            if (i >= 0) {
                k.a(i, getDrawable());
                k.a(i, getBackground());
            }
        }
        this.f4368b = aVar.f4314a;
        int i2 = aVar.f4312c;
        if (i2 > 0) {
            super.setImageResource(i2);
        }
        int i3 = aVar.f4313d;
        if (i3 > 0) {
            super.setBackgroundResource(i3);
        }
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof j)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        j jVar = (j) parcelable;
        super.onRestoreInstanceState(jVar.getSuperState());
        jVar.i(getDrawable(), 0);
        jVar.i(getBackground(), 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        return new j(super.onSaveInstanceState(), this.f4368b ? getDrawable() : null, this.f4368b ? getBackground() : null);
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        if (k.b(this, false, i)) {
            return;
        }
        super.setBackgroundResource(i);
    }

    public void setFreezesAnimation(boolean z) {
        this.f4368b = z;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        if (k.b(this, true, i)) {
            return;
        }
        super.setImageResource(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:8:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.ImageView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setImageURI(android.net.Uri r3) {
        /*
            r2 = this;
            java.util.List<java.lang.String> r0 = e.a.a.k.f4311a
            if (r3 == 0) goto L16
            e.a.a.d r0 = new e.a.a.d     // Catch: java.io.IOException -> L16
            android.content.Context r1 = r2.getContext()     // Catch: java.io.IOException -> L16
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.io.IOException -> L16
            r0.<init>(r1, r3)     // Catch: java.io.IOException -> L16
            r2.setImageDrawable(r0)     // Catch: java.io.IOException -> L16
            r0 = 1
            goto L17
        L16:
            r0 = 0
        L17:
            if (r0 != 0) goto L1c
            super.setImageURI(r3)
        L1c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.droidsonroids.gif.GifImageView.setImageURI(android.net.Uri):void");
    }
}
