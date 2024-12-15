package b.b.i;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class d0 extends RatingBar {

    /* renamed from: b, reason: collision with root package name */
    public final b0 f667b;

    public d0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        h2.a(this, getContext());
        b0 b0Var = new b0(this);
        this.f667b = b0Var;
        b0Var.a(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = this.f667b.f650b;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
