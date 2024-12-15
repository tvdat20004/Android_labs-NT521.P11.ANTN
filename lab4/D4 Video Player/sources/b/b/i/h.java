package b.b.i;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.ActionMenuView;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class h extends y implements ActionMenuView.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m f692d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(m mVar, Context context) {
        super(context, null, R.attr.actionOverflowButtonStyle);
        this.f692d = mVar;
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
        b.b.a.c(this, getContentDescription());
        setOnTouchListener(new g(this, this, mVar));
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return false;
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return false;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (super.performClick()) {
            return true;
        }
        playSoundEffect(0);
        this.f692d.q();
        return true;
    }

    @Override // android.widget.ImageView
    public boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        Drawable background = getBackground();
        if (drawable != null && background != null) {
            int width = getWidth();
            int height = getHeight();
            int max = Math.max(width, height) / 2;
            int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
            int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
            background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
        }
        return frame;
    }
}
