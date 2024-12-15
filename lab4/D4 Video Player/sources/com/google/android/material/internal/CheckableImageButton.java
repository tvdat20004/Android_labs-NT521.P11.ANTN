package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.ImageButton;
import b.b.i.w;
import b.h.j.u;
import b.j.a.c;
import c.c.a.b.p.b;

/* loaded from: classes.dex */
public class CheckableImageButton extends w implements Checkable {
    public static final int[] g = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public boolean f4235d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f4236e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f4237f;

    public static class a extends c {
        public static final Parcelable.Creator<a> CREATOR = new b();

        /* renamed from: d, reason: collision with root package name */
        public boolean f4238d;

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f4238d = parcel.readInt() == 1;
        }

        public a(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // b.j.a.c, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f1349b, i);
            parcel.writeInt(this.f4238d ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, razi.apa.ctf.videoPlayer.R.attr.imageButtonStyle);
        this.f4236e = true;
        this.f4237f = true;
        u.i(this, new c.c.a.b.p.a(this));
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f4235d;
    }

    @Override // android.widget.ImageView, android.view.View
    public int[] onCreateDrawableState(int i) {
        if (!this.f4235d) {
            return super.onCreateDrawableState(i);
        }
        int[] iArr = g;
        return ImageButton.mergeDrawableStates(super.onCreateDrawableState(i + iArr.length), iArr);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.f1349b);
        setChecked(aVar.f4238d);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.f4238d = this.f4235d;
        return aVar;
    }

    public void setCheckable(boolean z) {
        if (this.f4236e != z) {
            this.f4236e = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.f4236e || this.f4235d == z) {
            return;
        }
        this.f4235d = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.f4237f = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.f4237f) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f4235d);
    }
}
