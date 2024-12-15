package c.c.a.b.w;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;

/* loaded from: classes.dex */
public class l extends c.c.a.b.u.i {
    public final RectF A;
    public int B;
    public final Paint z;

    public l(c.c.a.b.u.m mVar) {
        super(mVar == null ? new c.c.a.b.u.m() : mVar);
        Paint paint = new Paint(1);
        this.z = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.A = new RectF();
    }

    @Override // c.c.a.b.u.i, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (callback instanceof View) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, null);
            }
        } else {
            this.B = canvas.saveLayer(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), null);
        }
        super.draw(canvas);
        canvas.drawRect(this.A, this.z);
        if (getCallback() instanceof View) {
            return;
        }
        canvas.restoreToCount(this.B);
    }

    public void x(float f2, float f3, float f4, float f5) {
        RectF rectF = this.A;
        if (f2 == rectF.left && f3 == rectF.top && f4 == rectF.right && f5 == rectF.bottom) {
            return;
        }
        rectF.set(f2, f3, f4, f5);
        invalidateSelf();
    }
}
