package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import b.h.j.u;
import b.h.j.y;
import c.c.a.b.u.i;
import c.c.a.b.x.a.a;
import java.util.WeakHashMap;
import razi.apa.ctf.videoPlayer.R;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {
    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, R.attr.toolbarStyle);
        Context context2 = getContext();
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            i iVar = new i();
            iVar.p(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            iVar.f4024b.f4019b = new c.c.a.b.n.a(context2);
            iVar.w();
            WeakHashMap<View, y> weakHashMap = u.f1311a;
            iVar.o(getElevation());
            setBackground(iVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof i) {
            c.c.a.b.a.o(this, (i) background);
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        c.c.a.b.a.n(this, f2);
    }
}
