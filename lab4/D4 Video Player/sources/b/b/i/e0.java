package b.b.i;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class e0 extends SeekBar {

    /* renamed from: b, reason: collision with root package name */
    public final f0 f673b;

    public e0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        h2.a(this, getContext());
        f0 f0Var = new f0(this);
        this.f673b = f0Var;
        f0Var.a(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f0 f0Var = this.f673b;
        Drawable drawable = f0Var.f679e;
        if (drawable != null && drawable.isStateful() && drawable.setState(f0Var.f678d.getDrawableState())) {
            f0Var.f678d.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f673b.f679e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f673b.d(canvas);
    }
}
