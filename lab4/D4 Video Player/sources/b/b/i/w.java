package b.b.i;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* loaded from: classes.dex */
public class w extends ImageButton {

    /* renamed from: b, reason: collision with root package name */
    public final o f832b;

    /* renamed from: c, reason: collision with root package name */
    public final x f833c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i2.a(context);
        h2.a(this, getContext());
        o oVar = new o(this);
        this.f832b = oVar;
        oVar.d(attributeSet, i);
        x xVar = new x(this);
        this.f833c = xVar;
        xVar.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        o oVar = this.f832b;
        if (oVar != null) {
            oVar.a();
        }
        x xVar = this.f833c;
        if (xVar != null) {
            xVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        o oVar = this.f832b;
        if (oVar != null) {
            return oVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o oVar = this.f832b;
        if (oVar != null) {
            return oVar.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        j2 j2Var;
        x xVar = this.f833c;
        if (xVar == null || (j2Var = xVar.f835b) == null) {
            return null;
        }
        return j2Var.f710a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        j2 j2Var;
        x xVar = this.f833c;
        if (xVar == null || (j2Var = xVar.f835b) == null) {
            return null;
        }
        return j2Var.f711b;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return ((this.f833c.f834a.getBackground() instanceof RippleDrawable) ^ true) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o oVar = this.f832b;
        if (oVar != null) {
            oVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o oVar = this.f832b;
        if (oVar != null) {
            oVar.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        x xVar = this.f833c;
        if (xVar != null) {
            xVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        x xVar = this.f833c;
        if (xVar != null) {
            xVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.f833c.c(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        x xVar = this.f833c;
        if (xVar != null) {
            xVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o oVar = this.f832b;
        if (oVar != null) {
            oVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o oVar = this.f832b;
        if (oVar != null) {
            oVar.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        x xVar = this.f833c;
        if (xVar != null) {
            xVar.d(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        x xVar = this.f833c;
        if (xVar != null) {
            xVar.e(mode);
        }
    }
}
